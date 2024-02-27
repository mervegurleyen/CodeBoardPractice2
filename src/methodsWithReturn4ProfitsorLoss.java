public class methodsWithReturn4ProfitsorLoss {

    public static void main(String[] args) {

        System.out.println(c_profits(500, 500));
    }
    public static String c_profits(int buyPrice,int sellPrice) {

        String result = "";
        if(buyPrice < sellPrice)
            result = "profit";
        else if(buyPrice > sellPrice)
            result = "loss";
        else
            result = "no loss";

        return result;
    }
}

//c_profits gets the buyPrice(int) and sellPrice(int) and determines if there was a profit or loss.
//
//it returns a string value that can be "profit","loss","no loss"
//
//for example:
//
//Enter buying price:
//
//Enter selling price:
//
//c_profits(100,1500)
//
//returns :
//
//profit
//
//
//Enter buying price:
//
//Enter selling price:
//
//c_profits(20,5)
//
//returns :
//
//loss
//
//
//Enter buying price:
//
//Enter selling price:
//
//c_profits(100,100)
//
//returns :
//
//no loss