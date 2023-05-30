package com.wad.springdata.services;

import com.wad.springdata.domain.ResearchInstitute;
import com.wad.springdata.repositories.ResearchInstituteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResearchInstituteService {
    private final ResearchInstituteRepository researchInstituteRepository;

    public ResearchInstituteService(ResearchInstituteRepository researchInstituteRepository) {
        this.researchInstituteRepository = researchInstituteRepository;
    }

    public List<ResearchInstitute> getAllResearchInstitutes() {
        return researchInstituteRepository.findAll();
    }

    public ResearchInstitute getResearchInstituteById(Long id) {
        return researchInstituteRepository.findById(id).orElse(null);
    }

    public ResearchInstitute createResearchInstitute(ResearchInstitute researchInstitute) {
        return researchInstituteRepository.save(researchInstitute);
    }

    public ResearchInstitute updateResearchInstitute(ResearchInstitute researchInstitute) {
        return researchInstituteRepository.save(researchInstitute);
    }

    public void deleteResearchInstitute(Long id) {
        researchInstituteRepository.deleteById(id);
    }
}