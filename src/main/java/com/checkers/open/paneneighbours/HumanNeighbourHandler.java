/**
 * https://www.freelancer.com/u/vascubrian
 * Created on: 04-APR-2020
 * Created by: Brian Twijukye
 * Edited by:
 */
package com.checkers.open.paneneighbours;

public interface HumanNeighbourHandler {

    String[] boardPane32 = {"boardPane28", "boardPane27"};
    String[] boardPane31 = {"boardPane27", "boardPane26"};
    String[] boardPane30 = {"boardPane26", "boardPane25"};
    String[] boardPane29 = {"boardPane25"};
    String[] boardPane28 = {"boardPane24"};
    String[] boardPane27 = {"boardPane23", "boardPane24"};
    String[] boardPane26 = {"boardPane23", "boardPane22"};
    String[] boardPane25 = {"boardPane22", "boardPane21"};
    String[] boardPane24 = {"boardPane20", "boardPane19"};
    String[] boardPane23 = {"boardPane19", "boardPane18"};
    String[] boardPane22 = {"boardPane18", "boardPane17"};
    String[] boardPane21 = {"boardPane17"};
    String[] boardPane20 = {"boardPane16"};
    String[] boardPane19 = {"boardPane15", "boardPane16"};
    String[] boardPane18 = {"boardPane15", "boardPane14"};
    String[] boardPane17 = {"boardPane14", "boardPane13"};
    String[] boardPane16 = {"boardPane12", "boardPane11"};
    String[] boardPane15 = {"boardPane11", "boardPane10"};
    String[] boardPane14 = {"boardPane10", "boardPane9"};
    String[] boardPane13 = {"boardPane9"};
    String[] boardPane12 = {"boardPane8"};
    String[] boardPane11 = {"boardPane8", "boardPane7"};
    String[] boardPane10 = {"boardPane7", "boardPane6"};
    String[] boardPane9 = {"boardPane6", "boardPane5"};
    String[] boardPane8 = {"boardPane4", "boardPane3"};
    String[] boardPane7 = {"boardPane3", "boardPane2"};
    String[] boardPane6 = {"boardPane2", "boardPane1"};
    String[] boardPane5 = {"boardPane1"};

    boolean useList(String[] arr, String targetValue);
}
