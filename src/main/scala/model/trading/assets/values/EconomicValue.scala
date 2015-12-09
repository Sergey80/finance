package model.trading.assets.values

import model.trading.assets.Asset

/**
 *
 * The economic value of an asset is based on individual preferences.
 *
 * The same _Asset_ may have significantly different _Economic Values_
 * for two different Companies or Individuals.
 *
 * _Economic value_ is represented by the maximum amount a consumer is willing to pay
 *
 * For businesses, Economic Value represents the value that the company derives from using the Asset.
 *
 * Economic value typically exceeds Market Value.
 */
class EconomicValue extends Asset {   // vs: MarketValue - represents the minimum amount a consumer will pay


}
