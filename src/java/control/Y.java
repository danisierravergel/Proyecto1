package control;

import model.Z;
import model.Z.KeyValue;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "PieChartMBean")
@ViewScoped
public class Y implements Serializable {

/**
*
*/
private static final long serialVersionUID = 1L;

private String pieChartData;
private String Key;
private String Value;
private List<KeyValue> pieDataList;

public Y() {
this.pieDataList = Z.getPieDataList();
}


public String getPieChartData() {
if (pieChartData == null || pieChartData.trim().length() <= 0) {
populateData();
}
return pieChartData;
}

private void populateData() {
StringBuilder stringBuilder = new StringBuilder();
for (KeyValue pieData : pieDataList) {
stringBuilder.append("[");
stringBuilder.append("'");
stringBuilder.append(pieData.getKey());
stringBuilder.append("'");
stringBuilder.append(",");
stringBuilder.append(pieData.getValue());
stringBuilder.append("]");
stringBuilder.append(",");
}
pieChartData = stringBuilder.toString().substring(0,
stringBuilder.toString().length() - 1);
}


public String getKey() {
    return Key;
    }

public void setKey(String key) {
        this.Key = key;
    }

public String getValue() {
return Value;
}

public void setValue(String value) {
this.Value = value;
}

}