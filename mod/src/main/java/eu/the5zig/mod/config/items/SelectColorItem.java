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

package eu.the5zig.mod.config.items;

import com.google.gson.JsonObject;
import eu.the5zig.mod.I18n;
import eu.the5zig.mod.gui.GuiSettings;
import eu.the5zig.util.Utils;
import eu.the5zig.util.minecraft.ChatColor;
import org.apache.commons.lang3.StringUtils;

import java.util.Locale;

public class SelectColorItem extends ConfigItem<ChatColor> {

	/**
	 * Creates a Config Item.
	 *
	 * @param key          Der Key of the Item. Used in config File and to translate the Item.
	 * @param category     The Category of the Item. Used by {@link GuiSettings} for finding the corresponding items.
	 * @param defaultValue The Default Value of the Item.
	 */
	public SelectColorItem(String key, String category, ChatColor defaultValue) {
		super(key, category, defaultValue);
	}

	@Override
	public void deserialize(JsonObject object) {
		set(ChatColor.valueOf(object.get(getKey()).getAsString()));
	}

	@Override
	public void serialize(JsonObject object) {
		object.addProperty(getKey(), get().name());
	}

	@Override
	public void next() {
	}

	@Override
	public String translate() {
		return I18n.translate(getTranslationPrefix() + "." + getCategory() + "." + Utils.upperToDash(getKey())) + ":";
	}

	@Override
	public String translateValue() {
		return StringUtils.capitalize(get().name().toLowerCase(Locale.ROOT).replace("_", ""));
	}
}
