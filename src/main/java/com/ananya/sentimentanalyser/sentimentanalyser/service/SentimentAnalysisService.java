package com.ananya.sentimentanalyser.sentimentanalyser.service;


import edu.stanford.nlp.ling.*;
import edu.stanford.nlp.pipeline.*;
import edu.stanford.nlp.sentiment.SentimentCoreAnnotations;
import edu.stanford.nlp.util.*;
import org.springframework.stereotype.Service;

import java.util.Properties;

@Service
public class SentimentAnalysisService {

    private StanfordCoreNLP pipeline;
    private Annotation document;

    public SentimentAnalysisService() {
        // Initialize Stanford NLP pipeline with sentiment model
        Properties props = new Properties();
        props.setProperty("annotators", "tokenize, ssplit, pos, lemma, ner, parse, dcoref, sentiment");
//        props.setProperty("pos.model", "edu/stanford/nlp/models/pos-tagger/english-left3words-distsim.tagger");
//        props.setProperty("ner.model", "edu/stanford/nlp/models/ner/english.all.3class.distsim.crf.ser.gz");
        pipeline = new StanfordCoreNLP(props);


    }

    public String analyzeSentiment(String text) {
        // Create an empty Annotation with the input text
        document = new Annotation(text);

        // Run the text through the Stanford NLP pipeline
        pipeline.annotate(document);

        // Get the sentences from the document
        for (CoreMap sentence : document.get(CoreAnnotations.SentencesAnnotation.class)) {
            // Get the sentiment for each sentence
            return sentence.get(SentimentCoreAnnotations.SentimentClass.class);
        }
        return "Neutral"; // Default sentiment
    }
}
