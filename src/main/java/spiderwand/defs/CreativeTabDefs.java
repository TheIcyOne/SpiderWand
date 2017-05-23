package spiderwand.defs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

/**
 * Created by Growlith1223 on 12/7/2016.
 */
public class CreativeTabDefs {
    public static final CreativeTabs tabSpiderWandItems = new CreativeTabs("spiderwand.items"){
        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(ItemDefs.vortexGem);
        }
    };
}
