package com.voting.votingApp.controller;

import com.voting.votingApp.model.Poll;
import com.voting.votingApp.service.PollService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/polls")
public class PollController {
    private final PollService pollService;

    public PollController(PollService pollService) {
        this.pollService = pollService;
    }

    @PostMapping
    public Poll createPoll(@RequestBody Poll poll) {
        return pollService.createPoll(poll);
    }
}
