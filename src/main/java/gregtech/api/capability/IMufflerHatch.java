package gregtech.api.capability;


import java.util.List;

import net.minecraft.world.item.ItemStack;

public interface IMufflerHatch {

    void recoverItemsTable(List<ItemStack> recoveryItems);

    /**
     * @return true if front face is free and contains only air blocks in 1x1 area
     */
    boolean isFrontFaceFree();
}
