package BCACRestore;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.ShapelessRecipe;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class BCACPlugin extends JavaPlugin {

	@Override
	public void onDisable() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onEnable() {
		// TODO Auto-generated method stub
PluginManager pm = getServer().getPluginManager();
		 
		
	
		
			
		 ItemStack resultice = new ItemStack(Material.ICE,1);
		
		 
		 //resultmap.setData(new MaterialData(i));
		 //resultmap.setDurability((short) i);
		 
		 //resultmap.setDurability((short) i);

		 ShapelessRecipe maprecipe = new ShapelessRecipe(resultice);
		// ShapedRecipe maprecipe = new ShapedRecipe(resultmap);
		// maprecipe.shape("AAA","AAA","AAA");
		 
		 maprecipe.addIngredient(9, Material.SNOW_BLOCK);
		 //maprecipe.setIngredient('A', Material.SNOW_BLOCK);
		//maprecipe.setIngredient('C', Material.COMPASS);
		
		
		 getServer().addRecipe(maprecipe);
		
		 
		 ItemStack resultdiamond = new ItemStack(Material.DIAMOND,1);
		 ShapedRecipe diamondrecipe = new ShapedRecipe(resultdiamond);
		 diamondrecipe.shape("AAA","AAA","BBB");
		diamondrecipe.setIngredient('A', Material.STONE,64);
		diamondrecipe.setIngredient('B', Material.COAL,64);
		 
		
		
		getServer().addRecipe(diamondrecipe);
		
		ItemStack resultmoss = new ItemStack(Material.MOSSY_COBBLESTONE,1);
		ShapedRecipe mossrecipe = new ShapedRecipe(resultmoss);
		
		
		mossrecipe.shape("AAA","ABA","AAA");
		mossrecipe.setIngredient('A',Material.SLIME_BALL);
		mossrecipe.setIngredient('B',Material.COBBLESTONE);
		
		getServer().addRecipe(mossrecipe);
		 
		 
		 
		
		//pm.registerEvent(Event.Type.INVENTORY_CHANGE,mpcl, Priority.Normal, this);
        //PluginCommand batchcommand = this.getCommand("mapclone");
        //batchcommand.setExecutor(clisten);
		
	}

	
	
	
	
	
}
