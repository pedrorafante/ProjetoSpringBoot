package br.com.pedrorafante.dslist.entities;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "tb_game_list")
@Entity(name = "GameList")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class GameList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

}
