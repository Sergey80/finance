package model.trading.client

import model.trading.assets.{Asset, Portfolio}

trait Investor extends Entry {

  def portfolios(): Seq[Portfolio] = Seq[Portfolio]()

  def assets(): Seq[Asset]

}
