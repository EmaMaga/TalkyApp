package Emanuel.TalkyApp.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Setter @Getter
@NoArgsConstructor @AllArgsConstructor
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String password;
    @OneToMany(mappedBy = "sender",cascade = CascadeType.ALL)
    private List<MessageEntity> sentMessages;
    @OneToMany(mappedBy = "reciver",cascade = CascadeType.ALL)
    private List<MessageEntity> recivedMessages;
    @ManyToMany(mappedBy = "users")
    private Set<ChatRoomEntity> chatList = new HashSet<>();


}
