package org.aicaprio.unittest

import android.os.Environment
import android.util.Log
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import java.io.File

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("org.aicaprio.unittest", appContext.packageName)
    }

    @Test
    fun compareTest() {
        var f1 = File(Environment.getDataDirectory().path)
        var f2 = File(Environment.getDownloadCacheDirectory().path)
        var f3 = File(Environment.getStorageDirectory().path)
        Log.d("CCC", "f1: ${f1.lastModified().toString()}")
        Log.d("CCC", "f2: ${f2.lastModified().toString()}")
        Log.d("CCC", "f3: ${f3.lastModified().toString()}")
    }
}