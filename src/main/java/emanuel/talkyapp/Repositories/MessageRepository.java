package emanuel.talkyapp.Repositories;

import emanuel.talkyapp.Models.MessageEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<MessageEntity,Long> {
}
