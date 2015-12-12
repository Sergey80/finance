package model.trading.orders

/**
 * A Market order - is an order to _buy_ or _sell_ immediately (!) at the best available price.
 *
 * These orders do not guarantee a price, but they do guarantee the order's immediate execution.

 * Instructs the brokerage to complete the order at the next available price and by the end of the day
 */
trait MarketOrder extends Order {}
