package pietlafrite.jacta.init;

import cpw.mods.fml.common.registry.GameRegistry;
import pietlafrite.jacta.item.*;

public class ModItems
{
    public static final ItemJacta betterCraftingTableBase = new ItemBetterCraftingTableBase();
    public static final ItemJacta betterCraftingTableUpgradeIron = new ItemBetterCraftingTableUpgradeIron();
    public static final ItemJacta betterCraftingTableUpgradeGold = new ItemBetterCraftingTableUpgradeGold();
    public static final ItemJacta betterCraftingTableUpgradeDiamond = new ItemBetterCraftingTableUpgradeDiamond();
    public static final ItemJacta betterCraftingTableUpgradeObsidian = new ItemBetterCraftingTableUpgradeObsidian();
    public static final ItemJacta betterCraftingTableUpgradeEndStone = new ItemBetterCraftingTableUpgradeEndStone();
    public static final ItemJacta betterCraftingTableUpgradeEmerald = new ItemBetterCraftingTableUpgradeEmerald();

    public static void init()
    {
        GameRegistry.registerItem(betterCraftingTableBase, "betterCraftingTableBase");
        GameRegistry.registerItem(betterCraftingTableUpgradeIron, "betterCraftingTableUpgradeIron");
        GameRegistry.registerItem(betterCraftingTableUpgradeGold, "betterCraftingTableUpgradeGold");
        GameRegistry.registerItem(betterCraftingTableUpgradeDiamond, "betterCraftingTableUpgradeDiamond");
        GameRegistry.registerItem(betterCraftingTableUpgradeObsidian, "betterCraftingTableUpgradeObsidian");
        GameRegistry.registerItem(betterCraftingTableUpgradeEndStone, "betterCraftingTableUpgradeEndStone");
        GameRegistry.registerItem(betterCraftingTableUpgradeEmerald, "betterCraftingTableUpgradeEmerald");
    }
}
