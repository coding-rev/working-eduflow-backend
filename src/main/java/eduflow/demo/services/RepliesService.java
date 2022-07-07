//package eduflow.demo.services;
//
//import eduflow.demo.Repository.RepliesRepository;
//import eduflow.demo.entity.Replies;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class RepliesService {
//
//    @Autowired
//    private RepliesRepository repliesRepo;
//
//    public RepliesService(RepliesRepository repliesRepo){
//        this.repliesRepo = repliesRepo;
//    }
//
//
////    public List<Replies> getAllRepliesForAQuestion(Integer question_id) {
////        return repliesRepo.getRepliesByQuestionId(question_id);
////    }
//
//    public Replies addNewReply(Replies newReply) {
//        return repliesRepo.save(newReply);
//    }
//}
