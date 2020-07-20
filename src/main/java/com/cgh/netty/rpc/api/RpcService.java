package com.cgh.netty.rpc.api;

/**
 * RpcService 接口
 *
 * @author Akuma
 * @date 2020/7/20 21:04
 */
public interface RpcService {

    /**
     * 加
     */
    int add(int a, int b);

    /**
     * 减
     */
    int sub(int a, int b);

    /**
     * 乘
     */
    int mult(int a, int b);

    /**
     * 除
     */
    int div(int a, int b);

}
