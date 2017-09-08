package demo.dto;


/**
 * 业务基础DTO
 *@author zhuliyu 2017/4/17
 *
 */
public class BaseDto {
    /**
     * 业务主体
     */
    private String merchantId;
    /**
     * 接口编号
     */
    private String interfaceCode;
    /**
     * 业务系统编号
     */
    private String businessId;
    /**
     * 签名
     */
    private String sign;
    /**
     * 版本
     */
    private String version;
    /**
     * 加密串
     */
    private String content;

    /**
     * 参数编码
     */
    private String contentEncoding;

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public String getInterfaceCode() {
        return interfaceCode;
    }

    public void setInterfaceCode(String interfaceCode) {
        this.interfaceCode = interfaceCode;
    }

    public String getBusinessId() {
        return businessId;
    }

    public void setBusinessId(String businessId) {
        this.businessId = businessId;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContentEncoding() {
        return contentEncoding;
    }

    public void setContentEncoding(String contentEncoding) {
        this.contentEncoding = contentEncoding;
    }
}
