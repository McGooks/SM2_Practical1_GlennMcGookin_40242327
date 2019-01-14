public class Quotes {

    public void shakespeareQuote(){
        System.out.println("Goodnight, good night! Parting is such sweet sorrow, that i shall say good night till it be morrow. Shakespeare");
    }

    public void oscarWildeQuote(){
        System.out.println("Experience is simply the name we give our mistakes. Wilde");
    }

    public void churchillQuote(){
        System.out.println("Continuous effort - not strength or intelligence - is the key to unlocking our potential. Churchill");
    }

    public void georgeWBushQuote(){
        System.out.println("One of the great things about books is sometimes there are some fantastic pictures. George W Bush");
    }

    public void einsteinQuote(){
        System.out.println("If the facts don't fit the theory, change the facts. Albert Einstein");
    }

    public static void main(String[] args) {
        Quotes quotes = new Quotes();
        quotes.churchillQuote();
        quotes.einsteinQuote();
        quotes.georgeWBushQuote();
        quotes.oscarWildeQuote();
        quotes.shakespeareQuote();
    }
}
