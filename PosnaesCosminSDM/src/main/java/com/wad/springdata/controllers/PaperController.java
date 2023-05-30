package com.wad.springdata.controllers;

import com.wad.springdata.domain.Paper;
import com.wad.springdata.services.PaperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/papers")
public class PaperController {
    @Autowired
    private PaperService paperService;

    @GetMapping
    public List<Paper> getAllPapers() {
        return paperService.getAllPapers();
    }

    @GetMapping("/{id}")
    public Paper getPaperById(@PathVariable Long id) {
        return paperService.getPaperById(id);
    }

    @PostMapping
    public Paper createPaper(@RequestBody Paper paper) {
        return paperService.createPaper(paper);
    }

    @PutMapping("/{id}")
    public Paper updatePaper(@PathVariable Long id, @RequestBody Paper paper) {
        paper.setId(id);
        return paperService.updatePaper(paper);
    }

    @DeleteMapping("/{id}")
    public void deletePaper(@PathVariable Long id) {
        paperService.deletePaper(id);
    }
}

