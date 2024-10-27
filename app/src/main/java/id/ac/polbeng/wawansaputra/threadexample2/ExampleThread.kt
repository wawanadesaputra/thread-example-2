package id.ac.polbeng.wawansaputra.threadexample2

import android.util.Log

class ExampleThread(private var seconds: Int) : Thread() {

    private val TAG = "MainActivity"

    override fun run() {
        for (i in 1 until seconds) {
            Log.d(TAG, "startThread: $i")
            try {
                Thread.sleep(1000)
            } catch (ie: InterruptedException) {
                ie.printStackTrace()
            }
        }
    }
}