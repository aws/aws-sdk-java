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
package com.amazonaws.services.fsx.model;

import javax.annotation.Generated;

/**
 * <p>
 * One or more network settings specified in the request are invalid.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InvalidNetworkSettingsException extends com.amazonaws.services.fsx.model.AmazonFSxException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * The subnet ID that is either invalid or not part of the VPC specified.
     * </p>
     */
    private String invalidSubnetId;
    /**
     * <p>
     * The security group ID is either invalid or not part of the VPC specified.
     * </p>
     */
    private String invalidSecurityGroupId;
    /**
     * <p>
     * The route table ID is either invalid or not part of the VPC specified.
     * </p>
     */
    private String invalidRouteTableId;

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
     * <p>
     * The subnet ID that is either invalid or not part of the VPC specified.
     * </p>
     * 
     * @param invalidSubnetId
     *        The subnet ID that is either invalid or not part of the VPC specified.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("InvalidSubnetId")
    public void setInvalidSubnetId(String invalidSubnetId) {
        this.invalidSubnetId = invalidSubnetId;
    }

    /**
     * <p>
     * The subnet ID that is either invalid or not part of the VPC specified.
     * </p>
     * 
     * @return The subnet ID that is either invalid or not part of the VPC specified.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("InvalidSubnetId")
    public String getInvalidSubnetId() {
        return this.invalidSubnetId;
    }

    /**
     * <p>
     * The subnet ID that is either invalid or not part of the VPC specified.
     * </p>
     * 
     * @param invalidSubnetId
     *        The subnet ID that is either invalid or not part of the VPC specified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InvalidNetworkSettingsException withInvalidSubnetId(String invalidSubnetId) {
        setInvalidSubnetId(invalidSubnetId);
        return this;
    }

    /**
     * <p>
     * The security group ID is either invalid or not part of the VPC specified.
     * </p>
     * 
     * @param invalidSecurityGroupId
     *        The security group ID is either invalid or not part of the VPC specified.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("InvalidSecurityGroupId")
    public void setInvalidSecurityGroupId(String invalidSecurityGroupId) {
        this.invalidSecurityGroupId = invalidSecurityGroupId;
    }

    /**
     * <p>
     * The security group ID is either invalid or not part of the VPC specified.
     * </p>
     * 
     * @return The security group ID is either invalid or not part of the VPC specified.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("InvalidSecurityGroupId")
    public String getInvalidSecurityGroupId() {
        return this.invalidSecurityGroupId;
    }

    /**
     * <p>
     * The security group ID is either invalid or not part of the VPC specified.
     * </p>
     * 
     * @param invalidSecurityGroupId
     *        The security group ID is either invalid or not part of the VPC specified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InvalidNetworkSettingsException withInvalidSecurityGroupId(String invalidSecurityGroupId) {
        setInvalidSecurityGroupId(invalidSecurityGroupId);
        return this;
    }

    /**
     * <p>
     * The route table ID is either invalid or not part of the VPC specified.
     * </p>
     * 
     * @param invalidRouteTableId
     *        The route table ID is either invalid or not part of the VPC specified.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("InvalidRouteTableId")
    public void setInvalidRouteTableId(String invalidRouteTableId) {
        this.invalidRouteTableId = invalidRouteTableId;
    }

    /**
     * <p>
     * The route table ID is either invalid or not part of the VPC specified.
     * </p>
     * 
     * @return The route table ID is either invalid or not part of the VPC specified.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("InvalidRouteTableId")
    public String getInvalidRouteTableId() {
        return this.invalidRouteTableId;
    }

    /**
     * <p>
     * The route table ID is either invalid or not part of the VPC specified.
     * </p>
     * 
     * @param invalidRouteTableId
     *        The route table ID is either invalid or not part of the VPC specified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InvalidNetworkSettingsException withInvalidRouteTableId(String invalidRouteTableId) {
        setInvalidRouteTableId(invalidRouteTableId);
        return this;
    }

}
