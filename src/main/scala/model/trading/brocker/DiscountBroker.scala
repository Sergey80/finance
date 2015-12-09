package model.trading.brocker

import model.trading.transactions.Trade

/**
 * A _Stockbroker_
 * who carries out Buy and Sell orders at a
 *  Reduced Commission compared to a Full-Service Broker
 *
 *  But provides NO _Investment Advice_.
 */

trait DiscountBroker { // syn: Broker opp: FullServiceBroker

  def executeTrades(trades:Seq[Trade])       // without the extra services

}
