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
package com.amazonaws.services.s3.internal;

import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.amazonaws.http.HttpResponse;
import com.amazonaws.services.s3.Headers;

/**
 * Header handler to pull the RESTORE header out of the response.
 */
public class ObjectRestoreHeaderHandler<T extends ObjectRestoreResult>
        implements HeaderHandler<T> {

    /*
     *  ongoing-request="false", expiry-date="Fri, 23 Dec 2012 00:00:00 GMT"
     */

    private static final Pattern datePattern =
        Pattern.compile("expiry-date=\"(.*?)\"");
    private static final Pattern ongoingPattern =
        Pattern.compile("ongoing-request=\"(.*?)\"");

    private static final Log log =
        LogFactory.getLog(ObjectRestoreHeaderHandler.class);

    /*
     * (non-Javadoc)
     *
     * @see
     * com.amazonaws.services.s3.internal.HeaderHandler#handle(java.lang.Object,
     * com.amazonaws.http.HttpResponse)
     */
    @Override
    public void handle(T result, HttpResponse response) {
        String restoreHeader = response.getHeaders().get(Headers.RESTORE);
        if (restoreHeader != null) {
            result.setRestoreExpirationTime(parseDate(restoreHeader));
            Boolean onGoingRestore = parseBoolean(restoreHeader);
            if (onGoingRestore != null) {
                result.setOngoingRestore(onGoingRestore);
            }
        }
    }

    private Date parseDate(String restoreHeader) {
        Matcher matcher = datePattern.matcher(restoreHeader);
        if ( matcher.find() ) {
            String date = matcher.group(1);
            try {
                return ServiceUtils.parseRfc822Date(date);
            } catch (Exception exception) {
                log.warn("Error parsing expiry-date from x-amz-restore "
                         + "header.",
                         exception);
            }
        }

        return null;
    }

    private Boolean parseBoolean(String restoreHeader) {
        Matcher matcher = ongoingPattern.matcher(restoreHeader);
        if (matcher.find()) {
            String ongoingRestore = matcher.group(1);
            return Boolean.parseBoolean(ongoingRestore);
        }
        return null;
    }

}

