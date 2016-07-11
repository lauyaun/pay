package com.boyuanitsm.pay.wechat.scan.protocol.unified_order_protocol;

import com.boyuanitsm.pay.wechat.scan.common.Configure;
import com.boyuanitsm.pay.wechat.scan.common.RandomStringGenerator;

/**
 * 统一下单, 请求参数。应用场景: 除被扫支付场景以外，商户系统先调用该接口在微信支付服务后台生成预支付交易单，返回正确的预支付交易回话标识后再按扫码、JSAPI、APP等不同场景生成交易串调起支付。
 * 接口链接: https://api.mch.weixin.qq.com/pay/unifiedorder
 *
 * @see <a href="https://pay.weixin.qq.com/wiki/doc/api/native.php?chapter=9_1">https://pay.weixin.qq.com/wiki/doc/api/native.php?chapter=9_1</a>
 * @author hookszhang on 7/8/16.
 */
public class UnifiedOrderReqData {

    private String appid;
    private String mch_id;
    private String device_info;
    private String nonce_str;
    private String sign;
    private String body;
    private String detail;
    private String attach;
    private String out_trade_no;
    private String fee_type;
    private int total_dee;
    private String spbill_create_ip;
    private String time_start;
    private String time_expire;
    private String goods_tag;
    private String notify_url;
    private String trade_type;
    private String product_id;
    private String limit_pay;
    private String openid;

    /**
     * 扫码支付 统一下单构造器, 只有必填字段
     *
     * @param body 商品描述
     * @param out_trade_no 商户订单号
     * @param total_dee 总金额, 单位为分
     * @param notify_url 通知地址
     * @param product_id 商品ID
     */
    public UnifiedOrderReqData(String body, String out_trade_no, int total_dee, String notify_url, String product_id) {
        this.appid = Configure.getAppid();
        this.mch_id = Configure.getMchid();
        this.device_info = "WEB";
        this.nonce_str = RandomStringGenerator.getRandomStringByLength(24);
        this.body = body;
        this.out_trade_no = out_trade_no;
        this.total_dee = total_dee;
        this.spbill_create_ip = Configure.getIP();
        this.notify_url = notify_url;
        this.trade_type = "NATIVE";
        this.product_id = product_id;
    }

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public String getMch_id() {
        return mch_id;
    }

    public void setMch_id(String mch_id) {
        this.mch_id = mch_id;
    }

    public String getDevice_info() {
        return device_info;
    }

    public void setDevice_info(String device_info) {
        this.device_info = device_info;
    }

    public String getNonce_str() {
        return nonce_str;
    }

    public void setNonce_str(String nonce_str) {
        this.nonce_str = nonce_str;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getAttach() {
        return attach;
    }

    public void setAttach(String attach) {
        this.attach = attach;
    }

    public String getOut_trade_no() {
        return out_trade_no;
    }

    public void setOut_trade_no(String out_trade_no) {
        this.out_trade_no = out_trade_no;
    }

    public String getFee_type() {
        return fee_type;
    }

    public void setFee_type(String fee_type) {
        this.fee_type = fee_type;
    }

    public int getTotal_dee() {
        return total_dee;
    }

    public void setTotal_dee(int total_dee) {
        this.total_dee = total_dee;
    }

    public String getSpbill_create_ip() {
        return spbill_create_ip;
    }

    public void setSpbill_create_ip(String spbill_create_ip) {
        this.spbill_create_ip = spbill_create_ip;
    }

    public String getTime_start() {
        return time_start;
    }

    public void setTime_start(String time_start) {
        this.time_start = time_start;
    }

    public String getTime_expire() {
        return time_expire;
    }

    public void setTime_expire(String time_expire) {
        this.time_expire = time_expire;
    }

    public String getGoods_tag() {
        return goods_tag;
    }

    public void setGoods_tag(String goods_tag) {
        this.goods_tag = goods_tag;
    }

    public String getNotify_url() {
        return notify_url;
    }

    public void setNotify_url(String notify_url) {
        this.notify_url = notify_url;
    }

    public String getTrade_type() {
        return trade_type;
    }

    public void setTrade_type(String trade_type) {
        this.trade_type = trade_type;
    }

    public String getProduct_id() {
        return product_id;
    }

    public void setProduct_id(String product_id) {
        this.product_id = product_id;
    }

    public String getLimit_pay() {
        return limit_pay;
    }

    public void setLimit_pay(String limit_pay) {
        this.limit_pay = limit_pay;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }
}