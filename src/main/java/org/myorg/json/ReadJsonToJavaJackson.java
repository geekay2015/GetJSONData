package org.myorg.json;

import org.codehaus.jackson.JsonFactory;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonToken;
import org.codehaus.jackson.map.JsonMappingException;

import java.io.File;
import java.io.IOException;

public class ReadJsonToJavaJackson {
    public static void main(String[] args) throws Exception{
        try {
            JsonFactory jsonFactory = new JsonFactory();

            //Read from the JSON file
            JsonParser  jsonParser = jsonFactory.createJsonParser(
                    new File("src/main/resources/sample-json.json")
            );

            //Loop untill token equal to "}'
            while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
                String fieldname =jsonParser.getCurrentName();
                if ("MODEL".equals(fieldname)) {
                    //CURRENT TOKEN IS MODEL
                    //MOVE NEXT WHICH IS MODEL VALUE
                    jsonParser.nextToken();
                    System.out.println(jsonParser.getText());
                }

                if ("ESN".equals(fieldname)) {
                    //CURRENT TOKEN IS ESN
                    //MOVE NEXT WHICH IS ESN VALUE
                    jsonParser.nextToken();
                    System.out.println(jsonParser.getText());
                }

                if ("LOCATION".equals(fieldname)) {
                    //CURRENT TOKEN IS LOCATION
                    //MOVE NEXT WHICH IS LOCATION VALUE
                    jsonParser.nextToken();
                    System.out.println(jsonParser.getText());
                }

                if ("CELL".equals(fieldname)) {
                    //CURRENT TOKEN IS CELL
                    //MOVE NEXT WHICH IS CELL VALUE
                    jsonParser.nextToken();
                    System.out.println(jsonParser.getText());
                }

                if ("TEST_ID".equals(fieldname)) {
                    //CURRENT TOKEN IS TEST_ID
                    //MOVE NEXT WHICH IS TEST_ID VALUE
                    jsonParser.nextToken();
                    System.out.println(jsonParser.getText());
                }

                if ("TEST".equals(fieldname)) {
                    //CURRENT TOKEN IS TEST
                    //MOVE NEXT WHICH IS TEST VALUE
                    jsonParser.nextToken();
                    System.out.println(jsonParser.getText());
                }

                if ("RDG".equals(fieldname)) {
                    //CURRENT TOKEN IS RDG
                    //MOVE NEXT WHICH IS RDG VALUE
                    jsonParser.nextToken();
                    System.out.println(jsonParser.getText());
                }

                if ("TESTDATE".equals(fieldname)) {
                    //CURRENT TOKEN IS TESTDATE
                    //MOVE NEXT WHICH IS TESTDATE VALUE
                    jsonParser.nextToken();
                    System.out.println(jsonParser.getText());
                }

                if ("DATATYPE".equals(fieldname)) {
                    //CURRENT TOKEN IS DATATYPE
                    //MOVE NEXT WHICH IS DATATYPE VALUE
                    jsonParser.nextToken();
                    System.out.println(jsonParser.getText());
                }

                if ("TESTTYPE".equals(fieldname)) {
                    //CURRENT TOKEN IS TESTTYPE
                    //MOVE NEXT WHICH IS TESTTYPE VALUE
                    jsonParser.nextToken();
                    System.out.println(jsonParser.getText());
                }

                if ("RATING".equals(fieldname)) {
                    //CURRENT TOKEN IS RATING
                    //MOVE NEXT WHICH IS RATING VALUE
                    jsonParser.nextToken();
                    System.out.println(jsonParser.getText());
                }

                if ("STORDATE".equals(fieldname)) {
                    //CURRENT TOKEN IS STORDATE
                    //MOVE NEXT WHICH IS STORDATE VALUE
                    jsonParser.nextToken();
                    System.out.println(jsonParser.getText());
                }

                if ("TEST_ITEM_TYPE_ID".equals(fieldname)) {
                    //CURRENT TOKEN IS TEST_ITEM_TYPE_ID
                    //MOVE NEXT WHICH IS TEST_ITEM_TYPE_ID VALUE
                    jsonParser.nextToken();
                    System.out.println(jsonParser.getText());
                }

                if ("STATUS".equals(fieldname)) {
                    //CURRENT TOKEN IS STATUS
                    //MOVE NEXT WHICH IS STATUS VALUE
                    jsonParser.nextToken();
                    System.out.println(jsonParser.getText());
                }

                if ("TEST_METHOD".equals(fieldname)) {
                    //CURRENT TOKEN IS TEST_METHOD
                    //MOVE NEXT WHICH IS TEST_METHOD VALUE
                    jsonParser.nextToken();
                    System.out.println(jsonParser.getText());
                }

                if ("VEHICLE".equals(fieldname)) {
                    //CURRENT TOKEN IS VEHICLE
                    //MOVE NEXT WHICH IS VEHICLE VALUE
                    jsonParser.nextToken();
                    System.out.println(jsonParser.getText());
                }

                if ("RDGTYPE".equals(fieldname)) {
                    //CURRENT TOKEN IS RDGTYPE
                    //MOVE NEXT WHICH IS RDGTYPE VALUE
                    jsonParser.nextToken();
                    System.out.println(jsonParser.getText());
                }

                if ("ENGPOS".equals(fieldname)) {
                    //CURRENT TOKEN IS ENGPOS
                    //MOVE NEXT WHICH IS ENGPOS VALUE
                    jsonParser.nextToken();
                    System.out.println(jsonParser.getText());
                }

                if ("ANALYNUM".equals(fieldname)) {
                    //CURRENT TOKEN IS ANALYNUM
                    //MOVE NEXT WHICH IS ANALYNUM VALUE
                    jsonParser.nextToken();
                    System.out.println(jsonParser.getText());
                }

                if ("FILE_NAME".equals(fieldname)) {
                    //CURRENT TOKEN IS FILE_NAME
                    //MOVE NEXT WHICH IS FILE_NAME VALUE
                    jsonParser.nextToken();
                    System.out.println(jsonParser.getText());
                }

                if ("POWERSET".equals(fieldname)) {
                    //CURRENT TOKEN IS POWERSET
                    //MOVE NEXT WHICH IS POWERSET VALUE
                    jsonParser.nextToken();
                    System.out.println(jsonParser.getText());
                }

                if ("JNUM".equals(fieldname)) {
                    //CURRENT TOKEN IS JNUM
                    //MOVE NEXT WHICH IS JNUM VALUE
                    jsonParser.nextToken();
                    System.out.println(jsonParser.getText());
                }

                if ("FILE_DATA_IND".equals(fieldname)) {
                    //CURRENT TOKEN IS FILE_DATA_IND
                    //MOVE NEXT WHICH IS FILE_DATA_IND VALUE
                    jsonParser.nextToken();
                    System.out.println(jsonParser.getText());
                }

                if ("FILE_DATA_FILENAME".equals(fieldname)) {
                    //CURRENT TOKEN IS FILE_DATA_FILENAME
                    //MOVE NEXT WHICH IS FILE_DATA_FILENAME VALUE
                    jsonParser.nextToken();
                    System.out.println(jsonParser.getText());
                }

                if ("FLEET_NAME".equals(fieldname)) {
                    //CURRENT TOKEN IS FLEET_NAME
                    //MOVE NEXT WHICH IS FLEET_NAME VALUE
                    jsonParser.nextToken();
                    System.out.println(jsonParser.getText());
                }

                if ("AIRCRAFT_TAIL_NUM".equals(fieldname)) {
                    //CURRENT TOKEN IS AIRCRAFT_TAIL_NUM
                    //MOVE NEXT WHICH IS AIRCRAFT_TAIL_NUM VALUE
                    jsonParser.nextToken();
                    System.out.println(jsonParser.getText());
                }

                if ("AIRCRAFT_TYPE_NAME".equals(fieldname)) {
                    //CURRENT TOKEN IS AIRCRAFT_TYPE_NAME
                    //MOVE NEXT WHICH IS AIRCRAFT_TYPE_NAME VALUE
                    jsonParser.nextToken();
                    System.out.println(jsonParser.getText());
                }

                if ("FLIGHT_NUM".equals(fieldname)) {
                    //CURRENT TOKEN IS FLIGHT_NUM
                    //MOVE NEXT WHICH IS FLIGHT_NUM VALUE
                    jsonParser.nextToken();
                    System.out.println(jsonParser.getText());
                }

                if ("PARAMETERNAME".equals(fieldname)) {
                    //CURRENT TOKEN IS PARAMETERNAME
                    //MOVE NEXT WHICH IS PARAMETERNAME VALUE
                    jsonParser.nextToken();
                    System.out.println(jsonParser.getText());
                }

                if ("PARAMETER_ID".equals(fieldname)) {
                    //CURRENT TOKEN IS PARAMETER_ID
                    //MOVE NEXT WHICH IS PARAMETER_ID VALUE
                    jsonParser.nextToken();
                    System.out.println(jsonParser.getText());
                }

                if ("PARAMETERVALUE".equals(fieldname)) {
                    //CURRENT TOKEN IS PARAMETERVALUE
                    //MOVE NEXT WHICH IS PARAMETERVALUE VALUE
                    jsonParser.nextToken();
                    System.out.println(jsonParser.getText());
                }
            }
            jsonParser.close();
        }
        catch (JsonGenerationException e) {e.printStackTrace();}
        catch (JsonMappingException e) {e.printStackTrace();}
        catch (IOException e) {e.printStackTrace();}

    }
}
