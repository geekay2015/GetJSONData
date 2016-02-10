package org.myorg.json;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadJsonToJava {

    //Define a String
    private static final String filePath = "/Users/gangadharkadam/myapps/GetJSONData/src/main/resources/sample-json.json";

    //The Main Class
    public static void main(String[] args) {

        try {
            // read the json file usin the File Reader
            FileReader reader = new FileReader(filePath);

            //Define a JSON SIMPLE parser
            JSONParser jsonParser = new JSONParser();

            //Define a JSON SIMPLE Object
            JSONObject jsonObject = (JSONObject) jsonParser.parse(reader);


            // handle the row1 structure into the json object
            JSONObject R1 = (JSONObject) jsonObject.get("R1");
            System.out.println("1: " +
                            R1.get("MODEL") + "," +
                            R1.get("ESN") + "," +
                            R1.get("LOCATION") + "," +
                            R1.get("CELL") + "," +
                            R1.get("TEST_ID") + "," +
                            R1.get("TEST") + "," +
                            R1.get("RDG") + "," +
                            R1.get("TESTDATE") + "," +
                            R1.get("DATATYPE") + "," +
                            R1.get("TESTTYPE") + "," +
                            R1.get("RATING") + "," +
                            R1.get("STORDATE") + "," +
                            R1.get("TEST_ITEM_TYPE_ID") + "," +
                            R1.get("STATUS") + "," +
                            R1.get("TEST_METHOD") + "," +
                            R1.get("VEHICLE") + "," +
                            R1.get("RDGTYPE") + "," +
                            R1.get("ENGPOS") + "," +
                            R1.get("ANALYNUM") + "," +
                            R1.get("FILE_NAME") + "," +
                            R1.get("POWERSET") + "," +
                            R1.get("JNUM") + "," +
                            R1.get("FILE_DATA_IND") + "," +
                            R1.get("FILE_DATA_FILENAME") + "," +
                            R1.get("FLEET_NAME NONE") + "," +
                            R1.get("AIRCRAFT_TAIL_NUM NONE") + "," +
                            R1.get("AIRCRAFT_TYPE_NAME NONE") + "," +
                            R1.get("FLIGHT_NUM") + "," +
                            R1.get("PARAMETERNAME") + "," +
                            R1.get("PARAMETER_ID") + "," +
                            R1.get("PARAMETERVALUE")

            );

            // handle the row1 structure into the json object
            JSONObject R2 = (JSONObject) jsonObject.get("R2");
            System.out.println("2: " +
                    R2.get("MODEL") + "," +
                            R2.get("ESN") + "," +
                            R2.get("LOCATION") + "," +
                            R2.get("CELL") + "," +
                            R2.get("TEST_ID") + "," +
                            R2.get("TEST") + "," +
                            R2.get("RDG") + "," +
                            R2.get("TESTDATE") + "," +
                            R2.get("DATATYPE") + "," +
                            R2.get("TESTTYPE") + "," +
                            R2.get("RATING") + "," +
                            R2.get("STORDATE") + "," +
                            R2.get("TEST_ITEM_TYPE_ID") + "," +
                            R2.get("STATUS") + "," +
                            R2.get("TEST_METHOD") + "," +
                            R2.get("VEHICLE") + "," +
                            R2.get("RDGTYPE") + "," +
                            R2.get("ENGPOS") + "," +
                            R2.get("ANALYNUM") + "," +
                            R2.get("FILE_NAME") + "," +
                            R2.get("POWERSET") + "," +
                            R2.get("JNUM") + "," +
                            R2.get("FILE_DATA_IND") + "," +
                            R2.get("FILE_DATA_FILENAME") + "," +
                            R2.get("FLEET_NAME NONE") + "," +
                            R2.get("AIRCRAFT_TAIL_NUM NONE") + "," +
                            R2.get("AIRCRAFT_TYPE_NAME NONE") + "," +
                            R2.get("FLIGHT_NUM") + "," +
                            R2.get("PARAMETERNAME") + "," +
                            R2.get("PARAMETER_ID") + "," +
                            R2.get("PARAMETERVALUE")

            );

            // handle the row3 structure into the json object
            JSONObject R3 = (JSONObject) jsonObject.get("R3");
            System.out.println("3: " +
                    R3.get("MODEL") + "," +
                            R3.get("ESN") + "," +
                            R3.get("LOCATION") + "," +
                            R3.get("CELL") + "," +
                            R3.get("TEST_ID") + "," +
                            R3.get("TEST") + "," +
                            R3.get("RDG") + "," +
                            R3.get("TESTDATE") + "," +
                            R3.get("DATATYPE") + "," +
                            R3.get("TESTTYPE") + "," +
                            R3.get("RATING") + "," +
                            R3.get("STORDATE") + "," +
                            R3.get("TEST_ITEM_TYPE_ID") + "," +
                            R3.get("STATUS") + "," +
                            R3.get("TEST_METHOD") + "," +
                            R3.get("VEHICLE") + "," +
                            R3.get("RDGTYPE") + "," +
                            R3.get("ENGPOS") + "," +
                            R3.get("ANALYNUM") + "," +
                            R3.get("FILE_NAME") + "," +
                            R3.get("POWERSET") + "," +
                            R3.get("JNUM") + "," +
                            R3.get("FILE_DATA_IND") + "," +
                            R3.get("FILE_DATA_FILENAME") + "," +
                            R3.get("FLEET_NAME NONE") + "," +
                            R3.get("AIRCRAFT_TAIL_NUM NONE") + "," +
                            R3.get("AIRCRAFT_TYPE_NAME NONE") + "," +
                            R3.get("FLIGHT_NUM") + "," +
                            R3.get("PARAMETERNAME") + "," +
                            R3.get("PARAMETER_ID") + "," +
                            R3.get("PARAMETERVALUE")

            );

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ParseException ex) {
            ex.printStackTrace();
        } catch (NullPointerException ex) {
            ex.printStackTrace();
        }

    }

}
