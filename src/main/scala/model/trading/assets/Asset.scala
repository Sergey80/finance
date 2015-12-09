package model.trading.assets

import model.trading.assets.values.EconomicValue

/**
 * Asset - is a resource with Economic Value that an individual,
 * corporation or country owns or controls with the expectation that it will provide future benefit.
 *
 * Asset as something that can generate cash flow

 * --
 * And _Economic value_ is represented by the maximum amount a consumer is willing to pay for the asset
 */

trait Asset {

   // assets are either current or fixed
  def value:EconomicValue = new EconomicValue()


}
