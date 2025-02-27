package com.example.demo.domain;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
public class Mission {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Getter
    private Long userId;

    @Column(nullable = false, name = "name")
    @Getter
    private String name;

    @Column(nullable = false, name = "mission_cnt")
    @Getter
    private int missionCnt;

    @Getter
    @Column(nullable = false, name = "mission_pnt")
    private int missionPnt;

    // Getter, Setter, 생성자 추가
    public Mission() {}

    public Mission(Long userId, String name, int missionCnt, int missionPnt) {
        this.userId = userId;
        this.name = name;
        this.missionCnt = missionCnt;
        this.missionPnt = missionPnt;
    }

}
