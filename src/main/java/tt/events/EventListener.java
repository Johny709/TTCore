package tt.events;

import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import tt.TTTweaks;
import tt.recipes.ComponentAssemblerRecipes;
import tt.recipes.MixerRecipes;

@Mod.EventBusSubscriber(modid = TTTweaks.MOD_ID)
public class EventListener {

    @SubscribeEvent
    public static void registerRecipes(RegistryEvent.Register<IRecipe> event) {
        ComponentAssemblerRecipes.init();
        MixerRecipes.init();
    }
}
