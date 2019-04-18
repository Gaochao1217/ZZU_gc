package alipay.config;

public class AlipayConfig {
    // 商户appid
    public static String app_id = "2016091400506483";
    // 私钥 pkcs8格式的
    public static String merchant_private_key = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQCgkMExZPXypEs2RfHEazu84hks6z5te2se2KL22x/d+dU+sG3fKMBczFYIGudKdyq4TLQJ2KM0Rp5AumHWDXTSG9VmCDS7xsV21aOZs11XCh9ZBrzCK2Kjsyf4G5Eth1pVY17VxxiQoaOqt2qV0NgHvHsoERWLWXwfr1GkQRj/f35yhahU1Q0aeif++QMagFdB2uzJcV0DbpYa+xi4FsjCQufE2p8FE2laoMbDRmnrVWObGL2NCldMQX5d8OdokM2ciI3sCMlW07w7aFYZC/l6fznLJEd3TMSZQGUb++RgsHV+cujWybe/bLLYz1hByHgg5LkqSwCt+9Ks04lvDrIHAgMBAAECggEAfytm9/ogmbbqIugu3gSYYbcpfVwsK4Yuh1XJbH6MtMCk1mvh+XdLM7RbBzxXp7DOUv3dMlc0m7i6qkV0K5aoyahl0dP6ACckSkRWuOtIqCFKRraBVcAK9eB1bZpX15l2QF7dw69Wk2aSPCnc7x9jmmz7lfZB/AY5utaecNtmMyTDLIXiIKJyvSd44noY+7mc7ySsl6xwkpyZAH12h2TPWPkx52cg44Vcit652naMgcAYVL8PZbCMXTWuepntnsuyRbbnZ+mhyIxHkfPxlH/6Il+huoOjryNQ+8z9orcokCvaw70axZ2vhjEHLZES0mdAbPtV928UVbkYUOgGSTXP8QKBgQDarWiy1A62tpNVleEQYBO8+m3J1Xz8d5FLMODec+LrPvCsbv7DpHsNsMhPEKhlqBqUMdnEEM9TY1/oSJkG+KZKmEUsDl0ohLawZx1H9+QypH9PEYmtzDgO1xaqx1kTzhViPKCEcA8ua5lTTlIb34OcjNlFrqO50BysPrMFx+6A3QKBgQC7+EhCOPjTDaFUd6hmJcfpCgjo7mfsMgmGT10jzUkg3YZRtDZtNpA/4qVg4F/RxvrhnaqM6ya8EkzCjwX8HKhUPBPkO/H9UIAZigADJhHgIqTcqINC13bB5T/Tch2TWaiu0vOIXKAsm0mbJWbfT1RrRAyKlKdJrw9ddhr0eJO+MwKBgQCBfMONeQJJcS0nNbvyrWGiuou+QztiaA7R/lx5fRe2gyuSf5s+ECyJe8/w+YUtxPAQJsCzV9zcnPCSpEJxHVWiwC3dm5fQQV3IcRamogQvdLaqBFGJZ28eYoDamXaGwrZo2EuYgJ6Mt0wwRyVZue2+Cq0xlOsAQVppKCtr1erFxQKBgERxUCZExl1a7i5qb3faM+Nn0vy1qkN3qL4t8bUSj5kW8EyZuOOlZXrNlPgkWt9we3NhTHOJQA5k/2wsVbqJ2MTrJzcImMFq6WnjNMPwvbuGAc+S0FCrUcOiLM5aE+jOUbxudVxmlbAITxHd2YpgQVXZblObcxpCUu7uDTyNFwa/AoGBAJ4Pf+MJazfwxTOQGZCWejMP6tLkf6rsz79Eu9SQ1QRh4O2tjwz9HTSbzXN6iSh/yMWZRTxd1WNVVLHh+AkFLyFuA0Tfn1nQTNs/i8BGYCd8SiojsQe4TgX04IwBAaS9JiXzBUxBxUjWV/LP5mZtK8el5Lwks3HIIjfA1TnKxUEn";
    // 服务器异步通知页面路径 需http://或者https://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String notify_url = "http://3bdmiw.natappfree.cc/alipay_alibaba_war_exploded/notify_url.jsp";
    // 页面跳转同步通知页面路径 需http://或者https://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问 商户可以自定义同步跳转地址
    public static String return_url = "http://3bdmiw.natappfree.cc/alipay_alibaba_war_exploded/return_url.jsp";
    // 请求网关地址
    public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";
    // 编码
    public static String charset = "UTF-8";
    // 返回格式
    public static String FORMAT = "json";
    // 支付宝公钥
    public static String alipay_public_key ="MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAnlel3zRw5oG1jmKIL4zyauAvDy8ZpxoyNZTlX3JQwiCC8kdlWeKK0Xd1wvIhS/DgmDedKP+M4pGpusqlhOnjJCEi91WUIXFGqF7jb8/ISkbaxj0o7ZSJyt2fuQ4c0g0qbN7Teo2vvbce7uiB3XjCysBP6wfaD9knQNztmNT2cIN+cTyuv/iZUvoR/AanfKNZt52PiGPjSvfkrjTli+SixeQQ+ZC7ac0aEdhlwfe8gSeWvTkYOJ5AQI6NhP5DlFYOJ0bSWUYz5QyC1UPkoZsH37wiZIibGIvGIMzEH/rMEXo2EiKMJTh7czEF/6jjTAL/rbXxrDJpO0aEiGwkwuqbAwIDAQAB";
    // 日志记录目录
    public static String log_path = "/log";
    // RSA2
    public static String sign_type = "RSA2";
}
