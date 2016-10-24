package pietlafrite.jacta.init;

import cpw.mods.fml.common.registry.GameRegistry;
import pietlafrite.jacta.item.ItemBetterCraftingTable;
import pietlafrite.jacta.item.ItemJacta;

public class ModItems
{
    public static final ItemJacta betterCraftingTable = new ItemBetterCraftingTable();

    public static void init()
    {
        GameRegistry.registerItem(betterCraftingTable, "betterCraftingTable");
    }
}
