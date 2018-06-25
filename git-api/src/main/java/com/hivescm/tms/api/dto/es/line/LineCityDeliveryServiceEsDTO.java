package com.hivescm.tms.api.dto.es.line;

import java.io.Serializable;
import java.math.BigDecimal;

import com.hivescm.framework.entitymapping.annotation.Mapping;

import com.hivescm.framework.logger.api.annotation.Logger;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class LineCityDeliveryServiceEsDTO implements Serializable{

	private static final long serialVersionUID = 1L;
    @Logger
	@Mapping
	@ApiModelProperty("主键")
	private Long id;
	@Mapping
    @ApiModelProperty("城市编码")
    private String cityCode;
	@Mapping
    @ApiModelProperty("服务类型STANDARD_SERVICE=标准服务,ADVANCED_SERVICES=高级服务")
    private Integer deliveryType;
    @Logger
	@Mapping
    @ApiModelProperty("服务编码")
    private Integer serviceCode;
	@Mapping
    @ApiModelProperty("服务编码")
    private String serviceName;
	@Mapping
    @ApiModelProperty("派送开始时间")
    private String dispatchTimeBeign;
	@Mapping
    @ApiModelProperty("派送截止时间")
    private String dispatchTimeEnd;
	@Mapping
    @ApiModelProperty("提货开始时间")
    private String deliveryTimeBegin;
	@Mapping
    @ApiModelProperty("提货结束时间")
    private String deliveryTimeEnd;
	@Mapping
    @ApiModelProperty("截单开始时间")
    private String orderEndTimeBegin;
	@Mapping
    @ApiModelProperty("截单截止时间")
    private String orderEndTimeEnd;
	@Mapping
    @ApiModelProperty("状态")
    private Integer status;
	@Mapping
    @ApiModelProperty("下单开始时间")
    private String orderTimeBegin;
	@Mapping
    @ApiModelProperty("下单截止时间")
    private String orderTimeEnd;
	@Mapping
    @ApiModelProperty("配送时效")
    private BigDecimal effectiveness;
	@Mapping
    @ApiModelProperty("备注")
    private String remark;
	@Mapping
    @ApiModelProperty("创建人")
    private Integer createUser;

	@ApiModelProperty("创建时间")
    private Long createTime;

	@ApiModelProperty("修改人")
    private Integer updateUser;

	@ApiModelProperty("修改时间")
    private Long updateTime;
	@Mapping
	@ApiModelProperty("创建人姓名")
	private String createUserName;
	@Mapping
	@ApiModelProperty("修改人姓名")
	private String updateUserName;
	

}
