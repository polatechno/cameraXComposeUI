package com.polatechno.cameraxexample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.polatechno.cameraxexample.ui.theme.CameraXExampleTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            CameraXExampleTheme {
            }
        }
    }


}
