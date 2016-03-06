package model.trading

import model.trading.orderticket.tickets.options.OptionOrderTicket

object EndToEndOptionTest extends App {

  // 2. Order Ticket  (instructing to execute)
  // 3. Executing order -> Order (executed)

  val optionOrderTicket = OptionOrderTicket()

  OptionOrderTicket.submit(ticket = optionOrderTicket)

}
