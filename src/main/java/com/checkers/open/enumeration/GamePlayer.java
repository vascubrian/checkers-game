/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.checkers.open.enumeration;

import java.io.Serializable;

public enum GamePlayer implements Serializable {
    COMPUTER("COMPUTER"), HUMAN("HUMAN"), FREE("FREE"), HUMANKING("HUMANKING"), COMPUTERKING("COMPUTERKING");
    String playerFlag;

    private GamePlayer(String playerFlag) {
        this.playerFlag = playerFlag;
    }

    public String getPlayerFlag() {
        return playerFlag;
    }

}
