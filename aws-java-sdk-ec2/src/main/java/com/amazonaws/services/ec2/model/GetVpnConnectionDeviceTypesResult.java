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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceResult;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetVpnConnectionDeviceTypesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * List of customer gateway devices that have a sample configuration file available for use.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<VpnConnectionDeviceType> vpnConnectionDeviceTypes;
    /**
     * <p>
     * The <code>NextToken</code> value to include in a future <code>GetVpnConnectionDeviceTypes</code> request. When
     * the results of a <code>GetVpnConnectionDeviceTypes</code> request exceed <code>MaxResults</code>, this value can
     * be used to retrieve the next page of results. This value is null when there are no more results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * List of customer gateway devices that have a sample configuration file available for use.
     * </p>
     * 
     * @return List of customer gateway devices that have a sample configuration file available for use.
     */

    public java.util.List<VpnConnectionDeviceType> getVpnConnectionDeviceTypes() {
        if (vpnConnectionDeviceTypes == null) {
            vpnConnectionDeviceTypes = new com.amazonaws.internal.SdkInternalList<VpnConnectionDeviceType>();
        }
        return vpnConnectionDeviceTypes;
    }

    /**
     * <p>
     * List of customer gateway devices that have a sample configuration file available for use.
     * </p>
     * 
     * @param vpnConnectionDeviceTypes
     *        List of customer gateway devices that have a sample configuration file available for use.
     */

    public void setVpnConnectionDeviceTypes(java.util.Collection<VpnConnectionDeviceType> vpnConnectionDeviceTypes) {
        if (vpnConnectionDeviceTypes == null) {
            this.vpnConnectionDeviceTypes = null;
            return;
        }

        this.vpnConnectionDeviceTypes = new com.amazonaws.internal.SdkInternalList<VpnConnectionDeviceType>(vpnConnectionDeviceTypes);
    }

    /**
     * <p>
     * List of customer gateway devices that have a sample configuration file available for use.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVpnConnectionDeviceTypes(java.util.Collection)} or
     * {@link #withVpnConnectionDeviceTypes(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param vpnConnectionDeviceTypes
     *        List of customer gateway devices that have a sample configuration file available for use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetVpnConnectionDeviceTypesResult withVpnConnectionDeviceTypes(VpnConnectionDeviceType... vpnConnectionDeviceTypes) {
        if (this.vpnConnectionDeviceTypes == null) {
            setVpnConnectionDeviceTypes(new com.amazonaws.internal.SdkInternalList<VpnConnectionDeviceType>(vpnConnectionDeviceTypes.length));
        }
        for (VpnConnectionDeviceType ele : vpnConnectionDeviceTypes) {
            this.vpnConnectionDeviceTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of customer gateway devices that have a sample configuration file available for use.
     * </p>
     * 
     * @param vpnConnectionDeviceTypes
     *        List of customer gateway devices that have a sample configuration file available for use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetVpnConnectionDeviceTypesResult withVpnConnectionDeviceTypes(java.util.Collection<VpnConnectionDeviceType> vpnConnectionDeviceTypes) {
        setVpnConnectionDeviceTypes(vpnConnectionDeviceTypes);
        return this;
    }

    /**
     * <p>
     * The <code>NextToken</code> value to include in a future <code>GetVpnConnectionDeviceTypes</code> request. When
     * the results of a <code>GetVpnConnectionDeviceTypes</code> request exceed <code>MaxResults</code>, this value can
     * be used to retrieve the next page of results. This value is null when there are no more results to return.
     * </p>
     * 
     * @param nextToken
     *        The <code>NextToken</code> value to include in a future <code>GetVpnConnectionDeviceTypes</code> request.
     *        When the results of a <code>GetVpnConnectionDeviceTypes</code> request exceed <code>MaxResults</code>,
     *        this value can be used to retrieve the next page of results. This value is null when there are no more
     *        results to return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The <code>NextToken</code> value to include in a future <code>GetVpnConnectionDeviceTypes</code> request. When
     * the results of a <code>GetVpnConnectionDeviceTypes</code> request exceed <code>MaxResults</code>, this value can
     * be used to retrieve the next page of results. This value is null when there are no more results to return.
     * </p>
     * 
     * @return The <code>NextToken</code> value to include in a future <code>GetVpnConnectionDeviceTypes</code> request.
     *         When the results of a <code>GetVpnConnectionDeviceTypes</code> request exceed <code>MaxResults</code>,
     *         this value can be used to retrieve the next page of results. This value is null when there are no more
     *         results to return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The <code>NextToken</code> value to include in a future <code>GetVpnConnectionDeviceTypes</code> request. When
     * the results of a <code>GetVpnConnectionDeviceTypes</code> request exceed <code>MaxResults</code>, this value can
     * be used to retrieve the next page of results. This value is null when there are no more results to return.
     * </p>
     * 
     * @param nextToken
     *        The <code>NextToken</code> value to include in a future <code>GetVpnConnectionDeviceTypes</code> request.
     *        When the results of a <code>GetVpnConnectionDeviceTypes</code> request exceed <code>MaxResults</code>,
     *        this value can be used to retrieve the next page of results. This value is null when there are no more
     *        results to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetVpnConnectionDeviceTypesResult withNextToken(String nextToken) {
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
        if (getVpnConnectionDeviceTypes() != null)
            sb.append("VpnConnectionDeviceTypes: ").append(getVpnConnectionDeviceTypes()).append(",");
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

        if (obj instanceof GetVpnConnectionDeviceTypesResult == false)
            return false;
        GetVpnConnectionDeviceTypesResult other = (GetVpnConnectionDeviceTypesResult) obj;
        if (other.getVpnConnectionDeviceTypes() == null ^ this.getVpnConnectionDeviceTypes() == null)
            return false;
        if (other.getVpnConnectionDeviceTypes() != null && other.getVpnConnectionDeviceTypes().equals(this.getVpnConnectionDeviceTypes()) == false)
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

        hashCode = prime * hashCode + ((getVpnConnectionDeviceTypes() == null) ? 0 : getVpnConnectionDeviceTypes().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetVpnConnectionDeviceTypesResult clone() {
        try {
            return (GetVpnConnectionDeviceTypesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
