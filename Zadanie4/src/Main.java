import java.util.Scanner;public class Main {
    public static void main(String[] args){
        Department ct = new Department();        ct.info.print();    }
    public static class Department {
        public static Scanner ob=new Scanner(System.in);        public info info;        public String city;        public Department(){
            System.out.print("введите название отдела фирмы ");            setDepartment(ob.next());            info=new info();        }
        public String getDepartment(){
            return city;        }
        public void setDepartment(String city){
            this.city=city;        }
        public class info{
            int pr,st,sq;            public info(){
                System.out.print("Введите количество должностей отдела: ");                setPr(ob.nextInt());                System.out.print("количество сотрудников:");                setSt(ob.nextInt());                System.out.print("введите количество филиалов:");                setSq(ob.nextInt());            }
            public int getPr(){
                return pr;            }
            public void setPr(int pr){
                this.pr=pr;            }
            public int getSt(){
                return st;            }
            public void setSt(int st){
                this.st=st;            }
            public int getSq(){
                return sq;            }
            public void setSq(int sq){
                this.sq=sq;            }
            public void print(){
                System.out.print("На фирме "+" "+getDepartment()+" "+getPr()+" сотрудников "+getSt()+" должностей "+getSq()+" филиалов ");            }
        }
    }
}
