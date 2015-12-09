package model.trading.securities.debtsecurtes.core

import model.trading.securities.debtsecurtes.Debt
import model.trading.{Money, Date}

/**
 * In return for lending the money,
 *
 * the individuals or institutions become _Creditors_
 *
 * and receive a _Promise_
 *
 * that the _Principal_ and _Interest_ on the debt will be repaid.
 *
 * When a firm raises money for working capital or capital expenditures
 * by selling bonds, bills, or notes to individual and/or institutional investors.
 */
trait DebtInvestment {

  def promise() : Promise[Debt]

}

case class Promise[T](obj : T)





