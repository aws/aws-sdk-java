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
 * The aggregate results of entities affected by the specified event in your organization. The results are aggregated by
 * the entity status codes for the specified set of accountsIDs.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/health-2016-08-04/OrganizationEntityAggregate" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OrganizationEntityAggregate implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A list of event ARNs (unique identifiers). For example:
     * <code>"arn:aws:health:us-east-1::event/EC2/EC2_INSTANCE_RETIREMENT_SCHEDULED/EC2_INSTANCE_RETIREMENT_SCHEDULED_ABC123-CDE456", "arn:aws:health:us-west-1::event/EBS/AWS_EBS_LOST_VOLUME/AWS_EBS_LOST_VOLUME_CHI789_JKL101"</code>
     * </p>
     */
    private String eventArn;
    /**
     * <p>
     * The number of entities for the organization that match the filter criteria for the specified events.
     * </p>
     */
    private Integer count;
    /**
     * <p>
     * The number of affected entities aggregated by the entitiy status codes.
     * </p>
     */
    private java.util.Map<String, Integer> statuses;
    /**
     * <p>
     * A list of entity aggregates for each of the specified accounts in your organization that are affected by a
     * specific event. If there are no <code>awsAccountIds</code> provided in the request, this field will be empty in
     * the response.
     * </p>
     */
    private java.util.List<AccountEntityAggregate> accounts;

    /**
     * <p>
     * A list of event ARNs (unique identifiers). For example:
     * <code>"arn:aws:health:us-east-1::event/EC2/EC2_INSTANCE_RETIREMENT_SCHEDULED/EC2_INSTANCE_RETIREMENT_SCHEDULED_ABC123-CDE456", "arn:aws:health:us-west-1::event/EBS/AWS_EBS_LOST_VOLUME/AWS_EBS_LOST_VOLUME_CHI789_JKL101"</code>
     * </p>
     * 
     * @param eventArn
     *        A list of event ARNs (unique identifiers). For example:
     *        <code>"arn:aws:health:us-east-1::event/EC2/EC2_INSTANCE_RETIREMENT_SCHEDULED/EC2_INSTANCE_RETIREMENT_SCHEDULED_ABC123-CDE456", "arn:aws:health:us-west-1::event/EBS/AWS_EBS_LOST_VOLUME/AWS_EBS_LOST_VOLUME_CHI789_JKL101"</code>
     */

    public void setEventArn(String eventArn) {
        this.eventArn = eventArn;
    }

    /**
     * <p>
     * A list of event ARNs (unique identifiers). For example:
     * <code>"arn:aws:health:us-east-1::event/EC2/EC2_INSTANCE_RETIREMENT_SCHEDULED/EC2_INSTANCE_RETIREMENT_SCHEDULED_ABC123-CDE456", "arn:aws:health:us-west-1::event/EBS/AWS_EBS_LOST_VOLUME/AWS_EBS_LOST_VOLUME_CHI789_JKL101"</code>
     * </p>
     * 
     * @return A list of event ARNs (unique identifiers). For example:
     *         <code>"arn:aws:health:us-east-1::event/EC2/EC2_INSTANCE_RETIREMENT_SCHEDULED/EC2_INSTANCE_RETIREMENT_SCHEDULED_ABC123-CDE456", "arn:aws:health:us-west-1::event/EBS/AWS_EBS_LOST_VOLUME/AWS_EBS_LOST_VOLUME_CHI789_JKL101"</code>
     */

    public String getEventArn() {
        return this.eventArn;
    }

    /**
     * <p>
     * A list of event ARNs (unique identifiers). For example:
     * <code>"arn:aws:health:us-east-1::event/EC2/EC2_INSTANCE_RETIREMENT_SCHEDULED/EC2_INSTANCE_RETIREMENT_SCHEDULED_ABC123-CDE456", "arn:aws:health:us-west-1::event/EBS/AWS_EBS_LOST_VOLUME/AWS_EBS_LOST_VOLUME_CHI789_JKL101"</code>
     * </p>
     * 
     * @param eventArn
     *        A list of event ARNs (unique identifiers). For example:
     *        <code>"arn:aws:health:us-east-1::event/EC2/EC2_INSTANCE_RETIREMENT_SCHEDULED/EC2_INSTANCE_RETIREMENT_SCHEDULED_ABC123-CDE456", "arn:aws:health:us-west-1::event/EBS/AWS_EBS_LOST_VOLUME/AWS_EBS_LOST_VOLUME_CHI789_JKL101"</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrganizationEntityAggregate withEventArn(String eventArn) {
        setEventArn(eventArn);
        return this;
    }

    /**
     * <p>
     * The number of entities for the organization that match the filter criteria for the specified events.
     * </p>
     * 
     * @param count
     *        The number of entities for the organization that match the filter criteria for the specified events.
     */

    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * <p>
     * The number of entities for the organization that match the filter criteria for the specified events.
     * </p>
     * 
     * @return The number of entities for the organization that match the filter criteria for the specified events.
     */

    public Integer getCount() {
        return this.count;
    }

    /**
     * <p>
     * The number of entities for the organization that match the filter criteria for the specified events.
     * </p>
     * 
     * @param count
     *        The number of entities for the organization that match the filter criteria for the specified events.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrganizationEntityAggregate withCount(Integer count) {
        setCount(count);
        return this;
    }

    /**
     * <p>
     * The number of affected entities aggregated by the entitiy status codes.
     * </p>
     * 
     * @return The number of affected entities aggregated by the entitiy status codes.
     */

    public java.util.Map<String, Integer> getStatuses() {
        return statuses;
    }

    /**
     * <p>
     * The number of affected entities aggregated by the entitiy status codes.
     * </p>
     * 
     * @param statuses
     *        The number of affected entities aggregated by the entitiy status codes.
     */

    public void setStatuses(java.util.Map<String, Integer> statuses) {
        this.statuses = statuses;
    }

    /**
     * <p>
     * The number of affected entities aggregated by the entitiy status codes.
     * </p>
     * 
     * @param statuses
     *        The number of affected entities aggregated by the entitiy status codes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrganizationEntityAggregate withStatuses(java.util.Map<String, Integer> statuses) {
        setStatuses(statuses);
        return this;
    }

    /**
     * Add a single Statuses entry
     *
     * @see OrganizationEntityAggregate#withStatuses
     * @returns a reference to this object so that method calls can be chained together.
     */

    public OrganizationEntityAggregate addStatusesEntry(String key, Integer value) {
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

    public OrganizationEntityAggregate clearStatusesEntries() {
        this.statuses = null;
        return this;
    }

    /**
     * <p>
     * A list of entity aggregates for each of the specified accounts in your organization that are affected by a
     * specific event. If there are no <code>awsAccountIds</code> provided in the request, this field will be empty in
     * the response.
     * </p>
     * 
     * @return A list of entity aggregates for each of the specified accounts in your organization that are affected by
     *         a specific event. If there are no <code>awsAccountIds</code> provided in the request, this field will be
     *         empty in the response.
     */

    public java.util.List<AccountEntityAggregate> getAccounts() {
        return accounts;
    }

    /**
     * <p>
     * A list of entity aggregates for each of the specified accounts in your organization that are affected by a
     * specific event. If there are no <code>awsAccountIds</code> provided in the request, this field will be empty in
     * the response.
     * </p>
     * 
     * @param accounts
     *        A list of entity aggregates for each of the specified accounts in your organization that are affected by a
     *        specific event. If there are no <code>awsAccountIds</code> provided in the request, this field will be
     *        empty in the response.
     */

    public void setAccounts(java.util.Collection<AccountEntityAggregate> accounts) {
        if (accounts == null) {
            this.accounts = null;
            return;
        }

        this.accounts = new java.util.ArrayList<AccountEntityAggregate>(accounts);
    }

    /**
     * <p>
     * A list of entity aggregates for each of the specified accounts in your organization that are affected by a
     * specific event. If there are no <code>awsAccountIds</code> provided in the request, this field will be empty in
     * the response.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAccounts(java.util.Collection)} or {@link #withAccounts(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param accounts
     *        A list of entity aggregates for each of the specified accounts in your organization that are affected by a
     *        specific event. If there are no <code>awsAccountIds</code> provided in the request, this field will be
     *        empty in the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrganizationEntityAggregate withAccounts(AccountEntityAggregate... accounts) {
        if (this.accounts == null) {
            setAccounts(new java.util.ArrayList<AccountEntityAggregate>(accounts.length));
        }
        for (AccountEntityAggregate ele : accounts) {
            this.accounts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of entity aggregates for each of the specified accounts in your organization that are affected by a
     * specific event. If there are no <code>awsAccountIds</code> provided in the request, this field will be empty in
     * the response.
     * </p>
     * 
     * @param accounts
     *        A list of entity aggregates for each of the specified accounts in your organization that are affected by a
     *        specific event. If there are no <code>awsAccountIds</code> provided in the request, this field will be
     *        empty in the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrganizationEntityAggregate withAccounts(java.util.Collection<AccountEntityAggregate> accounts) {
        setAccounts(accounts);
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
        if (getEventArn() != null)
            sb.append("EventArn: ").append(getEventArn()).append(",");
        if (getCount() != null)
            sb.append("Count: ").append(getCount()).append(",");
        if (getStatuses() != null)
            sb.append("Statuses: ").append(getStatuses()).append(",");
        if (getAccounts() != null)
            sb.append("Accounts: ").append(getAccounts());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OrganizationEntityAggregate == false)
            return false;
        OrganizationEntityAggregate other = (OrganizationEntityAggregate) obj;
        if (other.getEventArn() == null ^ this.getEventArn() == null)
            return false;
        if (other.getEventArn() != null && other.getEventArn().equals(this.getEventArn()) == false)
            return false;
        if (other.getCount() == null ^ this.getCount() == null)
            return false;
        if (other.getCount() != null && other.getCount().equals(this.getCount()) == false)
            return false;
        if (other.getStatuses() == null ^ this.getStatuses() == null)
            return false;
        if (other.getStatuses() != null && other.getStatuses().equals(this.getStatuses()) == false)
            return false;
        if (other.getAccounts() == null ^ this.getAccounts() == null)
            return false;
        if (other.getAccounts() != null && other.getAccounts().equals(this.getAccounts()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEventArn() == null) ? 0 : getEventArn().hashCode());
        hashCode = prime * hashCode + ((getCount() == null) ? 0 : getCount().hashCode());
        hashCode = prime * hashCode + ((getStatuses() == null) ? 0 : getStatuses().hashCode());
        hashCode = prime * hashCode + ((getAccounts() == null) ? 0 : getAccounts().hashCode());
        return hashCode;
    }

    @Override
    public OrganizationEntityAggregate clone() {
        try {
            return (OrganizationEntityAggregate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.health.model.transform.OrganizationEntityAggregateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
