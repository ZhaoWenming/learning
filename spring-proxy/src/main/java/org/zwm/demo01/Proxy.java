package org.zwm.demo01;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class Proxy implements Rent{

    private Host host;

    @Override
    public void rent() {
        seeHouse();
        host.rent();
    }

    //看房
    public void seeHouse(){
        System.out.println("中介带你看房");
    }
}
