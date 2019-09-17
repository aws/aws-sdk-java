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

package com.amazonaws.codegen.model.intermediate;

import com.amazonaws.codegen.model.service.Location;
import com.amazonaws.protocol.MarshallLocation;

public class ParameterHttpMapping {

    private String unmarshallLocationName;
    private String marshallLocationName;

    private String additionalUnmarshallingPath;
    private String additionalMarshallingPath;

    private boolean isPayload;
    private boolean isStreaming;
    private Location location;
    private boolean flattened;
    private boolean isGreedy;
    private boolean requiresLength;

    public boolean getIsPayload() {
        return isPayload;
    }

    public void setPayload(boolean isPayload) {
        this.isPayload = isPayload;
    }

    public ParameterHttpMapping withPayload(boolean isPayload) {
        this.isPayload = isPayload;
        return this;
    }

    public boolean getIsStreaming() {
        return isStreaming;
    }

    public void setStreaming(boolean isStreaming) {
        this.isStreaming = isStreaming;
    }

    public ParameterHttpMapping withStreaming(boolean isStreaming) {
        this.isStreaming = isStreaming;
        return this;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public ParameterHttpMapping withLocation(Location location) {
        this.location = location;
        return this;
    }

    public boolean isHeader() {
        return this.location == Location.HEADER;
    }

    public boolean isUri() {
        return this.location == Location.URI;
    }

    public boolean isStatusCode() {
        return this.location == Location.STATUS_CODE;
    }

    public boolean isQueryString() {
        return this.location == Location.QUERY_STRING;
    }

    public boolean isFlattened() {
        return flattened;
    }

    public void setFlattened(boolean flattened) {
        this.flattened = flattened;
    }

    public ParameterHttpMapping withFlattened(boolean flattened) {
        this.flattened = flattened;
        return this;
    }

    public String getUnmarshallLocationName() {
        return unmarshallLocationName;
    }

    public void setUnmarshallLocationName(String unmarshallLocationName) {
        this.unmarshallLocationName = unmarshallLocationName;
    }

    public ParameterHttpMapping withUnmarshallLocationName(String unmarshallLocationName) {
        this.unmarshallLocationName = unmarshallLocationName;
        return this;
    }

    public String getMarshallLocationName() {
        return marshallLocationName;
    }

    public void setMarshallLocationName(String marshallLocationName) {
        this.marshallLocationName = marshallLocationName;
    }

    public ParameterHttpMapping withMarshallLocationName(String marshallLocationName) {
        this.marshallLocationName = marshallLocationName;
        return this;
    }

    public String getAdditionalUnmarshallingPath() {
        return additionalUnmarshallingPath;
    }

    public void setAdditionalUnmarshallingPath(String additionalUnmarshallingPath) {
        this.additionalUnmarshallingPath = additionalUnmarshallingPath;
    }

    public ParameterHttpMapping withAdditionalUnmarshallingPath(String additionalUnmarshallingPath) {
        this.additionalUnmarshallingPath = additionalUnmarshallingPath;
        return this;
    }

    public String getAdditionalMarshallingPath() {
        return additionalMarshallingPath;
    }

    public void setAdditionalMarshallingPath(String additionalMarshallingPath) {
        this.additionalMarshallingPath = additionalMarshallingPath;
    }

    public ParameterHttpMapping withAdditionalMarshallingPath(String additionalMarshallingPath) {
        this.additionalMarshallingPath = additionalMarshallingPath;
        return this;
    }

    public boolean isGreedy() {
        return isGreedy;
    }

    public ParameterHttpMapping setIsGreedy(boolean greedy) {
        isGreedy = greedy;
        return this;
    }

    public ParameterHttpMapping withIsGreedy(boolean greedy) {
        setIsGreedy(greedy);
        return this;
    }

    public boolean isRequiresLength() {
        return requiresLength;
    }

    public void setRequiresLength(boolean requiresLength) {
        this.requiresLength = requiresLength;
    }

    public ParameterHttpMapping withRequiresLength(boolean requiresLength) {
        setRequiresLength(requiresLength);
        return this;
    }

    public MarshallLocation getMarshallLocation() {
        if(location == null) {
            return MarshallLocation.PAYLOAD;
        }
        switch (location) {
            case HEADER:
            case HEADERS:
                return MarshallLocation.HEADER;
            case QUERY_STRING:
                return MarshallLocation.QUERY_PARAM;
            case URI:
                return isGreedy ? MarshallLocation.GREEDY_PATH : MarshallLocation.PATH;
        }
        return MarshallLocation.PAYLOAD;
    }

}
