package edu.escuelaing.arep.heroku.Spark;

import static spark.Spark.*;
import edu.escuelaing.arep.heroku.Operations;
public class SparkWebApp {

    public static void main(String[] args) {
        port(getPort());
        staticFiles.location("/public");
        post("/calculate", (request, response) -> {

            Operations operations = new Operations();
            operations.readJSON(request.body());

            return "{\"mean\":" + operations.mean() + ", \"stdDev\":" + operations.stdDev() + "}";
        });
    }
    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567; //returns default port if heroku-port isn't set
    }
}
