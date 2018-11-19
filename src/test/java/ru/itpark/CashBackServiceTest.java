package ru.itpark;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashBackServiceTest {

    @Test
    void monthlyCashBack() {
        {
            CashBackService cashBackService = new CashBackService();
            int monthlyCashBack = cashBackService.monthlyCashBack(5_000, 10_000, 9_000);
            assertEquals(3_250,monthlyCashBack );
        }
        {
            CashBackService cashBackService = new CashBackService();
            int monthlyCashBack = cashBackService.monthlyCashBack(400_000, 100_000, 90_000);
            assertEquals(9_000,monthlyCashBack );
        }
    }
}