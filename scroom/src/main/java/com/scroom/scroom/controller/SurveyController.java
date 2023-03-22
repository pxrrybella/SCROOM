package com.scroom.scroom.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.scroom.scroom.model.Survey;
import com.scroom.scroom.service.SurveyService;

@Controller
@CrossOrigin("*")
@RestController
@RequestMapping("/survey")
public class SurveyController {
    private SurveyService surveyService;

    public SurveyController(@Autowired SurveyService surveyService){
        this.surveyService = surveyService;
    }

    @PostMapping
    public void saveSurvey(@RequestBody Survey survey){
        surveyService.saveSurvey(survey);
    }

    @PutMapping
    public void updateSurvey(@RequestBody Survey survey){
        surveyService.updateSurvey(survey);
    }

    @DeleteMapping
    public void deleteSurvey(@PathVariable Integer id){
        surveyService.deleteSurvey(id);
    }

    @GetMapping
    public List<Survey> findAll(){
        return surveyService.findAll();
    }
}
