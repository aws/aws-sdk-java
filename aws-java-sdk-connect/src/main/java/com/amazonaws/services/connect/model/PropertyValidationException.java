/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.connect.model;

import javax.annotation.Generated;

/**
 * <p>
 * The property is not valid.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PropertyValidationException extends com.amazonaws.services.connect.model.AmazonConnectException {
    private static final long serialVersionUID = 1L;

    private java.util.List<PropertyValidationExceptionProperty> propertyList;

    /**
     * Constructs a new PropertyValidationException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public PropertyValidationException(String message) {
        super(message);
    }

    /**
     * @return
     */

    @com.fasterxml.jackson.annotation.JsonProperty("PropertyList")
    public java.util.List<PropertyValidationExceptionProperty> getPropertyList() {
        return propertyList;
    }

    /**
     * @param propertyList
     */

    @com.fasterxml.jackson.annotation.JsonProperty("PropertyList")
    public void setPropertyList(java.util.Collection<PropertyValidationExceptionProperty> propertyList) {
        if (propertyList == null) {
            this.propertyList = null;
            return;
        }

        this.propertyList = new java.util.ArrayList<PropertyValidationExceptionProperty>(propertyList);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPropertyList(java.util.Collection)} or {@link #withPropertyList(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param propertyList
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PropertyValidationException withPropertyList(PropertyValidationExceptionProperty... propertyList) {
        if (this.propertyList == null) {
            setPropertyList(new java.util.ArrayList<PropertyValidationExceptionProperty>(propertyList.length));
        }
        for (PropertyValidationExceptionProperty ele : propertyList) {
            this.propertyList.add(ele);
        }
        return this;
    }

    /**
     * @param propertyList
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PropertyValidationException withPropertyList(java.util.Collection<PropertyValidationExceptionProperty> propertyList) {
        setPropertyList(propertyList);
        return this;
    }

}
