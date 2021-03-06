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

package eu.the5zig.mod.modules;

import eu.the5zig.util.minecraft.ChatColor;

public class ModuleItemFormattingImpl implements ModuleItemFormatting {

	private ChatColor prefixFormatting;
	private ChatColor prefixColor;
	private ChatColor mainFormatting;
	private ChatColor mainColor;
	private int mainRgb, prefixRgb;

	public ModuleItemFormattingImpl(ChatColor prefixFormatting, ChatColor prefixColor, ChatColor mainFormatting, ChatColor mainColor) {
		this.prefixFormatting = prefixFormatting;
		setPrefixColor(prefixColor);
		this.mainFormatting = mainFormatting;
		setMainColor(mainColor);
	}

	@Override
	public ChatColor getPrefixFormatting() {
		return prefixFormatting;
	}

	public void setPrefixFormatting(ChatColor prefixFormatting) {
		this.prefixFormatting = prefixFormatting;
	}

	@Override
	public ChatColor getPrefixColor() {
		return prefixColor;
	}

	public void setPrefixColor(ChatColor prefixColor) {
		this.prefixColor = prefixColor;
		this.prefixRgb = prefixColor == null ? ChatColor.WHITE.getColor() : prefixColor.getColor();
	}

	@Override
	public ChatColor getMainFormatting() {
		return mainFormatting;
	}

	public void setMainFormatting(ChatColor mainFormatting) {
		this.mainFormatting = mainFormatting;
	}

	@Override
	public ChatColor getMainColor() {
		return mainColor;
	}

	@Override
	public int getMainRgb() {
		return mainRgb;
	}

	@Override
	public int getPrefixRgb() {
		return prefixRgb;
	}

	public void setMainRgb(int mainRgb) {
		this.mainRgb = mainRgb;
	}

	public void setPrefixRgb(int prefixRgb) {
		this.prefixRgb = prefixRgb;
	}

	public void setMainColor(ChatColor mainColor) {
		this.mainColor = mainColor;
		this.mainRgb = mainColor == null ? ChatColor.WHITE.getColor() : mainColor.getColor();
	}
}
