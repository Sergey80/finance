package model.trading.account

import model.trading.client.Investor

trait Account {

  def investors(): Seq[Investor] // account connects the investor

}
