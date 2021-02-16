package umm3601.todo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.io.IOException;
import java.util.HashMap;
import org.junit.jupiter.api.Test;

public class FilterTodosByLimiting {

  @Test
  public void filterTodosByLimit() throws IOException {
    TodoDatabase db = new TodoDatabase("/todos.json");
    Todo[] allTodos = db.listTodos(new HashMap<>());

    Todo[] limit7Todos = db.filterTodosByLimit(allTodos, 7);
    assertEquals(7, limit7Todos.length);

    Todo[] limit10Todos = db.filterTodosByLimit(allTodos, 10);
    assertEquals(10, limit10Todos.length);
  }
}
