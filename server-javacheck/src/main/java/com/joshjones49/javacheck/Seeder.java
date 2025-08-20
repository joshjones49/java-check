package com.joshjones49.javacheck;

import com.joshjones49.javacheck.entities.Card;
import com.joshjones49.javacheck.entities.Clan;
import com.joshjones49.javacheck.entities.Player;
import com.joshjones49.javacheck.repos.CardRepo;
import com.joshjones49.javacheck.repos.PlayerRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class Seeder implements CommandLineRunner {

    private CardRepo cardRepo;
    private PlayerRepo playerRepo;

    public Seeder(CardRepo cardRepo, PlayerRepo playerRepo){
        this.cardRepo = cardRepo;
        this.playerRepo = playerRepo;
    }

    @Override
    @Transactional
    public void run(String... args) throws Exception {

        Card card1 = new Card();
        card1.setQuestion("What are the 4 Pillars of OOP?");
        card1.setAnswer("Encapsulation, Inheritance, Abstraction, Polymorphism");
        card1.setCategory("OOP");
        cardRepo.saveAndFlush(card1);

        Card card2 = new Card();
        card2.setQuestion("Explain the difference between method overloading and method " +
                "overriding.");
        card2.setAnswer("Overloading is when a class has multiple methods with the same name but " +
                "different parameter lists. Overriding is when a subclass has a specific " +
                "implementation of a method already defined in the superclass.");
        card2.setCategory("OOP");
        cardRepo.saveAndFlush(card2);

        Card card3 = new Card();
        card3.setQuestion("What is the purpose of the 'super' keyword");
        card3.setAnswer("Used in a subclass to access the superclass's constructor using 'super()'" +
                " or 'super(arguments)'. Invoke a superclass's method when overridden in the " +
                "subclass. Access superclass fields if they are shadowed in the subclass.");
        card3.setCategory("OOP");
        cardRepo.saveAndFlush(card3);

        Card card4 = new Card();
        card4.setQuestion("What is an abstract class and how is it different from a concrete " +
                "class?");
        card4.setAnswer("It is a class that cannot be instantiated and is declared with the " +
                "abstract keyword. It may contain abstract and concrete methods. A concrete class" +
                " is a regular class that can be instantiated and must provide implementation for" +
                " all methods.");
        card4.setCategory("OOP");
        cardRepo.saveAndFlush(card4);

        Card card5 = new Card();
        card5.setQuestion("What is an interface in and how does it support multiple inheritance?");
        card5.setAnswer("It is a blueprint of a class that contains abstract methods and possibly" +
                " constants or default methods (Java 8). It defines a contract that implementing " +
                "classes must follow. Supports multiple inheritance since a class can implement " +
                "multiple interfaces.");
        card5.setCategory("OOP");
        cardRepo.saveAndFlush(card5);

        Card card6 = new Card();
        card6.setQuestion("What is polymorphism and how is it achieved?");
        card6.setAnswer("Polymorphism allows objects to be treated as instances of their parent " +
                "class while invoking their specific behavior. It is achieved in 2 ways: " +
                "Overloading and Overriding");
        card6.setCategory("OOP");
        cardRepo.saveAndFlush(card6);

        Card card7 = new Card();
        card7.setQuestion("What is Spring Boot, and how does it differ from the Spring Framework?");
        card7.setAnswer("Spring Boot is an extension of the Spring Framework that simplifies the " +
                "development of production-ready applications by providing auto-configuration and" +
                " an opinionated setup. Unlike the Spring Framework, which requires extensive " +
                "manual configuration, Spring Boot reduces boilerplate code and enables faster " +
                "development with embedded servers.");
        card7.setCategory("Spring-Boot");
        cardRepo.saveAndFlush(card7);

//        Clan clan1 = new Clan();
//        clan1.setName("Java Pros");

        Player player1 = new Player();
        player1.setUsername("ultramax21");
        player1.setPassword("123");
//        player1.setClan(clan1);
        playerRepo.saveAndFlush(player1);

    }
}
