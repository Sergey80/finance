package model.trading.orders

/**
 * Created by serge on 11/12/15.
 */
trait OrderState

case object Filled extends OrderState
case object FilledWithMinSlippage extends OrderState
case object FilledWithoutSubstantiallyAffectingPrice extends OrderState
