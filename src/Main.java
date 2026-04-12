import java.util.Scanner;
import java.util.Random;

import static java.lang.Thread.sleep;

public class Main {
    public static void main(String[] args) {
        String RED = "\u001B[31m";
        String GREEN = "\u001B[32m";
        String YELLOW = "\u001B[33m";
        String CYAN = "\u001B[36m";
        String RESET = "\u001B[0m";
        Random random = new Random();

        Dragon[] dragons = new Dragon[3];
        dragons[0] = new Dragon(1000, 200);
        dragons[1] = new Dragon(1000, 200);
        dragons[2] = new Dragon(3000, 300);


        //int[] dragonHPs = { 100, 100, 100 };
        //int[] dragonDamage = { 20, 20, 20 };


        System.out.println(
                " **********************  \n" +
                        " **The final battle!!** \n" +
                        " ********************** ");

        System.out.println();


        //<editor-fold desc="ascii">
        String splashScreen = RED +
                "                                        ,   ,\n" +
                "                                        $,  $,     ,\n" +
                "                                        \"ss.$ss. .s'\n" +
                "                                ,     .ss$$$$$$$$$$s,\n" +
                "                                $. s$$$$$$$$$$$$$$`$$Ss\n" +
                "                                \"$$$$$$$$$$$$$$$$$$o$$$       ,\n" +
                "                               s$$$$$$$$$$$$$$$$$$$$$$$$s,  ,s\n" +
                "                              s$$$$$$$$$\"$$$$$$$$\"\"\"\"$$$$$$\"$$$$$,\n" +
                "                              s$$$$$$$$$$s\"\"$$$$ssssss\"$$$$$$$$\"\n" +
                "                             s$$$$$$$$$$'         `\"\"\"ss\"$\"$s\"\"\n" +
                "                             s$$$$$$$$$$,              `\"\"\"\"\"$  .s$$s\n" +
                "                             s$$$$$$$$$$$$s,...               `s$$'  ` \n" +
                "                         `ssss$$$$$$$$$$$$$$$$$$$$####s.     .$$\"$.   , s-\n" +
                "                           `\"\"\"\"$$$$$$$$$$$$$$$$$$$$#####$$$$$$\"     $.$'\n" +
                "                                 \"$$$$$$$$$$$$$$$$$$$$$####s\"\"     .$$$|\n" +
                "                                  \"$$$$$$$$$$$$$$$$$$$$$$$$##s    .$\" $ \n" +
                "                                   $$\"\"$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\"   ` \n" +
                "                                  $$\"  \"$\"$$$$$$$$$$$$$$$$$$$$S\"\"\"\"' \n" +
                "                             ,   ,\"     '  $$$$$$$$$$$$$$$$####s\n" +
                "                             $.          .s$$$$$$$$$$$$$$$$$####\"\n" +
                "                 ,           \"$s.   ..ssS$$$$$$$$$$$$$$$$$$$####\"\n" +
                "                 $           .$$$S$$$$$$$$$$$$$$$$$$$$$$$$#####\"\n" +
                "                 Ss     ..sS$$$$$$$$$$$$$$$$$$$$$$$$$$$######\"\"\n" +
                "                  \"$$sS$$$$$$$$$$$$$$$$$$$$$$$$$$$########\"\n" +
                "           ,      s$$$$$$$$$$$$$$$$$$$$$$$$#########\"\"'\n" +
                "           $    s$$$$$$$$$$$$$$$$$$$$$#######\"\"'      s'         ,\n" +
                "           $$..$$$$$$$$$$$$$$$$$$######\"'       ....,$$....    ,$\n" +
                "            \"$$$$$$$$$$$$$$$######\"' ,     .sS$$$$$$$$$$$$$$$$s$$\n" +
                "              $$$$$$$$$$$$#####\"     $, .s$$$$$$$$$$$$$$$$$$$$$$$$s.\n" +
                "   )          $$$$$$$$$$$#####'      `$$$$$$$$$###########$$$$$$$$$$$.\n" +
                "  ((          $$$$$$$$$$$#####       $$$$$$$$###\"       \"####$$$$$$$$$$\n" +
                "  ) \\\\         $$$$$$$$$$$$####.     $$$$$$###\"             \"###$$$$$$$$$   s'\n" +
                " (   )        $$$$$$$$$$$$$####.   $$$$$###\"                ####$$$$$$$$s$$'\n" +
                " )  ( (       $$\"$$$$$$$$$$$#####.$$$$$###' -Tua Xiong     .###$$$$$$$$$$\"\n" +
                " (  )  )   _,$\"   $$$$$$$$$$$$######.$$##'                .###$$$$$$$$$$\n" +
                " ) (  ( \\\\.         \"$$$$$$$$$$$$$#######,,,.          ..####$$$$$$$$$$$\"\n" +
                "(   )$ )  )        ,$$$$$$$$$$$$$$$$$$####################$$$$$$$$$$$\"\n" +
                "(   ($$  ( \\\\     _sS\"  `\"$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$S$$,\n" +
                " )  )$$$s ) )  .      .   `$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\"'  `$$\n" +
                "  (   $$$Ss/  .$,    .$,,s$$$$$$##S$$$$$$$$$$$$$$$$$$$$$$$$S\"\"        '\n" +
                "    \\)_$$$$$$$$$$$$$$$$$$$$$$$##\"  $$        `$$.        `$$.\n" +
                "        `\"S$$$$$$$$$$$$$$$$$#\"      $          `$          `$\n" +
                "            `\"\"\"\"\"\"\"\"\"\"\"\"\"'         '           '           '" +
                RESET;

        String win =
                "                                                   (\\\"\\\n" +
                        "           /)                                       ) \\\n" +
                        "          (^)                                      /   \\\n" +
                        "          ,i.                                     (  ^  )\n" +
                        "        __|_|__              ^                     \\/_\\/\n" +
                        "       '_______'            (^)              ,---._  |\n" +
                        "        ,%y^\\\\`             ,i.             |      `-^-.__,-.\n" +
                        "       (/// _\\\\)            | |             |    ,%y^\\\\`    |\n" +
                        "      (((( -  )))           | |             |   (/// .\\\\))  |\n" +
                        "      ((|)_*_/(((      _____|_|_____        |  (((( ^ ))))  |\n" +
                        "      ))(/) (\\((|)    \".___________.\"       | (((|)_v_/((() |\n" +
                        "     ((((\\___/))(\\       \\y ,--.y/          |  )))))  ()))) |\n" +
                        "    / ,-)     (-. \\      /,---. )\\          |/  ,   |   .  \\|\n" +
                        "   ( ( ( _, ._  ) )    / (((\\\\)\\ \\         /  (* ^   *)  \\\n" +
                        "    \\ \\ )     ( / /     \\ \\\\-_/ / /        /  /|`--\" `--\"|\\  \\\n" +
                        "     ) y       y (       \\ i   i /        / .\" ,--. . ,--. \". \\\n" +
                        "     \\(         )/        (_)=(_)      __/ /'-/(   \\ /   )\\-'\\ \\__\n" +
                        "       \\_______/           ) . (      /--.,  (  \\   y   /  )  `.,--\\\n" +
                        "        \\|/|  /           /\\---/\\             \\  \"./  ,\"  /\n" +
                        "         /-^-/           /  )-(  \\             `--/  /\\--\"\n" +
                        "        (   X           /  /   \\  \\              /  _) \\\n" +
                        "         \\  \\          / ,\"     \". \\            mm/  (_ \\   hjw\n" +
                        "          \\  y-._     / /         \\ \\                  \\_b  `97\n" +
                        "          |\\,' X-'   /-)           (-\\\n" +
                        "        _,T-)  /    / ^!           !^ \\\n" +
                        "       (__,-%_/@";

        String lose = "                                           .\"\"--.._\n" +
                "                                           []      `'--.._\n" +
                "                                           ||__           `'-,\n" +
                "                                         `)||_ ```'--..       \\\n" +
                "                     _                    /|//}        ``--._  |\n" +
                "                  .'` `'.                /////}              `\\/\n" +
                "                 /  .\"\"\".\\              //{///\n" +
                "                /  /_  _`\\\\            // `||\n" +
                "                | |(_)(_)||          _//   ||\n" +
                "                | |  /\\  )|        _///\\   ||\n" +
                "                | |L====J |       / |/ |   ||\n" +
                "               /  /'-..-' /    .'`  \\  |   ||\n" +
                "              /   |  :: | |_.-`      |  \\  ||\n" +
                "             /|   `\\-::.| |          \\   | ||\n" +
                "           /` `|   /    | |          |   / ||\n" +
                "         |`    \\   |    / /          \\  |  ||\n" +
                "        |       `\\_|    |/      ,.__. \\ |  ||\n" +
                "        /                     /`    `\\ ||  ||\n" +
                "       |           .         /        \\||  ||\n" +
                "       |                     |         |/  ||\n" +
                "       /         /           |         (   ||\n" +
                "      /          .           /          )  ||\n" +
                "     |            \\          |             ||\n" +
                "    /             |          /             ||\n" +
                "   |\\            /          |              ||\n" +
                "   \\ `-._       |           /              ||\n" +
                "    \\ ,//`\\    /`           |              ||\n" +
                "     ///\\  \\  |             \\              ||\n" +
                "    |||| ) |__/             |              ||\n" +
                "    |||| `.(                |              ||\n" +
                "    `\\\\` /`                 /              ||\n" +
                "       /`                   /              ||\n" +
                " jgs  /                     |              ||\n" +
                "     |                      \\              ||\n" +
                "    /                        |             ||\n" +
                "  /`                          \\            ||\n" +
                "/`                            |            ||\n" +
                "`-.___,-.      .-.        ___,'            ||\n+" +
                "         `---'`   `'----'`";
        //</editor-fold>
        System.out.println(splashScreen);
        System.out.println();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter hero hit points ");
        int heroHP = scanner.nextInt();
        System.out.println("Enter Hero damage points ");
        int heroDamage = scanner.nextInt();


        System.out.println("Hero has " + heroHP + " HP and deals up to " + heroDamage + " points of damage");


        //do battle until one side dies
        boolean heroWins = false;
        boolean battleOver = false;
        while (!battleOver) {



            printDragonStatus(YELLOW, CYAN, RED, GREEN, RESET, dragons);
            System.out.println("Hero has " + GREEN + heroHP + " HP" + RESET);
            System.out.println("-----------------------------------------");
/*
            //<editor-fold desc="Battle Logic">
            for (int i = 0; i < dragons.length; i++) {
                System.out.println("Dragon " + (i + 1) + " has " + YELLOW + dragons[i].getHitPoints() + " HP" + RESET);
                System.out.println();
                //</editor-fold>

                if (heroHP < 1) {
                    battleOver = true;
                    heroWins = false;
                    break;
                }
                if (dragons[0].getHitPoints() < 1 && dragons[1].getHitPoints() < 1 && dragons[2].getHitPoints() < 1) {
                    battleOver = true;
                    heroWins = true;
                    break;
                }
*/
                int dragonChoice = 0;
                while (dragonChoice < 1 || dragonChoice > 3) {

                    //art and question print logic
                    printCurrentBattleScene(dragons, RED, RESET);
                    System.out.println("Which dragon would you like to attack above?");
                    dragonChoice = scanner.nextInt();
                    int dragonDmg = 0;
                    System.out.println("Attacking Dragon " + dragonChoice + ".");


                    //</editor-fold>
                    if (dragonChoice >= 1 && dragonChoice <= dragons.length) {
                        int choice = dragonChoice - 1;

                        if (dragons[choice].getHitPoints() < 1) {
                            System.out.println("Dragon " + dragonChoice + " is already dead!");
                            try {
                                sleep(1200);
                            } catch (InterruptedException e) {
                                throw new RuntimeException(e);
                            }
                            dragonChoice = 0; // Triggers the 'while' loop to ask again
                            continue;
                        } else {
                            int heroHitsForDmg = random.nextInt(heroDamage);
                            dragons[choice].setHitPoints(dragons[choice].getHitPoints() - heroHitsForDmg);
                            System.out.println("You hit Dragon " + dragonChoice + " for " + CYAN + heroHitsForDmg + " dmg." + RESET);
                        }
                    } else {
                        System.out.println("That's not a valid dragon number!");
                        try {
                            sleep(1200);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        dragonChoice = 0;
                        continue;
                    }
                    if (dragons[0].getHitPoints() < 1 && dragons[1].getHitPoints() < 1 && dragons[2].getHitPoints() < 1) {
                        battleOver = true;
                        heroWins = true;
                        break;
                    }

                    try {
                        Thread.sleep(1200);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                    //dragons attack
                    for (int d = 0; d < dragons.length; d++) {
                        if (dragons[d].getHitPoints() > 0) {
                            dragonDmg = random.nextInt(dragons[d].getDamage());
                            heroHP = heroHP - dragonDmg;
                            System.out.println("Dragon " + (d + 1) + " hits you for " + RED + dragonDmg + " Dmg." + RESET);
                        }
                    }
                    try {
                        sleep(1200);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    if (heroHP < 1) {
                        battleOver = true;
                        heroWins = false;
                        break;
                    }
                }
        }

        System.out.println("Battle Outcome");
        System.out.println("--------------");
        if (heroWins == false) {
            System.out.println(RED + "You Were Defeated!" + RESET);
            System.out.println(RED + lose + RESET);
        } else {
            System.out.println(GREEN + "You are a hero!!" + RESET);
            System.out.println(CYAN + win + RESET);
        }



    }
    private static void printCurrentBattleScene(Dragon[] dragons, String RED, String RESET) {
        boolean d1 = dragons[0].getHitPoints() > 0;
        boolean d2 = dragons[1].getHitPoints() > 0;
        boolean d3 = dragons[2].getHitPoints() > 0;

        if (d1 && d2 && d3) {
            System.out.println(getArt123(dragons, RED, RESET));
        } else if (d1 && d2) {
            System.out.println(getArt12(dragons, RED, RESET));
        } else if (d1 && d3) {
            System.out.println(getArt13(dragons, RED, RESET));
        } else if (d2 && d3) {
            System.out.println(getArt23(dragons, RED, RESET));
        } else if (d1) {
            System.out.println(getArt1(dragons, RED, RESET));
        } else if (d2) {
            System.out.println(getArt2(dragons, RED, RESET));
        } else if (d3) {
            System.out.println(getArt3(dragons, RED, RESET));
        }
    }
    private static String getArt123(Dragon[] dragons, String RED, String RESET) {
        return  "         <>=======()                                                       \n" +
                "        (/\\___   /|\\\\           ()==========<>_    \n" +
                "               \\_/ | \\\\        //|\\   ______/ \\)                            \n" +
                "                 \\_|  \\\\      // | \\_/                                      \n" +
                "                  \\|\\/|\\_    //  /\\/                                        \n" +
                "                        (oo)\\ \\_///       [" + RED + dragons[1].getHitPoints() + " HP" + RESET + "] \n" +
                "                        //_/\\_\\/ /|                                      \n" +
                "                      @@/  |=\\  \\ |                                       \n" +
                "                             \\_=\\_\\|                                     \n" +
                "        __        _           \\==\\ |\\_                   \\||/               \n" +
                "      _/  \\    _(\\(o __       (\\===\\(  )\\                |  @___oo          \n" +
                "      /     \\  /  _  ^^^o    (((~) __(_/       /\\  /\\   / (__,,,,|         \n" +
                "     /   !   \\/  ! '!!!v'   (((~) \\  /        ) /^\\) ^\\/ _)                \n" +
                "    !  !  \\ _' ( \\____      ______/ /         )   _ /  / _)                \n" +
                "    ! . \\ _!\\   \\===^\\)      '------'    /\\  ) /\\/ ||  | )_)                \n" +
                "     \\ \\_!  / __!                       <  >      |(,,) )__)               \n" +
                "      \\!   /    \\                        ||      /    \\)___)\\              \n" +
                "(\\_      _/    _\\ )                      | \\____(      )___) )___          \n" +
                " \\ ^^--^^ __-^ /(__                      \\______(_______;;; __;;;          \n" +
                "  ^^----^^    \"^--v'                                                       \n" +
                "                                                                           \n" +
                "     [" + RED + dragons[0].getHitPoints() + " HP" + RESET + "]                                         [" + RED + dragons[2].getHitPoints() + " HP" + RESET + "]        \n";
    }
    private static String getArt23(Dragon[] dragons, String RED, String RESET) {
        return  "         <>=======()                                                       \n" +
                "        (/\\___   /|\\\\           ()==========<>_    \n" +
                "               \\_/ | \\\\        //|\\   ______/ \\)                            \n" +
                "                 \\_|  \\\\      // | \\_/                                      \n" +
                "                  \\|\\/|\\_    //  /\\/                                        \n" +
                "                        (oo)\\ \\_///        \n" +
                "                        //_/\\_\\/ /|                                      \n" +
                "                      @@/  |=\\  \\ |                                       \n" +
                "                             \\_=\\_\\|                                     \n" +
                "                              \\==\\ |\\_                      \\||/               \n" +
                "                            (\\====\\( )\\                     |  @___oo          \n" +
                "                           (((~) __(_/                /\\  /\\/ (__,,,,|         \n" +
                "                           (((~) \\  /              ) /^\\) ^\\/ _)                \n" +
                "                           ______/ /               )   _ /  / _)                \n" +
                "                           '------'            /\\  ) /\\/ || | )_)                \n" +
                "                [" + RED + dragons[1].getHitPoints() + " HP" + RESET + "]                      <  >      |(,,) )__)               \n" +
                "                                               ||      /    \\)___)\\              \n" +
                "                                               | \\____(      )___) )___          \n" +
                "                                               \\______(_______;;; __;;;          \n" +
                "                                                                             \n" +
                "                                                         [" + RED + dragons[2].getHitPoints() + " HP" + RESET + "]                  \n" +
                "                                                                              \n";
    }
    private static String getArt13(Dragon[] dragons, String RED, String RESET) {
        return "                                                                             \n" +
                "                                                                          \n" +
                "                                                                           \n" +
                "                                                                            \n" +
                "                                                                            \n" +
                "                                                                             \n" +
                "                                                                              \n" +
                "                                                                             \n" +
                "                                                                                \n" +
                "        __        _                                     \\||/               \n" +
                "      _/  \\    _(\\(o __                                 |  @___oo          \n" +
                "      /     \\  /  _  ^^^o                     /\\  /\\   / (__,,,,|         \n" +
                "     /   !   \\/  ! '!!!v'                    )/^\\) ^\\ / _)                \n" +
                "    !  !  \\ _' ( \\____                       )   _ /  / _)                \n" +
                "    ! . \\ _!\\   \\===^\\)                  /\\  ) /\\/ || | )_)                \n" +
                "     \\ \\_!  / __!                       <  >      |(,,) )__)               \n" +
                "      \\!   /    \\                        ||      /    \\)___)\\              \n" +
                "(\\_      _/    _\\ )                      | \\____(      )___) )___          \n" +
                " \\ ^^--^^ __-^ /(__                      \\______(_______;;; __;;;          \n" +
                "  ^^----^^    \"^--v'                                                       \n" +
                "                                                                           \n" +
                "     [" + RED + dragons[0].getHitPoints() + " HP" + RESET + "]                                         [" + dragons[2].getHitPoints() + " HP" + RESET + "]        \n";
    }
    private static String getArt12(Dragon[] dragons, String RED, String RESET) {
        return "                   <>=======()                                                                   \n" +
                "                  (/\\___   /|\\\\           ()==========<>_                           \n" +
                "                         \\_/ | \\\\        //|\\   ______/ \\)                            \n" +
                "                           \\_|  \\\\      // | \\_/                                      \n" +
                "                            \\|\\/|\\_    //  /\\/                                        \n" +
                "                                  (oo)\\ \\_///       [" + RED + dragons[1].getHitPoints() + " HP" + RESET + "] \n" +
                "                                  //_/\\_\\/ /|                                      \n" +
                "                                @@/  |=\\  \\ |                                       \n" +
                "                                      \\_=\\_\\|                                     \n" +
                "        __        _                    \\==\\ |\\_                                  \n" +
                "      _/  \\    _(\\(o __             _(\\==\\(  )\\                             \n" +
                "      /     \\  /  _  ^^^o           (((~) __(_/                                    \n" +
                "     /   !   \\/  ! '!!!v'           (((~) \\  /                                   \n" +
                "    !  !  \\ _' ( \\____              ______/ /                                         \n" +
                "    ! . \\ _!\\   \\===^\\)             '------'                                 \n" +
                "     \\ \\_!  / __!                                                     \n" +
                "      \\!   /    \\                                                      \n" +
                "(\\_      _/    _\\ )                                                        \n" +
                " \\ ^^--^^ __-^ /(__                                                   \n" +
                "  ^^----^^    \"^--v'                                                       \n" +
                "                                                                           \n" +
                "     [" + RED + dragons[0].getHitPoints() + " HP" + RESET + "]                                                  \n";
    }
    private static String getArt1(Dragon[] dragons, String RED, String RESET) {
        return          "                                                                     \n" +
                        "                                                                         \n" +
                        "        __        _                                                   \n" +
                        "      _/  \\    _(\\(o __                                           \n" +
                        "      /     \\  /  _  ^^^o                                               \n" +
                        "     /   !   \\/  ! '!!!v'                                                \n" +
                        "    !  !  \\ _' ( \\____                                                         \n" +
                        "    ! . \\ _!\\   \\===^\\)                                              \n" +
                        "     \\ \\_!  / __!                                                     \n" +
                        "      \\!   /    \\                                                      \n" +
                        "(\\_      _/    _\\ )                                                        \n" +
                        " \\ ^^--^^ __-^ /(__                                                   \n" +
                        "  ^^----^^    \"^--v'                                                       \n" +
                        "                                                                           \n" +
                        "     [" + RED + dragons[0].getHitPoints() + " HP" + RESET + "]                                                  \n";
    }
    private static String getArt2(Dragon[] dragons, String RED, String RESET) {
        return  "         <>=======()                                                       \n" +
                "        (/\\___   /|\\\\           ()==========<>_    \n" +
                "               \\_/ | \\\\        //|\\   ______/ \\)                            \n" +
                "                 \\_|  \\\\      // | \\_/                                      \n" +
                "                  \\|\\/|\\_    //  /\\/                                        \n" +
                "                        (oo)\\ \\_///       [" + RED + dragons[1].getHitPoints() + " HP" + RESET + "] \n" +
                "                        //_/\\_\\/ /|                                      \n" +
                "                      @@/  |=\\  \\ |                                       \n" +
                "                             \\_=\\_\\|                                     \n" +
                "                             \\==\\ |\\_                                \n" +
                "                          (\\===\\(  )\\                         \n" +
                "                          (((~) __(_/                \n" +
                "                          (((~) \\  /                        \n" +
                "                          ______/ /                        \n" +
                "                          '------'                   \n" +
                "                                                           \n" +
                "                                                           \n" +
                "                                                    \n" +
                "                                                   \n" +
                "                                                                             \n" +
                "                                                                           \n" +
                "                                                                              \n";
    }
    private static String getArt3(Dragon[] dragons, String RED, String RESET) {
        return  "                                                            \\||/           \n" +
                "                                                            |  @___oo      \n" +
                "                                                  /\\  /\\   / (__,,,,|      \n" +
                "                                                 ) /^\\) ^\\/ _)             \n" +
                "                                                 )   /^\\/   _)             \n" +
                "                                                 )   _ /  / _)             \n" +
                "                                             /\\  )/\\/ ||  | )_)            \n" +
                "                                            <  >      |(,,) )__)           \n" +
                "                                             ||      /    \\)___)\\          \n" +
                "                                             | \\____(      )___) )___      \n" +
                "                                              \\______(_______;;; __;;;     \n" +
                "                                              [" + RED + dragons[2].getHitPoints() + " HP" + RESET + "] \n";
    }
    private static void printDragonStatus(String YELLOW, String CYAN, String RED, String GREEN, String RESET, Dragon[] dragons) {

        System.out.println("Dragons Status");
        System.out.println("---------------");
        for (int ds = 0; ds < dragons.length; ds++) {
            if (dragons[ds].getHitPoints() > 0) {
                System.out.println("Dragon " + (ds + 1) + " has  " + YELLOW + dragons[ds].getHitPoints() + " HP " + "and deals up to " + dragons[ds].getDamage() + " damage!" + RESET);
            }
        }
    }
}