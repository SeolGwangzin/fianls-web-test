package com.mvc.character.model.dto;

public class CharacterDTO implements java.io.Serializable {

    private String characterCode;
    private String characterName;
    private String ageInfo;
    private String statureInfo;
    private String jobInfo;
    private String positionCode;
    private String genderStatus;

    public CharacterDTO() {
    }

    public CharacterDTO(String characterCode, String characterName, String ageInfo, String statureInfo, String jobInfo, String positionCode, String genderStatus) {
        this.characterCode = characterCode;
        this.characterName = characterName;
        this.ageInfo = ageInfo;
        this.statureInfo = statureInfo;
        this.jobInfo = jobInfo;
        this.positionCode = positionCode;
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
                ", positionCode='" + positionCode + '\'' +
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

    public String getPositionCode() {
        return positionCode;
    }

    public void setPositionCode(String positionCode) {
        this.positionCode = positionCode;
    }

    public String getGenderStatus() {
        return genderStatus;
    }

    public void setGenderStatus(String genderStatus) {
        this.genderStatus = genderStatus;
    }
}