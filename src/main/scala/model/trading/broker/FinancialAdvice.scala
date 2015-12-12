package model.trading.broker

import model.trading.broker.AdviceType.AdviceType

/**
 Advice - The process of defining and implementing an appropriate
 _Investment Strategy_ given an investor's objectives and particular constraints.
*/

object AdviceType extends Enumeration {
 type AdviceType = Value
 val Purchase, Sale = Value
}

/**
 * Advice without executing the _Trade_.
 * Suppose to be less costly/expensive since it does not include the handling/executing a _Trade_ related to it
 */
class InvestmentAdvice(theAdviceType:AdviceType) {
 //val trades: Seq[Trade] = _
 val adviceType:AdviceType = theAdviceType
}

/**
 * Advice with handling/executing the Purchase or Sale of a Security
 */
class InvestmentAdviceExecuted(theAdviceType:AdviceType) extends InvestmentAdvice(theAdviceType)

