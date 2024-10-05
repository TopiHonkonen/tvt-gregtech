for (i in [
	"ingotBronze",
	"nuggetBronze",
	"blockBronze",
	"gearBronze",
	"plateBronze",

	"ingotCopper",
	"nuggetCopper",
	"blockCopper",
	"gearCopper",
	"plateCopper",

	"ingotTin",
	"nuggetTin",
	"blockTin",
	"gearTin",
	"plateTin",

	"ingotLead",
	"nuggetLead",
	"blockLead",

	"ingotSilver",
	"blockSilver",

	"ingotRedAlloy"
]) {
	oreDict.removeAll(i);
	oreDict.add(i, metaitem(i));
}
