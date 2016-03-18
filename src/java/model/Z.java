package model;

import java.util.ArrayList;
import java.util.List;

public class Z {

private static final List<KeyValue> pieDataList;

static {

//Conjunto de Datos    
int x = (int) Math.floor(Math.random()*3+1); 
int y = 0;
int acum = 0;
String aux = null; 
pieDataList = new ArrayList<Z.KeyValue>();

if(x == 1){
String a[] = {"Japon","Russia","España","Colombia","Canada"};
for (int i = 1; i < a.length; i++) {
    aux = ""+a[i];
    y = (int) Math.floor(Math.random()*500000+1);
    acum = acum + y;
    if (acum > 1000000){
        y = 0;
        i = a.length;
    }
    pieDataList.add(new KeyValue(aux,""+y+""));
    }
}

if(x == 2){
String a[] = {"Perros","Gatos","Peces","Roedores","Canarios","Loros"};
for (int i = 1; i < a.length; i++) {
    aux = ""+a[i];
    y = (int) Math.floor(Math.random()*500000+1);
    acum = acum + y;
    if (acum > 1000000){
        y = 0;
        i = a.length;
    }
    pieDataList.add(new KeyValue(aux,""+y+""));
    }
}

if(x == 3){
String a[] = {"Futbol","Basketbol","Tennis","Ping Pong","Voleibol","Ultimate"};
for (int i = 1; i < a.length; i++) {
    aux = ""+a[i];
    y = (int) Math.floor(Math.random()*500000+1);
    acum = acum + y;
    if (acum > 1000000){
        y = 0;
        i = a.length;
    }
    pieDataList.add(new KeyValue(aux,""+y+""));
    }
}

}

public static List<KeyValue> getPieDataList() {
return pieDataList;
}

public static class KeyValue {
String key;
String value;

public KeyValue(String key, String value) {
super();
this.key = key;
this.value = value;
}

public String getKey() {
return key;
}

public void setKey(String key) {
this.key = key;
}

public String getValue() {
return value;
}

public void setValue(String value) {
this.value = value;
}

}

}