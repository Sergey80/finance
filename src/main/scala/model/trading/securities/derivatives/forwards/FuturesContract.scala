package model.trading.securities.derivatives.forwards

import model.trading.securities.derivatives.Derivative

/**
  *
  * _Future Contract_ vs _Option_
  * A futures owner has the obligation to buy or sell a specified quantity of an asset at
  * a specified price on a specified date. In contrast, an options holder has the right (but not the obligation)
  * to buy or sell a specified quantity of an asset at a particular price over a specified time period.
 */
trait FuturesContract extends Derivative {

}
