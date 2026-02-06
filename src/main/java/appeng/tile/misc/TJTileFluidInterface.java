package appeng.tile.misc;

import appeng.fluids.tile.TileFluidInterface;
import appeng.helpers.TJDualityFluidInterface;
import net.minecraftforge.fml.common.ObfuscationReflectionHelper;


public class TJTileFluidInterface extends TileFluidInterface {

    public TJTileFluidInterface() {
        ObfuscationReflectionHelper.setPrivateValue(TileFluidInterface.class, this, new TJDualityFluidInterface(this.getProxy(), this), "duality");
    }
}
