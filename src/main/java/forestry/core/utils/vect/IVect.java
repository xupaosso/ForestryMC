/*******************************************************************************
 * Copyright (c) 2011-2014 SirSengir.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser Public License v3
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/lgpl-3.0.txt
 *
 * Various Contributors including, but not limited to:
 * SirSengir (original work), CovertJaguar, Player, Binnie, MysteriousAges
 ******************************************************************************/
package forestry.core.utils.vect;

import net.minecraft.util.ChunkCoordinates;

import net.minecraftforge.common.util.ForgeDirection;

import forestry.api.farming.FarmDirection;

/**
 * Represents a position or dimensions.
 */
public interface IVect {
	int getX();

	int getY();

	int getZ();

	IVect add(IVect other);

	IVect add(int x, int y, int z);

	IVect add(ForgeDirection direction);

	IVect add(FarmDirection direction);

	IVect add(ChunkCoordinates coordinates);

	int[] toArray();
}
