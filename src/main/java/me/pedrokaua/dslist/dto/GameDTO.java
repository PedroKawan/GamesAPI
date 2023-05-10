package me.pedrokaua.dslist.dto;

import me.pedrokaua.dslist.entities.Game;

public class GameDTO {
    private Long id;
    private Integer year;
    private String title;
    private String imgUrl;
    private Double score;



    public GameDTO(){}

    public GameDTO(Game entity) {
        this.id = entity.getId();
        this.year = entity.getYear();
        this.title = entity.getTitle();
        this.imgUrl = entity.getImgUrl();
        this.score = entity.getScore();
    }

    public Long getId() {
        return id;
    }

    public Integer getYear() {
        return year;
    }

    public String getTitle() {
        return title;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public Double getScore() {
        return score;
    }
}
