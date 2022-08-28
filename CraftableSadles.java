package craftablesadles.craftablesadles;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.java.JavaPlugin;

public final class CraftableSadles extends JavaPlugin {

    @Override
    public void onEnable() {
        recipeSaddle();

    }
    private void recipeSaddle() {
        ItemStack saddle = new ItemStack(Material.SADDLE);

        ShapedRecipe recipe = new ShapedRecipe(new NamespacedKey(this, "Horse_Saddle"), new ItemStack(Material.SADDLE));

        recipe.shape("LLL","LQF"," S ");
        recipe.setIngredient('L', Material.LEATHER);
        recipe.setIngredient('S', Material.TRIPWIRE_HOOK);
        recipe.setIngredient('F', Material.IRON_INGOT);
        recipe.setIngredient('Q', Material.STICK);

        Bukkit.addRecipe(recipe);
    }
}
