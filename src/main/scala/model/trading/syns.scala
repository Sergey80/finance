package model

import model.trading.assets.{Asset, FixedAsset}
import model.trading.brocker.{Commission, DiscountBroker}
import model.trading.company.Company
import model.trading.securities.equitysecurties.Stock
import model.trading.transactions.Trade

package object trading {

  type FinancialAsset = Asset

  type StockBroker = DiscountBroker
//  val StockBroker = Broker
  
  type Price = BigDecimal
  val Price = BigDecimal

  type Money = BigDecimal
  val Money = BigDecimal

  type Time = Long
  type Date = String

  // synonyms

  type  ServiceCharge = Commission


  //type  InvestmentAdvisor = FinancialAdvisor  // in return to InvestmentAdvice

  // FullServiceBroker      // A broker that provides a large variety of services to its clients, including research and advice, retirement planning, tax tips, and much more.

  type Share = Stock
  //type Equity = Stock

  type  Plant = FixedAsset

  type Corporation = Company


  type Transaction = Trade
}
