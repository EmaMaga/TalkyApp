package Emanuel.TalkyApp.Repositories;

import Emanuel.TalkyApp.Models.ChatRoomEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChatRoomRepository extends JpaRepository<ChatRoomEntity,Long> {
}
