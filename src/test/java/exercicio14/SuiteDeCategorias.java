package exercicio14;

import categorias.Positivos;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@Categories.IncludeCategory(Positivos.class)
@Suite.SuiteClasses({
        TesteCategorizado.class
})
public class SuiteDeCategorias {
}
