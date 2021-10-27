package org.wit.placemark.main

import android.app.Application
import org.wit.placemark.models.PlacemarkJSONStore
import org.wit.placemark.models.PlacemarkStore
import timber.log.Timber
import timber.log.Timber.i

class MainApp : Application() {

    lateinit var placemarks : PlacemarkStore

    override fun onCreate() {
        super.onCreate()
        placemarks = PlacemarkJSONStore(applicationContext)
        Timber.plant(Timber.DebugTree())
        i("Placemark started")
    }
}