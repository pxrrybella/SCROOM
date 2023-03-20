package com.scroom.scroom.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;


import com.scroom.scroom.model.Survey;
import com.scroom.scroom.repository.SurveyRepository;


@Service
@Transactional
public class SurveyService {

    private SurveyRepository SurveyRepository;
    public SurveyService(SurveyRepository SurveyRepository){
        this.SurveyRepository = SurveyRepository;
    }
    public void saveSurvey (Survey survey){
        this.SurveyRepository.save(survey);
    }

    public void updateSurvey (Survey survey){
        this.SurveyRepository.save(survey);
    }

    public void deleteSurvey(Integer id){
        SurveyRepository.deleteById(id);
    }

    public List<Survey> findAll(){
        return SurveyRepository.findAll();
    }
   


    
}
