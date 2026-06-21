fun main() {
    var Balance=1000

    while(true){
        println("1.Check Balace")
        println("2.Withdreaw Money")
        println("3. Deposit Money")
        println("4.Exit")

        println("enter choice your number:")
        var choice=readln().toInt()

        if(choice==4){
            println("Exit")
            break
        }
        when(choice){
            1->{println("check balance=${Balance}")}
            2->{println("enter  ammount:")

                var  amonut=readln().toInt()

                Balance=Balance-amonut
                println("withdraw successful")
            }

            3->{println("enter amount:")
            var amount=readln().toInt()
                Balance=Balance+amount
                println("balance")
            }
            else->{println("not valid")}


        }
    }
}