package emanuel.talkyapp.DTO;

import emanuel.talkyapp.Models.ChatRoomEntity;
import emanuel.talkyapp.Models.UserEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor @AllArgsConstructor
public class MessageDTO {
    private Long id;
    private String content;
    private UserEntity sender;
    private UserEntity reciver;
    private ChatRoomEntity chatRoom;
}
