package gregtech.api.worldgen2;

import com.google.common.collect.ImmutableSet;
import net.minecraft.init.Biomes;

import java.util.Set;

@SuppressWarnings("unused")
public class BiomeSets {

    public static final Set<String> RIVER = ImmutableSet.of(Biomes.RIVER.getBiomeName(), Biomes.FROZEN_RIVER.getBiomeName(), "Lush River", "Estuary", "Twilight Stream", "Tropical River", "Riparian Zone", "Sandstone Canyon", "Sandstone Canyon 2", "Creek Bed", "rwg_riverIce", "rwg_riverCold", "rwg_riverTemperate", "rwg_riverHot", "rwg_riverWet", "rwg_riverOasis");
    public static final Set<String> RIVER_LAKE = ImmutableSet.of(Biomes.RIVER.getBiomeName(), Biomes.FROZEN_RIVER.getBiomeName(), "Lush River", "Estuary", "Twilight Stream", "Tropical River", "Riparian Zone", "Sandstone Canyon", "Sandstone Canyon 2", "Creek Bed", "rwg_riverIce", "rwg_riverCold", "rwg_riverTemperate", "rwg_riverHot", "rwg_riverWet", "rwg_riverOasis", "Tropical Lake", "Twilight Lake", "Lake", "Oasis", "Woodland Lake", "Woodland Lake Edge");
    public static final Set<String> LAKE = ImmutableSet.of("Tropical Lake", "Twilight Lake", "Lake", "Oasis", "Woodland Lake", "Woodland Lake Edge", "Ephemeral Lake", "Ephemeral Lake Edge");
    public static final Set<String> OCEAN = ImmutableSet.of(Biomes.OCEAN.getBiomeName(), Biomes.FROZEN_OCEAN.getBiomeName(), Biomes.DEEP_OCEAN.getBiomeName(), "Coral Reef", "Kelp Forest", "Mangrove", "Ocean Oil Field", "Improved Oceans", "Tropical Ocean", "rwg_oceanIce", "rwg_oceanCold", "rwg_oceanTemperate", "rwg_oceanHot", "rwg_oceanWet", "rwg_oceanOasis");
    public static final Set<String> OCEAN_BEACH = ImmutableSet.of(Biomes.OCEAN.getBiomeName(), Biomes.FROZEN_OCEAN.getBiomeName(), Biomes.DEEP_OCEAN.getBiomeName(), Biomes.BEACH.getBiomeName(), Biomes.COLD_BEACH.getBiomeName(), Biomes.STONE_BEACH.getBiomeName(), Biomes.MUSHROOM_ISLAND_SHORE.getBiomeName(), "Coral Reef", "Kelp Forest", "Mangrove", "Ocean Oil Field", "Improved Oceans", "Tropical Ocean", "rwg_oceanIce", "rwg_oceanCold", "rwg_oceanTemperate", "rwg_oceanHot", "rwg_oceanWet", "rwg_oceanOasis", "Tropical Beach");
    public static final Set<String> INFINITE_WATER = ImmutableSet.of(Biomes.OCEAN.getBiomeName(), Biomes.FROZEN_OCEAN.getBiomeName(), Biomes.DEEP_OCEAN.getBiomeName(), Biomes.BEACH.getBiomeName(), Biomes.COLD_BEACH.getBiomeName(), Biomes.STONE_BEACH.getBiomeName(), Biomes.MUSHROOM_ISLAND_SHORE.getBiomeName(), "Coral Reef", "Kelp Forest", "Mangrove", "Ocean Oil Field", "Improved Oceans", "Tropical Ocean", "rwg_oceanIce", "rwg_oceanCold", "rwg_oceanTemperate", "rwg_oceanHot", "rwg_oceanWet", "rwg_oceanOasis", "Tropical Beach", Biomes.RIVER.getBiomeName(), Biomes.FROZEN_RIVER.getBiomeName(), "Lush River", "Estuary", "Twilight Stream", "Tropical River", "Riparian Zone", "Sandstone Canyon", "Sandstone Canyon 2", "Creek Bed", "rwg_riverIce", "rwg_riverCold", "rwg_riverTemperate", "rwg_riverHot", "rwg_riverWet", "rwg_riverOasis", "Tropical Lake", "Twilight Lake", "Lake", "Oasis", "Woodland Lake", "Woodland Lake Edge");

    public static final Set<String> JUNGLE = ImmutableSet.of(Biomes.JUNGLE.getBiomeName(), Biomes.JUNGLE_HILLS.getBiomeName(), Biomes.JUNGLE_EDGE.getBiomeName(), "Undergound Jungle", "Jungle Island", "Extreme Jungle", "Mini Jungle", "Rainforest Hills");
    public static final Set<String> CINNAMON = ImmutableSet.of(Biomes.JUNGLE.getBiomeName(), Biomes.JUNGLE_HILLS.getBiomeName(), Biomes.JUNGLE_EDGE.getBiomeName(), "Undergound Jungle", "Jungle Island", "Extreme Jungle", "Mini Jungle", "Rainforest Hills");
    public static final Set<String> BLUEMAHOE = ImmutableSet.of(Biomes.JUNGLE.getBiomeName(), Biomes.JUNGLE_HILLS.getBiomeName(), Biomes.JUNGLE_EDGE.getBiomeName(), "Undergound Jungle", "Jungle Island", "Extreme Jungle", "Mini Jungle", "Rainforest Hills");

    public static final Set<String> DESERT = ImmutableSet.of(Biomes.DESERT.getBiomeName(), Biomes.DESERT_HILLS.getBiomeName(), "Sahara", "Red Desert", "Desert Archipelago", "Oasis", "Sandstone Canyon", "Sandstone Canyon 2", "Sandstone Ranges", "Sahel", "Lush Desert", "Desert Oil Field", "Desert Island", "Mountainous Desert", "Desert Mountains", "Volcanic Desert", "Ulterior Outback");
    public static final Set<String> MESA = ImmutableSet.of(Biomes.MESA.getBiomeName(), Biomes.MESA_ROCK.getBiomeName(), Biomes.MESA_CLEAR_ROCK.getBiomeName(),"Canyon", "Mesa (Bryce)", "Mesa", "Clay Hills");
    public static final Set<String> SAVANNA = ImmutableSet.of(Biomes.SAVANNA.getBiomeName(), Biomes.SAVANNA_PLATEAU.getBiomeName(), "Steppe", "Subterranean Savannah", "Oak Savanna", "Savannah", "Savanna", "Shrubland", "Shrublands", "Roofed Shrublands", "Xeric Savanna", "Xeric Shrubland", "Prairie");

    public static final Set<String> SWAMP = ImmutableSet.of(Biomes.SWAMPLAND.getBiomeName(), "Green Swamplands", "DeepSwamp", "Land of Lakes Marsh", "Marsh", "Lush Swamp", "Moor", "Mire", "Bog", "Twilight Swamp", "Submerged Swamp", "Fire Swamp");
    public static final Set<String> WILLOW = ImmutableSet.of(Biomes.SWAMPLAND.getBiomeName(), "Green Swamplands", "DeepSwamp", "Land of Lakes Marsh", "Marsh", "Lush Swamp", "Moor", "Mire", "Bog", "Twilight Swamp", "Submerged Swamp", "Fire Swamp");

    public static final Set<String> TAIGA = ImmutableSet.of(Biomes.TAIGA.getBiomeName(), Biomes.TAIGA_HILLS.getBiomeName(), Biomes.COLD_TAIGA.getBiomeName(), Biomes.COLD_TAIGA_HILLS.getBiomeName(), Biomes.REDWOOD_TAIGA.getBiomeName(), Biomes.REDWOOD_TAIGA_HILLS.getBiomeName(), "Mountain Taiga", "Pinelands", "Tall Pine Forest", "Shield", "Cold Boreal Forest", "Cold Cypress Forest", "Cold Fir Forest", "Cold Pine Forest", "Boreal Archipelago", "Boreal Forest", "Boreal Plateau", "Twilight Highlands");
    public static final Set<String> RUBBER = ImmutableSet.of(Biomes.TAIGA.getBiomeName(), Biomes.TAIGA_HILLS.getBiomeName(), Biomes.COLD_TAIGA.getBiomeName(), Biomes.COLD_TAIGA_HILLS.getBiomeName(), Biomes.REDWOOD_TAIGA.getBiomeName(), Biomes.REDWOOD_TAIGA_HILLS.getBiomeName(), "Mountain Taiga", "Pinelands", "Tall Pine Forest", "Shield", "Cold Boreal Forest", "Cold Cypress Forest", "Cold Fir Forest", "Cold Pine Forest", "Boreal Archipelago", "Boreal Forest", "Boreal Plateau", "Twilight Highlands");

    public static final Set<String> FROZEN = ImmutableSet.of(Biomes.ICE_PLAINS.getBiomeName(), Biomes.ICE_MOUNTAINS.getBiomeName(), Biomes.COLD_TAIGA.getBiomeName(), Biomes.COLD_TAIGA_HILLS.getBiomeName(), "Snow Island", "Ice Plains Spikes", "Ice Wasteland", "Frost Forest", "Snowy Rainforest", "Snow Forest", "Snowy Forest", "Twilight Glacier", "Alpine", "Glacier", "Tundra", "Snowy Desert", "Snowy Plateau", "Snowy Ranges", "Snowy Wastelands", "Polar Desert", "Ice Sheet", "Frozen Archipelago", "Alpine Mountains", "Alpine Mountains Edge", "Alpine Tundra");

    public static final Set<String> WOODS = ImmutableSet.of(Biomes.FOREST.getBiomeName(), Biomes.FOREST_HILLS.getBiomeName(), "Autumn Forest", "Elysian Forest", "Meadow Forest", "Seasonal Forest", "Seasonal Forest Clearing", "Forested Hills", "Forested Island", "Snow Forest", "Forest Island", "Forested Archipelago", "Forested Mountains", "Forested Valley", "Redwood Forest", "Woodlands", "Woodland Mountains", "Woodland Field", "Woodland Hills", "Woodland Lake", "Woodland Lake Edge", "Dark Forest", "Dark Forest Center", "Dense Twilight Forest", "Twilight Forest", "Firefly Forest", "Maple Woods", Biomes.ROOFED_FOREST.getBiomeName(), Biomes.BIRCH_FOREST.getBiomeName(), Biomes.BIRCH_FOREST_HILLS.getBiomeName(), "Rainforest", "Rainforest Valley", "Lush Redwoods", "Spruce Woods", "Autumn Woods", "Flower Forest", "Birch Hills", "Temperate Rainforest", "Pinelands", "Tall Pine Forest", "Shield", "Mystic Grove", "Ominous Woods", "Blossom Hills", "Blossom Woods", "Aspen Forest", "Aspen Hills", "Cypress Forest", "Silver Pine Forest", "Silver Pine Hills", "Fir Forest", "Flowery Archipelago", "Oak Forest", "Pine Forest", "Pine Forest Archipelago", "Rainforest Hills", "Rainforest Mountains", "Extreme Rainforest Mountains");
    public static final Set<String> FOREST = ImmutableSet.of(Biomes.FOREST.getBiomeName(), Biomes.FOREST_HILLS.getBiomeName(), "Autumn Forest", "Elysian Forest", "Meadow Forest", "Seasonal Forest", "Seasonal Forest Clearing", "Forested Hills", "Forested Island", "Snow Forest", "Forest Island", "Forested Archipelago", "Forested Mountains", "Forested Valley", "Redwood Forest", "Woodlands", "Woodland Mountains", "Woodland Field", "Woodland Hills", "Woodland Lake", "Woodland Lake Edge", "Dark Forest", "Dark Forest Center", "Dense Twilight Forest", "Twilight Forest", "Firefly Forest");
    public static final Set<String> MAPLE = ImmutableSet.of(Biomes.FOREST.getBiomeName(), Biomes.FOREST_HILLS.getBiomeName(), "Autumn Forest", "Elysian Forest", "Meadow Forest", "Seasonal Forest", "Seasonal Forest Clearing", "Forested Hills", "Forested Island", "Snow Forest", "Forest Island", "Forested Archipelago", "Forested Mountains", "Forested Valley", "Maple Woods", "Firefly Forest");
    public static final Set<String> DARK_FOREST = ImmutableSet.of(Biomes.ROOFED_FOREST.getBiomeName(), "Dark Forest", "Dark Forest Center");

    public static final Set<String> PLAINS = ImmutableSet.of(Biomes.PLAINS.getBiomeName(), "Meadow", "Grassland", "Flower Field", "Sunflower Plains", "Clearing", "Twilight Clearing", "Elysian Fields", "Lowlands", "Origin Valley", "Grassy Archipelago", "Alfheim", "Rainforest Plains", "Tropics", "Highlands", "Bald Hill", "Tundra", "Low Hills", "Mining Biome");
    public static final Set<String> HAZEL = ImmutableSet.of(Biomes.PLAINS.getBiomeName(), "Meadow", "Grassland", "Flower Field", "Sunflower Plains", "Clearing", "Twilight Clearing", "Elysian Fields", "Lowlands", "Origin Valley", "Grassy Archipelago", "Alfheim");

    public static final Set<String> COCONUT = ImmutableSet.of(Biomes.BEACH.getBiomeName(), "Tropical Ocean", "Tropical Beach", "Tropical River", "Tropical Lake", "Tropical Archipelago", "Tropical Islands", "Tropics", "Oasis");

    public static final Set<String> MOUNTAINS = ImmutableSet.of(Biomes.EXTREME_HILLS.getBiomeName(), Biomes.EXTREME_HILLS_EDGE.getBiomeName(), Biomes.EXTREME_HILLS_WITH_TREES.getBiomeName(), Biomes.STONE_BEACH.getBiomeName(), "Mountainous Archipelago", "Mountains", "Mountains Edge", "Plateau", "Highlands", "Highlands Center", "Twilight Highlands", "Thornlands", "Alps", "Cliffs", "Flying Mountains", "Rock Mountains", "Snow Mountains", "Rock Island", "Valley", "Alpine Mountains", "Alpine Mountains Edge", "Alpine Tundra", "Stone Canyon", "Stone Canyon 2", "Rocky Desert", "Rocky Hills", "Rainforest Mountains", "Extreme Rainforest Mountains");
    public static final Set<String> BLUESPRUCE = ImmutableSet.of(Biomes.EXTREME_HILLS.getBiomeName(), Biomes.EXTREME_HILLS_EDGE.getBiomeName(), Biomes.EXTREME_HILLS_WITH_TREES.getBiomeName(), Biomes.STONE_BEACH.getBiomeName(), "Mountainous Archipelago", "Mountains", "Mountains Edge", "Plateau", "Highlands", "Highlands Center", "Twilight Highlands", "Thornlands", "Alps", "Cliffs", "Flying Mountains", "Rock Mountains", "Snow Mountains", "Rock Island", "Valley", "Alpine Mountains", "Alpine Mountains Edge", "Alpine Tundra", "Stone Canyon", "Stone Canyon 2", "Rocky Desert", "Rocky Hills", "Rainforest Mountains", "Extreme Rainforest Mountains");

    public static final Set<String> VOLCANIC = ImmutableSet.of("Fire Swamp", "Volcano", "Volcano Island", "Volcanic Desert");

    public static final Set<String> SHROOM = ImmutableSet.of(Biomes.MUSHROOM_ISLAND.getBiomeName(), Biomes.MUSHROOM_ISLAND_SHORE.getBiomeName(), "Fungal Forest", "Mushroom Forest", "Deep Mushroom Forest");

    public static final Set<String> MAGICAL = ImmutableSet.of("Magical Forest", "Eldritch", "Enchanted Forest", "Mystic Grove", "Alfheim", "Tainted Land", "Eerie", "WyvernBiome", "Ominous Woods");
    public static final Set<String> RAINBOWOOD = ImmutableSet.of("Enchanted Forest");
    public static final Set<String> MAGICAL_GOOD = ImmutableSet.of("Magical Forest", "Eldritch", "Enchanted Forest", "Mystic Grove", "Alfheim");
    public static final Set<String> MAGICAL_BAD = ImmutableSet.of("Tainted Land", "Eerie", "WyvernBiome", "Ominous Woods");

    public static final Set<String> WASTELANDS = ImmutableSet.of("Wasteland", "Wastelands", "Wasteland Mountains", "Wasteland Forest", "Radioactive Wasteland");
    public static final Set<String> RADIOACTIVE = ImmutableSet.of("Radioactive Wasteland");

    public static final Set<String> NETHER = ImmutableSet.of(Biomes.HELL.getBiomeName(), "Ruptured Chasm", "Abyssal Shadowland", "Crystalline Crag", "Basalt Deltas", "Crimson Forest", "Soul Sand Valley", "Warped Forest", "Foxfire Swamp");
    public static final Set<String> END = ImmutableSet.of(Biomes.SKY.getBiomeName());
    public static final Set<String> EREBUS = ImmutableSet.of("Undergound Jungle", "Volcanic Desert", "Subterranean Savannah", "Elysian Fields", "Ulterior Outback", "Fungal Forest", "Submerged Swamp", "Elysian Forest");
    public static final Set<String> VOID = ImmutableSet.of("Space", "space");
    public static final Set<String> MOON = ImmutableSet.of("Moon", "moon");
    public static final Set<String> MARS = ImmutableSet.of("Mars", "mars", "marsFlat");
    public static final Set<String> ASTEROIDS = ImmutableSet.of("Asteroids", "asteroids");
    public static final Set<String> SPACE = ImmutableSet.of("Space", "Alien Forest", "Moon", "mercury", "venus", "jupiter", "saturn", "uranus", "neptune", "pluto", "ceres", "eris", "europa", "io", "deimos", "phobos", "triton", "callisto", "ganymede", "rhea", "titan", "Hot Dry Rock", "Stormland", "CrystalChasms", "moon", "marsFlat", "Asteroids", "asteroids", "space", "DeepSwamp", "Marsh", "OceanSpires", "SpacePartiallySubmerged", "SpaceLowIslands", "SpaceRockyWaters", "SpaceMidHills", "SpaceHighPlateaus", "SpaceLowHills", "SpaceMidPlains", "SpaceLowPlains", "SpaceDeepOceans", "SpaceOceans", "SpaceShallowWaters", "SpaceDefault", "Pluto", "Pluto2", "Pluto3", "Pluto4", "Kuiper Belt", "Io", "IoAsh", "Haumea");
}
