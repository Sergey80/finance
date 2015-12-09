package model.trading.securities.debtsecurtes

import model.trading.securities.Security
import model.trading.securities.debtsecurtes.core.DebtInvestment

// Gives a customer lownership position

trait Bond extends Security with DebtInvestment  { // Syn: Bond DebsSecurity

}
