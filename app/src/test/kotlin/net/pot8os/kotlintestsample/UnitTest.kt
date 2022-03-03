package net.pot8os.kotlintestsample

import io.mockk.coEvery
import io.mockk.mockk
import org.junit.runner.RunWith
import org.junit.Test
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class UnitTest {

    @Test
    fun `test click add all`() {
        val viewModel = mockk<CalculatorViewModel>()
        val calculator = mockk<Calculator>()

        coEvery { calculator.sumImpl(any(), any()) } returns 10
        assert(10 == viewModel.sum(4, 6))
    }
}