package model.trading.orders.option

import model.trading._
import model.trading.orders.{Order, TimeInForce, OrderSide}

// TODO: show the difference between StockOrder and OptionOrder.
case class OptionOrder(
                        side        : OrderSide.Value,
                        price       : Price,
                        timeInForce : TimeInForce.Value,
                        symbol      : String,
                        quantity    : Long
                        ) extends Order
