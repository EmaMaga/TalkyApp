package Emanuel.TalkyApp.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.*;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ChatRoomEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @ManyToMany
    @JoinTable(
            name = "chat_room_users",
            joinColumns = @JoinColumn(name = "chat_room_id"),inverseJoinColumns = @JoinColumn(name = "user_id")
    )
    private Set<UserEntity> chat_users = new HashSet<>();
    @OneToMany(mappedBy = "chatRoom",cascade = CascadeType.ALL)
    private List<MessageEntity> roomMessages;

}
