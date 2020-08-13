package org.zwm.responsibilitychain;

public class ViceSchoolMasterApprover extends Approver {

    public ViceSchoolMasterApprover(String name){
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        float price = purchaseRequest.getPrice();
        if (price >10000 && price<= 30000){
            System.out.println("购买请求被"+this.name+"处理");
        }else {
            this.approver.processRequest(purchaseRequest);
        }
    }
}
