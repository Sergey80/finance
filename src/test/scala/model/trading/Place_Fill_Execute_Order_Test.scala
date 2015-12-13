package model.trading

import model.trading.orders.{MarketOrder, Orders, Order}
import model.trading.transactions.Trade
import org.scalatest.{FeatureSpec, ShouldMatchers, GivenWhenThen}

// http://www.investopedia.com/articles/01/022801.asp

class Place_Fill_Execute_Order_Test extends FeatureSpec with GivenWhenThen with ShouldMatchers {

  Given("Market Order")

    import model.trading.broker._

    val broker = new Broker(){}

    val marketOrder: MarketOrder = Orders.marketOrder()  // simplest order that is executed immediately

  When("placing market order")

   val placedOrder = broker.place(marketOrder)

   val trade = placedOrder.execute()  // should it be executed inside the "place()" since it is marketOrder

  Then("check that...")

    // marketOrder should be executed immediately after it was placed

    // order should be "filled" - there are variety of possible ways in which an order can be filled,
    // there is the associated time delays

   // How and where your order is executed can affect the cost of your transaction
   // and the price you pay for the stock.
}
