package model.trading.orders

/**
 * Instructs the brokerage to buy or sell a _security_ at or below a specified price.
 * Limit orders remain in effect until they are executed,
 * until the investor cancels them or until they expire.
*/
trait LimitOrder extends Order {}
