import React, { useState } from "react";
import toast, { Toaster } from "react-hot-toast";

export const CardContext = React.createContext();

const CardContextProvider = ({ children }) => {

    let url = 'http://localhost:8080'

    //STATE
    const [cardList, setCardList] = useState([]);
    const [oopList, setOopList] = useState([]);
    const [springBootList, setSpringBootList] = useState([]);
    const [mavenList, setMavenList] = useState([]);
    const [selectedCategory, setSelectedCategory] = useState('None');

    const toggleAnswer = (card) => {
        setCardList(cardList.map(c =>
            c === card ? { ...c, answerDisplayed: !c.answerDisplayed } : c
        ));
    }

    //function to fetch all cards
    const getAllCards = async () => {

        if(cardList.length === 0) {
            try {
                const res = await fetch(url + '/cards')
                const data = await res.json()
                setCardList(data)

                let oop = []
                let springBoot = []
                let maven = []

                for(let card of data) {
                    if(card.category === 'OOP') {
                        oop.push(card)
                    } else if(card.category === 'Spring-Boot') {
                        springBoot.push(card)
                    } else {
                        maven.push(card)
                    }
                }
                setOopList(oop)
                setMavenList(maven)
                setSpringBootList(springBoot)
                console.log(oop, maven, springBoot)
            } catch (error) {
                toast.error(error)
            }
        }
        
    }

    const selectCategory = (cat) => {
            setSelectedCategory(cat);
            console.log(selectedCategory);
    }

    return (
        <CardContext.Provider value={{
            getAllCards, cardList, toggleAnswer,
            springBootList, oopList, mavenList,
            selectCategory, selectedCategory
        }}>{ children }
        </CardContext.Provider>
    )
}

export default CardContextProvider;