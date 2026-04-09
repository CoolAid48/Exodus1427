package com.moulberry.exodus1427.mixin;

import net.minecraft.world.level.levelgen.FlatLevelSource;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(FlatLevelSource.class)
public class FlatLevelSourceMixin {
	@Inject(at = @At("HEAD"), method = "getSeaLevel", cancellable = true)
	private void getSeaLevel(CallbackInfoReturnable<Integer> cir) {
        cir.setReturnValue(63);
	}
}