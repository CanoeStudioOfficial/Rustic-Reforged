package rustic.compat.jei;

import mezz.jei.api.IJeiHelpers;
import rustic.common.crafting.ICondenserRecipe;
import rustic.common.crafting.Recipes;

import java.util.ArrayList;
import java.util.List;

public class AdvancedAlchemyRecipeMaker {

	private AdvancedAlchemyRecipeMaker() {

	}

	public static List<ICondenserRecipe> getAlchemyRecipes(IJeiHelpers helpers) {
		List<ICondenserRecipe> recipes = new ArrayList<ICondenserRecipe>();

		for (ICondenserRecipe recipe : Recipes.condenserRecipes) {
			if (recipe.isAdvanced()) {
				recipes.add(recipe);
			}
		}

		return recipes;
	}

}
