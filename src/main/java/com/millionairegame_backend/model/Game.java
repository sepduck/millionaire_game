package com.millionairegame_backend.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "games")
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    @ManyToOne
    @JoinColumn(name = "current_question_id")
    private Question currentQuestion;
    private BigDecimal currentPrize;
    private Boolean usedHelp5050;
    private Boolean usedHelpAudience;
    private Boolean usedHelpCall;
    private Boolean isFinished;
    private String gameStatus;
    @CreationTimestamp
    private LocalDateTime createdAt;
    private LocalDateTime finishedAt;

}
