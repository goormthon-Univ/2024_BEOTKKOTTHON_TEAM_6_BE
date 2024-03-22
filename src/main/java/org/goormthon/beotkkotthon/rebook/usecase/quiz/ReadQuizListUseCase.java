package org.goormthon.beotkkotthon.rebook.usecase.quiz;

import org.goormthon.beotkkotthon.rebook.annotation.UseCase;
import org.goormthon.beotkkotthon.rebook.dto.response.quiz.QuizListDto;
import org.goormthon.beotkkotthon.rebook.dto.response.studyhistory.StudyHistoryListDto;

import java.util.List;
import java.util.UUID;

@UseCase
public interface ReadQuizListUseCase {
    List<QuizListDto> execute(UUID userId);
}
