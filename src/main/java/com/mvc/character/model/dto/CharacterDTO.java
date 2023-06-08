package com.mvc.character.model.dto;

public class CharacterDTO implements java.io.Serializable {

    private String characterCode;
    private String characterName;
    private String ageInfo;
    private String statureInfo;
    private String jobInfo;
    private String positionInfo;
    private String genderStatus;

    public CharacterDTO() {
    }

    public CharacterDTO(String characterCode, String characterName, String ageInfo, String statureInfo, String jobInfo, String positionInfo, String genderStatus) {
        this.characterCode = characterCode;
        this.characterName = characterName;
        this.ageInfo = ageInfo;
        this.statureInfo = statureInfo;
        this.jobInfo = jobInfo;
        this.positionInfo = positionInfo;
        this.genderStatus = genderStatus;
    }

    @Override
    public String toString() {
        return "EmployeeDTO{" +
                "characterCode='" + characterCode + '\'' +
                ", characterName='" + characterName + '\'' +
                ", ageInfo='" + ageInfo + '\'' +
                ", statureInfo='" + statureInfo + '\'' +
                ", jobInfo='" + jobInfo + '\'' +
                ", positionInfo='" + positionInfo + '\'' +
                ", genderStatus='" + genderStatus + '\'' +
                '}';
    }

    public String getCharacterCode() {
        return characterCode;
    }

    public void setCharacterCode(String characterCode) {
        this.characterCode = characterCode;
    }

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public String getAgeInfo() {
        return ageInfo;
    }

    public void setAgeInfo(String ageInfo) {
        this.ageInfo = ageInfo;
    }

    public String getStatureInfo() {
        return statureInfo;
    }

    public void setStatureInfo(String statureInfo) {
        this.statureInfo = statureInfo;
    }

    public String getJobInfo() {
        return jobInfo;
    }

    public void setJobInfo(String jobInfo) {
        this.jobInfo = jobInfo;
    }

    public String getPositionInfo() {
        return positionInfo;
    }

    public void setPositionInfo(String positionInfo) {
        this.positionInfo = positionInfo;
    }

    public String getGenderStatus() {
        return genderStatus;
    }

    public void setGenderStatus(String genderStatus) {
        this.genderStatus = genderStatus;
    }
}