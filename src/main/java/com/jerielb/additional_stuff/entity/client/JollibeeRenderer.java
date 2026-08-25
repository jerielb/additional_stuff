package com.jerielb.additional_stuff.entity.client;

import com.jerielb.additional_stuff.AdditionalStuff;
import com.jerielb.additional_stuff.entity.custom.JollibeeEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class JollibeeRenderer extends MobEntityRenderer<JollibeeEntity, JollibeeModel<JollibeeEntity>> {
	public JollibeeRenderer(EntityRendererFactory.Context context) {
		super(context, new JollibeeModel<>(context.getPart(JollibeeModel.JOLLIBEE)), 0.75f);
	}
	
	@Override
	public Identifier getTexture(JollibeeEntity entity) {
		return Identifier.of(AdditionalStuff.MOD_ID, "textures/entity/jollibee/jollibee.png");
	}
}
