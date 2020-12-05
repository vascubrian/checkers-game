/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.checkers.open.algorithm;

public interface AlgorithmHandler {

    void checkerMove(String boardPane);

    void startScoreJourney(String parentBoardPane);

    void styleRedirectHandler(String parentBoardPane, String neighbourboardPane);
}
