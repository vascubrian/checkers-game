/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.checkers.open.boardfunction;

import java.util.List;

public interface FunctionHandler {

    void updatePanelStatus(String panelName, String panelFlag);

    String getPanelStatus(String panelName);

    void StandingPanelStatus();

    void updatePlayerStatus(String panelName, String playerFlag);

    String getPlayerStatus(String panelName);

    void StandingPlayerStatus();

    List<String> getHumanNeighbours(String panelName);

    List<String> getComputerNeighbours(String panelName);

    void createHumanNeighbours();

    void createComputerNeighbours();

    void createHumanKings();

    void createComputerKings();

    void resetHumanPanelStatus(String boardPane);

    List<String> allHumanPlayersMovePane();

    List<String> allComputerPlayersMovePane();

    String getScoreNode(String clickedNode, String neighbourNode);

    List<String> getComputerScoreNode();

    List<String> getHumanKings(String panelName);

    List<String> getComputerKings(String panelName);

    List<String> getKingDepthNeighbours(String clickedNode, String depthNode);

    List<String> getKingComputerDepthNeighbours(String clickedNode, String depthNode);

    boolean checkIfNodeIsDepthToBoardPane(String boardPane, String depthNode);
}
