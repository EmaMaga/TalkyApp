package Emanuel.TalkyApp.DTO;

import Emanuel.TalkyApp.Models.ChatRoomEntity;
import Emanuel.TalkyApp.Models.UserEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor @AllArgsConstructor
public class messageDTO {
    private Long id;
    private String content;
    private UserEntity sender;
    private UserEntity reciver;
    private ChatRoomEntity chatRoom;
}
