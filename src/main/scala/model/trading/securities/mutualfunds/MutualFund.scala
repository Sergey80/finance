package model.trading.securities.mutualfunds

import model.trading.InvestmentVehicle
import model.trading.client.Investor


/**
 * An investment vehicle that is made up of a pool of funds collected
 * from many investors for the purpose of investing in securities such as
 * stocks, bonds, money market instruments and similar assets.
 *
 * Mutual funds are operated by money managers,
 * who invest the fund's capital and attempt to produce capital gains and income
 * for the fund's investors.
 *
 * A mutual fund's portfolio is structured and maintained to match the investment
 * objectives stated in its prospectus.
 */
trait MutualFund extends InvestmentVehicle {

  def investors: Seq[Investor]

}
