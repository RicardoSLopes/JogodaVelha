package br.com.fiap.jogodavelha.models

data class Cell(
    var player: Player
){
    val isEmpty: Boolean
        get() = player.value.isEmpty()
}