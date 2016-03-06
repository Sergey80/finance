package model.trading.orders.stock

import model.trading._
import model.trading.orders.{Order, TimeInForce, OrderSide}

// TODO: show the difference between StockOrder and OptionOrder.
case class StockOrder(
                       side        : OrderSide.Value,
                       price       : Price,
                       timeInForce : TimeInForce.Value,
                       symbol      : String,
                       quantity    : Long
                       ) extends Order
