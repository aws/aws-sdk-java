/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.util;

import com.amazonaws.annotation.SdkInternalApi;

@SdkInternalApi
public enum TimestampFormat {

    ISO_8601("iso8601"),
    UNIX_TIMESTAMP("unixTimestamp"),
    UNIX_TIMESTAMP_IN_MILLIS("unixTimestampInMillis"),
    RFC_822("rfc822"),
    UNKNOWN("unknown");

    private final String format;

    TimestampFormat(String format) {
        this.format = format;
    }

    public String getFormat() {
        return format;
    }

    public static TimestampFormat fromValue(String format) {
        if (format == null) {
            return null;
        }

        for (TimestampFormat timestampFormat : TimestampFormat.values()) {
            if (timestampFormat.format.equals(format)) {
                return timestampFormat;
            }
        }

        throw new IllegalArgumentException("Unknown enum value for TimestampFormat : " + format);
    }
}