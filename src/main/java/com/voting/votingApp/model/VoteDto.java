package com.voting.votingApp.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class VoteDto {
    private Long pollId;
    private int optionIndex;
}
