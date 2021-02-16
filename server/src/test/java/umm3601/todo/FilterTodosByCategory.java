package umm3601.todo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.io.IOException;
import java.util.HashMap;
import org.junit.jupiter.api.Test;

public class FilterTodosByCategory {
  @Test
  public void filterTodosByCategory() throws IOException {
    TodoDatabase db = new TodoDatabase("/todos.json");
    Todo[] allTodos = db.listTodos(new HashMap<>());

    Todo[] homeworkTodos = db.filterTodosByCategory(allTodos, "homework");
    assertEquals(79, homeworkTodos.length);

    Todo[] videogamesTodos = db.filterTodosByCategory(allTodos, "video games");
    assertEquals(71, videogamesTodos.length);
  }
}
