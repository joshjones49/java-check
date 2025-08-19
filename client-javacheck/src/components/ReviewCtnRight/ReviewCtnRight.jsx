import './ReviewCtnRight.css'

import { useContext, useEffect } from 'react'
import { CardContext } from '../../ContextAPIs/CardContextProvider'

const ReviewCtnRight = () => {

    const {
        cardList, toggleAnswer
    } = useContext(CardContext)

    useEffect(() => {
        for(let card of cardList) {
            console.log(card)
        }
    }, [])

  return (
    <div className='review-ctn-right' >
      {cardList.map(card => (
        <div key={card.id} className="card">
              <h2>{card.answerDisplayed ? card.answer : card.question}</h2>
            <button className='toggle-btn' onClick={() => toggleAnswer(card)} >
                <h4>{card.answerDisplayed ? 'BACK' : 'ANSWER'}</h4>
            </button>
        </div>
      ))}
    </div>
  )
}

export default ReviewCtnRight
