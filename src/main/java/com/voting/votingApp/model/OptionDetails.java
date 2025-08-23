package com.voting.votingApp.model;

import jakarta.persistence.Embeddable;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Embeddable
public class OptionDetails {
    private String name;
    private Long count = 0L;
}
