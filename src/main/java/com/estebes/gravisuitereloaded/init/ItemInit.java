package com.estebes.gravisuitereloaded.init;

import com.estebes.gravisuitereloaded.item.armor.ItemArmorLappack;
import com.estebes.gravisuitereloaded.item.armor.ItemArmorQuantumLappack;
import com.estebes.gravisuitereloaded.item.misc.ItemMisc;
import com.estebes.gravisuitereloaded.item.tool.ItemToolBigDiamondDrill;
import com.estebes.gravisuitereloaded.item.tool.ItemToolBigMiningDrill;
import com.estebes.gravisuitereloaded.item.tool.ItemToolTheThingamabob;
import com.estebes.gravisuitereloaded.item.weapon.ItemWeaponQuantumSaber;
import com.estebes.gravisuitereloaded.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ItemInit {
    // Tools
    public static final ItemToolTheThingamabob itemToolTheThingamabob = new ItemToolTheThingamabob(Reference.THE_THINGAMABOB_NAME);
    public static final ItemToolBigMiningDrill itemToolBigMiningDrill = new ItemToolBigMiningDrill(Reference.BIG_MINING_DRILL_NAME,
            2, 2.7E5D, 9.0E2D, false, 5.0E2D);
    public static final ItemToolBigDiamondDrill itemToolBigDiamondDrill = new ItemToolBigDiamondDrill(Reference.BIG_DIAMOND_DRILL_NAME,
            2, 2.7E5D, 9.0E2D, false, 8.0E2D);

    // Weapons
    public static final ItemWeaponQuantumSaber itemWeaponQuantumSaber = new ItemWeaponQuantumSaber();

    // Armor
    public static final ItemArmorLappack itemArmorLappack = new ItemArmorLappack();
    public static final ItemArmorQuantumLappack itemArmorQuantumLappack = new ItemArmorQuantumLappack();

    // Misc
    public static final ItemMisc itemMiscQuantumCircuit = new ItemMisc(Reference.QUANTUM_CIRCUIT_NAME, Reference.QUANTUM_CIRCUIT_STACKSIZE);

    public static void init() {
        // Tools
        GameRegistry.registerItem(itemToolTheThingamabob, Reference.THE_THINGAMABOB_NAME);
        GameRegistry.registerItem(itemToolBigMiningDrill, Reference.BIG_MINING_DRILL_NAME);
        GameRegistry.registerItem(itemToolBigDiamondDrill, Reference.BIG_DIAMOND_DRILL_NAME);

        // Weapons
        GameRegistry.registerItem(itemWeaponQuantumSaber, Reference.QUANTUM_SABER_NAME);

        // Armor
        GameRegistry.registerItem(itemArmorLappack, Reference.LAPPACK_NAME);
        GameRegistry.registerItem(itemArmorQuantumLappack, Reference.QUANTUM_LAPPACK_NAME);

        // Misc
        GameRegistry.registerItem(itemMiscQuantumCircuit, Reference.QUANTUM_CIRCUIT_NAME);
    }
}
