package com.ts.pojo;

public class TUser {
    private String cId;

    private String cName;

    private String cPwd;

    public String getcId() {
        return cId;
    }

    public void setcId(String cId) {
        this.cId = cId == null ? null : cId.trim();
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName == null ? null : cName.trim();
    }

    public String getcPwd() {
        return cPwd;
    }

    public void setcPwd(String cPwd) {
        this.cPwd = cPwd == null ? null : cPwd.trim();
    }

	@Override
	public String toString() {
		return "TUser [cId=" + cId + ", cName=" + cName + ", cPwd=" + cPwd + "]";
	}
}