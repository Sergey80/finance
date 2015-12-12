package model.trading.broker

import model.trading.transactions.Trade

/**
 * _Full-Service Brokers_
 *
 * - they can be extremely useful for their expertise.
 *
 * They do much more than just place trades;
 *
 * Full-Service brokers can provide expertise for people who don't have the time to stay up-to-date
 * on complicated issues such as tax or _Estate Planning.
 *
 * However, for those who just want to execute trades without the extra services,
 * _Discount Brokers_ are the way to go.
 */

trait FullServiceBroker extends DiscountBroker {

  override def executeTrades(trades:Seq[Trade])

  def research()

  def advice(): InvestmentAdvice

  def retirement()

  def planning()

  def tax()

  def tips()

  def muchMore()

}
