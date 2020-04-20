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
package com.amazonaws.services.iotevents.model;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TagrisPartialResourcesExistResultsException extends com.amazonaws.services.iotevents.model.AWSIoTEventsException {
    private static final long serialVersionUID = 1L;

    private java.util.Map<String, String> resourceExistenceInformation;

    /**
     * Constructs a new TagrisPartialResourcesExistResultsException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public TagrisPartialResourcesExistResultsException(String message) {
        super(message);
    }

    /**
     * @return
     */

    @com.fasterxml.jackson.annotation.JsonProperty("resourceExistenceInformation")
    public java.util.Map<String, String> getResourceExistenceInformation() {
        return resourceExistenceInformation;
    }

    /**
     * @param resourceExistenceInformation
     */

    @com.fasterxml.jackson.annotation.JsonProperty("resourceExistenceInformation")
    public void setResourceExistenceInformation(java.util.Map<String, String> resourceExistenceInformation) {
        this.resourceExistenceInformation = resourceExistenceInformation;
    }

    /**
     * @param resourceExistenceInformation
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TagrisPartialResourcesExistResultsException withResourceExistenceInformation(java.util.Map<String, String> resourceExistenceInformation) {
        setResourceExistenceInformation(resourceExistenceInformation);
        return this;
    }

    /**
     * Add a single ResourceExistenceInformation entry
     *
     * @see TagrisPartialResourcesExistResultsException#withResourceExistenceInformation
     * @returns a reference to this object so that method calls can be chained together.
     */

    public TagrisPartialResourcesExistResultsException addResourceExistenceInformationEntry(String key, String value) {
        if (null == this.resourceExistenceInformation) {
            this.resourceExistenceInformation = new java.util.HashMap<String, String>();
        }
        if (this.resourceExistenceInformation.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.resourceExistenceInformation.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into ResourceExistenceInformation.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TagrisPartialResourcesExistResultsException clearResourceExistenceInformationEntries() {
        this.resourceExistenceInformation = null;
        return this;
    }

}
