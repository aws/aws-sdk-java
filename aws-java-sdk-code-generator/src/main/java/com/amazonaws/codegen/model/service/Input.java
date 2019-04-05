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

package com.amazonaws.codegen.model.service;

public class Input {

    private String shape;

    private String documentation;

    private String locationName;

    private XmlNamespace xmlNamespace;

    private boolean hostLabel;

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public String getDocumentation() {
        return documentation;
    }

    public void setDocumentation(String documentation) {
        this.documentation = documentation;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public XmlNamespace getXmlNamespace() {
        return xmlNamespace;
    }

    public void setXmlNamespace(XmlNamespace xmlNamespace) {
        this.xmlNamespace = xmlNamespace;
    }

    public boolean isHostLabel() {
        return hostLabel;
    }

    public void setHostLabel(boolean hostLabel) {
        this.hostLabel = hostLabel;
    }
}
