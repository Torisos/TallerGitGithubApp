package me.nicolasduarte.tallergitgithubapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import me.nicolasduarte.tallergitgithubapp.ui.theme.TallerGitGithubAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Presentation()

        }
    }
}

@Preview(showBackground = true,
    showSystemUi = true)
@Composable
fun Presentation() {

    Column(modifier = Modifier.fillMaxSize().padding(top = 40.dp),
        horizontalAlignment = Alignment.CenterHorizontally) {

        val painter = painterResource(id = R.drawable.fotomia)

        Image(
            painter = painter, contentDescription = null,
            modifier = Modifier
                .size(150.dp)
                .clip(CircleShape), contentScale = ContentScale.Crop,
            alignment = Alignment.Center
        )

        Spacer(modifier = Modifier.height(10.dp))
        Text(
            text = "Nicolas Duarte",
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold
        )

        Text(
            text = "Estudiante Ingenieria de Sistemas",
            color = Color.Blue,
            fontSize = 15.sp,
        )

        Spacer(modifier = Modifier.height(26.dp))

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 32.dp), //
            horizontalAlignment = Alignment.Start
        ) {
            Text(text = "EDAD", fontSize = 12.sp, color = Color.Gray, fontWeight = FontWeight.Bold)

            Text(text = "20 años", fontSize = 16.sp, color = Color.Black)

            Spacer(modifier = Modifier.height(26.dp))

            Text(
                text = "CORREO",
                fontSize = 12.sp,
                color = Color.Gray,
                fontWeight = FontWeight.Bold
            )

            Text(
                text = "nduarte513@unab.edu.co",
                fontSize = 16.sp,
                color = Color.Blue,
                style = TextStyle(
                    textDecoration = TextDecoration.Underline
                )
            )

            Spacer(modifier = Modifier.height(26.dp))

            Text(
                text = "CIUDAD",
                fontSize = 12.sp,
                color = Color.Gray,
                fontWeight = FontWeight.Bold
            )

            Text(text = "Bucaramanga, Colombia", fontSize = 16.sp, color = Color.Black)

        }

        Spacer(modifier = Modifier.height(30.dp))

        Column(modifier = Modifier.fillMaxWidth() ,horizontalAlignment = Alignment.CenterHorizontally)
        {
            Text(
                text = "SOBRE MI MATERIA FAVORITA",
                fontSize = 12.sp,
                color = Color.Gray,
                fontWeight = FontWeight.Bold)

            Spacer(modifier = Modifier.height(10.dp))

            Text(
                text = "Lorem Ipsum es simplemente el texto de relleno de las imprentas y archivos " +
                        "de texto. Lorem Ipsum ha sido el texto de relleno estándar de las industrias" +
                        " desde el año 1500. No sólo sobrevivió 500 años, sino que tambien ingresó como " +
                        "texto de relleno en documentos electrónicos" ,
                fontSize = 16.sp,
                textAlign = TextAlign.Center
                , modifier = Modifier
                    .fillMaxWidth()
                    .padding(25.dp,0.dp)
            )

            Spacer(modifier = Modifier.height(100.dp))

            Button(modifier = Modifier.fillMaxWidth(), onClick = {},
                content = {
                    Text(text = "Contactar Conmigo")
                })

        }

    }

}