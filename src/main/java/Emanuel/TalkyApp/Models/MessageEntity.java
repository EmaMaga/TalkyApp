package Emanuel.TalkyApp.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class MessageEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String content;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "sender_id", nullable = false)
    private UserEntity sender;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "reciver_id", nullable = false)
    private UserEntity reciver;
    @ManyToOne
    @JoinColumn(name = "chat_room_id", nullable = false)
    private ChatRoomEntity chatRoom;
}
