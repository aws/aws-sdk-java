/*
 * Copyright 2011 Amazon Technologies, Inc.
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

/**
 * Arbitrary options storage for individual {@link AmazonWebServiceRequest}s. This
 * class is not intended to be used by clients.
 */
public final class RequestClientOptions {
    
    private String clientMarker;

    /**
     * Returns all client markers as a space-delimited string.
     */
    public String getClientMarker() {
        return clientMarker;
    }
    
    /**
     * Adds a client marker, if it wasn't already present.
     */
    public void addClientMarker(String clientMarker) {
        if (this.clientMarker == null)
            this.clientMarker = "";

        this.clientMarker = createClientMarkerString(clientMarker);
    }
    
    /**
     * Appends the given client marker string to the existing one and returns it.
     */
    private String createClientMarkerString(String clientMarker) {
        if (this.clientMarker.contains(clientMarker)) {
            return this.clientMarker;
        } else {
            return this.clientMarker + " " + clientMarker;
        }
    }
}
