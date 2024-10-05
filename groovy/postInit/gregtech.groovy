

furnace.add(metaitem("rubber_drop"), metaitem("dustRawRubber")*2);

//Simplify coated circuit board recipe
crafting.replaceShaped(metaitem("board.coated")*3, [
	[metaitem("rubber_drop"),metaitem("rubber_drop"),metaitem("rubber_drop")],
	[ore("plankWood"), ore("plankWood"), ore("plankWood")],
	[metaitem("rubber_drop"),metaitem("rubber_drop"),metaitem("rubber_drop")]
]);

crafting.replaceShaped(metaitem("board.coated"), [
	[ore("plankWood"),metaitem("rubber_drop")],
	[metaitem("rubber_drop"), null]
]);

//Simplify coke oven
crafting.replaceShaped(metaitem("coke_oven"), [
	[metaitem("brick.coke"), metaitem("brick.coke"), metaitem("brick.coke")],
	[metaitem("brick.coke"), null, metaitem("brick.coke")],
	[metaitem("brick.coke"), metaitem("brick.coke"), metaitem("brick.coke")]
]);

//Buff coke bricks
crafting.replaceShaped("gregtech:compressed_coke_clay", metaitem("compressed.coke_clay")*8, [
	[item("minecraft:clay_ball"),item("minecraft:clay_ball"),item("minecraft:clay_ball")],
	[item("minecraft:sand"),metaitem("wooden_form.brick"),item("minecraft:sand")],
	[item("minecraft:sand"),item("minecraft:sand"),item("minecraft:sand")]
]);

//Simplify primitive blast furnace
crafting.replaceShaped(metaitem("primitive_blast_furnace.bronze"), [
	[metaitem("brick.fireclay"), metaitem("brick.fireclay"), metaitem("brick.fireclay")],
	[metaitem("brick.fireclay"), null, metaitem("brick.fireclay")],
	[metaitem("brick.fireclay"), metaitem("brick.fireclay"), metaitem("brick.fireclay")]
]);

crafting.replaceShaped("gregtech:clay_ball_to_dust", metaitem("dustClay"), [
	[item("gregtech:mortar"), item("minecraft:clay_ball")]
]);

crafting.replaceShaped("gregtech:brick_to_dust", metaitem("dustBrick"), [
	[item("gregtech:mortar"), item("minecraft:brick")]
]);


//Make steel production faster

// Steel Ingot * 1
mods.gregtech.primitive_blast_furnace.removeByInput(1, [item('minecraft:iron_ingot'), item('minecraft:coal') * 2 * 2], null)
// Steel Ingot * 1
mods.gregtech.primitive_blast_furnace.removeByInput(1, [item('minecraft:iron_ingot'), metaitem('dustCoal') * 2], null)
// Steel Ingot * 1
mods.gregtech.primitive_blast_furnace.removeByInput(1, [item('minecraft:iron_ingot'), item('minecraft:coal', 1) * 2 * 2], null)
// Steel Ingot * 1
mods.gregtech.primitive_blast_furnace.removeByInput(1, [item('minecraft:iron_ingot'), metaitem('dustCharcoal') * 2], null)
// Steel Ingot * 1
mods.gregtech.primitive_blast_furnace.removeByInput(1, [item('minecraft:iron_ingot'), metaitem('gemCoke')], null)
// Steel Ingot * 1
mods.gregtech.primitive_blast_furnace.removeByInput(1, [item('minecraft:iron_ingot'), metaitem('dustCoke')], null)

mods.gregtech.primitive_blast_furnace.recipeBuilder()
									.inputs(item("minecraft:iron_ingot"), item("minecraft:coal")*2)
									.outputs(metaitem("ingotSteel"), metaitem("dustTinyDarkAsh")*2)
									.duration(1200)
									.buildAndRegister();

mods.gregtech.primitive_blast_furnace.recipeBuilder()
									.inputs(item("minecraft:iron_ingot"), metaitem("dustCoal")*2)
									.outputs(metaitem("ingotSteel"), metaitem("dustTinyDarkAsh")*2)
									.duration(1200)
									.buildAndRegister();

mods.gregtech.primitive_blast_furnace.recipeBuilder()
									.inputs(item("minecraft:iron_ingot"), item('minecraft:coal', 1))
									.outputs(metaitem("ingotSteel"), metaitem("dustTinyDarkAsh")*2)
									.duration(1200)
									.buildAndRegister();

mods.gregtech.primitive_blast_furnace.recipeBuilder()
									.inputs(item("minecraft:iron_ingot"), metaitem("dustCharcoal"))
									.outputs(metaitem("ingotSteel"), metaitem("dustTinyDarkAsh")*2)
									.duration(1200)
									.buildAndRegister();

mods.gregtech.primitive_blast_furnace.recipeBuilder()
									.inputs(item("minecraft:iron_ingot"), metaitem("gemCoke"))
									.outputs(metaitem("ingotSteel"), metaitem("dustTinyAsh"))
									.duration(1000)
									.buildAndRegister();

mods.gregtech.primitive_blast_furnace.recipeBuilder()
									.inputs(item("minecraft:iron_ingot"), metaitem("dustCoke"))
									.outputs(metaitem("ingotSteel"), metaitem("dustTinyAsh"))
									.duration(1000)
									.buildAndRegister();

furnace.add(item("minecraft:iron_ingot"), metaitem("ingotWroughtIron"));


//Make uranium production faster

// Uraninite Dust * 3
mods.gregtech.centrifuge.removeByInput(30, [metaitem('dustPitchblende') * 5], null)

mods.gregtech.centrifuge.recipeBuilder()
						.inputs(metaitem("dustPitchblende")*5)
						.outputs(metaitem("dustUraninite")*3, metaitem("dustThorium"), metaitem("dustLead"))
						.EUt(32)
						.duration(100)
						.buildAndRegister();
