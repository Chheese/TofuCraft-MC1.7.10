package tsuteto.tofu.item;

import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;

public class ItemFoodSet extends ItemFoodSetBase
{
    public static Food[] foodList = new Food[22];

    public static TcFoodBase tofuChikuwa =
            new Food( 0,  6, 0.4f,  true, "tofuChikuwa");
    public static TcFoodBase oage =
            new Food( 1,  5, 0.3f,  true, "oage");
    public static TcFoodBase mabodofu =
            new Food( 2, 16, 0.5f, false, "mabodofu").setContainer(new ItemStack(Items.bowl));
    public static TcFoodBase onigiri =
            new Food( 3,  4, 0.4f, false, "onigiri");
    public static TcFoodBase onigiriSalt =
            new Food( 4,  5, 0.6f, false, "onigiriSalt");
    public static TcFoodBase yakionigiriMiso =
            new Food( 5,  6, 0.8f, false, "yakionigiriMiso");
    public static TcFoodBase yakionigiriShoyu =
            new Food( 6,  6, 0.8f, false, "yakionigiriShoyu");
    public static TcFoodBase sproutSaute =
            new Food( 7,  8, 0.4f, false, "moyashiitame").setContainer(new ItemStack(Items.bowl));
    public static TcFoodBase moyashiOhitashi =
            new Food( 8,  5, 0.3f, false, "moyashiohitashi").setContainer(new ItemStack(Items.bowl));
    public static TcFoodBase sprouts =
            new Food( 9,  2, 0.5f, false, "sprouts");
    public static TcFoodBase hiyayakko =
            new Food(10,  6, 0.5f, false, "hiyayakko");
    public static TcFoodBase riceTofu =
            new Food(11, 10, 0.2f, false, "riceTofu"); // For External Mod
    public static TcFoodBase tofuHamburg =
            new Food(12, 12, 0.8f, false, "tofuHamburg");
    public static TcFoodBase tofuCookie =
            new Food(13, 2, 0.15f, false, "tofuCookie");
    public static TcFoodBase inari =
            new Food(14, 5, 0.6f, false, "inari");
    public static TcFoodBase tofufishRow =
            new Food(15, 4, 0.4f, false, "tofufishRaw");
    public static TcFoodBase tofufishCooked =
            new Food(16, 6, 0.6f, false, "tofufishCooked");
    public static TcFoodBase hiyayakkoGl =
            new Food(17, 6, 0.5f, false, "hiyayakko_glass").setContainer(new ItemStack(TcItems.materials, 1, ItemTcMaterials.glassBowl.id));
    public static TcFoodBase nattoHiyayakkoGl =
            new Food(18, 8, 0.8f, false, "nattoHiyayakko_glass").setContainer(new ItemStack(TcItems.materials, 1, ItemTcMaterials.glassBowl.id));
    public static TcFoodBase tofuSomen =
            new Food(19, 3, 0.3f, true, "tofuSomenBowl_glass").setContainer(new ItemStack(TcItems.somenTsuyuBowl));
    public static Food zundaMochi =
            new Food(20, 3, 0.8f, false, "zundaMochi").setPotionEffect(Potion.regeneration.id, 3, 0, 1.0F).setMaxItemUseDuration(64); // For External Mod
    public static Food kinakoMochi =
            new Food(21, 5, 0.8f, false, "kinakoMochi").setMaxItemUseDuration(64); // For External Mod

    public ItemFoodSet()
    {
        super();
    }

    public static class Food extends TcFoodBase<Food>
    {

        Food(int id, int healAmount, float saturationModifier, boolean alwaysEdible, String name)
        {
            this(id, healAmount, saturationModifier, alwaysEdible, 32, name);
        }

        Food(int id, int healAmount, float saturationModifier, boolean alwaysEdible, int itemUseDuration, String name)
        {
            super(id, healAmount, saturationModifier, alwaysEdible, itemUseDuration, name);
            ItemFoodSet.foodList[id] = this;
        }
    }

    @Override
    public TcFoodBase getFood(int dmg)
    {
        return foodList[dmg < foodList.length ? dmg : 0];
    }

    @Override
    public TcFoodBase[] getFoodList()
    {
        return foodList;
    }

    public ItemStack getItemStack(Food food)
    {
        return getItemStack(food, 1);
    }

    public ItemStack getItemStack(Food food, int qty)
    {
        return new ItemStack(this, qty, food.id);
    }
}
