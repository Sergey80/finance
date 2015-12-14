package model.trading.company

import model.trading.Price
import model.trading.securities.equitysecurties.Stock

trait Company {

  var currentSharePrice = 1 // TODO: hardcoded

  // market capitalization (tells use if it is big or small company)
  // = totalNumber of outstanding shares (all shares) in the company * current share price
  def marketCapitalization(): Price = {
    Price(outstandingShares().size * currentSharePrice)    // the value of the company
  }

  // earnings pe share

  // how many shares company allow to issue (to Stock Market)
  def authorizedSharesCount(): Int

  // will be equal or low to authorizedSharesCount (all shares)
  def outstandingShares() : Seq[Stock]

  // company can do "stock split" that would double the stocks company has

  def stockSplit(): Seq[Stock]

}
