package model.trading.position

// #stock-market

/**
 * Position is a binding commitment to buy or sell a given amount of financial instruments,
 * such as securities, currencies or commodities, for a given price (in: financial trading)
 *
 * In online trading, a position refers to the _state of a trade_
 * after a trader has _entered_ (executed) the _market_.
 *
 * When a trader enters the market, they are said to "open" a position in the market.
 *
 * When a trader exists the market, they are said to "close" the position.
 *
 * An open position means that the trader holds a certain quantity of a given financial instrument.
 *
 * In order to close a position, the position must be bought or sold back to the market.
 *
 * So to "close" a _long position_, traders would sell the asset back to the market.
 * And to close a short position, the trader would buy the asset.
 *
 * (
 *   The term "position" is also used in the context of finance for the amount of securities
 *   or commodities held by a person, firm, or institution, and for the ownership status
 *   of a person's or institution's investments.  (in: finance)
 * )
 */
trait Position {
 var state: PositionState
}

/**
 * when you sell shares that you don't own in anticipation that the stock will fall in the future.
 * If it works as planned and the share price drops, you must buy those shares at the lower
 * price to cover the short position
 */
trait ShortPosition extends Position {  // also: Short Selling

}

/**
 * A _long position_ is buying a stock or any other security in anticipation that its price will rise.
 *
 * The overall objective is to buy the stock at a low price and sell it for more than you paid.
 * The difference represents your profit.
 */
trait LongPosition extends Position {  // open _long position_
                                       // close _long position_
}

/**
 * When a trader buys an _option contract_ that he/she is not short/sell,
 * he/she is said to be opening a long position.
 *
 * When a trader sells an _option contract_ that he/she is already long/buy,
 * he/she is said to be closing a long position.
 *
 * When a trader is 'long', he/she wins when the price increases,
 * and loses when the price decreases
 * */

trait PositionState
 /** a ​situation in which someone could ​lose ​money
  * because of ​changes in the ​value of ​shares, ​currencies, etc. that they have ​traded
  * but for which the ​sale is not complete
  */
case object OpenPositionState
case object ClosePositionState
