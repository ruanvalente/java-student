package com.example.lambda.test;

import java.util.HashMap;
import java.util.stream.Collectors;

public class HasMapTest {
    public static void main(String[] args) {
        HashMap<String, String> stateMaps = getMap();

        String statePA = filteredState(stateMaps, "BA");

        System.out.println(statePA);

    }

    private static HashMap<String, String> getMap() {
        HashMap<String, String> map = new HashMap<>();

        map.put("Acre", "AC");
        map.put("Alagoas", "AL");
        map.put("Amapá", "AP");
        map.put("Amazonas", "AM");
        map.put("Bahia", "BA");
        map.put("Ceará", "CE");
        map.put("Distrito Federal", "DF");
        map.put("Espírito Santa", "ES");
        map.put("Goiás", "GO");
        map.put("Maranhão", "MA");
        map.put("Mato Grosso", "MT");
        map.put("Mato Grosso do Sul", "MS");
        map.put("Minas Gerais", "MG");
        map.put("Pará", "PA");
        map.put("Paraíba", "PB");
        map.put("Paraná", "PR");
        map.put("Pernambuco", "PE");
        map.put("Piauí", "PI");
        map.put("Rio de Janeiro", "RJ");
        map.put("Rio Grande do Norte", "RN");
        map.put("Rio Grande do Sul", "RS");
        map.put("Rondônia", "RO");
        map.put("Roraima", "RR");
        map.put("Santa Catarina", "SC");
        map.put("São Paulo", "SP");
        map.put("Sergipe", "SE");
        map.put("Tocantins", "TO");

        return map;
    }

    private static String filteredState(HashMap<String, String> map, String stateParam) {

        return map.values()
                .stream()
                .filter(stateParam::equals)
                .collect(Collectors.joining());
    }
}

