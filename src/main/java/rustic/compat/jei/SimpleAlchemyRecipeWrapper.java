package rustic.compat.jei;

import mezz.jei.api.ingredients.IIngredients;
import mezz.jei.api.ingredients.VanillaTypes;
import mezz.jei.api.recipe.IRecipeWrapper;
import net.minecraft.item.ItemStack;
import rustic.common.crafting.ICondenserRecipe;

import java.util.ArrayList;
import java.util.List;

public class SimpleAlchemyRecipeWrapper implements IRecipeWrapper {

	public ICondenserRecipe recipe = null;
	
	public SimpleAlchemyRecipeWrapper(ICondenserRecipe recipe) {
		this.recipe = recipe;
	}
	
	@Override
	public void getIngredients(IIngredients ingredients) {
		List<List<ItemStack>> inputs = new ArrayList<>();
		inputs.add(recipe.getBottles());
		inputs.addAll(recipe.getInputs());
		ingredients.setInputLists(VanillaTypes.ITEM, inputs);
		ingredients.setInput(VanillaTypes.FLUID, recipe.getFluid());
		ingredients.setOutput(VanillaTypes.ITEM, recipe.getResult());
	}

}
