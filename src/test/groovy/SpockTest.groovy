package groovy

import com.wimm.model.Account
import spock.lang.Specification

class SpockTest extends Specification {
  def "length of Spock's and his friends' names"() {
    expect:
    account.doTransaction(value) == newBalance

    where:
    account                     |   value   |   newBalance
    new Account(balance: 10.0)  |   10.0    |   20.0
    new Account(balance: 10.0)  |   -10.0   |   0.0
  }
}  