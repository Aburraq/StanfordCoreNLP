package com.burak.nlp;

import com.burak.nlp.properties.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("------ Lemma Example ------");
        LemmaExample.lemma("I am trying to learn new technologies.");

        System.out.println("------ Nere Example ------");
        NERExample.nere("My name is Burak and I have a friend his name is Robert. We both are living in Berlin.");

        System.out.println("------ Pos Example ------");
        POSExample.pos("Hey! My name is Burak!");

        System.out.println("------ Sentence Recognizer Example ------");
        SentenceRecognizer.recognize("Hey! I am Burak. I am a lawyer registered Istanbul Bar.");

        System.out.println("------ Sentiment Analysis Example ------");
        SentimentAnalysis.analyze("The breathtaking scenery and heartwarming story filled me with joy and gratitude");

        System.out.println("------ Tokenize Example ------");
        TokenizeExample.tokenize("Hey! This is Burak");
    }

}
