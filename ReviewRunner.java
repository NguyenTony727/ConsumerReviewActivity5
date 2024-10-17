import java.util.ArrayList;
import java.util.List;

class ReviewRunner {
  public static void main(String[] args) 
  {
    List<String> reviewFiles = new ArrayList<>();
    reviewFiles.add("Reviews/taroReviews.txt");
    reviewFiles.add("Reviews/matchaReviews.txt");
    for (int i = 0; i < reviewFiles.size(); i++) {
      for (int j = i + 1; j < reviewFiles.size(); j++) {
        String file1 = reviewFiles.get(i);
        String file2 = reviewFiles.get(j);
        String comparisonMessage = "Comparing: ".concat(file1).concat(" and ").concat(file2);
        // String starComparisonMsg = "Review 1's star rating: " + int.textToString(Review.starRating(file1)) + "\nReview 2's star rating: " + textToString(Review.starRating(file2));  
        System.out.println(comparisonMessage);
        Review.compareReviews(file1, file2);
      } 
    }
  }
}
