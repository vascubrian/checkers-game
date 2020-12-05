/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.checkers.open.model;

public class Singleton {

    private static final Singleton instance = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance() {
        return instance;
    }

    private String scoreFlag = "";

    private String flagNode = "";

    private String gameLevel = "";

    private String scoreComputerFlag = "";

    private String flagComputerNode = "";

    public void setFlagNode(String flagNode) {
        this.flagNode = flagNode;
    }

    public String getFlagNode() {
        return flagNode;
    }

    public void setScoreFlag(String scoreFlag) {
        this.scoreFlag = scoreFlag;
    }

    public String getScoreFlag() {
        return scoreFlag;
    }

    public void setGameLevel(String gameLevel) {
        this.gameLevel = gameLevel;
    }

    public String getGameLevel() {
        return gameLevel;
    }

    public void setComputerFlagNode(String flagComputerNode) {
        this.flagComputerNode = flagComputerNode;
    }

    public String getComputerFlagNode() {
        return flagComputerNode;
    }

    public void setComputerScoreFlag(String scoreComputerFlag) {
        this.scoreComputerFlag = scoreComputerFlag;
    }

    public String getComputerScoreFlag() {
        return scoreComputerFlag;
    }
}
