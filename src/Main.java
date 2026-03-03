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

        int dragon1HP = 100;
        int dragon1Damage = 20;
        int dragon2HP = 100;
        int dragon2Damage = 20;
        int dragon3HP = 100;
        int dragon3Damage = 20;

        System.out.println(
                " **********************  \n" +
                " **The final battle!!** \n" +
                " ********************** ");

        System.out.println();


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

        String dragonArt123 =
                        "         <>=======()                                                       \n" +
                        "        (/\\___   /|\\\\           ()==========<>_    \n" +
                        "               \\_/ | \\\\        //|\\   ______/ \\)                            \n" +
                        "                 \\_|  \\\\      // | \\_/                                      \n" +
                        "                  \\|\\/|\\_    //  /\\/                                        \n" +
                        "                        (oo)\\ \\_///       [" + RED + dragon2HP + " HP" + RESET + "] \n" +
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
                        "     [" + RED + dragon1HP + " HP" + RESET + "]                                         [" + RED + dragon3HP + " HP" + RESET + "]        \n";

        String dragonArt23 =
                        "         <>=======()                                                       \n" +
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
                        "                [" + RED + dragon2HP + " HP" + RESET + "]                      <  >      |(,,) )__)               \n" +
                        "                                               ||      /    \\)___)\\              \n" +
                        "                                               | \\____(      )___) )___          \n" +
                        "                                               \\______(_______;;; __;;;          \n" +
                        "                                                                             \n" +
                        "                                                         [" + RED + dragon3HP + " HP" + RESET + "]                  \n" +
                        "                                                                              \n";


        String dragonArt13 =
                        "                                                                             \n" +
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
                        "     [" + RED + dragon1HP + " HP" + RESET + "]                                         [" + RED + dragon3HP + " HP" + RESET + "]        \n";



        String dragonArt12 =
                        "                   <>=======()                                                                   \n" +
                        "                  (/\\___   /|\\\\           ()==========<>_                           \n" +
                        "                         \\_/ | \\\\        //|\\   ______/ \\)                            \n" +
                        "                           \\_|  \\\\      // | \\_/                                      \n" +
                        "                            \\|\\/|\\_    //  /\\/                                        \n" +
                        "                                  (oo)\\ \\_///       [" + RED + dragon2HP + " HP" + RESET + "] \n" +
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
                        "     [" + RED + dragon1HP + " HP" + RESET + "]                                                  \n";


        String dragonArt1 =
                        "                                                                     \n" +
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
                        "     [" + RED + dragon1HP + " HP" + RESET + "]                                                  \n";


        String dragonArt2 =
                        "         <>=======()                                                       \n" +
                        "        (/\\___   /|\\\\           ()==========<>_    \n" +
                        "               \\_/ | \\\\        //|\\   ______/ \\)                            \n" +
                        "                 \\_|  \\\\      // | \\_/                                      \n" +
                        "                  \\|\\/|\\_    //  /\\/                                        \n" +
                        "                        (oo)\\ \\_///       [" + RED + dragon2HP + " HP" + RESET + "] \n" +
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


        String dragonArt3 =
                        "                                                            \\||/           \n" +
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
                        "                                              [" + RED + dragon2HP + " HP" + RESET + "] \n";
        String win  =
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
                        "   ( ( ( _, ._ ) ) )    / (((\\\\)\\ \\         /  (* ^   *)  \\\n" +
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

        String lose =   "                                           .\"\"--.._\n" +
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
        System.out.println(splashScreen);
        System.out.println();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter hero hit points ");
        int heroHP = scanner.nextInt();
        System.out.println("Enter Hero damage points ");
        int heroDamage = scanner.nextInt();


        System.out.println("Hero has " + heroHP + " HP and deals up to " + heroDamage + " points of damage");
        System.out.println("Dragon 1 has " + YELLOW + dragon1HP + " HP and deals up to " + dragon1Damage + " points of damage" + RESET);
        System.out.println("Dragon 2 has " + YELLOW + dragon2HP + " HP and deals up to " + dragon2Damage + " points of damage" + RESET);
        System.out.println("Dragon 3 has " + YELLOW + dragon3HP + " HP and deals up to " + dragon3Damage + " points of damage" + RESET);

        //do battle until one side dies
        boolean heroWins = false;
        while (true) {

            System.out.println("Hero has " + GREEN + heroHP + " HP" + RESET);
            System.out.println("-----------------------------------------");
            System.out.println("Dragons Status");
            System.out.println("---------------");
            System.out.println("Dragon 1 has " + YELLOW + dragon1HP + " HP" + RESET);
            System.out.println("Dragon 2 has " + YELLOW + dragon2HP + " HP" + RESET);
            System.out.println("Dragon 3 has " + YELLOW + dragon3HP + " HP" + RESET);
            System.out.println();

            if (heroHP < 1) {
                heroWins = false;
                break;
            }
            if (dragon1HP < 1 && dragon2HP < 1 && dragon3HP < 1) {
                heroWins = true;
                break;
            }

            int dragonChoice = 0;
            while (dragonChoice < 1 || dragonChoice > 3) {

                //art and question print logic
                if (dragon1HP > 0 && dragon2HP > 0 && dragon3HP > 0) {
                    System.out.println(dragonArt123);
                    System.out.println("Hero's turn to attack. Which dragon would you like to attack (1, 2, 3)?");
                }
                else if (dragon1HP > 0 && dragon2HP > 0) {
                    System.out.println(dragonArt12);
                    System.out.println("Hero's turn to attack. Which dragon would you like to attack (1 or 2)?");
                }
                else if (dragon1HP > 0 && dragon3HP > 0) {
                    System.out.println(dragonArt13);
                    System.out.println("Hero's turn to attack. Which dragon would you like to attack (1 or 3)?");
                }
                else if (dragon2HP > 0 && dragon3HP > 0) {
                    System.out.println(dragonArt23);
                    System.out.println("Hero's turn to attack. Which dragon would you like to attack (2 or 3)?");
                }
                else if (dragon1HP > 0) {
                    System.out.println(dragonArt1);
                    System.out.println("Hero's turn to attack. Which dragon would you like to attack (1)?");
                }
                else if (dragon2HP > 0) {
                    System.out.println(dragonArt2);
                    System.out.println("Hero's turn to attack. Which dragon would you like to attack (2)?");
                }
                else if (dragon3HP > 0) {
                    System.out.println(dragonArt3);
                    System.out.println("Hero's turn to attack. Which dragon would you like to attack (3)?");
                }

                dragonChoice = scanner.nextInt();

                System.out.println("Attacking Dragon " + dragonChoice + ".");

                if (dragonChoice == 1) {
                    if (dragon1HP < 1) {
                        System.out.println("Dragon 1 is already dead!");
                        dragonChoice = 0;
                    } else {
                        int heroHitsForDmg = random.nextInt(heroDamage);
                        dragon1HP = dragon1HP - heroHitsForDmg;
                        System.out.println("You hit Dragon 1 for " + CYAN + heroHitsForDmg + " dmg." + RESET);
                    }

                } else if (dragonChoice == 2) {
                    if (dragon2HP < 1) {
                        System.out.println("Dragon 2 is already dead!");
                        dragonChoice = 0;
                    } else {
                        int heroHitsForDmg = random.nextInt(heroDamage);
                        dragon2HP = dragon2HP - heroHitsForDmg;
                        System.out.println("You hit Dragon 2 for " + CYAN + heroHitsForDmg + " dmg." + RESET);
                    }
                } else if (dragonChoice == 3) {
                    if (dragon3HP < 1) {
                        System.out.println("Dragon 3 is already dead!");
                        dragonChoice = 0;
                    } else {
                        int heroHitsForDmg = random.nextInt(heroDamage);
                        dragon3HP = dragon3HP - heroHitsForDmg;
                        System.out.println("You hit Dragon 3 for " + CYAN + heroHitsForDmg + " dmg." + RESET);
                    }

                }

                try {
                    sleep(1200);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

                if(dragon1HP > 0) {
                    int dragon1HitsForDmg = random.nextInt(dragon1Damage);
                    heroHP = heroHP - dragon1HitsForDmg;
                    System.out.println("Dragon 1 hits you for " + RED + dragon1HitsForDmg + " Dmg." + RESET);
                }
                if(dragon2HP > 0) {
                    int dragon2HitsForDmg = random.nextInt(dragon2Damage);
                    heroHP = heroHP - dragon2HitsForDmg;
                    System.out.println("Dragon 2 hits you for " + RED + dragon2HitsForDmg + " Dmg." + RESET);
                }
                if(dragon3HP > 0) {
                    int dragon3HitsForDmg = random.nextInt(dragon3Damage);
                    heroHP = heroHP - dragon3HitsForDmg;
                    System.out.println("Dragon 3 hits you for " + RED + dragon3HitsForDmg + " Dmg." + RESET);
                }

                try {
                    sleep(1200);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
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

}