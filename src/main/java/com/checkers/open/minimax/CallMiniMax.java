/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.checkers.open.minimax;

import java.util.List;

public interface CallMiniMax {

    // human player depth nodes
    String[] boardPane32 = {"boardPane23"};
    String[] boardPane31 = {"boardPane22", "boardPane24"};
    String[] boardPane30 = {"boardPane21", "boardPane23"};
    String[] boardPane29 = {"boardPane22"};
    String[] boardPane28 = {"boardPane19"};
    String[] boardPane27 = {"boardPane20", "boardPane18"};
    String[] boardPane26 = {"boardPane19", "boardPane17"};
    String[] boardPane25 = {"boardPane18"};
    String[] boardPane24 = {"boardPane15"};
    String[] boardPane23 = {"boardPane16", "boardPane14"};
    String[] boardPane22 = {"boardPane15", "boardPane13"};
    String[] boardPane21 = {"boardPane14"};
    String[] boardPane20 = {"boardPane11"};
    String[] boardPane19 = {"boardPane12", "boardPane10"};
    String[] boardPane18 = {"boardPane11", "boardPane9"};
    String[] boardPane17 = {"boardPane10"};
    String[] boardPane16 = {"boardPane7"};
    String[] boardPane15 = {"boardPane6", "boardPane8"};
    String[] boardPane14 = {"boardPane7", "boardPane5"};
    String[] boardPane13 = {"boardPane6"};
    String[] boardPane12 = {"boardPane3"};
    String[] boardPane11 = {"boardPane4", "boardPane2"};
    String[] boardPane10 = {"boardPane3", "boardPane1"};
    String[] boardPane9 = {"boardPane2"};
    String[] boardPane8 = {"boardPane4", "boardPane3"};
    String[] boardPane7 = {"boardPane3", "boardPane2"};
    String[] boardPane6 = {"boardPane2", "boardPane1"};
    String[] boardPane5 = {"boardPane1"};
    // king depth nodes
    String[] kingBoardPane32 = {"boardPane23"};
    String[] kingBoardPane31 = {"boardPane22", "boardPane24"};
    String[] kingBoardPane30 = {"boardPane21", "boardPane23"};
    String[] kingBoardPane29 = {"boardPane22"};
    String[] kingBoardPane28 = {"boardPane19"};
    String[] kingBoardPane27 = {"boardPane20", "boardPane18"};
    String[] kingBoardPane26 = {"boardPane19", "boardPane17"};
    String[] kingBoardPane25 = {"boardPane18"};
    String[] kingBoardPane24 = {"boardPane15", "boardPane31"};
    String[] kingBoardPane23 = {"boardPane16", "boardPane14", "boardPane30", "boardPane32"};
    String[] kingBoardPane22 = {"boardPane15", "boardPane13", "boardPane29", "boardPane31"};
    String[] kingBoardPane21 = {"boardPane14", "boardPane30"};
    String[] kingBoardPane20 = {"boardPane11", "boardPane27"};
    String[] kingBoardPane19 = {"boardPane12", "boardPane10", "boardPane26", "boardPane28"};
    String[] kingBoardPane18 = {"boardPane11", "boardPane9", "boardPane25", "boardPane27"};
    String[] kingBoardPane17 = {"boardPane10", "boardPane26"};
    String[] kingBoardPane16 = {"boardPane7", "boardPane23"};
    String[] kingBoardPane15 = {"boardPane6", "boardPane8", "boardPane22", "boardPane24"};
    String[] kingBoardPane14 = {"boardPane7", "boardPane5", "boardPane21", "boardPane23"};
    String[] kingBoardPane13 = {"boardPane6", "boardPane22"};
    String[] kingBoardPane12 = {"boardPane3", "boardPane19"};
    String[] kingBoardPane11 = {"boardPane4", "boardPane2", "boardPane18", "boardPane20"};
    String[] kingBoardPane10 = {"boardPane3", "boardPane1", "boardPane17", "boardPane19"};
    String[] kingBoardPane9 = {"boardPane2", "boardPane18"};
    String[] kingBoardPane8 = {"boardPane4", "boardPane3", "boardPane15"};
    String[] kingBoardPane7 = {"boardPane3", "boardPane2", "boardPane14", "boardPane16"};
    String[] kingBoardPane6 = {"boardPane2", "boardPane1", "boardPane13", "boardPane15"};
    String[] kingBoardPane5 = {"boardPane1", "boardPane14"};
    String[] kingBoardPane4 = {"boardPane11"};
    String[] kingBoardPane3 = {"boardPane10", "boardPane12"};
    String[] kingBoardPane2 = {"boardPane9", "boardPane11"};
    String[] kingBoardPane1 = {"boardPane10"};

    //computer player depth nodes
    String[] compBoardPane1 = {"boardPane10"};
    String[] compBoardPane2 = {"boardPane9", "boardPane11"};
    String[] compBoardPane3 = {"boardPane10", "boardPane12"};
    String[] compBoardPane4 = {"boardPane11"};
    String[] compBoardPane5 = {"boardPane14"};
    String[] compBoardPane6 = {"boardPane13", "boardPane15"};
    String[] compBoardPane7 = {"boardPane14", "boardPane16"};
    String[] compBoardPane8 = {"boardPane15"};
    String[] compBoardPane9 = {"boardPane18"};
    String[] compBoardPane10 = {"boardPane17", "boardPane19"};
    String[] compBoardPane11 = {"boardPane18", "boardPane20"};
    String[] compBoardPane12 = {"boardPane19"};
    String[] compBoardPane13 = {"boardPane22"};
    String[] compBoardPane14 = {"boardPane21", "boardPane23"};
    String[] compBoardPane15 = {"boardPane22", "boardPane24"};
    String[] compBoardPane16 = {"boardPane23"};
    String[] compBoardPane17 = {"boardPane26"};
    String[] compBoardPane18 = {"boardPane25", "boardPane27"};
    String[] compBoardPane19 = {"boardPane26", "boardPane28"};
    String[] compBoardPane20 = {"boardPane27"};
    String[] compBoardPane21 = {"boardPane30"};
    String[] compBoardPane22 = {"boardPane29", "boardPane31"};
    String[] compBoardPane23 = {"boardPane30", "boardPane32"};
    String[] compBoardPane24 = {"boardPane31"};
    String[] compBoardPane25 = {"boardPane29", "boardPane30"};
    String[] compBoardPane26 = {"boardPane30", "boardPane31"};
    String[] compBoardPane27 = {"boardPane31", "boardPane32"};
    String[] compBoardPane28 = {"boardPane32"};

    List<String> returnNodeDepth(String boardPane, String PlayerFlag);

    List<String> returnComputerNodeDepth(String boardPane, String PlayerFlag);

    void organiseNodeDepth();

    void organiseComputerNodeDepth();

    void organiseKingNodeDepth();
}
