package tcgwars.logic.impl.gen8;

import static tcgwars.logic.card.HP.*;
import static tcgwars.logic.card.Type.*;
import static tcgwars.logic.card.CardType.*;
import static tcgwars.logic.groovy.TcgBuilders.*;
import static tcgwars.logic.groovy.TcgStatics.*
import static tcgwars.logic.effect.ability.Ability.ActivationReason.*
import static tcgwars.logic.effect.EffectType.*;
import static tcgwars.logic.effect.Source.*;
import static tcgwars.logic.effect.EffectPriority.*
import static tcgwars.logic.effect.special.SpecialConditionType.*
import static tcgwars.logic.card.Resistance.ResistanceType.*

import java.util.*;
import org.apache.commons.lang.WordUtils;
import tcgwars.entity.*;
import tcgwars.logic.*;
import tcgwars.logic.card.*;
import tcgwars.logic.card.energy.*;
import tcgwars.logic.card.pokemon.*;
import tcgwars.logic.card.trainer.*;
import tcgwars.logic.effect.*;
import tcgwars.logic.effect.ability.*;
import tcgwars.logic.effect.ability.Ability.*;
import tcgwars.logic.effect.advanced.*;
import tcgwars.logic.effect.basic.*;
import tcgwars.logic.effect.blocking.*;
import tcgwars.logic.effect.event.*;
import tcgwars.logic.effect.getter.*;
import tcgwars.logic.effect.special.*;
import tcgwars.logic.util.*;

/**
 * @author lithogenn@gmail.com
 * 		     thezipcompany@gmail.com
 *         & flagrama
 */

public enum DarknessAblaze implements LogicCardInfo {

  BUTTERFREE_V_1 ("Butterfree V", 1, Rarity.HOLORARE, [POKEMON, BASIC, POKEMON_V, _GRASS_]),
  BUTTERFREE_VMAX_2 ("Butterfree VMAX", 2, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, VMAX, _GRASS_]),
  PARAS_3 ("Paras", 3, Rarity.HOLORARE, [POKEMON, BASIC, _GRASS_]),
  PARASECT_4 ("Parasect", 4, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  CARNIVINE_5 ("Carnivine", 5, Rarity.HOLORARE, [POKEMON, BASIC, _GRASS_]),
  PANSAGE_6 ("Pansage", 6, Rarity.HOLORARE, [POKEMON, BASIC, _GRASS_]),
  SIMISAGE_7 ("Simisage", 7, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  KARRABLAST_8 ("Karrablast", 8, Rarity.HOLORARE, [POKEMON, BASIC, _GRASS_]),
  SHELMET_9 ("Shelmet", 9, Rarity.HOLORARE, [POKEMON, BASIC, _GRASS_]),
  ACCELGOR_10 ("Accelgor", 10, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  ROWLET_11 ("Rowlet", 11, Rarity.HOLORARE, [POKEMON, BASIC, _GRASS_]),
  DARTRIX_12 ("Dartrix", 12, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  DECIDUEYE_13 ("Decidueye", 13, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _GRASS_]),
  BOUNSWEET_14 ("Bounsweet", 14, Rarity.HOLORARE, [POKEMON, BASIC, _GRASS_]),
  STEENEE_15 ("Steenee", 15, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  TSAREENA_16 ("Tsareena", 16, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _GRASS_]),
  WIMPOD_17 ("Wimpod", 17, Rarity.HOLORARE, [POKEMON, BASIC, _GRASS_]),
  GOLISOPOD_18 ("Golisopod", 18, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  CHARIZARD_V_19 ("Charizard V", 19, Rarity.HOLORARE, [POKEMON, BASIC, POKEMON_V, _FIRE_]),
  CHARIZARD_VMAX_20 ("Charizard VMAX", 20, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, VMAX, _FIRE_]),
  FLAREON_21 ("Flareon", 21, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _FIRE_]),
  HOUNDOOM_V_22 ("Houndoom V", 22, Rarity.HOLORARE, [POKEMON, POKEMON_V, BASIC, _FIRE_]),
  TORCHIC_23 ("Torchic", 23, Rarity.HOLORARE, [POKEMON, BASIC, _FIRE_]),
  COMBUSKEN_24 ("Combusken", 24, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _FIRE_]),
  BLAZIKEN_25 ("Blaziken", 25, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _FIRE_]),
  HEATRAN_26 ("Heatran", 26, Rarity.HOLORARE, [POKEMON, BASIC, _FIRE_]),
  VICTINI_27 ("Victini", 27, Rarity.HOLORARE, [POKEMON, BASIC, _FIRE_]),
  PANSEAR_28 ("Pansear", 28, Rarity.HOLORARE, [POKEMON, BASIC, _FIRE_]),
  SIMISEAR_29 ("Simisear", 29, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _FIRE_]),
  GALARIAN_DARMANITAN_30 ("Galarian Darmanitan", 30, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _FIRE_]),
  LARVESTA_31 ("Larvesta", 31, Rarity.HOLORARE, [POKEMON, BASIC, _FIRE_]),
  VOLCARONA_32 ("Volcarona", 32, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _FIRE_]),
  FLETCHINDER_33 ("Fletchinder", 33, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _FIRE_]),
  TALONFLAME_34 ("Talonflame", 34, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _FIRE_]),
  CENTISKORCH_V_35 ("Centiskorch V", 35, Rarity.HOLORARE, [POKEMON, BASIC, POKEMON_V, _FIRE_]),
  CENTISKORCH_VMAX_36 ("Centiskorch VMAX", 36, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, VMAX, _FIRE_]),
  GALARIAN_MR_MIME_37 ("Galarian Mr. Mime", 37, Rarity.HOLORARE, [POKEMON, BASIC, _WATER_]),
  GALARIAN_MR_RIME_38 ("Galarian Mr. Rime", 38, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  SUICUNE_39 ("Suicune", 39, Rarity.HOLORARE, [POKEMON, BASIC, _WATER_]),
  FEEBAS_40 ("Feebas", 40, Rarity.HOLORARE, [POKEMON, BASIC, _WATER_]),
  MILOTIC_41 ("Milotic", 41, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  RELICANTH_42 ("Relicanth", 42, Rarity.HOLORARE, [POKEMON, BASIC, _WATER_]),
  PANPOUR_43 ("Panpour", 43, Rarity.HOLORARE, [POKEMON, BASIC, _WATER_]),
  SIMIPOUR_44 ("Simipour", 44, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  GALARIAN_DARUMAKA_45 ("Galarian Darumaka", 45, Rarity.HOLORARE, [POKEMON, BASIC, _WATER_]),
  GALARIAN_DARMANITAN_46 ("Galarian Darmanitan", 46, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _FIRE_]),
  VANILLITE_47 ("Vanillite", 47, Rarity.HOLORARE, [POKEMON, BASIC, _WATER_]),
  VANILLISH_48 ("Vanillish", 48, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  VANILLUXE_49 ("Vanilluxe", 49, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _WATER_]),
  CUBCHOO_50 ("Cubchoo", 50, Rarity.HOLORARE, [POKEMON, BASIC, _WATER_]),
  BEARTIC_51 ("Beartic", 51, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  WISHIWASHI_52 ("Wishiwashi", 52, Rarity.HOLORARE, [POKEMON, BASIC, _WATER_]),
  MAREANIE_53 ("Mareanie", 53, Rarity.HOLORARE, [POKEMON, BASIC, _WATER_]),
  TOXAPEX_54 ("Toxapex", 54, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  DRACOVISH_55 ("Dracovish", 55, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  ARCTOVISH_56 ("Arctovish", 56, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  ELECTRIKE_57 ("Electrike", 57, Rarity.HOLORARE, [POKEMON, BASIC, _LIGHTNING_]),
  MANECTRIC_58 ("Manectric", 58, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _LIGHTNING_]),
  VIKAVOLT_V_59 ("Vikavolt V", 59, Rarity.HOLORARE, [POKEMON, BASIC, POKEMON_V, _LIGHTNING_]),
  TAPU_KOKO_60 ("Tapu Koko", 60, Rarity.HOLORARE, [POKEMON, BASIC, _LIGHTNING_]),
  TOXEL_61 ("Toxel", 61, Rarity.HOLORARE, [POKEMON, BASIC, _LIGHTNING_]),
  TOXTRICITY_62 ("Toxtricity", 62, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _LIGHTNING_]),
  DRACOZOLT_63 ("Dracozolt", 63, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _LIGHTNING_]),
  ARCTOZOLT_64 ("Arctozolt", 64, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _LIGHTNING_]),
  JIGGLYPUFF_65 ("Jigglypuff", 65, Rarity.HOLORARE, [POKEMON, BASIC, _PSYCHIC_]),
  WIGGLYTUFF_66 ("Wigglytuff", 66, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]),
  GALARIAN_SLOWBRO_V_67 ("Galarian Slowbro V", 67, Rarity.HOLORARE, [POKEMON, BASIC, _COLORLESS_]),
  MEW_V_68 ("Mew V", 68, Rarity.HOLORARE, [POKEMON, BASIC, _COLORLESS_]),
  SNUBBULL_69 ("Snubbull", 69, Rarity.HOLORARE, [POKEMON, BASIC, _PSYCHIC_]),
  GRANBULL_70 ("Granbull", 70, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]),
  GARDEVOIR_V_71 ("Gardevoir V", 71, Rarity.HOLORARE, [POKEMON, BASIC, POKEMON_V, _PSYCHIC_]),
  GARDEVOIR_VMAX_72 ("Gardevoir VMAX", 72, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, VMAX, _PSYCHIC_]),
  LUNATONE_73 ("Lunatone", 73, Rarity.HOLORARE, [POKEMON, BASIC, _PSYCHIC_]),
  GOLETT_74 ("Golett", 74, Rarity.HOLORARE, [POKEMON, BASIC, _PSYCHIC_]),
  GOLURK_75 ("Golurk", 75, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]),
  GOTHITA_76 ("Gothita", 76, Rarity.HOLORARE, [POKEMON, BASIC, _PSYCHIC_]),
  GOTHORITA_77 ("Gothorita", 77, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]),
  GOTHITELLE_78 ("Gothitelle", 78, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _PSYCHIC_]),
  DEDENNE_79 ("Dedenne", 79, Rarity.HOLORARE, [POKEMON, BASIC, _PSYCHIC_]),
  MORELULL_80 ("Morelull", 80, Rarity.HOLORARE, [POKEMON, BASIC, _PSYCHIC_]),
  SHIINOTIC_81 ("Shiinotic", 81, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]),
  MIMIKYU_82 ("Mimikyu", 82, Rarity.HOLORARE, [POKEMON, BASIC, _PSYCHIC_]),
  SINISTEA_83 ("Sinistea", 83, Rarity.HOLORARE, [POKEMON, BASIC, _PSYCHIC_]),
  POLTEAGEIST_84 ("Polteageist", 84, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]),
  DIGLETT_85 ("Diglett", 85, Rarity.HOLORARE, [POKEMON, BASIC, _FIGHTING_]),
  DUGTRIO_86 ("Dugtrio", 86, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  GALARIAN_FARFETCH_D_87 ("Galarian Farfetch'd", 87, Rarity.HOLORARE, [POKEMON, BASIC, _COLORLESS_]),
  GALARIAN_SIRFETCH_D_88 ("Galarian Sirfetch'd", 88, Rarity.HOLORARE, [POKEMON, BASIC, _COLORLESS_]),
  LARVITAR_89 ("Larvitar", 89, Rarity.HOLORARE, [POKEMON, BASIC, _FIGHTING_]),
  PUPITAR_90 ("Pupitar", 90, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  TYRANITAR_91 ("Tyranitar", 91, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _FIGHTING_]),
  TRAPINCH_92 ("Trapinch", 92, Rarity.HOLORARE, [POKEMON, BASIC, _FIGHTING_]),
  VIBRAVA_93 ("Vibrava", 93, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  FLYGON_94 ("Flygon", 94, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _FIGHTING_]),
  SOLROCK_95 ("Solrock", 95, Rarity.HOLORARE, [POKEMON, BASIC, _FIGHTING_]),
  HIPPOPOTAS_96 ("Hippopotas", 96, Rarity.HOLORARE, [POKEMON, BASIC, _FIGHTING_]),
  HIPPOWDON_97 ("Hippowdon", 97, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  RHYPERIOR_V_98 ("Rhyperior V", 98, Rarity.HOLORARE, [POKEMON, POKEMON_V, BASIC, _FIGHTING_]),
  DIGGERSBY_99 ("Diggersby", 99, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  ZYGARDE_100 ("Zygarde", 100, Rarity.HOLORARE, [POKEMON, BASIC, _FIGHTING_]),
  PASSIMIAN_101 ("Passimian", 101, Rarity.HOLORARE, [POKEMON, BASIC, _FIGHTING_]),
  GRIMER_102 ("Grimer", 102, Rarity.HOLORARE, [POKEMON, BASIC, _DARKNESS_]),
  MUK_103 ("Muk", 103, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _DARKNESS_]),
  SPINARAK_104 ("Spinarak", 104, Rarity.HOLORARE, [POKEMON, BASIC, _DARKNESS_]),
  ARIADOS_105 ("Ariados", 105, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _DARKNESS_]),
  CROBAT_V_106 ("Crobat V", 106, Rarity.HOLORARE, [POKEMON, POKEMON_V, BASIC, _DARKNESS_]),
  ABSOL_107 ("Absol", 107, Rarity.HOLORARE, [POKEMON, BASIC, _DARKNESS_]),
  DARKRAI_108 ("Darkrai", 108, Rarity.HOLORARE, [POKEMON, BASIC, _DARKNESS_]),
  PURRLOIN_109 ("Purrloin", 109, Rarity.HOLORARE, [POKEMON, BASIC, _DARKNESS_]),
  LIEPARD_110 ("Liepard", 110, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _DARKNESS_]),
  DEINO_111 ("Deino", 111, Rarity.HOLORARE, [POKEMON, BASIC, _DARKNESS_]),
  ZWEILOUS_112 ("Zweilous", 112, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _DARKNESS_]),
  HYDREIGON_113 ("Hydreigon", 113, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _DARKNESS_]),
  GALARIAN_ZIGZAGOON_114 ("Galarian Zigzagoon", 114, Rarity.HOLORARE, [POKEMON, BASIC, _DARKNESS_]),
  GALARIAN_LINOONE_115 ("Galarian Linoone", 115, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _DARKNESS_]),
  GALARIAN_OBSTAGOON_116 ("Galarian Obstagoon", 116, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _DARKNESS_]),
  SCRAGGY_117 ("Scraggy", 117, Rarity.HOLORARE, [POKEMON, BASIC, _DARKNESS_]),
  SCRAFTY_118 ("Scrafty", 118, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _DARKNESS_]),
  INKAY_119 ("Inkay", 119, Rarity.HOLORARE, [POKEMON, BASIC, _DARKNESS_]),
  MALAMAR_120 ("Malamar", 120, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _DARKNESS_]),
  HOOPA_121 ("Hoopa", 121, Rarity.HOLORARE, [POKEMON, BASIC, _DARKNESS_]),
  NICKIT_122 ("Nickit", 122, Rarity.HOLORARE, [POKEMON, BASIC, _DARKNESS_]),
  NICKIT_123 ("Nickit", 123, Rarity.HOLORARE, [POKEMON, BASIC, _DARKNESS_]),
  THIEVUL_124 ("Thievul", 124, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _DARKNESS_]),
  GRIMMSNARL_V_125 ("Grimmsnarl V", 125, Rarity.HOLORARE, [POKEMON, BASIC, POKEMON_V, _DARKNESS_]),
  GRIMMSNARL_VMAX_126 ("Grimmsnarl VMAX", 126, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, VMAX, _DARKNESS_]),
  ETERNATUS_V_127 ("Eternatus V", 127, Rarity.HOLORARE, [POKEMON, POKEMON_V, BASIC, _DARKNESS_]),
  ETERNATUS_VMAX_128 ("Eternatus VMAX", 128, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, VMAX, _DARKNESS_]),
  SKARMORY_129 ("Skarmory", 129, Rarity.HOLORARE, [POKEMON, BASIC, _METAL_]),
  ARON_130 ("Aron", 130, Rarity.HOLORARE, [POKEMON, BASIC, _METAL_]),
  LAIRON_131 ("Lairon", 131, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _METAL_]),
  AGGRON_132 ("Aggron", 132, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _METAL_]),
  ESCAVALIER_133 ("Escavalier", 133, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _METAL_]),
  KLINK_134 ("Klink", 134, Rarity.HOLORARE, [POKEMON, BASIC, _METAL_]),
  KLANG_135 ("Klang", 135, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _METAL_]),
  KLINKLANG_136 ("Klinklang", 136, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _METAL_]),
  GALARIAN_STUNFISK_V_137 ("Galarian Stunfisk V", 137, Rarity.HOLORARE, [POKEMON, BASIC, POKEMON_V, _METAL_]),
  CUFANT_138 ("Cufant", 138, Rarity.HOLORARE, [POKEMON, BASIC, _METAL_]),
  COPPERAJAH_139 ("Copperajah", 139, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _METAL_]),
  KANGASKHAN_140 ("Kangaskhan", 140, Rarity.HOLORARE, [POKEMON, BASIC, _COLORLESS_]),
  TAUROS_141 ("Tauros", 141, Rarity.HOLORARE, [POKEMON, BASIC, _COLORLESS_]),
  EEVEE_142 ("Eevee", 142, Rarity.HOLORARE, [POKEMON, BASIC, _COLORLESS_]),
  SENTRET_143 ("Sentret", 143, Rarity.HOLORARE, [POKEMON, BASIC, _COLORLESS_]),
  FURRET_144 ("Furret", 144, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  DUNSPARCE_145 ("Dunsparce", 145, Rarity.HOLORARE, [POKEMON, BASIC, _COLORLESS_]),
  TEDDIURSA_146 ("Teddiursa", 146, Rarity.HOLORARE, [POKEMON, BASIC, _COLORLESS_]),
  URSARING_147 ("Ursaring", 147, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  LUGIA_148 ("Lugia", 148, Rarity.HOLORARE, [POKEMON, BASIC, _COLORLESS_]),
  SKITTY_149 ("Skitty", 149, Rarity.HOLORARE, [POKEMON, BASIC, _COLORLESS_]),
  DELCATTY_150 ("Delcatty", 150, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  SALAMENCE_V_151 ("Salamence V", 151, Rarity.HOLORARE, [POKEMON, POKEMON_V, BASIC, _COLORLESS_]),
  SALAMENCE_VMAX_152 ("Salamence VMAX", 152, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, VMAX, _COLORLESS_]),
  STARLY_153 ("Starly", 153, Rarity.HOLORARE, [POKEMON, BASIC, _COLORLESS_]),
  STARAVIA_154 ("Staravia", 154, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  STARAPTOR_155 ("Staraptor", 155, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _COLORLESS_]),
  DUCKLETT_156 ("Ducklett", 156, Rarity.HOLORARE, [POKEMON, BASIC, _COLORLESS_]),
  SWANNA_157 ("Swanna", 157, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  SKWOVET_158 ("Skwovet", 158, Rarity.HOLORARE, [POKEMON, BASIC, _COLORLESS_]),
  GREEDENT_159 ("Greedent", 159, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  BUNNELBY_160 ("Bunnelby", 160, Rarity.HOLORARE, [POKEMON, BASIC, _COLORLESS_]),
  FLETCHLING_161 ("Fletchling", 161, Rarity.HOLORARE, [POKEMON, BASIC, _COLORLESS_]),
  ROOKIDEE_162 ("Rookidee", 162, Rarity.HOLORARE, [POKEMON, BASIC, _COLORLESS_]),
  CORVISQUIRE_163 ("Corvisquire", 163, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  CORVIKNIGHT_164 ("Corviknight", 164, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _COLORLESS_]),
  ADVERSITY_GLOVES_165 ("Adversity Gloves", 165, Rarity.HOLORARE, [TRAINER, ITEM, POKEMON_TOOL]),
  BIG_PARASOL_166 ("Big Parasol", 166, Rarity.HOLORARE, [TRAINER, ITEM, POKEMON_TOOL]),
  BIRD_KEEPER_167 ("Bird Keeper", 167, Rarity.HOLORARE, [TRAINER, SUPPORTER]),
  CHEERING_YELL_HORN_168 ("Cheering Yell Horn", 168, Rarity.HOLORARE, [TRAINER, ITEM]),
  GLIMWOOD_TANGLE_169 ("Glimwood Tangle", 169, Rarity.HOLORARE, [TRAINER, STADIUM]),
  OLD_COMPUTER_170 ("Old Computer", 170, Rarity.HOLORARE, [TRAINER, ITEM]),
  KABU_171 ("Kabu", 171, Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  LOOKALIKE_BELL_172 ("Lookalike Bell", 172, Rarity.HOLORARE, [TRAINER, ITEM]),
  PIERS_173 ("Piers", 173, Rarity.HOLORARE, [TRAINER, SUPPORTER]),
  POKEMON_BREEDER_S_NURTURING_174 ("Pokémon Breeder's Nurturing", 174, Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  RARE_FOSSIL_175 ("Rare Fossil", 175, Rarity.HOLORARE, [TRAINER, ITEM]),
  ROSE_176 ("Rose", 176, Rarity.HOLORARE, [TRAINER, SUPPORTER]),
  ROSE_TOWER_177 ("Rose Tower", 177, Rarity.HOLORARE, [TRAINER, STADIUM]),
  ROTOM_PHONE_178 ("Rotom Phone", 178, Rarity.HOLORARE, [TRAINER, ITEM]),
  MOUNTAINOUS_SMOKE_179 ("Mountainous Smoke", 179, Rarity.HOLORARE, [TRAINER, ITEM, POKEMON_TOOL]),
  SPIKEMUTH_180 ("Spikemuth", 180, Rarity.HOLORARE, [TRAINER, STADIUM]),
  DUBIOUS_CANNED_GOODS_181 ("Dubious Canned Goods", 181, Rarity.HOLORARE, [TRAINER, ITEM]),
  TOUGHNESS_CAPE_182 ("Toughness Cape", 182, Rarity.HOLORARE, [TRAINER, ITEM, POKEMON_TOOL]),
  TURBO_PATCH_183 ("Turbo Patch", 183, Rarity.HOLORARE, [TRAINER, ITEM]),
  HEAT_FIRE_ENERGY_184 ("Heat Fire Energy", 184, Rarity.UNCOMMON, [ENERGY, SPECIAL_ENERGY]),
  HIDE_DARKNESS_ENERGY_185 ("Hide Darkness Energy", 185, Rarity.UNCOMMON, [ENERGY, SPECIAL_ENERGY]),
  POWERFUL_COLORLESS_ENERGY_186 ("Powerful Colorless Energy", 186, Rarity.UNCOMMON, [ENERGY, SPECIAL_ENERGY]),
  CENTISKORCH_V_187 ("Centiskorch V", 187, Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _FIRE_]),
  VIKAVOLT_V_188 ("Vikavolt V", 188, Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _LIGHTNING_]),
  GARDEVOIR_V_189 ("Gardevoir V", 189, Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _PSYCHIC_]),
  GALARIAN_STUNFISK_V_190 ("Galarian Stunfisk V", 190, Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _METAL_]),
  KABU_191 ("Kabu", 191, Rarity.ULTRARARE, [TRAINER, SUPPORTER]),
  POKEMON_BREEDER_S_NURTURING_192 ("Pokémon Breeder's Nurturing", 192, Rarity.ULTRARARE, [TRAINER, SUPPORTER]);

  static Type C = COLORLESS, R = FIRE, F = FIGHTING, G = GRASS, W = WATER, P = PSYCHIC, L = LIGHTNING, M = METAL, D = DARKNESS, Y = FAIRY, N = DRAGON;

  protected CardTypeSet cardTypes;
  protected String name;
  protected Rarity rarity;
  protected int collectionLineNo;

  DarknessAblaze(String name, int collectionLineNo, Rarity rarity, List<CardType> cardTypes) {
    this.cardTypes = new CardTypeSet(cardTypes as CardType[]);
    this.name = name;
    this.rarity = rarity;
    this.collectionLineNo = collectionLineNo;
  }

  @Override
  public CardTypeSet getCardTypes() {
    return cardTypes;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public Rarity getRarity() {
    return rarity;
  }

  @Override
  public int getCollectionLineNo() {
    return collectionLineNo;
  }

  @Override
  public tcgwars.logic.card.Collection getCollection() {
    return tcgwars.logic.card.Collection.DARKNESS_ABLAZE;
  }

  @Override
  public String toString() {
    return String.format("%s:%s", this.name(), this.getCollection().name());
  }

  @Override
  public String getEnumName() {
    return name();
  }

  @Override
  public Card getImplementation() {
    switch (this) {
      case BUTTERFREE_V_1:
      return basic (this, hp:HP190, type:G, retreatCost:1) {
        weakness R
        move "Dizzy Poison", {
          text "The opponent’s Active Pokémon is now Poisoned and Confused."
          energyCost G
          attackRequirement {}
          onAttack {

          }
        }
        move "Blast Wind", {
          text "130 damage. "
          energyCost G, G, C
          attackRequirement {}
          onAttack {
            damage 130
          }
        }
      };
      case BUTTERFREE_VMAX_2:
      return evolution (this, from:"Butterfree V", hp:HP300, type:G, retreatCost:0) {
        weakness R
        move "G-Max Befuddle", {
          text "150 damage. The opponent’s Active Pokémon is now Poisoned and Confused."
          energyCost G, G, C
          attackRequirement {}
          onAttack {
            damage 150
          }
        }
      };
      case PARAS_3:
      return basic (this, hp:HP060, type:G, retreatCost:1) {
        weakness R
        move "Scratch", {
          text "20 damage. "
          energyCost G
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case PARASECT_4:
      return evolution (this, from:"Paras", hp:HP120, type:G, retreatCost:2) {
        weakness R
        move "Mushroom Tackle", {
          text "30 damage. Flip a coin. If heads, your opponent’s Active Pokémon is now Paralyzed."
          energyCost G
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
        move "Solarbeam", {
          text "110 damage. "
          energyCost G, G, C
          attackRequirement {}
          onAttack {
            damage 110
          }
        }
      };
      case CARNIVINE_5:
      return basic (this, hp:HP090, type:G, retreatCost:1) {
        weakness R
        move "Return", {
          text "20 damage. Draw cards until you have 5 cards in your hand."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Giga Drain", {
          text "40 damage. Heal from this Pokémon the same amount of damage you did to your opponent’s Active Pokémon."
          energyCost G, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case PANSAGE_6:
      return basic (this, hp:HP060, type:G, retreatCost:1) {
        weakness R
        move "Seed Bomb", {
          text "10 damage. "
          energyCost G
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Bite", {
          text "20 damage. "
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case SIMISAGE_7:
      return evolution (this, from:"Pansage", hp:HP100, type:G, retreatCost:1) {
        weakness R
        move "Seed Bomb", {
          text "30 damage. "
          energyCost G
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
        move "Giga Impact", {
          text "110 damage. This Pokémon can’t attack during your next turn."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 110
          }
        }
      };
      case KARRABLAST_8:
      return basic (this, hp:HP060, type:G, retreatCost:1) {
        weakness R
        move "Continuous Headbutt", {
          text "20x damage. Flip a coin until you get tails. This does 20 damage times the number of heads."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case SHELMET_9:
      return basic (this, hp:HP070, type:G, retreatCost:3) {
        weakness R
        move "Spray Fluid", {
          text "10 damage. "
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case ACCELGOR_10:
      return evolution (this, from:"Shelmet", hp:HP090, type:G, retreatCost:0) {
        weakness R
        move "Jet Head", {
          text "70 damage. "
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 70
          }
        }
      };
      case ROWLET_11:
      return basic (this, hp:HP050, type:G, retreatCost:1) {
        weakness R
        bwAbility "Sky Circus", {
          text "If you played Bird Keeper from your hand during this turn, ignore all Energy in the attack costs of this Pokémon."
          actionA {
          }
        }
        move "Wind Pebbles", {
          text "This attack does 60 damage to 1 of your opponent’s Benched Pokémon. (Don’t apply Weakness and Resistance.)"
          energyCost C, C, C
          attackRequirement {}
          onAttack {

          }
        }
      };
      case DARTRIX_12:
      return evolution (this, from:"Rowlet", hp:HP080, type:G, retreatCost:1) {
        weakness R
        move "Razor Leaf", {
          text "40 damage. "
          energyCost G
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case DECIDUEYE_13:
      return evolution (this, from:"Dartrix", hp:HP140, type:G, retreatCost:2) {
        weakness R
        bwAbility "Forest Camouflage", {
          text "Prevent all damage done to this Pokémon by the attacks of your opponent’s Pokémon V and Pokémon-GX."
          actionA {
          }
        }
        move "Split Arrow", {
          text "90 damage. This attack does 20 damage to 2 of your opponent’s Benched Pokémon. (Don’t apply Weakness and Resistance.)"
          energyCost G, C
          attackRequirement {}
          onAttack {
            damage 90
          }
        }
      };
      case BOUNSWEET_14:
      return basic (this, hp:HP060, type:G, retreatCost:1) {
        weakness R
        move "Synthesis", {
          text "Search your deck for a [G] Energy card and attach it to 1 of your Pokémon."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Flop", {
          text "20 damage. "
          energyCost G, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case STEENEE_15:
      return evolution (this, from:"Bounsweet", hp:HP080, type:G, retreatCost:1) {
        weakness R
        move "Captivate", {
          text "Choose 1 of your opponent’s Benched Pokémon and switch it with their Active Pokémon."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Slap", {
          text "40 damage. "
          energyCost G, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case TSAREENA_16:
      return evolution (this, from:"Steenee", hp:HP150, type:G, retreatCost:2) {
        weakness R
        move "Power Whip", {
          text "Choose 1 of your opponent’s Pokémon. This attack does 20 damage to that Pokémon for each Energy attached to this Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Setback Kick", {
          text "100 damage. You may choose an Energy attached to your opponent’s Active Pokémon and return it to their hand."
          energyCost G, C
          attackRequirement {}
          onAttack {
            damage 100
          }
        }
      };
      case WIMPOD_17:
      return basic (this, hp:HP070, type:G, retreatCost:3) {
        weakness R
        move "Gnaw and Run", {
          text "10 damage. Switch this Pokémon with 1 of your Benched Pokémon."
          energyCost G
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case GOLISOPOD_18:
      return evolution (this, from:"Wimpod", hp:HP130, type:G, retreatCost:2) {
        weakness R
        move "Adversity Slash", {
          text "30+ damage. This attack does 50 more damage for each of your opponent’s Pokémon V and Pokémon-GX in play."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
        move "Smash Turn", {
          text "70 damage. Switch this Pokémon with 1 of your Benched Pokémon."
          energyCost G, C, C
          attackRequirement {}
          onAttack {
            damage 70
          }
        }
      };
      case CHARIZARD_V_19:
      return basic (this, hp:HP220, type:R, retreatCost:3) {
        weakness W
        move "Claw Slash", {
          text "80 damage. "
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 80
          }
        }
        move "Fire Spin", {
          text "220 damage. Discard 2 Energy from this Pokémon."
          energyCost R, R, C, C
          attackRequirement {}
          onAttack {
            damage 220
          }
        }
      };
      case CHARIZARD_VMAX_20:
      return evolution (this, from:"Charizard V", hp:HP330, type:R, retreatCost:3) {
        weakness W
        move "Claw Slash", {
          text "100 damage. "
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 100
          }
        }
        move "G-Max Wildfire", {
          text "300 damage. Discard 2 Energy from this Pokémon."
          energyCost R, R, R, C, C
          attackRequirement {}
          onAttack {
            damage 300
          }
        }
      };
      case FLAREON_21:
      return evolution (this, from:"Eevee", hp:HP110, type:R, retreatCost:2) {
        weakness W
        move "Singe", {
          text "Your opponent’s Active Pokémon is now Burned."
          energyCost R
          attackRequirement {}
          onAttack {

          }
        }
        move "Kindle", {
          text "120 damage. Discard an Energy from this Pokémon. Then, discard an Energy from your opponent’s Active Pokémon."
          energyCost R, R, C
          attackRequirement {}
          onAttack {
            damage 120
          }
        }
      };
      case HOUNDOOM_V_22:
      return basic (this, hp:HP210, type:R, retreatCost:1) {
        weakness W
        move "Searing Flame", {
          text "20 damage. Your opponent’s Active Pokémon is now Burned."
          energyCost R
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Compensation Flame", {
          text "100+ damage. If any of your [R] Pokémon have damage counters on them, this attack does 100 more damage."
          energyCost R, R, C
          attackRequirement {}
          onAttack {
            damage 100
          }
        }
      };
      case TORCHIC_23:
      return basic (this, hp:HP060, type:R, retreatCost:1) {
        weakness W
        move "Call for Family", {
          text "Search your deck for a Basic Pokémon and put it on your Bench. Then, shuffle your deck."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Live Coal", {
          text "10 damage. "
          energyCost R
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case COMBUSKEN_24:
      return evolution (this, from:"Torchic", hp:HP090, type:R, retreatCost:1) {
        weakness W
        move "Smash Kick", {
          text "20 damage. "
          energyCost R
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Heat Beak", {
          text "40 damage. Your opponent’s Active Pokémon is now Burned."
          energyCost R, C, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case BLAZIKEN_25:
      return evolution (this, from:"Combusken", hp:HP170, type:R, retreatCost:2) {
        weakness W
        bwAbility "Double Type", {
          text "This Pokémon is both [R] and [F] type."
          actionA {
          }
        }
        move "Turbo Drive", {
          text "130 damage. Attach a basic Energy card from your discard pile to 1 of your Benched Pokémon."
          energyCost R, C, C
          attackRequirement {}
          onAttack {
            damage 130
          }
        }
      };
      case HEATRAN_26:
      return basic (this, hp:HP130, type:R, retreatCost:4) {
        weakness W
        move "Fire Fang", {
          text "30 damage. Your opponent’s Active Pokémon is now Burned."
          energyCost R, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
        move "Raging Flare", {
          text "80+ damage. This attack does an additional 10 damage for each damage counter on this Pokemon."
          energyCost R, R, C
          attackRequirement {}
          onAttack {
            damage 80
          }
        }
      };
      case VICTINI_27:
      return basic (this, hp:HP070, type:R, retreatCost:1) {
        weakness W
        move "Quick Draw", {
          text "Draw a card."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Combustion", {
          text "30 damage. "
          energyCost R, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case PANSEAR_28:
      return basic (this, hp:HP060, type:R, retreatCost:1) {
        weakness W
        move "Live Coal", {
          text "10 damage. "
          energyCost R
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Bite", {
          text "20 damage. "
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case SIMISEAR_29:
      return evolution (this, from:"Pansear", hp:HP100, type:R, retreatCost:1) {
        weakness W
        move "Flare", {
          text "30 damage. "
          energyCost R
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
        move "Giga Impact", {
          text "110 damage. This Pokémon can’t attack during your next turn."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 110
          }
        }
      };
      case GALARIAN_DARMANITAN_30:
      return evolution (this, from:"Galarian Darumaka", hp:HP140, type:R, retreatCost:3) {
        weakness W
        move "Headbutt", {
          text "40 damage. "
          energyCost C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
        move "Frozen Heat", {
          text "110+ damage. You may discard all [W] Energy from this Pokémon. If you do, this attack does 60 more damage."
          energyCost W, W, C
          attackRequirement {}
          onAttack {
            damage 110
          }
        }
      };
      case LARVESTA_31:
      return basic (this, hp:HP070, type:R, retreatCost:2) {
        weakness W
        move "Singe", {
          text "Your opponent’s Active Pokémon is now Burned."
          energyCost R
          attackRequirement {}
          onAttack {

          }
        }
      };
      case VOLCARONA_32:
      return evolution (this, from:"Larvesta", hp:HP120, type:R, retreatCost:1) {
        weakness W
        move "Scorch Wounds", {
          text "80 damage. If your opponent’s Active Pokémon has no damage counters on it, this attack does nothing."
          energyCost R
          attackRequirement {}
          onAttack {
            damage 80
          }
        }
        move "Fire Wing", {
          text "110 damage. "
          energyCost R, R, C
          attackRequirement {}
          onAttack {
            damage 110
          }
        }
      };
      case FLETCHINDER_33:
      return evolution (this, from:"Fletchling", hp:HP070, type:R, retreatCost:1) {
        weakness L
        resistance F, MINUS30
        move "Searing Flame", {
          text "20 damage. Your opponent’s Active Pokémon is now Burned."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case TALONFLAME_34:
      return evolution (this, from:"Fletchinder", hp:HP140, type:R, retreatCost:1) {
        weakness L
        resistance F, MINUS30
        bwAbility "Scorching Feather", {
          text "If this Pokémon is your Active Pokémon and is damaged by an opponent’s attack, the Attacking Pokémon is now Burned."
          actionA {
          }
        }
        move "Mach Flight", {
          text "120 damage. The Defending Pokémon can’t retreat during your opponent’s next turn."
          energyCost R, C, C
          attackRequirement {}
          onAttack {
            damage 120
          }
        }
      };
      case CENTISKORCH_V_35:
      return basic (this, hp:HP210, type:R, retreatCost:3) {
        weakness W
        move "Radiator", {
          text "20 damage. You may discard an Energy from this  Pokémon. If you do, discard an Energy from your opponent’s Active Pokémon."
          energyCost R
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Burning Train", {
          text "180 damage. "
          energyCost R, R, R, R
          attackRequirement {}
          onAttack {
            damage 180
          }
        }
      };
      case CENTISKORCH_VMAX_36:
      return evolution (this, from:"Centiskorch V", hp:HP320, type:R, retreatCost:3) {
        weakness W
        move "G-Max Centiferno", {
          text "40+ damage. This attack does 40 more damage for each [R] Energy attached to this Pokémon. You may attach a [R] Energy from your discard pile to this Pokémon after calculating damage for this attack."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case GALARIAN_MR_MIME_37:
      return basic (this, hp:HP080, type:W, retreatCost:1) {
        weakness M
        move "Reflect", {
          text "During your opponent’s next turn, any damage done to this Pokémon is reduced by 30."
          energyCost W
          attackRequirement {}
          onAttack {

          }
        }
        move "Icy Snow", {
          text "30 damage. "
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case GALARIAN_MR_RIME_38:
      return evolution (this, from:"Galarian Mr. Mime", hp:HP120, type:W, retreatCost:2) {
        weakness M
        bwAbility "Shuffle Dance", {
          text "Once during your turn, you may choose 1 of your opponent’s face-down Prize cards and switch it with the top card from their deck. (Both cards remain face-down.)"
          actionA {
          }
        }
        move "Mad Party", {
          text "20x damage. This attack does 20 damage for each Pokémon in your discard pile with a Mad Party attack."
          energyCost W, C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case SUICUNE_39:
      return basic (this, hp:HP120, type:W, retreatCost:1) {
        weakness L
        move "Wave Splash", {
          text "20 damage. "
          energyCost W
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Aurora Loop", {
          text "130 damage. Return 2 [W] Energy from this Pokémon to your hand."
          energyCost W, W, C
          attackRequirement {}
          onAttack {
            damage 130
          }
        }
      };
      case FEEBAS_40:
      return basic (this, hp:HP030, type:W, retreatCost:1) {
        weakness L
        move "Nap", {
          text "Heal 20 damage from this Pokémon."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
      };
      case MILOTIC_41:
      return evolution (this, from:"Feebas", hp:HP120, type:W, retreatCost:2) {
        weakness L
        bwAbility "Bright Heal", {
          text "Once during your turn, you may heal 20 damage from each of your Pokémon."
          actionA {
          }
        }
        move "Surf", {
          text "80 damage. "
          energyCost W, C, C
          attackRequirement {}
          onAttack {
            damage 80
          }
        }
      };
      case RELICANTH_42:
      return basic (this, hp:HP090, type:W, retreatCost:1) {
        weakness L
        move "Fossil Search", {
          text "Search your deck for up to 2 Rare Fossil cards and put them on your Bench. Then, shuffle your deck."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Surf", {
          text "40 damage. "
          energyCost W, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case PANPOUR_43:
      return basic (this, hp:HP060, type:W, retreatCost:1) {
        weakness L
        move "Water Gun", {
          text "10 damage. "
          energyCost W
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Bite", {
          text "20 damage. "
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case SIMIPOUR_44:
      return evolution (this, from:"Panpour", hp:HP100, type:W, retreatCost:1) {
        weakness L
        move "Water Gun", {
          text "30 damage. "
          energyCost W
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
        move "Giga Impact", {
          text "110 damage. This Pokémon can’t attack during your next turn."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 110
          }
        }
      };
      case GALARIAN_DARUMAKA_45:
      return basic (this, hp:HP070, type:W, retreatCost:1) {
        weakness M
        move "Tackle", {
          text "10 damage. "
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Headbutt", {
          text "20 damage. "
          energyCost W, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case GALARIAN_DARMANITAN_46:
      return copy (GALARIAN_DARMANITAN_30, this);
      case VANILLITE_47:
      return basic (this, hp:HP060, type:W, retreatCost:1) {
        weakness M
        move "Generate Cold", {
          text "10 damage. Flip a coin. If heads, your opponent’s Active Pokémon is now Paralyzed."
          energyCost W
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case VANILLISH_48:
      return evolution (this, from:"Vanillite", hp:HP080, type:W, retreatCost:2) {
        weakness M
        move "Freezing Headbutt", {
          text "30 damage. Flip a coin. If heads, your opponent’s Active Pokémon is now Paralyzed."
          energyCost W
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case VANILLUXE_49:
      return evolution (this, from:"Vanillish", hp:HP150, type:W, retreatCost:2) {
        weakness M
        bwAbility "Freezing Cold", {
          text "Once during your turn, if this Pokémon is your Active Pokémon, you may flip a coin. If heads, your opponent’s Active Pokémon is now Paralyzed."
          actionA {
          }
        }
        move "Frost Smash", {
          text "90 damage. "
          energyCost W, C
          attackRequirement {}
          onAttack {
            damage 90
          }
        }
      };
      case CUBCHOO_50:
      return basic (this, hp:HP070, type:W, retreatCost:2) {
        weakness M
        move "Chop", {
          text "10 damage. "
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Icicle", {
          text "30 damage. "
          energyCost W, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case BEARTIC_51:
      return evolution (this, from:"Cubchoo", hp:HP140, type:W, retreatCost:3) {
        weakness M
        move "Slash", {
          text "40 damage. "
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
        move "Frozen Slice", {
          text "150 damage. This Pokémon does 50 damage to itself."
          energyCost W, C, C
          attackRequirement {}
          onAttack {
            damage 150
          }
        }
      };
      case WISHIWASHI_52:
      return basic (this, hp:HP030, type:W, retreatCost:1) {
        weakness L
        move "Deep Sea Swirl", {
          text "Shuffle your hand into your deck, then draw 8 cards."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Wave Splash", {
          text "20 damage. "
          energyCost W
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case MAREANIE_53:
      return basic (this, hp:HP070, type:W, retreatCost:2) {
        weakness L
        move "Recover", {
          text "Heal 30 damage from this Pokémon."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Poison Tentacles", {
          text "20 damage. Your opponent’s Active Pokémon is now Poisoned."
          energyCost W, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case TOXAPEX_54:
      return evolution (this, from:"Mareanie", hp:HP130, type:W, retreatCost:3) {
        weakness L
        move "Recover", {
          text "Discard an Energy from this Pokémon. If you do, heal all damage from this Pokémon."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Poison Whip", {
          text "80 damage. Your opponent’s Active Pokémon is now Poisoned."
          energyCost W, C, C
          attackRequirement {}
          onAttack {
            damage 80
          }
        }
      };
      case DRACOVISH_55:
      return evolution (this, from:"Rare Fossil", hp:HP150, type:W, retreatCost:3) {
        weakness L
        bwAbility "Primal Law", {
          text "If this Pokémon is your Active Pokémon, your opponent can’t play any Pokémon from their hand to evolve their Pokémon."
          actionA {
          }
        }
        move "Hammer In", {
          text "120 damage. "
          energyCost W, C, C
          attackRequirement {}
          onAttack {
            damage 120
          }
        }
      };
      case ARCTOVISH_56:
      return evolution (this, from:"Rare Fossil", hp:HP150, type:W, retreatCost:2) {
        weakness L
        move "Hard Face", {
          text "90 damage. During your opponent’s next turn, this Pokémon takes 60 less damage from attacks."
          energyCost W, C, C
          attackRequirement {}
          onAttack {
            damage 90
          }
        }
        move "Cold Breath", {
          text "130 damage. Your opponent’s Active Pokémon is now Asleep."
          energyCost W, C, C, C
          attackRequirement {}
          onAttack {
            damage 130
          }
        }
      };
      case ELECTRIKE_57:
      return basic (this, hp:HP060, type:L, retreatCost:1) {
        weakness F
        move "Thunderbolt", {
          text "50 damage. Discard all Energy from this Pokémon."
          energyCost L, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case MANECTRIC_58:
      return evolution (this, from:"Electrike", hp:HP110, type:L, retreatCost:1) {
        weakness F
        move "Strafe", {
          text "30 damage. You may switch this Pokémon with 1 of your Benched Pokémon."
          energyCost L
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
        move "Flash Impact", {
          text "150 damage. This attack does 30 damage to 1 of your Benched Pokémon. (Don’t apply Weakness and Resistance for Benched Pokémon.)"
          energyCost L, L, C
          attackRequirement {}
          onAttack {
            damage 150
          }
        }
      };
      case VIKAVOLT_V_59:
      return basic (this, hp:HP210, type:L, retreatCost:3) {
        weakness F
        move "Paralyzing Bolt", {
          text "50 damage. Your opponent can’t play any Item cards from their hand during their next turn."
          energyCost L, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
        move "Super Zap Cannon", {
          text "190 damage. Discard 2 Energy from this Pokémon."
          energyCost L, L, C
          attackRequirement {}
          onAttack {
            damage 190
          }
        }
      };
      case TAPU_KOKO_60:
      return basic (this, hp:HP110, type:L, retreatCost:0) {
        weakness F
        move "Allure", {
          text "Draw 2 cards."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Lightning Ball", {
          text "110 damage. "
          energyCost L, L, C
          attackRequirement {}
          onAttack {
            damage 110
          }
        }
      };
      case TOXEL_61:
      return basic (this, hp:HP070, type:L, retreatCost:2) {
        weakness F
        move "Slap", {
          text "10 damage. "
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Static Shock", {
          text "20 damage. "
          energyCost L, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case TOXTRICITY_62:
      return evolution (this, from:"Toxel", hp:HP120, type:L, retreatCost:2) {
        weakness F
        move "Risk Taker", {
          text "Flip a coin, if heads discard 5 cards from the top of your opponent’s deck. If tails, discard 5 cards from the top of your deck."
          energyCost C, C
          attackRequirement {}
          onAttack {

          }
        }
        move "Thunder Jolt", {
          text "160 damage. This Pokémon does 30 damage to itself."
          energyCost L, L, C
          attackRequirement {}
          onAttack {
            damage 160
          }
        }
      };
      case DRACOZOLT_63:
      return evolution (this, from:"Rare Fossil", hp:HP160, type:L, retreatCost:4) {
        weakness F
        move "Rising Charge", {
          text "30 damage. During your next turn, this Pokémon’s Rising Charge attack does 90 more damage."
          energyCost L
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
        move "Giga Impact", {
          text "200 damage. This Pokémon can’t attack during your next turn."
          energyCost C, C, C, C
          attackRequirement {}
          onAttack {
            damage 200
          }
        }
      };
      case ARCTOZOLT_64:
      return evolution (this, from:"Rare Fossil", hp:HP130, type:L, retreatCost:2) {
        weakness F
        bwAbility "Numbing Vortex", {
          text "Whenever your opponent attaches an Energy from their hand to 1 of their Pokémon, put 2 damage counters on that Pokémon."
          actionA {
          }
        }
        move "Electro Ball", {
          text "70 damage. "
          energyCost L, C
          attackRequirement {}
          onAttack {
            damage 70
          }
        }
      };
      case JIGGLYPUFF_65:
      return basic (this, hp:HP070, type:P, retreatCost:1) {
        weakness M
        move "Mumble", {
          text "10 damage. "
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Moon Kick", {
          text "20 damage. "
          energyCost P, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case WIGGLYTUFF_66:
      return evolution (this, from:"Jigglypuff", hp:HP120, type:P, retreatCost:2) {
        weakness M
        move "Sleep Pulse", {
          text "30 damage. Your opponent’s Active Pokémon is now Asleep."
          energyCost P
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
        move "Double Smash", {
          text "90x damage. Flip 2 coins. This attack does 90 damage for each heads."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 90
          }
        }
      };
      case GALARIAN_SLOWBRO_V_67:
      return basic (this, hp:HP100, type:C, retreatCost:2) {
        weakness Y
        resistance F, MINUS30
        bwAbility "TBA", {
          text "TBA"
          actionA {
          }
        }
        move "TBA", {
          text "100 damage. TBA"
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 100
          }
        }
      };
      case MEW_V_68:
      return basic (this, hp:HP100, type:C, retreatCost:2) {
        weakness Y
        resistance F, MINUS30
        bwAbility "TBA", {
          text "TBA"
          actionA {
          }
        }
        move "TBA", {
          text "100 damage. TBA"
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 100
          }
        }
      };
      case SNUBBULL_69:
      return basic (this, hp:HP080, type:P, retreatCost:2) {
        weakness M
        move "Sharp Fang", {
          text "30 damage. "
          energyCost P, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case GRANBULL_70:
      return evolution (this, from:"Snubbull", hp:HP130, type:P, retreatCost:2) {
        weakness M
        move "Jaw Lock", {
          text "50 damage. The Defending Pokémon can’t retreat during your opponent’s next turn."
          energyCost P, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
        move "Headbutt Bounce", {
          text "130 damage. "
          energyCost P, P, C
          attackRequirement {}
          onAttack {
            damage 130
          }
        }
      };
      case GARDEVOIR_V_71:
      return basic (this, hp:HP210, type:P, retreatCost:2) {
        weakness M
        move "Magical Shot", {
          text "30 damage. "
          energyCost P
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
        move "Overflow Pulse", {
          text "120+ damage. If this Pokémon had its HP healed this turn, this attack does 80 more damage."
          energyCost P, P, C
          attackRequirement {}
          onAttack {
            damage 120
          }
        }
      };
      case GARDEVOIR_VMAX_72:
      return evolution (this, from:"Gardevoir V", hp:HP320, type:P, retreatCost:2) {
        weakness M
        move "Max Cure", {
          text "180 damage. Heal 50 damage from this Pokémon."
          energyCost P, P, C
          attackRequirement {}
          onAttack {
            damage 180
          }
        }
      };
      case LUNATONE_73:
      return basic (this, hp:HP090, type:P, retreatCost:1) {
        weakness D
        resistance F, MINUS30
        move "Future Sight", {
          text "Look at the top 4 cards of either player’s deck, then return them to the top of that deck in any order."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Psychic", {
          text "20+ damage. This attack does an additional 20 damage for each Energy attached to your opponent’s Active Pokémon."
          energyCost P, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case GOLETT_74:
      return basic (this, hp:HP090, type:P, retreatCost:3) {
        weakness D
        resistance F, MINUS30
        move "Rollout", {
          text "30 damage. "
          energyCost P, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
        move "Hammer In", {
          text "50 damage. "
          energyCost P, C, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case GOLURK_75:
      return evolution (this, from:"Golett", hp:HP150, type:P, retreatCost:4) {
        weakness D
        resistance F, MINUS30
        move "Explosive Punch", {
          text "80 damage. "
          energyCost P, C, C
          attackRequirement {}
          onAttack {
            damage 80
          }
        }
        move "Golurk Hammer", {
          text "180 damage. "
          energyCost P, C, C, C, C
          attackRequirement {}
          onAttack {
            damage 180
          }
        }
      };
      case GOTHITA_76:
      return basic (this, hp:HP060, type:P, retreatCost:1) {
        weakness D
        resistance F, MINUS30
        move "Fortune Eye", {
          text "Look at the top 5 cards of your opponent’s deck and put them back on top of their deck in any order."
          energyCost P
          attackRequirement {}
          onAttack {

          }
        }
        move "Gentle Slap", {
          text "30 damage. "
          energyCost P, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case GOTHORITA_77:
      return evolution (this, from:"Gothita", hp:HP080, type:P, retreatCost:2) {
        weakness D
        resistance F, MINUS30
        move "Whiny Voice", {
          text "Choose 1 random card from your opponent’s hand. Your opponent reveals that card and shuffles it into their deck."
          energyCost P
          attackRequirement {}
          onAttack {

          }
        }
        move "Double Spin", {
          text "30x damage. Flip 2 coins. This attack does 30 damage times the number of heads."
          energyCost P, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case GOTHITELLE_78:
      return evolution (this, from:"Gothorita", hp:HP140, type:P, retreatCost:2) {
        weakness D
        resistance F, MINUS30
        move "Psycho Trip", {
          text "40 damage. Your opponent’s Active Pokémon is now Confused."
          energyCost P
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
        move "Distort", {
          text "90 damage. Choose 2 random cards from your opponent’s hand. Your opponent reveals them and shuffles them into their deck."
          energyCost P, C
          attackRequirement {}
          onAttack {
            damage 90
          }
        }
      };
      case DEDENNE_79:
      return basic (this, hp:HP070, type:P, retreatCost:1) {
        weakness M
        move "Mad Party", {
          text "20x damage. This attack does 20 damage for each Pokémon in your discard pile with a Mad Party attack."
          energyCost P, C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case MORELULL_80:
      return basic (this, hp:HP060, type:P, retreatCost:1) {
        weakness M
        move "Spore", {
          text "Your opponent’s Active Pokémon is now Asleep."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Flop", {
          text "20 damage. "
          energyCost P, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case SHIINOTIC_81:
      return evolution (this, from:"Morelull", hp:HP110, type:P, retreatCost:2) {
        weakness M
        move "Twinking Light", {
          text "30 damage. Flip a coin. If heads, the Defending Pokémon can’t attack during your opponent’s next turn."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
        move "Forest Fear", {
          text "60+ damage. If Glimwood Tangle is in play, this attack does 60 more damage."
          energyCost P, C
          attackRequirement {}
          onAttack {
            damage 60
          }
        }
      };
      case MIMIKYU_82:
      return basic (this, hp:HP070, type:P, retreatCost:1) {
        weakness D
        resistance F, MINUS30
        bwAbility "Heal Stop", {
          text "Your opponent’s Benched Pokémon can’t be healed."
          actionA {
          }
        }
        move "Claw Slash", {
          text "30 damage. "
          energyCost P, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case SINISTEA_83:
      return basic (this, hp:HP030, type:P, retreatCost:1) {
        weakness D
        resistance F, MINUS30
        move "Furtive Drop", {
          text "Put 2 damage counters on your opponent’s Active Pokémon."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
      };
      case POLTEAGEIST_84:
      return evolution (this, from:"Sinistea", hp:HP060, type:P, retreatCost:1) {
        weakness D
        resistance F, MINUS30
        bwAbility "Tea Break", {
          text "Once during your turn, you may discard a Pokémon with a Mad Party attack from your hand and draw 2 cards."
          actionA {
          }
        }
        move "Mad Party", {
          text "20x damage. This attack does 20 damage for each Pokémon in your discard pile with a Mad Party attack."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case DIGLETT_85:
      return basic (this, hp:HP050, type:F, retreatCost:1) {
        weakness G
        move "Scratch", {
          text "20 damage. "
          energyCost F
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case DUGTRIO_86:
      return evolution (this, from:"Diglett", hp:HP090, type:F, retreatCost:1) {
        weakness G
        move "Dig", {
          text "30 damage. Flip a coin. If heads, prevent all effects of attacks, including damage, done to this Pokémon during your opponent’s next turn."
          energyCost F
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
        move "Mud Bomb", {
          text "70 damage. "
          energyCost F, C
          attackRequirement {}
          onAttack {
            damage 70
          }
        }
      };
      case GALARIAN_FARFETCH_D_87: //TODO: Get data on this card.
      return basic (this, hp:HP010, type:C, retreatCost:2) {
        weakness Y
        resistance F, MINUS30
        bwAbility "TBA", {
          text "TBA"
          actionA {
          }
        }
        move "TBA", {
          text "100 damage. TBA"
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 100
          }
        }
      };
      case GALARIAN_SIRFETCH_D_88:
      return basic (this, hp:HP010, type:C, retreatCost:2) {
        weakness Y
        resistance F, MINUS30
        bwAbility "TBA", {
          text "TBA"
          actionA {
          }
        }
        move "TBA", {
          text "100 damage. TBA"
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 100
          }
        }
      };
      case LARVITAR_89:
      return basic (this, hp:HP070, type:F, retreatCost:1) {
        weakness G
        move "Sand Spray", {
          text "10 damage. "
          energyCost F
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Pierce", {
          text "20 damage. "
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case PUPITAR_90:
      return evolution (this, from:"Larvitar", hp:HP080, type:F, retreatCost:3) {
        weakness G
        move "Sand Spray", {
          text "20 damage. "
          energyCost F
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Rocket Evolution", {
          text "40 damage. Search your deck for a card that evolves from this Pokémon and play it on top of this Pokémon to evolve it. Then, shuffle your deck."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case TYRANITAR_91:
      return evolution (this, from:"Pupitar", hp:HP180, type:F, retreatCost:4) {
        weakness G
        move "Bedrock Breaker", {
          text "120 damage. Discard a Stadium in play."
          energyCost F, C, C
          attackRequirement {}
          onAttack {
            damage 120
          }
        }
        move "Mountain Swing", {
          text "250 damage. Discard 5 cards from the top of your deck."
          energyCost F, F, C, C
          attackRequirement {}
          onAttack {
            damage 250
          }
        }
      };
      case TRAPINCH_92:
      return basic (this, hp:HP060, type:F, retreatCost:1) {
        weakness G
        move "Sand Impulse", {
          text "10+ damage. This attack does 10 damage to each of your opponent’s Benched Pokémon. (Don’t apply Weakness and Resistance.)"
          energyCost F
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case VIBRAVA_93:
      return evolution (this, from:"Trapinch", hp:HP080, type:F, retreatCost:1) {
        weakness G
        move "Land's Impulse", {
          text "20 damage. If there is any Stadium card in play, this attack does 10 more damage."
          energyCost F
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case FLYGON_94:
      return evolution (this, from:"Vibrava", hp:HP150, type:F, retreatCost:1) {
        weakness G
        bwAbility "Sand Maze", {
          text "If this Pokémon is your Active Pokémon, your opponent’s Active Pokémon can’t Retreat."
          actionA {
          }
        }
        move "Desert Geizer", {
          text "130 damage. If your opponent has a Stadium in play, discard it. If you do, during your opponent’s next turn, prevent all damage and effects done to this Pokémon by the attacks of your opponent’s Pokémon."
          energyCost F, C, C
          attackRequirement {}
          onAttack {
            damage 130
          }
        }
      };
      case SOLROCK_95:
      return basic (this, hp:HP090, type:F, retreatCost:1) {
        weakness G
        bwAbility "Resist Shade", {
          text "If you have Lunatone in play, your opponent’s Pokémon have no Resistance."
          actionA {
          }
        }
        move "Rock Throw", {
          text "30 damage. "
          energyCost F, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case HIPPOPOTAS_96:
      return basic (this, hp:HP100, type:F, retreatCost:4) {
        weakness G
        move "Tackle", {
          text "10 damage. "
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Double Stomp", {
          text "70+ damage. Flip 2 coins. This attack does 30 more damage times the number of heads."
          energyCost F, F, F, C
          attackRequirement {}
          onAttack {
            damage 70
          }
        }
      };
      case HIPPOWDON_97:
      return evolution (this, from:"Hippopotas", hp:HP150, type:F, retreatCost:4) {
        weakness G
        move "Triple Smash", {
          text "80x damage. Flip 3 coins. This attack does 80 damage for each heads."
          energyCost F, F, C
          attackRequirement {}
          onAttack {
            damage 80
          }
        }
        move "Land Crush", {
          text "150 damage. "
          energyCost F, F, F, C
          attackRequirement {}
          onAttack {
            damage 150
          }
        }
      };
      case RHYPERIOR_V_98:
      return basic (this, hp:HP230, type:F, retreatCost:4) {
        weakness G
        move "Drill Run", {
          text "80 damage. Discard 1 Energy from your opponent’s Active Pokémon."
          energyCost F, C, C
          attackRequirement {}
          onAttack {
            damage 80
          }
        }
        move "Heavy Rock Cannon", {
          text "210 damage. This Pokémon can’t use this attack during your next turn."
          energyCost F, C, C, C
          attackRequirement {}
          onAttack {
            damage 210
          }
        }
      };
      case DIGGERSBY_99:
      return evolution (this, from:"Bunnelby", hp:HP130, type:F, retreatCost:3) {
        weakness G
        move "Hammer In", {
          text "90 damage. "
          energyCost F, C, C
          attackRequirement {}
          onAttack {
            damage 90
          }
        }
        move "Land Crush", {
          text "140 damage. "
          energyCost F, F, C, C
          attackRequirement {}
          onAttack {
            damage 140
          }
        }
      };
      case ZYGARDE_100:
      return basic (this, hp:HP140, type:F, retreatCost:3) {
        weakness G
        move "Bite", {
          text "30 damage. "
          energyCost C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
        move "Power Blast", {
          text "130 damage. Discard a [F] Energy attached to this Pokémon."
          energyCost F, F, C, C
          attackRequirement {}
          onAttack {
            damage 130
          }
        }
      };
      case PASSIMIAN_101:
      return basic (this, hp:HP110, type:F, retreatCost:1) {
        weakness P
        move "Call for Family", {
          text "Search your deck for up to 2 Basic Pokémon and put them on your Bench. Then, shuffle your deck."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Rock Hurl", {
          text "70 damage. This attack’s damage isn’t affected by Resistance."
          energyCost F, C, C
          attackRequirement {}
          onAttack {
            damage 70
          }
        }
      };
      case GRIMER_102:
      return basic (this, hp:HP080, type:D, retreatCost:3) {
        weakness F
        move "Stomp Off", {
          text "Discard 1 card from the top of your opponent’s deck."
          energyCost D
          attackRequirement {}
          onAttack {

          }
        }
        move "Sludge Whirlpool", {
          text "50 damage. "
          energyCost D, C, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case MUK_103:
      return evolution (this, from:"Grimer", hp:HP140, type:D, retreatCost:4) {
        weakness F
        move "Triple Poison", {
          text "Your opponent’s Active Pokémon is now Poisoned. Put 3 damage counters for this Poison between turns."
          energyCost D
          attackRequirement {}
          onAttack {

          }
        }
        move "Sludge Whirlpool", {
          text "120 damage. "
          energyCost D, C, C, C
          attackRequirement {}
          onAttack {
            damage 120
          }
        }
      };
      case SPINARAK_104:
      return basic (this, hp:HP060, type:D, retreatCost:1) {
        weakness F
        move "Hang Down", {
          text "10 damage. "
          energyCost D
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Sting", {
          text "20 damage. "
          energyCost D, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case ARIADOS_105:
      return evolution (this, from:"Spinarak", hp:HP110, type:D, retreatCost:2) {
        weakness F
        bwAbility "Spider Net", {
          text "When you play this card from your hand to evolve 1 of your Pokémon, you may switch 1 of your opponent’s Evolution Pokémon with their Active Pokémon."
          actionA {
          }
        }
        move "Poison Sting", {
          text "30 damage. Your opponent’s Active Pokémon is now Poisoned."
          energyCost D, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case CROBAT_V_106:
      return basic (this, hp:HP180, type:D, retreatCost:1) {
        weakness F
        bwAbility "Night Asset", {
          text "Once during your turn, when you play this Pokémon from hand to your Bench, you may draw cards until you have 6 cards in your hand. You can’t use more than 1 Night Asset Ability during your turn."
          actionA {
          }
        }
        move "Poison Fang", {
          text "70 damage. Your opponent’s Active Pokémon is now Poisoned."
          energyCost D, C
          attackRequirement {}
          onAttack {
            damage 70
          }
        }
      };
      case ABSOL_107:
      return basic (this, hp:HP100, type:D, retreatCost:1) {
        weakness G
        move "Dark Cutter", {
          text "70 damage. "
          energyCost D, D
          attackRequirement {}
          onAttack {
            damage 70
          }
        }
      };
      case DARKRAI_108:
      return basic (this, hp:HP120, type:D, retreatCost:2) {
        weakness G
        bwAbility "Dark Guard", {
          text "If this Pokémon has a [D] Energy attached to it, it takes 20 less damage from attacks."
          actionA {
          }
        }
        move "Dark Spiral", {
          text "60+ damage. This attack does an additional 20 damage for each [D] Energy attached to this Pokémon."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 60
          }
        }
      };
      case PURRLOIN_109:
      return basic (this, hp:HP070, type:D, retreatCost:1) {
        weakness G
        move "Dig Claws", {
          text "10 damage. "
          energyCost D
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Fake Out", {
          text "20 damage. Flip a coin. If heads, your opponent’s Active Pokémon is now Paralyzed."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case LIEPARD_110:
      return evolution (this, from:"Purrloin", hp:HP100, type:D, retreatCost:1) {
        weakness G
        bwAbility "Limber", {
          text "This Pokémon can’t be Paralyzed."
          actionA {
          }
        }
        move "Slashing Claw", {
          text "90 damage. "
          energyCost D, C, C
          attackRequirement {}
          onAttack {
            damage 90
          }
        }
      };
      case DEINO_111:
      return basic (this, hp:HP060, type:D, retreatCost:1) {
        weakness G
        move "Ram", {
          text "10 damage. "
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case ZWEILOUS_112:
      return evolution (this, from:"Deino", hp:HP100, type:D, retreatCost:2) {
        weakness G
        move "Corkscrew Punch", {
          text "30 damage. "
          energyCost D, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
        move "Darkness Fang", {
          text "70 damage. "
          energyCost D, D, C
          attackRequirement {}
          onAttack {
            damage 70
          }
        }
      };
      case HYDREIGON_113:
      return evolution (this, from:"Zweilous", hp:HP160, type:D, retreatCost:3) {
        weakness G
        bwAbility "Dark Squall", {
          text "As often as you like during your turn, you may attach a [D] Energy from your hand to one of your Pokémon in play."
          actionA {
          }
        }
        move "Jet Black Fangs", {
          text "130 damage. "
          energyCost D, D, C
          attackRequirement {}
          onAttack {
            damage 130
          }
        }
      };
      case GALARIAN_ZIGZAGOON_114:
      return basic (this, hp:HP070, type:D, retreatCost:2) {
        weakness G
        move "Pin Missile", {
          text "10x damage. Flip 4 coins. This attack does 10 damage times the number of heads."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case GALARIAN_LINOONE_115:
      return evolution (this, from:"Galarian Zigzagoon", hp:HP100, type:D, retreatCost:2) {
        weakness G
        move "Double-Edge", {
          text "60 damage. This attack does 20 damage to this Pokémon."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 60
          }
        }
      };
      case GALARIAN_OBSTAGOON_116:
      return evolution (this, from:"Galarian Linoone", hp:HP170, type:D, retreatCost:2) {
        weakness G
        bwAbility "Bad Ruler", {
          text "Once during your turn, you may have your opponent discard cards from their hand until they have 4 cards left."
          actionA {
          }
        }
        move "Knuckle Impact", {
          text "180 damage. This Pokémon can’t attack during your next turn."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 180
          }
        }
      };
      case SCRAGGY_117:
      return basic (this, hp:HP070, type:D, retreatCost:1) {
        weakness G
        move "Stampede", {
          text "10 damage. "
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Ram", {
          text "20 damage. "
          energyCost D, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case SCRAFTY_118:
      return evolution (this, from:"Scraggy", hp:HP120, type:D, retreatCost:2) {
        weakness G
        move "Corner", {
          text "30 damage. The Defending Pokémon can’t retreat during your opponent’s next turn."
          energyCost D
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
        move "Bad Brawl", {
          text "90+ damage. If you played Piers this turn, this attack does 90 more damage."
          energyCost D, C, C
          attackRequirement {}
          onAttack {
            damage 90
          }
        }
      };
      case INKAY_119:
      return basic (this, hp:HP060, type:D, retreatCost:1) {
        weakness G
        move "Tackle", {
          text "10 damage. "
          energyCost D
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Back Strike", {
          text "20+ damage. If your opponent’s Active Pokémon is Confused, this attack does 50 more damage."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case MALAMAR_120:
      return evolution (this, from:"Inkay", hp:HP120, type:D, retreatCost:3) {
        weakness G
        move "Eerie Wave", {
          text "50 damage. Your opponent’s Active Pokémon is now Confused."
          energyCost D, C
          attackRequirement {}
          onAttack {

          }
        }
        move "Random Peck", {
          text "80+ damage. Flip 2 coins. This attack does 40 more damage for each heads."
          energyCost D, D, C
          attackRequirement {}
          onAttack {
            damage 80
          }
        }
      };
      case HOOPA_121:
      return basic (this, hp:HP120, type:D, retreatCost:2) {
        weakness G
        move "Assault Gate", {
          text "90 damage. If this Pokémon wasn’t moved from your Bench to the Active Spot during your turn, this attack does nothing. This attack isn’t affected by Weakness."
          energyCost D
          attackRequirement {}
          onAttack {
            damage 90
          }
        }
      };
      case NICKIT_122:
      return basic (this, hp:HP070, type:D, retreatCost:1) {
        weakness G
        move "Filch", {
          text "Draw a card."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Tail Slap", {
          text "30 damage. "
          energyCost D, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case NICKIT_123:
      return basic (this, hp:HP070, type:D, retreatCost:1) {
        weakness G
        move "Tail Whip", {
          text "Flip a coin. If heads, the Defending Pokémon can’t attack during your opponent’s next turn."
          energyCost D
          attackRequirement {}
          onAttack {

          }
        }
      };
      case THIEVUL_124:
      return evolution (this, from:"Nickit", hp:HP100, type:D, retreatCost:1) {
        weakness G
        move "Nasty Plot", {
          text "Search your deck for up to 2 cards and put them into your hand. Then, shuffle your deck."
          energyCost D
          attackRequirement {}
          onAttack {

          }
        }
        move "Sharp Fang", {
          text "70 damage. "
          energyCost D, D
          attackRequirement {}
          onAttack {
            damage 70
          }
        }
      };
      case GRIMMSNARL_V_125:
      return basic (this, hp:HP220, type:D, retreatCost:2) {
        weakness G
        move "Bite", {
          text "40 damage. "
          energyCost D
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
        move "Spiky Knuckle", {
          text "200 damage. Put 2 [D] Energy attached to this Pokémon into your hand."
          energyCost D, D, D
          attackRequirement {}
          onAttack {
            damage 200
          }
        }
      };
      case GRIMMSNARL_VMAX_126:
      return evolution (this, from:"Grimmsnarl V", hp:HP330, type:D, retreatCost:3) {
        weakness G
        move "G-Max Drill", {
          text "170+ damage. This attack does 50 more damage for each extra [D] Energy attached to this Pokémon (in addition to this attack’s cost). You can’t add more than 100 damage in this way."
          energyCost D, D, D
          attackRequirement {}
          onAttack {
            damage 170
          }
        }
      };
      case ETERNATUS_V_127:
      return basic (this, hp:HP220, type:D, retreatCost:2) {
        weakness F
        move "Power Accel", {
          text "30 damage. You may attach 1 [D] Energy from your hand to 1 of your Benched Pokémon."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
        move "Dynamax Cannon", {
          text "120+ damage. If your opponent’s Active Pokémon is a Pokémon VMAX, this attack does 120 more damage."
          energyCost D, C, C, C
          attackRequirement {}
          onAttack {
            damage 120
          }
        }
      };
      case ETERNATUS_VMAX_128:
      return evolution (this, from:"Eternatus V", hp:HP340, type:D, retreatCost:3) {
        weakness F
        bwAbility "Infinity Zone", {
          text "If all of your Pokémon in play are [D], you may now have up to 8 [D] Pokémon on your Bench and can’t play any other type of Pokémon. (When this Ability no longer works, discard your Benched Pokémon until there are 5 left.)"
          actionA {
          }
        }
        move "Dread End", {
          text "30x damage. This attack does 30 damage times the number of your [D] Pokémon."
          energyCost D, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case SKARMORY_129:
      return basic (this, hp:HP120, type:M, retreatCost:1) {
        weakness L
        resistance F, MINUS30
        move "Metal Arms", {
          text "10+ damage. If this Pokémon has a Pokémon Tool card attached to it, this attack does 40 more damage."
          energyCost M
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Cutting Wind", {
          text "80 damage. "
          energyCost M, C, C
          attackRequirement {}
          onAttack {
            damage 80
          }
        }
      };
      case ARON_130:
      return basic (this, hp:HP070, type:M, retreatCost:2) {
        weakness R
        resistance G, MINUS30
        move "Ram", {
          text "10 damage. "
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Headbutt", {
          text "20 damage. "
          energyCost M, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case LAIRON_131:
      return evolution (this, from:"Aron", hp:HP100, type:M, retreatCost:3) {
        weakness R
        resistance G, MINUS30
        move "Knock Away", {
          text "30+ damage. Flip a coin. If heads, this attack does 30 more damage."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
        move "Lunge Out", {
          text "50 damage. "
          energyCost M, C, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case AGGRON_132:
      return evolution (this, from:"Lairon", hp:HP160, type:M, retreatCost:3) {
        weakness R
        resistance G, MINUS30
        bwAbility "Sturdy", {
          text "If this Pokémon has full HP and would be Knocked Out by damage from an attack, this Pokémon is not Knocked Out, and its remaining HP becomes 10."
          actionA {
          }
        }
        move "Gigaton Stomp", {
          text "160 damage. "
          energyCost M, C, C, C
          attackRequirement {}
          onAttack {
            damage 160
          }
        }
      };
      case ESCAVALIER_133:
      return evolution (this, from:"Karrablast", hp:HP120, type:M, retreatCost:2) {
        weakness R
        resistance G, MINUS30
        move "Fury Cutter", {
          text "10+ damage. Flip 3 coins. If 1 is heads, this attack does 20 more damage. If 2 are heads, this attack does 70 more damage. If all 3 are heads, this attack does 140 more damage."
          energyCost M
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Shell Attack", {
          text "60 damage. "
          energyCost M, C
          attackRequirement {}
          onAttack {
            damage 60
          }
        }
      };
      case KLINK_134:
      return basic (this, hp:HP060, type:M, retreatCost:2) {
        weakness R
        resistance G, MINUS30
        move "Call for Backup", {
          text "Search your deck for a [M] Pokémon, reveal it, and put it into your hand. Then, shuffle your deck."
          energyCost M
          attackRequirement {}
          onAttack {

          }
        }
      };
      case KLANG_135:
      return evolution (this, from:"Klink", hp:HP090, type:M, retreatCost:3) {
        weakness R
        resistance G, MINUS30
        move "Call for Backup", {
          text "Search your deck for a [M] Pokémon, reveal it, and put it into your hand. Then, shuffle your deck."
          energyCost M
          attackRequirement {}
          onAttack {

          }
        }
        move "Spinning Attack", {
          text "60 damage. "
          energyCost M, C, C
          attackRequirement {}
          onAttack {
            damage 60
          }
        }
      };
      case KLINKLANG_136:
      return evolution (this, from:"Klang", hp:HP150, type:M, retreatCost:3) {
        weakness R
        resistance G, MINUS30
        move "Simple Beam", {
          text "60 damage. "
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 60
          }
        }
        move "Clockwork", {
          text "200 damage. If there are no Klink or Klang on your Bench, this attack does nothing."
          energyCost M, C, C
          attackRequirement {}
          onAttack {
            damage 200
          }
        }
      };
      case GALARIAN_STUNFISK_V_137:
      return basic (this, hp:HP200, type:M, retreatCost:4) {
        weakness R
        resistance G, MINUS30
        bwAbility "Metal Skin", {
          text "This Pokémon’s max HP is increased by 20 for each [M] Energy attached to it."
          actionA {
          }
        }
        move "Trap Bite", {
          text "60 damage. If this Pokémon is damaged by an attack during your opponent’s next turn, put 12 damage counters on the Attacking Pokémon."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 60
          }
        }
      };
      case CUFANT_138:
      return basic (this, hp:HP100, type:M, retreatCost:3) {
        weakness R
        resistance G, MINUS30
        move "Strength", {
          text "60 damage. "
          energyCost M, C, C
          attackRequirement {}
          onAttack {
            damage 60
          }
        }
      };
      case COPPERAJAH_139:
      return evolution (this, from:"Cufant", hp:HP190, type:M, retreatCost:4) {
        weakness R
        resistance G, MINUS30
        bwAbility "Antibacterial Skin", {
          text "This Pokémon can’t be affected by Special Conditions."
          actionA {
          }
        }
        move "Revenge Stomp", {
          text "120+ damage. If any of your Benched Pokémon have any damage counters on them, this attack does 120 more damage."
          energyCost M, M, C, C
          attackRequirement {}
          onAttack {
            damage 120
          }
        }
      };
      case KANGASKHAN_140:
      return basic (this, hp:HP130, type:C, retreatCost:2) {
        weakness F
        move "Retaliate", {
          text "30+ damage. If any of your Pokémon were Knocked Out by damage from an opponent’s attack during their last turn, this attack does 90 more damage."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
        move "Hammer In", {
          text "100 damage. "
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 100
          }
        }
      };
      case TAUROS_141:
      return basic (this, hp:HP110, type:C, retreatCost:2) {
        weakness F
        move "Horn Attack", {
          text "60 damage. "
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 60
          }
        }
      };
      case EEVEE_142:
      return basic (this, hp:HP060, type:C, retreatCost:1) {
        weakness F
        move "Signs of Evolution", {
          text "Search your deck for a Pokémon that evolves from Eevee, reveal it, and put it into your hand. Then, shuffle your deck."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Kick Attack", {
          text "30 damage. Flip a coin. If tails, this attack does nothing."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case SENTRET_143:
      return basic (this, hp:HP060, type:C, retreatCost:1) {
        weakness F
        move "Call for Family", {
          text "Search your deck for a Basic Pokémon and put it on your Bench. Then, shuffle your deck."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
      };
      case FURRET_144:
      return evolution (this, from:"Sentret", hp:HP110, type:C, retreatCost:1) {
        weakness F
        move "Feelin’ Fine", {
          text "Draw 3 cards."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Tail Smash", {
          text "90 damage. Flip a coin. If tails, this attack fails."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 90
          }
        }
      };
      case DUNSPARCE_145:
      return basic (this, hp:HP060, type:C, retreatCost:1) {
        weakness F
        bwAbility "One Last Dig", {
          text "If this Pokémon is Knocked Out by damage from an opponent’s attack, discard the top 2 cards of your opponent’s deck."
          actionA {
          }
        }
        move "Ram", {
          text "20 damage. "
          energyCost C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case TEDDIURSA_146:
      return basic (this, hp:HP070, type:C, retreatCost:2) {
        weakness F
        move "Baby-Doll Eyes", {
          text "The Defending Pokémon can’t retreat during your opponent’s next turn."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Dig Claws", {
          text "20 damage. "
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case URSARING_147:
      return evolution (this, from:"Teddiursa", hp:HP140, type:C, retreatCost:3) {
        weakness F
        move "Hammer Arm", {
          text "70 damage. Discard the top card of your opponent’s deck."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 70
          }
        }
        move "Claw Slash", {
          text "120 damage. "
          energyCost C, C, C, C
          attackRequirement {}
          onAttack {
            damage 120
          }
        }
      };
      case LUGIA_148:
      return basic (this, hp:HP130, type:C, retreatCost:2) {
        weakness L
        resistance F, MINUS30
        move "Gust", {
          text "30 damage. "
          energyCost C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
        move "Energy Loop", {
          text "120 damage. Put an Energy attached to this Pokémon into your hand."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 120
          }
        }
      };
      case SKITTY_149:
      return basic (this, hp:HP060, type:C, retreatCost:1) {
        weakness F
        move "Draw Up", {
          text "Search your deck for an Energy card, reveal it, and put it into your hand. Then, shuffle your deck."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Cat Kick", {
          text "20 damage. "
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case DELCATTY_150:
      return evolution (this, from:"Skitty", hp:HP100, type:C, retreatCost:1) {
        weakness F
        move "Captivating Tail", {
          text "Switch your opponent’s Active Pokémon with 1 of their Benched Pokémon. The new Active Pokémon is now Confused."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Moon Impact", {
          text "90 damage. "
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 90
          }
        }
      };
      case SALAMENCE_V_151:
      return basic (this, hp:HP220, type:C, retreatCost:2) {
        weakness L
        resistance F, MINUS30
        move "Trans Flight", {
          text "This attack does 30 damage to each of your opponent’s Pokémon. (Don’t apply Weakness and Resistance.)"
          energyCost C, C, C
          attackRequirement {}
          onAttack {

          }
        }
        move "Heavy Storm", {
          text "160 damage. "
          energyCost C, C, C, C
          attackRequirement {}
          onAttack {
            damage 160
          }
        }
      };
      case SALAMENCE_VMAX_152:
      return evolution (this, from:"Salamence V", hp:HP320, type:C, retreatCost:2) {
        weakness L
        resistance F, MINUS30
        move "Twin Sonic", {
          text "This attack does 40 damage to 2 of your opponent’s Pokémon. (Don’t apply Weakness and Resistance for Benched Pokémon.)"
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Max Wing", {
          text "240 damage. During your next turn, this Pokémon can’t use Max Wing."
          energyCost C, C, C, C
          attackRequirement {}
          onAttack {
            damage 240
          }
        }
      };
      case STARLY_153:
      return basic (this, hp:HP050, type:C, retreatCost:1) {
        weakness L
        resistance F, MINUS30
        bwAbility "Sky Circus", {
          text "If you played Bird Keeper from your hand during this turn, ignore all Energy in the attack costs of this Pokémon."
          actionA {
          }
        }
        move "Sharp Eyes", {
          text "Search your deck for any 2 cards and put them into your hand. Then, shuffle your deck."
          energyCost C, C
          attackRequirement {}
          onAttack {

          }
        }
      };
      case STARAVIA_154:
      return evolution (this, from:"Starly", hp:HP080, type:C, retreatCost:1) {
        weakness L
        resistance F, MINUS30
        move "Ambush", {
          text "20 damage. Flip a coin. If heads, this attack does 20 more damage."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Wing Attack", {
          text "40 damage. "
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case STARAPTOR_155:
      return evolution (this, from:"Staravia", hp:HP150, type:C, retreatCost:0) {
        weakness L
        resistance F, MINUS30
        move "Hurricane Mixer", {
          text "70 damage. You may move as many Energy cards attached to your Pokémon as you like to any of your other Pokémon."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 70
          }
        }
        move "Brave Bird", {
          text "170 damage. This Pokémon does 30 damage to itself."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 170
          }
        }
      };
      case DUCKLETT_156:
      return basic (this, hp:HP050, type:C, retreatCost:1) {
        weakness L
        resistance F, MINUS30
        move "Flap", {
          text "20 damage. "
          energyCost C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case SWANNA_157:
      return evolution (this, from:"Ducklett", hp:HP110, type:C, retreatCost:0) {
        weakness L
        resistance F, MINUS30
        bwAbility "Sky Circus", {
          text "If you played Bird Keeper from your hand during this turn, ignore all Energy in the attack costs of this Pokémon."
          actionA {
          }
        }
        move "Feather Slash", {
          text "70+ damage. You may discard 1 card from your hand. If you do, this attack does 70 more damage."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 70
          }
        }
      };
      case SKWOVET_158:
      return basic (this, hp:HP070, type:C, retreatCost:1) {
        weakness F
        move "Whimsy Tackle", {
          text "40 damage. Flip a coin. If tails, this attack does nothing."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case GREEDENT_159:
      return evolution (this, from:"Skwovet", hp:HP120, type:C, retreatCost:1) {
        weakness F
        move "Scrape Off", {
          text "20 damage. Before doing damage, discard any Pokémon Tools attached to your opponent’s Active Pokémon."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Hit and Run", {
          text "100 damage. Return this Pokémon and all cards attached to it to your hand."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 100
          }
        }
      };
      case BUNNELBY_160:
      return basic (this, hp:HP040, type:C, retreatCost:1) {
        weakness F
        move "Mad Party", {
          text "20x damage. This attack does 20 damage for each Pokémon in your discard pile with a Mad Party attack."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case FLETCHLING_161:
      return basic (this, hp:HP060, type:C, retreatCost:1) {
        weakness L
        resistance F, MINUS30
        move "Tackle", {
          text "20 damage. "
          energyCost C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case ROOKIDEE_162:
      return basic (this, hp:HP060, type:C, retreatCost:1) {
        weakness L
        resistance F, MINUS30
        move "Pluck", {
          text "10 damage. Before doing damage, discard any Pokémon Tools attached to your opponent’s Active Pokémon."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case CORVISQUIRE_163:
      return evolution (this, from:"Rookidee", hp:HP080, type:C, retreatCost:1) {
        weakness L
        resistance F, MINUS30
        move "Peck", {
          text "30 damage. "
          energyCost C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
        move "Fury Attack", {
          text "40x damage. Flip 3 coins. This attack does 40 damage times the number of heads."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case CORVIKNIGHT_164:
      return evolution (this, from:"Corvisquire", hp:HP160, type:C, retreatCost:2) {
        weakness L
        resistance F, MINUS30
        bwAbility "Flying Taxi", {
          text "Once during your turn when you play this card from your hand to evolve a Pokémon, you may choose 1 of your Pokémon (excluding any Corviknight). Return that Pokémon and all cards attached to it to your hand."
          actionA {
          }
        }
        move "Blasting Wind", {
          text "120 damage. "
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 120
          }
        }
      };
      case ADVERSITY_GLOVES_165:
      return pokemonTool (this) {
        text "If your opponent’s Active Pokémon is the same type as the Weakness of the Pokémon this card is attached to, the attacks of this Pokémon do 30 more damage to your opponent’s Active Pokémon."
        onPlay {reason->
        }
        onRemoveFromPlay {
        }
        allowAttach {to->
        }
      };
      case BIG_PARASOL_166:
      return pokemonTool (this) {
        text "As long as the Pokémon this card is attached to is your Active Pokémon, prevent all effects of your opponent’s attacks, except damage, done to all of your Pokémon (existing effects are not removed)."
        onPlay {reason->
        }
        onRemoveFromPlay {
        }
        allowAttach {to->
        }
      };
      case BIRD_KEEPER_167:
      return supporter (this) {
        text "Switch your Active Pokémon with 1 of your Benched Pokémon. Then, draw 3 cards."
        onPlay {
        }
        playRequirement{
        }
      };
      case CHEERING_YELL_HORN_168:
      return itemCard (this) {
        text "Each player’s Active Pokémon is now Confused."
        onPlay {
        }
        playRequirement{
        }
      };
      case GLIMWOOD_TANGLE_169:
      return stadium (this) {
        text "Once during either player’s turn, after they flip any coins for an attack, that player may ignore all results of those coin flips and begin flipping those coins again."
        onPlay {
        }
        onRemoveFromPlay{
        }
      };
      case OLD_COMPUTER_170:
      return itemCard (this) {
        text "Flip 2 coins. If both are heads, choose 1 card from your discard pile, reveal it, and put it into your hand."
        onPlay {
        }
        playRequirement{
        }
      };
      case KABU_171:
      return supporter (this) {
        text "Shuffle your hand into your deck and draw 4 cards. If you only have 1 Pokémon in play, draw 8 cards instead."
        onPlay {
        }
        playRequirement{
        }
      };
      case LOOKALIKE_BELL_172:
      return itemCard (this) {
        text "Search your deck for a Pokémon with the same name as a Pokémon in your discard pile, and add it to your hand. Then, shuffle your deck."
        onPlay {
        }
        playRequirement{
        }
      };
      case PIERS_173:
      return supporter (this) {
        text "Search your deck for 1 [D] Pokémon and any 1 Energy, reveal them, and put them into your hand. Then, shuffle your deck."
        onPlay {
        }
        playRequirement{
        }
      };
      case POKEMON_BREEDER_S_NURTURING_174:
      return supporter (this) {
        text "Choose up to 2 of your Pokémon in play. Search your deck for a card that evolves from each of those Pokémon and put it on top of the Pokémon to evolve it. Then, shuffle your deck. (You can’t use this card during your first turn or on a Pokémon that just came into play.)"
        onPlay {
        }
        playRequirement{
        }
      };
      case RARE_FOSSIL_175:
      return itemCard (this) {
        text "Play this card as if it were a 70-HP [C] Basic Pokémon. At any time during your turn (before your attack), you may discard this card from play. This card can’t retreat and isn’t affected by Status Conditions."
        onPlay {
        }
        playRequirement{
        }
      };
      case ROSE_176:
      return supporter (this) {
        text "Choose up to 2 basic Energy from your discard pile and attach them to 1 of your Pokémon VMAX. Then, discard your hand."
        onPlay {
        }
        playRequirement{
        }
      };
      case ROSE_TOWER_177:
      return stadium (this) {
        text "Once during either player’s turn, that player may draw cards from their deck until they have 3 cards in their hand."
        onPlay {
        }
        onRemoveFromPlay{
        }
      };
      case ROTOM_PHONE_178:
      return itemCard (this) {
        text "Look at the top 5 cards of your deck. Choose a card you find there, shuffle your deck, then put the card you chose on top of your deck."
        onPlay {
        }
        playRequirement{
        }
      };
      case MOUNTAINOUS_SMOKE_179:
      return pokemonTool (this) {
        text "When the Pokémon this card is attached to is Knocked Out by damage from an opponent’s attack, your opponent puts any Prize cards they pick into their discard pile instead of their hand."
        onPlay {reason->
        }
        onRemoveFromPlay {
        }
        allowAttach {to->
        }
      };
      case SPIKEMUTH_180:
      return stadium (this) {
        text "Whenever a player’s Pokémon is moved from the Active Spot to the Bench during their turn put 2 damage counters on that Pokémon."
        onPlay {
        }
        onRemoveFromPlay{
        }
      };
      case DUBIOUS_CANNED_GOODS_181:
      return itemCard (this) {
        text "Heal 80 damage from 1 of your Pokémon with a [P] Energy attached to it. Then, discard a [P] Energy from that Pokémon."
        onPlay {
        }
        playRequirement{
        }
      };
      case TOUGHNESS_CAPE_182:
      return pokemonTool (this) {
        text "The maximum HP of the Basic Pokémon this card is attached to is increased by 50 (excluding Pokémon-GX)."
        onPlay {reason->
        }
        onRemoveFromPlay {
        }
        allowAttach {to->
        }
      };
      case TURBO_PATCH_183:
      return itemCard (this) {
        text "Flip a coin. If heads, choose a basic Energy card from your discard pile and attach it to 1 of your Basic Pokémon (excluding Pokémon-GX)."
        onPlay {
        }
        playRequirement{
        }
      };
      case HEAT_FIRE_ENERGY_184:
      return specialEnergy (this, [[]]) {
        text "This card provides 1 [R] Energy while it’s attached to a Pokémon. If this card is attached to a [R] Pokémon, its maximum HP is increased by 20."
        def eff
        onPlay { reason->
          eff = getter (GET_FULL_HP, self) {h->
            if (self.types.contains(R)) {
              h.object += hp(20)
            }
          }
        }
        getEnergyTypesOverride {
          return [[R] as Set]
        }
        onRemoveFromPlay {
          eff.unregister()
        }
      };
      case HIDE_DARKNESS_ENERGY_185:
      return specialEnergy (this, [[]]) {
        text "As long as this card is attached to a Pokémon, it provides [D] Energy. The Retreat Cost of the [D] Pokémon this card is attached to is 0."
        def eff
        onPlay { reason->
          eff = getter (GET_RETREAT_COST, BEFORE_LAST, self) {h->
            if (self.types.contains(D)) {
              h.object = 0
            }
          }
        }
        getEnergyTypesOverride {
          return [[D] as Set]
        }
        onRemoveFromPlay {
          eff.unregister()
        }
      };
      case POWERFUL_COLORLESS_ENERGY_186:
      return specialEnergy (this, [[]]) {
        text "As long as this card is attached to a Pokémon, it provides [C] Energy. The attacks of the [C] Pokémon this card is attached to do 20 more damage to your opponent’s Active Pokémon."
        def eff
        onPlay { reason->
          eff = delayed {
            after PROCESS_ATTACK_EFFECTS, {
              bg.dm().each{
                if(it.from == self && it.to.active && it.to.owner != self.owner && self.types.contains(C) && it.dmg.value) {
                  bc "Powerful [C] Energy +20"
                  it.dmg += hp(20)
                }
              }
            }
          }
        }
        onRemoveFromPlay {
          eff.unregister()
        }
      };
      case CENTISKORCH_V_187:
      return copy (CENTISKORCH_V_35, this);
      case VIKAVOLT_V_188:
      return copy (VIKAVOLT_V_59, this);
      case GARDEVOIR_V_189:
      return copy (GARDEVOIR_V_71, this);
      case GALARIAN_STUNFISK_V_190:
      return copy (GALARIAN_STUNFISK_V_137, this);
      case KABU_191:
      return copy (KABU_171, this);
      case POKEMON_BREEDER_S_NURTURING_192:
      return copy (POKEMON_BREEDER_S_NURTURING_174, this);
        default:
      return null;
    }
  }
}