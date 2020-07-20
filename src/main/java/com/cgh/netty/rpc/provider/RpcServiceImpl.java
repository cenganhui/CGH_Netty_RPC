package com.cgh.netty.rpc.provider;

import com.cgh.netty.rpc.api.RpcService;

/**
 * RpcService 实现类
 *
 * @author Akuma
 * @date 2020/7/20 21:10
 */
public class RpcServiceImpl implements RpcService {

    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public int mult(int a, int b) {
        return a * b;
    }

    public int div(int a, int b) {
        return a / b;
    }

}
