package model.trading.orderticket.orders.stocks

import model.trading._
import model.trading.orderticket.orders.{Order, TimeInForce, OrderSide}

// TODO: show the difference between StockOrder and OptionOrder.
case class StockOrder(
                       side        : OrderSide.Value,
                       price       : Price,
                       timeInForce : TimeInForce.Value,
                       symbol      : String,
                       quantity    : Long
                       ) extends Order
