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
 * One or more network settings specified in the request are invalid. <code>InvalidVpcId</code> means that the ID passed
 * for the virtual private cloud (VPC) is invalid. <code>InvalidSubnetIds</code> returns the list of IDs for subnets
 * that are either invalid or not part of the VPC specified. <code>InvalidSecurityGroupIds</code> returns the list of
 * IDs for security groups that are either invalid or not part of the VPC specified.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InvalidNetworkSettingsException extends com.amazonaws.services.fsx.model.AmazonFSxException {
    private static final long serialVersionUID = 1L;

    private String invalidSubnetId;

    private String invalidSecurityGroupId;

    /**
     * Constructs a new InvalidNetworkSettingsException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public InvalidNetworkSettingsException(String message) {
        super(message);
    }

    /**
     * @param invalidSubnetId
     */

    @com.fasterxml.jackson.annotation.JsonProperty("InvalidSubnetId")
    public void setInvalidSubnetId(String invalidSubnetId) {
        this.invalidSubnetId = invalidSubnetId;
    }

    /**
     * @return
     */

    @com.fasterxml.jackson.annotation.JsonProperty("InvalidSubnetId")
    public String getInvalidSubnetId() {
        return this.invalidSubnetId;
    }

    /**
     * @param invalidSubnetId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InvalidNetworkSettingsException withInvalidSubnetId(String invalidSubnetId) {
        setInvalidSubnetId(invalidSubnetId);
        return this;
    }

    /**
     * @param invalidSecurityGroupId
     */

    @com.fasterxml.jackson.annotation.JsonProperty("InvalidSecurityGroupId")
    public void setInvalidSecurityGroupId(String invalidSecurityGroupId) {
        this.invalidSecurityGroupId = invalidSecurityGroupId;
    }

    /**
     * @return
     */

    @com.fasterxml.jackson.annotation.JsonProperty("InvalidSecurityGroupId")
    public String getInvalidSecurityGroupId() {
        return this.invalidSecurityGroupId;
    }

    /**
     * @param invalidSecurityGroupId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InvalidNetworkSettingsException withInvalidSecurityGroupId(String invalidSecurityGroupId) {
        setInvalidSecurityGroupId(invalidSecurityGroupId);
        return this;
    }

}
