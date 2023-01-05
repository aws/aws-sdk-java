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
package com.amazonaws.services.billingconductor.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The set of accounts that will be under the billing group. The set of accounts resemble the linked accounts in a
 * consolidated family.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/AccountGrouping" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AccountGrouping implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The account IDs that make up the billing group. Account IDs must be a part of the consolidated billing family,
     * and not associated with another billing group.
     * </p>
     */
    private java.util.List<String> linkedAccountIds;

    /**
     * <p>
     * The account IDs that make up the billing group. Account IDs must be a part of the consolidated billing family,
     * and not associated with another billing group.
     * </p>
     * 
     * @return The account IDs that make up the billing group. Account IDs must be a part of the consolidated billing
     *         family, and not associated with another billing group.
     */

    public java.util.List<String> getLinkedAccountIds() {
        return linkedAccountIds;
    }

    /**
     * <p>
     * The account IDs that make up the billing group. Account IDs must be a part of the consolidated billing family,
     * and not associated with another billing group.
     * </p>
     * 
     * @param linkedAccountIds
     *        The account IDs that make up the billing group. Account IDs must be a part of the consolidated billing
     *        family, and not associated with another billing group.
     */

    public void setLinkedAccountIds(java.util.Collection<String> linkedAccountIds) {
        if (linkedAccountIds == null) {
            this.linkedAccountIds = null;
            return;
        }

        this.linkedAccountIds = new java.util.ArrayList<String>(linkedAccountIds);
    }

    /**
     * <p>
     * The account IDs that make up the billing group. Account IDs must be a part of the consolidated billing family,
     * and not associated with another billing group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLinkedAccountIds(java.util.Collection)} or {@link #withLinkedAccountIds(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param linkedAccountIds
     *        The account IDs that make up the billing group. Account IDs must be a part of the consolidated billing
     *        family, and not associated with another billing group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccountGrouping withLinkedAccountIds(String... linkedAccountIds) {
        if (this.linkedAccountIds == null) {
            setLinkedAccountIds(new java.util.ArrayList<String>(linkedAccountIds.length));
        }
        for (String ele : linkedAccountIds) {
            this.linkedAccountIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The account IDs that make up the billing group. Account IDs must be a part of the consolidated billing family,
     * and not associated with another billing group.
     * </p>
     * 
     * @param linkedAccountIds
     *        The account IDs that make up the billing group. Account IDs must be a part of the consolidated billing
     *        family, and not associated with another billing group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccountGrouping withLinkedAccountIds(java.util.Collection<String> linkedAccountIds) {
        setLinkedAccountIds(linkedAccountIds);
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
        if (getLinkedAccountIds() != null)
            sb.append("LinkedAccountIds: ").append(getLinkedAccountIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AccountGrouping == false)
            return false;
        AccountGrouping other = (AccountGrouping) obj;
        if (other.getLinkedAccountIds() == null ^ this.getLinkedAccountIds() == null)
            return false;
        if (other.getLinkedAccountIds() != null && other.getLinkedAccountIds().equals(this.getLinkedAccountIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLinkedAccountIds() == null) ? 0 : getLinkedAccountIds().hashCode());
        return hashCode;
    }

    @Override
    public AccountGrouping clone() {
        try {
            return (AccountGrouping) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.billingconductor.model.transform.AccountGroupingMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
