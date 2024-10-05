


for (def i in [
	item("minecraft:stone_sword"),
	item("minecraft:iron_sword"),
	item("minecraft:golden_sword"),
	item("minecraft:diamond_sword"),

	item("minecraft:stone_pickaxe"),
	item("minecraft:iron_pickaxe"),
	item("minecraft:golden_pickaxe"),
	item("minecraft:diamond_pickaxe"),

	item("minecraft:stone_axe"),
	item("minecraft:iron_axe"),
	item("minecraft:golden_axe"),
	item("minecraft:diamond_axe"),

	item("minecraft:stone_shovel"),
	item("minecraft:iron_shovel"),
	item("minecraft:golden_shovel"),
	item("minecraft:diamond_shovel"),

	item("minecraft:stone_hoe"),
	item("minecraft:iron_hoe"),
	item("minecraft:golden_hoe"),
	item("minecraft:diamond_hoe")
]) {
	crafting.removeByOutput(i);
	mods.jei.ingredient.yeet(i);
}

for (def i in [
	item("gregtech:sword"),
	item("gregtech:pickaxe"),
	item("gregtech:axe"),
	item("gregtech:shovel"),
	item("gregtech:hoe"),
	item("gregtech:mining_hammer"),
	item("gregtech:spade"),
	item("gregtech:scythe")
]) {
	crafting.removeByOutput(i);
}

for (def i in [
	"gregtech:flint" : item("minecraft:flint"),
	"gregtech:iron" : item("minecraft:iron_ingot"),
	"gregtech:wrought_iron" : metaitem("ingotWroughtIron"),
	"gregtech:bronze" : metaitem("ingotBronze"),
	"gregtech:steel" : metaitem("ingotSteel"),
	"gregtech:duranium" : metaitem("ingotDuranium"),
	"gregtech:tungsten_steel" : metaitem("ingotTungstenSteel"),
	"gregtech:cobalt_brass" : metaitem("ingotCobaltBrass"),
	"gregtech:invar" : metaitem("ingotInvar"),
	"gregtech:aluminium" : metaitem("ingotAluminium"),
	"gregtech:sterling_silver" : metaitem("ingotSterlingSilver"),
	"gregtech:tungsten_carbide" : metaitem("ingotTungstenCarbide"),
	"gregtech:rose_gold" : metaitem("ingotRoseGold"),
	"gregtech:damascus_steel" : metaitem("ingotDamascusSteel"),
	"gregtech:titanium" : metaitem("ingotTitanium"),
	"gregtech:ultimet" : metaitem("ingotUltimet"),
	"gregtech:hsse" : metaitem("ingotHsse"),
	"gregtech:neutronium" : metaitem("ingotNeutronium"),
	"gregtech:vanadium_steel" : metaitem("ingotVanadiumSteel"),
	"gregtech:red_steel" : metaitem("ingotRedSteel"),
	"gregtech:naquadah_alloy" : metaitem("ingotNaquadahAlloy"),
	"gregtech:blue_steel" : metaitem("ingotBlueSteel"),
	"gregtech:stainless_steel" : metaitem("ingotStainlessSteel")
]) {
	crafting.addShaped(item("gregtech:sword").withNbt(["GT.Tool": ["Material": i.key]]), [
		[null, i.value, null],
		[null, i.value, null],
		[null, ore("stickWood"), null]
	]);
	crafting.addShaped(item("gregtech:pickaxe").withNbt(["GT.Tool": ["Material": i.key]]), [
		[i.value, i.value, i.value],
		[null, ore("stickWood"), null],
		[null, ore("stickWood"), null]
	]);
	crafting.addShaped(item("gregtech:axe").withNbt(["GT.Tool": ["Material": i.key]]), [
		[i.value, i.value, null],
		[i.value, ore("stickWood"), null],
		[null, ore("stickWood"), null]
	]);
	crafting.addShaped(item("gregtech:shovel").withNbt(["GT.Tool": ["Material": i.key]]), [
		[null, i.value, null],
		[null, ore("stickWood"), null],
		[null, ore("stickWood"), null]
	]);
	crafting.addShaped(item("gregtech:hoe").withNbt(["GT.Tool": ["Material": i.key]]), [
		[i.value, i.value, null],
		[null, ore("stickWood"), null],
		[null, ore("stickWood"), null]
	]);
	if (i.key!="gregtech:flint") {
		crafting.addShaped(item("gregtech:mining_hammer").withNbt([
		"GT.Behaviours": [
			"AoELayer": 0,
			"MaxAoELayer": 0,
			"TorchPlacing": (byte) 1,
			"AoERow": 1,
			"AoEColumn": 1,
			"MaxAoERow": 1,
			"MaxAoEColumn": 1
		],
		"GT.Tool": ["Material": i.key]]
		), [
			[i.value, i.value, i.value],
			[i.value, ore("stickWood"), i.value],
			[null, ore("stickWood"), null]
		]);
		crafting.addShaped(item("gregtech:spade").withNbt([
		"GT.Behaviours": [
			"AoELayer": 0,
			"MaxAoELayer": 0,
			"AoERow": 1,
			"AoEColumn": 1,
			"MaxAoERow": 1,
			"MaxAoEColumn": 1
		],
		"GT.Tool": ["Material": i.key]]
		), [
			[null, i.value, null],
			[i.value, ore("stickWood"), i.value],
			[null, ore("stickWood"), null]
		]);
		crafting.addShaped(item("gregtech:scythe").withNbt([
		"GT.Behaviours": [
			"AoELayer": 2,
			"MaxAoELayer": 2,
			"AoERow": 2,
			"AoEColumn": 2,
			"MaxAoERow": 2,
			"MaxAoEColumn": 2
		],
		"GT.Tool": ["Material": i.key]]
		), [
			[i.value, i.value, i.value],
			[null, null, ore("stickWood")],
			[null, null, ore("stickWood")]
		]);
	}
}
item("gregtech:mining_hammer").withNbt(["GT.Behaviours": ["AoELayer": 0, "MaxAoELayer": 0, "TorchPlacing": (byte) 1, "AoERow": 1, "AoEColumn": 1, "MaxAoERow": 1, "MaxAoEColumn": 1], "HideFlags": 2, "GT.Tool": ["MaxDurability": 767, "ToolSpeed": 4.8F, "AttackDamage": 3.5F, "Durability": 0, "Material": "gregtech:iron", "HarvestLevel": 2, "AttackSpeed": -3.2F]])
