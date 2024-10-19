package Emanuel.TalkyApp.Repositories;

import Emanuel.TalkyApp.Models.MessageEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<MessageEntity,Long> {
}
