package model.trading.securities.derivatives

import model.trading.securities.Security

/**
  * The security on which a derivative derives its value.
  *
  * In derivative terminology, the underlying security is often referred to simply as "the underlying."
  * An underlying security can be any asset, index, financial instrument or even another derivative.
*/

trait Derivative {

  //  underlying of a derivative is an asset, basket of assets, index, or even another derivative,

  def underlying()  : Security                  // "the underlying"

  // def derives()     // Value

}
