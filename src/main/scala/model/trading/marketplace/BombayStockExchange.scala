package model.trading.marketplace

import model.trading.Price
import model.trading.securities.equitysecurties.Stock

object BombayStockExchange extends StockExchange {

  override def name(): String = "Bombay Stock Exchange (BSE)"

  override def location(): String = "18.929681°N 72.833589°E"

  override def stocks(): Seq[Stock] = Seq()

  override def indices(): Seq[String] = Seq("SE SENSEX", "BSE Small Cap", "BSE Mid-Cap", "BSE 500")

  override def volume(): Price = Price("93,000,000,000,000")
}
