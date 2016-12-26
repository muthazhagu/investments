package investments;

/**
 * Created by muthu on 12/25/16.
 */
class Fund {
    private final String fundSymbol;
    private final FundType fundType;
    private final FundStyle fundStyle;

    Fund(String fundSymbol, FundType fundType, FundStyle fundStyle){
        this.fundSymbol = fundSymbol;
        this.fundType = fundType;
        this.fundStyle = fundStyle;
    }
}
