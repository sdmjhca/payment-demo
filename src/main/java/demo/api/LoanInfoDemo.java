package demo.api;

import com.alibaba.fastjson.JSONObject;
import demo.dto.BaseDto;
import demo.dto.LoanReqDto;
import demo.utils.HttpClientUtil;
import demo.utils.RSAUtils;
import demo.utils.StringUtils;
import org.junit.Test;

import java.util.UUID;
import static demo.utils.StaticParams.*;

/**
 * Created by zhangye on 2017/4/17.
 */
public class LoanInfoDemo {

	/**
	 *
	 * 支付平台的私钥：MIICdgIBADANBgkqhkiG9w0BAQEFAASCAmAwggJcAgEAAoGBAJjYE0W2+aLe+HsTXKCKrMVhO00uqqMV3ynt1UAMpflgAASk4uK7Omi9z8OgMu1aatSwTvn2Bj0XchhAm4AlMpeEVnjwWnHyjWJ8ddvYDCwTBEADhh3mhvS+JNh28NhThlf8aZGf0wOLZPNvrWhoVHdVInUO7V5c32aHH8VDeeZdAgMBAAECgYAB/UX68U+8e/R1/aGGAWgQRZy0+3eDGeTGse7Fn6SFY2d8p/zAALnY5SeQH0SqbDPZwtW0USxxnR2CDU041MMcyo/jIMQ9+MCllp160jFgO/5T6VavxO8Sz5nmmlnm4uXhyklKkXD5WcTOtg1H/oT6DI14zmjoxjro8MkwQxMl7QJBAN5ph/6kYnyqbVa/n9Z7vwjCmciXwOMoXw/lN/OaQKb6Mqt3GqsXigin5Gb3Ku1qLAOskSJQhxhLVUMTY1l9SoMCQQCv7QjB4afr8nYefRTJ+71cUeJakGTuG7wxfH1S3iyXm9hviN35+MLRBYsGUC+8DKMX+1W0RqboPK6eWEw5/rWfAkAWY18aJef4DpvFALMRPxGiyxv50jTLaPPwwK0aK2vYoxTYp7uaf1sYtfXK25SJo4dcs1FEuABxVJv3jYsRpggLAkArA7HYdeww7J+k5MBognzSTdMigZur/GwPTXj3Agu1Jg3Nd5GOxRwdL1XGvWRufkiCXJmf8oZs0il/3ecFZxnRAkEA1A7yiMZxgIctk6LWCQpDddOqyVk0SbwlGjUoC+FKUs/kXCGyK0R6tJ+f9aZC+JJ3RFjTFY+e8pfe92Tcs8/Unw==
	 * 支付平台的公钥：MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCY2BNFtvmi3vh7E1ygiqzFYTtNLqqjFd8p7dVADKX5YAAEpOLiuzpovc/DoDLtWmrUsE759gY9F3IYQJuAJTKXhFZ48Fpx8o1ifHXb2AwsEwRAA4Yd5ob0viTYdvDYU4ZX/GmRn9MDi2Tzb61oaFR3VSJ1Du1eXN9mhx/FQ3nmXQIDAQAB
	 * 业务系统的私钥：MIICdgIBADANBgkqhkiG9w0BAQEFAASCAmAwggJcAgEAAoGBAIcUeyw0vgpVTeucmWF7zITZ1zWQFxFl5x0JAnJQM2q2RImw05ngahUeOrwABcW05o2sb8Y1pinZzA9zACdh4CTWMKz8twEAoWlXExR8wo+1j8pi/zNv+Hy5jX013/Zup+T/tThQeZPnYlc2jBS3xhHWLR4trSsnzhyYKYZ4JsMNAgMBAAECgYB2SbsrFOyuQ9E+WB4AvdZ1KAZLg2iP9bqTNIaN8Cl2czJFmTFTeK+s2pH4e9SSMz4KJkyjN+vQjkch6ETkN9N9Z7yGmtVjhOpW5d4SfzopvNAFtrAxM1isabBrpCSKjacQDf/c183WkybsuiA5K/4b5Wfl48KmRFLL/EqJOOqfQQJBAMoKmjS7xyD7ZD7+4R5WieLS/sXt8Z3ZwcSKnGr9PSLHe1qb3yBGKMKncu6H8jSMFbWjJ84kfIeSVHJ6T/nBsXUCQQCrJ8jlmbjsEVhpBMGNc+VjtifN5Q1Pt14sON+cxSDdPm2HqKGojn7dQ0hpHECl7xuheyWmN0PiwXoNnvyq5UA5AkEAgXPPoDAcg3Zvoalfhje+e1XjpeAyaohmjc6eMDL34/vafpDWovAxF5+AlXMHbkG/ezUBwSRBof/RGdRiv80qLQJANPfZCoVqX1R24flg1R/668LhyqyKVBNRh6oKOgAfzZiWWRdtADcpN9ysuirOLwwypuTvn+MWlUR/O1vqohDUsQJANTJX4GE2Qr/QgqyGHif/yDSo8rXQems37x2efCgiyUkkgv3ZQjuTXWSrCoeCY55xgrGiWNhKIf3O85fDTE8gXg==
	 * 业务系统的公钥：MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCHFHssNL4KVU3rnJlhe8yE2dc1kBcRZecdCQJyUDNqtkSJsNOZ4GoVHjq8AAXFtOaNrG/GNaYp2cwPcwAnYeAk1jCs/LcBAKFpVxMUfMKPtY/KYv8zb/h8uY19Nd/2bqfk/7U4UHmT52JXNowUt8YR1i0eLa0rJ84cmCmGeCbDDQIDAQAB
	 */
	@Test
	public void test(){
		//封装公用信息dto
		BaseDto baseDto = new BaseDto();
		baseDto.setMerchantId("ZRMX001");
		baseDto.setInterfaceCode("10026");
		baseDto.setBusinessId("1800004");
		baseDto.setVersion("1.0.0");
		baseDto.setContentEncoding("utf-8");
		//封装放款信息dto
		LoanReqDto loanReqDto = new LoanReqDto();
		loanReqDto.setApplyDate("123");
		loanReqDto.setBelongOrg("sdmjhca");
		loanReqDto.setContractNo(UUID.randomUUID().toString());
		loanReqDto.setLoanAccount("me");
		loanReqDto.setLoanAmount("111");
		//待加密内容
		String param = JSONObject.toJSONString(loanReqDto);
		try {
			//用支付平台的公钥加密
			byte[] bytes = RSAUtils.encryptByPublicKey(StringUtils.stringToBytes(param),PLATFORM_PUBLICKEY);
			//最终的请求参数：
			String content = StringUtils.bytesToHexString(bytes);
			//用业务系统的私钥对加密后的密文进行签名
			String sign = RSAUtils.sign(bytes,BUSI_PRIVATEKEY);

			//支付结算平台验签和解密
			//验签
			boolean flag = RSAUtils.verify(StringUtils.hexStringToBytes(content),BUSI_PUBLICKEY,sign);
			//解密
			byte[] contentAfter = RSAUtils.decryptByPrivateKey(StringUtils.hexStringToBytes(content),PLATFORM_PRIVATEKEY);
			System.out.println("是否验签通过："+flag);
			System.out.println("解密后的明文："+StringUtils.bytesToString(contentAfter));

			//封装签名和加密报文
			baseDto.setContent(content);
			baseDto.setSign(sign);
			//请求支付结算系统
			String url = "http://localhost:6101/api/accept/loanInfo";
			String result = HttpClientUtil.post(url,JSONObject.toJSONString(baseDto));
			System.out.println("请求结果="+result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
