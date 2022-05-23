package com.tfl.composition.domain.usecases

import com.tfl.composition.domain.entity.GameSettings
import com.tfl.composition.domain.entity.Level
import com.tfl.composition.domain.repository.GameRepository

class GetGameSettingsUseCase(private val repository: GameRepository) {

    operator fun invoke(level: Level): GameSettings {
        return repository.getGameSettings(level)
    }
}