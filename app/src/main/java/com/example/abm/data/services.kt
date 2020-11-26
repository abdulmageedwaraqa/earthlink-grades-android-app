package com.example.abm.data
import android.util.Log
import okhttp3.*
import java.io.IOException

fun getGrades(url: String){
    var client = OkHttpClient();
    var request= Request.Builder()
        .url(url)
        .build()

    client.newCall(request).enqueue(object: Callback {
        override fun onFailure(call: Call, e: IOException) {
            Log.e("abo","",e)
        }

        override fun onResponse(call: Call, response: Response) {
            Log.i("abdo","success")
        }
    })
}