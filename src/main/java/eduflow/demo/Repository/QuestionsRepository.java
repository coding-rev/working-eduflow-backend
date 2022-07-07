package eduflow.demo.Repository;

import eduflow.demo.entity.Questions;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionsRepository extends JpaRepository<Questions, Integer> {
}
