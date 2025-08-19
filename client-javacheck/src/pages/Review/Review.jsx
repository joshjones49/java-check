import './Review.css'

import { Link } from 'react-router-dom'

const Review = () => {
  return (
    <div className='review pages' >

      <div className='review-menu' >

        <input type="text" placeholder='search' />

        <div className='category-ctn' >
          <Link className='r-links'>
            <h4>OOP</h4>
          </Link>
          <Link className='r-links'>
            <h4>Spring-Boot</h4>
          </Link>
          <Link className='r-links'>
            <h4>Maven</h4>
          </Link>
        </div>

      </div>

      <div className='review-right' >
        RIGHT
      </div>

    </div>
  )
}

export default Review
