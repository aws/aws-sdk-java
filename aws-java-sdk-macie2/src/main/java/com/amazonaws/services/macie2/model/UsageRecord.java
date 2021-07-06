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
package com.amazonaws.services.macie2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides quota and aggregated usage data for an Amazon Macie account.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/UsageRecord" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UsageRecord implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier for the Amazon Web Services account that the data applies to.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when the free trial started for the account.
     * </p>
     */
    private java.util.Date freeTrialStartDate;
    /**
     * <p>
     * An array of objects that contains usage data and quotas for the account. Each object contains the data for a
     * specific usage metric and the corresponding quota.
     * </p>
     */
    private java.util.List<UsageByAccount> usage;

    /**
     * <p>
     * The unique identifier for the Amazon Web Services account that the data applies to.
     * </p>
     * 
     * @param accountId
     *        The unique identifier for the Amazon Web Services account that the data applies to.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The unique identifier for the Amazon Web Services account that the data applies to.
     * </p>
     * 
     * @return The unique identifier for the Amazon Web Services account that the data applies to.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The unique identifier for the Amazon Web Services account that the data applies to.
     * </p>
     * 
     * @param accountId
     *        The unique identifier for the Amazon Web Services account that the data applies to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UsageRecord withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when the free trial started for the account.
     * </p>
     * 
     * @param freeTrialStartDate
     *        The date and time, in UTC and extended ISO 8601 format, when the free trial started for the account.
     */

    public void setFreeTrialStartDate(java.util.Date freeTrialStartDate) {
        this.freeTrialStartDate = freeTrialStartDate;
    }

    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when the free trial started for the account.
     * </p>
     * 
     * @return The date and time, in UTC and extended ISO 8601 format, when the free trial started for the account.
     */

    public java.util.Date getFreeTrialStartDate() {
        return this.freeTrialStartDate;
    }

    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when the free trial started for the account.
     * </p>
     * 
     * @param freeTrialStartDate
     *        The date and time, in UTC and extended ISO 8601 format, when the free trial started for the account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UsageRecord withFreeTrialStartDate(java.util.Date freeTrialStartDate) {
        setFreeTrialStartDate(freeTrialStartDate);
        return this;
    }

    /**
     * <p>
     * An array of objects that contains usage data and quotas for the account. Each object contains the data for a
     * specific usage metric and the corresponding quota.
     * </p>
     * 
     * @return An array of objects that contains usage data and quotas for the account. Each object contains the data
     *         for a specific usage metric and the corresponding quota.
     */

    public java.util.List<UsageByAccount> getUsage() {
        return usage;
    }

    /**
     * <p>
     * An array of objects that contains usage data and quotas for the account. Each object contains the data for a
     * specific usage metric and the corresponding quota.
     * </p>
     * 
     * @param usage
     *        An array of objects that contains usage data and quotas for the account. Each object contains the data for
     *        a specific usage metric and the corresponding quota.
     */

    public void setUsage(java.util.Collection<UsageByAccount> usage) {
        if (usage == null) {
            this.usage = null;
            return;
        }

        this.usage = new java.util.ArrayList<UsageByAccount>(usage);
    }

    /**
     * <p>
     * An array of objects that contains usage data and quotas for the account. Each object contains the data for a
     * specific usage metric and the corresponding quota.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUsage(java.util.Collection)} or {@link #withUsage(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param usage
     *        An array of objects that contains usage data and quotas for the account. Each object contains the data for
     *        a specific usage metric and the corresponding quota.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UsageRecord withUsage(UsageByAccount... usage) {
        if (this.usage == null) {
            setUsage(new java.util.ArrayList<UsageByAccount>(usage.length));
        }
        for (UsageByAccount ele : usage) {
            this.usage.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of objects that contains usage data and quotas for the account. Each object contains the data for a
     * specific usage metric and the corresponding quota.
     * </p>
     * 
     * @param usage
     *        An array of objects that contains usage data and quotas for the account. Each object contains the data for
     *        a specific usage metric and the corresponding quota.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UsageRecord withUsage(java.util.Collection<UsageByAccount> usage) {
        setUsage(usage);
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
        if (getFreeTrialStartDate() != null)
            sb.append("FreeTrialStartDate: ").append(getFreeTrialStartDate()).append(",");
        if (getUsage() != null)
            sb.append("Usage: ").append(getUsage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UsageRecord == false)
            return false;
        UsageRecord other = (UsageRecord) obj;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getFreeTrialStartDate() == null ^ this.getFreeTrialStartDate() == null)
            return false;
        if (other.getFreeTrialStartDate() != null && other.getFreeTrialStartDate().equals(this.getFreeTrialStartDate()) == false)
            return false;
        if (other.getUsage() == null ^ this.getUsage() == null)
            return false;
        if (other.getUsage() != null && other.getUsage().equals(this.getUsage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getFreeTrialStartDate() == null) ? 0 : getFreeTrialStartDate().hashCode());
        hashCode = prime * hashCode + ((getUsage() == null) ? 0 : getUsage().hashCode());
        return hashCode;
    }

    @Override
    public UsageRecord clone() {
        try {
            return (UsageRecord) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.macie2.model.transform.UsageRecordMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
