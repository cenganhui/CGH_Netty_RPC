package com.cgh.netty.rpc.provider;

import com.cgh.netty.rpc.api.RpcHelloService;

/**
 * RpcHelloService 实现类
 *
 * @author Akuma
 * @date 2020/7/20 21:08
 */
public class RpcHelloServiceImpl implements RpcHelloService {

    public String hello(String name) {
        return "Hello " + name + "~";
    }

}
