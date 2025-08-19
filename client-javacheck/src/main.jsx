import { StrictMode } from 'react'
import { createRoot } from 'react-dom/client'
import { BrowserRouter } from 'react-router-dom'
import CardContextProvider from './ContextAPIs/CardContextProvider.jsx'
import PlayerContextProvider from './ContextAPIs/PlayerContextProvider.jsx'
import './index.css'
import App from './App.jsx'

createRoot(document.getElementById('root')).render(
  <StrictMode>
    <PlayerContextProvider>
      <CardContextProvider>
        <BrowserRouter>
          <App />
        </BrowserRouter>
      </CardContextProvider>
    </PlayerContextProvider>
  </StrictMode>,
)
