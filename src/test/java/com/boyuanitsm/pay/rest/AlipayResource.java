package com.boyuanitsm.pay.rest;

import com.boyuanitsm.pay.alipay.bean.SyncReturn;
import com.boyuanitsm.pay.alipay.bean.AyncNotify;
import com.boyuanitsm.pay.alipay.util.AlipaySubmit;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Rest controller Alipay Resource
 *
 * @author hookszhang on 7/15/16.
 */
@RestController
@RequestMapping("api/alipay")
public class AlipayResource {

    private static Logger log = LoggerFactory.getLogger(AlipayResource.class);

    @RequestMapping(value = "pay", method = RequestMethod.POST)
    public void pay(String WIDout_trade_no, String WIDsubject, String WIDtotal_fee, String WIDbody, HttpServletResponse response) throws IOException {
        //建立请求
        String sHtmlText = AlipaySubmit.buildRequest(WIDout_trade_no, WIDsubject, WIDtotal_fee, WIDbody);
        response.setHeader("Content-Type", "text/html;charset=UTF-8");
        response.getWriter().println(sHtmlText);
    }

    @RequestMapping(value = "aync_notify", method = RequestMethod.POST)
    @ResponseBody
    public String ayncnotify(AyncNotify ayncNotify) {
        log.info("Alipay aync notify: {}", ayncNotify);
        return "success";
    }

    @RequestMapping(value = "sync_return", method = RequestMethod.GET)
    public String syncreturn(SyncReturn ayncReturn) {
        log.info("Alipay sync return: {}", ayncReturn);
        return ayncReturn.toString();
    }
}