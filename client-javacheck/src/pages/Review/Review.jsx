import './Review.css'

import ReviewCtnRight from '../../components/ReviewCtnRight/ReviewCtnRight'

import { useContext } from 'react'
import { CardContext } from '../../ContextAPIs/CardContextProvider'
import { CATEGORIES } from '../../objects/categories.mjs'
import { FaSearch } from "react-icons/fa";

const Review = () => {

  const {
    selectCategory
  } = useContext(CardContext);

  return (
    <div className='review pages' >

      <div className='review-menu' >

      <div className="search">
        <input type="text" placeholder='search...' />
        <button className='search-icon' ><FaSearch/></button>
      </div>

        <div className='category-ctn' >
          <h1>Categories</h1>

            <h4 className='r-links' value='None' onClick={() => selectCategory(CATEGORIES.NONE)} >Shuffle</h4>

            <h4 className='r-links' value='OOP' onClick={() => selectCategory(CATEGORIES.OOP)} >OOP</h4>

            <h4 className='r-links' value='Spring-Boot' onClick={() => selectCategory(CATEGORIES.SPRING_BOOT)} >Spring-Boot</h4>

            <h4 className='r-links' value='Maven' onClick={() => selectCategory(CATEGORIES.MAVEN)} >Maven</h4>
        </div>

      </div>

      <ReviewCtnRight />

    </div>
  )
}

export default Review
