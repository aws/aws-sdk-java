/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.health.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The number of entities in an account that are impacted by a specific event aggregated by the entity status codes.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/health-2016-08-04/AccountEntityAggregate" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AccountEntityAggregate implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The 12-digit Amazon Web Services account numbers that contains the affected entities.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * The number of entities that match the filter criteria for the specified events.
     * </p>
     */
    private Integer count;
    /**
     * <p>
     * The number of affected entities aggregated by the entity status codes.
     * </p>
     */
    private java.util.Map<String, Integer> statuses;

    /**
     * <p>
     * The 12-digit Amazon Web Services account numbers that contains the affected entities.
     * </p>
     * 
     * @param accountId
     *        The 12-digit Amazon Web Services account numbers that contains the affected entities.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The 12-digit Amazon Web Services account numbers that contains the affected entities.
     * </p>
     * 
     * @return The 12-digit Amazon Web Services account numbers that contains the affected entities.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The 12-digit Amazon Web Services account numbers that contains the affected entities.
     * </p>
     * 
     * @param accountId
     *        The 12-digit Amazon Web Services account numbers that contains the affected entities.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccountEntityAggregate withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * The number of entities that match the filter criteria for the specified events.
     * </p>
     * 
     * @param count
     *        The number of entities that match the filter criteria for the specified events.
     */

    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * <p>
     * The number of entities that match the filter criteria for the specified events.
     * </p>
     * 
     * @return The number of entities that match the filter criteria for the specified events.
     */

    public Integer getCount() {
        return this.count;
    }

    /**
     * <p>
     * The number of entities that match the filter criteria for the specified events.
     * </p>
     * 
     * @param count
     *        The number of entities that match the filter criteria for the specified events.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccountEntityAggregate withCount(Integer count) {
        setCount(count);
        return this;
    }

    /**
     * <p>
     * The number of affected entities aggregated by the entity status codes.
     * </p>
     * 
     * @return The number of affected entities aggregated by the entity status codes.
     */

    public java.util.Map<String, Integer> getStatuses() {
        return statuses;
    }

    /**
     * <p>
     * The number of affected entities aggregated by the entity status codes.
     * </p>
     * 
     * @param statuses
     *        The number of affected entities aggregated by the entity status codes.
     */

    public void setStatuses(java.util.Map<String, Integer> statuses) {
        this.statuses = statuses;
    }

    /**
     * <p>
     * The number of affected entities aggregated by the entity status codes.
     * </p>
     * 
     * @param statuses
     *        The number of affected entities aggregated by the entity status codes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccountEntityAggregate withStatuses(java.util.Map<String, Integer> statuses) {
        setStatuses(statuses);
        return this;
    }

    /**
     * Add a single Statuses entry
     *
     * @see AccountEntityAggregate#withStatuses
     * @returns a reference to this object so that method calls can be chained together.
     */

    public AccountEntityAggregate addStatusesEntry(String key, Integer value) {
        if (null == this.statuses) {
            this.statuses = new java.util.HashMap<String, Integer>();
        }
        if (this.statuses.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.statuses.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Statuses.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccountEntityAggregate clearStatusesEntries() {
        this.statuses = null;
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
        if (getAccountId() != null)
            sb.append("AccountId: ").append(getAccountId()).append(",");
        if (getCount() != null)
            sb.append("Count: ").append(getCount()).append(",");
        if (getStatuses() != null)
            sb.append("Statuses: ").append(getStatuses());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AccountEntityAggregate == false)
            return false;
        AccountEntityAggregate other = (AccountEntityAggregate) obj;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getCount() == null ^ this.getCount() == null)
            return false;
        if (other.getCount() != null && other.getCount().equals(this.getCount()) == false)
            return false;
        if (other.getStatuses() == null ^ this.getStatuses() == null)
            return false;
        if (other.getStatuses() != null && other.getStatuses().equals(this.getStatuses()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getCount() == null) ? 0 : getCount().hashCode());
        hashCode = prime * hashCode + ((getStatuses() == null) ? 0 : getStatuses().hashCode());
        return hashCode;
    }

    @Override
    public AccountEntityAggregate clone() {
        try {
            return (AccountEntityAggregate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.health.model.transform.AccountEntityAggregateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
