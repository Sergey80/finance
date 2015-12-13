package model.trading.orders

import model.trading.securities.Security
import model.trading.transactions.Trade

/*
 * An _Investor_'s _instructions_ to a _broker_ or _brokerage firm_
 * to purchase or sell a _Security_.
 *
 * _Orders_ fall into different available types, which allow _investors_
 * to _place_ _restrictions_ on their _orders_
 * affecting the price and time at which the order can be _executed_.
 *
 * in real life: order could be "placed" online or over the phone
 *
 * Order vs Trade:
 * An _Order_ is the instruction to buy or sell a _currency_ at a specified rate.
 * The _Order_ remains valid until executed or cancelled.
 */
class Order {  // syn to "Trade" ?

  // var state = Valid | NotValid

  var security : Security = _

  var aState: FilledOrderState = _

  /**
   * To conduct a _trade_ such that it satisfies a client's _order_.
   * A broker _fills_ an _order_ when he/she makes/produce the requested trade.
   * The price at which an order is filled is called a _fill price_.
   */
  def fill() : FilledOrderState = { // An executed order. Also, the price at which an order is executed.
    // TODO:
    aState
  }

  /**
   * The execution of an order happens when it is completely filled,
   * not when it is placed by the investor.
   */
  def execute() : Trade = {     // A _Trade_ is the execution of the order (a transaction).

    val trade = Trade(order = this) // executing immediately

    trade
  }

  // execute order = fill order. when order is executed it changes its state to be filled
  // ( to have with some executed price).

}

/**
 *  Fill - The _action_ of completing or satisfying an _order_ for a _security_ or _commodity_.
 *  It is the basic act in _transacting_ stocks, _bonds_ or any other type of _security_.
 *
 *  For example, if a _trader_ places a _buy order_ for a stock at $50 and a seller agrees to the price,
 *  the sale has been made and the order has been filled.
 *
 *  Order filled when (when seller agreed on that price) and whe the sale has been made.
 *
 *  The $50 price is the _execution price_, which also makes it the _fill price_ -
 *  it is the price that allows the transaction to be completed.
 */

object Orders {

  def marketOrder(): MarketOrder = new MarketOrder() {}

}


// A trade order instructs (orders) a broker to enter or exit a position.

//


/**
With the growing importance of digital technology and the internet,
  many investors are opting to buy and sell stocks for themselves rather than pay advisors
  large commissions for research and advice.
  */







