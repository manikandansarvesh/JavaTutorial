package com.test;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

import java.util.ArrayList;
import java.util.Iterator;

public class ExcelReader {

    public static void main(String[] args) throws FilloException {
        ExcelReader excelReader = new ExcelReader();
        String countryCode = getTestValue("TC_02","CountryCode");
        System.out.println(countryCode);
    }

        public static String getTestValue(String TCID, String fieldName) throws FilloException{

            String testString=xlTesting(TCID, fieldName);
            return testString;

        }

        public static String xlTesting(String tcid,String fieldName) throws FilloException{
            String testval=null;
            Fillo fillo=new Fillo();
            Connection connection=fillo.getConnection("C:\\\\Users\\\\Dell\\\\Documents\\\\FilloExample.xlsx");
            String strQuery="Select * from Example where RunStatus='Yes' and TestCaseName='"+tcid+"'";
            Recordset recordset=connection.executeQuery(strQuery);
            while(recordset.next()){
                ArrayList<String> dataColl=recordset.getFieldNames();
                //System.out.println(dataColl);
                Iterator<String> dataIterator=dataColl.iterator();
                //System.out.println(dataColl.size());

                while(dataIterator.hasNext()){
                    for (int i=0;i<=dataColl.size()-1;i++) {
                        //System.out.println(i);
                        String data = dataIterator.next();
                        String dataVal = recordset.getField(data);
                       // System.out.println(dataVal);
                    }

                    testval=recordset.getField(fieldName);
                    System.out.println("**********"+testval+"*********");

                       /* if (dataVal.equalsIgnoreCase(fieldName)){
                            //System.out.println("passed");
                            i=i+1;
                            //System.out.println(i);
                            String testData=dataColl.get(i);
                            //System.out.println(recordset.getField(testData));
                            String testValue= recordset.getField(testData);
                            testval=testValue;
                        }
*/
                    }

                    break;
                }


            recordset.close();
            connection.close();
            return testval;
        }



    }
    /*public static String getData(String columName) throws FilloException {
        String result = null;
        Fillo fillo=new Fillo();
        Connection connection=fillo.getConnection("C:\\Users\\Dell\\Documents\\FilloExample.xlsx");
        String strQuery="Select * from Example where RunStatus='Yes'";
        Recordset recordset=connection.executeQuery(strQuery);

        while(recordset.next()) {
            ArrayList<String> arrList = recordset.getFieldNames();
          result = recordset.getField(columName);
        }recordset.close();
        connection.close();
        return result;
    }*/



