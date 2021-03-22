package pt.nrodrigues.library

import android.util.Log

actual class Logger {
    actual var enabled = false

    actual fun v(tag: String, msg: String) {
        if(enabled) {
            Log.v(tag, msg)
        }
    }

    actual fun v(tag: String, msg: String, tr: Throwable) {
        if(enabled) {
            Log.v(tag, msg, tr)
        }
    }

    actual fun d(tag: String, msg: String) {
        if(enabled) {
            Log.d(tag, msg)
        }
    }

    actual fun d(tag: String, msg: String, tr: Throwable) {
        if(enabled) {
            Log.d(tag, msg, tr)
        }
    }

    actual fun i(tag: String, msg: String) {
        if(enabled) {
            Log.i(tag, msg)
        }
    }

    actual fun i(tag: String, msg: String, tr: Throwable) {
        if(enabled) {
            Log.i(tag, msg, tr)
        }
    }

    actual fun w(tag: String, msg: String) {
        if(enabled) {
            Log.w(tag, msg)
        }
    }

    actual fun w(tag: String, msg: String, tr: Throwable) {
        if(enabled) {
            Log.w(tag, msg, tr)
        }
    }

    actual fun w(tag: String, tr: Throwable) {
        if(enabled) {
            Log.w(tag, tr)
        }
    }

    actual fun e(tag: String, msg: String) {
        if(enabled){
            Log.e(tag, msg)
        }
    }

    actual fun e(tag: String, msg: String, tr: Throwable) {
        if(enabled){
            Log.e(tag, msg, tr)
        }
    }

    actual fun wtf(tag: String, msg: String) {
        if(enabled){
            Log.wtf(tag, msg)
        }
    }

    actual fun wtf(tag: String, tr: Throwable) {
        if(enabled){
            Log.wtf(tag, tr)
        }
    }

    actual fun wtf(tag: String, msg: String, tr: Throwable) {
        if(enabled){
            Log.wtf(tag, msg, tr)
        }
    }
}