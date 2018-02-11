package com.varitekcibus.amazingfoodstuffs.init;

import java.util.ArrayList;
import java.util.List;

import com.varitekcibus.amazingfoodstuffs.objects.food.ItemFoodBase;
import com.varitekcibus.amazingfoodstuffs.objects.items.ItemBase;
import com.varitekcibus.amazingfoodstuffs.objects.tools.ToolBase;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemFood;
import net.minecraftforge.common.util.EnumHelper;

public class ItemInit {
	
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Material
	//public static final ToolMaterial TOOL_HARDENED_IRON = EnumHelper.addToolMaterial("tool_hardened_iron", 0, 120, 0.1F, 1.0F, 0);
	
	//Food Edible
	public static final ItemFood CHEDDAR = new ItemFoodBase("cheddar", 1, 0.2f, true);
	public static final ItemFood PROVALONE = new ItemFoodBase("provalone", 1, 0.2f, true);
	public static final ItemFood MUENSTER = new ItemFoodBase("muenster", 1, 0.2f, true);
	public static final ItemFood MOZZARELLA = new ItemFoodBase("mozzarella", 1, 0.2f, true);
	public static final ItemFood WHEAT_BUN = new ItemFoodBase("wheat_bun", 5, 5f, true);
	public static final ItemFood WHITE_BUN = new ItemFoodBase("white_bun", 6, 4f, true);
	public static final ItemFood WHITE_ROLL = new ItemFoodBase("white_roll", 6, 4f, true);
	public static final ItemFood LETTUCE = new ItemFoodBase("lettuce", 1, 0.1f, true);
	public static final ItemFood ONION = new ItemFoodBase("onion", 3, 0.6f, false);
	public static final ItemFood SLICED_ONION = new ItemFoodBase("sliced_onion", 2, 0.5f, false);
	public static final ItemFood TOMATO = new ItemFoodBase("tomato", 5, 0.8f, true);
	public static final ItemFood SLICED_TOMATO = new ItemFoodBase("sliced_tomato", 4, 0.8f, true);
	public static final ItemFood TOFU = new ItemFoodBase("tofu", 5, 0.8f, true);
	public static final ItemFood TENDERIZED_BEEF_RAW = new ItemFoodBase("tenderized_beef_raw", 4, 1.3f, true);
	public static final ItemFood TENDERIZED_BEEF_COOKED = new ItemFoodBase("tenderized_beef_cooked", 9, 20.8f, true);
	public static final ItemFood SLICED_BEEF = new ItemFoodBase("sliced_beef", 6, 15.1f, true);
	public static final ItemFood TENDERIZED_CHICKEN_RAW = new ItemFoodBase("tenderized_chicken_raw", 4, 1.4f, true);
	public static final ItemFood TENDERIZED_CHICKEN_COOKED = new ItemFoodBase("tenderized_chicken_cooked", 10, 20.8f, true);
	public static final ItemFood SLICED_CHICKEN = new ItemFoodBase("sliced_chicken", 6, 15.3f, true);
	public static final ItemFood MEAT_BALLS = new ItemFoodBase("meat_balls", 8, 18.2f, true);
	public static final ItemFood PASTRAMI = new ItemFoodBase("pastrami", 8, 19.3f, true);
	public static final ItemFood PEPPERONI = new ItemFoodBase("pepperoni", 8, 17.1f, true);
	public static final ItemFood SLICED_PEPPERONI = new ItemFoodBase("sliced_pepperoni", 5, 12.4f, true);
	public static final ItemFood BEEF_CHEDDAR_LETTUCE_TOMATO_WH = new ItemFoodBase("beef_cheddar_lettuce_tomato_wh", 14, 19.9f, true);
	public static final ItemFood BEEF_CHEDDAR_LETTUCE_TOMATO_WI = new ItemFoodBase("beef_cheddar_lettuce_tomato_wi", 13, 20.0f, true);
	public static final ItemFood BEEF_CHEDDAR_LETTUCE_WI = new ItemFoodBase("beef_cheddar_lettuce_wi", 11, 16.3f, true);
	public static final ItemFood BEEF_CHEDDAR_LETTUCE_WH = new ItemFoodBase("beef_cheddar_lettuce_wh", 10, 16.8f, true);
	public static final ItemFood BEEF_CHEDDAR_TOMATO_WH = new ItemFoodBase("beef_cheddar_tomato_wh", 11, 17.8f, true);
	public static final ItemFood BEEF_CHEDDAR_TOMATO_WI = new ItemFoodBase("beef_cheddar_tomato_wi", 12, 17.3f, true);
	public static final ItemFood BEEF_CHEDDAR_WH = new ItemFoodBase("beef_cheddar_wh", 9, 16.8f, true);
	public static final ItemFood BEEF_CHEDDAR_WI = new ItemFoodBase("beef_cheddar_wi", 10, 16.2f, true);
	public static final ItemFood BEEF_LETTUCE_TOMATO_WH = new ItemFoodBase("beef_lettuce_tomato_wh", 11, 17.8f, true);
	public static final ItemFood BEEF_LETTUCE_TOMATO_WI = new ItemFoodBase("beef_lettuce_tomato_wi", 12, 16.9f, true);
	public static final ItemFood BEEF_LETTUCE_WH = new ItemFoodBase("beef_lettuce_wh", 7, 15.8f, true);
	public static final ItemFood BEEF_LETTUCE_WI = new ItemFoodBase("beef_lettuce_wi", 8, 15.2f, true);
	public static final ItemFood BEEF_MOZZARELLA_LETTUCE_TOMATO_WH = new ItemFoodBase("beef_mozzarella_lettuce_tomato_wh", 13, 19.8f, true);
	public static final ItemFood BEEF_MOZZARELLA_LETTUCE_TOMATO_WI = new ItemFoodBase("beef_mozzarella_lettuce_tomato_wi", 14, 19.1f, true);
	public static final ItemFood BEEF_MOZZARELLA_LETTUCE_WH = new ItemFoodBase("beef_mozzarella_lettuce_wh", 11, 17.8f, true);
	public static final ItemFood BEEF_MOZZARELLA_LETTUCE_WI = new ItemFoodBase("beef_mozzarella_lettuce_wi", 12, 17.1f, true);
	public static final ItemFood BEEF_MOZZARELLA_TOMATO_WH = new ItemFoodBase("beef_mozzarella_tomato_wh", 12, 17.3f, true);
	public static final ItemFood BEEF_MOZZARELLA_TOMATO_WI = new ItemFoodBase("beef_mozzarella_tomato_wi", 13, 16.8f, true);
	public static final ItemFood BEEF_MOZZARELLA_WH = new ItemFoodBase("beef_mozzarella_wh", 10, 15.8f, true);
	public static final ItemFood BEEF_MOZZARELLA_WI = new ItemFoodBase("beef_mozzarella_wi", 11, 15.1f, true);
	public static final ItemFood BEEF_MUENSTER_LETTUCE_TOMATO_WH = new ItemFoodBase("beef_muenster_lettuce_tomato_wh", 13, 18.8f, true);
	public static final ItemFood BEEF_MUENSTER_LETTUCE_TOMATO_WI = new ItemFoodBase("beef_muenster_lettuce_tomato_wi", 14, 18.1f, true);
	public static final ItemFood BEEF_MUENSTER_LETTUCE_WH = new ItemFoodBase("beef_muenster_lettuce_wh", 11, 17.8f, true);
	public static final ItemFood BEEF_MUENSTER_LETTUCE_WI = new ItemFoodBase("beef_muenster_lettuce_wi", 12, 17.1f, true);
	public static final ItemFood BEEF_MUENSTER_TOMATO_WH = new ItemFoodBase("beef_muenster_tomato_wh", 12, 17.8f, true);
	public static final ItemFood BEEF_MUENSTER_TOMATO_WI = new ItemFoodBase("beef_muenster_tomato_wi", 13, 17.3f, true);
	public static final ItemFood BEEF_MUENSTER_WH = new ItemFoodBase("beef_muenster_wh", 10, 16.8f, true);
	public static final ItemFood BEEF_MUENSTER_WI = new ItemFoodBase("beef_muenster_wi", 11, 16.1f, true);
	public static final ItemFood BEEF_PROVALONE_LETTUCE_TOMATO_WH = new ItemFoodBase("beef_provalone_lettuce_tomato_wh", 13, 18.8f, true);
	public static final ItemFood BEEF_PROVALONE_LETTUCE_TOMATO_WI = new ItemFoodBase("beef_provalone_lettuce_tomato_wi", 14, 17.9f, true);
	public static final ItemFood BEEF_PROVALONE_LETTUCE_WH = new ItemFoodBase("beef_provalone_lettuce_wh", 11, 17.3f, true);
	public static final ItemFood BEEF_PROVALONE_LETTUCE_WI = new ItemFoodBase("beef_provalone_lettuce_wi", 12, 16.5f, true);
	public static final ItemFood BEEF_PROVALONE_TOMATO_WH = new ItemFoodBase("beef_provalone_tomato_wh", 12, 17.3f, true);
	public static final ItemFood BEEF_PROVALONE_TOMATO_WI = new ItemFoodBase("beef_provalone_tomato_wi", 13, 17.1f, true);
	public static final ItemFood BEEF_PROVALONE_WH = new ItemFoodBase("beef_provalone_wh", 10, 16.8f, true);
	public static final ItemFood BEEF_PROVALONE_WI = new ItemFoodBase("beef_provalone_wi", 11, 16.1f, true);
	public static final ItemFood BEEF_ROLL_WI = new ItemFoodBase("beef_roll_wi", 9, 14.8f, true);
	public static final ItemFood BEEF_TOMATO_WH = new ItemFoodBase("beef_tomato_wh", 10, 16.8f, true);
	public static final ItemFood BEEF_TOMATO_WI = new ItemFoodBase("beef_tomato_wi", 11, 16.2f, true);
	public static final ItemFood BEEF_WH = new ItemFoodBase("beef_wh", 9, 13.8f, true);
	public static final ItemFood BEEF_WI = new ItemFoodBase("beef_wi", 9, 13.4f, true);
	public static final ItemFood CHICKEN_CHEDDAR_LETTUCE_TOMATO_WH = new ItemFoodBase("chicken_cheddar_lettuce_tomato_wh", 15, 18.8f, true);
	public static final ItemFood CHICKEN_CHEDDAR_LETTUCE_TOMATO_WI = new ItemFoodBase("chicken_cheddar_lettuce_tomato_wi", 16, 18.1f, true);
	public static final ItemFood CHICKEN_CHEDDAR_LETTUCE_WH = new ItemFoodBase("chicken_cheddar_lettuce_wh", 13, 17.1f, true);
	public static final ItemFood CHICKEN_CHEDDAR_LETTUCE_WI = new ItemFoodBase("chicken_cheddar_lettuce_wi", 14, 16.5f, true);
	public static final ItemFood CHICKEN_CHEDDAR_TOMATO_WH = new ItemFoodBase("chicken_cheddar_tomato_wh", 14, 17.8f, true);
	public static final ItemFood CHICKEN_CHEDDAR_TOMATO_WI = new ItemFoodBase("chicken_cheddar_tomato_wi", 14, 17.1f, true);
	public static final ItemFood CHICKEN_CHEDDAR_WH = new ItemFoodBase("chicken_cheddar_wh", 12, 17.1f, true);
	public static final ItemFood CHICKEN_CHEDDAR_WI = new ItemFoodBase("chicken_cheddar_wi", 13, 16.3f, true);
	//public static final ItemFood CHICKEN_LETTUCE_TOMATO_WH = new ItemFoodBase("chicken_lettuce_tomato_wh", 13, 17.6f, true);
	//public static final ItemFood CHICKEN_LETTUCE_TOMATO_WI = new ItemFoodBase("chicken_lettuce_tomato_wi", 14, 16.9f, true);
	public static final ItemFood CHICKEN_MOZZARELLA_LETTUCE_TOMATO_WH = new ItemFoodBase("chicken_mozzarella_lettuce_tomato_wh", 15, 18.8f, true);
	public static final ItemFood CHICKEN_MOZZARELLA_LETTUCE_TOMATO_WI = new ItemFoodBase("chicken_mozzarella_lettuce_tomato_wi", 16, 18.0f, true);
	public static final ItemFood CHICKEN_MOZZARELLA_LETTUCE_WH = new ItemFoodBase("chicken_mozzarella_lettuce_wh", 13, 16.8f, true);
	public static final ItemFood CHICKEN_MOZZARELLA_LETTUCE_WI = new ItemFoodBase("chicken_mozzarella_lettuce_wi", 13, 16.6f, true);
	public static final ItemFood CHICKEN_MOZZARELLA_TOMATO_WH = new ItemFoodBase("chicken_mozzarella_tomato_wh", 14, 17.6f, true);
	public static final ItemFood CHICKEN_MOZZARELLA_TOMATO_WHI = new ItemFoodBase("chicken_mozzarella_tomato_wi", 14, 16.8f, true);
	public static final ItemFood CHICKEN_MOZZARELLA_WH = new ItemFoodBase("chicken_mozzarella_wh", 12, 16.5f, true);
	public static final ItemFood CHICKEN_MOZZARELLA_WI = new ItemFoodBase("chicken_mozzarella_wi", 13, 15.8f, true);
	public static final ItemFood CHICKEN_MUENSTER_LETTUCE_TOMATO_WH = new ItemFoodBase("chicken_muenster_lettuce_tomato_wh", 15, 18.8f, true);
	public static final ItemFood CHICKEN_MUENSTER_LETTUCE_TOMATO_WI = new ItemFoodBase("chicken_muenster_lettuce_tomato_wi", 16, 18.1f, true);
	public static final ItemFood CHICKEN_MUENSTER_LETTUCE_WH = new ItemFoodBase("chicken_muenster_lettuce_wh", 13, 17.4f, true);
	public static final ItemFood CHICKEN_MUENSTER_LETTUCE_WI = new ItemFoodBase("chicken_muenster_lettuce_wi", 13, 17.0f, true);
	public static final ItemFood CHICKEN_MUENSTER_TOMATO_WH = new ItemFoodBase("chicken_muenster_tomato_wh", 14, 17.5f, true);
	public static final ItemFood CHICKEN_MUENSTER_TOMATO_WI = new ItemFoodBase("chicken_muenster_tomato_wi", 14, 16.7f, true);
	public static final ItemFood CHICKEN_MUENSTER_WH = new ItemFoodBase("chicken_muenster_wh", 12, 16.6f, true);
	public static final ItemFood CHICKEN_MUENSTER_WI = new ItemFoodBase("chicken_muenster_wi", 13, 15.9f, true);
	public static final ItemFood CHICKEN_PROVALONE_LETTUCE_TOMATO_WH = new ItemFoodBase("chicken_provalone_lettuce_tomato_wh", 15, 18.8f, true);
	public static final ItemFood CHICKEN_PROVALONE_LETTUCE_TOMATO_WI = new ItemFoodBase("chicken_provalone_lettuce_tomato_wi", 16, 18.1f, true);
	public static final ItemFood CHICKEN_PROVALONE_LETTUCE_WH = new ItemFoodBase("chicken_provalone_lettuce_wh", 13, 17.1f, true);
	public static final ItemFood CHICKEN_PROVALONE_LETTUCE_WI = new ItemFoodBase("chicken_provalone_lettuce_wi", 13, 16.5f, true);
	public static final ItemFood CHICKEN_PROVALONE_TOMATO_WH = new ItemFoodBase("chicken_provalone_tomato_wh", 14, 17.2f, true);
	public static final ItemFood CHICKEN_PROVALONE_TOMATO_WI = new ItemFoodBase("chicken_provalone_tomato_wi", 14, 16.6f, true);
	public static final ItemFood CHICKEN_PROVALONE_WH = new ItemFoodBase("chicken_provalone_wh", 11, 16.8f, true);
	public static final ItemFood CHICKEN_PROVALONE_WI = new ItemFoodBase("chicken_provalone_wi", 13, 16.0f, true);
	public static final ItemFood CHICKEN_ROLL_WI = new ItemFoodBase("chicken_roll_wi", 9, 12.8f, true);
	public static final ItemFood CHICKEN_WI = new ItemFoodBase("chicken_wh", 10, 16.2f, true);
	public static final ItemFood CHICKEN_WH = new ItemFoodBase("chicken_wi", 11, 15.5f, true);
	public static final ItemFood PROVALONE_PEPPERONI_ONION_PIZZA = new ItemFoodBase("provalone_pepperoni_onion_pizza", 18, 20.5f, true);
	public static final ItemFood PROVALONE_ONION_PIZZA = new ItemFoodBase("provalone_onion_pizza", 16, 17.5f, true);
	public static final ItemFood PROVALONE_PEPPERONI_PIZZA = new ItemFoodBase("provalone_pepperoni_pizza", 17, 18.5f, true);
	public static final ItemFood PROVALONE_PIZZA = new ItemFoodBase("provalone_pizza", 15, 16.5f, true);
	public static final ItemFood MUENSTER_PEPPERONI_ONION_PIZZA = new ItemFoodBase("muenster_pepperoni_onion_pizza", 18, 20.4f, true);
	public static final ItemFood MUENSTER_ONION_PIZZA = new ItemFoodBase("muenster_onion_pizza", 16, 17.5f, true);
	public static final ItemFood MUENSTER_PEPPERONI_PIZZA = new ItemFoodBase("muenster_pepperoni_pizza", 17, 16.5f, true);
	public static final ItemFood MUENSTER_PIZZA = new ItemFoodBase("muenster_pizza", 15, 15.5f, true);
	public static final ItemFood CHEDDAR_PEPPERONI_ONION_PIZZA = new ItemFoodBase("cheddar_pepperoni_onion_pizza", 18, 20.3f, true);
	public static final ItemFood CHEDDAR_ONION_PIZZA = new ItemFoodBase("cheddar_onion_pizza", 16, 17.5f, true);
	public static final ItemFood CHEDDAR_PEPPERONI_PIZZA = new ItemFoodBase("cheddar_pepperoni_pizza", 16, 16.5f, true);
	public static final ItemFood CHEDDAR_PIZZA = new ItemFoodBase("cheddar_pizza", 15, 16.3f, true);
	public static final ItemFood MOZZARELLA_PEPPERONI_ONION_PIZZA = new ItemFoodBase("mozzarella_pepperoni_onion_pizza", 18, 20.5f, true);
	public static final ItemFood MOZZARELLA_ONION_PIZZA = new ItemFoodBase("mozzarella_onion_pizza", 16, 17.3f, true);
	public static final ItemFood MOZZARELLA_PEPPERONI_PIZZA = new ItemFoodBase("mozzarella_pepperoni_pizza", 17, 17.5f, true);
	public static final ItemFood MOZZARELLA_PIZZA = new ItemFoodBase("mozzarella_pizza", 15, 15.8f, true);
	public static final ItemFood CHICKEN_NOODLE_SOUP = new ItemFoodBase("chicken_noodle_soup", 15, 15.8f, true);
	public static final ItemFood ONION_SOUP = new ItemFoodBase("onion_soup", 15, 15.8f, true);
	public static final ItemFood TOMATO_SOUP = new ItemFoodBase("tomato_soup", 15, 15.8f, true);
	public static final ItemFood VEGETABLE_SOUP = new ItemFoodBase("vegetable_soup", 15, 15.8f, true);
	public static final ItemFood EMPTY_CRUST = new ItemFoodBase("empty_crust", 6, 10.9f, true);
	public static final ItemFood TOMATO_SAUCE = new ItemFoodBase("tomato_sauce", 4, 5.1f, true);
	
	
	
	
	
	//Food Non-edible 
	public static final Item FLOUR = new ItemBase("flour");
	public static final Item CHEESE_SUGAR = new ItemBase("cheese_sugar");
	public static final Item CURD = new ItemBase("curd");
	public static final Item DOUGH = new ItemBase("dough");
	public static final Item SALT = new ItemBase("salt");
	public static final Item UNCOOKED_CRUST = new ItemBase("uncooked_crust");
	
	//Items
	public static final Item HARDENED_IRON = new ItemBase("hardened_iron");
	
	
	//Tools
	public static final Item MEAT_BALLER = new ToolBase("meat_baller");
	public static final Item MEAT_KNIFE = new ToolBase("meat_knife");
	public static final Item VEGETABLE_KNIFE = new ToolBase("vegetable_knife");
	public static final Item POT = new ToolBase("pot");
	public static final Item PAN = new ToolBase("pan");
	public static final Item HEATED_PAN = new ToolBase("heated_pan");
	public static final Item TENDERIZER = new ToolBase("tenderizer");
	public static final Item PIZZA_ROLLER = new ToolBase("pizza_roller");

}
