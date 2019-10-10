import org.json.JSONArray;
import org.json.JSONObject;

public class JsonComplexo {
	public static void main(String[] args) {
		
		String json = "{" +
                "\"devmovies\":" + 
                "{" +
                "\"filme\":" +
                    "[" +
                    "{" +
                        "\"id\":1," +
                        "\"titulo\":\"Os Arquivos JSON\"," +
                        "\"ano\":1998," +
                        "\"resumo\":\"A história dos arquivos muito leves\"," +
                        "\"generos\":[\"Ação\",\"Sci-fi\",\"Drama\"]," + 
                        "\"elenco\":[\"Gillian Triggerson\",\"David Markupovny\"]" +
                    "}," +
                    "{" +
                        "\"id\":2," +
                        "\"titulo\":\"Sexta-feira 13: JSON Vive\"," +
                        "\"ano\":1986," +               
                        "\"generos\":[\"Ação\",\"Horror\"]," +
                        "\"elenco\":[\"Ann Labelvalue Pair\", \"Jennifer Json\", \"John Java\"]" +
                    "}" +
                    "]" +
                "}" +
        "}";
		
		JSONObject devMovies = new JSONObject(json);
		
		JSONObject filmes = devMovies.getJSONObject("devmovies");
		
		JSONArray arrayFilmes = filmes.getJSONArray("filme");
		
		for (int i = 0; i < arrayFilmes.length(); i++) {
			
			JSONObject f = arrayFilmes.getJSONObject(i);
			
			System.out.println("id: " + f.getInt("id"));
			System.out.println("titulo: " + f.getString("titulo"));
			System.out.println("ano: " + f.getInt("ano"));
			System.out.println("resumo: " + f.optString("resumo", "-"));
			
			
			// Genero
			JSONArray arrayGeneros = f.getJSONArray("generos");
			for (int y = 0; y < arrayGeneros.length(); y++) {
				System.out.println("Genero: " + (y + 1) + ": " + arrayGeneros.getString(y));
			} 
			
			// Elenco
			System.out.println("Elenco: ");
			JSONArray arrayElenco = f.getJSONArray("elenco");
			for (int z = 0; z < arrayElenco.length(); z++) {
				System.out.println("\t " + arrayElenco.getString(z));
			} 
			
			System.out.println();
			
		}
	}
}


















