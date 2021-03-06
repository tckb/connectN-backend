/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tckb.c4.ws.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * The repository holding the current boards.
 * <p>
 * @author tckb
 */
@Repository
public interface CurrentBoardGameRepository extends MongoRepository<CurrentBoardGame, String> {

    public CurrentBoardGame findByGameSessionId(String gameSessionId);

}
