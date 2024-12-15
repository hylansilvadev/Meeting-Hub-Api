package dev.hylansilva.meetinghub_api.models.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
@Table(name = "meetings")
public class Meeting {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(nullable = false)
    private LocalDateTime startTime;

    @Column(nullable = false)
    private LocalDateTime endTime;

    @ManyToOne(optional = false)
    @JoinColumn(name = "room_id", nullable = false)
    private MeetingRoom room;

    @ManyToOne(optional = false)
    @JoinColumn(name = "organizer_id", nullable = false)
    private User organizer;

    @Column(nullable = false)
    private Boolean isRecurring;


}
