package mrthomas20121.rechiseled_compat.compat;import mrthomas20121.rechiseled_compat.RechiseledCompat;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
public class BlueSkiesItems {

    public static DeferredRegister<Item> ITEMS = DeferredRegister.create(Item.class, RechiseledCompat.MOD_ID);

    public static RegistryObject<Item> BLUE_SKIES_BLUEBRIGHT_PLANKS_BEAMS = ITEMS.register("blue_skies_bluebright_planks_beams", () -> new BlockItem(BlueSkiesBlocks.BLUE_SKIES_BLUEBRIGHT_PLANKS_BEAMS.get(), getProperties()));
    public static RegistryObject<Item> BLUE_SKIES_BLUEBRIGHT_PLANKS_BEAMS_CONNECTING = ITEMS.register("blue_skies_bluebright_planks_beams_connecting", () -> new BlockItem(BlueSkiesBlocks.BLUE_SKIES_BLUEBRIGHT_PLANKS_BEAMS_CONNECTING.get(), getProperties()));
    public static RegistryObject<Item> BLUE_SKIES_BLUEBRIGHT_PLANKS_BRICKS = ITEMS.register("blue_skies_bluebright_planks_bricks", () -> new BlockItem(BlueSkiesBlocks.BLUE_SKIES_BLUEBRIGHT_PLANKS_BRICKS.get(), getProperties()));
    public static RegistryObject<Item> BLUE_SKIES_BLUEBRIGHT_PLANKS_BRICKS_CONNECTING = ITEMS.register("blue_skies_bluebright_planks_bricks_connecting", () -> new BlockItem(BlueSkiesBlocks.BLUE_SKIES_BLUEBRIGHT_PLANKS_BRICKS_CONNECTING.get(), getProperties()));
    public static RegistryObject<Item> BLUE_SKIES_BLUEBRIGHT_PLANKS_CRATE = ITEMS.register("blue_skies_bluebright_planks_crate", () -> new BlockItem(BlueSkiesBlocks.BLUE_SKIES_BLUEBRIGHT_PLANKS_CRATE.get(), getProperties()));
    public static RegistryObject<Item> BLUE_SKIES_BLUEBRIGHT_PLANKS_CRATE_CONNECTING = ITEMS.register("blue_skies_bluebright_planks_crate_connecting", () -> new BlockItem(BlueSkiesBlocks.BLUE_SKIES_BLUEBRIGHT_PLANKS_CRATE_CONNECTING.get(), getProperties()));
    public static RegistryObject<Item> BLUE_SKIES_BLUEBRIGHT_PLANKS_DIAGONAL_STRIPES = ITEMS.register("blue_skies_bluebright_planks_diagonal_stripes", () -> new BlockItem(BlueSkiesBlocks.BLUE_SKIES_BLUEBRIGHT_PLANKS_DIAGONAL_STRIPES.get(), getProperties()));
    public static RegistryObject<Item> BLUE_SKIES_BLUEBRIGHT_PLANKS_DIAGONAL_STRIPES_CONNECTING = ITEMS.register("blue_skies_bluebright_planks_diagonal_stripes_connecting", () -> new BlockItem(BlueSkiesBlocks.BLUE_SKIES_BLUEBRIGHT_PLANKS_DIAGONAL_STRIPES_CONNECTING.get(), getProperties()));
    public static RegistryObject<Item> BLUE_SKIES_BLUEBRIGHT_PLANKS_DIAGONAL_TILES = ITEMS.register("blue_skies_bluebright_planks_diagonal_tiles", () -> new BlockItem(BlueSkiesBlocks.BLUE_SKIES_BLUEBRIGHT_PLANKS_DIAGONAL_TILES.get(), getProperties()));
    public static RegistryObject<Item> BLUE_SKIES_BLUEBRIGHT_PLANKS_DIAGONAL_TILES_CONNECTING = ITEMS.register("blue_skies_bluebright_planks_diagonal_tiles_connecting", () -> new BlockItem(BlueSkiesBlocks.BLUE_SKIES_BLUEBRIGHT_PLANKS_DIAGONAL_TILES_CONNECTING.get(), getProperties()));
    public static RegistryObject<Item> BLUE_SKIES_BLUEBRIGHT_PLANKS_DOTTED = ITEMS.register("blue_skies_bluebright_planks_dotted", () -> new BlockItem(BlueSkiesBlocks.BLUE_SKIES_BLUEBRIGHT_PLANKS_DOTTED.get(), getProperties()));
    public static RegistryObject<Item> BLUE_SKIES_BLUEBRIGHT_PLANKS_DOTTED_CONNECTING = ITEMS.register("blue_skies_bluebright_planks_dotted_connecting", () -> new BlockItem(BlueSkiesBlocks.BLUE_SKIES_BLUEBRIGHT_PLANKS_DOTTED_CONNECTING.get(), getProperties()));
    public static RegistryObject<Item> BLUE_SKIES_BLUEBRIGHT_PLANKS_FLOORING = ITEMS.register("blue_skies_bluebright_planks_flooring", () -> new BlockItem(BlueSkiesBlocks.BLUE_SKIES_BLUEBRIGHT_PLANKS_FLOORING.get(), getProperties()));
    public static RegistryObject<Item> BLUE_SKIES_BLUEBRIGHT_PLANKS_FLOORING_CONNECTING = ITEMS.register("blue_skies_bluebright_planks_flooring_connecting", () -> new BlockItem(BlueSkiesBlocks.BLUE_SKIES_BLUEBRIGHT_PLANKS_FLOORING_CONNECTING.get(), getProperties()));
    public static RegistryObject<Item> BLUE_SKIES_BLUEBRIGHT_PLANKS_LARGE_TILES = ITEMS.register("blue_skies_bluebright_planks_large_tiles", () -> new BlockItem(BlueSkiesBlocks.BLUE_SKIES_BLUEBRIGHT_PLANKS_LARGE_TILES.get(), getProperties()));
    public static RegistryObject<Item> BLUE_SKIES_BLUEBRIGHT_PLANKS_LARGE_TILES_CONNECTING = ITEMS.register("blue_skies_bluebright_planks_large_tiles_connecting", () -> new BlockItem(BlueSkiesBlocks.BLUE_SKIES_BLUEBRIGHT_PLANKS_LARGE_TILES_CONNECTING.get(), getProperties()));
    public static RegistryObject<Item> BLUE_SKIES_BLUEBRIGHT_PLANKS_PATTERN = ITEMS.register("blue_skies_bluebright_planks_pattern", () -> new BlockItem(BlueSkiesBlocks.BLUE_SKIES_BLUEBRIGHT_PLANKS_PATTERN.get(), getProperties()));
    public static RegistryObject<Item> BLUE_SKIES_BLUEBRIGHT_PLANKS_PATTERN_CONNECTING = ITEMS.register("blue_skies_bluebright_planks_pattern_connecting", () -> new BlockItem(BlueSkiesBlocks.BLUE_SKIES_BLUEBRIGHT_PLANKS_PATTERN_CONNECTING.get(), getProperties()));
    public static RegistryObject<Item> BLUE_SKIES_BLUEBRIGHT_PLANKS_SMALL_BRICKS = ITEMS.register("blue_skies_bluebright_planks_small_bricks", () -> new BlockItem(BlueSkiesBlocks.BLUE_SKIES_BLUEBRIGHT_PLANKS_SMALL_BRICKS.get(), getProperties()));
    public static RegistryObject<Item> BLUE_SKIES_BLUEBRIGHT_PLANKS_SMALL_BRICKS_CONNECTING = ITEMS.register("blue_skies_bluebright_planks_small_bricks_connecting", () -> new BlockItem(BlueSkiesBlocks.BLUE_SKIES_BLUEBRIGHT_PLANKS_SMALL_BRICKS_CONNECTING.get(), getProperties()));
    public static RegistryObject<Item> BLUE_SKIES_BLUEBRIGHT_PLANKS_SMALL_TILES = ITEMS.register("blue_skies_bluebright_planks_small_tiles", () -> new BlockItem(BlueSkiesBlocks.BLUE_SKIES_BLUEBRIGHT_PLANKS_SMALL_TILES.get(), getProperties()));
    public static RegistryObject<Item> BLUE_SKIES_BLUEBRIGHT_PLANKS_SMALL_TILES_CONNECTING = ITEMS.register("blue_skies_bluebright_planks_small_tiles_connecting", () -> new BlockItem(BlueSkiesBlocks.BLUE_SKIES_BLUEBRIGHT_PLANKS_SMALL_TILES_CONNECTING.get(), getProperties()));
    public static RegistryObject<Item> BLUE_SKIES_BLUEBRIGHT_PLANKS_SQUARES = ITEMS.register("blue_skies_bluebright_planks_squares", () -> new BlockItem(BlueSkiesBlocks.BLUE_SKIES_BLUEBRIGHT_PLANKS_SQUARES.get(), getProperties()));
    public static RegistryObject<Item> BLUE_SKIES_BLUEBRIGHT_PLANKS_SQUARES_CONNECTING = ITEMS.register("blue_skies_bluebright_planks_squares_connecting", () -> new BlockItem(BlueSkiesBlocks.BLUE_SKIES_BLUEBRIGHT_PLANKS_SQUARES_CONNECTING.get(), getProperties()));
    public static RegistryObject<Item> BLUE_SKIES_BLUEBRIGHT_PLANKS_TILES = ITEMS.register("blue_skies_bluebright_planks_tiles", () -> new BlockItem(BlueSkiesBlocks.BLUE_SKIES_BLUEBRIGHT_PLANKS_TILES.get(), getProperties()));
    public static RegistryObject<Item> BLUE_SKIES_BLUEBRIGHT_PLANKS_TILES_CONNECTING = ITEMS.register("blue_skies_bluebright_planks_tiles_connecting", () -> new BlockItem(BlueSkiesBlocks.BLUE_SKIES_BLUEBRIGHT_PLANKS_TILES_CONNECTING.get(), getProperties()));
    public static RegistryObject<Item> BLUE_SKIES_BLUEBRIGHT_PLANKS_WAVY = ITEMS.register("blue_skies_bluebright_planks_wavy", () -> new BlockItem(BlueSkiesBlocks.BLUE_SKIES_BLUEBRIGHT_PLANKS_WAVY.get(), getProperties()));
    public static RegistryObject<Item> BLUE_SKIES_BLUEBRIGHT_PLANKS_WAVY_CONNECTING = ITEMS.register("blue_skies_bluebright_planks_wavy_connecting", () -> new BlockItem(BlueSkiesBlocks.BLUE_SKIES_BLUEBRIGHT_PLANKS_WAVY_CONNECTING.get(), getProperties()));
    public static RegistryObject<Item> BLUE_SKIES_BLUEBRIGHT_PLANKS_WOVEN = ITEMS.register("blue_skies_bluebright_planks_woven", () -> new BlockItem(BlueSkiesBlocks.BLUE_SKIES_BLUEBRIGHT_PLANKS_WOVEN.get(), getProperties()));
    public static RegistryObject<Item> BLUE_SKIES_BLUEBRIGHT_PLANKS_WOVEN_CONNECTING = ITEMS.register("blue_skies_bluebright_planks_woven_connecting", () -> new BlockItem(BlueSkiesBlocks.BLUE_SKIES_BLUEBRIGHT_PLANKS_WOVEN_CONNECTING.get(), getProperties()));
    public static RegistryObject<Item> BLUE_SKIES_CHERRY_PLANKS_BEAMS = ITEMS.register("blue_skies_cherry_planks_beams", () -> new BlockItem(BlueSkiesBlocks.BLUE_SKIES_CHERRY_PLANKS_BEAMS.get(), getProperties()));
    public static RegistryObject<Item> BLUE_SKIES_CHERRY_PLANKS_BEAMS_CONNECTING = ITEMS.register("blue_skies_cherry_planks_beams_connecting", () -> new BlockItem(BlueSkiesBlocks.BLUE_SKIES_CHERRY_PLANKS_BEAMS_CONNECTING.get(), getProperties()));
    public static RegistryObject<Item> BLUE_SKIES_CHERRY_PLANKS_BRICKS = ITEMS.register("blue_skies_cherry_planks_bricks", () -> new BlockItem(BlueSkiesBlocks.BLUE_SKIES_CHERRY_PLANKS_BRICKS.get(), getProperties()));
    public static RegistryObject<Item> BLUE_SKIES_CHERRY_PLANKS_BRICKS_CONNECTING = ITEMS.register("blue_skies_cherry_planks_bricks_connecting", () -> new BlockItem(BlueSkiesBlocks.BLUE_SKIES_CHERRY_PLANKS_BRICKS_CONNECTING.get(), getProperties()));
    public static RegistryObject<Item> BLUE_SKIES_CHERRY_PLANKS_CRATE = ITEMS.register("blue_skies_cherry_planks_crate", () -> new BlockItem(BlueSkiesBlocks.BLUE_SKIES_CHERRY_PLANKS_CRATE.get(), getProperties()));
    public static RegistryObject<Item> BLUE_SKIES_CHERRY_PLANKS_CRATE_CONNECTING = ITEMS.register("blue_skies_cherry_planks_crate_connecting", () -> new BlockItem(BlueSkiesBlocks.BLUE_SKIES_CHERRY_PLANKS_CRATE_CONNECTING.get(), getProperties()));
    public static RegistryObject<Item> BLUE_SKIES_CHERRY_PLANKS_DIAGONAL_STRIPES = ITEMS.register("blue_skies_cherry_planks_diagonal_stripes", () -> new BlockItem(BlueSkiesBlocks.BLUE_SKIES_CHERRY_PLANKS_DIAGONAL_STRIPES.get(), getProperties()));
    public static RegistryObject<Item> BLUE_SKIES_CHERRY_PLANKS_DIAGONAL_STRIPES_CONNECTING = ITEMS.register("blue_skies_cherry_planks_diagonal_stripes_connecting", () -> new BlockItem(BlueSkiesBlocks.BLUE_SKIES_CHERRY_PLANKS_DIAGONAL_STRIPES_CONNECTING.get(), getProperties()));
    public static RegistryObject<Item> BLUE_SKIES_CHERRY_PLANKS_DIAGONAL_TILES = ITEMS.register("blue_skies_cherry_planks_diagonal_tiles", () -> new BlockItem(BlueSkiesBlocks.BLUE_SKIES_CHERRY_PLANKS_DIAGONAL_TILES.get(), getProperties()));
    public static RegistryObject<Item> BLUE_SKIES_CHERRY_PLANKS_DIAGONAL_TILES_CONNECTING = ITEMS.register("blue_skies_cherry_planks_diagonal_tiles_connecting", () -> new BlockItem(BlueSkiesBlocks.BLUE_SKIES_CHERRY_PLANKS_DIAGONAL_TILES_CONNECTING.get(), getProperties()));
    public static RegistryObject<Item> BLUE_SKIES_CHERRY_PLANKS_DOTTED = ITEMS.register("blue_skies_cherry_planks_dotted", () -> new BlockItem(BlueSkiesBlocks.BLUE_SKIES_CHERRY_PLANKS_DOTTED.get(), getProperties()));
    public static RegistryObject<Item> BLUE_SKIES_CHERRY_PLANKS_DOTTED_CONNECTING = ITEMS.register("blue_skies_cherry_planks_dotted_connecting", () -> new BlockItem(BlueSkiesBlocks.BLUE_SKIES_CHERRY_PLANKS_DOTTED_CONNECTING.get(), getProperties()));
    public static RegistryObject<Item> BLUE_SKIES_CHERRY_PLANKS_FLOORING = ITEMS.register("blue_skies_cherry_planks_flooring", () -> new BlockItem(BlueSkiesBlocks.BLUE_SKIES_CHERRY_PLANKS_FLOORING.get(), getProperties()));
    public static RegistryObject<Item> BLUE_SKIES_CHERRY_PLANKS_FLOORING_CONNECTING = ITEMS.register("blue_skies_cherry_planks_flooring_connecting", () -> new BlockItem(BlueSkiesBlocks.BLUE_SKIES_CHERRY_PLANKS_FLOORING_CONNECTING.get(), getProperties()));
    public static RegistryObject<Item> BLUE_SKIES_CHERRY_PLANKS_LARGE_TILES = ITEMS.register("blue_skies_cherry_planks_large_tiles", () -> new BlockItem(BlueSkiesBlocks.BLUE_SKIES_CHERRY_PLANKS_LARGE_TILES.get(), getProperties()));
    public static RegistryObject<Item> BLUE_SKIES_CHERRY_PLANKS_LARGE_TILES_CONNECTING = ITEMS.register("blue_skies_cherry_planks_large_tiles_connecting", () -> new BlockItem(BlueSkiesBlocks.BLUE_SKIES_CHERRY_PLANKS_LARGE_TILES_CONNECTING.get(), getProperties()));
    public static RegistryObject<Item> BLUE_SKIES_CHERRY_PLANKS_PATTERN = ITEMS.register("blue_skies_cherry_planks_pattern", () -> new BlockItem(BlueSkiesBlocks.BLUE_SKIES_CHERRY_PLANKS_PATTERN.get(), getProperties()));
    public static RegistryObject<Item> BLUE_SKIES_CHERRY_PLANKS_PATTERN_CONNECTING = ITEMS.register("blue_skies_cherry_planks_pattern_connecting", () -> new BlockItem(BlueSkiesBlocks.BLUE_SKIES_CHERRY_PLANKS_PATTERN_CONNECTING.get(), getProperties()));
    public static RegistryObject<Item> BLUE_SKIES_CHERRY_PLANKS_SMALL_BRICKS = ITEMS.register("blue_skies_cherry_planks_small_bricks", () -> new BlockItem(BlueSkiesBlocks.BLUE_SKIES_CHERRY_PLANKS_SMALL_BRICKS.get(), getProperties()));
    public static RegistryObject<Item> BLUE_SKIES_CHERRY_PLANKS_SMALL_BRICKS_CONNECTING = ITEMS.register("blue_skies_cherry_planks_small_bricks_connecting", () -> new BlockItem(BlueSkiesBlocks.BLUE_SKIES_CHERRY_PLANKS_SMALL_BRICKS_CONNECTING.get(), getProperties()));
    public static RegistryObject<Item> BLUE_SKIES_CHERRY_PLANKS_SMALL_TILES = ITEMS.register("blue_skies_cherry_planks_small_tiles", () -> new BlockItem(BlueSkiesBlocks.BLUE_SKIES_CHERRY_PLANKS_SMALL_TILES.get(), getProperties()));
    public static RegistryObject<Item> BLUE_SKIES_CHERRY_PLANKS_SMALL_TILES_CONNECTING = ITEMS.register("blue_skies_cherry_planks_small_tiles_connecting", () -> new BlockItem(BlueSkiesBlocks.BLUE_SKIES_CHERRY_PLANKS_SMALL_TILES_CONNECTING.get(), getProperties()));
    public static RegistryObject<Item> BLUE_SKIES_CHERRY_PLANKS_SQUARES = ITEMS.register("blue_skies_cherry_planks_squares", () -> new BlockItem(BlueSkiesBlocks.BLUE_SKIES_CHERRY_PLANKS_SQUARES.get(), getProperties()));
    public static RegistryObject<Item> BLUE_SKIES_CHERRY_PLANKS_SQUARES_CONNECTING = ITEMS.register("blue_skies_cherry_planks_squares_connecting", () -> new BlockItem(BlueSkiesBlocks.BLUE_SKIES_CHERRY_PLANKS_SQUARES_CONNECTING.get(), getProperties()));
    public static RegistryObject<Item> BLUE_SKIES_CHERRY_PLANKS_TILES = ITEMS.register("blue_skies_cherry_planks_tiles", () -> new BlockItem(BlueSkiesBlocks.BLUE_SKIES_CHERRY_PLANKS_TILES.get(), getProperties()));
    public static RegistryObject<Item> BLUE_SKIES_CHERRY_PLANKS_TILES_CONNECTING = ITEMS.register("blue_skies_cherry_planks_tiles_connecting", () -> new BlockItem(BlueSkiesBlocks.BLUE_SKIES_CHERRY_PLANKS_TILES_CONNECTING.get(), getProperties()));
    public static RegistryObject<Item> BLUE_SKIES_CHERRY_PLANKS_WAVY = ITEMS.register("blue_skies_cherry_planks_wavy", () -> new BlockItem(BlueSkiesBlocks.BLUE_SKIES_CHERRY_PLANKS_WAVY.get(), getProperties()));
    public static RegistryObject<Item> BLUE_SKIES_CHERRY_PLANKS_WAVY_CONNECTING = ITEMS.register("blue_skies_cherry_planks_wavy_connecting", () -> new BlockItem(BlueSkiesBlocks.BLUE_SKIES_CHERRY_PLANKS_WAVY_CONNECTING.get(), getProperties()));
    public static RegistryObject<Item> BLUE_SKIES_CHERRY_PLANKS_WOVEN = ITEMS.register("blue_skies_cherry_planks_woven", () -> new BlockItem(BlueSkiesBlocks.BLUE_SKIES_CHERRY_PLANKS_WOVEN.get(), getProperties()));
    public static RegistryObject<Item> BLUE_SKIES_CHERRY_PLANKS_WOVEN_CONNECTING = ITEMS.register("blue_skies_cherry_planks_woven_connecting", () -> new BlockItem(BlueSkiesBlocks.BLUE_SKIES_CHERRY_PLANKS_WOVEN_CONNECTING.get(), getProperties()));
    public static RegistryObject<Item> BLUE_SKIES_FROSTBRIGHT_PLANKS_BEAMS = ITEMS.register("blue_skies_frostbright_planks_beams", () -> new BlockItem(BlueSkiesBlocks.BLUE_SKIES_FROSTBRIGHT_PLANKS_BEAMS.get(), getProperties()));
    public static RegistryObject<Item> BLUE_SKIES_FROSTBRIGHT_PLANKS_BEAMS_CONNECTING = ITEMS.register("blue_skies_frostbright_planks_beams_connecting", () -> new BlockItem(BlueSkiesBlocks.BLUE_SKIES_FROSTBRIGHT_PLANKS_BEAMS_CONNECTING.get(), getProperties()));
    public static RegistryObject<Item> BLUE_SKIES_FROSTBRIGHT_PLANKS_BRICKS = ITEMS.register("blue_skies_frostbright_planks_bricks", () -> new BlockItem(BlueSkiesBlocks.BLUE_SKIES_FROSTBRIGHT_PLANKS_BRICKS.get(), getProperties()));
    public static RegistryObject<Item> BLUE_SKIES_FROSTBRIGHT_PLANKS_BRICKS_CONNECTING = ITEMS.register("blue_skies_frostbright_planks_bricks_connecting", () -> new BlockItem(BlueSkiesBlocks.BLUE_SKIES_FROSTBRIGHT_PLANKS_BRICKS_CONNECTING.get(), getProperties()));
    public static RegistryObject<Item> BLUE_SKIES_FROSTBRIGHT_PLANKS_CRATE = ITEMS.register("blue_skies_frostbright_planks_crate", () -> new BlockItem(BlueSkiesBlocks.BLUE_SKIES_FROSTBRIGHT_PLANKS_CRATE.get(), getProperties()));
    public static RegistryObject<Item> BLUE_SKIES_FROSTBRIGHT_PLANKS_CRATE_CONNECTING = ITEMS.register("blue_skies_frostbright_planks_crate_connecting", () -> new BlockItem(BlueSkiesBlocks.BLUE_SKIES_FROSTBRIGHT_PLANKS_CRATE_CONNECTING.get(), getProperties()));
    public static RegistryObject<Item> BLUE_SKIES_FROSTBRIGHT_PLANKS_DIAGONAL_STRIPES = ITEMS.register("blue_skies_frostbright_planks_diagonal_stripes", () -> new BlockItem(BlueSkiesBlocks.BLUE_SKIES_FROSTBRIGHT_PLANKS_DIAGONAL_STRIPES.get(), getProperties()));
    public static RegistryObject<Item> BLUE_SKIES_FROSTBRIGHT_PLANKS_DIAGONAL_STRIPES_CONNECTING = ITEMS.register("blue_skies_frostbright_planks_diagonal_stripes_connecting", () -> new BlockItem(BlueSkiesBlocks.BLUE_SKIES_FROSTBRIGHT_PLANKS_DIAGONAL_STRIPES_CONNECTING.get(), getProperties()));
    public static RegistryObject<Item> BLUE_SKIES_FROSTBRIGHT_PLANKS_DIAGONAL_TILES = ITEMS.register("blue_skies_frostbright_planks_diagonal_tiles", () -> new BlockItem(BlueSkiesBlocks.BLUE_SKIES_FROSTBRIGHT_PLANKS_DIAGONAL_TILES.get(), getProperties()));
    public static RegistryObject<Item> BLUE_SKIES_FROSTBRIGHT_PLANKS_DIAGONAL_TILES_CONNECTING = ITEMS.register("blue_skies_frostbright_planks_diagonal_tiles_connecting", () -> new BlockItem(BlueSkiesBlocks.BLUE_SKIES_FROSTBRIGHT_PLANKS_DIAGONAL_TILES_CONNECTING.get(), getProperties()));
    public static RegistryObject<Item> BLUE_SKIES_FROSTBRIGHT_PLANKS_DOTTED = ITEMS.register("blue_skies_frostbright_planks_dotted", () -> new BlockItem(BlueSkiesBlocks.BLUE_SKIES_FROSTBRIGHT_PLANKS_DOTTED.get(), getProperties()));
    public static RegistryObject<Item> BLUE_SKIES_FROSTBRIGHT_PLANKS_DOTTED_CONNECTING = ITEMS.register("blue_skies_frostbright_planks_dotted_connecting", () -> new BlockItem(BlueSkiesBlocks.BLUE_SKIES_FROSTBRIGHT_PLANKS_DOTTED_CONNECTING.get(), getProperties()));
    public static RegistryObject<Item> BLUE_SKIES_FROSTBRIGHT_PLANKS_FLOORING = ITEMS.register("blue_skies_frostbright_planks_flooring", () -> new BlockItem(BlueSkiesBlocks.BLUE_SKIES_FROSTBRIGHT_PLANKS_FLOORING.get(), getProperties()));
    public static RegistryObject<Item> BLUE_SKIES_FROSTBRIGHT_PLANKS_FLOORING_CONNECTING = ITEMS.register("blue_skies_frostbright_planks_flooring_connecting", () -> new BlockItem(BlueSkiesBlocks.BLUE_SKIES_FROSTBRIGHT_PLANKS_FLOORING_CONNECTING.get(), getProperties()));
    public static RegistryObject<Item> BLUE_SKIES_FROSTBRIGHT_PLANKS_LARGE_TILES = ITEMS.register("blue_skies_frostbright_planks_large_tiles", () -> new BlockItem(BlueSkiesBlocks.BLUE_SKIES_FROSTBRIGHT_PLANKS_LARGE_TILES.get(), getProperties()));
    public static RegistryObject<Item> BLUE_SKIES_FROSTBRIGHT_PLANKS_LARGE_TILES_CONNECTING = ITEMS.register("blue_skies_frostbright_planks_large_tiles_connecting", () -> new BlockItem(BlueSkiesBlocks.BLUE_SKIES_FROSTBRIGHT_PLANKS_LARGE_TILES_CONNECTING.get(), getProperties()));
    public static RegistryObject<Item> BLUE_SKIES_FROSTBRIGHT_PLANKS_PATTERN = ITEMS.register("blue_skies_frostbright_planks_pattern", () -> new BlockItem(BlueSkiesBlocks.BLUE_SKIES_FROSTBRIGHT_PLANKS_PATTERN.get(), getProperties()));
    public static RegistryObject<Item> BLUE_SKIES_FROSTBRIGHT_PLANKS_PATTERN_CONNECTING = ITEMS.register("blue_skies_frostbright_planks_pattern_connecting", () -> new BlockItem(BlueSkiesBlocks.BLUE_SKIES_FROSTBRIGHT_PLANKS_PATTERN_CONNECTING.get(), getProperties()));
    public static RegistryObject<Item> BLUE_SKIES_FROSTBRIGHT_PLANKS_SMALL_BRICKS = ITEMS.register("blue_skies_frostbright_planks_small_bricks", () -> new BlockItem(BlueSkiesBlocks.BLUE_SKIES_FROSTBRIGHT_PLANKS_SMALL_BRICKS.get(), getProperties()));
    public static RegistryObject<Item> BLUE_SKIES_FROSTBRIGHT_PLANKS_SMALL_BRICKS_CONNECTING = ITEMS.register("blue_skies_frostbright_planks_small_bricks_connecting", () -> new BlockItem(BlueSkiesBlocks.BLUE_SKIES_FROSTBRIGHT_PLANKS_SMALL_BRICKS_CONNECTING.get(), getProperties()));
    public static RegistryObject<Item> BLUE_SKIES_FROSTBRIGHT_PLANKS_SMALL_TILES = ITEMS.register("blue_skies_frostbright_planks_small_tiles", () -> new BlockItem(BlueSkiesBlocks.BLUE_SKIES_FROSTBRIGHT_PLANKS_SMALL_TILES.get(), getProperties()));
    public static RegistryObject<Item> BLUE_SKIES_FROSTBRIGHT_PLANKS_SMALL_TILES_CONNECTING = ITEMS.register("blue_skies_frostbright_planks_small_tiles_connecting", () -> new BlockItem(BlueSkiesBlocks.BLUE_SKIES_FROSTBRIGHT_PLANKS_SMALL_TILES_CONNECTING.get(), getProperties()));
    public static RegistryObject<Item> BLUE_SKIES_FROSTBRIGHT_PLANKS_SQUARES = ITEMS.register("blue_skies_frostbright_planks_squares", () -> new BlockItem(BlueSkiesBlocks.BLUE_SKIES_FROSTBRIGHT_PLANKS_SQUARES.get(), getProperties()));
    public static RegistryObject<Item> BLUE_SKIES_FROSTBRIGHT_PLANKS_SQUARES_CONNECTING = ITEMS.register("blue_skies_frostbright_planks_squares_connecting", () -> new BlockItem(BlueSkiesBlocks.BLUE_SKIES_FROSTBRIGHT_PLANKS_SQUARES_CONNECTING.get(), getProperties()));
    public static RegistryObject<Item> BLUE_SKIES_FROSTBRIGHT_PLANKS_TILES = ITEMS.register("blue_skies_frostbright_planks_tiles", () -> new BlockItem(BlueSkiesBlocks.BLUE_SKIES_FROSTBRIGHT_PLANKS_TILES.get(), getProperties()));
    public static RegistryObject<Item> BLUE_SKIES_FROSTBRIGHT_PLANKS_TILES_CONNECTING = ITEMS.register("blue_skies_frostbright_planks_tiles_connecting", () -> new BlockItem(BlueSkiesBlocks.BLUE_SKIES_FROSTBRIGHT_PLANKS_TILES_CONNECTING.get(), getProperties()));
    public static RegistryObject<Item> BLUE_SKIES_FROSTBRIGHT_PLANKS_WAVY = ITEMS.register("blue_skies_frostbright_planks_wavy", () -> new BlockItem(BlueSkiesBlocks.BLUE_SKIES_FROSTBRIGHT_PLANKS_WAVY.get(), getProperties()));
    public static RegistryObject<Item> BLUE_SKIES_FROSTBRIGHT_PLANKS_WAVY_CONNECTING = ITEMS.register("blue_skies_frostbright_planks_wavy_connecting", () -> new BlockItem(BlueSkiesBlocks.BLUE_SKIES_FROSTBRIGHT_PLANKS_WAVY_CONNECTING.get(), getProperties()));
    public static RegistryObject<Item> BLUE_SKIES_FROSTBRIGHT_PLANKS_WOVEN = ITEMS.register("blue_skies_frostbright_planks_woven", () -> new BlockItem(BlueSkiesBlocks.BLUE_SKIES_FROSTBRIGHT_PLANKS_WOVEN.get(), getProperties()));
    public static RegistryObject<Item> BLUE_SKIES_FROSTBRIGHT_PLANKS_WOVEN_CONNECTING = ITEMS.register("blue_skies_frostbright_planks_woven_connecting", () -> new BlockItem(BlueSkiesBlocks.BLUE_SKIES_FROSTBRIGHT_PLANKS_WOVEN_CONNECTING.get(), getProperties()));
    public static RegistryObject<Item> BLUE_SKIES_MAPLE_PLANKS_BEAMS = ITEMS.register("blue_skies_maple_planks_beams", () -> new BlockItem(BlueSkiesBlocks.BLUE_SKIES_MAPLE_PLANKS_BEAMS.get(), getProperties()));
    public static RegistryObject<Item> BLUE_SKIES_MAPLE_PLANKS_BEAMS_CONNECTING = ITEMS.register("blue_skies_maple_planks_beams_connecting", () -> new BlockItem(BlueSkiesBlocks.BLUE_SKIES_MAPLE_PLANKS_BEAMS_CONNECTING.get(), getProperties()));
    public static RegistryObject<Item> BLUE_SKIES_MAPLE_PLANKS_BRICKS = ITEMS.register("blue_skies_maple_planks_bricks", () -> new BlockItem(BlueSkiesBlocks.BLUE_SKIES_MAPLE_PLANKS_BRICKS.get(), getProperties()));
    public static RegistryObject<Item> BLUE_SKIES_MAPLE_PLANKS_BRICKS_CONNECTING = ITEMS.register("blue_skies_maple_planks_bricks_connecting", () -> new BlockItem(BlueSkiesBlocks.BLUE_SKIES_MAPLE_PLANKS_BRICKS_CONNECTING.get(), getProperties()));
    public static RegistryObject<Item> BLUE_SKIES_MAPLE_PLANKS_CRATE = ITEMS.register("blue_skies_maple_planks_crate", () -> new BlockItem(BlueSkiesBlocks.BLUE_SKIES_MAPLE_PLANKS_CRATE.get(), getProperties()));
    public static RegistryObject<Item> BLUE_SKIES_MAPLE_PLANKS_CRATE_CONNECTING = ITEMS.register("blue_skies_maple_planks_crate_connecting", () -> new BlockItem(BlueSkiesBlocks.BLUE_SKIES_MAPLE_PLANKS_CRATE_CONNECTING.get(), getProperties()));
    public static RegistryObject<Item> BLUE_SKIES_MAPLE_PLANKS_DIAGONAL_STRIPES = ITEMS.register("blue_skies_maple_planks_diagonal_stripes", () -> new BlockItem(BlueSkiesBlocks.BLUE_SKIES_MAPLE_PLANKS_DIAGONAL_STRIPES.get(), getProperties()));
    public static RegistryObject<Item> BLUE_SKIES_MAPLE_PLANKS_DIAGONAL_STRIPES_CONNECTING = ITEMS.register("blue_skies_maple_planks_diagonal_stripes_connecting", () -> new BlockItem(BlueSkiesBlocks.BLUE_SKIES_MAPLE_PLANKS_DIAGONAL_STRIPES_CONNECTING.get(), getProperties()));
    public static RegistryObject<Item> BLUE_SKIES_MAPLE_PLANKS_DIAGONAL_TILES = ITEMS.register("blue_skies_maple_planks_diagonal_tiles", () -> new BlockItem(BlueSkiesBlocks.BLUE_SKIES_MAPLE_PLANKS_DIAGONAL_TILES.get(), getProperties()));
    public static RegistryObject<Item> BLUE_SKIES_MAPLE_PLANKS_DIAGONAL_TILES_CONNECTING = ITEMS.register("blue_skies_maple_planks_diagonal_tiles_connecting", () -> new BlockItem(BlueSkiesBlocks.BLUE_SKIES_MAPLE_PLANKS_DIAGONAL_TILES_CONNECTING.get(), getProperties()));
    public static RegistryObject<Item> BLUE_SKIES_MAPLE_PLANKS_DOTTED = ITEMS.register("blue_skies_maple_planks_dotted", () -> new BlockItem(BlueSkiesBlocks.BLUE_SKIES_MAPLE_PLANKS_DOTTED.get(), getProperties()));
    public static RegistryObject<Item> BLUE_SKIES_MAPLE_PLANKS_DOTTED_CONNECTING = ITEMS.register("blue_skies_maple_planks_dotted_connecting", () -> new BlockItem(BlueSkiesBlocks.BLUE_SKIES_MAPLE_PLANKS_DOTTED_CONNECTING.get(), getProperties()));
    public static RegistryObject<Item> BLUE_SKIES_MAPLE_PLANKS_FLOORING = ITEMS.register("blue_skies_maple_planks_flooring", () -> new BlockItem(BlueSkiesBlocks.BLUE_SKIES_MAPLE_PLANKS_FLOORING.get(), getProperties()));
    public static RegistryObject<Item> BLUE_SKIES_MAPLE_PLANKS_FLOORING_CONNECTING = ITEMS.register("blue_skies_maple_planks_flooring_connecting", () -> new BlockItem(BlueSkiesBlocks.BLUE_SKIES_MAPLE_PLANKS_FLOORING_CONNECTING.get(), getProperties()));
    public static RegistryObject<Item> BLUE_SKIES_MAPLE_PLANKS_LARGE_TILES = ITEMS.register("blue_skies_maple_planks_large_tiles", () -> new BlockItem(BlueSkiesBlocks.BLUE_SKIES_MAPLE_PLANKS_LARGE_TILES.get(), getProperties()));
    public static RegistryObject<Item> BLUE_SKIES_MAPLE_PLANKS_LARGE_TILES_CONNECTING = ITEMS.register("blue_skies_maple_planks_large_tiles_connecting", () -> new BlockItem(BlueSkiesBlocks.BLUE_SKIES_MAPLE_PLANKS_LARGE_TILES_CONNECTING.get(), getProperties()));
    public static RegistryObject<Item> BLUE_SKIES_MAPLE_PLANKS_PATTERN = ITEMS.register("blue_skies_maple_planks_pattern", () -> new BlockItem(BlueSkiesBlocks.BLUE_SKIES_MAPLE_PLANKS_PATTERN.get(), getProperties()));
    public static RegistryObject<Item> BLUE_SKIES_MAPLE_PLANKS_PATTERN_CONNECTING = ITEMS.register("blue_skies_maple_planks_pattern_connecting", () -> new BlockItem(BlueSkiesBlocks.BLUE_SKIES_MAPLE_PLANKS_PATTERN_CONNECTING.get(), getProperties()));
    public static RegistryObject<Item> BLUE_SKIES_MAPLE_PLANKS_SMALL_BRICKS = ITEMS.register("blue_skies_maple_planks_small_bricks", () -> new BlockItem(BlueSkiesBlocks.BLUE_SKIES_MAPLE_PLANKS_SMALL_BRICKS.get(), getProperties()));
    public static RegistryObject<Item> BLUE_SKIES_MAPLE_PLANKS_SMALL_BRICKS_CONNECTING = ITEMS.register("blue_skies_maple_planks_small_bricks_connecting", () -> new BlockItem(BlueSkiesBlocks.BLUE_SKIES_MAPLE_PLANKS_SMALL_BRICKS_CONNECTING.get(), getProperties()));
    public static RegistryObject<Item> BLUE_SKIES_MAPLE_PLANKS_SMALL_TILES = ITEMS.register("blue_skies_maple_planks_small_tiles", () -> new BlockItem(BlueSkiesBlocks.BLUE_SKIES_MAPLE_PLANKS_SMALL_TILES.get(), getProperties()));
    public static RegistryObject<Item> BLUE_SKIES_MAPLE_PLANKS_SMALL_TILES_CONNECTING = ITEMS.register("blue_skies_maple_planks_small_tiles_connecting", () -> new BlockItem(BlueSkiesBlocks.BLUE_SKIES_MAPLE_PLANKS_SMALL_TILES_CONNECTING.get(), getProperties()));
    public static RegistryObject<Item> BLUE_SKIES_MAPLE_PLANKS_SQUARES = ITEMS.register("blue_skies_maple_planks_squares", () -> new BlockItem(BlueSkiesBlocks.BLUE_SKIES_MAPLE_PLANKS_SQUARES.get(), getProperties()));
    public static RegistryObject<Item> BLUE_SKIES_MAPLE_PLANKS_SQUARES_CONNECTING = ITEMS.register("blue_skies_maple_planks_squares_connecting", () -> new BlockItem(BlueSkiesBlocks.BLUE_SKIES_MAPLE_PLANKS_SQUARES_CONNECTING.get(), getProperties()));
    public static RegistryObject<Item> BLUE_SKIES_MAPLE_PLANKS_TILES = ITEMS.register("blue_skies_maple_planks_tiles", () -> new BlockItem(BlueSkiesBlocks.BLUE_SKIES_MAPLE_PLANKS_TILES.get(), getProperties()));
    public static RegistryObject<Item> BLUE_SKIES_MAPLE_PLANKS_TILES_CONNECTING = ITEMS.register("blue_skies_maple_planks_tiles_connecting", () -> new BlockItem(BlueSkiesBlocks.BLUE_SKIES_MAPLE_PLANKS_TILES_CONNECTING.get(), getProperties()));
    public static RegistryObject<Item> BLUE_SKIES_MAPLE_PLANKS_WAVY = ITEMS.register("blue_skies_maple_planks_wavy", () -> new BlockItem(BlueSkiesBlocks.BLUE_SKIES_MAPLE_PLANKS_WAVY.get(), getProperties()));
    public static RegistryObject<Item> BLUE_SKIES_MAPLE_PLANKS_WAVY_CONNECTING = ITEMS.register("blue_skies_maple_planks_wavy_connecting", () -> new BlockItem(BlueSkiesBlocks.BLUE_SKIES_MAPLE_PLANKS_WAVY_CONNECTING.get(), getProperties()));
    public static RegistryObject<Item> BLUE_SKIES_MAPLE_PLANKS_WOVEN = ITEMS.register("blue_skies_maple_planks_woven", () -> new BlockItem(BlueSkiesBlocks.BLUE_SKIES_MAPLE_PLANKS_WOVEN.get(), getProperties()));
    public static RegistryObject<Item> BLUE_SKIES_MAPLE_PLANKS_WOVEN_CONNECTING = ITEMS.register("blue_skies_maple_planks_woven_connecting", () -> new BlockItem(BlueSkiesBlocks.BLUE_SKIES_MAPLE_PLANKS_WOVEN_CONNECTING.get(), getProperties()));
    public static RegistryObject<Item> BLUE_SKIES_STARLIT_PLANKS_BEAMS = ITEMS.register("blue_skies_starlit_planks_beams", () -> new BlockItem(BlueSkiesBlocks.BLUE_SKIES_STARLIT_PLANKS_BEAMS.get(), getProperties()));
    public static RegistryObject<Item> BLUE_SKIES_STARLIT_PLANKS_BEAMS_CONNECTING = ITEMS.register("blue_skies_starlit_planks_beams_connecting", () -> new BlockItem(BlueSkiesBlocks.BLUE_SKIES_STARLIT_PLANKS_BEAMS_CONNECTING.get(), getProperties()));
    public static RegistryObject<Item> BLUE_SKIES_STARLIT_PLANKS_BRICKS = ITEMS.register("blue_skies_starlit_planks_bricks", () -> new BlockItem(BlueSkiesBlocks.BLUE_SKIES_STARLIT_PLANKS_BRICKS.get(), getProperties()));
    public static RegistryObject<Item> BLUE_SKIES_STARLIT_PLANKS_BRICKS_CONNECTING = ITEMS.register("blue_skies_starlit_planks_bricks_connecting", () -> new BlockItem(BlueSkiesBlocks.BLUE_SKIES_STARLIT_PLANKS_BRICKS_CONNECTING.get(), getProperties()));
    public static RegistryObject<Item> BLUE_SKIES_STARLIT_PLANKS_CRATE = ITEMS.register("blue_skies_starlit_planks_crate", () -> new BlockItem(BlueSkiesBlocks.BLUE_SKIES_STARLIT_PLANKS_CRATE.get(), getProperties()));
    public static RegistryObject<Item> BLUE_SKIES_STARLIT_PLANKS_CRATE_CONNECTING = ITEMS.register("blue_skies_starlit_planks_crate_connecting", () -> new BlockItem(BlueSkiesBlocks.BLUE_SKIES_STARLIT_PLANKS_CRATE_CONNECTING.get(), getProperties()));
    public static RegistryObject<Item> BLUE_SKIES_STARLIT_PLANKS_DIAGONAL_STRIPES = ITEMS.register("blue_skies_starlit_planks_diagonal_stripes", () -> new BlockItem(BlueSkiesBlocks.BLUE_SKIES_STARLIT_PLANKS_DIAGONAL_STRIPES.get(), getProperties()));
    public static RegistryObject<Item> BLUE_SKIES_STARLIT_PLANKS_DIAGONAL_STRIPES_CONNECTING = ITEMS.register("blue_skies_starlit_planks_diagonal_stripes_connecting", () -> new BlockItem(BlueSkiesBlocks.BLUE_SKIES_STARLIT_PLANKS_DIAGONAL_STRIPES_CONNECTING.get(), getProperties()));
    public static RegistryObject<Item> BLUE_SKIES_STARLIT_PLANKS_DIAGONAL_TILES = ITEMS.register("blue_skies_starlit_planks_diagonal_tiles", () -> new BlockItem(BlueSkiesBlocks.BLUE_SKIES_STARLIT_PLANKS_DIAGONAL_TILES.get(), getProperties()));
    public static RegistryObject<Item> BLUE_SKIES_STARLIT_PLANKS_DIAGONAL_TILES_CONNECTING = ITEMS.register("blue_skies_starlit_planks_diagonal_tiles_connecting", () -> new BlockItem(BlueSkiesBlocks.BLUE_SKIES_STARLIT_PLANKS_DIAGONAL_TILES_CONNECTING.get(), getProperties()));
    public static RegistryObject<Item> BLUE_SKIES_STARLIT_PLANKS_DOTTED = ITEMS.register("blue_skies_starlit_planks_dotted", () -> new BlockItem(BlueSkiesBlocks.BLUE_SKIES_STARLIT_PLANKS_DOTTED.get(), getProperties()));
    public static RegistryObject<Item> BLUE_SKIES_STARLIT_PLANKS_DOTTED_CONNECTING = ITEMS.register("blue_skies_starlit_planks_dotted_connecting", () -> new BlockItem(BlueSkiesBlocks.BLUE_SKIES_STARLIT_PLANKS_DOTTED_CONNECTING.get(), getProperties()));
    public static RegistryObject<Item> BLUE_SKIES_STARLIT_PLANKS_FLOORING = ITEMS.register("blue_skies_starlit_planks_flooring", () -> new BlockItem(BlueSkiesBlocks.BLUE_SKIES_STARLIT_PLANKS_FLOORING.get(), getProperties()));
    public static RegistryObject<Item> BLUE_SKIES_STARLIT_PLANKS_FLOORING_CONNECTING = ITEMS.register("blue_skies_starlit_planks_flooring_connecting", () -> new BlockItem(BlueSkiesBlocks.BLUE_SKIES_STARLIT_PLANKS_FLOORING_CONNECTING.get(), getProperties()));
    public static RegistryObject<Item> BLUE_SKIES_STARLIT_PLANKS_LARGE_TILES = ITEMS.register("blue_skies_starlit_planks_large_tiles", () -> new BlockItem(BlueSkiesBlocks.BLUE_SKIES_STARLIT_PLANKS_LARGE_TILES.get(), getProperties()));
    public static RegistryObject<Item> BLUE_SKIES_STARLIT_PLANKS_LARGE_TILES_CONNECTING = ITEMS.register("blue_skies_starlit_planks_large_tiles_connecting", () -> new BlockItem(BlueSkiesBlocks.BLUE_SKIES_STARLIT_PLANKS_LARGE_TILES_CONNECTING.get(), getProperties()));
    public static RegistryObject<Item> BLUE_SKIES_STARLIT_PLANKS_PATTERN = ITEMS.register("blue_skies_starlit_planks_pattern", () -> new BlockItem(BlueSkiesBlocks.BLUE_SKIES_STARLIT_PLANKS_PATTERN.get(), getProperties()));
    public static RegistryObject<Item> BLUE_SKIES_STARLIT_PLANKS_PATTERN_CONNECTING = ITEMS.register("blue_skies_starlit_planks_pattern_connecting", () -> new BlockItem(BlueSkiesBlocks.BLUE_SKIES_STARLIT_PLANKS_PATTERN_CONNECTING.get(), getProperties()));
    public static RegistryObject<Item> BLUE_SKIES_STARLIT_PLANKS_SMALL_BRICKS = ITEMS.register("blue_skies_starlit_planks_small_bricks", () -> new BlockItem(BlueSkiesBlocks.BLUE_SKIES_STARLIT_PLANKS_SMALL_BRICKS.get(), getProperties()));
    public static RegistryObject<Item> BLUE_SKIES_STARLIT_PLANKS_SMALL_BRICKS_CONNECTING = ITEMS.register("blue_skies_starlit_planks_small_bricks_connecting", () -> new BlockItem(BlueSkiesBlocks.BLUE_SKIES_STARLIT_PLANKS_SMALL_BRICKS_CONNECTING.get(), getProperties()));
    public static RegistryObject<Item> BLUE_SKIES_STARLIT_PLANKS_SMALL_TILES = ITEMS.register("blue_skies_starlit_planks_small_tiles", () -> new BlockItem(BlueSkiesBlocks.BLUE_SKIES_STARLIT_PLANKS_SMALL_TILES.get(), getProperties()));
    public static RegistryObject<Item> BLUE_SKIES_STARLIT_PLANKS_SMALL_TILES_CONNECTING = ITEMS.register("blue_skies_starlit_planks_small_tiles_connecting", () -> new BlockItem(BlueSkiesBlocks.BLUE_SKIES_STARLIT_PLANKS_SMALL_TILES_CONNECTING.get(), getProperties()));
    public static RegistryObject<Item> BLUE_SKIES_STARLIT_PLANKS_SQUARES = ITEMS.register("blue_skies_starlit_planks_squares", () -> new BlockItem(BlueSkiesBlocks.BLUE_SKIES_STARLIT_PLANKS_SQUARES.get(), getProperties()));
    public static RegistryObject<Item> BLUE_SKIES_STARLIT_PLANKS_SQUARES_CONNECTING = ITEMS.register("blue_skies_starlit_planks_squares_connecting", () -> new BlockItem(BlueSkiesBlocks.BLUE_SKIES_STARLIT_PLANKS_SQUARES_CONNECTING.get(), getProperties()));
    public static RegistryObject<Item> BLUE_SKIES_STARLIT_PLANKS_TILES = ITEMS.register("blue_skies_starlit_planks_tiles", () -> new BlockItem(BlueSkiesBlocks.BLUE_SKIES_STARLIT_PLANKS_TILES.get(), getProperties()));
    public static RegistryObject<Item> BLUE_SKIES_STARLIT_PLANKS_TILES_CONNECTING = ITEMS.register("blue_skies_starlit_planks_tiles_connecting", () -> new BlockItem(BlueSkiesBlocks.BLUE_SKIES_STARLIT_PLANKS_TILES_CONNECTING.get(), getProperties()));
    public static RegistryObject<Item> BLUE_SKIES_STARLIT_PLANKS_WAVY = ITEMS.register("blue_skies_starlit_planks_wavy", () -> new BlockItem(BlueSkiesBlocks.BLUE_SKIES_STARLIT_PLANKS_WAVY.get(), getProperties()));
    public static RegistryObject<Item> BLUE_SKIES_STARLIT_PLANKS_WAVY_CONNECTING = ITEMS.register("blue_skies_starlit_planks_wavy_connecting", () -> new BlockItem(BlueSkiesBlocks.BLUE_SKIES_STARLIT_PLANKS_WAVY_CONNECTING.get(), getProperties()));
    public static RegistryObject<Item> BLUE_SKIES_STARLIT_PLANKS_WOVEN = ITEMS.register("blue_skies_starlit_planks_woven", () -> new BlockItem(BlueSkiesBlocks.BLUE_SKIES_STARLIT_PLANKS_WOVEN.get(), getProperties()));
    public static RegistryObject<Item> BLUE_SKIES_STARLIT_PLANKS_WOVEN_CONNECTING = ITEMS.register("blue_skies_starlit_planks_woven_connecting", () -> new BlockItem(BlueSkiesBlocks.BLUE_SKIES_STARLIT_PLANKS_WOVEN_CONNECTING.get(), getProperties()));

    public static Item.Properties getProperties() {
        return new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS);
    }
}