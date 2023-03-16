import javax.swing.JOptionPane

var fil = JOptionPane.showInputDialog("Enter the number of rows").toInt()
var col = JOptionPane.showInputDialog("Enter the number of columns").toInt()

var matriz = Array(fil){IntArray(col)}

for(i in 0 until fil){
    for(j in 0 until col){
        var value = JOptionPane.showInputDialog("Enter [${i+1}] [${i+1}]").toInt()
        matriz[i][j] = value
    }
}

for(i in 0 until fil){
    var sumFil = 0
    for(j in 0 until col){
        sumFil += matriz[i][j]
    }
    println("La linea ${i+1} se suma asi = $sumFil")
}
for(j in 0 until col){
    var sumCol = 0
    for (i in 0 until fil){
        sumCol += matriz[i][j]
    }
    println("La fila ${j+1} se suma asi = $sumCol ")
}