package gregtech.api.capability;

import org.jetbrains.annotations.Nullable;

import gregtech.api.GTValues;
import net.fabricmc.fabric.api.lookup.v1.item.ItemApiLookup;
import net.fabricmc.fabric.api.transfer.v1.context.ContainerItemContext;
import net.minecraft.resources.ResourceLocation;

public class GregtechCapabilities {

    public static final ItemApiLookup<IElectricItem, @Nullable ContainerItemContext> CAPABILITY_ELECTRIC_ITEM = 
        ItemApiLookup.get(new ResourceLocation("gregtech:capability_electric_item"), IElectricItem.class, ContainerItemContext.class);

    // @CapabilityInject(IEnergyContainer.class)
    // public static Capability<IEnergyContainer> CAPABILITY_ENERGY_CONTAINER = null;

    // @CapabilityInject(IElectricItem.class)
    // public static Capability<IElectricItem> CAPABILITY_ELECTRIC_ITEM = null;

    // @CapabilityInject(IWrenchItem.class)
    // public static Capability<IWrenchItem> CAPABILITY_WRENCH = null;

    // @CapabilityInject(ICutterItem.class)
    // public static Capability<ICutterItem> CAPABILITY_CUTTER = null;

    // @CapabilityInject(IScrewdriverItem.class)
    // public static Capability<IScrewdriverItem> CAPABILITY_SCREWDRIVER = null;

    // @CapabilityInject(ISoftHammerItem.class)
    // public static Capability<ISoftHammerItem> CAPABILITY_MALLET = null;

    // @CapabilityInject(IHammerItem.class)
    // public static Capability<IHammerItem> CAPABILITY_HAMMER = null;


    // @CapabilityInject(IFuelable.class)
    // public static Capability<IFuelable> CAPABILITY_FUELABLE = null;

    // @CapabilityInject(IMultiblockController.class)
    // public static Capability<IMultiblockController> CAPABILITY_MULTIBLOCK_CONTROLLER = null;

    // @CapabilityInject(HardwareProvider.class)
    // public static Capability<HardwareProvider> CAPABILITY_HARDWARE_PROVIDER = null;

    // @CapabilityInject(ConverterTrait.class)
    // public static Capability<ConverterTrait> CAPABILITY_CONVERTER = null;

    private static final ResourceLocation CAPABILITY_EU_TO_FE = new ResourceLocation(GTValues.MODID, "fe_capability");

    // @SubscribeEvent
    // public static void attachTileCapability(AttachCapabilitiesEvent<TileEntity> event) {
    //     event.addCapability(CAPABILITY_EU_TO_FE, new EUToFEProvider(event.getObject()));
    // }
}
