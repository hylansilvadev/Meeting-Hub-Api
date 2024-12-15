package dev.hylansilva.meetinghub_api.models.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
@Table(name = "rooms")
public class MeetingRoom {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Integer capacity;

    @Column(nullable = false)
    private Boolean available;

    @OneToMany(mappedBy = "room", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Meeting> meetings;

    public void reserveRoom() {
        if (!this.available) {
            throw new IllegalStateException("Sala já está reservada.");
        }
        this.available = false;
    }

    public void releaseRoom() {
        this.available = true;
    }
}
