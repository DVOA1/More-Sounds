package dev.dvoa.moresounds.datagen.providers;

import com.google.gson.JsonElement;
import com.mojang.serialization.JsonOps;
import dev.dvoa.moresounds.datagen.codecs.SoundAction;
import dev.dvoa.moresounds.utils.SoundActionHolder;
import net.minecraft.data.CachedOutput;
import net.minecraft.data.DataProvider;
import net.minecraft.data.PackOutput;
import org.jetbrains.annotations.NotNull;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class MoreSoundActionProvider implements DataProvider {
    private static final String NAMESPACE = "minecraft";
    private final PackOutput output;
    private final List<SoundActionHolder> entries;

    public MoreSoundActionProvider(PackOutput output, List<SoundActionHolder> entries) {
        this.output = output;
        this.entries = entries;
    }

    @Override
    public CompletableFuture<?> run(CachedOutput cache) {
        Path base = output.getOutputFolder();

        List<CompletableFuture<?>> futures = new ArrayList<>();

        for (SoundActionHolder action : entries) {
            Path soundsDir = base.resolve("assets/" + NAMESPACE + "/sounds/" + action.getSoundType());
            Path file = soundsDir.resolve(action.getFileName() + ".json");

            JsonElement json = SoundAction.CODEC
                    .codec()
                    .encodeStart(JsonOps.INSTANCE, action.getSoundAction())
                    .getOrThrow();

            CompletableFuture<?> fut = DataProvider.saveStable(cache, json, file);
            futures.add(fut);
        }
        return CompletableFuture.allOf(futures.toArray(new CompletableFuture[0]));
    }

    @Override
    public @NotNull String getName() {
        return "SoundActionProvider[assets/" + NAMESPACE + "/sounds]";
    }


}
