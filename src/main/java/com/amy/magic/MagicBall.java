package com.amy.magic;

import java.util.Scanner;
import java.util.Random;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MagicBall implements CommandLineRunner {

    private JdbcAnswersDao answerDao;
    public MagicBall (JdbcAnswersDao answerDao){
        this.answerDao = answerDao;
    }

    public static void main (String[] args){
        SpringApplication.run(MagicBall.class, args);
    }
        @Override
        public  void run( String... args) {
            Scanner scanner = new Scanner(System.in);
            Random random = new Random();

            String[] answers = {
                    "Yes, definitely.",
                    "Ask again later.",
                    "Better not tell you now.",
                    "Don't count on it.",
                    "Without a doubt.",
                    "My sources say no.",
                    "It is certain.",
                    "Very doubtful."
            };
            System.out.println("Welcome to the Magic 8-Ball! Discover your future!");
            System.out.println("Ask me any yes or no question: ");
            scanner.nextLine(); //read question

            int index = random.nextInt(answers.length);
            System.out.println("The 8-Ball says: " + answers[index]);

            scanner.close();
        }
    }