package gaur.himanshu.progurad

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import gaur.himanshu.progurad.fake.Fake
import gaur.himanshu.progurad.impl.FirstImpl
import gaur.himanshu.progurad.impl.SecondImpl
import gaur.himanshu.progurad.model.ModelFIrstClass
import gaur.himanshu.progurad.model.ModelSecondClass
import gaur.himanshu.progurad.ui.theme.ProguradTheme

class MainActivity : ComponentActivity() {


    private val fake = Fake(name = "Himanshu")

    private val firstImpl = FirstImpl()

    private val secondImpl = SecondImpl()

    private val first = ModelFIrstClass("hklsadfjlkajsfa")

    private val second = ModelSecondClass("faklsdfklasflkjasfd")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ProguradTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    myCustomFunction()
                    Greeting(
                        name = fake.name.plus(
                            firstImpl.getCustomMessage()
                        ).plus(
                            secondImpl.getCustomMessage()
                        ).plus(first)
                            .plus(second),
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }


    fun myCustomFunction(){
        val m = "flkajflkajsfasfklj"
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
    ProguradTheme {
        Greeting("Android")
    }
}