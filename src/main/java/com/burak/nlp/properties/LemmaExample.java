package com.burak.nlp.properties;

import com.burak.nlp.pipeline.Pipeline;
import edu.stanford.nlp.ling.CoreLabel;
import edu.stanford.nlp.pipeline.CoreDocument;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;

import java.util.List;

public class LemmaExample {

    public static void lemma(String text){

        StanfordCoreNLP stanfordCoreNLP = Pipeline.getPipeline();

        CoreDocument coreDocument = new CoreDocument(text);

        stanfordCoreNLP.annotate(coreDocument);

        List<CoreLabel> coreLabeltList = coreDocument.tokens();

        for (CoreLabel coreLabel : coreLabeltList){
            String lemma = coreLabel.lemma();

            System.out.println(coreLabel.originalText() + " = " + lemma);
        }

    }
}
