package model.trading.broker

import model.trading.securities.Security


trait FinancialAdvisor {

  def giveAdviceFor(security:Security): InvestmentAdvice = {
    
    // TODO:
    new InvestmentAdvice(AdviceType.Purchase) //AdviceType.Sale
  }

}
