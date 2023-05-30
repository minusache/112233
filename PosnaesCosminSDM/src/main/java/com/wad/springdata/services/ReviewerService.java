package com.wad.springdata.services;

import com.wad.springdata.domain.Reviewer;
import com.wad.springdata.repositories.ReviewerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewerService {
    @Autowired
    private ReviewerRepository reviewerRepository;

    public List<Reviewer> getAllReviewers() {
        return reviewerRepository.findAll();
    }

    public Reviewer getReviewerById(Long id) {
        return reviewerRepository.findById(id).orElse(null);
    }

    public Reviewer createReviewer(Reviewer reviewer) {
        return reviewerRepository.save(reviewer);
    }

    public Reviewer updateReviewer(Reviewer reviewer) {
        return reviewerRepository.save(reviewer);
    }

    public void deleteReviewer(Long id) {
        reviewerRepository.deleteById(id);
    }
}

