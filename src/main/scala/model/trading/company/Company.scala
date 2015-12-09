package model.trading.company

import model.trading.securities.equitysecurties.Stock

trait Company {

  // market capitalization
  // earnings pe share

  // how many shares company allow to issue (to Stock Market)
  def authorizedSharesCount(): Int

  // will be equal or low to authorizedSharesCount
  def outstandingShares() : Seq[Stock]

  // company can do "stock split" that would double the stocks company has

  def stockSplit(): Seq[Stock]

}
