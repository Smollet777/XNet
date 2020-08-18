package mcjty.xnet.modules.cables;

import mcjty.lib.container.GenericContainer;
import mcjty.xnet.XNet;
import mcjty.xnet.modules.cables.blocks.*;
import mcjty.xnet.modules.cables.blocks.GenericCableBlock.CableBlockType;
import mcjty.xnet.setup.Registration;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.item.Item;
import net.minecraft.tags.ITag;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.Tag;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;

import static mcjty.xnet.setup.Registration.*;

public class CableSetup {

    public static void register() {
        // Needed to force class loading
    }

    public static final RegistryObject<NetCableBlock> NETCABLE = BLOCKS.register("netcable", () -> new NetCableBlock(CableBlockType.CABLE));
    public static final RegistryObject<Item> NETCABLE_RED = ITEMS.register("netcable_red", () -> new ColorBlockItem(NETCABLE.get(), Registration.createStandardProperties(), CableColor.RED));
    public static final RegistryObject<Item> NETCABLE_GREEN = ITEMS.register("netcable_green", () -> new ColorBlockItem(NETCABLE.get(), Registration.createStandardProperties(), CableColor.GREEN));
    public static final RegistryObject<Item> NETCABLE_BLUE = ITEMS.register("netcable_blue", () -> new ColorBlockItem(NETCABLE.get(), Registration.createStandardProperties(), CableColor.BLUE));
    public static final RegistryObject<Item> NETCABLE_YELLOW = ITEMS.register("netcable_yellow", () -> new ColorBlockItem(NETCABLE.get(), Registration.createStandardProperties(), CableColor.YELLOW));
    public static final RegistryObject<Item> NETCABLE_ROUTING = ITEMS.register("netcable_routing", () -> new ColorBlockItem(NETCABLE.get(), Registration.createStandardProperties(), CableColor.ROUTING));

    public static final RegistryObject<ConnectorBlock> CONNECTOR = BLOCKS.register("connector", () -> new ConnectorBlock(CableBlockType.CONNECTOR));
    public static final RegistryObject<Item> CONNECTOR_RED = ITEMS.register("connector_red", () -> new ColorBlockItem(CONNECTOR.get(), Registration.createStandardProperties(), CableColor.RED));
    public static final RegistryObject<Item> CONNECTOR_GREEN = ITEMS.register("connector_green", () -> new ColorBlockItem(CONNECTOR.get(), Registration.createStandardProperties(), CableColor.GREEN));
    public static final RegistryObject<Item> CONNECTOR_BLUE = ITEMS.register("connector_blue", () -> new ColorBlockItem(CONNECTOR.get(), Registration.createStandardProperties(), CableColor.BLUE));
    public static final RegistryObject<Item> CONNECTOR_YELLOW = ITEMS.register("connector_yellow", () -> new ColorBlockItem(CONNECTOR.get(), Registration.createStandardProperties(), CableColor.YELLOW));
    public static final RegistryObject<Item> CONNECTOR_ROUTING = ITEMS.register("connector_routing", () -> new ColorBlockItem(CONNECTOR.get(), Registration.createStandardProperties(), CableColor.ROUTING));

    public static final RegistryObject<AdvancedConnectorBlock> ADVANCED_CONNECTOR = BLOCKS.register("advanced_connector", () -> new AdvancedConnectorBlock(CableBlockType.ADVANCED_CONNECTOR));
    public static final RegistryObject<Item> ADVANCED_CONNECTOR_RED = ITEMS.register("advanced_connector_red", () -> new ColorBlockItem(ADVANCED_CONNECTOR.get(), Registration.createStandardProperties(), CableColor.RED));
    public static final RegistryObject<Item> ADVANCED_CONNECTOR_GREEN = ITEMS.register("advanced_connector_green", () -> new ColorBlockItem(ADVANCED_CONNECTOR.get(), Registration.createStandardProperties(), CableColor.GREEN));
    public static final RegistryObject<Item> ADVANCED_CONNECTOR_BLUE = ITEMS.register("advanced_connector_blue", () -> new ColorBlockItem(ADVANCED_CONNECTOR.get(), Registration.createStandardProperties(), CableColor.BLUE));
    public static final RegistryObject<Item> ADVANCED_CONNECTOR_YELLOW = ITEMS.register("advanced_connector_yellow", () -> new ColorBlockItem(ADVANCED_CONNECTOR.get(), Registration.createStandardProperties(), CableColor.YELLOW));
    public static final RegistryObject<Item> ADVANCED_CONNECTOR_ROUTING = ITEMS.register("advanced_connector_routing", () -> new ColorBlockItem(ADVANCED_CONNECTOR.get(), Registration.createStandardProperties(), CableColor.ROUTING));

    public static final RegistryObject<TileEntityType<?>> TYPE_CONNECTOR = TILES.register("connector", () -> TileEntityType.Builder.create(ConnectorTileEntity::new, CONNECTOR.get()).build(null));
    public static final RegistryObject<TileEntityType<?>> TYPE_ADVANCED_CONNECTOR = TILES.register("advanced_connector", () -> TileEntityType.Builder.create(AdvancedConnectorTileEntity::new, ADVANCED_CONNECTOR.get()).build(null));

    public static final RegistryObject<ContainerType<GenericContainer>> CONTAINER_CONNECTOR = CONTAINERS.register("connector", GenericContainer::createContainerType);

    public static final ITag.INamedTag<Item> TAG_CABLES = ItemTags.makeWrapperTag(XNet.MODID+":cables");
    public static final ITag.INamedTag<Item> TAG_CONNECTORS = ItemTags.makeWrapperTag(XNet.MODID+":connectors");
    public static final ITag.INamedTag<Item> TAG_ADVANCED_CONNECTORS = ItemTags.makeWrapperTag(XNet.MODID+":advanced_connectors");

//    @SideOnly(Side.CLIENT)
//    public static void initColorHandlers(BlockColors blockColors) {
//        connectorBlock.initColorHandler(blockColors);
//        advancedConnectorBlock.initColorHandler(blockColors);
//    }

    public static void initCrafting() {


        // @todo recipes
//        for (CableColor source : CableColor.VALUES) {
//            if (source != CableColor.ROUTING) {
//                for (CableColor dest : CableColor.VALUES) {
//                    if (dest != source && dest != CableColor.ROUTING) {
//                        MyGameReg.addRecipe(new ItemStack(netCableBlock, 1, dest.ordinal()), new ItemStack(netCableBlock, 1, source.ordinal()), dest.getDye());
//                        MyGameReg.addRecipe(new ItemStack(connectorBlock, 1, dest.ordinal()), new ItemStack(connectorBlock, 1, source.ordinal()), dest.getDye());
//                        MyGameReg.addRecipe(new ItemStack(advancedConnectorBlock, 1, dest.ordinal()), new ItemStack(advancedConnectorBlock, 1, source.ordinal()), dest.getDye());
//                    }
//                }
//            }
//        }
    }
}
