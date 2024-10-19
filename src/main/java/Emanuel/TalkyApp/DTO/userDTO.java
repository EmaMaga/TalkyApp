package Emanuel.TalkyApp.DTO;

import Emanuel.TalkyApp.Models.ChatRoomEntity;
import Emanuel.TalkyApp.Models.MessageEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Set;

@Data
@AllArgsConstructor @NoArgsConstructor
public class userDTO {
    private Long id;
    private String name;
    private String password;
    private List<MessageEntity>sentMessages;
    private List<MessageEntity> recivedMessages;
    private Set<ChatRoomEntity> chatList;
}
