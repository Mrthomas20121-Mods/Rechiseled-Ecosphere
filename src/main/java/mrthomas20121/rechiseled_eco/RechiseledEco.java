package mrthomas20121.rechiseled_eco;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(RechiseledEco.MOD_ID)
public class RechiseledEco {

	public static final String MOD_ID = "rechiseled_eco";
	public static final Logger LOGGER = LogManager.getLogger();

	public RechiseledEco() {
		ItemRegistry.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
	}
}