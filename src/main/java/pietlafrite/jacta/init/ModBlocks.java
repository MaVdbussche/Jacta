package pietlafrite.jacta.init;

import cpw.mods.fml.common.registry.GameRegistry;
import pietlafrite.jacta.block.BlockBetterCraftingTableBase;
import pietlafrite.jacta.block.BlockJacta;
import pietlafrite.jacta.reference.Reference;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
    public static final BlockJacta betterCraftingTableBase = new BlockBetterCraftingTableBase();

    public static void init()
    {
        GameRegistry.registerBlock(betterCraftingTableBase, "betterCraftingTableBase");
    }

}
