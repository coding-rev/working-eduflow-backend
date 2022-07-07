package eduflow.demo.Repository;

import eduflow.demo.entity.Votes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VotesRepository extends JpaRepository<Votes, Integer> {
}
