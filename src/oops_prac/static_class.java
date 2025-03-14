package oops_prac;

class details{
    static class address{
        public void print(){
            System.out.println("Tirunelveli");
        }
    }
}

 class staticclass {
    public static void main(String [] args){
        details.address obj=new details.address();
        obj.print();
    }


}
