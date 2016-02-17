package org.shelajev.webframeworks;

import spark.ModelAndView;
import spark.Request;
import spark.Response;
import spark.template.thymeleaf.ThymeleafTemplateEngine;

import java.util.HashMap;
import java.util.Map;

import static spark.Spark.get;
import static spark.Spark.staticFileLocation;

/**
 * Created by shelajev on 17/02/16.
 */
public class SparkApplication {

  public static void main(String[] args) {
    staticFileLocation("/public");

    get("/hello", SparkApplication::helloWorld, new ThymeleafTemplateEngine());
  }

  public static ModelAndView helloWorld(Request req, Response res) {
    Map<String, Object> params = new HashMap<>();
    params.put("name", req.queryParams("name"));
    return new ModelAndView(params, "hello");
  }
}

