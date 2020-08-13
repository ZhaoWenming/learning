package org.zwm.responsibilitychain;

public class DepartmentApprover extends Approver {

    public DepartmentApprover(String name){
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        if (purchaseRequest.getPrice() <= 5000){
            System.out.println("购买请求被"+this.name+"处理");
        }else {
            this.approver.processRequest(purchaseRequest);
        }
    }
}
