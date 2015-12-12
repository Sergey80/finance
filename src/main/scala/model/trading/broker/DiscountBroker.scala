package model.trading.broker

import model.trading.orders.Order
import model.trading.transactions.Trade



trait DiscountBroker extends Broker { // syn: Broker opp: FullServiceBroker

  def executeTrades(trades:Seq[Trade])       // without the extra services

}
