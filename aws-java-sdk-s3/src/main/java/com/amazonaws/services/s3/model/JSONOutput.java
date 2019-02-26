/*
 * Copyright 2018-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.s3.model;

import java.io.Serializable;

public class JSONOutput implements Serializable {
    private String recordDelimiter;

    /**
     * The value used to separate individual records in the output.
     */
    public Character getRecordDelimiter() {
        return stringToChar(recordDelimiter);
    }

    /**
     * The value used to separate individual records in the output.
     */
    public String getRecordDelimiterAsString() {
        return recordDelimiter;
    }

    /**
     * The value used to separate individual records in the output.
     */
    public void setRecordDelimiter(String recordDelimiter) {
        validateNotEmpty(recordDelimiter, "recordDelimiter");
        this.recordDelimiter = recordDelimiter;
    }

    /**
     * The value used to separate individual records in the output.
     */
    public JSONOutput withRecordDelimiter(String recordDelimiter) {
        setRecordDelimiter(recordDelimiter);
        return this;
    }

    /**
     * The value used to separate individual records in the output.
     */
    public void setRecordDelimiter(Character recordDelimiter) {
        setRecordDelimiter(charToString(recordDelimiter));
    }

    /**
     * The value used to separate individual records in the output.
     */
    public JSONOutput withRecordDelimiter(Character recordDelimiter) {
        setRecordDelimiter(recordDelimiter);
        return this;
    }

    private String charToString(Character character) {
        return character == null ? null : character.toString();
    }

    private Character stringToChar(String string) {
        // Should not be empty string (setters should call validateNotEmpty)
        return string == null ? null : string.charAt(0);
    }

    private void validateNotEmpty(String value, String valueName) {
        if ("".equals(value)) {
            // Prevent the empty string from being used. We convert the recordDelimiter to a Character in getRecordDelimiter,
            // and the empty string doesn't have a valid Character representation. It's never a valid input anyway.
            throw new IllegalArgumentException(valueName + " must not be empty-string.");
        }
    }
}
