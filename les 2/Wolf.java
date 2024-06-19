public class Wolf{
    private String gender;
    String nickname;
    int weight;
    int age;
    String color;

    public void walk(){
        System.out.println(nickname+" идет");
    }
    public void sit(){
        System.out.println(nickname+" сидит");
    }
    public void run(){
        System.out.println(nickname+" бежит");
    }
    public void howl(){
        System.out.println(nickname+" воет");
    }
    public void hunt(){
        System.out.println(nickname+" охотится");
    }

    public void setAge(int age){
        if (age>8){
            this.age=age;
        }
        else{
            System.out.println("Eror/age");
        }
    }
    public int getAge(){
        return age;
    }
}

