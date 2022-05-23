package com.tfl.composition.domain.repository

import com.tfl.composition.domain.entity.GameSettings
import com.tfl.composition.domain.entity.Level
import com.tfl.composition.domain.entity.Question

interface GameRepository {

    fun generateQuestion(maxSumValue: Int, countOfOptions: Int): Question
    fun getGameSettings(level: Level): GameSettings
}