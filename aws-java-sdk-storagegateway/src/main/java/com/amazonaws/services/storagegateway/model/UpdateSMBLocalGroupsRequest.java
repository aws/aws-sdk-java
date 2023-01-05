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
package com.amazonaws.services.storagegateway.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/UpdateSMBLocalGroups"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateSMBLocalGroupsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    private String gatewayARN;
    /**
     * <p>
     * A list of Active Directory users and groups that you want to grant special permissions for SMB file shares on the
     * gateway.
     * </p>
     */
    private SMBLocalGroups sMBLocalGroups;

    /**
     * @param gatewayARN
     */

    public void setGatewayARN(String gatewayARN) {
        this.gatewayARN = gatewayARN;
    }

    /**
     * @return
     */

    public String getGatewayARN() {
        return this.gatewayARN;
    }

    /**
     * @param gatewayARN
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSMBLocalGroupsRequest withGatewayARN(String gatewayARN) {
        setGatewayARN(gatewayARN);
        return this;
    }

    /**
     * <p>
     * A list of Active Directory users and groups that you want to grant special permissions for SMB file shares on the
     * gateway.
     * </p>
     * 
     * @param sMBLocalGroups
     *        A list of Active Directory users and groups that you want to grant special permissions for SMB file shares
     *        on the gateway.
     */

    public void setSMBLocalGroups(SMBLocalGroups sMBLocalGroups) {
        this.sMBLocalGroups = sMBLocalGroups;
    }

    /**
     * <p>
     * A list of Active Directory users and groups that you want to grant special permissions for SMB file shares on the
     * gateway.
     * </p>
     * 
     * @return A list of Active Directory users and groups that you want to grant special permissions for SMB file
     *         shares on the gateway.
     */

    public SMBLocalGroups getSMBLocalGroups() {
        return this.sMBLocalGroups;
    }

    /**
     * <p>
     * A list of Active Directory users and groups that you want to grant special permissions for SMB file shares on the
     * gateway.
     * </p>
     * 
     * @param sMBLocalGroups
     *        A list of Active Directory users and groups that you want to grant special permissions for SMB file shares
     *        on the gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSMBLocalGroupsRequest withSMBLocalGroups(SMBLocalGroups sMBLocalGroups) {
        setSMBLocalGroups(sMBLocalGroups);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getGatewayARN() != null)
            sb.append("GatewayARN: ").append(getGatewayARN()).append(",");
        if (getSMBLocalGroups() != null)
            sb.append("SMBLocalGroups: ").append(getSMBLocalGroups());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateSMBLocalGroupsRequest == false)
            return false;
        UpdateSMBLocalGroupsRequest other = (UpdateSMBLocalGroupsRequest) obj;
        if (other.getGatewayARN() == null ^ this.getGatewayARN() == null)
            return false;
        if (other.getGatewayARN() != null && other.getGatewayARN().equals(this.getGatewayARN()) == false)
            return false;
        if (other.getSMBLocalGroups() == null ^ this.getSMBLocalGroups() == null)
            return false;
        if (other.getSMBLocalGroups() != null && other.getSMBLocalGroups().equals(this.getSMBLocalGroups()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGatewayARN() == null) ? 0 : getGatewayARN().hashCode());
        hashCode = prime * hashCode + ((getSMBLocalGroups() == null) ? 0 : getSMBLocalGroups().hashCode());
        return hashCode;
    }

    @Override
    public UpdateSMBLocalGroupsRequest clone() {
        return (UpdateSMBLocalGroupsRequest) super.clone();
    }

}
