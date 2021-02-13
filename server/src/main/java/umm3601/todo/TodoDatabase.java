package umm3601.user;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;

import io.javalin.http.BadRequestResponse;

/**
 * A fake "database" of user info
 * <p>
 * Since we don't want to complicate this lab with a real database, we're going
 * to instead just read a bunch of user data from a specified JSON file, and
 * then provide various database-like methods that allow the `TodoController` to
 * "query" the "database".
 */
public class TodoDatabase {

  private Todo[] allTodos;

  public TodoDatabase(String todoDataFile) throws IOException {
    Gson gson = new Gson();
    InputStreamReader reader = new InputStreamReader(getClass().getResourceAsStream(todoDataFile));
    allTodos = gson.fromJson(reader, Todo[].class);
  }

  public int size() {
    return allTodos.length;
  }

/**
   * Get the single todo specified by the given ID. Return `null` if there is no
   * todo with that ID.
   *
   * @param id the ID of the desired todo
   * @return the todo with the given ID, or null if there is no user with that ID
   */

   /*
  public User getTodo(String id) {
    return Arrays.stream(allTodos).filter(x -> x._id.equals(id)).findFirst().orElse(null);
  }
  */

  /**
   * Get an array of all the todos satisfying the queries in the params.
   *
   * @param queryParams map of key-value pairs for the query
   * @return an array of all the todos matching the given criteria
   */

   /*
  public Todo[] listTodos(Map<String, List<String>> queryParams) {
    Todo[] filteredTodos = allTodos;

    // Filter age if defined
    if (queryParams.containsKey("age")) {
      String ageParam = queryParams.get("age").get(0);
      try {
        int targetAge = Integer.parseInt(ageParam);
        filteredTodos = filterTodosByAge(filteredTodos, targetAge);
      } catch (NumberFormatException e) {
        throw new BadRequestResponse("Specified age '" + ageParam + "' can't be parsed to an integer");
      }
    }
    // Filter company if defined
    if (queryParams.containsKey("company")) {
      String targetCompany = queryParams.get("company").get(0);
      filteredTodos = filterTodosByCompany(filteredTodos, targetCompany);
    }
    // Process other query parameters here...

    return filteredTodos;
  }
  */

  /**
   * Get an array of all the users having the target age.
   *
   * @param todos     the list of users to filter by age
   * @param targetAge the target age to look for
   * @return an array of all the users from the given list that have the target
   *         age
   */

   /*
  public Todo[] filterTodosByAge(Todo[] todos, int targetAge) {
    return Arrays.stream(todos).filter(x -> x.age == targetAge).toArray(Todo[]::new);
  }
  /*

  /**
   * Get an array of all the users having the target company.
   *
   * @param todos         the list of users to filter by company
   * @param targetCompany the target company to look for
   * @return an array of all the users from the given list that have the target
   *         company
   */

   /*
  public Todo[] filterTodosByCompany(Todo[] todos, String targetCompany) {
    return Arrays.stream(todos).filter(x -> x.company.equals(targetCompany)).toArray(Todo[]::new);
  }
  */

}
