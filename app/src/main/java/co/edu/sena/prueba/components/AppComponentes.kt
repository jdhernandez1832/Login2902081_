package co.edu.sena.prueba.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import co.edu.sena.prueba.R

@Composable
fun NormalTextComponent(value: String) {
    Text(
        text = value,
        modifier = Modifier
            .fillMaxWidth()
            .heightIn(min = 40.dp),
        style = TextStyle(
            fontSize = 24.sp,
            fontWeight = FontWeight.Normal,
            fontStyle = FontStyle.Normal
        )//TextStyle
    , color = colorResource(id = R.color.colorText),
        textAlign = TextAlign.Center
    )//Text
}//NormalTextComponent

@Composable
fun HeadingTextComponent(value: String) {
    Text(
        text = value,
        modifier = Modifier
            .fillMaxWidth()
            .heightIn(),
        style = TextStyle(
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            fontStyle = FontStyle.Normal
        )//TextStyle
        , color = colorResource(id = R.color.colorText),
        textAlign = TextAlign.Center
    )//Text
}//HeadingT

@ExperimentalMaterial3Api
@Composable
fun MyTextField(labelValue: String, painterResource: Painter) {
    val textValue = remember {
        mutableStateOf("")
    }// textValue
    OutlinedTextField(
        modifier = Modifier
            .fillMaxWidth()
            .clip(MaterialTheme.shapes.small),
        label = { Text(text = labelValue) },
        colors = TextFieldDefaults.outlinedTextFieldColors(
            focusedBorderColor = colorResource(id = R.color.colorPrimary),
            focusedLabelColor = colorResource(id = R.color.colorPrimary),
            cursorColor = colorResource(id = R.color.colorPrimary),
            containerColor =  colorResource(id = R.color.colorBG) // se usa container puesto que background color no existe en outlineedtext
        ),
        keyboardOptions = KeyboardOptions.Default,
        value = textValue.value,
        onValueChange = { textValue.value = it },
        leadingIcon = {
            Icon(painter = painterResource, contentDescription = "")
        }
    )
}//MyText

