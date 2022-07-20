package gregtech.api.items.metaitem.stats;

import net.minecraft.world.item.ItemStack;

@FunctionalInterface
public interface IItemMaxStackSizeProvider extends IItemComponent {

    int getMaxStackSize(ItemStack itemStack, int defaultValue);

}
