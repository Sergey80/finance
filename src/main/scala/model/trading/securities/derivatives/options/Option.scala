package model.trading.securities.derivatives.options

import model.trading._
import model.trading.client.Party
import model.trading.securities.Equity
import model.trading.securities.derivatives.options.OptionType.OptionType

//  publicly-traded corporation, represents some type of financial value

/**
 * A financial derivative that represents a contract sold
 * by one _Party_ (option writer)
 * to another _Party_ (option holder)  = Buyer
 *
 * The contract offers the _Buyer_ the _Right_,
 *
 * but not the _Obligation_,
 *
 * to _Buy_ (call) or _Sell_ (put) a
 *
 * _Security_ or other _Financial Asset_
 *
 * at an agreed-upon _price_ (the _Strike Price_)
 *
 * during a certain period of _Rime_ or on a specific date (_Exercise Date_).
 *
 * _Call Options give the _Option_ to _Buy_ at certain _Price_,
 *
 * so the _Buyer_ would want the stock to go up.
 *
 * _Put Options_ give the option to sell at a certain price,
 *
 * so the _Buyer_ would want the _Stock_ to go down.
*/
object OptionType extends Enumeration {
  type OptionType = Value
  val CALL = Value  // the buyer would want the _stock_ to go up
  val PUT = Value   // the buyer would want the _stock_ to go down
}

case class StockOption (

  writer: OptionWriter,       //
  holder: OptionHolder,       // Buyer

  //val stockPrice: Price         // _stock_ price at this moment of time

  strikePrice: Price,         // agreed-upon price (the _strike price_)
  expirationTime: Time,       // during a certain _period of time_
  exerciseDate: Date,          // or on a specific date (_exercise date_).

  optionType: OptionType

  //val volatility: Double    =_
  //val riskFreeRate: Double  = _

) extends Equity with model.trading.securities.rights.Right


object Options {

  def CALL(writer: OptionWriter,
           holder: OptionHolder,
           strikePrice: Price,
           expirationTime: Time,
           exerciseDate: Date) : StockOption = {

    StockOption(writer, holder, strikePrice, expirationTime, exerciseDate,OptionType.CALL)

  }

  def PULL(writer: OptionWriter,
           holder: OptionHolder,
           strikePrice: Price,
           expirationTime: Time,
           exerciseDate: Date) : StockOption = {

    StockOption(writer, holder, strikePrice, expirationTime, exerciseDate,OptionType.PUT)

  }

}

