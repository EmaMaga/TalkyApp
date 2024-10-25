package emanuel.talkyapp.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
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
    @JoinColumn(updatable = false,columnDefinition = "DATE")
    private LocalDate createdDate;
    @OneToMany(mappedBy = "chatRoom",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private List<MessageEntity> roomMessages;

}
