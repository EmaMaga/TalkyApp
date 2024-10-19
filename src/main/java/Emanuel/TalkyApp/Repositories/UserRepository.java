package Emanuel.TalkyApp.Repositories;

import Emanuel.TalkyApp.Models.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
}
