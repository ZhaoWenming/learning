package org.zwm.responsibilitychain;

public class Client {
    public static void main(String[] args) {
        /**
         * 创建一个请求
         */
        PurchaseRequest purchaseRequest = new PurchaseRequest(1, 5000, 1);

        /**
         * 创建相关的审批人
         */
        DepartmentApprover departmentApprover = new DepartmentApprover("系主任");
        CollegeApprover collegeApprover = new CollegeApprover("院长");
        ViceSchoolMasterApprover viceSchoolMasterApprover = new ViceSchoolMasterApprover("副校长");
        SchoolMasterApprover schoolMasterApprover = new SchoolMasterApprover("校长");

        /**
         * 需要将各个审批级别的下一个审批人设置好（处理人构成环形）
         */
        departmentApprover.setApprover(collegeApprover);
        collegeApprover.setApprover(viceSchoolMasterApprover);
        viceSchoolMasterApprover.setApprover(schoolMasterApprover);
        schoolMasterApprover.setApprover(departmentApprover);

        schoolMasterApprover.processRequest(purchaseRequest);
    }
}
