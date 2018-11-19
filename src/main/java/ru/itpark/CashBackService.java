package ru.itpark;

public class CashBackService {
    public int monthlyCashBack(int regularPurchases, int highCashBackPurchases, int specialOfferPurchases) {
        int regularPurchasesPercent = 1;
        int highCashBackPurchasesPercent = 5;
        int specialOfferPurchasesPercent = 30;
        int maxCashBackFirstTwoThreeCategories = 3_000;
        int hunredPercentValue = 100;
        int result;

        int resultReg = regularPurchases * regularPurchasesPercent / hunredPercentValue;
        if (resultReg > maxCashBackFirstTwoThreeCategories) {
            resultReg = maxCashBackFirstTwoThreeCategories;
        }

        int resultHigh = highCashBackPurchases * highCashBackPurchasesPercent / hunredPercentValue;
        if (resultHigh > maxCashBackFirstTwoThreeCategories) {
            resultHigh = maxCashBackFirstTwoThreeCategories;
        }

        int resultSpecial = specialOfferPurchases * specialOfferPurchasesPercent / hunredPercentValue;
        if (resultSpecial > maxCashBackFirstTwoThreeCategories) {
            resultSpecial = maxCashBackFirstTwoThreeCategories;
        }
        result = resultSpecial+ resultHigh + resultReg;

        return result;
    }
}
