package com.burak.nlp.properties;

import com.burak.nlp.pipeline.Pipeline;
import edu.stanford.nlp.pipeline.CoreDocument;
import edu.stanford.nlp.pipeline.CoreSentence;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;

import java.util.List;

public class SentimentAnalysis {

    public static void analyze(String text) {

        StanfordCoreNLP stanfordCoreNLP = Pipeline.getPipeline();

        CoreDocument coreDocument = new CoreDocument(text);

        stanfordCoreNLP.annotate(coreDocument);

        List<CoreSentence> sentences = coreDocument.sentences();

        for (CoreSentence sentence : sentences){

            String sentiment = sentence.sentiment();

            System.out.println(sentiment + "\t " + sentence );


        }
    }
}
