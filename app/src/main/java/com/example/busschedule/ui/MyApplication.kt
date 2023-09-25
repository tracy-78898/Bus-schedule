package com.example.busschedule.ui

import android.app.Application
import com.example.busschedule.data.BusScheduleDatabase
//represents application class and lazily initiates the databASE
class MyApplication: Application() {
    val database: BusScheduleDatabase by lazy {BusScheduleDatabase .getDatabase(this) }
}
