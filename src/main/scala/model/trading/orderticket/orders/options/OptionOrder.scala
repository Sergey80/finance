package model.trading.orderticket.orders.options

import model.trading._
import model.trading.orderticket.orders.{Order, TimeInForce, OrderSide}

// TODO: show the difference between StockOrder and OptionOrder.
case class OptionOrder(
                        side        : OrderSide.Value,
                        price       : Price,
                        timeInForce : TimeInForce.Value,
                        symbol      : String,
                        quantity    : Long
                        // TODO: add all opt fields
                        ) extends Order
