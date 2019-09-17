/*
 * Copyright 2011-2019 Amazon Technologies, Inc.
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

import com.amazonaws.annotation.NotThreadSafe;

import com.amazonaws.http.apache.request.impl.ApacheHttpRequestFactory;
import com.amazonaws.http.settings.HttpClientSettings;
import java.io.InputStream;
import java.util.EnumMap;

/**
 * Client request options such as client markers for individual
 * {@link AmazonWebServiceRequest}s.
 */
@NotThreadSafe
public final class RequestClientOptions {
    /**
     * Used to enable mark-and-reset for
     * non-mark-and-resettable non-file input stream for up to 128K memory
     * buffering by default. Add 1 to get around an implementation quirk of
     * BufferedInputStream.
     *
     * Retries after reading {@link #DEFAULT_STREAM_BUFFER_SIZE} bytes would
     * fail to reset the underlying input stream as the mark position would
     * have been invalidated.
     *
     */
    public static final int DEFAULT_STREAM_BUFFER_SIZE = (1 << 17)+1;
    public static enum Marker {
        /**
         * Used to specify the http user_agent value.
         * This marker is intended only for internal use by the AWS SDK.
         */
        USER_AGENT,
        ;
    }

    private final EnumMap<Marker,String> markers = new EnumMap<Marker,String>(Marker.class);
    /**
     * Used for mark-and-reset purposes during retry.
     */
    private int readLimit = DEFAULT_STREAM_BUFFER_SIZE;

    /**
     * Used to skip the appendUri call in {@link ApacheHttpRequestFactory#create(Request, HttpClientSettings)} method.
     *
     * This options is used in APIs that directly execute given presigned urls. For these requests, the extra slash
     * should not be included.
     */
    private boolean skipAppendUriPath = false;

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

    /**
     * Returns the mark-and-reset read limit; defaults to
     * {@value #DEFAULT_STREAM_BUFFER_SIZE}.
     *
     * @see InputStream#mark(int)
     */
    public final int getReadLimit() {
        return readLimit;
    }

    /**
     * Sets the optional mark-and-reset read limit used for signing and retry
     * purposes.
     *
     * @see InputStream#mark(int)
     */
    public final void setReadLimit(int readLimit) {
        this.readLimit = readLimit;
    }


    /**
     * Gets the boolean value to skip the appendUri call in {@link ApacheHttpRequestFactory#create(Request, HttpClientSettings)}
     * method. The default value is false, which means the appendUri call is not skipped.
     *
     * This options is used in APIs that directly execute given presigned urls. For these requests, the extra slash
     * should not be included.
     */
    public boolean isSkipAppendUriPath() {
        return skipAppendUriPath;
    }

    /**
     * Sets the boolean value to skip the appendUri call in {@link ApacheHttpRequestFactory#create(Request, HttpClientSettings)}
     * method. The default value is false, which means the appendUri call is not skipped.
     *
     * This options is used in APIs that directly execute given presigned urls. For these requests, the extra slash
     * should not be included.
     */
    public void setSkipAppendUriPath(boolean skipAppendUriPath) {
        this.skipAppendUriPath = skipAppendUriPath;
    }


    /**
     * Copy the internal states of this <code>RequestClientOptions</code> to the
     * target <code>RequestClientOptions</code>.
     */
    void copyTo(RequestClientOptions target) {
        target.setReadLimit(getReadLimit());
        target.setSkipAppendUriPath(isSkipAppendUriPath());
        for (Marker marker: Marker.values())
            target.putClientMarker(marker, getClientMarker(marker));
    }
}
