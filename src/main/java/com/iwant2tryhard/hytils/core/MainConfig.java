package com.iwant2tryhard.hytils.core;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MainConfig {
    private final File configFile;
    private JsonObject loadedConfig = new JsonObject();

    public int maxTeammateDisplay = 4;
    public boolean teammateHUDCheckGame = true;
    public boolean teammateHUDEnabled = false;
    public boolean teammateHUDHealthBar = false;
    public boolean teammateHUDHungerBar = false;
    public boolean teammateHUDArmorBar = false;
    public boolean teammateHUDAirBar = false;
    public boolean teammateHUDShowUndetected = true;

    public boolean showCustomHealthBar = false;
    public boolean showCustomHungerBar = false;
    public boolean showCustomArmorBar = false;
    public boolean showCustomAirBar = false;
    public boolean showCustomLevelBar = false;

    public boolean equipmentHelperEnabled = false;
    public boolean equipmentHelperOnlyBestMode = true;

    public boolean equipmentHelperWeaponDamageCheck = true;
    public double equipmentHelperWeaponDamageFavor = 1d;
    public double equipmentHelperWeaponDamageTierFavor = 1d;
    public double equipmentHelperWeaponDamageLevelFavor = 1d;
    public boolean equipmentHelperWeaponDurabilityCheck = true;
    public double equipmentHelperWeaponDurabilityFavor = 1d;
    public double equipmentHelperWeaponDurabilityTierFavor = 1d;
    public double equipmentHelperWeaponDurabilityLevelFavor = 1d;
    public boolean equipmentHelperWeaponKnockbackCheck = true;
    public double equipmentHelperWeaponKnockbackFavor = 1d;

    public boolean equipmentHelperArmorResCheck = true;
    public double equipmentHelperArmorResFavor = 1d;
    public double equipmentHelperArmorResTierFavor = 1d;
    public double equipmentHelperArmorResLevelFavor = 1d;
    public boolean equipmentHelperArmorDurabilityCheck = true;
    public double equipmentHelperArmorDurabilityFavor = 1d;
    public double equipmentHelperArmorDurabilityTierFavor = 1d;
    public double equipmentHelperArmorDurabilityLevelFavor = 1d;

    public boolean equipmentHelperRodKnockbackCheck = true;
    public double equipmentHelperRodKnockbackFavor = 1d;
    public boolean equipmentHelperRodDurabilityCheck = true;
    public double equipmentHelperRodDurabilityFavor = 1d;
    public double equipmentHelperRodDurabilityLevelFavor = 1d;

    public MainConfig(File configFile) {
        this.configFile = configFile;
    }

    public void loadConfig() {
        if (configFile.exists()) {
            try {
                FileReader reader = new FileReader(configFile);
                BufferedReader bufferedReader = new BufferedReader(reader);
                StringBuilder builder = new StringBuilder();
                String nextLine;
                while ((nextLine = bufferedReader.readLine()) != null) {
                    builder.append(nextLine);
                }
                String complete = builder.toString();
                loadedConfig = new JsonParser().parse(complete).getAsJsonObject();
                maxTeammateDisplay = loadedConfig.get("maxTeammateDisplay").getAsInt();
                teammateHUDCheckGame = loadedConfig.get("teammateHUDCheckGame").getAsBoolean();
                teammateHUDEnabled = loadedConfig.get("teammateHUDEnabled").getAsBoolean();
                teammateHUDHealthBar = loadedConfig.get("teammateHUDHealthBar").getAsBoolean();
                teammateHUDHungerBar = loadedConfig.get("teammateHUDHungerBar").getAsBoolean();
                teammateHUDArmorBar = loadedConfig.get("teammateHUDArmorBar").getAsBoolean();
                teammateHUDAirBar = loadedConfig.get("teammateHUDAirBar").getAsBoolean();
                teammateHUDShowUndetected = loadedConfig.get("teammateHUDShowUndetected").getAsBoolean();

                showCustomHealthBar = loadedConfig.get("showCustomHealthBar").getAsBoolean();
                showCustomHungerBar = loadedConfig.get("showCustomHungerBar").getAsBoolean();
                showCustomArmorBar = loadedConfig.get("showCustomArmorBar").getAsBoolean();
                showCustomAirBar = loadedConfig.get("showCustomAirBar").getAsBoolean();
                showCustomLevelBar = loadedConfig.get("showCustomLevelBar").getAsBoolean();

                equipmentHelperEnabled = loadedConfig.get("equipmentHelperEnabled").getAsBoolean();
                equipmentHelperOnlyBestMode = loadedConfig.get("equipmentHelperOnlyBestMode").getAsBoolean();

                equipmentHelperWeaponDamageCheck = loadedConfig.get("equipmentHelperWeaponDamageCheck").getAsBoolean();
                equipmentHelperWeaponDamageFavor = loadedConfig.get("equipmentHelperWeaponDamageFavor").getAsFloat();
                equipmentHelperWeaponDamageTierFavor = loadedConfig.get("equipmentHelperWeaponDamageTierFavor").getAsFloat();
                equipmentHelperWeaponDamageLevelFavor = loadedConfig.get("equipmentHelperWeaponDamageLevelFavor").getAsFloat();
                equipmentHelperWeaponDurabilityCheck = loadedConfig.get("equipmentHelperWeaponDurabilityCheck").getAsBoolean();
                equipmentHelperWeaponDurabilityFavor = loadedConfig.get("equipmentHelperWeaponDurabilityFavor").getAsFloat();
                equipmentHelperWeaponDurabilityTierFavor = loadedConfig.get("equipmentHelperWeaponDurabilityTierFavor").getAsFloat();
                equipmentHelperWeaponDurabilityLevelFavor = loadedConfig.get("equipmentHelperWeaponDurabilityLevelFavor").getAsFloat();
                equipmentHelperWeaponKnockbackCheck = loadedConfig.get("equipmentHelperWeaponKnockbackCheck").getAsBoolean();
                equipmentHelperWeaponKnockbackFavor = loadedConfig.get("equipmentHelperWeaponKnockbackFavor").getAsFloat();

                equipmentHelperArmorResCheck = loadedConfig.get("equipmentHelperArmorResCheck").getAsBoolean();
                equipmentHelperArmorResFavor = loadedConfig.get("equipmentHelperArmorResFavor").getAsFloat();
                equipmentHelperArmorResTierFavor = loadedConfig.get("equipmentHelperArmorResTierFavor").getAsFloat();
                equipmentHelperArmorResLevelFavor = loadedConfig.get("equipmentHelperArmorResLevelFavor").getAsFloat();
                equipmentHelperArmorDurabilityCheck = loadedConfig.get("equipmentHelperArmorDurabilityCheck").getAsBoolean();
                equipmentHelperArmorDurabilityFavor = loadedConfig.get("equipmentHelperArmorDurabilityFavor").getAsFloat();
                equipmentHelperArmorDurabilityTierFavor = loadedConfig.get("equipmentHelperArmorDurabilityTierFavor").getAsFloat();
                equipmentHelperArmorDurabilityLevelFavor = loadedConfig.get("equipmentHelperArmorDurabilityLevelFavor").getAsFloat();

                equipmentHelperRodKnockbackCheck = loadedConfig.get("equipmentHelperRodKnockbackCheck").getAsBoolean();
                equipmentHelperRodKnockbackFavor = loadedConfig.get("equipmentHelperRodKnockbackFavor").getAsFloat();
                equipmentHelperRodDurabilityCheck = loadedConfig.get("equipmentHelperRodDurabilityCheck").getAsBoolean();
                equipmentHelperRodDurabilityFavor = loadedConfig.get("equipmentHelperRodDurabilityFavor").getAsFloat();
                equipmentHelperRodDurabilityLevelFavor = loadedConfig.get("equipmentHelperRodDurabilityLevelFavor").getAsFloat();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            saveConfig();
        }
    }

    @SuppressWarnings("ResultOfMethodCallIgnored")
    public void saveConfig() {
        loadedConfig = new JsonObject();
        try {
            configFile.createNewFile();
            FileWriter writer = new FileWriter(configFile);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            loadedConfig.addProperty("maxTeammateDisplay", maxTeammateDisplay);
            loadedConfig.addProperty("teammateHUDCheckGame", teammateHUDCheckGame);
            loadedConfig.addProperty("teammateHUDEnabled", teammateHUDEnabled);
            loadedConfig.addProperty("teammateHUDHealthBar", teammateHUDHealthBar);
            loadedConfig.addProperty("teammateHUDHungerBar", teammateHUDHungerBar);
            loadedConfig.addProperty("teammateHUDArmorBar", teammateHUDArmorBar);
            loadedConfig.addProperty("teammateHUDAirBar", teammateHUDAirBar);
            loadedConfig.addProperty("teammateHUDShowUndetected", teammateHUDShowUndetected);

            loadedConfig.addProperty("showCustomHealthBar", showCustomHealthBar);
            loadedConfig.addProperty("showCustomHungerBar", showCustomHungerBar);
            loadedConfig.addProperty("showCustomArmorBar", showCustomArmorBar);
            loadedConfig.addProperty("showCustomAirBar", showCustomAirBar);
            loadedConfig.addProperty("showCustomLevelBar", showCustomLevelBar);

            loadedConfig.addProperty("equipmentHelperEnabled", equipmentHelperEnabled);
            loadedConfig.addProperty("equipmentHelperOnlyBestMode", equipmentHelperOnlyBestMode);

            loadedConfig.addProperty("equipmentHelperWeaponDamageCheck", equipmentHelperWeaponDamageCheck);
            loadedConfig.addProperty("equipmentHelperWeaponDamageFavor", equipmentHelperWeaponDamageFavor);
            loadedConfig.addProperty("equipmentHelperWeaponDamageTierFavor", equipmentHelperWeaponDamageTierFavor);
            loadedConfig.addProperty("equipmentHelperWeaponDamageLevelFavor", equipmentHelperWeaponDamageLevelFavor);
            loadedConfig.addProperty("equipmentHelperWeaponDurabilityCheck", equipmentHelperWeaponDurabilityCheck);
            loadedConfig.addProperty("equipmentHelperWeaponDurabilityFavor", equipmentHelperWeaponDurabilityFavor);
            loadedConfig.addProperty("equipmentHelperWeaponDurabilityTierFavor", equipmentHelperWeaponDurabilityTierFavor);
            loadedConfig.addProperty("equipmentHelperWeaponDurabilityLevelFavor", equipmentHelperWeaponDurabilityLevelFavor);
            loadedConfig.addProperty("equipmentHelperWeaponKnockbackCheck", equipmentHelperWeaponKnockbackCheck);
            loadedConfig.addProperty("equipmentHelperWeaponKnockbackFavor", equipmentHelperWeaponKnockbackFavor);

            loadedConfig.addProperty("equipmentHelperArmorResCheck", equipmentHelperArmorResCheck);
            loadedConfig.addProperty("equipmentHelperArmorResFavor", equipmentHelperArmorResFavor);
            loadedConfig.addProperty("equipmentHelperArmorResTierFavor", equipmentHelperArmorResTierFavor);
            loadedConfig.addProperty("equipmentHelperArmorResLevelFavor", equipmentHelperArmorResLevelFavor);
            loadedConfig.addProperty("equipmentHelperArmorDurabilityCheck", equipmentHelperArmorDurabilityCheck);
            loadedConfig.addProperty("equipmentHelperArmorDurabilityFavor", equipmentHelperArmorDurabilityFavor);
            loadedConfig.addProperty("equipmentHelperArmorDurabilityTierFavor", equipmentHelperArmorDurabilityTierFavor);
            loadedConfig.addProperty("equipmentHelperArmorDurabilityLevelFavor", equipmentHelperArmorDurabilityLevelFavor);

            loadedConfig.addProperty("equipmentHelperRodKnockbackCheck", equipmentHelperRodKnockbackCheck);
            loadedConfig.addProperty("equipmentHelperRodKnockbackFavor", equipmentHelperRodKnockbackFavor);
            loadedConfig.addProperty("equipmentHelperRodDurabilityCheck", equipmentHelperRodDurabilityCheck);
            loadedConfig.addProperty("equipmentHelperRodDurabilityFavor", equipmentHelperRodDurabilityFavor);
            loadedConfig.addProperty("equipmentHelperRodDurabilityLevelFavor", equipmentHelperRodDurabilityLevelFavor);
            bufferedWriter.write(loadedConfig.toString());
            bufferedWriter.close();
            writer.close();
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("Error while attempting to create/save the config...");
        }
    }
}
