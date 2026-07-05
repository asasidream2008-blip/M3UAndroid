herepackage com.m3u.smartphone.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun SportsPage() {
    // قائمة القنوات الرياضية
    val sportsChannels = listOf(
        "⚽ beIN Sports 1",
        "⚽ beIN Sports 2",
        "⚽ beIN Sports 3",
        "🏆 Sky Sports",
        "🏆 ESPN",
        "⚽ Dubai Sports",
        "🏆 Abu Dhabi Sports"
    )

    Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        Text(
            text = "🏆 القنوات الرياضية",
            fontSize = 24.sp,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        
        LazyColumn {
            items(sportsChannels) { channel ->
                Text(
                    text = channel,
                    modifier = Modifier.padding(vertical = 8.dp),
                    fontSize = 18.sp
                )
            }
        }
    }
}
