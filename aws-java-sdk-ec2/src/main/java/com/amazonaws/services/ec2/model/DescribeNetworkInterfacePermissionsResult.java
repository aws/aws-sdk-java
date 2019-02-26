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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceResult;

/**
 * <p>
 * Contains the output for DescribeNetworkInterfacePermissions.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeNetworkInterfacePermissionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The network interface permissions.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<NetworkInterfacePermission> networkInterfacePermissions;
    /**
     * <p>
     * The token to use to retrieve the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The network interface permissions.
     * </p>
     * 
     * @return The network interface permissions.
     */

    public java.util.List<NetworkInterfacePermission> getNetworkInterfacePermissions() {
        if (networkInterfacePermissions == null) {
            networkInterfacePermissions = new com.amazonaws.internal.SdkInternalList<NetworkInterfacePermission>();
        }
        return networkInterfacePermissions;
    }

    /**
     * <p>
     * The network interface permissions.
     * </p>
     * 
     * @param networkInterfacePermissions
     *        The network interface permissions.
     */

    public void setNetworkInterfacePermissions(java.util.Collection<NetworkInterfacePermission> networkInterfacePermissions) {
        if (networkInterfacePermissions == null) {
            this.networkInterfacePermissions = null;
            return;
        }

        this.networkInterfacePermissions = new com.amazonaws.internal.SdkInternalList<NetworkInterfacePermission>(networkInterfacePermissions);
    }

    /**
     * <p>
     * The network interface permissions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNetworkInterfacePermissions(java.util.Collection)} or
     * {@link #withNetworkInterfacePermissions(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param networkInterfacePermissions
     *        The network interface permissions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeNetworkInterfacePermissionsResult withNetworkInterfacePermissions(NetworkInterfacePermission... networkInterfacePermissions) {
        if (this.networkInterfacePermissions == null) {
            setNetworkInterfacePermissions(new com.amazonaws.internal.SdkInternalList<NetworkInterfacePermission>(networkInterfacePermissions.length));
        }
        for (NetworkInterfacePermission ele : networkInterfacePermissions) {
            this.networkInterfacePermissions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The network interface permissions.
     * </p>
     * 
     * @param networkInterfacePermissions
     *        The network interface permissions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeNetworkInterfacePermissionsResult withNetworkInterfacePermissions(
            java.util.Collection<NetworkInterfacePermission> networkInterfacePermissions) {
        setNetworkInterfacePermissions(networkInterfacePermissions);
        return this;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token to use to retrieve the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results.
     * </p>
     * 
     * @return The token to use to retrieve the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token to use to retrieve the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeNetworkInterfacePermissionsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getNetworkInterfacePermissions() != null)
            sb.append("NetworkInterfacePermissions: ").append(getNetworkInterfacePermissions()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeNetworkInterfacePermissionsResult == false)
            return false;
        DescribeNetworkInterfacePermissionsResult other = (DescribeNetworkInterfacePermissionsResult) obj;
        if (other.getNetworkInterfacePermissions() == null ^ this.getNetworkInterfacePermissions() == null)
            return false;
        if (other.getNetworkInterfacePermissions() != null && other.getNetworkInterfacePermissions().equals(this.getNetworkInterfacePermissions()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNetworkInterfacePermissions() == null) ? 0 : getNetworkInterfacePermissions().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeNetworkInterfacePermissionsResult clone() {
        try {
            return (DescribeNetworkInterfacePermissionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
