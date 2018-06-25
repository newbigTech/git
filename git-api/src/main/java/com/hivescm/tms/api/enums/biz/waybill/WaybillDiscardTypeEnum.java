package com.hivescm.tms.api.enums.biz.waybill;

public enum WaybillDiscardTypeEnum {
	ERRORINFORMATION    (1,"信息错误"),
	BREAKAGE   (2,"封面破损"),
	FUZZYPRINT   (3,"打印模糊"),
	OTHERREASON   (4,"其他原因");
	
	int type;
	String name;
	
	WaybillDiscardTypeEnum(int type,String name) {
		this.type = type;
		this.name = name;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public static WaybillDiscardTypeEnum getType(int type){
		for (WaybillDiscardTypeEnum ele : WaybillDiscardTypeEnum.values()) {
			if (ele.getType() == type)
				return ele;
		}
		return null;
	}
}
