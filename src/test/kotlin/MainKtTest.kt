import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class MainKtTest {

    @Test
    fun max() {
        assertAll(
            { assertEquals(5, max(1, 5)) },
            { assertEquals(5, max(5, -1)) }
        )
    }
}