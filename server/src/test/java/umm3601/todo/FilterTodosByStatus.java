package umm3601.todo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.io.IOException;
import java.util.HashMap;
import org.junit.jupiter.api.Test;

public class FilterTodosByStatus {
  @Test
  public void filterTodosByStatus() throws IOException {
    TodoDatabase db = new TodoDatabase("/todos.json");
    Todo[] allTodos = db.listTodos(new HashMap<>());

    Todo[] completeTodos = db.filterTodosByStatus(allTodos, true);
    assertEquals(143, completeTodos.length);

    Todo[] incompleteTodos = db.filterTodosByStatus(allTodos, false);
    assertEquals(157, incompleteTodos.length);
  }
}
