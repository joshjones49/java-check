import React, { useState } from "react";
import toast, { Toaster } from "react-hot-toast";

export const PlayerContext = React.createContext();

const PlayerContextProvider = ({ children }) => {

    let url = 'http://localhost:8080'

    return (
        <PlayerContext.Provider value={{

        }}>{ children }
        </PlayerContext.Provider>
    )
}

export default PlayerContextProvider;