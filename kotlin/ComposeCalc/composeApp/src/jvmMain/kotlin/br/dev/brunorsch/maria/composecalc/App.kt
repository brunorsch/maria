package br.dev.brunorsch.maria.composecalc

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    val botoes = listOf(
        listOf("7", "8", "9", "/"),
        listOf("4", "5", "6", "*"),
        listOf("1", "2", "3", "-"),
        listOf("0", ".", "=", "+"),
        listOf("Limpar")
    )

    MaterialTheme {
        var operacao by remember { mutableStateOf("") }
        var resultado by remember { mutableStateOf("") }

        fun calcularResultado(operacao: String): String {
            if(operacao.contains("+")) {
                val (parte1, parte2) = operacao.split("+")
                return (parte1.toDouble() + parte2.toDouble()).toString();
            }

            if(operacao.contains("-")) {
                val (parte1, parte2) = operacao.split("-")
                return (parte1.toDouble() - parte2.toDouble()).toString();
            }

            if(operacao.contains("*")) {
                val (parte1, parte2) = operacao.split("*")
                return (parte1.toDouble() * parte2.toDouble()).toString();
            }

            if(operacao.contains("/")) {
                val (parte1, parte2) = operacao.split("/")
                return (parte1.toDouble() / parte2.toDouble()).toString();
            }

            return ""
        }

        fun handleBotao(botaoTexto: String) {
            if(botaoTexto == "=") {
                val resultadoCalculado = calcularResultado(operacao)
                resultado = resultadoCalculado
                return
            } else if(botaoTexto == "Limpar") {
                operacao = ""
                resultado = ""
                return
            } else {
                operacao += botaoTexto
            }
        }

        Column(
            modifier = Modifier
                .background(MaterialTheme.colorScheme.primaryContainer)
                .safeContentPadding(),
            horizontalAlignment = Alignment.Start,
        ) {
            Column {
                Card {
                    Text(text = operacao, modifier = Modifier.fillMaxWidth())
                }
                Card {
                    Text(text = "Resultado: ", fontSize = 24.sp, modifier = Modifier.fillMaxWidth())
                    Text(text = resultado, modifier = Modifier.fillMaxWidth())
                }
                botoes.forEach { linha ->
                    Row {
                        linha.forEach { botao ->
                            Button(
                                onClick = { handleBotao(botao) },
                                modifier = Modifier
                            ) {
                                Text(text = botao)
                            }
                        }
                    }
                }

            }
        }
    }
}