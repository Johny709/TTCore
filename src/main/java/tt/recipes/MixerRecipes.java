package tt.recipes;

import gregtech.api.unification.ore.OrePrefix;
import net.minecraft.item.Item;
import net.minecraftforge.fluids.FluidRegistry;

import static gregtech.api.recipes.RecipeMaps.MIXER_RECIPES;
import static gregtech.api.unification.material.Materials.Diamond;
import static gregtech.api.unification.material.Materials.Glass;

public class MixerRecipes {

    public static void init() {
        MIXER_RECIPES.recipeBuilder()
                .input(Item.getByNameOrId("enderio:item_material"), 1, 22)
                .input(OrePrefix.dust, Diamond, 3)
                .input(OrePrefix.dust, Glass)
                .fluidInputs(FluidRegistry.getFluidStack("redstone", 144))
                .output(Item.getByNameOrId("gregtech:meta_dust"), 1, 32306)
                .duration(200).EUt(16)
                .buildAndRegister();
    }
}
