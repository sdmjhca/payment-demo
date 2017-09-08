package demo.dto;

/**
 * @author JHMI on 2017/9/5.
 * 接受放款信息Dto
 */
public class LoanReqDto{
    /**
     * 合同编号
     */
    private String contractNo;
    /**
     * 放款账号
     */
    private String loanAccount;
    /**
     * 放款金额
     */
    private String loanAmount;
    /**
     * 申请时间
     */
    private String applyDate;
    /**
     * 所属部门
     */
    private String belongOrg;
    /**
     * 收款账号
     */
    private String receAccount;
    /**
     * 收款户名
     */
    private String receName;
    /**
     * 收款银行
     */
    private String receBank;
    /**
     * 收款银行支行
     */
    private String receBranchBank;
    /**
     * 收款省/直辖市
     */
    private String receProvice;
    /**
     * 收款市县
     */
    private String receCity;
    /**
     * 贷款类型
     */
    private String loanType;
    /**
     * 贷款期数
     */
    private String period;


    public String getReceBranchBank() {
        return receBranchBank;
    }

    public void setReceBranchBank(String receBranchBank) {
        this.receBranchBank = receBranchBank;
    }

    public String getLoanType() {
        return loanType;
    }

    public void setLoanType(String loanType) {
        this.loanType = loanType;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public String getContractNo() {
        return contractNo;
    }

    public void setContractNo(String contractNo) {
        this.contractNo = contractNo;
    }

    public String getLoanAccount() {
        return loanAccount;
    }

    public void setLoanAccount(String loanAccount) {
        this.loanAccount = loanAccount;
    }

    public String getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(String loanAmount) {
        this.loanAmount = loanAmount;
    }

    public String getApplyDate() {
        return applyDate;
    }

    public void setApplyDate(String applyDate) {
        this.applyDate = applyDate;
    }


    public String getBelongOrg() {
        return belongOrg;
    }

    public void setBelongOrg(String belongOrg) {
        this.belongOrg = belongOrg;
    }

    public String getReceAccount() {
        return receAccount;
    }

    public void setReceAccount(String receAccount) {
        this.receAccount = receAccount;
    }

    public String getReceName() {
        return receName;
    }

    public void setReceName(String receName) {
        this.receName = receName;
    }

    public String getReceBank() {
        return receBank;
    }

    public void setReceBank(String receBank) {
        this.receBank = receBank;
    }

    public String getReceProvice() {
        return receProvice;
    }

    public void setReceProvice(String receProvice) {
        this.receProvice = receProvice;
    }

    public String getReceCity() {
        return receCity;
    }

    public void setReceCity(String receCity) {
        this.receCity = receCity;
    }
}
