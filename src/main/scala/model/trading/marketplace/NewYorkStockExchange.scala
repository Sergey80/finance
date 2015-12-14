package model.trading.marketplace

import model.trading.Price
import model.trading.securities.equitysecurties.Stock

/**
 * Created by serge on 13/12/15.
 */
object NewYorkStockExchange extends StockExchange {

  override def name()     : String = "New York Stock Exchange"

  override def location() : String = "11 Wall St, New York, NY 10005, United States"

  override def stocks()   : Seq[Stock] = Seq() // TODO:

  override def indices()  : Seq[String] = Seq(
    "Dow Jones Industrial Average",
    "S&P 500",
    "NYSE Composite")

  override def volume(): Price = Price("20,000,000,000,000,000,000") //US$ 20.161 trillion
}

// Indices:
/*
 * The Dow Jones Industrial Average (DJIA) is one of the oldest,
 * most well-known and most frequently used indexes in the world.
 * It includes the stocks of 30 of the largest and most influential companies in United States.
 *
 * The Standard & Poor's 500 Stock Index is a larger and more diverse index than the DJIA.
 * Made up of 500 of the most widely traded stocks in the U.S.,
 * it represents about 70% of the total value of U.S. stock markets.
 * In general, the S&P 500 index gives a good indication of movement in the U.S. marketplace as a whole.
 */