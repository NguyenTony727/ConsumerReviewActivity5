class ReviewRunner {
  public static void main(String[] args) 
  {
    /* your code here, for example: */
    /* String sentence = "This was a terrible restaurant The pizza crust was too chewy and I disliked the pasta I would definitely not come back"; */
    System.out.println(Review.totalSentiment("SimpleReview.txt"));
    System.out.println(Review.totalSentiment("26WestReview.txt"));
    System.out.println(Review.starRating("26WestReview.txt"));
    System.out.println(Review.starRating("SimpleReview.txt"));
  }
}