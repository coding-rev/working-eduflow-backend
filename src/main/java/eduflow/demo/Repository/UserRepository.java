package eduflow.demo.Repository;

import eduflow.demo.entity.User;
import eduflow.demo.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

//    @Query(value = "Insert into Users (username, email, password) values (?1, ?2, ?3)", nativeQuery = true)
//    User createUser(String username, String email, String password);


}
