/**
 * Copyright 2020 Me u SoftwarePlus (meusoftwareplus.com)
 * Created on: 04-APR-2020
 * Created by: Brian Twijukye
 * Edited by:
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
