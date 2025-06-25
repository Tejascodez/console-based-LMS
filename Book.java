package LMS;

public class Book {
        private String title;
        private String author;
        private boolean isBorrowed;


        public Book(String title, String author){
            this.title = title;
            this.author = author;
            this.isBorrowed = false;
            
        }


        public void Borrow(){
            isBorrowed = true;

        }

        public void returnBook(){
            isBorrowed= false;

        }

        public boolean isBorrowed(){
            return isBorrowed;
        }

        public String getTitle(){
            return title;
        }
        
        public void display(){
            System.out.println("🚀"+ title + " by" + author + (isBorrowed ? "Already Borrowed" : "Available"));
        }
}
