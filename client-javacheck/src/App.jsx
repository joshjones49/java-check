import './App.css'

import { Route, Routes } from 'react-router-dom'

import Home from './pages/Home/Home'
import Navbar from './components/Navbar/Navbar'
import Review from './pages/Review/Review'

function App() {

  return (

    

    <div className='app'>
      <div className='container' >
        <Navbar/>
        <Routes>
          <Route path='/' element={<Home/>}/>
          <Route path='/review' element={<Review/>}/>
        </Routes>
      </div>


      <div className='decoration1 decoration' ></div>
      <div className='decoration2 decoration' ></div>
      <div className='decoration3 decoration' ></div>
    </div>
  )
}

export default App
