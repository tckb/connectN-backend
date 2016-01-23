/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tckb.c4.ws;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Range;

/**
 *
 * @author tckb
 */
@JsonInclude(Include.NON_NULL)
public class BoardConfiguration {

    @NotNull(message = "'board_width' can not be null!")
    @JsonProperty(value = "board_width")
    private Integer boardWidth;

    @NotNull(message = "'board_height' can not be null!")
    @JsonProperty(value = "board_height")
    private Integer boardHeight;

    @NotNull(message = "'board_min_con' can not be null!")
    @Range(min = 2, message = "'board_min_con' must be >=2")
    @JsonProperty(value = "board_min_con")
    private Integer winningConnections;

    public Integer getBoardWidth() {
        return boardWidth;
    }

    public void setBoardWidth(Integer boardWidth) {
        this.boardWidth = boardWidth;
    }

    public Integer getBoardHeight() {
        return boardHeight;
    }

    public void setBoardHeight(Integer boardHeight) {
        this.boardHeight = boardHeight;
    }

    public Integer getWinningConnections() {
        return winningConnections;
    }

    public void setWinningConnections(Integer winningConnections) {
        this.winningConnections = winningConnections;
    }

}
