package model.trading.securities.derivatives.options.ticket

import model.trading.account.AccountType._
import model.trading.account.{AccountType, Account}
import model.trading.securities.derivatives.options.OptionType
import model.trading.securities.derivatives.options.ticket.TransactionType.TransactionType
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


class OptionOrderTicket {

  val side          : OrderSide.Value   = OrderSide.Buy
  // underlying security can be any asset, index, financial instrument or even another derivative
  val underlying    : Security          = new Stock("Google")
  val quantity      : Int               = 1 // "Number of contracts (1 contract = 100 securities)"
  val optType       : OptionType.Value  = OptionType.CALL
  val expiration    : Date              = "17 Jun 2016"
  val exercisePrice : Price             = 100.00
  val indication    : String            = "if transaction is opening or closing the contracts"
  val covered                           = "If an opening sale, a notation regarding covered or uncovered is required"
  val account       : Account           = Account(name = "ABC", number = "101-131315-434")
  val accountType   : AccountType.Value = AccountType.Cash
  val price                             = "Price and time limits if any"
  val transactionType                   = TransactionType.Solicited
  val d                                 = "Discretionary authority exercised or discretionary authority not exercised, if applicable"

  val timeEntered   : String            = ""
  val timeExecuted  : String            = ""
  val timeChanged   : String            = ""
  val timeCanceled  : String            = ""

}
