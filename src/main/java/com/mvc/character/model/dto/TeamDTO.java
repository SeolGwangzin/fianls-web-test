package com.mvc.character.model.dto;

public class TeamDTO implements java.io.Serializable {

    private String positionCode;
    private String positionName;
    private String useYN;

    public TeamDTO() {
    }

    public TeamDTO(String positionCode, String positionName, String useYN) {
        this.positionCode = positionCode;
        this.positionName = positionName;
        this.useYN = useYN;
    }

    public String getPositionCode() {
        return positionCode;
    }

    public void setPositionCode(String positionCode) {
        this.positionCode = positionCode;
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    public String getUseYN() {
        return useYN;
    }

    public void setUseYN(String useYN) {
        this.useYN = useYN;
    }

    @Override
    public String toString() {
        return "TeamDTO{" +
                "positionCode='" + positionCode + '\'' +
                ", positionName='" + positionName + '\'' +
                ", useYN='" + useYN + '\'' +
                '}';
    }
}