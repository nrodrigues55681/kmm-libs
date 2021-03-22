package pt.nrodrigues.library

actual class Logger {
    actual var enabled: Boolean = false

    actual fun v(tag: String, msg: String) {
        print(tag, msg, null)
    }

    actual fun v(tag: String, msg: String, tr: Throwable) {
        print(tag, msg, tr)
    }

    actual fun d(tag: String, msg: String) {
        print(tag, msg, null)
    }

    actual fun d(tag: String, msg: String, tr: Throwable) {
        print(tag, msg, tr)
    }

    actual fun i(tag: String, msg: String) {
        print(tag, msg, null)
    }

    actual fun i(tag: String, msg: String, tr: Throwable) {
        print(tag, msg, tr)
    }

    actual fun w(tag: String, msg: String) {
        print(tag, msg, null)
    }

    actual fun w(tag: String, msg: String, tr: Throwable) {
        print(tag, msg, tr)
    }

    actual fun w(tag: String, tr: Throwable) {
        print(tag, null, tr)
    }

    actual fun e(tag: String, msg: String) {
        print(tag, msg, null)
    }

    actual fun e(tag: String, msg: String, tr: Throwable) {
        print(tag, msg, tr)
    }

    actual fun wtf(tag: String, msg: String) {
        print(tag, msg, null)
    }

    actual fun wtf(tag: String, tr: Throwable) {
        print(tag, null, tr)
    }

    actual fun wtf(tag: String, msg: String, tr: Throwable) {
        print(tag, msg, tr)
    }

    private fun print(tag:String, msg: String?, tr: Throwable?) {
        if(enabled) {
            println("$tag : $msg")
            println(tr)
        }
    }
}