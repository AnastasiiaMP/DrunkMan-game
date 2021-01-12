package org.academiadecodigo.offstrings.drunkman.walls;

import org.academiadecodigo.offstrings.drunkman.grid.GridImpl;
import org.academiadecodigo.offstrings.drunkman.grid.position.Position;
import org.academiadecodigo.offstrings.drunkman.grid.position.PositionImpl;

public class WallsFactory {

    private static Wall[] walls;


    public static void getNewObject(GridImpl grid) {

        walls = new Wall[229];

        walls[0] = new Wall(grid.makeGridPosition(10,10));
        Position position = new PositionImpl(0,0, grid);
        walls[0].setPos(position);
        walls[1] = new Wall(grid.makeGridPosition(10,10));
        Position position1 = new PositionImpl (0,1, grid);
        walls[1].setPos(position1);
        walls[2] = new Wall(grid.makeGridPosition(10,10));
        Position position2 = new PositionImpl (0,2, grid);
        walls[2].setPos(position2);
        walls[3] = new Wall(grid.makeGridPosition(10,10));
        Position position3 = new PositionImpl (0,3, grid);
        walls[3].setPos(position3);
        walls[4] = new Wall(grid.makeGridPosition(10,10));
        Position position4 = new PositionImpl(0,4, grid);
        walls[4].setPos(position4);
        walls[5] = new Wall(grid.makeGridPosition(10,10));
        Position position5 = new PositionImpl (0,5, grid);
        walls[5].setPos(position5);
        walls[6] = new Wall(grid.makeGridPosition(10,10));
        Position position6 = new PositionImpl(0,6, grid);
        walls[6].setPos(position6);
        walls[7] = new Wall(grid.makeGridPosition(10,10));
        Position position7 = new PositionImpl(0,7, grid);
        walls[7].setPos(position7);
        walls[8] = new Wall(grid.makeGridPosition(10,10));
        Position position8 = new PositionImpl(0,8, grid);
        walls[8].setPos(position8);
        walls[9] = new Wall(grid.makeGridPosition(10,10));
        Position position9 = new PositionImpl(0,9, grid);
        walls[9].setPos(position9);
        walls[10] = new Wall(grid.makeGridPosition(10,10));
        Position position10 = new PositionImpl(0,10, grid);
        walls[10].setPos(position10);
        walls[11] = new Wall(grid.makeGridPosition(10,10));
        Position position11 = new PositionImpl(0,11, grid);
        walls[11].setPos(position11);
        walls[12] = new Wall(grid.makeGridPosition(10,10));
        Position position12 = new PositionImpl(0,12, grid);
        walls[12].setPos(position12);
        walls[13] = new Wall(grid.makeGridPosition(10,10));
        Position position13 = new PositionImpl(0,13, grid);
        walls[13].setPos(position13);
        walls[14] = new Wall(grid.makeGridPosition(10,10));
        Position position14 = new PositionImpl(0,14, grid);
        walls[14].setPos(position14);
        walls[15] = new Wall(grid.makeGridPosition(10,10));
        Position position15 = new PositionImpl(0,15, grid);
        walls[15].setPos(position15);
        walls[16] = new Wall(grid.makeGridPosition(10,10));
        Position position16 = new PositionImpl(0,16, grid);
        walls[16].setPos(position16);
        walls[17] = new Wall(grid.makeGridPosition(10,10));
        Position position17 = new PositionImpl(0,17, grid);
        walls[17].setPos(position17);
        walls[18] = new Wall(grid.makeGridPosition(10,10));
        Position position18 = new PositionImpl(0,18, grid);
        walls[18].setPos(position18);
        walls[19] = new Wall(grid.makeGridPosition(10,10));
        Position position19 = new PositionImpl(0,19, grid);
        walls[19].setPos(position19);
        walls[20] = new Wall(grid.makeGridPosition(10,10));
        Position position20 = new PositionImpl(0,20, grid);
        walls[20].setPos(position20);
        walls[21] = new Wall(grid.makeGridPosition(10,10));
        Position position21 = new PositionImpl(0,21, grid);
        walls[21].setPos(position21);
        walls[22] = new Wall(grid.makeGridPosition(10,10));
        Position position22 = new PositionImpl(0,22, grid);
        walls[22].setPos(position22);
        walls[23] = new Wall(grid.makeGridPosition(10,10));
        Position position23 = new PositionImpl(0,23, grid);
        walls[23].setPos(position23);
        walls[24] = new Wall(grid.makeGridPosition(10,10));
        Position position24 = new PositionImpl(0,24, grid);
        walls[24].setPos(position24);
        walls[25] = new Wall(grid.makeGridPosition(10,10));
        Position position25 = new PositionImpl(49,0, grid);
        walls[25].setPos(position25);
        walls[26] = new Wall(grid.makeGridPosition(10,10));
        Position position26 = new PositionImpl(49,1, grid);
        walls[26].setPos(position26);
        walls[27] = new Wall(grid.makeGridPosition(10,10));
        Position position27 = new PositionImpl(49,2, grid);
        walls[27].setPos(position27);
        walls[28] = new Wall(grid.makeGridPosition(10,10));
        Position position28 = new PositionImpl(49,3, grid);
        walls[28].setPos(position28);
        walls[29] = new Wall(grid.makeGridPosition(10,10));
        Position position29 = new PositionImpl(49,4, grid);
        walls[29].setPos(position29);
        walls[30] = new Wall(grid.makeGridPosition(10,10));
        Position position30 = new PositionImpl(49,5, grid);
        walls[30].setPos(position30);
        walls[31] = new Wall(grid.makeGridPosition(10,10));
        Position position31 = new PositionImpl(49,6, grid);
        walls[31].setPos(position31);
        walls[32] = new Wall(grid.makeGridPosition(10,10));
        Position position32 = new PositionImpl(49,7, grid);
        walls[32].setPos(position32);
        walls[33] = new Wall(grid.makeGridPosition(10,10));
        Position position33 = new PositionImpl(49,8, grid);
        walls[33].setPos(position33);
        walls[34] = new Wall(grid.makeGridPosition(10,10));
        Position position34 = new PositionImpl(49,9, grid);
        walls[34].setPos(position34);
        walls[35] = new Wall(grid.makeGridPosition(10,10));
        Position position35 = new PositionImpl(49,10, grid);
        walls[35].setPos(position35);
        walls[36] = new Wall(grid.makeGridPosition(10,10));
        Position position36 = new PositionImpl(49,11, grid);
        walls[36].setPos(position36);
        walls[37] = new Wall(grid.makeGridPosition(10,10));
        Position position37 = new PositionImpl(49,12, grid);
        walls[37].setPos(position37);
        walls[38] = new Wall(grid.makeGridPosition(10,10));
        Position position38 = new PositionImpl(49,13, grid);
        walls[38].setPos(position38);
        walls[39] = new Wall(grid.makeGridPosition(10,10));
        Position position39 = new PositionImpl(49,14, grid);
        walls[39].setPos(position39);
        walls[40] = new Wall(grid.makeGridPosition(10,10));
        Position position40 = new PositionImpl(49,15, grid);
        walls[40].setPos(position40);
        walls[41] = new Wall(grid.makeGridPosition(10,10));
        Position position41 = new PositionImpl(49,16, grid);
        walls[41].setPos(position41);
        walls[42] = new Wall(grid.makeGridPosition(10,10));
        Position position42 = new PositionImpl(49,17, grid);
        walls[42].setPos(position42);
        walls[43] = new Wall(grid.makeGridPosition(10,10));
        Position position43 = new PositionImpl(49,18, grid);
        walls[43].setPos(position43);
        walls[44] = new Wall(grid.makeGridPosition(10,10));
        Position position44 = new PositionImpl(49,19, grid);
        walls[44].setPos(position44);
        walls[45] = new Wall(grid.makeGridPosition(10,10));
        Position position45 = new PositionImpl(49,20, grid);
        walls[45].setPos(position45);
        walls[46] = new Wall(grid.makeGridPosition(10,10));
        Position position46 = new PositionImpl(49,21, grid);
        walls[46].setPos(position46);
        walls[47] = new Wall(grid.makeGridPosition(10,10));
        Position position47 = new PositionImpl(49,22, grid);
        walls[47].setPos(position47);
        walls[48] = new Wall(grid.makeGridPosition(10,10));
        Position position48 = new PositionImpl(49,23, grid);
        walls[48].setPos(position48);
        walls[49] = new Wall(grid.makeGridPosition(10,10));
        Position position49 = new PositionImpl(49,24, grid);
        walls[49].setPos(position49);
        walls[50] = new Wall(grid.makeGridPosition(10,10));
        Position position50 = new PositionImpl(0,0, grid);
        walls[50].setPos(position50);
        walls[51] = new Wall(grid.makeGridPosition(10,10));
        Position position51 = new PositionImpl(1,0, grid);
        walls[51].setPos(position51);
        walls[52] = new Wall(grid.makeGridPosition(10,10));
        Position position52 = new PositionImpl(2,0, grid);
        walls[52].setPos(position52);
        walls[53] = new Wall(grid.makeGridPosition(10,10));
        Position position53 = new PositionImpl(3,0, grid);
        walls[53].setPos(position53);
        walls[54] = new Wall(grid.makeGridPosition(10,10));
        Position position54 = new PositionImpl(4,0, grid);
        walls[54].setPos(position54);
        walls[55] = new Wall(grid.makeGridPosition(10,10));
        Position position55 = new PositionImpl(5,0, grid);
        walls[55].setPos(position55);
        walls[56] = new Wall(grid.makeGridPosition(10,10));
        Position position56 = new PositionImpl(6,0, grid);
        walls[56].setPos(position56);
        walls[57] = new Wall(grid.makeGridPosition(10,10));
        Position position57 = new PositionImpl(7,0, grid);
        walls[57].setPos(position57);
        walls[58] = new Wall(grid.makeGridPosition(10,10));
        Position position58 = new PositionImpl(8,0, grid);
        walls[58].setPos(position58);
        walls[59] = new Wall(grid.makeGridPosition(10,10));
        Position position59 = new PositionImpl(9,0, grid);
        walls[59].setPos(position59);
        walls[60] = new Wall(grid.makeGridPosition(10,10));
        Position position60 = new PositionImpl(10,0, grid);
        walls[60].setPos(position60);
        walls[61] = new Wall(grid.makeGridPosition(10,10));
        Position position61 = new PositionImpl(11,0, grid);
        walls[61].setPos(position61);
        walls[62] = new Wall(grid.makeGridPosition(10,10));
        Position position62 = new PositionImpl(12,0, grid);
        walls[62].setPos(position62);
        walls[63] = new Wall(grid.makeGridPosition(10,10));
        Position position63 = new PositionImpl(13,0, grid);
        walls[63].setPos(position63);
        walls[64] = new Wall(grid.makeGridPosition(10,10));
        Position position64 = new PositionImpl(14,0, grid);
        walls[64].setPos(position64);
        walls[65] = new Wall(grid.makeGridPosition(10,10));
        Position position65 = new PositionImpl(15,0, grid);
        walls[65].setPos(position65);
        walls[66] = new Wall(grid.makeGridPosition(10,10));
        Position position66 = new PositionImpl(16,0, grid);
        walls[66].setPos(position66);
        walls[67] = new Wall(grid.makeGridPosition(10,10));
        Position position67 = new PositionImpl(17,0, grid);
        walls[67].setPos(position67);
        walls[68] = new Wall(grid.makeGridPosition(10,10));
        Position position68 = new PositionImpl(18,0, grid);
        walls[68].setPos(position68);
        walls[69] = new Wall(grid.makeGridPosition(10,10));
        Position position69 = new PositionImpl(19,0, grid);
        walls[69].setPos(position69);
        walls[70] = new Wall(grid.makeGridPosition(10,10));
        Position position70 = new PositionImpl(20,0, grid);
        walls[70].setPos(position70);
        walls[71] = new Wall(grid.makeGridPosition(10,10));
        Position position71= new PositionImpl(21,0, grid);
        walls[71].setPos(position71);
        walls[72] = new Wall(grid.makeGridPosition(10,10));
        Position position72 = new PositionImpl(22,0, grid);
        walls[72].setPos(position72);
        walls[73] = new Wall(grid.makeGridPosition(10,10));
        Position position73 = new PositionImpl(23,0, grid);
        walls[73].setPos(position73);
        walls[74] = new Wall(grid.makeGridPosition(10,10));
        Position position74 = new PositionImpl(24,0, grid);
        walls[74].setPos(position74);
        walls[75] = new Wall(grid.makeGridPosition(10,10));
        Position position75 = new PositionImpl(25,0, grid);
        walls[75].setPos(position75);
        walls[76] = new Wall(grid.makeGridPosition(10,10));
        Position position76 = new PositionImpl(26,0, grid);
        walls[76].setPos(position76);
        walls[77] = new Wall(grid.makeGridPosition(10,10));
        Position position77 = new PositionImpl(27,0, grid);
        walls[77].setPos(position77);
        walls[78] = new Wall(grid.makeGridPosition(10,10));
        Position position78 = new PositionImpl(28,0, grid);
        walls[78].setPos(position78);
        walls[79] = new Wall(grid.makeGridPosition(10,10));
        Position position79 = new PositionImpl(29,0, grid);
        walls[79].setPos(position79);
        walls[80] = new Wall(grid.makeGridPosition(10,10));
        Position position80 = new PositionImpl(30,0, grid);
        walls[80].setPos(position80);
        walls[81] = new Wall(grid.makeGridPosition(10,10));
        Position position81 = new PositionImpl(31,0, grid);
        walls[81].setPos(position81);
        walls[82] = new Wall(grid.makeGridPosition(10,10));
        Position position82 = new PositionImpl(32,0, grid);
        walls[82].setPos(position82);
        walls[83] = new Wall(grid.makeGridPosition(10,10));
        Position position83 = new PositionImpl(33,0, grid);
        walls[83].setPos(position83);
        walls[84] = new Wall(grid.makeGridPosition(10,10));
        Position position84 = new PositionImpl(34,0, grid);
        walls[84].setPos(position84);
        walls[85] = new Wall(grid.makeGridPosition(10,10));
        Position position85 = new PositionImpl(35,0, grid);
        walls[85].setPos(position85);
        walls[86] = new Wall(grid.makeGridPosition(10,10));
        Position position86 = new PositionImpl(36,0, grid);
        walls[86].setPos(position86);
        walls[87] = new Wall(grid.makeGridPosition(10,10));
        Position position87 = new PositionImpl(37,0, grid);
        walls[87].setPos(position87);
        walls[88] = new Wall(grid.makeGridPosition(10,10));
        Position position88 = new PositionImpl(38,0, grid);
        walls[88].setPos(position88);
        walls[89] = new Wall(grid.makeGridPosition(10,10));
        Position position89 = new PositionImpl(39,0, grid);
        walls[89].setPos(position89);
        walls[90] = new Wall(grid.makeGridPosition(10,10));
        Position position90 = new PositionImpl(40,0, grid);
        walls[90].setPos(position90);
        walls[91] = new Wall(grid.makeGridPosition(10,10));
        Position position91 = new PositionImpl(41,0, grid);
        walls[91].setPos(position91);
        walls[92] = new Wall(grid.makeGridPosition(10,10));
        Position position92 = new PositionImpl(42,0, grid);
        walls[92].setPos(position92);
        walls[93] = new Wall(grid.makeGridPosition(10,10));
        Position position93 = new PositionImpl(43,0, grid);
        walls[93].setPos(position93);
        walls[94] = new Wall(grid.makeGridPosition(10,10));
        Position position94 = new PositionImpl(44,0, grid);
        walls[94].setPos(position94);
        walls[95] = new Wall(grid.makeGridPosition(10,10));
        Position position95 = new PositionImpl(45,0, grid);
        walls[95].setPos(position95);
        walls[96] = new Wall(grid.makeGridPosition(10,10));
        Position position96 = new PositionImpl(46,0, grid);
        walls[96].setPos(position96);
        walls[97] = new Wall(grid.makeGridPosition(10,10));
        Position position97 = new PositionImpl(47,0, grid);
        walls[97].setPos(position97);
        walls[98] = new Wall(grid.makeGridPosition(10,10));
        Position position98 = new PositionImpl(48,0, grid);
        walls[98].setPos(position98);
        walls[99] = new Wall(grid.makeGridPosition(10,10));
        Position position99 = new PositionImpl(49,0, grid);
        walls[99].setPos(position99);
        walls[100] = new Wall(grid.makeGridPosition(10,10));
        Position position100 = new PositionImpl(0,24, grid);
        walls[100].setPos(position100);
        walls[101] = new Wall(grid.makeGridPosition(10,10));
        Position position101 = new PositionImpl(1,24, grid);
        walls[101].setPos(position101);
        walls[102] = new Wall(grid.makeGridPosition(10,10));
        Position position102 = new PositionImpl(2,24, grid);
        walls[102].setPos(position102);
        walls[103] = new Wall(grid.makeGridPosition(10,10));
        Position position103 = new PositionImpl(3,24, grid);
        walls[103].setPos(position103);
        walls[104] = new Wall(grid.makeGridPosition(10,10));
        Position position104 = new PositionImpl(4,24, grid);
        walls[104].setPos(position104);
        walls[105] = new Wall(grid.makeGridPosition(10,10));
        Position position105 = new PositionImpl(5,24, grid);
        walls[105].setPos(position105);
        walls[106] = new Wall(grid.makeGridPosition(10,10));
        Position position106 = new PositionImpl(6,24, grid);
        walls[106].setPos(position106);
        walls[107] = new Wall(grid.makeGridPosition(10,10));
        Position position107 = new PositionImpl(7,24, grid);
        walls[107].setPos(position107);
        walls[108] = new Wall(grid.makeGridPosition(10,10));
        Position position108 = new PositionImpl(8,24, grid);
        walls[108].setPos(position108);
        walls[109] = new Wall(grid.makeGridPosition(10,10));
        Position position109 = new PositionImpl(9,24, grid);
        walls[109].setPos(position109);
        walls[110] = new Wall(grid.makeGridPosition(10,10));
        Position position110 = new PositionImpl(10,24, grid);
        walls[110].setPos(position110);
        walls[111] = new Wall(grid.makeGridPosition(10,10));
        Position position111 = new PositionImpl(11,24, grid);
        walls[111].setPos(position111);
        walls[112] = new Wall(grid.makeGridPosition(10,10));
        Position position112 = new PositionImpl(12,24, grid);
        walls[112].setPos(position112);
        walls[113] = new Wall(grid.makeGridPosition(10,10));
        Position position113 = new PositionImpl(13,24, grid);
        walls[113].setPos(position113);
        walls[114] = new Wall(grid.makeGridPosition(10,10));
        Position position114 = new PositionImpl(14,24, grid);
        walls[114].setPos(position114);
        walls[115] = new Wall(grid.makeGridPosition(10,10));
        Position position115 = new PositionImpl(15,24, grid);
        walls[115].setPos(position115);
        walls[116] = new Wall(grid.makeGridPosition(10,10));
        Position position116 = new PositionImpl(16,24, grid);
        walls[116].setPos(position116);
        walls[117] = new Wall(grid.makeGridPosition(10,10));
        Position position117 = new PositionImpl(17,24, grid);
        walls[117].setPos(position117);
        walls[118] = new Wall(grid.makeGridPosition(10,10));
        Position position118 = new PositionImpl(18,24, grid);
        walls[118].setPos(position118);
        walls[119] = new Wall(grid.makeGridPosition(10,10));
        Position position119 = new PositionImpl(19,24, grid);
        walls[119].setPos(position119);
        walls[120] = new Wall(grid.makeGridPosition(10,10));
        Position position120 = new PositionImpl(20,24, grid);
        walls[120].setPos(position120);
        walls[121] = new Wall(grid.makeGridPosition(10,10));
        Position position121= new PositionImpl(21,24, grid);
        walls[121].setPos(position121);
        walls[122] = new Wall(grid.makeGridPosition(10,10));
        Position position122 = new PositionImpl(22,24, grid);
        walls[122].setPos(position122);
        walls[123] = new Wall(grid.makeGridPosition(10,10));
        Position position123 = new PositionImpl(23,24, grid);
        walls[123].setPos(position123);
        walls[124] = new Wall(grid.makeGridPosition(10,10));
        Position position124 = new PositionImpl(24,24, grid);
        walls[124].setPos(position124);
        walls[125] = new Wall(grid.makeGridPosition(10,10));
        Position position125 = new PositionImpl(25,24, grid);
        walls[125].setPos(position125);
        walls[126] = new Wall(grid.makeGridPosition(10,10));
        Position position126 = new PositionImpl(26,24, grid);
        walls[126].setPos(position126);
        walls[127] = new Wall(grid.makeGridPosition(10,10));
        Position position127 = new PositionImpl(27,24, grid);
        walls[127].setPos(position127);
        walls[128] = new Wall(grid.makeGridPosition(10,10));
        Position position128 = new PositionImpl(28,24, grid);
        walls[128].setPos(position128);
        walls[129] = new Wall(grid.makeGridPosition(10,10));
        Position position129 = new PositionImpl(29,24, grid);
        walls[129].setPos(position129);
        walls[130] = new Wall(grid.makeGridPosition(10,10));
        Position position130 = new PositionImpl(30,24, grid);
        walls[130].setPos(position130);
        walls[131] = new Wall(grid.makeGridPosition(10,10));
        Position position131 = new PositionImpl(31,24, grid);
        walls[131].setPos(position131);
        walls[132] = new Wall(grid.makeGridPosition(10,10));
        Position position132 = new PositionImpl(32,24, grid);
        walls[132].setPos(position132);
        walls[133] = new Wall(grid.makeGridPosition(10,10));
        Position position133 = new PositionImpl(33,24, grid);
        walls[133].setPos(position133);
        walls[134] = new Wall(grid.makeGridPosition(10,10));
        Position position134 = new PositionImpl(34,24, grid);
        walls[134].setPos(position134);
        walls[135] = new Wall(grid.makeGridPosition(10,10));
        Position position135 = new PositionImpl(35,24, grid);
        walls[135].setPos(position135);
        walls[136] = new Wall(grid.makeGridPosition(10,10));
        Position position136 = new PositionImpl(36,24, grid);
        walls[136].setPos(position136);
        walls[137] = new Wall(grid.makeGridPosition(10,10));
        Position position137 = new PositionImpl(37,24, grid);
        walls[137].setPos(position137);
        walls[138] = new Wall(grid.makeGridPosition(10,10));
        Position position138 = new PositionImpl(38,24, grid);
        walls[138].setPos(position138);
        walls[139] = new Wall(grid.makeGridPosition(10,10));
        Position position139 = new PositionImpl(39,24, grid);
        walls[139].setPos(position139);
        walls[140] = new Wall(grid.makeGridPosition(10,10));
        Position position140 = new PositionImpl(40,24, grid);
        walls[140].setPos(position140);
        walls[141] = new Wall(grid.makeGridPosition(10,10));
        Position position141 = new PositionImpl(41,24, grid);
        walls[141].setPos(position141);
        walls[142] = new Wall(grid.makeGridPosition(10,10));
        Position position142 = new PositionImpl(42,24, grid);
        walls[142].setPos(position142);
        walls[143] = new Wall(grid.makeGridPosition(10,10));
        Position position143 = new PositionImpl(43,24, grid);
        walls[143].setPos(position143);
        walls[144] = new Wall(grid.makeGridPosition(10,10));
        Position position144 = new PositionImpl(44,24, grid);
        walls[144].setPos(position144);
        walls[145] = new Wall(grid.makeGridPosition(10,10));
        Position position145 = new PositionImpl(45,24, grid);
        walls[145].setPos(position145);
        walls[146] = new Wall(grid.makeGridPosition(10,10));
        Position position146 = new PositionImpl(46,24, grid);
        walls[146].setPos(position146);
        walls[147] = new Wall(grid.makeGridPosition(10,10));
        Position position147 = new PositionImpl(47,24, grid);
        walls[147].setPos(position147);
        walls[148] = new Wall(grid.makeGridPosition(10,10));
        Position position148 = new PositionImpl(48,24, grid);
        walls[148].setPos(position148);
        walls[149] = new Wall(grid.makeGridPosition(10,10));
        Position position149 = new PositionImpl(49,24, grid);
        walls[149].setPos(position149);
        walls[150] = new Wall(grid.makeGridPosition(10,10));
        Position position150 = new PositionImpl(8,2, grid);
        walls[150].setPos(position150);
        walls[151] = new Wall(grid.makeGridPosition(10,10));
        Position position151 = new PositionImpl(8,3, grid);
        walls[151].setPos(position151);
        walls[152] = new Wall(grid.makeGridPosition(10,10));
        Position position152 = new PositionImpl(8,4, grid);
        walls[152].setPos(position152);
        walls[153] = new Wall(grid.makeGridPosition(10,10));
        Position position153 = new PositionImpl(8,5, grid);
        walls[153].setPos(position153);
        walls[154] = new Wall(grid.makeGridPosition(10,10));
        Position position154 = new PositionImpl(8,1, grid);
        walls[154].setPos(position154);
        walls[155] = new Wall(grid.makeGridPosition(10,10));
        Position position155 = new PositionImpl(23,7, grid);
        walls[155].setPos(position155);
        walls[156] = new Wall(grid.makeGridPosition(10,10));
        Position position156 = new PositionImpl(23,8, grid);
        walls[156].setPos(position156);
        walls[157] = new Wall(grid.makeGridPosition(10,10));
        Position position157 = new PositionImpl(23,9, grid);
        walls[157].setPos(position157);
        walls[158] = new Wall(grid.makeGridPosition(10,10));
        Position position158 = new PositionImpl(23,10, grid);
        walls[158].setPos(position158);
        walls[159] = new Wall(grid.makeGridPosition(10,10));
        Position position159 = new PositionImpl(23,11, grid);
        walls[159].setPos(position159);
        walls[160] = new Wall(grid.makeGridPosition(10,10));
        Position position160 = new PositionImpl(23,12, grid);
        walls[160].setPos(position160);
        walls[161] = new Wall(grid.makeGridPosition(10,10));
        Position position161 = new PositionImpl(3,20, grid);
        walls[161].setPos(position161);
        walls[162] = new Wall(grid.makeGridPosition(10,10));
        Position position162 = new PositionImpl(4,20, grid);
        walls[162].setPos(position162);
        walls[163] = new Wall(grid.makeGridPosition(10,10));
        Position position163 = new PositionImpl(5,20, grid);
        walls[163].setPos(position163);
        walls[164] = new Wall(grid.makeGridPosition(10,10));
        Position position164 = new PositionImpl(6,20, grid);
        walls[164].setPos(position164);
        walls[165] = new Wall(grid.makeGridPosition(10,10));
        Position position165 = new PositionImpl(7,20, grid);
        walls[165].setPos(position165);
        walls[166] = new Wall(grid.makeGridPosition(10,10));
        Position position166 = new PositionImpl(26,19, grid);
        walls[166].setPos(position166);
        walls[167] = new Wall(grid.makeGridPosition(10,10));
        Position position167 = new PositionImpl(25,19, grid);
        walls[167].setPos(position167);
        walls[168] = new Wall(grid.makeGridPosition(10,10));
        Position position168 = new PositionImpl(24,19, grid);
        walls[168].setPos(position168);
        walls[169] = new Wall(grid.makeGridPosition(10,10));
        Position position169 = new PositionImpl(27,19, grid);
        walls[169].setPos(position169);
        walls[170] = new Wall(grid.makeGridPosition(10,10));
        Position position170 = new PositionImpl(22,19, grid);
        walls[170].setPos(position170);
        walls[171] = new Wall(grid.makeGridPosition(10,10));
        Position position171 = new PositionImpl(2,20, grid);
        walls[171].setPos(position171);
        walls[172] = new Wall(grid.makeGridPosition(10,10));
        Position position172 = new PositionImpl(1,20, grid);
        walls[172].setPos(position172);
        walls[173] = new Wall(grid.makeGridPosition(10,10));
        Position position173 = new PositionImpl(30,6, grid);
        walls[173].setPos(position173);
        walls[174] = new Wall(grid.makeGridPosition(10,10));
        Position position174 = new PositionImpl(31,6, grid);
        walls[174].setPos(position174);
        walls[175] = new Wall(grid.makeGridPosition(10,10));
        Position position175 = new PositionImpl(32,6, grid);
        walls[175].setPos(position175);
        walls[176] = new Wall(grid.makeGridPosition(10,10));
        Position position176 = new PositionImpl(33,6, grid);
        walls[176].setPos(position176);
        walls[177] = new Wall(grid.makeGridPosition(10,10));
        Position position177 = new PositionImpl(34,6, grid);
        walls[177].setPos(position177);
        walls[178] = new Wall(grid.makeGridPosition(10,10));
        Position position178 = new PositionImpl(35,6, grid);
        walls[178].setPos(position178);
        walls[179] = new Wall(grid.makeGridPosition(10,10));
        Position position179 = new PositionImpl(44,18, grid);
        walls[179].setPos(position179);
        walls[180] = new Wall(grid.makeGridPosition(10,10));
        Position position180 = new PositionImpl(49,18, grid);
        walls[180].setPos(position180);
        walls[181] = new Wall(grid.makeGridPosition(10,10));
        Position position181 = new PositionImpl(48,18, grid);
        walls[181].setPos(position181);
        walls[182] = new Wall(grid.makeGridPosition(10,10));
        Position position182 = new PositionImpl(47,18, grid);
        walls[182].setPos(position182);
        walls[183] = new Wall(grid.makeGridPosition(10,10));
        Position position183 = new PositionImpl(46,18, grid);
        walls[183].setPos(position183);
        walls[184] = new Wall(grid.makeGridPosition(10,10));
        Position position184 = new PositionImpl(45,18, grid);
        walls[184].setPos(position184);
        walls[185] = new Wall(grid.makeGridPosition(10,10));
        Position position185 = new PositionImpl(49,20, grid);
        walls[185].setPos(position185);
        walls[186] = new Wall(grid.makeGridPosition(10,10));
        Position position186 = new PositionImpl(1,20, grid);
        walls[186].setPos(position186);
        walls[187] = new Wall(grid.makeGridPosition(10,10));
        Position position187 = new PositionImpl(30,6, grid);
        walls[187].setPos(position187);
        walls[188] = new Wall(grid.makeGridPosition(10,10));
        Position position188 = new PositionImpl(31,6, grid);
        walls[188].setPos(position188);
        walls[189] = new Wall(grid.makeGridPosition(10,10));
        Position position189 = new PositionImpl(32,6, grid);
        walls[189].setPos(position189);
        walls[190] = new Wall(grid.makeGridPosition(10,10));
        Position position190 = new PositionImpl(33,6, grid);
        walls[190].setPos(position190);
        walls[191] = new Wall(grid.makeGridPosition(10,10));
        Position position191 = new PositionImpl(34,6, grid);
        walls[191].setPos(position191);
        walls[192] = new Wall(grid.makeGridPosition(10,10));
        Position position192 = new PositionImpl(35,6, grid);
        walls[192].setPos(position192);
        walls[193] = new Wall(grid.makeGridPosition(10,10));
        Position position193 = new PositionImpl(44,18, grid);
        walls[193].setPos(position193);
        walls[194] = new Wall(grid.makeGridPosition(10,10));
        Position position194 = new PositionImpl(49,18, grid);
        walls[194].setPos(position194);
        walls[195] = new Wall(grid.makeGridPosition(10,10));
        Position position195 = new PositionImpl(48,18, grid);
        walls[195].setPos(position195);
        walls[196] = new Wall(grid.makeGridPosition(10,10));
        Position position196 = new PositionImpl(47,18, grid);
        walls[196].setPos(position196);
        walls[197] = new Wall(grid.makeGridPosition(10,10));
        Position position197 = new PositionImpl(46,18, grid);
        walls[197].setPos(position197);
        walls[198] = new Wall(grid.makeGridPosition(10,10));
        Position position198 = new PositionImpl(45,18, grid);
        walls[198].setPos(position198);
        walls[199] = new Wall(grid.makeGridPosition(10,10));
        Position position199 = new PositionImpl(49,6, grid);
        walls[199].setPos(position199);
        walls[200] = new Wall(grid.makeGridPosition(10,10));
        Position position200 = new PositionImpl(49,5, grid);
        walls[200].setPos(position200);
        walls[201] = new Wall(grid.makeGridPosition(10,10));
        Position position201 = new PositionImpl(49,4, grid);
        walls[201].setPos(position201);
        walls[202] = new Wall(grid.makeGridPosition(10,10));
        Position position202 = new PositionImpl(49,3, grid);
        walls[202].setPos(position202);
        walls[203] = new Wall(grid.makeGridPosition(10,10));
        Position position203 = new PositionImpl(49,21, grid);
        walls[203].setPos(position203);
        walls[204] = new Wall(grid.makeGridPosition(10,10));
        Position position204 = new PositionImpl(41,22, grid);
        walls[204].setPos(position204);
        walls[205] = new Wall(grid.makeGridPosition(10,10));
        Position position205 = new PositionImpl(41,23, grid);
        walls[205].setPos(position205);
        walls[206] = new Wall(grid.makeGridPosition(10,10));
        Position position206 = new PositionImpl(5,13, grid);
        walls[206].setPos(position206);
        walls[207] = new Wall(grid.makeGridPosition(10,10));
        Position position207 = new PositionImpl(5,12, grid);
        walls[207].setPos(position207);
        walls[208] = new Wall(grid.makeGridPosition(10,10));
        Position position208 = new PositionImpl(5,11, grid);
        walls[208].setPos(position208);
        walls[209] = new Wall(grid.makeGridPosition(10,10));
        Position position209 = new PositionImpl(5,10, grid);
        walls[209].setPos(position209);
        walls[210] = new Wall(grid.makeGridPosition(10,10));
        Position position210 = new PositionImpl(5,14, grid);
        walls[210].setPos(position210);
        walls[211] = new Wall(grid.makeGridPosition(10,10));
        Position position211 = new PositionImpl(5,15, grid);
        walls[211].setPos(position211);
        walls[212] = new Wall(grid.makeGridPosition(10,10));
        Position position212 = new PositionImpl(49,5, grid);
        walls[212].setPos(position212);
        walls[213] = new Wall(grid.makeGridPosition(10,10));
        Position position213 = new PositionImpl(49,4, grid);
        walls[213].setPos(position213);
        walls[214] = new Wall(grid.makeGridPosition(10,10));
        Position position214 = new PositionImpl(49,3, grid);
        walls[214].setPos(position214);
        walls[215] = new Wall(grid.makeGridPosition(10,10));
        Position position215 = new PositionImpl(49,6, grid);
        walls[215].setPos(position215);
        walls[216] = new Wall(grid.makeGridPosition(10,10));
        Position position216 = new PositionImpl(41,20, grid);
        walls[216].setPos(position216);
        walls[217] = new Wall(grid.makeGridPosition(10,10));
        Position position217 = new PositionImpl(41,21, grid);
        walls[217].setPos(position217);
        walls[218] = new Wall(grid.makeGridPosition(10,10));
        Position position218 = new PositionImpl(41,22, grid);
        walls[218].setPos(position218);
        walls[219] = new Wall(grid.makeGridPosition(10,10));
        Position position219 = new PositionImpl(41,23, grid);
        walls[219].setPos(position219);
        walls[220] = new Wall(grid.makeGridPosition(10,10));
        Position position220 = new PositionImpl(44,10, grid);
        walls[220].setPos(position220);
        walls[221] = new Wall(grid.makeGridPosition(10,10));
        Position position221 = new PositionImpl(44,11, grid);
        walls[221].setPos(position221);
        walls[222] = new Wall(grid.makeGridPosition(10,10));
        Position position222 = new PositionImpl(44,12, grid);
        walls[222].setPos(position222);
        walls[223] = new Wall(grid.makeGridPosition(10,10));
        Position position223 = new PositionImpl(19,13, grid);
        walls[223].setPos(position223);
        walls[224] = new Wall(grid.makeGridPosition(10,10));
        Position position224 = new PositionImpl(18,13, grid);
        walls[224].setPos(position224);
        walls[225] = new Wall(grid.makeGridPosition(10,10));
        Position position225 = new PositionImpl(17,13, grid);
        walls[225].setPos(position225);
        walls[226] = new Wall(grid.makeGridPosition(10,10));
        Position position226 = new PositionImpl(16,13, grid);
        walls[226].setPos(position226);
        walls[227] = new Wall(grid.makeGridPosition(10,10));
        Position position227 = new PositionImpl(15,13, grid);
        walls[227].setPos(position227);
        walls[228] = new Wall(grid.makeGridPosition(10,10));
        Position position228 = new PositionImpl(14,13, grid);
        walls[228].setPos(position228);

    }

    public static Wall[] getWalls() {
        return walls;
    }

}
