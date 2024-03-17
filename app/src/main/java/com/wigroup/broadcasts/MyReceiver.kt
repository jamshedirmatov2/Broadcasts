package com.wigroup.broadcasts

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class MyReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context?, intent: Intent?) {
        when (intent?.action) {
            Intent.ACTION_BATTERY_LOW -> println("Battery low")
            Intent.ACTION_AIRPLANE_MODE_CHANGED -> {
                val turnedOn = intent.getBooleanExtra("state", false)
                println("Airplane mode changed. Turned on: $turnedOn")
                Toast.makeText(
                    context,
                    "Airplane mode changed. Turned on: $turnedOn",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
    }
}