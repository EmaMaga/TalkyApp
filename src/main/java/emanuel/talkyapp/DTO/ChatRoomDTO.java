package emanuel.talkyapp.DTO;

import emanuel.talkyapp.Models.MessageEntity;
import emanuel.talkyapp.Models.UserEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Set;

@Data
@NoArgsConstructor @AllArgsConstructor
public class ChatRoomDTO {
    private Long id;
    private String name;
    private Set<UserEntity> chatUsers;
    private List<MessageEntity> roomMessages;
}
