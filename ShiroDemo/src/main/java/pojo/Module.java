package pojo;

public class Module extends BaseEntity{
	private String moduleId; //模块主键
	private Module ParentModule;	//上级模块
	private String name;	//模块名称
	private int ctype;		//1主菜单/2左侧菜单/3按钮
	private int state; 		//0停用 1启用
	private String remark;	//备注信息
	private Integer orderNo;
	private String pId;
	private String checked;
	
	
	
	
	public String getChecked() {
		return checked;
	}
	public void setChecked(String checked) {
		this.checked = checked;
	}
	public String getpId() {
		return pId;
	}
	public void setpId(String pId) {
		this.pId = pId;
	}
	public String getId(){
		return moduleId;
	}
	public String getModuleId() {
		return moduleId;
	}
	public void setModuleId(String moduleId) {
		this.moduleId = moduleId;
	}
	public Module getParentModule() {
		return ParentModule;
	}
	public void setParentModule(Module parentModule) {
		ParentModule = parentModule;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCtype() {
		return ctype;
	}
	public void setCtype(int ctype) {
		this.ctype = ctype;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public Integer getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(Integer orderNo) {
		this.orderNo = orderNo;
	}
	
	
}
