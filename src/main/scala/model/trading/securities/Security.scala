package model.trading.securities

import model.trading._
import model.trading.assets.Asset
import model.trading.assets.values.FinancialValue
import model.trading.client.Party


/**
 *
 * " 'Paper' traded for Value "
 *
 * A _Security_ is a tradable _Financial Asset_.
 * It is commonly used to mean any form of Financial Instrument,
 *
 * So, a _Security_ is a fungible, negotiable _Financial Instrument_
 *
 * that represents some type of _Financial Value_.
 *
 *
 * The Company or entity that issues the Security is known as the issuer.
 *
 * A _Security_ is a _Financial Instrument_
 * that represents an ownership _position_ in a publicly-traded corporation (stock),
 *
 * a _Creditor relationship_ with _Governmental body_
 * or a corporation (_Bond_),
 *
 * or rights to ownership as represented by an _Option_.
 *
 * The _Company_ or _Entity_ that issues the _Security_ is known as the _Issuer_.
*/
trait Security extends Asset with FinancialInstrument {

  def financialValue(): FinancialValue  //  Assets - Liabilities

  val assets: Seq[Asset] = Seq[Asset]()

  def partyA : Party
  def partyB : Party

  //def price : Price

}
