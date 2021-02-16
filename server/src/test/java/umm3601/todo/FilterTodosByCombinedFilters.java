package umm3601.todo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;

public class FilterTodosByCombinedFilters {

  @Test
  public void listTodos() throws IOException {
    TodoDatabase db = new TodoDatabase("/todos.json");
    Map<String, List<String>> queryParams = new HashMap<>();

    queryParams.put("owner", Arrays.asList(new String[] {"Blanche"}));
    Todo[] blancheTodo = db.listTodos(queryParams);
    assertEquals(43, blancheTodo.length);

    queryParams.clear();
    queryParams.put("status", Arrays.asList(new String[] {"complete"}));
    Todo[] completeTodo = db.listTodos(queryParams);
    assertEquals(143, completeTodo.length);

    queryParams.clear();
    queryParams.put("category", Arrays.asList(new String[] {"video games"}));
    Todo[] videogamesTodo = db.listTodos(queryParams);
    assertEquals(71, videogamesTodo.length);

    queryParams.clear();
    queryParams.put("owner", Arrays.asList(new String[] {"Blanche"}));
    queryParams.put("status", Arrays.asList(new String[] {"complete"}));
    queryParams.put("category",  Arrays.asList(new String[] {"video games"}));
    queryParams.put("contains", Arrays.asList(new String[] {"magna"}));
    Todo[] combinedTodo = db.listTodos(queryParams);
    assertEquals(2, combinedTodo.length);
    queryParams.put("limit", Arrays.asList(new String[] {"1"}));
    Todo[] combinedLimitTodo = db.listTodos(queryParams);
    assertEquals(1, combinedLimitTodo.length);
  }

}
