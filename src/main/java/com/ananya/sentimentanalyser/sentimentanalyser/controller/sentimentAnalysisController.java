package com.ananya.sentimentanalyser.sentimentanalyser.controller;

import com.ananya.sentimentanalyser.sentimentanalyser.service.SentimentAnalysisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/sentiment")
@CrossOrigin(origins = "*")
public class sentimentAnalysisController {

    @Autowired
    private final SentimentAnalysisService sentimentAnalysisService;

    @Autowired
    public sentimentAnalysisController(SentimentAnalysisService sentimentAnalysisService) {
        this.sentimentAnalysisService = sentimentAnalysisService;
    }

    @PostMapping
    public String analyzeSentiment(@RequestBody String text) {
        return sentimentAnalysisService.analyzeSentiment(text);
    }
}