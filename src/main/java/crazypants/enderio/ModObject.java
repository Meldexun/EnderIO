package crazypants.enderio;

public enum ModObject {
  // Enderface
  blockEnderIo,
  itemEnderface,

  // Conduits
  blockConduitBundle,
  blockConduitFacade,
  itemConduitFacade,
  itemRedstoneConduit,
  itemItemConduit,
  itemGasConduit,
  itemMEConduit,
 itemOCConduit,
  itemBasicFilterUpgrade,
  itemExistingItemFilter,
  itemModItemFilter,
  itemPowerItemFilter,
  itemExtractSpeedUpgrade,
  itemFunctionUpgrade,

  // Power
  itemPowerConduit,

  // Liquid
  itemLiquidConduit,

  // Materials
  itemBasicCapacitor,
  itemAlloy,
  itemMaterial,
  itemMachinePart,
  itemPowderIngot,
  blockFusedQuartz,
  blockDarkIronBars,

  // Machines
  blockStirlingGenerator,
  blockCombustionGenerator,
  blockZombieGenerator,
  blockReservoir,
  blockAlloySmelter,
  blockSolarPanel,
  blockCapacitorBank,
  blockCapBank,
  blockSagMill,
  blockHyperCube,
  blockPowerMonitor,
  blockVat,
  blockFarmStation,
  blockTank,
  blockCrafter,
  blockVacuumChest,
  blockWirelessCharger,
  blockEnchanter,
  blockSoulBinder,
  blockSliceAndSplice,
  blockAttractor,
  blockSpawnGuard,
  blockExperienceObelisk,
  blockWeatherObelisk,
  blockInhibitorObelisk,
  blockTransceiver,
  blockBuffer,
  blockInventoryPanel,

  blockPoweredSpawner,
  itemBrokenSpawner,

  blockKillerJoe,

  blockElectricLight,
  blockLightNode,
  blockLight,

  //Blocks
  blockDarkSteelAnvil,
  blockDarkSteelLadder,
  blockReinforcedObsidian,
  blockIngotStorage,

  // Painter
  blockPainter,
  blockPaintedFence,
  blockPaintedStoneFence,
  blockPaintedFenceGate,
  blockPaintedWall,
  blockPaintedStair,
  blockPaintedSlab,
  blockPaintedDoubleSlab,
  blockPaintedGlowstone,
  blockPaintedCarpet,
  blockPaintedPressurePlate,

  itemConduitProbe,
  itemYetaWrench,
  itemXpTransfer,

  blockTravelAnchor,
  blockTelePad,
  itemCoordSelector,
  itemTravelStaff,
  itemMagnet,
  itemGliderWing,
  blockEndermanSkull, 
  itemSoulVessel, 
  itemFrankenSkull, 
  
  blockEnderRail,
  
  itemEnderFood;

  public final String unlocalisedName;

  private ModObject() {
    unlocalisedName = name();
  }

}
