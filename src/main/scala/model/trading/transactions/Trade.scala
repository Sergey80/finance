package model.trading.transactions

/**

 * A basic economic concept that involves multiple _Parties_ participating in the voluntary
 * negotiation and then the exchange of one's goods and services for desired goods and
 * services that someone else possesses.
 *
 * The advent of money as a medium of exchange has allowed trade to be conducted in a manner
 * that is much simpler and effective compared to earlier forms of trade, such as bartering.
 *
 * In financial markets, trading also can mean performing a _Transaction_ that involves
 * the _Selling_ and _Purchasing_ of a _Security_
 *
 *
 *
 * http://www.investopedia.com/university/intro-to-order-types/long-and-short-trades.asp
 */

trait Trade {

  // var security:Security

  // val direction: Long | Short

}

/**
 * The classic method of buying with the intention of profiting from a rising _market_
 *
 * _Long trades_ can be conducted through all _brokers_ and do not necessarily require the trader
 * to have a _margin account_.
 *
 * The _losses_ from a _long trade_ are considered limited.
 * This is because if a long trade is entered at any level, price can only go as low as $0 if the trade moves in the wrong direction.
 */
trait LongTrade extends Trade //


/**
 * Entered with the intention of profiting from a falling market
 *
 * Short trading requires a _margin account_ with a _broker_,
 * since the _trader_ must borrow _shares_/_contracts_ from the _broker_
 * in order to complete the transaction.

 * Not all trading instruments can be sold short,
 * and not all brokers offer the same instruments for short sale.

 */
trait ShortTrade extends Trade

trait TradingInstrument

// relates to: LongTrade | ShortTrade (profiting from price- rising or falling)

/**
 * liquidity describes the ability to execute orders of any size quickly and efficiently
 * without causing a significant change in price.
 * In simple terms, liquidity refers to the ease with which shares (or contracts)
 * can be bought and sold.
 *
 * Markets with good liquidity typically trade with tight bid/ask spreads and with enough market depth
 * to quickly fill orders.
 */
trait Liquidity extends TradingInstrument {

  def width() : String      // How tight is the bid/ask spread

  def depth() : String      // How deep is the market (how many orders are resting beyond the best bid and best offer)

  def immediacy() : String  // How quickly can a large market order be executed

  def resiliency() : String // How long does it take the market to bounce back after a large order is filled

}

/**
 * Volatility measures the amount and speed at which a price moves up and down.
 * When a trading instrument experiences volatility,
 * it provides an opportunity to profit from the change in price.
 * Any change in price - whether rising or falling - creates an opportunity to profit;
 * it is difficult to make a profit if price stays the same
 */
trait  Volatility extends TradingInstrument


// There is the _direction_ in which a _trade_ can be established.

// we can trade _investments_ like Stocks, Options,

// for Stocks you just give a simple _Order_ buy or sell

// With Options, there are more choices.
// You can either
//  "buy to open,"
// "sell to open,"
// "buy to close"
// "sell to close."


