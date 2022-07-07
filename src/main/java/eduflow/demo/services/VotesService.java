package eduflow.demo.services;

import eduflow.demo.Repository.VotesRepository;
import eduflow.demo.entity.Votes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VotesService {

    @Autowired
    private VotesRepository votesRepository;

    public List<Votes> getAllVotes() {
        return votesRepository.findAll();
    }
}
