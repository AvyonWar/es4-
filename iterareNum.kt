fun main(){ 
    var sec1 = 30
 // var sec1 = 100   /*secondo val da provare*/
 
    if(sec1 <= 50){
        for(i in 1 .. 50 step 2){
            println(i)
        }
    }
    
    //dichiarazione della seconda parte del conteggio
    var sec2 = if(sec1 > 50){
        for(i in 50 .. 100 step 2){
            println(i)
        }
    }else{}   
 
 }
 
 //sapendo che dovevo dividere il conteggio in <50 e >50 ho preferito farlo dalla base ----> ho pensato fosse più intuitivo
 //creando così due variabili sec1 e sec2

 
 
 
