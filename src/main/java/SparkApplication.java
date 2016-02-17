import static spark.Spark.*;

/**
 * Created by shelajev on 17/02/16.
 */
public class SparkApplication {

  public static void main(String[] args) {
    get("/hello", (req, res) -> "Hello World");
  }
}

