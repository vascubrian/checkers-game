/**
 * https://www.freelancer.com/u/vascubrian
 * Created on: 04-APR-2020
 * Created by: Brian Twijukye
 * Edited by:
 */
package com.checkers.open.styles;

import com.checkers.open.App;
import com.checkers.open.boardfunction.PanelFunction;
import com.checkers.open.enumeration.GameLevel;
import com.checkers.open.enumeration.GamePlayer;
import com.checkers.open.enumeration.PanelFlag;
import com.checkers.open.events.handler.OtherHomeComponents;
import com.checkers.open.model.Singleton;
import com.checkers.open.utils.BoardHandling;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;

public class enableBorderPaneHandler implements BorderPaneHandler, EventHandler<MouseEvent> {

    private final BorderPane passBoardPane;

    private final String parentBorderPane;

    private final PanelFunction panelFunction;

    public enableBorderPaneHandler(BorderPane passBoardPane, String parentBorderPane, PanelFunction panelFunction) {
        this.passBoardPane = passBoardPane;
        this.parentBorderPane = parentBorderPane;
        this.panelFunction = panelFunction;
    }

    @Override
    public void handle(MouseEvent t) {
        if (t.getSource() == passBoardPane) {
            if (panelFunction.getPanelStatus(passBoardPane.getId()).equals(PanelFlag.EMPTY.getPaneStaus())) {

                Scene scene = App.scene;
                BorderPane nodeToFind = (BorderPane) scene.lookup("#" + parentBorderPane + "");
                nodeToFind.setCenter(null);
                // reset human player css
                interceptMovePlayerStatus(parentBorderPane, passBoardPane);

                executeHumanNodeMove(parentBorderPane, passBoardPane.getId());
                // clear move
                moveUtils(passBoardPane.getId());
            } else if (panelFunction.getPanelStatus(passBoardPane.getId()).equals(PanelFlag.MOVE.getPaneStaus())) {
                panelFunction.getHumanNeighbours(passBoardPane.getId()).forEach((neighbours) -> {
                    String checkStartCore = panelFunction.getScoreNode(passBoardPane.getId(), neighbours);;
                    if (panelFunction.getPanelStatus(neighbours).equals(PanelFlag.LOCKED.getPaneStaus()) && panelFunction.getPlayerStatus(neighbours).equals(GamePlayer.COMPUTER.getPlayerFlag()) && !"".equals(checkStartCore)) {
                        enableHighlightedNodes(checkStartCore, passBoardPane.getId());
                        // set score flag
                        Singleton.getInstance().setFlagNode(neighbours);
                        Singleton.getInstance().setScoreFlag(checkStartCore);

                    } else {
                        if (panelFunction.getPanelStatus(neighbours).equals(PanelFlag.EMPTY.getPaneStaus())) {
                            enableHighlightedNodes(neighbours, passBoardPane.getId());
                        }
                    }
                });

            } else {

                panelFunction.getHumanNeighbours(passBoardPane.getId()).forEach((neighbours) -> {
                    String checkStartCore = panelFunction.getScoreNode(passBoardPane.getId(), neighbours);
                    if (panelFunction.getPanelStatus(neighbours).equals(PanelFlag.LOCKED.getPaneStaus()) && panelFunction.getPlayerStatus(neighbours).equals(GamePlayer.COMPUTER.getPlayerFlag()) && !"".equals(checkStartCore)) {
                        enableHighlightedNodes(checkStartCore, passBoardPane.getId());
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

        // move computer node
        createComputerMove(passBoardPane);

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
        if (panelFunction.getPlayerStatus(boardPane).equals(GamePlayer.HUMANKING.getPlayerFlag())) {
            for (String displayboardPane : panelFunction.getHumanNeighbours(boardPane)) {
                if (panelFunction.getPanelStatus(displayboardPane).equals(PanelFlag.EMPTY.getPaneStaus())) {
                    panelFunction.updatePanelStatus(boardPane, PanelFlag.MOVE.getPaneStaus());
                    break;
                }
            }
        }

    }

    /**
     * createComputerMove :it get depth node of computer check node whether it's
     * computer player and movable, if it finds one and breaks the loop Finally
     * call execute move class
     *
     * @param passBoardPane
     */
    @Override
    public void createComputerMove(String passBoardPane) {
        if (isNodeNotEmpty(passBoardPane)) {
            for (String displayBoardPane : panelFunction.returnNodeDepth(passBoardPane, panelFunction.getPlayerStatus(passBoardPane))) {
                if (panelFunction.getPlayerStatus(displayBoardPane).equals(GamePlayer.COMPUTER.getPlayerFlag())) {
                    if (isNodeHasEmptyDepth(displayBoardPane)) {
                        executeComputerMove(displayBoardPane);
                        break;
                    }
                }
            }
        } else {
            for (String movablePanel : panelFunction.allComputerPlayersMovePane()) {
                if (isNodeHasEmptyDepth(movablePanel)) {
                    if (panelFunction.getPlayerStatus(movablePanel).equals(GamePlayer.COMPUTER.getPlayerFlag())) {
                        randomComputerMove(movablePanel);
                        break;
                    }
                }
            }
        }
    }

    @Override
    public void randomComputerMove(String boardPane) {
        // move any computer node
        if (Singleton.getInstance().getGameLevel().equals(GameLevel.TWOPLAYERS.getGameLevel())) {
            List<String> computeNodeMove = panelFunction.getComputerScoreNode();
            if (!computeNodeMove.isEmpty()) {
                // reset selected boardpane
                Scene scene = App.scene;
                BorderPane selectedBorderPane = (BorderPane) scene.lookup("#" + computeNodeMove.get(2) + "");
                stylePanePlayer(selectedBorderPane, "ComputerPlay");

                panelFunction.updatePanelStatus(computeNodeMove.get(2), PanelFlag.LOCKED.getPaneStaus());
                panelFunction.updatePlayerStatus(computeNodeMove.get(2), GamePlayer.COMPUTER.getPlayerFlag());

                Integer scorePoints = (Integer.parseInt(OtherHomeComponents.passRedScore.getText()) - 1);
                successMessageForWonGame(scorePoints, "Too bad for you!", "Sorry you have lost the game, try again!!");

                OtherHomeComponents.passRedScore.setText(scorePoints.toString());
                //clear swollowed node
                BorderPane swollowedNode = (BorderPane) scene.lookup("#" + computeNodeMove.get(1) + "");
                swollowedNode.setCenter(null);
                panelFunction.updatePanelStatus(swollowedNode.getId(), PanelFlag.EMPTY.getPaneStaus());
                panelFunction.updatePlayerStatus(swollowedNode.getId(), GamePlayer.FREE.getPlayerFlag());
                // reset parent pane
                BorderPane borderPane = (BorderPane) scene.lookup("#" + computeNodeMove.get(0) + "");
                panelFunction.updatePanelStatus(borderPane.getId(), PanelFlag.EMPTY.getPaneStaus());
                panelFunction.updatePlayerStatus(borderPane.getId(), GamePlayer.FREE.getPlayerFlag());
                borderPane.setCenter(null);
            } else {
                startAutoComputerMove(boardPane);
            }
        } else {
            startAutoComputerMove(boardPane);
        }
    }

    @Override
    public void executeComputerMove(String boardPane) {
        for (String neighbours : panelFunction.getComputerNeighbours(boardPane)) {
            if (panelFunction.getPanelStatus(neighbours).equals(PanelFlag.EMPTY.getPaneStaus())) {
                enableComputeMove(neighbours, boardPane);
                break;
            }
        }
    }

    private void enableComputeMove(String targetPane, String parentPane) {
        // reset selected boardpane
        Scene scene = App.scene;
        BorderPane selectedBorderPane = (BorderPane) scene.lookup("#" + targetPane + "");
        stylePanePlayer(selectedBorderPane, "ComputerPlay");

        panelFunction.updatePanelStatus(targetPane, PanelFlag.LOCKED.getPaneStaus());
        panelFunction.updatePlayerStatus(targetPane, GamePlayer.COMPUTER.getPlayerFlag());
        // reset parent pane
        BorderPane borderPane = (BorderPane) scene.lookup("#" + parentPane + "");
        panelFunction.updatePanelStatus(borderPane.getId(), PanelFlag.EMPTY.getPaneStaus());
        panelFunction.updatePlayerStatus(borderPane.getId(), GamePlayer.FREE.getPlayerFlag());
        borderPane.setCenter(null);
    }

    @Override
    public boolean isNodeNotEmpty(String node) {
        boolean result = false;
        for (String movablePanel : panelFunction.returnNodeDepth(node, panelFunction.getPlayerStatus(node))) {
            if (panelFunction.getPlayerStatus(movablePanel).equals(GamePlayer.COMPUTER.getPlayerFlag())) {
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

            Integer scorePoints = (Integer.parseInt(OtherHomeComponents.passBlueScore.getText()) - 1);
            successMessageForWonGame(scorePoints, "Congratulations!", "You have won the game !!, try again");

            OtherHomeComponents.passBlueScore.setText(scorePoints.toString());
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
        if (panelFunction.getPlayerStatus(parentPane).equals(GamePlayer.HUMANKING.getPlayerFlag()) || borderPane.getId().equals("boardPane1") || borderPane.getId().equals("boardPane2") || borderPane.getId().equals("boardPane3") || borderPane.getId().equals("boardPane4")) {
            stylePanePlayer(passBoardPane, "HumanKing");
            panelFunction.updatePlayerStatus(borderPane.getId(), GamePlayer.HUMANKING.getPlayerFlag());
        } else {
            stylePanePlayer(passBoardPane, "HumanPlayer");
            panelFunction.updatePlayerStatus(borderPane.getId(), GamePlayer.HUMAN.getPlayerFlag());
        }
    }

    private void enableHighlightedNodes(String specifiedNode, String passBoardPane) {
        Scene scene = App.scene;
        BorderPane nodeToFind = (BorderPane) scene.lookup("#" + specifiedNode + "");
        new enableBorderPaneHandler(nodeToFind, passBoardPane, panelFunction).createBorderPane();
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

    private void startAutoComputerMove(String boardPane) {
        for (String movablePanel : panelFunction.getComputerNeighbours(boardPane)) {
            if (panelFunction.getPanelStatus(movablePanel).equals(PanelFlag.EMPTY.getPaneStaus())) {
                enableComputeMove(movablePanel, boardPane);
                break;
            }
        }
    }
}
