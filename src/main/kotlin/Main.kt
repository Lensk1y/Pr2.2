fun main(args: Array<String>) {
    val tabl: Array<Array<Int>> = Array(5, {Array(5, {0})});
    val strs: Array<String> = Array(5, {"0"});
    var bul = true;
    strs[0] = "59672";
    strs[1] = "98453";
    strs[2] = "64387";
    strs[3] = "75848";
    strs[4] = "23781";
    for (i in 0 until 5)
    {
        print("Input " + (i + 1).toString() + " string: ");
        strs[i] = readln();
    }
    for (i in 0 until 5)
    {
        for (j in 0 until 5)
        {
            tabl[i][j] = strs[i][j] - '0';
        }
    }
    println();
    for (i in 0 until 5)
    {
        for (j in 0 until 5)
        {
            print(tabl[i][j].toString() + " ");
            if (tabl[i][j] != tabl[j][i]) { bul = false;}
        }
        println();
    }
    if (bul) println("Array is symmetric"); else println("Array is not symmetric");
}