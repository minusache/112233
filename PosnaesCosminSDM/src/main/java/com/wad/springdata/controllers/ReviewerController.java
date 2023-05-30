package com.wad.springdata.controllers;

import com.wad.springdata.domain.Reviewer;
import com.wad.springdata.services.ReviewerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reviewers")
public class ReviewerController {
    @Autowired
    private ReviewerService reviewerService;

    @GetMapping
    public List<Reviewer> getAllReviewers() {
        return reviewerService.getAllReviewers();
    }

    @GetMapping("/{id}")
    public Reviewer getReviewerById(@PathVariable Long id) {
        return reviewerService.getReviewerById(id);
    }

    @PostMapping
    public Reviewer createReviewer(@RequestBody Reviewer reviewer) {
        return reviewerService.createReviewer(reviewer);
    }

    @PutMapping("/{id}")
    public Reviewer updateReviewer(@PathVariable Long id, @RequestBody Reviewer reviewer) {
        reviewer.setId(id);
        return reviewerService.updateReviewer(reviewer);
    }

    @DeleteMapping("/{id}")
    public void deleteReviewer(@PathVariable Long id) {
        reviewerService.deleteReviewer(id);
    }
}