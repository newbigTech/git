package com.hivescm.tms.api.dto.es.receipt;

import com.hivescm.framework.common.exception.ExceptionFactory;
import com.hivescm.framework.entitymapping.annotation.Mapping;
import com.hivescm.framework.logger.api.annotation.Logger;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.math.BigDecimal;
/**
 * 回单接收发放批次
 * @author ke.huang
 * @date 2018年3月23日
 * @company 蜂网供应链管理（上海）有限公司
 */
@Data
@ToString
public class ReceiptTransmitReceiveEsDTO implements Serializable,Cloneable{
	private static final long serialVersionUID = 662456246839024080L;
	@Logger @Mapping @ApiModelProperty("主键")
	private Long id;
	@Logger @Mapping @ApiModelProperty("公司ID")
	private Long companyId;
	@Mapping @ApiModelProperty("寄出批次")
    private String transmitBatchCode;
	@Mapping @ApiModelProperty("寄出时间")
    private Long transmitTime;
	@Mapping @ApiModelProperty("接收网点")
    private Long receiveOrgId;
	@Mapping @ApiModelProperty("快递号/车牌号")
    private String expressVehicleNum;
	@Mapping @ApiModelProperty("快递费用")
    private BigDecimal fee;
	@Mapping @ApiModelProperty("接收人")
    private Long receiptUserId;
	@Mapping @ApiModelProperty("寄出备注")
    private String transmitRemark;
	@Mapping @ApiModelProperty("接收时间")
    private Long receiveTime;
	@Mapping @ApiModelProperty("到达备注")
    private String receiveRemark;
    @Mapping @ApiModelProperty("创建人")
	private Integer createUser;
	@Mapping @ApiModelProperty("创建时间")
    private Long createTime;
	@Mapping @ApiModelProperty("修改人")
    private Integer updateUser;
	@Mapping @ApiModelProperty("修改时间")
    private Long updateTime;
	@Mapping("isDelete") @ApiModelProperty("是否删除")
    private Boolean idelete;
	@Mapping
	@ApiModelProperty("寄出网点ID")
	private Long transmitOrgId;
	@Mapping
	@ApiModelProperty("状态")
	private String status;
	@Mapping
	@ApiModelProperty("总票数")
	private Integer totalVotes;
	@Mapping
	@ApiModelProperty("总份数")
	private Integer totalCpoies;
	
	/**冗余名称*/
	@Mapping
	@ApiModelProperty("创建人名称") 
	private String createUserName;
	@Mapping
	@ApiModelProperty("修改人名称") 
	private String updateUserName;
	@Mapping
	@ApiModelProperty("寄出网点名称")
	private String transmitOrgName;
	@Mapping
	@ApiModelProperty("接收网点名称")
	private String receiveOrgName;
	@Mapping
	@ApiModelProperty("接收人姓名")
	private String receiptUserName;
	
	@Override
	public ReceiptTransmitReceiveEsDTO clone() {
		try {
			return (ReceiptTransmitReceiveEsDTO)super.clone();
		} catch (CloneNotSupportedException e) {
			throw ExceptionFactory.ex(e);
		}
	}
    
}