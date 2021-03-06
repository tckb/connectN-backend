/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tckb.c4.model.concrete;

import com.tckb.c4.model.exception.GameException.IllegalMoveException;
import com.tckb.c4.model.intf.AbstractPlayer;
import com.tckb.c4.model.intf.Board;

/**
 * A concrete implementation of Human Player.
 * <p>
 * @author tckb
 */
public class HumanPlayer extends AbstractPlayer {

    public HumanPlayer(String reference, BoardChip chip) {
        super(reference, chip);
    }

    @Override
    public String placeChipOnBoard(Board gameBoard) {
        throw new IllegalMoveException();
    }

    @Override
    public String placeChipOnBoard(Board gameBoard, int column) {
        return gameBoard.placeChipOnBoard(super.reference, column);
    }

}
