/*
 * Copyright (c) 2019-2020 5zig Reborn
 * Copyright (c) 2015-2019 5zig
 *
 * This file is part of The 5zig Mod
 * The 5zig Mod is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * The 5zig Mod is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with The 5zig Mod.  If not, see <http://www.gnu.org/licenses/>.
 */

package eu.the5zig.mod.modules.items.server.gommehd;

import eu.the5zig.mod.modules.GameModeItem;
import eu.the5zig.mod.server.gomme.ServerGommeHD;

public class SGDeathmatch extends GameModeItem<ServerGommeHD.SurvivalGames> {

	public SGDeathmatch() {
		super(ServerGommeHD.SurvivalGames.class);
	}

	@Override
	protected Object getValue(boolean dummy) {
		if (dummy) {
			return shorten(10.0);
		}
		return getGameMode().getDeathmatchTime() != -1 && getGameMode().getDeathmatchTime() - System.currentTimeMillis() > 0 ? shorten(
				(double) (getGameMode().getDeathmatchTime() - System.currentTimeMillis()) / 1000.0) : null;
	}

	@Override
	public String getTranslation() {
		return "ingame.deathmatch";
	}
}
