package me.pedrokaua.dslist.projections;

import org.springframework.data.web.ProjectedPayload;

public interface GameMinProjection {
    Long getId();
    String getTitle();
    Integer getYear();
    Double getScore();
    String getImgUrl();
    String getShortDescription();
    Integer getPosition();
}
