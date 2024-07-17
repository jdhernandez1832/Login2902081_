package co.edu.sena.prueba.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import co.edu.sena.prueba.components.NormalTextComponent

@Composable
fun SingUpScreen() {
    Surface(
        color = Color.White,
        modifier = Modifier.fillMaxSize()
    ) {
        NormalTextComponent(value = "Hey there")
    }//Surface
}//SignUpScreen

@Preview(showBackground = true)
@Composable
fun SingUpScreenPreview() {
    SingUpScreen()
}