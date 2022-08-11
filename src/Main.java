public class Main {
    public static void main(String[] args) {
        Book b1 = new ProgrammingBook("B1", "Java Overview", 100,"TG1", "Java", "None");
        ProgrammingBook b2 = new ProgrammingBook("B2", "Java Spring", 150,"TG2", "Java", "Spring");
        Book b3 = new FictionBook("B3", "Tieng Han Tong Hop", 50,"TG3", "Sen");
        Book b4 = new FictionBook("B4", "Tieng Trung Phon The", 154,"TG4", "Sen");
        Book listBook[] = {b1, b2, b3, b4};


        int count = 0;
        for (int i = 0; i < listBook.length; i++) {
            if (listBook[i] instanceof ProgrammingBook){
                ProgrammingBook p = (ProgrammingBook)listBook[i];
                String language = p.getLanguage();
                if (language=="Java"){
                    count++;
                }
            }
        }
        System.out.println(count);

        // tinh tong tien cua tat cac cuon sach
        int sum=0;
        for (Book b: listBook) {
            sum+=b.getPrice();
        }
    }
}
