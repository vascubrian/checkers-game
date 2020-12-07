/**
 * Copyright 2020 Me u SoftwarePlus (meusoftwareplus.com)
 * Created on: 04-APR-2020
 * Created by: Brian Twijukye
 * Edited by:
 */
package com.checkers.open.paneneighbours;

public interface ComputerNeighbourHandler {

    String[] boardPane1 = {"boardPane5", "boardPane6"};
    String[] boardPane2 = {"boardPane6", "boardPane7"};
    String[] boardPane3 = {"boardPane7", "boardPane8"};
    String[] boardPane4 = {"boardPane8"};
    String[] boardPane5 = {"boardPane9"};
    String[] boardPane6 = {"boardPane9", "boardPane10"};
    String[] boardPane7 = {"boardPane10", "boardPane11"};
    String[] boardPane8 = {"boardPane11", "boardPane12"};
    String[] boardPane9 = {"boardPane13", "boardPane14"};
    String[] boardPane10 = {"boardPane14", "boardPane15"};
    String[] boardPane11 = {"boardPane15", "boardPane16"};
    String[] boardPane12 = {"boardPane16"};
    String[] boardPane13 = {"boardPane17"};
    String[] boardPane14 = {"boardPane17", "boardPane18"};
    String[] boardPane15 = {"boardPane18", "boardPane19"};
    String[] boardPane16 = {"boardPane19", "boardPane20"};
    String[] boardPane17 = {"boardPane21", "boardPane22"};
    String[] boardPane18 = {"boardPane22", "boardPane23"};
    String[] boardPane19 = {"boardPane23", "boardPane24"};
    String[] boardPane20 = {"boardPane24"};
    String[] boardPane21 = {"boardPane25"};
    String[] boardPane22 = {"boardPane25", "boardPane26"};
    String[] boardPane23 = {"boardPane26", "boardPane27"};
    String[] boardPane24 = {"boardPane27", "boardPane28"};
    String[] boardPane25 = {"boardPane29", "boardPane30"};
    String[] boardPane26 = {"boardPane30", "boardPane31"};
    String[] boardPane27 = {"boardPane31", "boardPane32"};
    String[] boardPane28 = {"boardPane32"};

    boolean useList(String[] arr, String targetValue);
}
