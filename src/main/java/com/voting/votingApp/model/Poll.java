package com.voting.votingApp.model;

import jakarta.persistence.*;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Poll {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String title;

    @ElementCollection
    @Column(nullable = false)
    private List<String> options = new ArrayList<>();

    @ElementCollection
    @Column(nullable = false)
    private List<Long> voteCount = new ArrayList<>();
}
