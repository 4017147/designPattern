package strategy.service;

/**
 * 具体算法实现，为新客户或者是普通客户计算应报的价格
 *
 * @since 1.0
 * @version 1.0
 * @author: tao kai (tao.kai@sccaptain.com.cn)
 */
public class NormalCustomerStrategy implements Strategy {
  public double calcPrice(double goodsPrice){
    System.out.println("对于新客户或者是普通客户，没有折扣");
    return goodsPrice;
  }
}