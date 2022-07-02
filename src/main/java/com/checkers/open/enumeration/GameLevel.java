/**
 * https://www.freelancer.com/u/vascubrian
 * Created on: 04-APR-2020
 * Created by: Brian Twijukye
 * Edited by:
 */
package com.checkers.open.enumeration;

import java.io.Serializable;

public enum GameLevel implements Serializable {
    ONEPLAYER("ONEPLAYER"), TWOHUMANPLAYER("TWOHUMANPLAYER"), TWOPLAYERS("TWOPLAYERS");
    String gameLevel;

    private GameLevel(String gameLevel) {
        this.gameLevel = gameLevel;
    }

    public String getGameLevel() {
        return gameLevel;
    }

}
