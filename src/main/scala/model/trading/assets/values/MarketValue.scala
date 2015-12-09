package model.trading.assets.values

import model.trading._
import model.trading.assets.Asset

/**
 * Represents the minimum amount a consumer will pay.
 *
 * Economic value thus often exceeds market value.
 *
 * Market value is based on supply and demand.
 *
 * It is calculated by multiplying the number of shares issued
 * by the price of the company's share:
 *
 * mv = numberOfShares * share price
 *
 * A company's _share price_ is determined
 * by daily trading between buyers and sellers on the relevant stock exchange.
 *
 */
trait MarketValue extends Asset {

  override def value() : EconomicValue

}

// Financial Value is more accurate than Economic Value
