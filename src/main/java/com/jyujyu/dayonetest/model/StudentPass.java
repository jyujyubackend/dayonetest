package com.jyujyu.dayonetest.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "student_pass")
@Entity
public class StudentPass {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "student_pass_id")
  private Long id;

  @Column(name = "exam")
  private String exam;

  @Column(name = "student_name")
  private String studentName;

  @Column(name = "avg_score")
  private Double avgScore;
}
