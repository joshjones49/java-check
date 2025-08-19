import React, { useState } from "react";
import toast, { Toaster } from "react-hot-toast";

export const CardContext = React.createContext();

const CardContextProvider = ({ children }) => {

    let url = 'http://localhost:8080'

    return (
        <CardContext.Provider value={{

        }}>{ children }
        </CardContext.Provider>
    )
}

export default CardContextProvider;