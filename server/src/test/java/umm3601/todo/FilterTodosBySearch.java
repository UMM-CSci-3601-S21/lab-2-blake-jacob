package umm3601.todo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;

public class FilterTodosBySearch {
  @Test
  public void filterTodosByContains() throws IOException {
    TodoDatabase db = new TodoDatabase("/todos.json");
    Todo[] allTodos = db.listTodos(new HashMap<>());

    Todo[] magnaTodos = db.filterTodosByContains(allTodos, "magna");
    assertEquals(71, magnaTodos.length);

    Todo[] ipsumTodos = db.filterTodosByContains(allTodos, "Ipsum");
    assertEquals(12, ipsumTodos.length);
  }
}
