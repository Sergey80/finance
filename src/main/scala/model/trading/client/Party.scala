package model.trading.client

/**
 * An _Option_ is a financial _derivative_ that represents a contract
 *
 * sold by one _party_ (option writer)
 * to another _party_  (option holder).   // _buyer_
 *
 * The contract offers the _buyer_
 *
 * the _right_, but not the _obligation_,
 *
 * to _buy_ (call) or sell (put)
 *
 * a _security_ or other financial _asset_
 * at an agreed-upon price (the _strike price_) during a
 * certain _period of time_ or on a specific date (_exercise date_).
 *
 * _Call options_ give the option to buy at _certain price_,
 * so the _buyer_ would want the _stock_ to go up.
 *
 * _Put options_ give the option to sell at a certain price,
 * so the _buyer_ would want the _stock_ to go down.
 */

trait Party
