package com.test.www.test;





import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * 支付相关
 * 
 * @author hou
 *
 */
@Controller
public class FastShopPayController {



	
	
	/**
	 * 再次支付
	 * 
	 * @param session
	 * @return ModelAndView
	 */
	@RequestMapping(value = "shop/fastpay/fastpayagain", method = RequestMethod.GET)
	public ModelAndView payAgain(HttpSession session, @RequestParam(value="code") String code, @RequestParam int id){

		Map<String, Object> data = new HashMap<String, Object>();
		System.out.println("测试 CODE");
		System.out.println(code);
//		int uid = (Integer) session.getAttribute(SessionKey.USER_ID.getKey());
//		ShopOrderBean order = shopOrderClient.get(id);
//		if (order == null){
//			// 订单有风险页面
//			return new ModelAndView("/shop/order/orderError", data);
//		}
//		if (order.getUid() != uid){
//			// 订单有风险页面
//			return new ModelAndView("/shop/order/orderError", data);
//		}
//		if (!order.getCode().equals(code)){
//			// 订单有风险页面
//			return new ModelAndView("/shop/order/orderError", data);
//		}
//		
//		
//		//如果支付成功就跳转到订单index
//		List<ShopWalletPayHistoryBean> listWalletPayHistory = payHistoryClient.getWalletByOrderId(order.getCode());
//		if(listWalletPayHistory!=null&&!listWalletPayHistory.isEmpty()){
//			if(WalletHistoryStatusEnum.SUCCESS.getStatus()==listWalletPayHistory.get(0).getStatus())
//				return new ModelAndView("manage/order/index");
//		}
//		
//		List<ShopOrderChildBean> orderChildList = orderDetailClient.getListByOrderId(order.getId());
//		/*//重新生成订单号
//		String newCode = OrderUtil.makeOrderCode();
//		shopOrderClient.updateCode(order.getId(),newCode);*/
//		
//		data.put("order", order);
//		data.put("orderDetailList", orderChildList);
//		data.put("orderStep", OrderStep.THREE.getValue());
//
//		ShopWalletBean wallet = walletClient.get(uid);
//		data.put("wallet", wallet);
//		SqUserBean user = agencyUserClient.get(uid);
//		data.put("user", user);
//		boolean isGeneralAgent= sqGeneralAgentClient.isGeneralAgent(uid);
//		if(isGeneralAgent){//是否是运营部
//		data.put("payOperating", Operating.YES.getValue());
//		}else{
//	    data.put("payOperating", Operating.NO.getValue());
//		}
		
		return new ModelAndView("shop/pay/fastPay", data);
	}
	
	
	

}
