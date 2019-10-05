package br.com.fiap.jogodavelha.models

import org.junit.Assert
import org.junit.Before
import org.junit.Test

class GameTest {

    private lateinit var game: Game
    private lateinit var player: Player
    private lateinit var anotherPlayer: Player

    @Before
    @Throws(Exception::class)
    fun setUp(){
        game = Game("A","B")
        player = game.player1
        anotherPlayer = game.player2
    }

    @Test
    fun returnTrueIfHasThreeSameDiagonalCellFromLeft(){
        val cell = Cell(player)
        game.cells[0][0] = cell
        game.cells[1][1] = cell
        game.cells[2][2] = cell
        val hasThreeSameDiagonalsCells = game.hasThreeSameDiagonalCells()
        Assert.assertTrue(hasThreeSameDiagonalsCells)
    }

    @Test
    fun returnTrueIfHasThreeSameHorizontalCellsAtRow1(){
        val cell = Cell(player)
        game.cells[0][0] = cell
        game.cells[0][1] = cell
        game.cells[0][2] = cell
        val hasThreeSameDiagonalsCells = game.hasThreeSameDiagonalCells()
        Assert.assertTrue(hasThreeSameDiagonalsCells)
    }

    @Test
    fun returnTrueIfHasThreeSameHorizontalCellsAtRow2(){
        val cell = Cell(player)
        game.cells[1][0] = cell
        game.cells[1][1] = cell
        game.cells[1][2] = cell
        val hasThreeSameDiagonalsCells = game.hasThreeSameDiagonalCells()
        Assert.assertTrue(hasThreeSameDiagonalsCells)
    }

    @Test
    fun returnTrueIfHasThreeSameHorizontalCellsAtRow3(){
        val cell = Cell(player)
        game.cells[2][0] = cell
        game.cells[2][1] = cell
        game.cells[2][2] = cell
        val hasThreeSameDiagonalsCells = game.hasThreeSameDiagonalCells()
        Assert.assertTrue(hasThreeSameDiagonalsCells)
    }

    @Test
    fun returnTrueIfHasThreeSameVerticalCellsAtColumn1(){
        val cell = Cell(player)
        game.cells[0][0] = cell
        game.cells[1][0] = cell
        game.cells[2][0] = cell
        val hasThreeSameDiagonalsCells = game.hasThreeSameVerticalCells()
        Assert.assertTrue(hasThreeSameDiagonalsCells)
    }

    @Test
    fun returnTrueIfHasThreeSameVerticalCellsAtColumn2(){
        val cell = Cell(player)
        game.cells[0][1] = cell
        game.cells[1][1] = cell
        game.cells[2][1] = cell
        val hasThreeSameDiagonalsCells = game.hasThreeSameVerticalCells()
        Assert.assertTrue(hasThreeSameDiagonalsCells)
    }

    @Test
    fun returnTrueIfHasThreeSameVerticalCellsAtColumn3(){
        val cell = Cell(player)
        game.cells[0][2] = cell
        game.cells[1][2] = cell
        game.cells[2][2] = cell
        val hasThreeSameDiagonalsCells = game.hasThreeSameVerticalCells()
        Assert.assertTrue(hasThreeSameDiagonalsCells)
    }

    @Test
    fun `return false if does not have three same diagonals cells`(){
        val cell = Cell(player)
        val anotherCell = Cell(anotherPlayer)
        game.cells[0][0] = cell
        game.cells[1][1] = cell
        game.cells[2][2] = anotherCell
        val hasThreeSameDiagonalCell = game.hasThreeSameDiagonalCells()
        Assert.assertFalse(hasThreeSameDiagonalCell)
    }

/*    @Test
    fun `end game if has three same horizonta cell`(){
        val cell = Cell(player)
        game.cells[0][0] = cell
        game.cells[0][1] = cell
        game.cells[0][2] = cell
        val hasGameEnded = game.hasGameEnded()
        Assert.assertTrue(hasGameEnded)
    }*/
}