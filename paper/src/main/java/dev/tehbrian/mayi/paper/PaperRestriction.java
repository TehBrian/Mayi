package dev.tehbrian.mayi.paper;

import dev.tehbrian.mayi.core.Restriction;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.slf4j.Logger;

/**
 * A handler for all restrictions enforced by a specific version of a specific
 * plugin.
 */
public abstract class PaperRestriction extends Restriction<Player, Location> {

	/**
	 * @param logger the logger used to log whether a check fails or passes,
	 *               and why
	 */
	public PaperRestriction(final Logger logger) {
		super(logger);
	}

}
