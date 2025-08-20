package rustic.common.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockFence;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import rustic.core.Rustic;

public class BlockFenceRustic extends BlockFence {

	public BlockFenceRustic(IBlockState state, String name) {
		super(state.getMaterial(), state.getMaterial().getMaterialMapColor());
		setRegistryName(name);
		setTranslationKey(Rustic.MODID + "." + name);
		GameRegistry.findRegistry(Block.class).register(this);
		GameRegistry.findRegistry(Item.class).register(new ItemBlock(this).setRegistryName(getRegistryName()));
		setHardness(2F);
		setCreativeTab(Rustic.decorTab);
		setSoundType(state.getBlock().getSoundType());
		
		Blocks.FIRE.setFireInfo(this, 5, 20);
	}
	
	public void initModel() {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0, new ModelResourceLocation(getRegistryName().toString(),"inventory"));
	}

}
