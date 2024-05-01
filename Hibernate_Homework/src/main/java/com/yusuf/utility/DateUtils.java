package com.yusuf.utility;

import java.time.LocalDate;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

public class DateUtils {

        private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        public static long convertStringToLong(String dateString) {
            LocalDate localDate = LocalDate.parse(dateString, formatter);
            return localDate.atStartOfDay().toEpochSecond(ZoneOffset.UTC) * 1000;
        }

        public static String convertLongToString(long dateAsLong) {
            LocalDate localDate = LocalDate.ofEpochDay(dateAsLong / 86400);
            return localDate.format(formatter);
        }

}


