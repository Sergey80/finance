package model.trading.broker

import model.trading.orders.Order

/**
 * A _Stockbroker_
 * who carries out Buy and Sell orders at a
 *  Reduced Commission compared to a Full-Service Broker
 *
 *  But provides NO _Investment Advice_.
 */



trait Broker {

  /**
   *  When an investor places a trade( = transaction?), the order goes to a broker.
   *
   *  The broker then looks at the size and availability of the order
   *  to decide which _path_ is the best way for it to be executed.
   *
   *  A broker can attempt to _fill_ your _order_ in a number of ways,
   *
   *  A broker may have different motives redirect your order(s) to specific places / paths:
   *
   *  - Order to the Floor
   *  - Order to Third Market Maker
   *  - Internalization
   *  - Electronic Communications Network  (limit orders)
   *  - Order to Market Maker
   *
   */

  def place(order : Order *) // when one/investor asks a broker to place the order for him

  def execute(order : Order *)
}


/**
  Order to the Floor -
    For stocks trading on exchanges such as the New York Stock Exchange (NYSE), the broker can direct your order to the floor of the stock exchange, or to a regional exchange. In some instances regional exchanges will pay a fee for the privilege to execute a broker's order, known as payment for order flow. Because your order is going through human hands, it can take some time for the floor broker to get to your order and fill it.

  Order to Third Market Maker
    - For stocks trading on an exchange like the NYSE, your brokerage can direct your order to what is called a third market maker. A third market maker is likely to receive the order if: A) they entice the broker with an incentive to direct the order to them or B) the broker is not a member firm of the exchange in which the order would otherwise be directed.

  Internalization
    - Internalization occurs when the broker decides to fill your order from the inventory of stocks your brokerage firm owns. This can make for quick execution. This type of execution is accompanied by your broker's firm making additional money on the spread.

  Electronic Communications Network (ECN)
    - ECNs automatically match buy and sell orders. These systems are used particularly for limit orders because the ECN can match by price very quickly.

  Order to Market Maker
    - For over-the-counter markets such as the Nasdaq, your broker can direct your trade to the market maker in charge of the stock you wish to purchase or sell. This is usually timely, and some brokers make additional money by sending orders to certain market makers (payment for order flow). This means your broker may not always be sending your order to the best possible market maker.
*/


/**
  With the growing importance of digital technology and the internet,
  many investors are opting to buy and sell stocks for themselves rather than pay advisors
  large commissions for research and advice.
 */