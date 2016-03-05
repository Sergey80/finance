package model.trading.securities.equitysecurties

import model.trading.assets.values.FinancialValue
import model.trading.client.Party
import model.trading.securities.{Security}

/*
 * There are two main types of stock: common and preferred.
 *
 * _Common stock_ usually entitles the owner to vote at _Shareholder_'
 * meetings and to receive _Dividends_
 *
 * _Preferred stock_ generally does not have voting rights,
 */

/**
 * A type of _Security_
 *
 * that signifies ownership in a corporation and represents
 * a claim on part of the corporation's assets and earnings.
 *
 * Gives customer ownership in a Security
 *
 *
 * An Stock/Equity derivative is a class of _Derivatives_ whose
 *
 * however there are many other types of _Equity_ derivatives that are actively traded.
 *
 * An _instrument_ that signifies an _Ownership_Position_
 */
class Stock(name:String) extends Security {            // syn: Share" or "Equity.", Equity Security

  override def partyA: Party = ???

  override def partyB: Party = ???

  override def financialValue(): FinancialValue = ???
}