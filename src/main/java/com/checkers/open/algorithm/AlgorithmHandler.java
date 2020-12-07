/**
 * Copyright 2020 Me u SoftwarePlus (meusoftwareplus.com)
 * Created on: 04-APR-2020
 * Created by: Brian Twijukye
 * Edited by:
 */
package com.checkers.open.algorithm;

public interface AlgorithmHandler {

    void checkerMove(String boardPane);

    void startScoreJourney(String parentBoardPane);

    void styleRedirectHandler(String parentBoardPane, String neighbourboardPane);
}
