/**
 * https://www.freelancer.com/u/vascubrian
 * Created on: 04-APR-2020
 * Created by: Brian Twijukye
 * Edited by:
 */
package com.checkers.open.boardfunction;

import java.util.List;

public interface FunctionHandlerHvsH {

    void updatePanelStatus(String panelName, String panelFlag);

    String getPanelStatus(String panelName);

    void humanStandingPanelStatus();

    void updatePlayerStatus(String panelName, String playerFlag);

    String getPlayerStatus(String panelName);

    void humanStandingPlayerStatus();

    List<String> getHumanNeighbours(String panelName);

    List<String> getComputerNeighbours(String panelName);

    void createHumanNeighbours();

    void createComputerNeighbours();

    void createHumanKings();

    void createComputerKings();

    void resetHumanPanelStatus(String boardPane);

    List<String> allHumanPlayersMovePane();

    List<String> allComputerPlayersMovePane();

    String getScoreNode(String clickedNode, String neighbourNode, String gamePlayerStatus);

    List<String> getComputerScoreNode();

    List<String> getHumanKings(String panelName);

    List<String> getComputerKings(String panelName);

    List<String> getKingDepthNeighbours(String clickedNode, String depthNode);

    List<String> getKingComputerDepthNeighbours(String clickedNode, String depthNode);

    boolean checkIfNodeIsDepthToBoardPane(String boardPane, String depthNode);
}
