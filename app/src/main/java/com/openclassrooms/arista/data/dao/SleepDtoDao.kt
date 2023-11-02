package com.openclassrooms.arista.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.openclassrooms.arista.data.entity.SleepDto

@Dao
interface SleepDtoDao {
    @Insert
    suspend fun insertSleep(sleep: SleepDto): Long

    @Query("SELECT * FROM sleep")
    suspend fun getAllSleeps(): List<SleepDto>

}
