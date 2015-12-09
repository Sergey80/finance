package model.trading

import model.trading.client.Investor
import model.trading.securities.debtsecurtes.Bond
import model.trading.securities.equitysecurties.Stock

package object securities {

  type Equity = Stock
  type EquitySecurity = Stock
  type StockOption = Stock
  type Share = Stock

  type Sept = Bond
  type DebtSecurity = Bond
  type Liability = Bond

  type User = Investor
  type Customer = Investor
  type Client = Investor
  type Individual = Investor
  type Person = Investor

}
