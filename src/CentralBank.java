public class CentralBank {
    void LeasingRate(){
        System.out.println("Rate 30% below");
    }
}
class CommercialBank extends CentralBank{
    @Override
    void LeasingRate() {
        System.out.println("Rate 25%");
    }
    void HousingLoanRate(){
        System.out.println("Rate 23");
    }
}
class CommercialLeasing extends CommercialBank{
    @Override
    void LeasingRate() {
        System.out.println("Rate 23%");
    }
}
class CommercialCredit extends CommercialBank{
    @Override
    void LeasingRate() {
        System.out.println("Rate 22%");
    }

    @Override
    void HousingLoanRate() {
        System.out.println("Rate 20%");
    }
}
class RateResult{
    public static void main(String[] args) {
        CentralBank cen = new CentralBank();
        CentralBank com = new CommercialBank();
        CentralBank comLes = new CommercialLeasing();
        CentralBank comCrd = new CommercialCredit();
        CommercialBank cen2 = new CommercialBank();
        CommercialBank com2 = new CommercialCredit();

        cen.LeasingRate();
        com.LeasingRate();
        comLes.LeasingRate();
        comCrd.LeasingRate();
        cen2.HousingLoanRate();
        com2.HousingLoanRate();




    }
}