package model.trading

import model.trading.transactions.Trade
import model.trading.brocker.DiscountBroker
import model.trading.client.Investor
import model.trading.securities.derivatives.options.{OptionHolder, OptionWriter, Options}

import model.trading.securities.equitysecurties._

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

  val callOption = Options.CALL(
                                optionWriter,
                                optionHolder,
                                strikePrice = Price("1.0"),
                                expirationTime = 1L,
                                exerciseDate = ""
  )

  val discountBroker = new DiscountBroker {
    override def executeTrades(trades: Seq[Trade]): Unit = {}
  }

  //val right = discountBroker.executeTrades()


  println("!")
}
