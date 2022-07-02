/**
 * https://www.freelancer.com/u/vascubrian
 * Created on: 04-APR-2020
 * Created by: Brian Twijukye
 * Edited by:
 */
package com.checkers.open.styles;

import com.checkers.open.App;
import com.checkers.open.boardfunction.PanelFunctionHvsH;
import com.checkers.open.enumeration.GamePlayer;
import com.checkers.open.enumeration.PanelFlag;
import com.checkers.open.events.handler.OtherHomeComponents;
import com.checkers.open.model.Singleton;
import com.checkers.open.utils.BoardHandling;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;

public class enableBorderPaneHandlerHvsH implements BorderPaneHandlerHvsH, EventHandler<MouseEvent> {

    private final BorderPane passBoardPane;

    private final String parentBorderPane;

    private final PanelFunctionHvsH panelFunction;

    private List<String> boardNeighbours = null;
    private String scorePlayer = "", checkStartCore = "";

    public enableBorderPaneHandlerHvsH(BorderPane passBoardPane, String parentBorderPane, PanelFunctionHvsH panelFunction) {
        this.passBoardPane = passBoardPane;
        this.parentBorderPane = parentBorderPane;
        this.panelFunction = panelFunction;
    }

    @Override
    public void handle(MouseEvent t) {
        // clickedBorderPane
        String nodeStyle = t.getPickResult().getIntersectedNode().getId();
        // enable oncick components
        boolean enableOnClick = nodeStyle.equals("ComputerPlay") || nodeStyle.equals("HumanPlayer") || nodeStyle.equals("moveTargetPane") || nodeStyle.equals("HumanKing") || nodeStyle.equals("ComputerKing");
        if (t.getSource() == passBoardPane && enableOnClick) {
            // handle two human players , select board panel neighbours
            if (panelFunction.getPlayerStatus(passBoardPane.getId()).equals(GamePlayer.HUMAN_TWO.getPlayerFlag()) || panelFunction.getPlayerStatus(passBoardPane.getId()).equals(GamePlayer.HUMAN_TWO_KING.getPlayerFlag())) {
                boardNeighbours = panelFunction.getComputerNeighbours(passBoardPane.getId());
                scorePlayer = GamePlayer.HUMAN_ONE.getPlayerFlag();
            } else {
                boardNeighbours = panelFunction.getHumanNeighbours(passBoardPane.getId());
                scorePlayer = GamePlayer.HUMAN_TWO.getPlayerFlag();
            }
            // continue to handle select
            if (panelFunction.getPanelStatus(passBoardPane.getId()).equals(PanelFlag.EMPTY.getPaneStaus())) {
                // get scene borderpane
                Scene scene = App.scene;
                BorderPane nodeToFind = (BorderPane) scene.lookup("#" + parentBorderPane + "");
                nodeToFind.setCenter(null);
                // reset human player css
                interceptMovePlayerStatus(parentBorderPane, passBoardPane);
                executeHumanNodeMove(parentBorderPane, passBoardPane.getId());
                // clear move
                moveUtils(passBoardPane.getId());
            } else if (panelFunction.getPanelStatus(passBoardPane.getId()).equals(PanelFlag.MOVE.getPaneStaus())) {
                // board neighbours
                boardNeighbours.forEach((neighbours) -> {
                    // check score node first
                    checkStartCore = panelFunction.getPlayerStatus(neighbours).equals(scorePlayer) ? panelFunction.getScoreNode(passBoardPane.getId(), neighbours, panelFunction.getPlayerStatus(passBoardPane.getId())) : "";
                    if (!"".equals(checkStartCore)) {
                        BoardHandling.enableHighlightedNodes(checkStartCore, passBoardPane.getId(), panelFunction);
                        // set score flag
                        Singleton.getInstance().setFlagNode(neighbours);
                        Singleton.getInstance().setScoreFlag(checkStartCore);
                    } else {
                        if (panelFunction.getPanelStatus(neighbours).equals(PanelFlag.EMPTY.getPaneStaus())) {
                            BoardHandling.enableHighlightedNodes(neighbours, passBoardPane.getId(), panelFunction);
                        }
                    }
                });
            } else {
                boardNeighbours.forEach((neighbours) -> {
                    // check score node first
                    checkStartCore = panelFunction.getPlayerStatus(neighbours).equals(scorePlayer) ? panelFunction.getScoreNode(passBoardPane.getId(), neighbours, panelFunction.getPlayerStatus(passBoardPane.getId())) : "";
                    if (!"".equals(checkStartCore)) {
                        BoardHandling.enableHighlightedNodes(checkStartCore, passBoardPane.getId(), panelFunction);
                        // set score flag
                        Singleton.getInstance().setFlagNode(neighbours);
                        Singleton.getInstance().setScoreFlag(checkStartCore);
                    }
                });
            }
        }
    }

    @Override
    public void createBorderPane() {
        passBoardPane.setOnMouseClicked(this);
        Label indicatorLabel = new Label();
        indicatorLabel.setId("moveTargetPane");
        passBoardPane.setCenter(indicatorLabel);
    }

    @Override
    public void stylePanePlayer(BorderPane borderPane, String styleId) {
        Label indicatorLabel = new Label();
        indicatorLabel.setId(styleId);
        borderPane.setCenter(indicatorLabel);
    }

    @Override
    public List<String> AllBoardPane() {
        List<String> allBoardPanels = new ArrayList<>();
        allBoardPanels.add("boardPane1");
        allBoardPanels.add("boardPane2");
        allBoardPanels.add("boardPane3");
        allBoardPanels.add("boardPane4");
        allBoardPanels.add("boardPane5");
        allBoardPanels.add("boardPane6");
        allBoardPanels.add("boardPane7");
        allBoardPanels.add("boardPane8");
        allBoardPanels.add("boardPane9");
        allBoardPanels.add("boardPane10");
        allBoardPanels.add("boardPane11");
        allBoardPanels.add("boardPane12");
        allBoardPanels.add("boardPane13");
        allBoardPanels.add("boardPane14");
        allBoardPanels.add("boardPane15");
        allBoardPanels.add("boardPane16");
        allBoardPanels.add("boardPane17");
        allBoardPanels.add("boardPane18");
        allBoardPanels.add("boardPane19");
        allBoardPanels.add("boardPane20");
        allBoardPanels.add("boardPane21");
        allBoardPanels.add("boardPane22");
        allBoardPanels.add("boardPane23");
        allBoardPanels.add("boardPane24");
        allBoardPanels.add("boardPane25");
        allBoardPanels.add("boardPane26");
        allBoardPanels.add("boardPane27");
        allBoardPanels.add("boardPane28");
        allBoardPanels.add("boardPane29");
        allBoardPanels.add("boardPane30");
        allBoardPanels.add("boardPane31");
        allBoardPanels.add("boardPane32");
        return allBoardPanels;
    }

    @Override
    public void clearBoardPane() {
        AllBoardPane().forEach((boardPane) -> {
            if (panelFunction.getPanelStatus(boardPane).equals(PanelFlag.EMPTY.getPaneStaus())) {
                Scene scene = App.scene;
                BorderPane nodeToFind = (BorderPane) scene.lookup("#" + boardPane + "");
                nodeToFind.setCenter(null);
            }
        });
    }

    @Override
    public void moveUtils(String passBoardPane) {
        //unlock neighbours;
        unlockHumanNeighbours();
        unlockHumanKingNeighbours(passBoardPane);
        // clearBoardPane
        clearBoardPane();
        // reset score flags
        Singleton.getInstance().setScoreFlag("");
        Singleton.getInstance().setFlagNode("");
    }

    @Override
    public void unlockHumanNeighbours() {
        panelFunction.allHumanPlayersMovePane().forEach((boardPane) -> {
            if (panelFunction.getPanelStatus(boardPane).equals(PanelFlag.LOCKED.getPaneStaus())) {
                panelFunction.resetHumanPanelStatus(boardPane);
            }
        });
    }

    @Override
    public void unlockHumanKingNeighbours(String boardPane) {
        if (panelFunction.getPlayerStatus(boardPane).equals(GamePlayer.HUMAN_ONE_KING.getPlayerFlag())) {
            for (String displayboardPane : panelFunction.getHumanNeighbours(boardPane)) {
                if (panelFunction.getPanelStatus(displayboardPane).equals(PanelFlag.EMPTY.getPaneStaus())) {
                    panelFunction.updatePanelStatus(boardPane, PanelFlag.MOVE.getPaneStaus());
                    break;
                }
            }
        } else if (panelFunction.getPlayerStatus(boardPane).equals(GamePlayer.HUMAN_TWO_KING.getPlayerFlag())) {
            for (String displayboardPane : panelFunction.getComputerNeighbours(boardPane)) {
                if (panelFunction.getPanelStatus(displayboardPane).equals(PanelFlag.EMPTY.getPaneStaus())) {
                    panelFunction.updatePanelStatus(boardPane, PanelFlag.MOVE.getPaneStaus());
                    break;
                }
            }
        }
    }

    @Override
    public boolean isNodeNotEmpty(String node) {
        boolean result = false;
        for (String movablePanel : panelFunction.returnNodeDepth(node, panelFunction.getPlayerStatus(node))) {
            if (panelFunction.getPlayerStatus(movablePanel).equals(GamePlayer.HUMAN_TWO.getPlayerFlag())) {
                if (isNodeHasEmptyDepth(movablePanel)) {
                    result = true;
                    break;
                }
            }
        }
        return result;
    }

    @Override
    public boolean isNodeHasEmptyDepth(String nodeDepth) {
        boolean result = false;
        for (String depthNodes : panelFunction.getComputerNeighbours(nodeDepth)) {
            if (panelFunction.getPanelStatus(depthNodes).equals(PanelFlag.EMPTY.getPaneStaus())) {
                result = true;
                break;
            }
        }
        return result;
    }

    private void executeHumanNodeMove(String parentPane, String clickedPane) {
        if (Singleton.getInstance().getScoreFlag().equals(clickedPane)) {
            Integer scorePoints = 12;
            if (panelFunction.getPlayerStatus(parentPane).equals(GamePlayer.HUMAN_TWO.getPlayerFlag()) || panelFunction.getPlayerStatus(parentPane).equals(GamePlayer.HUMAN_TWO_KING.getPlayerFlag())) {
                scorePoints = (Integer.parseInt(OtherHomeComponents.passRedScore.getText()) - 1);
                OtherHomeComponents.passRedScore.setText(scorePoints.toString());
            } else {
                scorePoints = (Integer.parseInt(OtherHomeComponents.passBlueScore.getText()) - 1);
                OtherHomeComponents.passBlueScore.setText(scorePoints.toString());
            }
            successMessageForWonGame(scorePoints, "Congratulations!", "You have won the game !!, try again");
            //clear swollowed node
            Scene scene = App.scene;
            BorderPane swollowedNode = (BorderPane) scene.lookup("#" + Singleton.getInstance().getFlagNode() + "");
            swollowedNode.setCenter(null);

            panelFunction.updatePanelStatus(swollowedNode.getId(), PanelFlag.EMPTY.getPaneStaus());
            panelFunction.updatePlayerStatus(swollowedNode.getId(), GamePlayer.FREE.getPlayerFlag());

            // reset parent pane
            panelFunction.updatePanelStatus(parentPane, PanelFlag.EMPTY.getPaneStaus());
            panelFunction.updatePlayerStatus(parentPane, GamePlayer.FREE.getPlayerFlag());
            // reset selected boardpane
            panelFunction.updatePanelStatus(clickedPane, PanelFlag.LOCKED.getPaneStaus());
        } else {
            // reset parent pane
            panelFunction.updatePanelStatus(parentPane, PanelFlag.EMPTY.getPaneStaus());
            panelFunction.updatePlayerStatus(parentPane, GamePlayer.FREE.getPlayerFlag());
            // reset selected boardpane
            panelFunction.updatePanelStatus(clickedPane, PanelFlag.LOCKED.getPaneStaus());
        }
    }

    private void interceptMovePlayerStatus(String parentPane, BorderPane borderPane) {
        // check Board Pane for king
        String[] humanKingBoardPane = {"boardPane1", "boardPane2", "boardPane3", "boardPane4"};
        String[] computerKingBoardPane = {"boardPane29", "boardPane30", "boardPane31", "boardPane32"};
        boolean isHumanKingBoardPane = Arrays.stream(humanKingBoardPane).anyMatch(borderPane.getId()::equals);
        boolean isComputerKingBoardPane = Arrays.stream(computerKingBoardPane).anyMatch(borderPane.getId()::equals);
        // check if board status if for king
        if (panelFunction.getPlayerStatus(parentPane).equals(GamePlayer.HUMAN_ONE_KING.getPlayerFlag()) || isHumanKingBoardPane) {
            stylePanePlayer(passBoardPane, "HumanKing");
            panelFunction.updatePlayerStatus(borderPane.getId(), GamePlayer.HUMAN_ONE_KING.getPlayerFlag());
        } else if (panelFunction.getPlayerStatus(parentPane).equals(GamePlayer.HUMAN_TWO_KING.getPlayerFlag()) || isComputerKingBoardPane) {
            stylePanePlayer(passBoardPane, "ComputerKing");
            panelFunction.updatePlayerStatus(borderPane.getId(), GamePlayer.HUMAN_TWO_KING.getPlayerFlag());
        } else {
            // check human player position
            if (panelFunction.getPlayerStatus(parentPane).equals(GamePlayer.HUMAN_TWO.getPlayerFlag())) {
                stylePanePlayer(passBoardPane, "ComputerPlay");
            } else {
                stylePanePlayer(passBoardPane, "HumanPlayer");
            }
            panelFunction.updatePlayerStatus(borderPane.getId(), panelFunction.getPlayerStatus(parentPane));
        }
    }

    private void successMessageForWonGame(Integer checkers, String messageTitle, String message) {
        if (checkers <= 0) {
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle(messageTitle);
            alert.setContentText(message);
            alert.showAndWait();
            //reset panel
            try {
                App.setRoot("views/GameLevels");
            } catch (IOException out) {
                BoardHandling.writeErrors(out.getMessage());
            }
        }
    }
}
