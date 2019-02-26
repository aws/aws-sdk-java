/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.auth.internal;

import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 * Utility methods that is used by the different AWS Signer implementations.
 * This class is strictly internal and is subjected to change.
 */
public final class AWS4SignerUtils {

    private static final DateTimeFormatter dateFormatter = DateTimeFormat
            .forPattern("yyyyMMdd").withZoneUTC();

    private static final DateTimeFormatter timeFormatter = DateTimeFormat
            .forPattern("yyyyMMdd'T'HHmmss'Z'").withZoneUTC();

    /**
     * Returns a string representation of the given date time in yyyyMMdd
     * format. The date returned is in the UTC zone.
     *
     * For example, given a time "1416863450581", this method returns "20141124"
     */
    public static String formatDateStamp(long timeMilli) {
        return dateFormatter.print(timeMilli);
    }

    /**
     * Returns a string representation of the given date time in
     * yyyyMMdd'T'HHmmss'Z' format. The date returned is in the UTC zone.
     *
     * For example, given a time "1416863450581", this method returns
     * "20141124T211050Z"
     */
    public static String formatTimestamp(long timeMilli) {
        return timeFormatter.print(timeMilli);
    }
}
