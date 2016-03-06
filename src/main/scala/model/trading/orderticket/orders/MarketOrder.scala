package model.trading.orderticket.orders

import model.trading._
import model.trading.marketplace.StockExchange
import model.trading.orderticket.orders.FilledOrderState
import model.trading.transactions.Trade

/**
 * - Guarantees the order will be executed
 * - Does not grantees the price (price may vary as oder is filled and executed)
 *
 *
 * A Market order - is an order to _buy_ or _sell_ immediately (!) at the best available price.
 *
 * These orders do not guarantee a price, but they do guarantee the order's immediate execution.

 * Instructs the brokerage to complete the order at the next available price and by the end of the day
 *
 * Market orders are filled.
 *
 * A market order is the simplest of the order types.
 *
 * This order type does not allow any control over the price received.
 *
 * The order is filled at the best price available at the relevant time.
 *
 * In fast-moving markets, the price paid or received may be quite different from the last price quoted before the order was entered.
 *
 * A market order may be split across multiple participants on the other side of the transaction, resulting in different prices for some of the shares.
 *
 * Of course, the additional time it takes some markets to execute orders may result in your
 * getting a worse price than the current quote – especially in a fast-moving market.
 *
 */
import TimeInForce._

case class MarketOrder(

                   side         : OrderSide.Value,
                   symbol       : String,
                   quantity     : Int,

                   price        : Price       = Price(""),        // no price for market order
                   timeInForce  : TimeInForce = Day   // can not be GoodTillCancel

           ) extends Order {

  override def fill(price: Price) : Order = {
    this.copy(price = price)
  }


}
