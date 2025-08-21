import './ReviewCtnRight.css'

import { useContext, useEffect } from 'react'
import { CardContext } from '../../ContextAPIs/CardContextProvider'
import { CATEGORIES } from '../../objects/categories.mjs';

const ReviewCtnRight = () => {

  const { cardList, toggleAnswer,
     selectedCategory, oopList,
      springBootList, mavenList, isLoading 
    } = useContext(CardContext);

  const renderCards = (list) => {
    return list.length > 0 ? (
      list.map(card => (
        <div key={card.id} className="card">
          <h2>{card.answerDisplayed ? card.answer : card.question}</h2>
          <button className="toggle-btn" onClick={() => toggleAnswer(card)}>
            <h4>{card.answerDisplayed ? 'BACK' : 'ANSWER'}</h4>
          </button>
        </div>
      ))
    ) : (
      <p>No cards were found in this category</p>
    );
  };

  return (
    <div className="review-ctn-right">
      {(() => {
        switch (selectedCategory) {
          case CATEGORIES.NONE:
            return renderCards(cardList);
          case CATEGORIES.OOP:
            return renderCards(oopList);
          case CATEGORIES.SPRING_BOOT:
            return renderCards(springBootList);
          case CATEGORIES.MAVEN:
            return renderCards(mavenList);
          default:
            return <p>Invalid category selected</p>;
        }
      })()}
    </div>
  );
};

export default ReviewCtnRight
