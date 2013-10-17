/*
 * Copyright 2011-2013 Amazon Technologies, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *    http://aws.amazon.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */
package com.amazonaws;

import java.util.EnumMap;
import java.util.Map;

import org.apache.http.annotation.NotThreadSafe;

/**
 * Client markers for individual {@link AmazonWebServiceRequest}s.
 */
@NotThreadSafe
public final class RequestClientOptions {
    public static enum Marker {
        /** 
         * Used to specify the http user_agent value.
         * This marker is intended only for internal use by the AWS SDK. 
         */
        USER_AGENT,
        ;
    }
    
    private final Map<Marker,String> markers = new EnumMap<Marker,String>(Marker.class);

    /**
     * @deprecated by {@link #getClientMarker(Marker)}.
     * This method is intended only for internal use by the AWS SDK. 
     * 
     * Returns the "USER_AGENT" marker as a space-delimited string.
     */
    @Deprecated
    public String getClientMarker() {
        return getClientMarker(Marker.USER_AGENT);
    }

    /**
     * Returns the value of the specified marker; or null if there is no such
     * value.
     */
    public String getClientMarker(Marker marker) {
        return markers.get(marker);
    }

    /**
     * Associates the given value with the given marker.
     * Note the {@link Marker#USER_AGENT} is only intended for internal use
     * by the AWS SDK.
     */
    public void putClientMarker(Marker marker, String value) {
        markers.put(marker, value);
    }

    /**
     * @deprecated by {@link #appendUserAgent(String)}.
     * This method is intended only for internal use by the AWS SDK. 
     * 
     * Adds a "USER_AGENT" client marker, if it wasn't already present.
     */
    @Deprecated
    public void addClientMarker(String clientMarker) {
        appendUserAgent(clientMarker);
    }

    /**
     * Appends a user agent to the USER_AGENT client marker.
     * This method is intended only for internal use by the AWS SDK. 
     */
    public void appendUserAgent(String userAgent) {
        String marker = markers.get(Marker.USER_AGENT);
        if (marker == null)
            marker = "";
        marker = createUserAgentMarkerString(marker, userAgent);
        putClientMarker(Marker.USER_AGENT, marker);
    }

    /**
     * Appends the given client marker string to the existing one and returns it.
     */
    private String createUserAgentMarkerString(final String marker, String userAgent) {
        return marker.contains(userAgent) ? marker : marker + " " + userAgent;
    }
}
