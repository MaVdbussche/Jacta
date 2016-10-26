package pietlafrite.jacta.init;

import cpw.mods.fml.common.registry.GameRegistry;
import pietlafrite.jacta.item.*;
import pietlafrite.jacta.reference.Reference;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    public static final ItemJacta itemBetterCraftingTableBase = new ItemBetterCraftingTableBase();
    public static final ItemJacta itemBetterCraftingTableUpgradeIron = new ItemBetterCraftingTableUpgradeIron();
    public static final ItemJacta itemBetterCraftingTableUpgradeGold = new ItemBetterCraftingTableUpgradeGold();
    public static final ItemJacta itemBetterCraftingTableUpgradeDiamond = new ItemBetterCraftingTableUpgradeDiamond();
    public static final ItemJacta itemBetterCraftingTableUpgradeObsidian = new ItemBetterCraftingTableUpgradeObsidian();
    public static final ItemJacta itemBetterCraftingTableUpgradeEndStone = new ItemBetterCraftingTableUpgradeEndStone();
    public static final ItemJacta itemBetterCraftingTableUpgradeEmerald = new ItemBetterCraftingTableUpgradeEmerald();

    public static void init()
    {
        GameRegistry.registerItem(itemBetterCraftingTableBase, "itemBetterCraftingTableBase");
        GameRegistry.registerItem(itemBetterCraftingTableUpgradeIron, "itemBetterCraftingTableUpgradeIron");
        GameRegistry.registerItem(itemBetterCraftingTableUpgradeGold, "itemBetterCraftingTableUpgradeGold");
        GameRegistry.registerItem(itemBetterCraftingTableUpgradeDiamond, "itemBetterCraftingTableUpgradeDiamond");
        GameRegistry.registerItem(itemBetterCraftingTableUpgradeObsidian, "itemBetterCraftingTableUpgradeObsidian");
        GameRegistry.registerItem(itemBetterCraftingTableUpgradeEndStone, "itemBetterCraftingTableUpgradeEndStone");
        GameRegistry.registerItem(itemBetterCraftingTableUpgradeEmerald, "itemBetterCraftingTableUpgradeEmerald");
    }
}
