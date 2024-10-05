
//Disable duplicate items from JEI
for (i in [
	//Iron dust
	item('appliedenergistics2:material', 49),
	item('enderio:item_material', 24),

	//Gold dust
	item('appliedenergistics2:material', 51),
	item('enderio:item_material', 25),

	//Diamond dust
	item('nuclearcraft:gem_dust'),

	//Coal dust
	item('enderio:item_material', 23),
	item('nuclearcraft:gem_dust', 7),

	//Obsidian dust
	item('enderio:item_material', 29),
	item('nuclearcraft:gem_dust', 3),

	//Lapis dust
	item('enderio:item_material', 32),

	//Ender pearl dust
	item('enderio:item_material', 28),
	item('appliedenergistics2:material', 46),

	//Quartz dust
	item('enderio:item_material', 33),
	item('nuclearcraft:gem_dust', 2),

	//End stone dust
	item('nuclearcraft:gem_dust', 11),

	//Arsenic dust
	item('nuclearcraft:gem_dust', 10),


	//Copper ingot
	item('forestry:ingot_copper'),
	item('nuclearcraft:ingot'),
	item('projectred-core:resource_item', 100),
	item('galacticraftcore:basic_item', 3),
	item('thermalfoundation:material', 128),

	//Copper block
	item('forestry:resource_storage', 1),
	item('nuclearcraft:ingot_block'),

	//Copper dust
	item('nuclearcraft:dust'),
	item('enderio:item_material', 26),

	//Copper gear
	item('forestry:gear_copper'),

	//Tin ingot
	item('forestry:ingot_tin'),
	item('nuclearcraft:ingot', 1),
	item('projectred-core:resource_item', 101),
	item('thermalfoundation:material', 129),
	item('galacticraftcore:basic_item', 4),

	//Tin block
	item('forestry:resource_storage', 2),
	item('nuclearcraft:ingot_block', 1),

	//Tin dust
	item('nuclearcraft:dust', 1),
	item('enderio:item_material', 27),

	//Tin gear
	item('forestry:gear_tin'),

	//Bronze ingot
	item('forestry:ingot_bronze'),
	item('nuclearcraft:alloy'),

	//Bronze block
	item('forestry:resource_storage', 3),

	//Bronze gear
	item('forestry:gear_bronze'),

	//Steel ingot
	item('nuclearcraft:alloy', 5),
	item('thermalfoundation:material', 160),

	//Lead ingot
	item('nuclearcraft:ingot', 2),
	item('thermalfoundation:material', 131),
	item('galacticraftplanets:basic_item_venus', 1),
	item('extraplanets:ingot_lead'),
	item('extraplanets:ingot_lead'),

	//Lead block
	item('nuclearcraft:ingot_block', 2),

	//Lead dust
	item('nuclearcraft:dust', 2),

	//Aluminium ingot
	item('nuclearcraft:ingot', 12),
	item('thermalfoundation:material', 132),
	item('galacticraftcore:basic_item', 5),

	//Aluminium block
	item('nuclearcraft:ingot_block', 12),

	//Aluminium dust
	item('nuclearcraft:dust', 12),

	//Silver ingot
	item('nuclearcraft:ingot', 13),
	item('projectred-core:resource_item', 102),
	item('thermalfoundation:material', 130),

	//Silver block
	item('nuclearcraft:ingot_block', 13),

	//Platinum ingot
	item('qmd:ingot', 10),
	item('thermalfoundation:material', 134),
	item('extraplanets:tier11_items', 5),

	//Platinum dust
	item('qmd:dust', 10),

	//Stainless steel ingot
	item('qmd:ingot_alloy', 2),

	//Beryllium ingot
	item('nuclearcraft:ingot', 9),

	//Beryllium dust
	item('nuclearcraft:dust', 9),

	//Manganese ingot
	item('nuclearcraft:ingot', 11),

	//Manganese block
	item('nuclearcraft:ingot_block', 11),

	//Manganese dust
	item('nuclearcraft:dust', 11),

	//Magnesium ingot
	item('extraplanets:tier6_items', 5),

	//Magnesium-diboride ingot
	item('nuclearcraft:alloy', 3),

	//Osmiridium ingot
	item('qmd:ingot_alloy', 4),

	//Red alloy ingot
	item('projectred-core:resource_item', 103),

	//Niobium-titanium ingot
	item('qmd:ingot_alloy', 3),

	//Nichrome ingot
	item('qmd:ingot_alloy', 5),

	//Iridium ingot
	item('qmd:ingot', 9),
	item('thermalfoundation:material', 135),

	//Iridium dust
	item('qmd:dust', 9),

	//Titanium ingot
	item('qmd:ingot', 3),
	item('galacticraftplanets:item_basic_asteroids'),

	//Tungsten ingot
	item('qmd:ingot'),
	item('extraplanets:tier9_items', 5),

	//Tungsten dust
	item('qmd:dust'),

	//Niobium ingot
	item('qmd:ingot', 1),

	//Niobium dust
	item('qmd:dust', 1),

	//Cobalt ingot
	item('qmd:ingot', 4),

	//Cobalt dust
	item('qmd:dust', 4),
	item('enderio:item_material', 31),

	//Nickel ingot
	item('qmd:ingot', 5),
	item('thermalfoundation:material', 133),
	item('extraplanets:tier5_items', 7),

	//Nickel dust
	item('qmd:dust', 5),

	//Zinc ingot
	item('qmd:ingot', 7),
	item('extraplanets:tier8_items', 5),

	//Zinc dust
	item('qmd:dust', 7),

	//Yttrium ingot
	item('qmd:ingot2'),

	//Yttrium dust
	item('qmd:dust2'),

	//Neodymium ingot
	item('qmd:ingot2', 1),

	//Neodymium dust
	item('qmd:dust2', 1),

	//Palladium ingot
	item('extraplanets:tier5_items', 5),

	//Uranium ingot
	item('extraplanets:ingot_uranium')
]) {
	mods.jei.ingredient.yeet(i);
}
