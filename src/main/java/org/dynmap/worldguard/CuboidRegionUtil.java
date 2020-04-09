package org.dynmap.worldguard;

import com.sk89q.worldguard.protection.regions.ProtectedCuboidRegion;

public final class CuboidRegionUtil {

    protected static int[] sizeOf(ProtectedCuboidRegion region) {
        int x = region.getMinimumPoint().getBlockX();
        int z = region.getMinimumPoint().getBlockZ();
        int width = region.getMaximumPoint().getBlockX() - x + 1;
        int height = region.getMaximumPoint().getBlockZ() - z + 1;

        return new int[]{height, width};
    }
}
