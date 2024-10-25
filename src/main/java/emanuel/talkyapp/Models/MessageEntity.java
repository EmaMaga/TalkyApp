package emanuel.talkyapp.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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
    @ManyToOne(fetch = FetchType.EAGER )
    @JoinColumn(nullable = false)
    private UserEntity sender;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(nullable = false)
    private UserEntity reciver;
    @ManyToOne
    @JoinColumn( nullable = false)
    private ChatRoomEntity chatRoom;
}
