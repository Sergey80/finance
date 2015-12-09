package model.trading.assets

import model.trading.FinancialAsset
import model.trading.client.{Investor, FinancialProfessionals}

/**
 * A grouping of _Financial Assets_ such as
 *
 * Stocks, Bonds and Cash equivalents,
 *
 * as well as their mutual, exchange-traded and closed-fund counterparts.
 *
 * Portfolios are held directly by investors and/or managed by Financial Professionals.
 */
trait Portfolio {

  def assets(): Seq[FinancialAsset]

  def helBy(): Seq[Investor]

  def managedBy(): Seq[FinancialProfessionals]
}
