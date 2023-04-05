package org.example.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author zhang
 * @version V1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account {
    /**
     * id
     */
    private Long id;
    /**
     * 用户id
     */
    private Long userId;
    /**
     * 总积分
     */
    private int total;
    /**
     * 已用余额
     */
    private int used;
    /**
     * 剩余可用额度
     */
    private int residue;
}
