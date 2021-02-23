import com.itt.libreria.Autor;
import com.itt.libreria.Libro;

public class Principal {

	public static void main(String[] args) {
		//Creo el ubjeto autor
		Autor aut1  = new Autor("Pedro", "Es un tipo muy majo");
		//Creo el objeto Libro
		Libro libro1 = new Libro("cucurulu", "fabula", aut1);
		// lo muestro
		System.out.println(libro1.toString());
		//Modifico la biografia
		libro1.getAutor().setBiografia("ya no es tan majo");
		//Lo muestro
		System.out.println(libro1);
		
		//muestro el autor desde libro
		System.out.println(libro1.getAutor().getNombre());
		//Muestro el autor desde autor
		System.out.println(aut1.getNombre());
		//Modifico el genero
		libro1.setGenero("terror");
		//Lo muestro. 
		System.out.println(libro1);
		//Fin
	}

}
