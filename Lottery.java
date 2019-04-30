package com.zw.jincheng;

/**
 * @author wang qiang
 * @description
 * @date 15:36 2019/4/30
 **/
public class Lottery {
    private static void superLotto() {
        String[] luckyNumber =  new String[]{"06", "10", "16", "29", "33",   "05", "11"};
        String[] myNumber =     new String[]{"06", "11", "13", "32", "35",   "02", "10"};

        superLottoFunc(myNumber,luckyNumber);
    }
    private static void doubleColorBall() {
        String[] luckyNumber =  new String[]{"03", "07", "10", "12", "18", "29",   "10"};
        String[] myNumber =     new String[]{"19", "19", "19", "19", "19", "19",   "10"};

        doubleColorBallFunc(myNumber,luckyNumber);
    }

    public static void main(String[] args) throws Exception {
        superLotto();
        doubleColorBall();
        Thread.sleep(1000L);
        System.exit(0);
    }


    private static void superLottoFunc(String[] myNumber, String[] luckyNumber) {
        String[] myFrontNumber = new String[5];
        String[] luckyFrontNumber = new String[5];
        for(int i = 0; i < 5; i++) {
            myFrontNumber[i] = myNumber[i];
            luckyFrontNumber[i] = luckyNumber[i];
        }

        String[] myBackNumber = new String[2];
        String[] luckyBackNumber = new String[2];
        for(int i = 0; i < 2; i++) {
            myBackNumber[i] = myNumber[i+5];
            luckyBackNumber[i] = luckyNumber[i+5];
        }

        int frontMatchCount = 0;
        int backMatchCount = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (myFrontNumber[i].equals(luckyFrontNumber[j])) {
                    frontMatchCount++;
                }
            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                if (myBackNumber[i].equals(luckyBackNumber[j])) {
                    backMatchCount++;
                }
            }
        }

        String level = THANKS;
        String award = SUPER_LOTTO_THANKS_AWARD;

        if ((0 == frontMatchCount && 2 == backMatchCount) || (1 == frontMatchCount && 2 == backMatchCount)
                || (2 == frontMatchCount && 1 == backMatchCount) || (3 == frontMatchCount && 0 == backMatchCount)) {
            level = NINTH;
            award = SUPER_LOTTO_NINTH_AWARD;
        }
        if ((3 == frontMatchCount && 1 == backMatchCount) || (2 == frontMatchCount && 2 == backMatchCount)) {
            level = EIGHTH;
            award = SUPER_LOTTO_EIGHTH_AWARD;
        }
        if (4 == frontMatchCount && 0 == backMatchCount) {
            level = SEVENTH;
            award = SUPER_LOTTO_SEVENTH_AWARD;
        }
        if (3 == frontMatchCount && 2 == backMatchCount) {
            level = SIXTH;
            award = SUPER_LOTTO_SIXTH_AWARD;
        }
        if (4 == frontMatchCount && 1 == backMatchCount) {
            level = FIFTH;
            award = SUPER_LOTTO_FIFTH_AWARD;
        }
        if (4 == frontMatchCount && 2 == backMatchCount) {
            level = FORTH;
            award = SUPER_LOTTO_FORTH_AWARD;
        }
        if (5 == frontMatchCount && 0 == backMatchCount) {
            level = THIRD;
            award = SUPER_LOTTO_THIRD_AWARD;
        }
        if (5 == frontMatchCount && 1 == backMatchCount) {
            level = SECOND;
            award = SUPER_LOTTO_SECOND_AWARD;
        }
        if (5 == frontMatchCount && 2 == backMatchCount) {
            level = FIRST;
            award = SUPER_LOTTO_FIRST_AWARD;
        }

        System.out.println("大乐透");
        System.out.print("本期中奖号码: ");
        for (String s : luckyNumber) {
            System.out.print(" " + s);
        }
        System.out.println();
        System.out.print("我自己的号码: ");
        for (String s : myNumber) {
            System.out.print(" " + s);
        }
        System.out.print("    " + frontMatchCount + "+" + backMatchCount);
        System.out.println("    " + level + "    " + award);
    }

    private static void doubleColorBallFunc(String[] myNumber, String[] luckyNumber) {
        String[] myFrontNumber = new String[6];
        String[] luckyFrontNumber = new String[6];
        for(int i = 0; i < 6; i++) {
            myFrontNumber[i] = myNumber[i];
            luckyFrontNumber[i] = luckyNumber[i];
        }

        String myBackNumber = myNumber[6];
        String luckyBackNumber = luckyNumber[6];


        int frontMatchCount = 0;
        int backMatchCount = 0;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (myFrontNumber[i].equals(luckyFrontNumber[j])) {
                    frontMatchCount++;
                }
            }
        }

        if (myBackNumber.equals(luckyBackNumber)) {
            backMatchCount++;
        }

        String level = THANKS;
        String award = DOUBLE_COLOR_BALL_THANKS_AWARD;

        if ((2 == frontMatchCount && 1 == backMatchCount) || (1 == frontMatchCount && 1 == backMatchCount) || (0 == frontMatchCount && 1 == backMatchCount)) {
            level = SIXTH;
            award = DOUBLE_COLOR_BALL_SIXTH_AWARD;
        }
        if ((4 == frontMatchCount && 0 == backMatchCount) || (3 == frontMatchCount && 1 == backMatchCount)) {
            level = FIFTH;
            award = DOUBLE_COLOR_BALL_FIFTH_AWARD;
        }
        if ((5 == frontMatchCount && 0 == backMatchCount) || (4 == frontMatchCount && 1 == backMatchCount)) {
            level = FORTH;
            award = DOUBLE_COLOR_BALL_FORTH_AWARD;
        }

        if (5 == frontMatchCount && 1 == backMatchCount) {
            level = THIRD;
            award = DOUBLE_COLOR_BALL_THIRD_AWARD;
        }
        if (6 == frontMatchCount && 0 == backMatchCount) {
            level = SECOND;
            award = DOUBLE_COLOR_BALL_SECOND_AWARD;
        }
        if (6 == frontMatchCount && 1 == backMatchCount) {
            level = FIRST;
            award = DOUBLE_COLOR_BALL_FIRST_AWARD;
        }

        System.out.println("双色球");
        System.out.print("本期中奖号码: ");
        for (String s : luckyNumber) {
            System.out.print(" " + s);
        }
        System.out.println();
        System.out.print("我自己的号码: ");
        for (String s : myNumber) {
            System.out.print(" " + s);
        }
        System.out.print("    " + frontMatchCount + "+" + backMatchCount);
        System.out.println("    " + level + "    " + award);
    }

    private static final String FIRST = "一等奖";
    private static final String SECOND = "二等奖";
    private static final String THIRD = "三等奖";
    private static final String FORTH = "四等奖";
    private static final String FIFTH = "五等奖";
    private static final String SIXTH = "六等奖";
    private static final String SEVENTH = "七等奖";
    private static final String EIGHTH = "八等奖";
    private static final String NINTH = "九等奖";
    private static final String THANKS = "谢谢参与";

    private static final String SUPER_LOTTO_FIRST_AWARD = "??????";
    private static final String SUPER_LOTTO_SECOND_AWARD = "???";
    private static final String SUPER_LOTTO_THIRD_AWARD = "10000";
    private static final String SUPER_LOTTO_FORTH_AWARD = "3000";
    private static final String SUPER_LOTTO_FIFTH_AWARD = "300";
    private static final String SUPER_LOTTO_SIXTH_AWARD = "200";
    private static final String SUPER_LOTTO_SEVENTH_AWARD = "100";
    private static final String SUPER_LOTTO_EIGHTH_AWARD = "15";
    private static final String SUPER_LOTTO_NINTH_AWARD = "5";
    private static final String SUPER_LOTTO_THANKS_AWARD = "0";

    private static final String DOUBLE_COLOR_BALL_FIRST_AWARD = "??????";
    private static final String DOUBLE_COLOR_BALL_SECOND_AWARD = "???";
    private static final String DOUBLE_COLOR_BALL_THIRD_AWARD = "3000";
    private static final String DOUBLE_COLOR_BALL_FORTH_AWARD = "200";
    private static final String DOUBLE_COLOR_BALL_FIFTH_AWARD = "10";
    private static final String DOUBLE_COLOR_BALL_SIXTH_AWARD = "5";
    private static final String DOUBLE_COLOR_BALL_THANKS_AWARD = "0";
}
