package appeng.items;

import appeng.core.features.IStackSrc;
import appeng.items.materials.TTAE2MaterialType;
import com.google.common.base.Preconditions;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;


public class TTAE2MaterialStackSrc implements IStackSrc {

    private final TTAE2MaterialType src;
    private final boolean enabled;

    public TTAE2MaterialStackSrc(final TTAE2MaterialType src, boolean enabled) {
        Preconditions.checkNotNull(src);

        this.src = src;
        this.enabled = enabled;
    }

    @Override
    public ItemStack stack(final int stackSize) {
        return this.src.stack(stackSize);
    }

    @Override
    public Item getItem() {
        return this.src.getItemInstance();
    }

    @Override
    public int getDamage() {
        return this.src.getDamageValue();
    }

    @Override
    public boolean isEnabled() {
        return this.enabled;
    }
}
