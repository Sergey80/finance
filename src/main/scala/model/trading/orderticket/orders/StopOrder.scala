package model.trading.orderticket.orders

/**
 * When you place a stop or limit order, you are telling your broker that
 * you don't want the market price (the current price at which a stock is trading),
 * but that you want the stock price to move in a certain direction before your order is executed.
 *
 * With a stop order, your trade will be executed
 * only when the security you want to buy or sell reaches a particular price (the stop price).
 */
trait StopOrder {

  // var price  // Once the _Stock_ has reached this price,
                // a _Stop Order_ essentially becomes a _Market Order_ and is filled.

}
