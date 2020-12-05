/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.checkers.open.enumeration;

import java.io.Serializable;

public enum GameLevel implements Serializable {
    ONEPLAYER("ONEPLAYER"), TWOPLAYERS("TWOPLAYERS");
    String gameLevel;

    private GameLevel(String gameLevel) {
        this.gameLevel = gameLevel;
    }

    public String getGameLevel() {
        return gameLevel;
    }

}
