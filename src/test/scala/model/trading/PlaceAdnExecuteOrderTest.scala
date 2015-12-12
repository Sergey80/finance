package model.trading

import model.trading.orders.{Orders, Order}
import org.scalatest.{FeatureSpec, ShouldMatchers, GivenWhenThen}

// http://www.investopedia.com/articles/01/022801.asp

class PlaceAdnExecuteOrderTest extends FeatureSpec with GivenWhenThen with ShouldMatchers {

  Given("")

    import model.trading.broker._

    val broker = new Broker() {
      override def place(order: Order*): Unit = ???
      override def execute(order: Order*): Unit = ???
    }

    val marketOrder = Orders.marketOrder()

  When("placing an order")

    broker.place(marketOrder)

    // broker.execute(marketOrder)  // it will be executed immediately

  Then("check that...")

    // marketOrder should be executed immediately after it was placed

    // order should be "filled" - there are variety of possible ways in which an order can be filled,
    // there is the associated time delays

   // How and where your order is executed can affect the cost of your transaction
   // and the price you pay for the stock.
}
