package eduflow.demo.Repository;

import eduflow.demo.entity.User;
import eduflow.demo.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {


}
