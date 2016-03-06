package model.trading.orderticket.tickets

case class OptionField[T](
                           value: T,
                           options: Set[T]
                        )
