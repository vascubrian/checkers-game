/**
 * https://www.freelancer.com/u/vascubrian
 * Created on: 04-APR-2020
 * Created by: Brian Twijukye
 * Edited by:
 */
package com.checkers.open.enumeration;

import java.io.Serializable;

public enum PanelFlag implements Serializable {
    LOCKED("LOCKED"), MOVE("MOVE"), EMPTY("EMPTY");
    String paneStaus;

    private PanelFlag(String paneStaus) {
        this.paneStaus = paneStaus;
    }

    public String getPaneStaus() {
        return paneStaus;
    }

}
