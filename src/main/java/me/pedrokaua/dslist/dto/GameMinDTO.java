package me.pedrokaua.dslist.dto;

import me.pedrokaua.dslist.entities.Game;
import me.pedrokaua.dslist.projections.GameMinProjection;

public class GameMinDTO {
    private Long id;
    private Integer year;
    private String title;
    private String imgUrl;
    private Double score;



    public GameMinDTO(){}

    public GameMinDTO(Game entity) {
        this.id = entity.getId();
        this.year = entity.getYear();
        this.title = entity.getTitle();
        this.imgUrl = entity.getImgUrl();
        this.score = entity.getScore();
    }

    public GameMinDTO(GameMinProjection projection) {
        this.id = projection.getId();
        this.year = projection.getYear();
        this.title = projection.getTitle();
        this.imgUrl = projection.getImgUrl();
        this.score = projection.getScore();
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
