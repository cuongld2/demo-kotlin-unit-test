package net.pot8os.kotlintestsample

import org.junit.runner.RunWith
import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.CoreMatchers.*
import org.junit.Before
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.junit.MockitoJUnitRunner
import org.mockito.kotlin.*

@RunWith(MockitoJUnitRunner::class)
class UnitTest {

    @Test
    fun `test click add all`() {
        val viewModel  = Mockito.mock(CalculatorViewModel::class.java)
        viewModel.onClickedAllClear()
    }

}