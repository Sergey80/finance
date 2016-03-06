package model.trading.orderticket.tickets.options

import model.trading.account.{Account, AccountType}
import model.trading.orderticket.orders.options.OptionOrder
import model.trading.orderticket.orders.{Order, OrderSide, TimeInForce}
import model.trading.securities.derivatives.options.OptionType
import model.trading.transactions.TransactionType
import model.trading.{Date, Price}


// this information may be shown to the user on Order Ticket page
case class QuoteDetails(
                         bid      : Price,
                         ask      : Price,
                         bidSize  : Price,
                         askSize  : String,
                         currency : String
                         )


/*
 * A form detailing an order instruction that a customer gives an account executive.
 * --
 * Prior to transmitting a customer’s option order,
 * the representative must fill out the appropriate order ticket and present it
 * to the trading department or wire room for execution.
 */
case class OptionOrderTicket(

  side          : OrderSide.Value    = OrderSide.Buy,
  // underlying security can be any asset, index, financial instrument or even another derivative
  underlyingName : String            =  "Google", //new Stock("Google"),
  quantity       : Long              = 1, // "Number of contracts (1 contract = 100 securities)"
  optType        : OptionType.Value  = OptionType.CALL,
  expiration     : Date              = "17 Jun 2016",
  exercisePrice  : Price             = 100.00,

  // TODO:
  indication     : String            = "if transaction is opening or closing the contracts",
  covered        : String            = "If an opening sale, a notation regarding covered or uncovered is required",

  account        : Account           = Account(name = "ABC", number = "101-131315-434"),
  accountType    : AccountType.Value = AccountType.Cash,

  // TODO:
  price          : Price            = "Price and time limits if any",

  transactionType: TransactionType.Value  = TransactionType.Solicited,

  // TODO:
  d              : String            = "Discretionary authority exercised or discretionary authority not exercised, if applicable",

  // TODO:
  timeEntered    : String            = "",
  timeExecuted   : String            = "",
  timeChanged    : String            = "",
  timeCanceled   : String            = ""

)


object OptionOrderTicket {

    def submit(ticket: OptionOrderTicket): Order = {

      // convert ticket to order

      val order = OptionOrder(
        side = ticket.side,
        price = ticket.price,
        timeInForce = TimeInForce.Day,
        symbol = ticket.underlyingName,
        quantity = ticket.quantity
      )

      order
    }

}