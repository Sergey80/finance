package model.trading.transactions

trait Act

/**
 * The _Act_ of _trading_ in an _asset+, or _conducting a financial transaction_,
 * that has a significant risk of losing most or all of the _initial outlay_,
 * in expectation of a substantial gain.
 */
trait Speculation extends Act { // FinancialTransaction

  // def asset:Asset

}
