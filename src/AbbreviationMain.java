public class AbbreviationMain {
    public static void main(String[] args) {
        
        Abbreviations abbreviations = new Abbreviations();
        abbreviations.addAbbreviation("e.g.", "for example");
        abbreviations.addAbbreviation("etc", "and so on");
        abbreviations.addAbbreviation("i.e.", "more precisely");
        System.out.println(abbreviations.hasAbbreviation("e.g."));
        System.out.println(abbreviations.hasAbbreviation("etc"));
        System.out.println("hi");
        System.out.println(abbreviations.findExplanationFor("i.e."));
    }
}
