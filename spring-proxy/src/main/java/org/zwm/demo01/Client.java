package org.zwm.demo01;

    public class Client {
        public static void main(String[] args) {
            //房东
            Host host = new Host();
            //代理,中介帮房东租房子，但是呢？代理角色一般都会有一些附属操作
            Proxy proxy = new Proxy(host);

            //你不用面对房东，直接找中介即可
            proxy.rent();
        }
    }
