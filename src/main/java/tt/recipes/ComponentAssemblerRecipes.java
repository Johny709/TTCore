package tt.recipes;

import gregtech.api.recipes.RecipeMap;
import gregtech.api.unification.ore.OrePrefix;
import gregtech.common.items.MetaItems;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import static gregtech.api.unification.material.MarkerMaterials.Tier.LV;
import static gregtech.api.unification.material.Materials.Steel;
import static gregtech.api.unification.material.Materials.Tin;

public class ComponentAssemblerRecipes {

    public static void init() {
        RecipeMap<?> STEAM_COMPONENT_ASSEMBLER_RECIPES = RecipeMap.getByName("steam_component_assembler");
        RecipeMap<?> COMPONENT_ASSEMBLER_RECIPES = RecipeMap.getByName("electric_component_assembler");

        STEAM_COMPONENT_ASSEMBLER_RECIPES.recipeBuilder()
                .input(OrePrefix.cableGtSingle, Tin, 3)
                .input(OrePrefix.stick, Steel, 2)
                .input(OrePrefix.circuit, LV, 1)
                .input(MetaItems.ELECTRIC_MOTOR_LV)
                .input(MetaItems.ELECTRIC_PISTON_LV)
                .output(MetaItems.ROBOT_ARM_LV)
                .duration(100).EUt(8)
                .buildAndRegister();

        COMPONENT_ASSEMBLER_RECIPES.recipeBuilder()
                .input(OrePrefix.cableGtSingle, Tin, 3)
                .input(OrePrefix.stick, Steel, 2)
                .input(OrePrefix.circuit, LV, 1)
                .input(MetaItems.ELECTRIC_MOTOR_LV)
                .input(MetaItems.ELECTRIC_PISTON_LV)
                .output(MetaItems.ROBOT_ARM_LV)
                .duration(100).EUt(30)
                .buildAndRegister();
    }
}
