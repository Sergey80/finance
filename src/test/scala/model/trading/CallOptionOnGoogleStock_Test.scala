package model.trading

import model.trading.broker.{Broker, DiscountBroker}
import model.trading.client.Investor
import model.trading.orders.Order
import model.trading.securities.derivatives.options.{Option, OptionHolder, OptionWriter, Options}
import model.trading.securities.equitysecurties._
import model.trading.transactions.Trade

object CallOptionOnGoogleStock_Test extends App {

  /**
   * For example, a call option on Google stock gives the holder the right,
   * but not the obligation, to purchase Google stock at the price specified
   * in the option contract. In this case, Google stock is the underlying security.
   *
   * In this case, Google stock is the _Underlying security_
   */

  val optionWriter = new Investor with OptionWriter {
    override def name(): String = "A"
    override def assets(): Seq[FinancialAsset] = {
      val stock1 = new Stock {}
      Seq[FinancialAsset](stock1)
    }
  }

  val optionHolder = new Investor with OptionHolder {
    override def name(): String = "B"
    override def assets(): Seq[FinancialAsset] = {
      val stock1 = new Stock {}
      Seq[FinancialAsset](stock1)
    }
  }

  val callOption: Option = Options.CALL(
                                optionWriter,
                                optionHolder,
                                strikePrice = Price("1.0"),
                                expirationTime = 1L,
                                exerciseDate = "")

  val broker = new Broker{}

  //val right = discountBroker.executeTrades()


  println("!")
}
