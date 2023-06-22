package seminar2;

import java.util.Arrays;

/*
Дана строка sql-запроса "select * from students WHERE ". Сформируйте часть WHERE этого запроса, используя StringBuilder.
 Данные для фильтрации приведены ниже в виде json-строки.
Если значение null, то параметр не должен попадать в запрос.
Пример данной строки {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
Вывод: select * from students WHERE name=Ivanov AND country=Russia AND city=Moscow
 */
public class Task1 {
    public static void main(String[] args) {
        String request = "select * from students WHERE ";
        String data = "{'name':'Ivanov', 'country':'Russia', 'city':'Moscow', 'age':'null'}";
        data = data.substring(1,data.length()-1);
        StringBuilder result = new StringBuilder();
        String[] str = data.split(", ");
        for (String element : str) {
            String[] temp = element.split(":");
            if (!temp[1].equals("'null'")){
                result.append(temp[0]).append("=").append(temp[1]);
            }
        }
        String res = request + result.toString().replace("''"," AND ").replace("'","");
        System.out.println(res);
    }
}
