package model.trading.transactions

object TransactionType extends Enumeration {
  type TransactionType = Value
  val Solicited,Unsolicited   = Value

  // Unsolicited orders:  in which the client has initiated a transaction in a security without any prior recommendation from the advisor with respect to that security
  // Solicited orders: in which an advisor recommends a transaction to a client, provides additional information about a transaction to a client necessary for the client to make an informed investment decision, or promotes a security by describing its merits in a positive fashion, and the client follows the advisor’s recommendation.
}
