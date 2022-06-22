package com.woniu.pojo;

import java.io.Serializable;

/**
 * dept
 *
 * @author
 */
public class Dept implements Serializable {
    private Integer deptno;

    private String dname;

    private String loc;

    private static final long serialVersionUID = 1L;

    public Integer getDeptno() {
        return deptno;
    }

    public void setDeptno(Integer deptno) {
        this.deptno = deptno;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Dept other = (Dept) that;
        return (this.getDeptno() == null ? other.getDeptno() == null : this.getDeptno().equals(other.getDeptno()))
                && (this.getDname() == null ? other.getDname() == null : this.getDname().equals(other.getDname()))
                && (this.getLoc() == null ? other.getLoc() == null : this.getLoc().equals(other.getLoc()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDeptno() == null) ? 0 : getDeptno().hashCode());
        result = prime * result + ((getDname() == null) ? 0 : getDname().hashCode());
        result = prime * result + ((getLoc() == null) ? 0 : getLoc().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", deptno=").append(deptno);
        sb.append(", dname=").append(dname);
        sb.append(", loc=").append(loc);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}