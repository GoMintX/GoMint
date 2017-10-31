package io.gomint.server.world.block;

import io.gomint.inventory.item.*;
import io.gomint.server.registry.RegisterInfo;

/**
 * @author geNAZt
 * @version 1.0
 */
@RegisterInfo( id = 3 )
public class Dirt extends Block implements io.gomint.world.block.Dirt {

    @Override
    public int getBlockId() {
        return 3;
    }

    @Override
    public long getBreakTime() {
        return 750;
    }

    @Override
    public Class<? extends ItemStack>[] getToolInterfaces() {
        return new Class[]{
            ItemWoodenShovel.class,
            ItemIronShovel.class,
            ItemDiamondShovel.class,
            ItemGoldenShovel.class,
            ItemStoneShovel.class
        };
    }

    @Override
    public boolean canBeBrokenWithHand() {
        return true;
    }

}
