public class SimpsonsCharacter {
    private String name;
    private String catchPhrase;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getCatchPhrase(){
        return catchPhrase;
    }

    public void setCatchPhrase(String catchPhrase){
        this.catchPhrase = catchPhrase;
    }

    public void sayCatchPhrase(){
        System.out.println(name + " says " + catchPhrase);
    }


    public static void main(String[] args) {
        SimpsonsCharacter simpsonsCharacter1 = new SimpsonsCharacter();
        simpsonsCharacter1.setName("Bart");
        simpsonsCharacter1.setCatchPhrase("eat my shorts!");
        simpsonsCharacter1.sayCatchPhrase();
        simpsonsCharacter1.setName("Lisa");
        simpsonsCharacter1.setCatchPhrase("I'll be in my room");
        simpsonsCharacter1.sayCatchPhrase();
        simpsonsCharacter1.setName("Homer");
        simpsonsCharacter1.setCatchPhrase("D'Oh!");
        simpsonsCharacter1.sayCatchPhrase();
        simpsonsCharacter1.setName("Nelson");
        simpsonsCharacter1.setCatchPhrase("HaHa");
        simpsonsCharacter1.sayCatchPhrase();
    }
}
