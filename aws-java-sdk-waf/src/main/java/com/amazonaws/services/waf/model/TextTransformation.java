/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.waf.model;

/**
 * 
 */
public enum TextTransformation {

    NONE("NONE"),
    COMPRESS_WHITE_SPACE("COMPRESS_WHITE_SPACE"),
    HTML_ENTITY_DECODE("HTML_ENTITY_DECODE"),
    LOWERCASE("LOWERCASE"),
    CMD_LINE("CMD_LINE"),
    URL_DECODE("URL_DECODE");

    private String value;

    private TextTransformation(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value
     *        real value
     * @return TextTransformation corresponding to the value
     */
    public static TextTransformation fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if ("NONE".equals(value)) {
            return NONE;
        } else if ("COMPRESS_WHITE_SPACE".equals(value)) {
            return COMPRESS_WHITE_SPACE;
        } else if ("HTML_ENTITY_DECODE".equals(value)) {
            return HTML_ENTITY_DECODE;
        } else if ("LOWERCASE".equals(value)) {
            return LOWERCASE;
        } else if ("CMD_LINE".equals(value)) {
            return CMD_LINE;
        } else if ("URL_DECODE".equals(value)) {
            return URL_DECODE;
        } else {
            throw new IllegalArgumentException("Cannot create enum from "
                    + value + " value!");
        }
    }
}