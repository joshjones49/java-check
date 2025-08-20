import React, { useState, useEffect, useMemo } from "react";
import toast, { Toaster } from "react-hot-toast";

export const CardContext = React.createContext();

const CardContextProvider = ({ children }) => {

    const CATEGORIES = {
        NONE: 'None',
        OOP: 'OOP',
        SPRING_BOOT: 'Spring-Boot',
        MAVEN: 'Maven'
    }

    let url = 'http://localhost:8080'

    //STATE
    const [cardList, setCardList] = useState([]);
    const [selectedCategory, setSelectedCategory] = useState(CATEGORIES.NONE);
    const [isLoading, setIsLoading] = useState(false)

    //fetch all cards
    const getAllCards = async () => {
        setIsLoading(true)
        try {
            const res = await fetch(`${url}/cards`)
            if(!res.ok) {
                throw new Error(`Failed to fetch cards: ${res.status}`)
            }
            const data = await res.json()
            setCardList(data.map(card=> ({...card, answerDisplayed: false})))
        } catch (error) {
            console.error('Fetch Error: ', error)
            toast.error(error.message || 'Failed to load cards')
        } finally {
            setIsLoading(false)
        }
    }

    const toggleAnswer = (card) => {
        setCardList(prev =>
            prev.map(item =>
                item.id ===card.id ? {...item, answerDisplayed: !item.answerDisplayed} : item
            )
        )
    }

    //derive filtered listss with useMemo to avoid recalculating
    const filteredLists = useMemo(() => {
        const oop = cardList.filter(card => card.category === CATEGORIES.OOP)
        const springBoot = cardList.filter(card => card.category === CATEGORIES.SPRING_BOOT);
        const maven = cardList.filter(card => card.category === CATEGORIES.MAVEN);
        return { oop, springBoot, maven };
    }, [cardList])

    const selectCategory = (cat) => {
            setSelectedCategory(cat);
            console.log(cat);
    }

    useEffect(() => {
        getAllCards();
    }, []);

    return (
        <CardContext.Provider value={{
            cardList, toggleAnswer, selectCategory, selectedCategory,
            oopList: filteredLists.oop,
            springBootList: filteredLists.springBoot,
            mavenList: filteredLists.maven,
            isLoading
        }}>
            <Toaster />
            { children }
        </CardContext.Provider>
    )
}

export default CardContextProvider;