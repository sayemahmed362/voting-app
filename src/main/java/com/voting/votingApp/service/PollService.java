package com.voting.votingApp.service;

import com.voting.votingApp.model.OptionDetails;
import com.voting.votingApp.model.Poll;
import com.voting.votingApp.repository.PollRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PollService {

    private final PollRepository pollRepository;

    public PollService(PollRepository pollRepository) {
        this.pollRepository = pollRepository;
    }

    public Poll createPoll(Poll poll) {
        return pollRepository.save(poll);
    }

    public List<Poll> getAllPolls() {
        return pollRepository.findAll();
    }

    public Optional<Poll> getPollById(Long id) {
        return pollRepository.findById(id);
    }

    public void vote(Long pollId, int optionIndex) {
        Poll poll = pollRepository.findById(pollId)
                .orElseThrow(() -> new IllegalArgumentException("Poll not found"));

        List<OptionDetails> options = poll.getOptions();
        if(optionIndex < 0 || optionIndex >= options.size()) {
            throw new IllegalArgumentException("Invalid option index");
        }

        OptionDetails optionDetails = poll.getOptions().get(optionIndex);
        optionDetails.setCount(optionDetails.getCount() + 1);

        pollRepository.save(poll);
    }
}
