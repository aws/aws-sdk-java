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

public class ShapeMarshaller {

    private String action;

    private String verb;

    private String target;

    private String requestUri;

    private String locationName;

    private String xmlNameSpaceUri;

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public ShapeMarshaller withAction(String action) {
        setAction(action);
        return this;
    }

    public String getVerb() {
        return verb;
    }

    public void setVerb(String verb) {
        this.verb = verb;
    }

    public ShapeMarshaller withVerb(String verb) {
        setVerb(verb);
        return this;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public ShapeMarshaller withTarget(String target) {
        setTarget(target);
        return this;
    }

    public String getRequestUri() {
        return requestUri;
    }

    public void setRequestUri(String requestUri) {
        this.requestUri = requestUri;
    }

    public ShapeMarshaller withRequestUri(String requestUri) {
        setRequestUri(requestUri);
        return this;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public ShapeMarshaller withLocationName(String locationName) {
        setLocationName(locationName);
        return this;
    }

    public String getXmlNameSpaceUri() {
        return xmlNameSpaceUri;
    }

    public void setXmlNameSpaceUri(String xmlNameSpaceUri) {
        this.xmlNameSpaceUri = xmlNameSpaceUri;
    }

    public ShapeMarshaller withXmlNameSpaceUri(String xmlNameSpaceUri) {
        setXmlNameSpaceUri(xmlNameSpaceUri);
        return this;
    }
}
