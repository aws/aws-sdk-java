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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceResult;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetCoipPoolUsageResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the customer-owned address pool.
     * </p>
     */
    private String coipPoolId;
    /**
     * <p>
     * Information about the address usage.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<CoipAddressUsage> coipAddressUsages;
    /**
     * <p>
     * The ID of the local gateway route table.
     * </p>
     */
    private String localGatewayRouteTableId;

    /**
     * <p>
     * The ID of the customer-owned address pool.
     * </p>
     * 
     * @param coipPoolId
     *        The ID of the customer-owned address pool.
     */

    public void setCoipPoolId(String coipPoolId) {
        this.coipPoolId = coipPoolId;
    }

    /**
     * <p>
     * The ID of the customer-owned address pool.
     * </p>
     * 
     * @return The ID of the customer-owned address pool.
     */

    public String getCoipPoolId() {
        return this.coipPoolId;
    }

    /**
     * <p>
     * The ID of the customer-owned address pool.
     * </p>
     * 
     * @param coipPoolId
     *        The ID of the customer-owned address pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCoipPoolUsageResult withCoipPoolId(String coipPoolId) {
        setCoipPoolId(coipPoolId);
        return this;
    }

    /**
     * <p>
     * Information about the address usage.
     * </p>
     * 
     * @return Information about the address usage.
     */

    public java.util.List<CoipAddressUsage> getCoipAddressUsages() {
        if (coipAddressUsages == null) {
            coipAddressUsages = new com.amazonaws.internal.SdkInternalList<CoipAddressUsage>();
        }
        return coipAddressUsages;
    }

    /**
     * <p>
     * Information about the address usage.
     * </p>
     * 
     * @param coipAddressUsages
     *        Information about the address usage.
     */

    public void setCoipAddressUsages(java.util.Collection<CoipAddressUsage> coipAddressUsages) {
        if (coipAddressUsages == null) {
            this.coipAddressUsages = null;
            return;
        }

        this.coipAddressUsages = new com.amazonaws.internal.SdkInternalList<CoipAddressUsage>(coipAddressUsages);
    }

    /**
     * <p>
     * Information about the address usage.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCoipAddressUsages(java.util.Collection)} or {@link #withCoipAddressUsages(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param coipAddressUsages
     *        Information about the address usage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCoipPoolUsageResult withCoipAddressUsages(CoipAddressUsage... coipAddressUsages) {
        if (this.coipAddressUsages == null) {
            setCoipAddressUsages(new com.amazonaws.internal.SdkInternalList<CoipAddressUsage>(coipAddressUsages.length));
        }
        for (CoipAddressUsage ele : coipAddressUsages) {
            this.coipAddressUsages.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the address usage.
     * </p>
     * 
     * @param coipAddressUsages
     *        Information about the address usage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCoipPoolUsageResult withCoipAddressUsages(java.util.Collection<CoipAddressUsage> coipAddressUsages) {
        setCoipAddressUsages(coipAddressUsages);
        return this;
    }

    /**
     * <p>
     * The ID of the local gateway route table.
     * </p>
     * 
     * @param localGatewayRouteTableId
     *        The ID of the local gateway route table.
     */

    public void setLocalGatewayRouteTableId(String localGatewayRouteTableId) {
        this.localGatewayRouteTableId = localGatewayRouteTableId;
    }

    /**
     * <p>
     * The ID of the local gateway route table.
     * </p>
     * 
     * @return The ID of the local gateway route table.
     */

    public String getLocalGatewayRouteTableId() {
        return this.localGatewayRouteTableId;
    }

    /**
     * <p>
     * The ID of the local gateway route table.
     * </p>
     * 
     * @param localGatewayRouteTableId
     *        The ID of the local gateway route table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCoipPoolUsageResult withLocalGatewayRouteTableId(String localGatewayRouteTableId) {
        setLocalGatewayRouteTableId(localGatewayRouteTableId);
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
        if (getCoipPoolId() != null)
            sb.append("CoipPoolId: ").append(getCoipPoolId()).append(",");
        if (getCoipAddressUsages() != null)
            sb.append("CoipAddressUsages: ").append(getCoipAddressUsages()).append(",");
        if (getLocalGatewayRouteTableId() != null)
            sb.append("LocalGatewayRouteTableId: ").append(getLocalGatewayRouteTableId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetCoipPoolUsageResult == false)
            return false;
        GetCoipPoolUsageResult other = (GetCoipPoolUsageResult) obj;
        if (other.getCoipPoolId() == null ^ this.getCoipPoolId() == null)
            return false;
        if (other.getCoipPoolId() != null && other.getCoipPoolId().equals(this.getCoipPoolId()) == false)
            return false;
        if (other.getCoipAddressUsages() == null ^ this.getCoipAddressUsages() == null)
            return false;
        if (other.getCoipAddressUsages() != null && other.getCoipAddressUsages().equals(this.getCoipAddressUsages()) == false)
            return false;
        if (other.getLocalGatewayRouteTableId() == null ^ this.getLocalGatewayRouteTableId() == null)
            return false;
        if (other.getLocalGatewayRouteTableId() != null && other.getLocalGatewayRouteTableId().equals(this.getLocalGatewayRouteTableId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCoipPoolId() == null) ? 0 : getCoipPoolId().hashCode());
        hashCode = prime * hashCode + ((getCoipAddressUsages() == null) ? 0 : getCoipAddressUsages().hashCode());
        hashCode = prime * hashCode + ((getLocalGatewayRouteTableId() == null) ? 0 : getLocalGatewayRouteTableId().hashCode());
        return hashCode;
    }

    @Override
    public GetCoipPoolUsageResult clone() {
        try {
            return (GetCoipPoolUsageResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
