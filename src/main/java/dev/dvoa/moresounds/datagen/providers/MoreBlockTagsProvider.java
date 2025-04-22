package dev.dvoa.moresounds.datagen.providers;

import dev.dvoa.moresounds.MoreSounds;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class MoreBlockTagsProvider extends BlockTagsProvider {
    public MoreBlockTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, MoreSounds.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(@Nullable HolderLookup.Provider provider) {
    }
}