import './Review.css'

import ReviewCtnRight from '../../components/ReviewCtnRight/ReviewCtnRight'

import { useContext } from 'react'
import { CardContext } from '../../ContextAPIs/CardContextProvider'

const Review = () => {

  const {
    selectCategory
  } = useContext(CardContext);

  return (
    <div className='review pages' >

      <div className='review-menu' >

        <input type="text" placeholder='search' />

        <div className='category-ctn' >
          <h1>Categories</h1>

            <h4 className='r-links' value='None' onClick={() => selectCategory('None')} >Random</h4>

            <h4 className='r-links' value='OOP' onClick={() => selectCategory('OOP')} >OOP</h4>

            <h4 className='r-links' value='Spring-Boot' onClick={() => selectCategory('Spring-Boot')} >Spring-Boot</h4>

            <h4 className='r-links' value='Maven' onClick={() => selectCategory('Maven')} >Maven</h4>
        </div>

      </div>

      <ReviewCtnRight />

    </div>
  )
}

export default Review
