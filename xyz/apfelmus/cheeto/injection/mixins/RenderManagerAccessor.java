package xyz.apfelmus.cheeto.injection.mixins;

import net.minecraft.client.renderer.entity.RenderManager;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin({RenderManager.class})
public interface RenderManagerAccessor {
   @Accessor
   double getRenderPosX();

   @Accessor
   double getRenderPosY();

   @Accessor
   double getRenderPosZ();
}
