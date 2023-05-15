package me.pedrokaua.dslist.dto;

public class ReplacementDTO {
    private Integer sourceIndex;

    private Integer destinationIndex;

    ReplacementDTO () {
    }

    ReplacementDTO(int sourceIndex, int destinationIndex) {
        this.sourceIndex = sourceIndex;
        this.destinationIndex = destinationIndex;
    }

    public Integer getSourceIndex() {
        return sourceIndex;
    }

    public void setSourceIndex(Integer sourceIndex) {
        this.sourceIndex = sourceIndex;
    }

    public Integer getDestinationIndex() {
        return destinationIndex;
    }

    public void setDestinationIndex(Integer destinationIndex) {
        this.destinationIndex = destinationIndex;
    }
}
