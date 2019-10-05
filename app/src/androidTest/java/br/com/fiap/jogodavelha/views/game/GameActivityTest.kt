package br.com.fiap.jogodavelha.views.game

import androidx.test.rule.ActivityTestRule
import br.com.fiap.jogodavelha.R
import br.com.fiap.jogodavelha.models.Player
import com.schibsted.spain.barista.interaction.BaristaClickInteractions
import com.schibsted.spain.barista.interaction.BaristaDialogInteractions
import com.schibsted.spain.barista.interaction.BaristaEditTextInteractions
import kotlinx.android.synthetic.main.game_begin_dialog.view.*
import org.junit.Rule
import org.junit.Test

class GameActivityTest {

    @Rule @JvmField
    var activityRule = ActivityTestRule(GameActivity::class.java)

    private val player1 = Player("A", "O")
    private val player2 = Player("C", "X")


    @Test
    fun endGameWhenOnePlayerWins(){

        BaristaEditTextInteractions.writeTo(R.id.et_player1, player1.name)
        BaristaEditTextInteractions.writeTo(R.id.et_player2, player2.name)
        BaristaDialogInteractions.clickDialogPositiveButton()

        BaristaClickInteractions.clickOn(R.id.cell_00)
        BaristaClickInteractions.clickOn(R.id.cell_10)
        BaristaClickInteractions.clickOn(R.id.cell_11)
        BaristaClickInteractions.clickOn(R.id.cell_20)
        BaristaClickInteractions.clickOn(R.id.cell_22)


    }



}