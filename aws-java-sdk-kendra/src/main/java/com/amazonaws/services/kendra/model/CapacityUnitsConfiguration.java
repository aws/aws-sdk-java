/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.kendra.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies capacity units configured for your enterprise edition index. You can add and remove capacity units to tune
 * an index to your requirements.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/CapacityUnitsConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CapacityUnitsConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The amount of extra storage capacity for an index. A single capacity unit provides 30 GB of storage space or
     * 100,000 documents, whichever is reached first.
     * </p>
     */
    private Integer storageCapacityUnits;
    /**
     * <p>
     * The amount of extra query capacity for an index and <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/API_GetQuerySuggestions.html">GetQuerySuggestions</a>
     * capacity.
     * </p>
     * <p>
     * A single extra capacity unit for an index provides 0.1 queries per second or approximately 8,000 queries per day.
     * </p>
     * <p>
     * <code>GetQuerySuggestions</code> capacity is five times the provisioned query capacity for an index, or the base
     * capacity of 2.5 calls per second, whichever is higher. For example, the base capacity for an index is 0.1 queries
     * per second, and <code>GetQuerySuggestions</code> capacity has a base of 2.5 calls per second. If you add another
     * 0.1 queries per second to total 0.2 queries per second for an index, the <code>GetQuerySuggestions</code>
     * capacity is 2.5 calls per second (higher than five times 0.2 queries per second).
     * </p>
     */
    private Integer queryCapacityUnits;

    /**
     * <p>
     * The amount of extra storage capacity for an index. A single capacity unit provides 30 GB of storage space or
     * 100,000 documents, whichever is reached first.
     * </p>
     * 
     * @param storageCapacityUnits
     *        The amount of extra storage capacity for an index. A single capacity unit provides 30 GB of storage space
     *        or 100,000 documents, whichever is reached first.
     */

    public void setStorageCapacityUnits(Integer storageCapacityUnits) {
        this.storageCapacityUnits = storageCapacityUnits;
    }

    /**
     * <p>
     * The amount of extra storage capacity for an index. A single capacity unit provides 30 GB of storage space or
     * 100,000 documents, whichever is reached first.
     * </p>
     * 
     * @return The amount of extra storage capacity for an index. A single capacity unit provides 30 GB of storage space
     *         or 100,000 documents, whichever is reached first.
     */

    public Integer getStorageCapacityUnits() {
        return this.storageCapacityUnits;
    }

    /**
     * <p>
     * The amount of extra storage capacity for an index. A single capacity unit provides 30 GB of storage space or
     * 100,000 documents, whichever is reached first.
     * </p>
     * 
     * @param storageCapacityUnits
     *        The amount of extra storage capacity for an index. A single capacity unit provides 30 GB of storage space
     *        or 100,000 documents, whichever is reached first.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CapacityUnitsConfiguration withStorageCapacityUnits(Integer storageCapacityUnits) {
        setStorageCapacityUnits(storageCapacityUnits);
        return this;
    }

    /**
     * <p>
     * The amount of extra query capacity for an index and <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/API_GetQuerySuggestions.html">GetQuerySuggestions</a>
     * capacity.
     * </p>
     * <p>
     * A single extra capacity unit for an index provides 0.1 queries per second or approximately 8,000 queries per day.
     * </p>
     * <p>
     * <code>GetQuerySuggestions</code> capacity is five times the provisioned query capacity for an index, or the base
     * capacity of 2.5 calls per second, whichever is higher. For example, the base capacity for an index is 0.1 queries
     * per second, and <code>GetQuerySuggestions</code> capacity has a base of 2.5 calls per second. If you add another
     * 0.1 queries per second to total 0.2 queries per second for an index, the <code>GetQuerySuggestions</code>
     * capacity is 2.5 calls per second (higher than five times 0.2 queries per second).
     * </p>
     * 
     * @param queryCapacityUnits
     *        The amount of extra query capacity for an index and <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/API_GetQuerySuggestions.html">GetQuerySuggestions</a>
     *        capacity.</p>
     *        <p>
     *        A single extra capacity unit for an index provides 0.1 queries per second or approximately 8,000 queries
     *        per day.
     *        </p>
     *        <p>
     *        <code>GetQuerySuggestions</code> capacity is five times the provisioned query capacity for an index, or
     *        the base capacity of 2.5 calls per second, whichever is higher. For example, the base capacity for an
     *        index is 0.1 queries per second, and <code>GetQuerySuggestions</code> capacity has a base of 2.5 calls per
     *        second. If you add another 0.1 queries per second to total 0.2 queries per second for an index, the
     *        <code>GetQuerySuggestions</code> capacity is 2.5 calls per second (higher than five times 0.2 queries per
     *        second).
     */

    public void setQueryCapacityUnits(Integer queryCapacityUnits) {
        this.queryCapacityUnits = queryCapacityUnits;
    }

    /**
     * <p>
     * The amount of extra query capacity for an index and <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/API_GetQuerySuggestions.html">GetQuerySuggestions</a>
     * capacity.
     * </p>
     * <p>
     * A single extra capacity unit for an index provides 0.1 queries per second or approximately 8,000 queries per day.
     * </p>
     * <p>
     * <code>GetQuerySuggestions</code> capacity is five times the provisioned query capacity for an index, or the base
     * capacity of 2.5 calls per second, whichever is higher. For example, the base capacity for an index is 0.1 queries
     * per second, and <code>GetQuerySuggestions</code> capacity has a base of 2.5 calls per second. If you add another
     * 0.1 queries per second to total 0.2 queries per second for an index, the <code>GetQuerySuggestions</code>
     * capacity is 2.5 calls per second (higher than five times 0.2 queries per second).
     * </p>
     * 
     * @return The amount of extra query capacity for an index and <a
     *         href="https://docs.aws.amazon.com/kendra/latest/dg/API_GetQuerySuggestions.html">GetQuerySuggestions</a>
     *         capacity.</p>
     *         <p>
     *         A single extra capacity unit for an index provides 0.1 queries per second or approximately 8,000 queries
     *         per day.
     *         </p>
     *         <p>
     *         <code>GetQuerySuggestions</code> capacity is five times the provisioned query capacity for an index, or
     *         the base capacity of 2.5 calls per second, whichever is higher. For example, the base capacity for an
     *         index is 0.1 queries per second, and <code>GetQuerySuggestions</code> capacity has a base of 2.5 calls
     *         per second. If you add another 0.1 queries per second to total 0.2 queries per second for an index, the
     *         <code>GetQuerySuggestions</code> capacity is 2.5 calls per second (higher than five times 0.2 queries per
     *         second).
     */

    public Integer getQueryCapacityUnits() {
        return this.queryCapacityUnits;
    }

    /**
     * <p>
     * The amount of extra query capacity for an index and <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/API_GetQuerySuggestions.html">GetQuerySuggestions</a>
     * capacity.
     * </p>
     * <p>
     * A single extra capacity unit for an index provides 0.1 queries per second or approximately 8,000 queries per day.
     * </p>
     * <p>
     * <code>GetQuerySuggestions</code> capacity is five times the provisioned query capacity for an index, or the base
     * capacity of 2.5 calls per second, whichever is higher. For example, the base capacity for an index is 0.1 queries
     * per second, and <code>GetQuerySuggestions</code> capacity has a base of 2.5 calls per second. If you add another
     * 0.1 queries per second to total 0.2 queries per second for an index, the <code>GetQuerySuggestions</code>
     * capacity is 2.5 calls per second (higher than five times 0.2 queries per second).
     * </p>
     * 
     * @param queryCapacityUnits
     *        The amount of extra query capacity for an index and <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/API_GetQuerySuggestions.html">GetQuerySuggestions</a>
     *        capacity.</p>
     *        <p>
     *        A single extra capacity unit for an index provides 0.1 queries per second or approximately 8,000 queries
     *        per day.
     *        </p>
     *        <p>
     *        <code>GetQuerySuggestions</code> capacity is five times the provisioned query capacity for an index, or
     *        the base capacity of 2.5 calls per second, whichever is higher. For example, the base capacity for an
     *        index is 0.1 queries per second, and <code>GetQuerySuggestions</code> capacity has a base of 2.5 calls per
     *        second. If you add another 0.1 queries per second to total 0.2 queries per second for an index, the
     *        <code>GetQuerySuggestions</code> capacity is 2.5 calls per second (higher than five times 0.2 queries per
     *        second).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CapacityUnitsConfiguration withQueryCapacityUnits(Integer queryCapacityUnits) {
        setQueryCapacityUnits(queryCapacityUnits);
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
        if (getStorageCapacityUnits() != null)
            sb.append("StorageCapacityUnits: ").append(getStorageCapacityUnits()).append(",");
        if (getQueryCapacityUnits() != null)
            sb.append("QueryCapacityUnits: ").append(getQueryCapacityUnits());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CapacityUnitsConfiguration == false)
            return false;
        CapacityUnitsConfiguration other = (CapacityUnitsConfiguration) obj;
        if (other.getStorageCapacityUnits() == null ^ this.getStorageCapacityUnits() == null)
            return false;
        if (other.getStorageCapacityUnits() != null && other.getStorageCapacityUnits().equals(this.getStorageCapacityUnits()) == false)
            return false;
        if (other.getQueryCapacityUnits() == null ^ this.getQueryCapacityUnits() == null)
            return false;
        if (other.getQueryCapacityUnits() != null && other.getQueryCapacityUnits().equals(this.getQueryCapacityUnits()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStorageCapacityUnits() == null) ? 0 : getStorageCapacityUnits().hashCode());
        hashCode = prime * hashCode + ((getQueryCapacityUnits() == null) ? 0 : getQueryCapacityUnits().hashCode());
        return hashCode;
    }

    @Override
    public CapacityUnitsConfiguration clone() {
        try {
            return (CapacityUnitsConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kendra.model.transform.CapacityUnitsConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
