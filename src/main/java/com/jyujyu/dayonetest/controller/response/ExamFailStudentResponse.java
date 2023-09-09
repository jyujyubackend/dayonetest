package com.jyujyu.dayonetest.controller.response;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@EqualsAndHashCode
@Getter
@AllArgsConstructor
public class ExamFailStudentResponse {
  private final String studentName;
  private final Double avgScore;
}
