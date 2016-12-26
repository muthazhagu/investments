package investments;

/**
 * Created by muthu on 12/26/16.
 */
class FundNAV {
    private final Fund fund;
    private final PriceType priceType;
    private final double netAssetValue;

    FundNAV(Fund fund, PriceType priceType, double netAssetValue){
        this.fund = fund;
        this.priceType = priceType;
        this.netAssetValue = netAssetValue;
    }
}
