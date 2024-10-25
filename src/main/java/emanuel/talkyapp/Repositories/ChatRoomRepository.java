package emanuel.talkyapp.Repositories;

import emanuel.talkyapp.Models.ChatRoomEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChatRoomRepository extends JpaRepository<ChatRoomEntity,Long> {
}
