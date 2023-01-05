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
public class GetTransitGatewayPolicyTableEntriesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The entries for the transit gateway policy table.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<TransitGatewayPolicyTableEntry> transitGatewayPolicyTableEntries;

    /**
     * <p>
     * The entries for the transit gateway policy table.
     * </p>
     * 
     * @return The entries for the transit gateway policy table.
     */

    public java.util.List<TransitGatewayPolicyTableEntry> getTransitGatewayPolicyTableEntries() {
        if (transitGatewayPolicyTableEntries == null) {
            transitGatewayPolicyTableEntries = new com.amazonaws.internal.SdkInternalList<TransitGatewayPolicyTableEntry>();
        }
        return transitGatewayPolicyTableEntries;
    }

    /**
     * <p>
     * The entries for the transit gateway policy table.
     * </p>
     * 
     * @param transitGatewayPolicyTableEntries
     *        The entries for the transit gateway policy table.
     */

    public void setTransitGatewayPolicyTableEntries(java.util.Collection<TransitGatewayPolicyTableEntry> transitGatewayPolicyTableEntries) {
        if (transitGatewayPolicyTableEntries == null) {
            this.transitGatewayPolicyTableEntries = null;
            return;
        }

        this.transitGatewayPolicyTableEntries = new com.amazonaws.internal.SdkInternalList<TransitGatewayPolicyTableEntry>(transitGatewayPolicyTableEntries);
    }

    /**
     * <p>
     * The entries for the transit gateway policy table.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTransitGatewayPolicyTableEntries(java.util.Collection)} or
     * {@link #withTransitGatewayPolicyTableEntries(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param transitGatewayPolicyTableEntries
     *        The entries for the transit gateway policy table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTransitGatewayPolicyTableEntriesResult withTransitGatewayPolicyTableEntries(TransitGatewayPolicyTableEntry... transitGatewayPolicyTableEntries) {
        if (this.transitGatewayPolicyTableEntries == null) {
            setTransitGatewayPolicyTableEntries(new com.amazonaws.internal.SdkInternalList<TransitGatewayPolicyTableEntry>(
                    transitGatewayPolicyTableEntries.length));
        }
        for (TransitGatewayPolicyTableEntry ele : transitGatewayPolicyTableEntries) {
            this.transitGatewayPolicyTableEntries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The entries for the transit gateway policy table.
     * </p>
     * 
     * @param transitGatewayPolicyTableEntries
     *        The entries for the transit gateway policy table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTransitGatewayPolicyTableEntriesResult withTransitGatewayPolicyTableEntries(
            java.util.Collection<TransitGatewayPolicyTableEntry> transitGatewayPolicyTableEntries) {
        setTransitGatewayPolicyTableEntries(transitGatewayPolicyTableEntries);
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
        if (getTransitGatewayPolicyTableEntries() != null)
            sb.append("TransitGatewayPolicyTableEntries: ").append(getTransitGatewayPolicyTableEntries());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetTransitGatewayPolicyTableEntriesResult == false)
            return false;
        GetTransitGatewayPolicyTableEntriesResult other = (GetTransitGatewayPolicyTableEntriesResult) obj;
        if (other.getTransitGatewayPolicyTableEntries() == null ^ this.getTransitGatewayPolicyTableEntries() == null)
            return false;
        if (other.getTransitGatewayPolicyTableEntries() != null
                && other.getTransitGatewayPolicyTableEntries().equals(this.getTransitGatewayPolicyTableEntries()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTransitGatewayPolicyTableEntries() == null) ? 0 : getTransitGatewayPolicyTableEntries().hashCode());
        return hashCode;
    }

    @Override
    public GetTransitGatewayPolicyTableEntriesResult clone() {
        try {
            return (GetTransitGatewayPolicyTableEntriesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
