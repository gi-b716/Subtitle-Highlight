package Iekrin.SubtitleHighlight.Initializer;

import Iekrin.SubtitleHighlight.Configure.Configuration;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public class Client implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        Configuration.加载();
    }
}