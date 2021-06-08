/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.licensemanager.model;

import javax.annotation.Generated;

/**
 * <p>
 * This is not the correct Region for the resource. Try again.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RedirectException extends com.amazonaws.services.licensemanager.model.AWSLicenseManagerException {
    private static final long serialVersionUID = 1L;

    private String location;

    /**
     * Constructs a new RedirectException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public RedirectException(String message) {
        super(message);
    }

    /**
     * @param location
     */

    @com.fasterxml.jackson.annotation.JsonProperty("Location")
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * @return
     */

    @com.fasterxml.jackson.annotation.JsonProperty("Location")
    public String getLocation() {
        return this.location;
    }

    /**
     * @param location
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RedirectException withLocation(String location) {
        setLocation(location);
        return this;
    }

}
