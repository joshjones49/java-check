import './ReviewCtnRight.css'

import { useContext, useEffect } from 'react'
import { CardContext } from '../../ContextAPIs/CardContextProvider'

const ReviewCtnRight = () => {

    const {
        cardList, toggleAnswer,
        selectCategory, selectedCategory, oopList,
        mavenList, springBootList
    } = useContext(CardContext)

    const renderCards = (list) => {
      return list.map(card => (
        <div key={card.id} className="card">
          <h2>{card.answerDisplayed ? card.answer : card.question}</h2>
          <button className='toggle-btn' onClick={() => toggleAnswer(card)}>
            <h4>{card.answerDisplayed ? 'BACK' : 'ANSWER'}</h4>
          </button>
        </div>
      ))
    }

  return (
    <div className='review-ctn-right' >
      {(() => {
        if (selectedCategory === 'None') {
          return cardList.length > 0
            ? renderCards(cardList)
            : <p>No cards were found in this category</p>;
        }
        if (selectedCategory === 'OOP') {
          return oopList.length > 0
            ? renderCards(oopList)
            : <p>No cards were found in this category</p>;
        }
        if (selectedCategory === 'Spring-Boot') {
          return springBootList.length > 0
            ? renderCards(springBootList)
            : <p>No cards were found in this category</p>;
        }
        if (selectedCategory === 'Maven') {
          return mavenList.length > 0
            ? renderCards(mavenList)
            : <p>No cards were found in this category</p>;
        }
        // If category is not recognized
        return <p>No cards were found in this category</p>;
      })()}
    </div>
  )
}

export default ReviewCtnRight
