package pietlafrite.jacta.item;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import pietlafrite.jacta.reference.Reference;


//Common code for all items in JACTA. Simply extend this class elsewhere
//to create a new item.
public class ItemJacta extends Item
{
    public ItemJacta() { //Constructor for creating item objects

        super();
    }

    @Override
    public String getUnlocalizedName()
    {
        return String.format("item.%s%s", Reference.MOD_ID.toLowerCase()+":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
        //Returns "item.jacta:betterCraftingTable.name" for example
    }
    @Override
    public String getUnlocalizedName(ItemStack itemStack)
    {
        return String.format("item.%s%s", Reference.MOD_ID.toLowerCase()+":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
        //Returns "item.jacta:betterCraftingTable.name" for example
    }

    protected String getUnwrappedUnlocalizedName (String unlocalizedName){
        return unlocalizedName.substring(unlocalizedName.indexOf(".")+1);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister)
    {
        itemIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".")+1));
    }
}
