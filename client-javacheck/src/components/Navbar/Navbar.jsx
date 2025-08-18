import './Navbar.css'

import { Link } from 'react-router-dom'

const Navbar = () => {
  return (
    <div className='navbar' >

      <Link to='/' className='links'>
        <h1>HOME</h1>
      </Link>

      <Link to='/review' className='links'>
        <h1>REVIEW</h1>
      </Link>

      <Link to='/play'className='links'>
        <h1>PLAY</h1>
      </Link>

      <Link to='/scoreboard' className='links'>
        <h1>SCOREBOARD</h1>
      </Link>
    </div>
  )
}

export default Navbar
