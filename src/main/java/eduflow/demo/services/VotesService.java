package eduflow.demo.services;

import eduflow.demo.Repository.VotesRepository;
import eduflow.demo.entity.Votes;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VotesService {

    private final VotesRepository votesRepository;

    public VotesService(VotesRepository votesRepository) {
        this.votesRepository = votesRepository;
    }

    public List<Votes> getAllVotes() {
        return votesRepository.findAll();
    }
}
