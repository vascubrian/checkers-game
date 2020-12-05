/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.checkers.open.boardfunction;

import com.checkers.open.enumeration.GamePlayer;
import com.checkers.open.enumeration.PanelFlag;
import com.checkers.open.king.ComputerKing;
import com.checkers.open.king.HumanKing;
import com.checkers.open.minimax.EnableCallMiniMax;
import com.checkers.open.paneneighbours.ComputerNeighbourHandler;
import com.checkers.open.paneneighbours.HumanNeighbourHandler;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PanelFunction extends EnableCallMiniMax implements FunctionHandler {

    private Map<String, String> panelStatus;

    private Map<String, String> playerStatus;

    private HashMap<String, List<String>> mapHumanNeighbours;

    private HashMap<String, List<String>> mapComputerNeighbours;

    private HashMap<String, List<String>> humanKings;

    private HashMap<String, List<String>> computerKings;

    @Override
    public void updatePanelStatus(String panelName, String panelFlag) {
        panelStatus.put(panelName, panelFlag);
    }

    @Override
    public String getPanelStatus(String panelName) {
        return panelStatus.get(panelName);
    }

    @Override
    public void StandingPanelStatus() {
        panelStatus = new HashMap<>();
        panelStatus.put("boardPane1", PanelFlag.LOCKED.getPaneStaus());
        panelStatus.put("boardPane2", PanelFlag.LOCKED.getPaneStaus());
        panelStatus.put("boardPane3", PanelFlag.LOCKED.getPaneStaus());
        panelStatus.put("boardPane4", PanelFlag.LOCKED.getPaneStaus());
        panelStatus.put("boardPane5", PanelFlag.LOCKED.getPaneStaus());
        panelStatus.put("boardPane6", PanelFlag.LOCKED.getPaneStaus());
        panelStatus.put("boardPane7", PanelFlag.LOCKED.getPaneStaus());
        panelStatus.put("boardPane8", PanelFlag.LOCKED.getPaneStaus());
        panelStatus.put("boardPane9", PanelFlag.LOCKED.getPaneStaus());
        panelStatus.put("boardPane10", PanelFlag.LOCKED.getPaneStaus());
        panelStatus.put("boardPane11", PanelFlag.LOCKED.getPaneStaus());
        panelStatus.put("boardPane12", PanelFlag.LOCKED.getPaneStaus());
        panelStatus.put("boardPane13", PanelFlag.EMPTY.getPaneStaus());
        panelStatus.put("boardPane14", PanelFlag.EMPTY.getPaneStaus());
        panelStatus.put("boardPane15", PanelFlag.EMPTY.getPaneStaus());
        panelStatus.put("boardPane16", PanelFlag.EMPTY.getPaneStaus());
        panelStatus.put("boardPane17", PanelFlag.EMPTY.getPaneStaus());
        panelStatus.put("boardPane18", PanelFlag.EMPTY.getPaneStaus());
        panelStatus.put("boardPane19", PanelFlag.EMPTY.getPaneStaus());
        panelStatus.put("boardPane20", PanelFlag.EMPTY.getPaneStaus());
        panelStatus.put("boardPane21", PanelFlag.MOVE.getPaneStaus());
        panelStatus.put("boardPane22", PanelFlag.MOVE.getPaneStaus());
        panelStatus.put("boardPane23", PanelFlag.MOVE.getPaneStaus());
        panelStatus.put("boardPane24", PanelFlag.MOVE.getPaneStaus());
        panelStatus.put("boardPane25", PanelFlag.LOCKED.getPaneStaus());
        panelStatus.put("boardPane26", PanelFlag.LOCKED.getPaneStaus());
        panelStatus.put("boardPane27", PanelFlag.LOCKED.getPaneStaus());
        panelStatus.put("boardPane28", PanelFlag.LOCKED.getPaneStaus());
        panelStatus.put("boardPane29", PanelFlag.LOCKED.getPaneStaus());
        panelStatus.put("boardPane30", PanelFlag.LOCKED.getPaneStaus());
        panelStatus.put("boardPane31", PanelFlag.LOCKED.getPaneStaus());
        panelStatus.put("boardPane32", PanelFlag.LOCKED.getPaneStaus());
    }

    @Override
    public void updatePlayerStatus(String panelName, String playerFlag) {
        playerStatus.put(panelName, playerFlag);
    }

    @Override
    public String getPlayerStatus(String panelName) {
        return playerStatus.get(panelName);
    }

    @Override
    public void StandingPlayerStatus() {
        playerStatus = new HashMap<>();
        playerStatus.put("boardPane1", GamePlayer.COMPUTER.getPlayerFlag());
        playerStatus.put("boardPane2", GamePlayer.COMPUTER.getPlayerFlag());
        playerStatus.put("boardPane3", GamePlayer.COMPUTER.getPlayerFlag());
        playerStatus.put("boardPane4", GamePlayer.COMPUTER.getPlayerFlag());
        playerStatus.put("boardPane5", GamePlayer.COMPUTER.getPlayerFlag());
        playerStatus.put("boardPane6", GamePlayer.COMPUTER.getPlayerFlag());
        playerStatus.put("boardPane7", GamePlayer.COMPUTER.getPlayerFlag());
        playerStatus.put("boardPane8", GamePlayer.COMPUTER.getPlayerFlag());
        playerStatus.put("boardPane9", GamePlayer.COMPUTER.getPlayerFlag());
        playerStatus.put("boardPane10", GamePlayer.COMPUTER.getPlayerFlag());
        playerStatus.put("boardPane11", GamePlayer.COMPUTER.getPlayerFlag());
        playerStatus.put("boardPane12", GamePlayer.COMPUTER.getPlayerFlag());
        playerStatus.put("boardPane13", GamePlayer.FREE.getPlayerFlag());
        playerStatus.put("boardPane14", GamePlayer.FREE.getPlayerFlag());
        playerStatus.put("boardPane15", GamePlayer.FREE.getPlayerFlag());
        playerStatus.put("boardPane16", GamePlayer.FREE.getPlayerFlag());
        playerStatus.put("boardPane17", GamePlayer.FREE.getPlayerFlag());
        playerStatus.put("boardPane18", GamePlayer.FREE.getPlayerFlag());
        playerStatus.put("boardPane19", GamePlayer.FREE.getPlayerFlag());
        playerStatus.put("boardPane20", GamePlayer.FREE.getPlayerFlag());
        playerStatus.put("boardPane21", GamePlayer.HUMAN.getPlayerFlag());
        playerStatus.put("boardPane22", GamePlayer.HUMAN.getPlayerFlag());
        playerStatus.put("boardPane23", GamePlayer.HUMAN.getPlayerFlag());
        playerStatus.put("boardPane24", GamePlayer.HUMAN.getPlayerFlag());
        playerStatus.put("boardPane25", GamePlayer.HUMAN.getPlayerFlag());
        playerStatus.put("boardPane26", GamePlayer.HUMAN.getPlayerFlag());
        playerStatus.put("boardPane27", GamePlayer.HUMAN.getPlayerFlag());
        playerStatus.put("boardPane28", GamePlayer.HUMAN.getPlayerFlag());
        playerStatus.put("boardPane29", GamePlayer.HUMAN.getPlayerFlag());
        playerStatus.put("boardPane30", GamePlayer.HUMAN.getPlayerFlag());
        playerStatus.put("boardPane31", GamePlayer.HUMAN.getPlayerFlag());
        playerStatus.put("boardPane32", GamePlayer.HUMAN.getPlayerFlag());
    }

    @Override
    public List<String> getHumanNeighbours(String panelName) {
        if (getPlayerStatus(panelName).equals(GamePlayer.HUMANKING.getPlayerFlag())) {
            return humanKings.get(panelName);
        } else {
            return mapHumanNeighbours.get(panelName);
        }
    }

    @Override
    public List<String> getComputerNeighbours(String panelName) {
        return mapComputerNeighbours.get(panelName);
    }

    @Override
    public void createHumanNeighbours() {
        mapHumanNeighbours = new HashMap<>();
        mapHumanNeighbours.put("boardPane5", Arrays.asList(HumanNeighbourHandler.boardPane5));
        mapHumanNeighbours.put("boardPane6", Arrays.asList(HumanNeighbourHandler.boardPane6));
        mapHumanNeighbours.put("boardPane7", Arrays.asList(HumanNeighbourHandler.boardPane7));
        mapHumanNeighbours.put("boardPane8", Arrays.asList(HumanNeighbourHandler.boardPane8));
        mapHumanNeighbours.put("boardPane9", Arrays.asList(HumanNeighbourHandler.boardPane9));
        mapHumanNeighbours.put("boardPane10", Arrays.asList(HumanNeighbourHandler.boardPane10));
        mapHumanNeighbours.put("boardPane11", Arrays.asList(HumanNeighbourHandler.boardPane11));
        mapHumanNeighbours.put("boardPane12", Arrays.asList(HumanNeighbourHandler.boardPane12));
        mapHumanNeighbours.put("boardPane13", Arrays.asList(HumanNeighbourHandler.boardPane13));
        mapHumanNeighbours.put("boardPane14", Arrays.asList(HumanNeighbourHandler.boardPane14));
        mapHumanNeighbours.put("boardPane15", Arrays.asList(HumanNeighbourHandler.boardPane15));
        mapHumanNeighbours.put("boardPane16", Arrays.asList(HumanNeighbourHandler.boardPane16));
        mapHumanNeighbours.put("boardPane17", Arrays.asList(HumanNeighbourHandler.boardPane17));
        mapHumanNeighbours.put("boardPane18", Arrays.asList(HumanNeighbourHandler.boardPane18));
        mapHumanNeighbours.put("boardPane19", Arrays.asList(HumanNeighbourHandler.boardPane19));
        mapHumanNeighbours.put("boardPane20", Arrays.asList(HumanNeighbourHandler.boardPane20));
        mapHumanNeighbours.put("boardPane21", Arrays.asList(HumanNeighbourHandler.boardPane21));
        mapHumanNeighbours.put("boardPane22", Arrays.asList(HumanNeighbourHandler.boardPane22));
        mapHumanNeighbours.put("boardPane23", Arrays.asList(HumanNeighbourHandler.boardPane23));
        mapHumanNeighbours.put("boardPane24", Arrays.asList(HumanNeighbourHandler.boardPane24));
        mapHumanNeighbours.put("boardPane25", Arrays.asList(HumanNeighbourHandler.boardPane25));
        mapHumanNeighbours.put("boardPane26", Arrays.asList(HumanNeighbourHandler.boardPane26));
        mapHumanNeighbours.put("boardPane27", Arrays.asList(HumanNeighbourHandler.boardPane27));
        mapHumanNeighbours.put("boardPane28", Arrays.asList(HumanNeighbourHandler.boardPane28));
        mapHumanNeighbours.put("boardPane29", Arrays.asList(HumanNeighbourHandler.boardPane29));
        mapHumanNeighbours.put("boardPane30", Arrays.asList(HumanNeighbourHandler.boardPane30));
        mapHumanNeighbours.put("boardPane31", Arrays.asList(HumanNeighbourHandler.boardPane31));
        mapHumanNeighbours.put("boardPane32", Arrays.asList(HumanNeighbourHandler.boardPane32));
    }

    @Override
    public void createComputerNeighbours() {
        mapComputerNeighbours = new HashMap<>();
        mapComputerNeighbours.put("boardPane1", Arrays.asList(ComputerNeighbourHandler.boardPane1));
        mapComputerNeighbours.put("boardPane2", Arrays.asList(ComputerNeighbourHandler.boardPane2));
        mapComputerNeighbours.put("boardPane3", Arrays.asList(ComputerNeighbourHandler.boardPane3));
        mapComputerNeighbours.put("boardPane4", Arrays.asList(ComputerNeighbourHandler.boardPane4));
        mapComputerNeighbours.put("boardPane5", Arrays.asList(ComputerNeighbourHandler.boardPane5));
        mapComputerNeighbours.put("boardPane6", Arrays.asList(ComputerNeighbourHandler.boardPane6));
        mapComputerNeighbours.put("boardPane7", Arrays.asList(ComputerNeighbourHandler.boardPane7));
        mapComputerNeighbours.put("boardPane8", Arrays.asList(ComputerNeighbourHandler.boardPane8));
        mapComputerNeighbours.put("boardPane9", Arrays.asList(ComputerNeighbourHandler.boardPane9));
        mapComputerNeighbours.put("boardPane10", Arrays.asList(ComputerNeighbourHandler.boardPane10));
        mapComputerNeighbours.put("boardPane11", Arrays.asList(ComputerNeighbourHandler.boardPane11));
        mapComputerNeighbours.put("boardPane12", Arrays.asList(ComputerNeighbourHandler.boardPane12));
        mapComputerNeighbours.put("boardPane13", Arrays.asList(ComputerNeighbourHandler.boardPane13));
        mapComputerNeighbours.put("boardPane14", Arrays.asList(ComputerNeighbourHandler.boardPane14));
        mapComputerNeighbours.put("boardPane15", Arrays.asList(ComputerNeighbourHandler.boardPane15));
        mapComputerNeighbours.put("boardPane16", Arrays.asList(ComputerNeighbourHandler.boardPane16));
        mapComputerNeighbours.put("boardPane17", Arrays.asList(ComputerNeighbourHandler.boardPane17));
        mapComputerNeighbours.put("boardPane18", Arrays.asList(ComputerNeighbourHandler.boardPane18));
        mapComputerNeighbours.put("boardPane19", Arrays.asList(ComputerNeighbourHandler.boardPane19));
        mapComputerNeighbours.put("boardPane20", Arrays.asList(ComputerNeighbourHandler.boardPane20));
        mapComputerNeighbours.put("boardPane21", Arrays.asList(ComputerNeighbourHandler.boardPane21));
        mapComputerNeighbours.put("boardPane22", Arrays.asList(ComputerNeighbourHandler.boardPane22));
        mapComputerNeighbours.put("boardPane23", Arrays.asList(ComputerNeighbourHandler.boardPane23));
        mapComputerNeighbours.put("boardPane24", Arrays.asList(ComputerNeighbourHandler.boardPane24));
        mapComputerNeighbours.put("boardPane25", Arrays.asList(ComputerNeighbourHandler.boardPane25));
        mapComputerNeighbours.put("boardPane26", Arrays.asList(ComputerNeighbourHandler.boardPane26));
        mapComputerNeighbours.put("boardPane27", Arrays.asList(ComputerNeighbourHandler.boardPane27));
        mapComputerNeighbours.put("boardPane28", Arrays.asList(ComputerNeighbourHandler.boardPane28));
    }

    @Override
    public void resetHumanPanelStatus(String boardPane) {
        getHumanNeighbours(boardPane).forEach((neighbours) -> {
            if (getPanelStatus(neighbours).equals(PanelFlag.EMPTY.getPaneStaus())) {
                updatePanelStatus(boardPane, PanelFlag.MOVE.getPaneStaus());
            }
        });
    }

    @Override
    public List<String> allHumanPlayersMovePane() {
        List<String> humanPane = new ArrayList<>();
        humanPane.add("boardPane32");
        humanPane.add("boardPane31");
        humanPane.add("boardPane30");
        humanPane.add("boardPane29");
        humanPane.add("boardPane28");
        humanPane.add("boardPane27");
        humanPane.add("boardPane26");
        humanPane.add("boardPane25");
        humanPane.add("boardPane24");
        humanPane.add("boardPane23");
        humanPane.add("boardPane22");
        humanPane.add("boardPane21");
        humanPane.add("boardPane20");
        humanPane.add("boardPane19");
        humanPane.add("boardPane18");
        humanPane.add("boardPane17");
        humanPane.add("boardPane16");
        humanPane.add("boardPane15");
        humanPane.add("boardPane14");
        humanPane.add("boardPane13");
        humanPane.add("boardPane12");
        humanPane.add("boardPane11");
        humanPane.add("boardPane10");
        humanPane.add("boardPane9");
        humanPane.add("boardPane8");
        humanPane.add("boardPane7");
        humanPane.add("boardPane6");
        humanPane.add("boardPane5");
        return humanPane;
    }

    @Override
    public List<String> allComputerPlayersMovePane() {
        List<String> computerPane = new ArrayList<>();
        computerPane.add("boardPane1");
        computerPane.add("boardPane2");
        computerPane.add("boardPane3");
        computerPane.add("boardPane4");
        computerPane.add("boardPane5");
        computerPane.add("boardPane6");
        computerPane.add("boardPane7");
        computerPane.add("boardPane8");
        computerPane.add("boardPane9");
        computerPane.add("boardPane10");
        computerPane.add("boardPane11");
        computerPane.add("boardPane12");
        computerPane.add("boardPane13");
        computerPane.add("boardPane14");
        computerPane.add("boardPane15");
        computerPane.add("boardPane16");
        computerPane.add("boardPane17");
        computerPane.add("boardPane18");
        computerPane.add("boardPane19");
        computerPane.add("boardPane20");
        computerPane.add("boardPane21");
        computerPane.add("boardPane22");
        computerPane.add("boardPane23");
        computerPane.add("boardPane24");
        computerPane.add("boardPane25");
        computerPane.add("boardPane26");
        computerPane.add("boardPane27");
        computerPane.add("boardPane28");
        return computerPane;
    }

    /**
     * Human Player getScoreNode: minimax reflection method It allows selected
     * node and target node of the computer player to be passed and then list
     * depth nodes of the selected node,checks if listed node is empty then
     * lists depth node of the empty node, and finally checks if listed node is
     * equal to target node,then return value
     *
     * @param clickedNode : selected node
     * @param neighbourNode : target node
     * @return : return depth node of the clicked node
     */
    @Override
    public String getScoreNode(String clickedNode, String neighbourNode) {
        String scoreNode = "";
        outerloop:
        for (String depthNodes : returnNodeDepth(clickedNode, getPlayerStatus(clickedNode))) {
            if (getPanelStatus(depthNodes).equals(PanelFlag.EMPTY.getPaneStaus())) {
                for (String neighbourCheck : getKingDepthNeighbours(clickedNode, depthNodes)) {
                    if (neighbourCheck.equals(neighbourNode)) {
                        scoreNode = depthNodes;
                        break outerloop;
                    }
                }
            }
        }
        return scoreNode;
    }

    @Override
    public void createHumanKings() {
        humanKings = new HashMap<>();
        humanKings.put("boardPane1", Arrays.asList(HumanKing.boardPane1));
        humanKings.put("boardPane2", Arrays.asList(HumanKing.boardPane2));
        humanKings.put("boardPane3", Arrays.asList(HumanKing.boardPane3));
        humanKings.put("boardPane4", Arrays.asList(HumanKing.boardPane4));
        humanKings.put("boardPane5", Arrays.asList(HumanKing.boardPane5));
        humanKings.put("boardPane6", Arrays.asList(HumanKing.boardPane6));
        humanKings.put("boardPane7", Arrays.asList(HumanKing.boardPane7));
        humanKings.put("boardPane8", Arrays.asList(HumanKing.boardPane8));
        humanKings.put("boardPane9", Arrays.asList(HumanKing.boardPane9));
        humanKings.put("boardPane10", Arrays.asList(HumanKing.boardPane10));
        humanKings.put("boardPane11", Arrays.asList(HumanKing.boardPane11));
        humanKings.put("boardPane12", Arrays.asList(HumanKing.boardPane12));
        humanKings.put("boardPane13", Arrays.asList(HumanKing.boardPane13));
        humanKings.put("boardPane14", Arrays.asList(HumanKing.boardPane14));
        humanKings.put("boardPane15", Arrays.asList(HumanKing.boardPane15));
        humanKings.put("boardPane16", Arrays.asList(HumanKing.boardPane16));
        humanKings.put("boardPane17", Arrays.asList(HumanKing.boardPane17));
        humanKings.put("boardPane18", Arrays.asList(HumanKing.boardPane18));
        humanKings.put("boardPane19", Arrays.asList(HumanKing.boardPane19));
        humanKings.put("boardPane20", Arrays.asList(HumanKing.boardPane20));
        humanKings.put("boardPane21", Arrays.asList(HumanKing.boardPane21));
        humanKings.put("boardPane22", Arrays.asList(HumanKing.boardPane22));
        humanKings.put("boardPane23", Arrays.asList(HumanKing.boardPane23));
        humanKings.put("boardPane24", Arrays.asList(HumanKing.boardPane24));
        humanKings.put("boardPane25", Arrays.asList(HumanKing.boardPane25));
        humanKings.put("boardPane26", Arrays.asList(HumanKing.boardPane26));
        humanKings.put("boardPane27", Arrays.asList(HumanKing.boardPane27));
        humanKings.put("boardPane28", Arrays.asList(HumanKing.boardPane28));
        humanKings.put("boardPane29", Arrays.asList(HumanKing.boardPane29));
        humanKings.put("boardPane30", Arrays.asList(HumanKing.boardPane30));
        humanKings.put("boardPane31", Arrays.asList(HumanKing.boardPane31));
        humanKings.put("boardPane32", Arrays.asList(HumanKing.boardPane32));

    }

    @Override
    public void createComputerKings() {
        computerKings = new HashMap<>();
        computerKings.put("boardPane1", Arrays.asList(ComputerKing.boardPane1));
        computerKings.put("boardPane2", Arrays.asList(ComputerKing.boardPane2));
        computerKings.put("boardPane3", Arrays.asList(ComputerKing.boardPane3));
        computerKings.put("boardPane4", Arrays.asList(ComputerKing.boardPane4));
        computerKings.put("boardPane5", Arrays.asList(ComputerKing.boardPane5));
        computerKings.put("boardPane7", Arrays.asList(ComputerKing.boardPane7));
        computerKings.put("boardPane8", Arrays.asList(ComputerKing.boardPane8));
        computerKings.put("boardPane9", Arrays.asList(ComputerKing.boardPane9));
        computerKings.put("boardPane10", Arrays.asList(ComputerKing.boardPane10));
        computerKings.put("boardPane11", Arrays.asList(ComputerKing.boardPane11));
        computerKings.put("boardPane12", Arrays.asList(ComputerKing.boardPane12));
        computerKings.put("boardPane13", Arrays.asList(ComputerKing.boardPane13));
        computerKings.put("boardPane14", Arrays.asList(ComputerKing.boardPane14));
        computerKings.put("boardPane15", Arrays.asList(ComputerKing.boardPane15));
        computerKings.put("boardPane16", Arrays.asList(ComputerKing.boardPane16));
        computerKings.put("boardPane17", Arrays.asList(ComputerKing.boardPane17));
        computerKings.put("boardPane18", Arrays.asList(ComputerKing.boardPane18));
        computerKings.put("boardPane19", Arrays.asList(ComputerKing.boardPane19));
        computerKings.put("boardPane20", Arrays.asList(ComputerKing.boardPane20));
        computerKings.put("boardPane21", Arrays.asList(ComputerKing.boardPane21));
        computerKings.put("boardPane22", Arrays.asList(ComputerKing.boardPane22));
        computerKings.put("boardPane23", Arrays.asList(ComputerKing.boardPane23));
        computerKings.put("boardPane24", Arrays.asList(ComputerKing.boardPane24));
        computerKings.put("boardPane25", Arrays.asList(ComputerKing.boardPane25));
        computerKings.put("boardPane26", Arrays.asList(ComputerKing.boardPane26));
        computerKings.put("boardPane27", Arrays.asList(ComputerKing.boardPane27));
        computerKings.put("boardPane28", Arrays.asList(ComputerKing.boardPane28));
        computerKings.put("boardPane29", Arrays.asList(ComputerKing.boardPane29));
        computerKings.put("boardPane30", Arrays.asList(ComputerKing.boardPane30));
        computerKings.put("boardPane31", Arrays.asList(ComputerKing.boardPane31));
        computerKings.put("boardPane32", Arrays.asList(ComputerKing.boardPane32));
    }

    @Override
    public List<String> getHumanKings(String panelName) {
        return humanKings.get(panelName);
    }

    @Override
    public List<String> getComputerKings(String panelName) {
        return computerKings.get(panelName);
    }

    @Override
    public List<String> getKingDepthNeighbours(String clickedNode, String depthNode) {
        Integer clickedNodeValue = Integer.parseInt(clickedNode.replaceAll("boardPane", ""));
        Integer depthNodeValue = Integer.parseInt(depthNode.replaceAll("boardPane", ""));
        if (getPlayerStatus(clickedNode).equals(GamePlayer.HUMANKING.getPlayerFlag())) {
            if (clickedNodeValue > depthNodeValue) {
                return getComputerNeighbours(depthNode);
            } else {
                return getHumanNeighbours(depthNode);
            }
        } else {
            return getComputerNeighbours(depthNode);
        }
    }

    @Override
    public List<String> getKingComputerDepthNeighbours(String clickedNode, String depthNode) {
        Integer clickedNodeValue = Integer.parseInt(clickedNode.replaceAll("boardPane", ""));
        Integer depthNodeValue = Integer.parseInt(depthNode.replaceAll("boardPane", ""));
        if (getPlayerStatus(clickedNode).equals(GamePlayer.COMPUTERKING.getPlayerFlag())) {
            if (clickedNodeValue > depthNodeValue) {
                return getHumanNeighbours(depthNode);
            } else {
                return getComputerNeighbours(depthNode);
            }
        } else {
            return getHumanNeighbours(depthNode);
        }
    }

    /**
     * getComputerScoreNode :Checks nodes with red or human player, Gets red or
     * human neighbors which are empty and depth node to board pane node
     * @return : returns array list of the three target execute nodes
     */
    @Override
    public List<String> getComputerScoreNode() {
        List<String> computeNodeMove = new ArrayList<>();
        computeNodeMove.clear();
        outerloop:
        for (String allMovable : allComputerPlayersMovePane()) {
            for (String topNeighours : getComputerNeighbours(allMovable)) {
                if (getPlayerStatus(topNeighours).equals(GamePlayer.HUMAN.getPlayerFlag())) {
                    if (!checkLoopForComputer(allMovable, topNeighours).isEmpty()) {
                        computeNodeMove = checkLoopForComputer(allMovable, topNeighours);
                        break outerloop;
                    }
                }
            }

        }
        return computeNodeMove;
    }
    /**
     * heckLoopForComputer: checks empty neighbors and return three target nodes
     * allMovable - board pane node
     * topNeighours - board pane neighbour
     * lowerNeighours - target node
     * @param allMovable : target node
     * @param topNeighours : human or red node 
     * @return : returns array list of the three target execute nodes
     */
    private List<String> checkLoopForComputer(String allMovable, String topNeighours) {
        List<String> computeNodeMove = new ArrayList<>();
        computeNodeMove.clear();
        for (String lowerNeighours : getComputerNeighbours(topNeighours)) {
            if (getPanelStatus(lowerNeighours).equals(PanelFlag.EMPTY.getPaneStaus()) && checkIfNodeIsDepthToBoardPane(allMovable, lowerNeighours)) {
                computeNodeMove.add(0, allMovable);
                computeNodeMove.add(1, topNeighours);
                computeNodeMove.add(2, lowerNeighours);
                break;
            }
        }
        return computeNodeMove;
    }

    @Override
    public boolean checkIfNodeIsDepthToBoardPane(String boardPane, String depthNode
    ) {
        boolean result = false;
        for (String listDepthNodes : returnComputerNodeDepth(boardPane, getPanelStatus(boardPane))) {
            if (listDepthNodes.equals(depthNode)) {
                result = true;
                break;
            }
        }
        return result;
    }
}
