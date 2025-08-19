import React, { useState } from "react";
import toast, { Toaster } from "react-hot-toast";

export const CardContext = React.createContext();

const CardContextProvider = ({ children }) => {

    let url = 'http://localhost:8080'

    //STATE
    const [cardList, setCardList] = useState([]);

    const toggleAnswer = (card) => {
        setCardList(cardList.map(c =>
            c === card ? { ...c, answerDisplayed: !c.answerDisplayed } : c
        ));
    }

    //function to fetch all cards
    const getAllCards = async () => {
        try {
            const res = await fetch(url+'/cards')
            const data = await res.json()
            setCardList(data)
            console.log(cardList)
        } catch (error) {
            toast.error(error)
        }
    }

    return (
        <CardContext.Provider value={{
            getAllCards, cardList, toggleAnswer
        }}>{ children }
        </CardContext.Provider>
    )
}

export default CardContextProvider;