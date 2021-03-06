/**
 * 
 */
package com.hivescm.tms.api.dto.es.sign.response;

import com.hivescm.tms.api.dto.es.waybill.component.TmsWaybillEsDTO;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

/**
 * @author  boqiang.deng
 * @date    2018年4月18日
 * @company 蜂网供应链管理（上海）有限公司
 * 
 */
@Data
@ToString
public class NoSignWaybillRespDTO implements Serializable{

	private static final long serialVersionUID = 1L;

	@ApiModelProperty("总数")
	private Integer totalCount;
	
	@ApiModelProperty("列表数据")
	private List<TmsWaybillEsDTO> waybills;
}
