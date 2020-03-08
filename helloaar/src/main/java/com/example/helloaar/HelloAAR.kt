package com.example.helloaar

import android.content.Context;
import android.util.Log
import android.widget.Toast

class HelloAAR {
    private val TAG = "HelloAAR"

    fun hello(con: Context) {
        Log.i(TAG, "Hello AAR!")
        Toast.makeText(con, "Hello AAR!", Toast.LENGTH_SHORT).show()
    }
 }