package com.test;

public class EncapsulationExample {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    @Override
    public String toString() {
        return "EncapsulationExample{" +
                "id='" + id + '\'' +
                ", designation='" + designation + '\'' +
                ", empName='" + empName + '\'' +
                '}';
    }

    private int id;
    private String designation;
    private String empName;

    public static void main(String[] args) {

        EncapsulationExample emp = new EncapsulationExample();
        emp.setId(2784);
        emp.setDesignation("Principal Software Engineer");
        emp.setEmpName("Manikandan");

        System.out.println("Employee Id is " +emp.getId()+ " Employee Designation is "+emp.getDesignation()+"" +
                        " And  Employeee name is " +emp.getEmpName());
    }


}
