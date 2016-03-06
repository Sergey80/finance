package model.trading.orderticket.orders

import model.trading._
import model.trading.marketplace.StockExchange
import model.trading.transactions.Trade

/**
 * Instructs the brokerage to buy or sell a _security_ at or below a specified price.
 * Limit orders remain in effect until they are executed,
 * until the investor cancels them or until they expire.
*/
case class LimitOrder(

       side         : OrderSide.Value,
       symbol       : String,
       quantity     : Int,

       price        : Price,
       timeInForce  : TimeInForce.Value

) extends Order {

  override def fill(price: Price) : Order = {
    this.copy(price = price)
  }


  override def execute(market: StockExchange): Trade = {null}
}
