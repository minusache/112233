package com.wad.springdata.controllers;

import com.wad.springdata.domain.ResearchInstitute;
import com.wad.springdata.services.ResearchInstituteService;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/research-institutes")
public class ResearchInstituteController {
    @Autowired
    private ResearchInstituteService researchInstituteService;

    @GetMapping
    public List<ResearchInstitute> getAllResearchInstitutes() {
        return researchInstituteService.getAllResearchInstitutes();
    }

    @GetMapping("/{id}")
    public ResearchInstitute getResearchInstituteById(@PathVariable Long id) {
        return researchInstituteService.getResearchInstituteById(id);
    }

    @PostMapping
    public ResearchInstitute createResearchInstitute(@RequestBody ResearchInstitute researchInstitute) {
        return researchInstituteService.createResearchInstitute(researchInstitute);
    }

    @PutMapping("/{id}")
    public ResearchInstitute updateResearchInstitute(@PathVariable Long id, @RequestBody ResearchInstitute researchInstitute) {
        researchInstitute.setId(id);
        return researchInstituteService.updateResearchInstitute(researchInstitute);
    }

    @DeleteMapping("/{id}")
    public void deleteResearchInstitute(@PathVariable Long id) {
        researchInstituteService.deleteResearchInstitute(id);
    }

}
