package me.podlesnykh.paginglibrarytryouts

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import me.podlesnykh.paginglibrarytryouts.ui.theme.PagingLibraryTryoutsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PagingLibraryTryoutsTheme {

            }
        }
    }
}