package Emanuel.TalkyApp.DTO;

import Emanuel.TalkyApp.Models.MessageEntity;
import Emanuel.TalkyApp.Models.UserEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Set;

@Data
@NoArgsConstructor @AllArgsConstructor
public class chatRommDTO {
    private Long id;
    private String name;
    private Set<UserEntity> chat_users;
    private List<MessageEntity> roomMessages;
}
