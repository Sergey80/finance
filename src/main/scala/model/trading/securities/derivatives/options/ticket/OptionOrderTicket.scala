package model.trading.securities.derivatives.options.ticket

import model.trading.account.{AccountType, Account}
import model.trading.securities.derivatives.options.OptionType
import model.trading.{Price, Date}
import model.trading.orders.OrderSide
import model.trading.securities.Security
import model.trading.securities.equitysecurties.Stock


object TransactionType extends Enumeration {
  type TransactionType = Value
  val Solicited,Unsolicited   = Value

  // Unsolicited orders:  in which the client has initiated a transaction in a security without any prior recommendation from the advisor with respect to that security
  // Solicited orders: in which an advisor recommends a transaction to a client, provides additional information about a transaction to a client necessary for the client to make an informed investment decision, or promotes a security by describing its merits in a positive fashion, and the client follows the advisor’s recommendation.
}

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
  price          : String            = "Price and time limits if any",

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

}