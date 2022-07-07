package eduflow.demo.services;

import eduflow.demo.Repository.QuestionsRepository;
import eduflow.demo.entity.Questions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionsService {

    private final QuestionsRepository questionRepo;

    @Autowired
    public QuestionsService(QuestionsRepository questionRepo) {
        this.questionRepo = questionRepo;
    }

    // Get all questions from the database
    public List<Questions> getAllQuestion() {
        return questionRepo.findAll();
    }

    // Post a new question and saves it to database
    public Questions postNewQuestion(Questions newQuestion) {
        return questionRepo.save(newQuestion);
    }
}
