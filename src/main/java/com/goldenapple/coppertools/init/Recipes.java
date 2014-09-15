package com.goldenapple.coppertools.init;

import com.goldenapple.coppertools.handler.ConfigHandler;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class Recipes {
    public static void init(){
        if (ConfigHandler.loadSaber){
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.woodSaber), " i ", " i ", " s ", 'i', "logWood", 's', "stickWood"));
        }
    }
}
