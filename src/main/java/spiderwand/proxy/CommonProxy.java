package spiderwand.proxy;

import spiderwand.defs.ItemDefs;

/**
 * Created by Growlith1223 on 12/7/2016.
 */
public class CommonProxy {
    public void preInit(){
        ItemDefs.instance.initItems();
    }

    public void init(){

    }

    public void postInit(){

    }
}
