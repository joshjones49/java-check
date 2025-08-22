package com.joshjones49.javacheck;

import com.joshjones49.javacheck.entities.Card;
import com.joshjones49.javacheck.repos.CardRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class CardSeeder implements CommandLineRunner {

    private CardRepo cardRepo;

    public CardSeeder(CardRepo cardRepo){
        this.cardRepo = cardRepo;
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

        Card card8 = new Card();
        card8.setQuestion("What is the purpose of the @RestController annotation in Spring Boot?");
        card8.setAnswer("The @RestController annotation marks a class as a controller that " +
                "handles HTTP requests and returns data directly as JSON or XML. It combines " +
                "@Controller and @ResponseBody to simplify REST API development.");
        card8.setCategory("Spring-Boot");
        cardRepo.saveAndFlush(card8);

        Card card9 = new Card();
        card9.setQuestion("What are Spring Boot Starters, and why are they useful?");
        card9.setAnswer("Spring Boot Starters are pre-configured dependency templates that " +
                "simplify the inclusion of libraries for specific functionalities, such as web " +
                "development or database access. They are useful because they reduce the need to" +
                " manually specify dependencies and ensure compatible versions.");
        card9.setCategory("Spring-Boot");
        cardRepo.saveAndFlush(card9);

        Card card10 = new Card();
        card10.setQuestion("How does Spring Boot handle auto-configuration?");
        card10.setAnswer("Spring Boot uses auto-configuration to automatically configure the " +
                "application based on the dependencies present in the classpath. It applies " +
                "sensible defaults and settings, which can be customized, to minimize manual " +
                "configuration effort.");
        card10.setCategory("Spring-Boot");
        cardRepo.saveAndFlush(card10);

        Card card11 = new Card();
        card11.setQuestion("What is the role of the application.properties file in Spring Boot?");
        card11.setAnswer("The application.properties file is used to configure application " +
                "settings, such as database connections, server ports, and logging levels. It " +
                "allows developers to externalize configuration and customize the application " +
                "without changing the code.");
        card11.setCategory("Spring-Boot");
        cardRepo.saveAndFlush(card11);

        Card card12 = new Card();
        card12.setQuestion("How can you change the default port of a Spring Boot application?");
        card12.setAnswer("You can change the default port of a Spring Boot application by setting" +
                " the server.port property in the application.properties file to the desired " +
                "port number, such as server.port=8081.");
        card12.setCategory("Spring-Boot");
        cardRepo.saveAndFlush(card12);

        Card card13 = new Card();
        card13.setQuestion("What is the Spring Boot DevTools module, and how does it help " +
                "developers?");
        card13.setAnswer("The Spring Boot DevTools module enhances the development experience by" +
                " enabling features like automatic application restarts when code changes and a " +
                "live reload for browser updates. It speeds up development by reducing manual " +
                "restarts and improving feedback loops.");
        card13.setCategory("Spring-Boot");
        cardRepo.saveAndFlush(card13);

        Card card14 = new Card();
        card14.setQuestion("What is Maven, and what is its primary purpose?");
        card14.setAnswer("Maven is a build automation tool primarily used for Java projects to " +
                "manage dependencies, build processes, and project configurations. Its primary " +
                "purpose is to simplify and standardize the build process by providing a uniform" +
                " build system and dependency management.");
        card14.setCategory("Maven");
        cardRepo.saveAndFlush(card14);

        Card card15 = new Card();
        card15.setQuestion("What is the purpose of the pom.xml file in a Maven project?");
        card15.setAnswer("The pom.xml file, or Project Object Model, is the core configuration " +
                "file in a Maven project that defines the project’s dependencies, build " +
                "settings, plugins, and metadata. It serves as the blueprint for how Maven " +
                "builds and manages the project.");
        card15.setCategory("Maven");
        cardRepo.saveAndFlush(card15);

        Card card16 = new Card();
        card16.setQuestion("What is a Maven repository, and what are the different types?");
        card16.setAnswer("A Maven repository is a storage location where Maven retrieves " +
                "dependencies, plugins, and libraries. The three types are local (on the " +
                "developer’s machine), central (a global repository hosted by Maven), and remote" +
                " (organization-specific or third-party repositories).");
        card16.setCategory("Maven");
        cardRepo.saveAndFlush(card16);

        Card card17 = new Card();
        card17.setQuestion("How does Maven handle dependency management?");
        card17.setAnswer("Maven handles dependency management by defining dependencies in the " +
                "pom.xml file, automatically downloading them from repositories, and resolving " +
                "transitive dependencies. It ensures consistent versions and reduces manual " +
                "dependency handling.");
        card17.setCategory("Maven");
        cardRepo.saveAndFlush(card17);

//        Card card9 = new Card();
//        card9.setQuestion("");
//        card9.setAnswer("");
//        card9.setCategory("Spring-Boot");
//        cardRepo.saveAndFlush(card9);

    }
}
