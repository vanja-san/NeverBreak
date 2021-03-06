package cjminecraft.neverbreak;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(NeverBreak.MODID)
public class NeverBreak {
    public static final String MODID = "neverbreak";
    public static final Logger LOGGER = LogManager.getFormatterLogger(MODID);

    public static NeverBreakEnchantment NEVER_BREAK;

    public NeverBreak() {
        ForgeRegistries.ENCHANTMENTS.register(NEVER_BREAK = new NeverBreakEnchantment());
    }


}
