import org.json.JSONObject;

import com.google.gson.Gson;

import model.Carro;

public class Aplicacao {
	
	private static void adicaoDeDadosJSON() {
		Carro carro = new Carro();
		carro.setId(1L);
		carro.setModelo("Celta");
		carro.setPlaca("AAA1234");
		
		// Criação objeto JSON
		JSONObject carroJson = new JSONObject();
		
		carroJson.put("id", carro.getId());
		carroJson.put("modelo", carro.getModelo());
		carroJson.put("placa", carro.getPlaca());
		
		System.out.println(carroJson);
	}
	
	public static void adicaoObjeto() {
		Carro carro = new Carro();
		carro.setId(1L);
		carro.setModelo("Celta");
		carro.setPlaca("AAA1234");
		
		JSONObject carroJson = new JSONObject();
		carroJson.put("carro", carro);
		
		System.out.println(carroJson);
	}
	
	public static void main(String[] args) {
		adicaoDeDadosJSON();
		
		adicaoObjeto();
	}

	
}
