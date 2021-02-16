package umm3601.todo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.io.IOException;
import java.util.HashMap;
import org.junit.jupiter.api.Test;

import jdk.jfr.Timestamp;

public class FullTodoList {

  @Test
  public void totalTodoCount() throws IOException {
    TodoDatabase db = new TodoDatabase("/todos.json");
    Todo[] allTodos = db.listTodos(new HashMap<>());
    assertEquals(300, allTodos.length);
  }
}
