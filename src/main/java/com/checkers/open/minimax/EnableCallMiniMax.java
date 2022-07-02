/**
 * https://www.freelancer.com/u/vascubrian
 * Created on: 04-APR-2020
 * Created by: Brian Twijukye
 * Edited by:
 */
package com.checkers.open.minimax;

import com.checkers.open.enumeration.GamePlayer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class EnableCallMiniMax implements CallMiniMax {

    HashMap<String, List<String>> nodeDepth;

    HashMap<String, List<String>> KingnodeDepth;

    HashMap<String, List<String>> computerDepth;

    @Override
    public void organiseNodeDepth() {
        nodeDepth = new HashMap<>();
        nodeDepth.put("boardPane32", Arrays.asList(boardPane32));
        nodeDepth.put("boardPane31", Arrays.asList(boardPane31));
        nodeDepth.put("boardPane30", Arrays.asList(boardPane30));
        nodeDepth.put("boardPane29", Arrays.asList(boardPane29));
        nodeDepth.put("boardPane28", Arrays.asList(boardPane28));
        nodeDepth.put("boardPane27", Arrays.asList(boardPane27));
        nodeDepth.put("boardPane26", Arrays.asList(boardPane26));
        nodeDepth.put("boardPane25", Arrays.asList(boardPane25));
        nodeDepth.put("boardPane24", Arrays.asList(boardPane24));
        nodeDepth.put("boardPane23", Arrays.asList(boardPane23));
        nodeDepth.put("boardPane22", Arrays.asList(boardPane22));
        nodeDepth.put("boardPane21", Arrays.asList(boardPane21));
        nodeDepth.put("boardPane20", Arrays.asList(boardPane20));
        nodeDepth.put("boardPane19", Arrays.asList(boardPane19));
        nodeDepth.put("boardPane18", Arrays.asList(boardPane18));
        nodeDepth.put("boardPane17", Arrays.asList(boardPane17));
        nodeDepth.put("boardPane16", Arrays.asList(boardPane16));
        nodeDepth.put("boardPane15", Arrays.asList(boardPane15));
        nodeDepth.put("boardPane14", Arrays.asList(boardPane14));
        nodeDepth.put("boardPane13", Arrays.asList(boardPane13));
        nodeDepth.put("boardPane12", Arrays.asList(boardPane12));
        nodeDepth.put("boardPane11", Arrays.asList(boardPane11));
        nodeDepth.put("boardPane10", Arrays.asList(boardPane10));
        nodeDepth.put("boardPane9", Arrays.asList(boardPane9));
        nodeDepth.put("boardPane8", Arrays.asList(boardPane8));
        nodeDepth.put("boardPane7", Arrays.asList(boardPane7));
        nodeDepth.put("boardPane6", Arrays.asList(boardPane6));
        nodeDepth.put("boardPane5", Arrays.asList(boardPane5));
    }

    @Override
    public void organiseKingNodeDepth() {
        KingnodeDepth = new HashMap<>();
        KingnodeDepth.put("boardPane32", Arrays.asList(kingBoardPane32));
        KingnodeDepth.put("boardPane31", Arrays.asList(kingBoardPane31));
        KingnodeDepth.put("boardPane30", Arrays.asList(kingBoardPane30));
        KingnodeDepth.put("boardPane29", Arrays.asList(kingBoardPane29));
        KingnodeDepth.put("boardPane28", Arrays.asList(kingBoardPane28));
        KingnodeDepth.put("boardPane27", Arrays.asList(kingBoardPane27));
        KingnodeDepth.put("boardPane26", Arrays.asList(kingBoardPane26));
        KingnodeDepth.put("boardPane25", Arrays.asList(kingBoardPane25));
        KingnodeDepth.put("boardPane24", Arrays.asList(kingBoardPane24));
        KingnodeDepth.put("boardPane23", Arrays.asList(kingBoardPane23));
        KingnodeDepth.put("boardPane22", Arrays.asList(kingBoardPane22));
        KingnodeDepth.put("boardPane21", Arrays.asList(kingBoardPane21));
        KingnodeDepth.put("boardPane20", Arrays.asList(kingBoardPane20));
        KingnodeDepth.put("boardPane19", Arrays.asList(kingBoardPane19));
        KingnodeDepth.put("boardPane18", Arrays.asList(kingBoardPane18));
        KingnodeDepth.put("boardPane17", Arrays.asList(kingBoardPane17));
        KingnodeDepth.put("boardPane16", Arrays.asList(kingBoardPane16));
        KingnodeDepth.put("boardPane15", Arrays.asList(kingBoardPane15));
        KingnodeDepth.put("boardPane14", Arrays.asList(kingBoardPane14));
        KingnodeDepth.put("boardPane13", Arrays.asList(kingBoardPane13));
        KingnodeDepth.put("boardPane12", Arrays.asList(kingBoardPane12));
        KingnodeDepth.put("boardPane11", Arrays.asList(kingBoardPane11));
        KingnodeDepth.put("boardPane10", Arrays.asList(kingBoardPane10));
        KingnodeDepth.put("boardPane9", Arrays.asList(kingBoardPane9));
        KingnodeDepth.put("boardPane8", Arrays.asList(kingBoardPane8));
        KingnodeDepth.put("boardPane7", Arrays.asList(kingBoardPane7));
        KingnodeDepth.put("boardPane6", Arrays.asList(kingBoardPane6));
        KingnodeDepth.put("boardPane5", Arrays.asList(kingBoardPane5));
        KingnodeDepth.put("boardPane4", Arrays.asList(kingBoardPane4));
        KingnodeDepth.put("boardPane3", Arrays.asList(kingBoardPane3));
        KingnodeDepth.put("boardPane2", Arrays.asList(kingBoardPane2));
        KingnodeDepth.put("boardPane1", Arrays.asList(kingBoardPane1));
    }

    @Override
    public List<String> returnNodeDepth(String boardPane, String PlayerFlag) {
        if (PlayerFlag.equals(GamePlayer.HUMANKING.getPlayerFlag())) {
            return KingnodeDepth.get(boardPane);
        } else if (PlayerFlag.equals(GamePlayer.HUMAN_ONE.getPlayerFlag())) {
            return KingnodeDepth.get(boardPane);
        } else if (PlayerFlag.equals(GamePlayer.HUMAN_TWO.getPlayerFlag())) {
            return computerDepth.get(boardPane);
        } else {
            return nodeDepth.get(boardPane);
        }
    }

    @Override
    public List<String> returnComputerNodeDepth(String boardPane, String PlayerFlag) {
        if (PlayerFlag.equals(GamePlayer.COMPUTERKING.getPlayerFlag())) {
            return KingnodeDepth.get(boardPane);
        } else {
            return computerDepth.get(boardPane);
        }
    }

    @Override
    public void organiseComputerNodeDepth() {
        computerDepth = new HashMap<>();
        computerDepth.put("boardPane28", Arrays.asList(compBoardPane28));
        computerDepth.put("boardPane27", Arrays.asList(compBoardPane27));
        computerDepth.put("boardPane26", Arrays.asList(compBoardPane26));
        computerDepth.put("boardPane25", Arrays.asList(compBoardPane25));
        computerDepth.put("boardPane24", Arrays.asList(compBoardPane24));
        computerDepth.put("boardPane23", Arrays.asList(compBoardPane23));
        computerDepth.put("boardPane22", Arrays.asList(compBoardPane22));
        computerDepth.put("boardPane21", Arrays.asList(compBoardPane21));
        computerDepth.put("boardPane20", Arrays.asList(compBoardPane20));
        computerDepth.put("boardPane19", Arrays.asList(compBoardPane19));
        computerDepth.put("boardPane18", Arrays.asList(compBoardPane18));
        computerDepth.put("boardPane17", Arrays.asList(compBoardPane17));
        computerDepth.put("boardPane16", Arrays.asList(compBoardPane16));
        computerDepth.put("boardPane15", Arrays.asList(compBoardPane15));
        computerDepth.put("boardPane14", Arrays.asList(compBoardPane14));
        computerDepth.put("boardPane13", Arrays.asList(compBoardPane13));
        computerDepth.put("boardPane12", Arrays.asList(compBoardPane12));
        computerDepth.put("boardPane11", Arrays.asList(compBoardPane11));
        computerDepth.put("boardPane10", Arrays.asList(compBoardPane10));
        computerDepth.put("boardPane9", Arrays.asList(compBoardPane9));
        computerDepth.put("boardPane8", Arrays.asList(compBoardPane8));
        computerDepth.put("boardPane7", Arrays.asList(compBoardPane7));
        computerDepth.put("boardPane6", Arrays.asList(compBoardPane6));
        computerDepth.put("boardPane5", Arrays.asList(compBoardPane5));
        computerDepth.put("boardPane4", Arrays.asList(compBoardPane4));
        computerDepth.put("boardPane3", Arrays.asList(compBoardPane3));
        computerDepth.put("boardPane2", Arrays.asList(compBoardPane2));
        computerDepth.put("boardPane1", Arrays.asList(compBoardPane1));
    }
}
