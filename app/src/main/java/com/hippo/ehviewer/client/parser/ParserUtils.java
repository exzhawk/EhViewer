/*
 * Copyright 2015 Hippo Seven
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.hippo.ehviewer.client.parser;

import com.hippo.yorozuya.NumberUtils;
import com.hippo.yorozuya.StringUtils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParserUtils {

    public static final DateFormat sDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.US);

    private static final Pattern PATTERN_OFFSET = Pattern.compile("\\d[dwmy]");
    private static final List<SimpleDateFormat> FORMATS_DATE = Arrays.asList(
            new SimpleDateFormat("y", Locale.US),
            new SimpleDateFormat("y-MM", Locale.US),
            new SimpleDateFormat("y-MM-dd", Locale.US)
    );
    public final static int IS_INVALID = 0;
    public final static int IS_JUMP = 1;
    public final static int IS_SEEK = 2;

    public static synchronized int parseJumpSeek(String text) {
        Matcher offsetMatcher = PATTERN_OFFSET.matcher(text);
        if (offsetMatcher.find()) {
            return IS_JUMP;
        }
        for (SimpleDateFormat formatDate : FORMATS_DATE) {
            try {
                formatDate.parse(text);
                return IS_SEEK;
            } catch (ParseException ignored) {

            }
        }
        return IS_INVALID;
    }

    public static synchronized String formatDate(long time) {
        return sDateFormat.format(new Date(time));
    }

    public static String trim(String str) {
        // Avoid null
        if (str == null) {
            str = "";
        }
        return StringUtils.unescapeXml(str).trim();
    }

    public static int parseInt(String str, int defValue) {
        return NumberUtils.parseIntSafely(trim(str).replace(",", ""), defValue);
    }

    public static long parseLong(String str, long defValue) {
        return NumberUtils.parseLongSafely(trim(str).replace(",", ""), defValue);
    }

    public static float parseFloat(String str, float defValue) {
        return NumberUtils.parseFloatSafely(trim(str).replace(",", ""), defValue);
    }
}
