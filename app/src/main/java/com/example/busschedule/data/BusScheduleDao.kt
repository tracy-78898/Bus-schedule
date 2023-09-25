package com.example.busschedule.data

import androidx.room.Dao
import androidx.room.Query
import kotlinx.coroutines.flow.Flow
//handles SQL queries data
@Dao
interface BusScheduleDao {
    @Query(
        """
        SELECT * FROM schedule 
        ORDER BY arrival_time ASC    
        """
    )
    // getter method to fetch all schedules
    fun getAll(): Flow<List<BusSchedule>>

    @Query(
        """
        SELECT * FROM schedule 
        WHERE stop_name = :stopName 
        ORDER BY arrival_time ASC 
        """
    )
    //getter method to fetch schedule for specific stop
    fun getByStopName(stopName: String): Flow<List<BusSchedule>>
}