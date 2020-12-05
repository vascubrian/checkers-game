/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
