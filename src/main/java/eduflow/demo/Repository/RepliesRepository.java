package eduflow.demo.Repository;

import eduflow.demo.entity.Replies;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RepliesRepository extends JpaRepository<Replies, Integer> {

    List<Replies> getRepliesByQuestionId(Integer questionId);
}
