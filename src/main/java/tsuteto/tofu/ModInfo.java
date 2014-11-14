package tsuteto.tofu;

import cpw.mods.fml.common.ModMetadata;

public class ModInfo
{
    public static void load(ModMetadata meta)
    {
        meta.modId = TofuCraftCore.modid;
        meta.name = "豆腐Craft (TofuCraft)";
        meta.description = "豆腐をおいしく頂きつつ本格豆腐建築を嗜むMODです。味噌、醤油、納豆、ずんだ、もやし、湯葉もあるよ。\n\n"
                + "TofuCraft adds Tofu, which is a food made of soybeans and tastes very light but has so many ways to use and various dishes, and will show you so many features of Tofu such as many variation of tofu, dishes, mobs, tools, weapons, energy system, and Tofu world. I wish you liked Tofu :)";
        meta.version = "1.6";
        meta.credits = "Tofu fishing originally implemented by dewfalse";
        meta.logoFile = "assets/tofucraft/textures/logo.png";
        meta.url = "http://forum.minecraftuser.jp/viewtopic.php?f=13&t=1014";
        meta.updateUrl = "https://dl.dropboxusercontent.com/u/14577828/mcmod/update/tofucraft.json";
        meta.authorList.add("つてと (Tsuteto)");

        meta.autogenerated = false;
    }
}
