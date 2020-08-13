package org.zwm.responsibilitychain;

public class CollegeApprover extends Approver {

    public CollegeApprover(String name){
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        float price = purchaseRequest.getPrice();
        if (price >5000 && price<= 10000){
            System.out.println("购买请求被"+this.name+"处理");
        }else {
            this.approver.processRequest(purchaseRequest);
        }
    }
}
