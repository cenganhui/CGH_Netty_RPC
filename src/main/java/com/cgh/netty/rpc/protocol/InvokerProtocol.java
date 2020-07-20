package com.cgh.netty.rpc.protocol;

import lombok.Data;

import java.io.Serializable;

/**
 * 自定义传输协议
 *
 * @author Akuma
 * @date 2020/7/20 21:06
 */
@Data
public class InvokerProtocol implements Serializable {

    // 类名
    private String className;

    // 函数名称
    private String methodName;

    // 参数类型
    private Class<?>[] params;

    // 参数列表
    private Object[] values;

}
