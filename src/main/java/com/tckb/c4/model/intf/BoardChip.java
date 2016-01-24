/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tckb.c4.model.intf;

import java.util.Objects;

/**
 *
 * @author tckb
 */
public class BoardChip implements GameObject {

    private final String chipColor;

    public BoardChip(String chipColor) {
        this.chipColor = chipColor;
    }

    public String getChipColor() {
        return chipColor;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof BoardChip) {
            return getChipColor().equals(((BoardChip) obj).getChipColor());

        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 3 * Objects.hashCode(getChipColor());
        return hash;
    }

    public static final String[] CHIP_COLORS = {
        "BLUE",
        "BLACK",
        "GREEN",
        "RED",
        "WHITE",
        "YELLOW"
    };

}
