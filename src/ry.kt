fun main(){
    var a = arrayOf(1,3,5,2,0,-32,-9,6,35,5,4,4,5,3,2)
    var c = 0
    var d = 0
    var b = 1
    var e = 0
    for (i in 0..14){
        if(a[i] < 0){
          c = c+1
        }
        if(a[i] > 0){
            d = a[i]
            b = b * a[i]
        }
        if(a[i] == 0){
            e = e+1
        }
    }
    println("количество отрицательных чисел $c")
    println("произведение положительных чисел $b")
    println("количество нулевых элементов $e")
   }
