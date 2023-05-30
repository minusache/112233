package com.wad.springdata.services;

import com.wad.springdata.domain.Paper;
import com.wad.springdata.repositories.PaperRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaperService {
    @Autowired
    private PaperRepository paperRepository;

    public List<Paper> getAllPapers() {
        return paperRepository.findAll();
    }

    public Paper getPaperById(Long id) {
        return paperRepository.findById(id).orElse(null);
    }

    public Paper createPaper(Paper paper) {
        return paperRepository.save(paper);
    }

    public Paper updatePaper(Paper paper) {
        return paperRepository.save(paper);
    }

    public void deletePaper(Long id) {
        paperRepository.deleteById(id);
    }
}