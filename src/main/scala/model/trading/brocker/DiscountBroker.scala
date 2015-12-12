package model.trading.brocker

import model.trading.orders.Order
import model.trading.transactions.Trade

/**
 * A _Stockbroker_
 * who carries out Buy and Sell orders at a
 *  Reduced Commission compared to a Full-Service Broker
 *
 *  But provides NO _Investment Advice_.
 */



trait Broker {
  def place(order:Order) // when one/investor asks a broker to place the order for him
}

trait DiscountBroker extends Broker { // syn: Broker opp: FullServiceBroker

  def executeTrades(trades:Seq[Trade])       // without the extra services

}
