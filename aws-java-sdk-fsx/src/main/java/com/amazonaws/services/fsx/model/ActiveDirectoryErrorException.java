/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.fsx.model;

import javax.annotation.Generated;

/**
 * <p>
 * An Active Directory error.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ActiveDirectoryErrorException extends com.amazonaws.services.fsx.model.AmazonFSxException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * The directory ID of the directory that an error pertains to.
     * </p>
     */
    private String activeDirectoryId;
    /**
     * <p>
     * The type of Active Directory error.
     * </p>
     */
    private String type;

    /**
     * Constructs a new ActiveDirectoryErrorException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public ActiveDirectoryErrorException(String message) {
        super(message);
    }

    /**
     * <p>
     * The directory ID of the directory that an error pertains to.
     * </p>
     * 
     * @param activeDirectoryId
     *        The directory ID of the directory that an error pertains to.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ActiveDirectoryId")
    public void setActiveDirectoryId(String activeDirectoryId) {
        this.activeDirectoryId = activeDirectoryId;
    }

    /**
     * <p>
     * The directory ID of the directory that an error pertains to.
     * </p>
     * 
     * @return The directory ID of the directory that an error pertains to.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ActiveDirectoryId")
    public String getActiveDirectoryId() {
        return this.activeDirectoryId;
    }

    /**
     * <p>
     * The directory ID of the directory that an error pertains to.
     * </p>
     * 
     * @param activeDirectoryId
     *        The directory ID of the directory that an error pertains to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActiveDirectoryErrorException withActiveDirectoryId(String activeDirectoryId) {
        setActiveDirectoryId(activeDirectoryId);
        return this;
    }

    /**
     * <p>
     * The type of Active Directory error.
     * </p>
     * 
     * @param type
     *        The type of Active Directory error.
     * @see ActiveDirectoryErrorType
     */

    @com.fasterxml.jackson.annotation.JsonProperty("Type")
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of Active Directory error.
     * </p>
     * 
     * @return The type of Active Directory error.
     * @see ActiveDirectoryErrorType
     */

    @com.fasterxml.jackson.annotation.JsonProperty("Type")
    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of Active Directory error.
     * </p>
     * 
     * @param type
     *        The type of Active Directory error.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ActiveDirectoryErrorType
     */

    public ActiveDirectoryErrorException withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of Active Directory error.
     * </p>
     * 
     * @param type
     *        The type of Active Directory error.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ActiveDirectoryErrorType
     */

    public ActiveDirectoryErrorException withType(ActiveDirectoryErrorType type) {
        this.type = type.toString();
        return this;
    }

}
