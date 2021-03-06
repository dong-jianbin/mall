package com.macro.mall.ams.model;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 充值订单流水
 * </p>
 *
 * @author dongjb
 * @since 2021-01-08
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("ams_order_balancerecharge")
@ApiModel(value="AmsOrderBalancerecharge", description="充值订单流水")
public class AmsOrderBalancerecharge implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "订单编号")
    @TableId("orderNo")
    private String orderNo;

    @ApiModelProperty(value = "购买人第三方id")
    private String buyerid;

    @ApiModelProperty(value = "购买人银行卡开户名称")
    private String buyername;

    @ApiModelProperty(value = "购买人第三方账号名")
    private String buyeraccount;

    @ApiModelProperty(value = "充值前余额")
    private BigDecimal beforebalance;

    @ApiModelProperty(value = "充值后余额")
    private BigDecimal afterbalance;

    @ApiModelProperty(value = "支付时间")
    private String paydate;


}
