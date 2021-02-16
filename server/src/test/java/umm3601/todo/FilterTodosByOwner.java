package umm3601.todo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.io.IOException;
import java.util.HashMap;
import org.junit.jupiter.api.Test;

public class FilterTodosByOwner {
  @Test
  public void filterTodosByOwner() throws IOException {
    TodoDatabase db = new TodoDatabase("/todos.json");
    Todo[] allTodos = db.listTodos(new HashMap<>());

    Todo[] blancheTodos = db.filterTodosByOwner(allTodos, "Blanche");
    assertEquals(43, blancheTodos.length);

    Todo[] fryTodos = db.filterTodosByOwner(allTodos, "Fry");
    assertEquals(61, fryTodos.length);
  }
}
