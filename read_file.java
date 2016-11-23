import java.io.*;
import java.util.*;
import java.net.*;
import java.nio.file.*;
import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import static java.util.Calendar.DAY_OF_YEAR;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class read_file {
    public static String lib_read_file_concat_0_2(String file_name) throws Exception
    {
        StringBuffer result = new StringBuffer();
        BufferedReader file = new BufferedReader(new InputStreamReader(new FileInputStream(file_name)));
        String line = file.readLine();
        while (line != null) {
            result.append(line);
            result.append("\n");
            line = file.readLine();
        }
        file.close();
        return result.toString();
    }
}