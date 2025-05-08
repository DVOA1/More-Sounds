package dev.dvoa.moresounds.utils.helpers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MorePatternHelper {
    private static final Pattern GROUP = Pattern.compile("\\(([^()]+)\\)");

    public static List<String> expand(String pattern) {
        Matcher m = GROUP.matcher(pattern);
        if (!m.find()) {
            return Collections.singletonList(pattern);
        }

        List<String> results = new ArrayList<>();
        String group = m.group(0);
        String content = m.group(1);
        String[] options = content.split("\\|");

        for (String opt : options) {
            String next = pattern.substring(0, m.start()) + opt + pattern.substring(m.end());
            results.addAll(expand(next));
        }
        return results;
    }
}
