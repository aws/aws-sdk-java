/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.groundstation.model;

import javax.annotation.Generated;

/**
 * <p>
 * Dependency encountered an error.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DependencyException extends com.amazonaws.services.groundstation.model.AWSGroundStationException {
    private static final long serialVersionUID = 1L;

    /** <p/> */
    private String parameterName;

    /**
     * Constructs a new DependencyException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public DependencyException(String message) {
        super(message);
    }

    /**
     * <p/>
     * 
     * @param parameterName
     */

    @com.fasterxml.jackson.annotation.JsonProperty("parameterName")
    public void setParameterName(String parameterName) {
        this.parameterName = parameterName;
    }

    /**
     * <p/>
     * 
     * @return
     */

    @com.fasterxml.jackson.annotation.JsonProperty("parameterName")
    public String getParameterName() {
        return this.parameterName;
    }

    /**
     * <p/>
     * 
     * @param parameterName
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DependencyException withParameterName(String parameterName) {
        setParameterName(parameterName);
        return this;
    }

}
