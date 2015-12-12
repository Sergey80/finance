package model.trading.orders

/*
 * An _Investor_'s _instructions_ to a _broker_ or _brokerage firm_
 * to purchase or sell a _Security_.
 *
 * _Orders_ fall into different available types, which allow _investors_
 * to _place_ _restrictions_ on their _orders_
 * affecting the price and time at which the order can be _executed_.
 *
 * in real life: order could be "placed" online or over the phone
 */
trait Order {  // syn to "Trade" ?
  var aState: OrderState = _
  def state(): OrderState = aState // "Liquidity" helps ensure that your order will be in that state
}

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







