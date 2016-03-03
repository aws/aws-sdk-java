/*
 * Copyright (c) 2016. Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 * http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.codegen.internal;

import static com.amazonaws.codegen.internal.Constants.EXCEPTION_CLASS_SUFFIX;
import static com.amazonaws.codegen.internal.Constants.REQUEST_CLASS_SUFFIX;
import static com.amazonaws.codegen.internal.Constants.RESPONSE_CLASS_SUFFIX;
import static com.amazonaws.codegen.internal.Constants.VARIABLE_NAME_SUFFIX;
import static com.amazonaws.codegen.internal.Constants.FAULT_CLASS_SUFFIX;
import static com.amazonaws.codegen.internal.Utils.unCapitialize;
import static com.amazonaws.codegen.internal.Utils.capitialize;

import java.util.ArrayList;
import java.util.List;

import com.amazonaws.util.StringUtils;

public class NameUtils {

    private final static List<String> reservedKeywords = new ArrayList<String>();

    static {
        reservedKeywords.add("return");
        reservedKeywords.add("public");
        reservedKeywords.add("private");
        reservedKeywords.add("class");
        reservedKeywords.add("static");
        reservedKeywords.add("protected");
        reservedKeywords.add("return");
        reservedKeywords.add("string");
        reservedKeywords.add("boolean");
        reservedKeywords.add("integer");
        reservedKeywords.add("int");
        reservedKeywords.add("char");
        reservedKeywords.add("null");
        reservedKeywords.add("double");
        reservedKeywords.add("object");
        reservedKeywords.add("short");
        reservedKeywords.add("long");
        reservedKeywords.add("float");
        reservedKeywords.add("byte");
        reservedKeywords.add("bigDecimal");
        reservedKeywords.add("bigInteger");
        reservedKeywords.add("protected");
        reservedKeywords.add("inputStream");
        reservedKeywords.add("bytebuffer");
        reservedKeywords.add("date");
        reservedKeywords.add("list");
        reservedKeywords.add("map");
    }

    public static String getExceptionName(String exception) {

        if (exception.endsWith(FAULT_CLASS_SUFFIX)) {
            return capitialize(
                    exception.substring(0, exception.length()-FAULT_CLASS_SUFFIX.length()) + EXCEPTION_CLASS_SUFFIX);
        } else if (exception.endsWith(EXCEPTION_CLASS_SUFFIX)) {
            return capitialize(exception);
        }
        return capitialize(exception + EXCEPTION_CLASS_SUFFIX);
    }

    public static String getRequestClassName(String shapeName, String operation) {
        return capitialize(operation + REQUEST_CLASS_SUFFIX);
    }

    public static String getResponseClassName(String shapeName, String operation) {
        return capitialize(operation + RESPONSE_CLASS_SUFFIX);
    }

    public static String getVariableName(String name) {
        if (isJavaKeyword(name)) {
            return unCapitialize(name + VARIABLE_NAME_SUFFIX);
        } else {
            return unCapitialize(name);
        }
    }

    public static String getEnumName(String name) {
        StringBuilder builder = new StringBuilder();

        String sanitizedEnumValue = name
                .replace("::", ":")
                .replace("/", "")
                .replace("(", "")
                .replace(")", "");

        for (String part : sanitizedEnumValue.split("[ -.:]")) {
            if (part.length() > 1) {
                builder.append(StringUtils.upperCase(part.substring(0, 1)))
                        .append(part.substring(1));
            } else {
                builder.append(StringUtils.upperCase(part));
            }
        }

        return builder.toString();
    }

    public static String getJavaClassName(String name) {
        return capitialize(name);
    }

    public static boolean isJavaKeyword(String word) {
        return reservedKeywords.contains(word)
                || reservedKeywords.contains(StringUtils.lowerCase(word));
    }
}
