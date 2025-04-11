
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;


public class Main{

        public static Long convertToTimeStamp(LocalDateTime date)
    {
        ZoneId zoneId = ZoneId.of("Asia/Kolkata");
        return date.atZone(zoneId).toInstant().toEpochMilli();
    }

    public static String convertTimestampToDate(Long timestamp)
    {
        ZoneId zoneId = ZoneId.of("Asia/Kolkata");
        LocalDateTime localDateTime = Instant.ofEpochMilli(timestamp).atZone(zoneId.systemDefault()).toLocalDateTime();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        String ltdstr = localDateTime.format(dateTimeFormatter);
        return ltdstr;
    }

    public static void main(String[] args){
        LocalDateTime dateinput = LocalDateTime.now();
        Long epochTime = convertToTimeStamp(dateinput);
        System.out.println(epochTime);
        String dateTime = convertTimestampToDate(epochTime);
        System.out.println(dateTime);
    }
}