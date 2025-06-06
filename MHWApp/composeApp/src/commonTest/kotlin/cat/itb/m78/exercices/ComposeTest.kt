package cat.itb.m78.exercices

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.test.ExperimentalTestApi
import androidx.compose.ui.test.assertTextEquals
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.performClick
import androidx.compose.ui.test.runComposeUiTest
import cat.itb.m78.exercices.p2.reservoir.ReservoirsApi
import kotlinx.coroutines.test.runTest
import kotlin.test.Test

@OptIn(ExperimentalTestApi::class)
class ComposeTest {

    @Test
    fun simpleCheck() = runTest {
        //println(ReservoirsApi.list())
        println(ReservoirsApi.detail("Embassament de Siurana (Cornudella de Montsant)"))
    }
}