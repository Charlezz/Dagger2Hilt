package kr.co.fastcampus.dagger2hilt

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import kr.co.fastcampus.dagger2hilt.di.MainSubcomponent
import kr.co.fastcampus.dagger2hilt.ui.theme.Dagger2HiltTheme
import javax.inject.Inject

class MainActivity : ComponentActivity() {

    @Inject
    lateinit var str:String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val appComponent = (application as MyApplication)
            .appComponent

        val mainSubcomponent:MainSubcomponent = appComponent
                .mainSubcomponentFactory()
                .create(this)

//        appComponent.inject(this)
        mainSubcomponent.inject(this)

        Log.e("MainActivity", "app = ${appComponent.application()}")
        Log.e("MainActivity", "str = $str")

        setContent {
            Dagger2HiltTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Dagger2HiltTheme {
        Greeting("Android")
    }
}