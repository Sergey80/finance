package model.trading.orders

/**
 * A Market order - is an order to _buy_ or _sell_ immediately (!) at the best available price.
 *
 * These orders do not guarantee a price, but they do guarantee the order's immediate execution.

 * Instructs the brokerage to complete the order at the next available price and by the end of the day
 *
 * Market orders are filled.
 *
 * A market order is the simplest of the order types.
 *
 * This order type does not allow any control over the price received.
 *
 * The order is filled at the best price available at the relevant time.
 *
 * In fast-moving markets, the price paid or received may be quite different from the last price quoted before the order was entered.
 *
 * A market order may be split across multiple participants on the other side of the transaction, resulting in different prices for some of the shares.
 */
trait MarketOrder extends Order {}
