package org.abubaker.debugging

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import org.abubaker.debugging.databinding.ActivityMainBinding

/**
 * Note: The log tag is typically declared outside of the class.
 *
 * Even though this variable is declared outside of MainActivity, it's declared as private
 * so that it will only be accessible in MainActivity.kt.
 *
 * This means you can also declare a TAG variable for other classes.
 */
private const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {

    private lateinit var mBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Inflate the activity_main.xml file
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        setContentView(mBinding.root)

        // Log the message
        logging()

    }

    fun logging() {

        /**
         * 1. e: Error
         * ERROR logs report that something went seriously wrong, such as the reason why an app crashed.
         *
         * Example: Why an app crashed.
         */
        Log.e(TAG, "ERROR: a serious error like an app crash")

        /**
         * 2. w: Warn
         * WARN logs are less severe than an error but still report something that should be fixed
         * to avoid a more serious error.
         *
         * Example: Calling a depreciated function
         */
        Log.w(TAG, "WARN: warns about the potential for serious errors")

        /**
         * 3. i: Info
         * INFO logs provide useful information,
         *
         * Example: An operation being successfully completed.
         */
        Log.i(TAG, "INFO: reporting technical information, such as an operation succeeding")

        /**
         * 4. d: Debug
         * DEBUG logs contain information that may be useful when investigating an issue.
         *
         * Note:
         * These logs are not present in release builds such as one you'd publish on the Google Play Store.
         */
        Log.d(TAG, "DEBUG: reporting technical information useful for debugging")

        /**
         * 5. v: Verbose
         * It is the least specific log level.
         * What's considered a debug log, versus a verbose log, is a bit subjective
         *
         * VERBOSE vs DEBUG:
         *  - a verbose log is something that can be removed after a feature is implemented,
         *  - whereas a debug log may still be useful for debugging.
         *
         *  Note: These logs are also not included in release builds.
         */
        Log.v(TAG, "VERBOSE: more verbose than DEBUG logs")
    }
}

/**
 * Note: Using Assert in the logcat
 *  This filters out everything that's ERROR level and below.
 */