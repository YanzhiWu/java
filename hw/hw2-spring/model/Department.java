package hw.model;

import javax.persistence.*;

@Entity
@Table(name = "department")
public class Department {
    @Id
    private int deptid;
    private String name, loc;

    public Department(int deptid, String name, String loc) {
        this.deptid = deptid;
        this.name = name;
        this.loc = loc;
    }

    public int getDeptid() {
        return this.deptid;
    }

    public void setDeptid(int deptid) {
        this.deptid = deptid;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLoc() {
        return this.loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }
}
