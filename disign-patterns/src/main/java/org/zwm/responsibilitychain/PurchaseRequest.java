package org.zwm.responsibilitychain;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 请求类
 */
@AllArgsConstructor
@Getter
public class PurchaseRequest {

    /**
     * 请求类型
     */
    private int type = 0;
    private float price = 0.0f;
    private int id = 0;

}
