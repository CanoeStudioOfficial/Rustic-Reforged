package rustic.compat.jei;

import mezz.jei.api.IJeiHelpers;
import rustic.common.crafting.ICondenserRecipe;
import rustic.common.crafting.Recipes;

import java.util.ArrayList;
import java.util.List;

public class SimpleAlchemyRecipeMaker {
	
	private SimpleAlchemyRecipeMaker() {
		
	}
	
	public static List<ICondenserRecipe> getSimpleAlchemyRecipes(IJeiHelpers helpers) {
		List<ICondenserRecipe> recipes = new ArrayList<ICondenserRecipe>();
		
		for (ICondenserRecipe recipe : Recipes.condenserRecipes) {
			if (recipe.isBasic()) {
				recipes.add(recipe);
			}
		}
		
		return recipes;
	}

}
