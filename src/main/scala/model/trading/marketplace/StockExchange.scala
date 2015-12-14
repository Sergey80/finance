package model.trading.marketplace

import model.trading.Price
import model.trading.securities.Security
import model.trading.securities.equitysecurties.Stock
import model.trading.transactions.Trade

// https://en.wikipedia.org/wiki/Stock_market

/**
 * The core function of an exchange - such as a stock exchange -
 * is to ensure fair and orderly trading, as well as efficient dissemination of price
 * information for any securities trading on that exchange. Exchanges give companies,
 * governments and other groups a platform to sell securities to the investing public.
 */
trait StockExchange {  // syn: Bourse, StockMarket

  def name()      : String
  def location()  : String

  def stocks()    : Seq[Stock]

  def volume()    : Price  // US

  def indices()   : Seq[String]                 // http://www.investopedia.com/articles/analyst/102501.asp

  /**
   * Trade in stock markets means the transfer for money of a stock or security from a seller to a buyer.
  */
  def trade(trade : Trade): Trade = { // a trade enters market
    // TODO: ...

    // 1. finds Buyer(s) and Seller(s)
    // 2. it matches those orders (in a efficient way)
    // and for this to happen we need something that is called LIQUIDITY (fancy way to say "many buyers and many sellers")

    // TODO:
    trade
  }

}

/**
 * // http://www.yourarticlelibrary.com/economics/market/9-most-important-functions-of-stock-exchangesecondary-market/8766/
 *
 * 9 Most Important Functions of Stock Exchange/Secondary Market
 *
 * 1. Economic Barometer:
 *  A stock exchange is a reliable barometer to measure the economic condition of a country.
 *
 * 2. Pricing of Securities
 *
 * 3. Safety of Transactions
 *
 * 4. Contributes to Economic Growth
 *
 * 5. Spreading of Equity Cult
 *
 * 6. Providing Scope for Speculation
 *
 * 7. Liquidity
 *  The main function of stock market is to provide ready market for sale and purchase of securities.
 *  The presence of stock exchange market gives assurance to investors that their investment can be converted into cash whenever they want.
 *
 * 8. Better Allocation of Capital
 *
 * 9. Promotes the Habits of Savings and Investment
 */




