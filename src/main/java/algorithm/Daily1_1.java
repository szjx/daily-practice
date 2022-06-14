package algorithm;

/**
 * description: 编辑距离
 *
 * @author lihui
 * @create 2022-06-13 20:00
 **/
public class Daily1_1 {

    public static int minDistance(String word1, String word2) {

        int[][] dp = new int[word1.length() + 1][word2.length() + 1];

        for (int i = 0; i <= word1.length(); i++) {
            dp[i][0] = i;
        }

        for (int j = 0; j <= word2.length(); j++) {
            dp[0][j] = j;
        }

        for (int i = 1; i <= word1.length(); i++) {
            for (int j = 1; j <= word2.length(); j++) {
                int tmp = dp[i-1][j-1] + 1;
                if (word1.charAt(i-1) == word2.charAt(j-1)) {
                    tmp = dp[i-1][j-1];
                }
                dp[i][j] = Math.min(tmp, Math.min(dp[i-1][j] + 1, dp[i][j-1] + 1));
            }
        }

        return dp[word1.length()][word2.length()];
    }

    public static void main(String[] args) {
        String word1 = "ros";
        String word2 = "hros";
        System.out.println(minDistance(word1, word2));
    }
}
