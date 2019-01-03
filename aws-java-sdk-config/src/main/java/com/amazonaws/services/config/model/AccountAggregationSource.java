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
package com.amazonaws.services.config.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A collection of accounts and regions.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/AccountAggregationSource" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AccountAggregationSource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The 12-digit account ID of the account being aggregated.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> accountIds;
    /**
     * <p>
     * If true, aggregate existing AWS Config regions and future regions.
     * </p>
     */
    private Boolean allAwsRegions;
    /**
     * <p>
     * The source regions being aggregated.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> awsRegions;

    /**
     * <p>
     * The 12-digit account ID of the account being aggregated.
     * </p>
     * 
     * @return The 12-digit account ID of the account being aggregated.
     */

    public java.util.List<String> getAccountIds() {
        if (accountIds == null) {
            accountIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return accountIds;
    }

    /**
     * <p>
     * The 12-digit account ID of the account being aggregated.
     * </p>
     * 
     * @param accountIds
     *        The 12-digit account ID of the account being aggregated.
     */

    public void setAccountIds(java.util.Collection<String> accountIds) {
        if (accountIds == null) {
            this.accountIds = null;
            return;
        }

        this.accountIds = new com.amazonaws.internal.SdkInternalList<String>(accountIds);
    }

    /**
     * <p>
     * The 12-digit account ID of the account being aggregated.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAccountIds(java.util.Collection)} or {@link #withAccountIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param accountIds
     *        The 12-digit account ID of the account being aggregated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccountAggregationSource withAccountIds(String... accountIds) {
        if (this.accountIds == null) {
            setAccountIds(new com.amazonaws.internal.SdkInternalList<String>(accountIds.length));
        }
        for (String ele : accountIds) {
            this.accountIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The 12-digit account ID of the account being aggregated.
     * </p>
     * 
     * @param accountIds
     *        The 12-digit account ID of the account being aggregated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccountAggregationSource withAccountIds(java.util.Collection<String> accountIds) {
        setAccountIds(accountIds);
        return this;
    }

    /**
     * <p>
     * If true, aggregate existing AWS Config regions and future regions.
     * </p>
     * 
     * @param allAwsRegions
     *        If true, aggregate existing AWS Config regions and future regions.
     */

    public void setAllAwsRegions(Boolean allAwsRegions) {
        this.allAwsRegions = allAwsRegions;
    }

    /**
     * <p>
     * If true, aggregate existing AWS Config regions and future regions.
     * </p>
     * 
     * @return If true, aggregate existing AWS Config regions and future regions.
     */

    public Boolean getAllAwsRegions() {
        return this.allAwsRegions;
    }

    /**
     * <p>
     * If true, aggregate existing AWS Config regions and future regions.
     * </p>
     * 
     * @param allAwsRegions
     *        If true, aggregate existing AWS Config regions and future regions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccountAggregationSource withAllAwsRegions(Boolean allAwsRegions) {
        setAllAwsRegions(allAwsRegions);
        return this;
    }

    /**
     * <p>
     * If true, aggregate existing AWS Config regions and future regions.
     * </p>
     * 
     * @return If true, aggregate existing AWS Config regions and future regions.
     */

    public Boolean isAllAwsRegions() {
        return this.allAwsRegions;
    }

    /**
     * <p>
     * The source regions being aggregated.
     * </p>
     * 
     * @return The source regions being aggregated.
     */

    public java.util.List<String> getAwsRegions() {
        if (awsRegions == null) {
            awsRegions = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return awsRegions;
    }

    /**
     * <p>
     * The source regions being aggregated.
     * </p>
     * 
     * @param awsRegions
     *        The source regions being aggregated.
     */

    public void setAwsRegions(java.util.Collection<String> awsRegions) {
        if (awsRegions == null) {
            this.awsRegions = null;
            return;
        }

        this.awsRegions = new com.amazonaws.internal.SdkInternalList<String>(awsRegions);
    }

    /**
     * <p>
     * The source regions being aggregated.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAwsRegions(java.util.Collection)} or {@link #withAwsRegions(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param awsRegions
     *        The source regions being aggregated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccountAggregationSource withAwsRegions(String... awsRegions) {
        if (this.awsRegions == null) {
            setAwsRegions(new com.amazonaws.internal.SdkInternalList<String>(awsRegions.length));
        }
        for (String ele : awsRegions) {
            this.awsRegions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The source regions being aggregated.
     * </p>
     * 
     * @param awsRegions
     *        The source regions being aggregated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccountAggregationSource withAwsRegions(java.util.Collection<String> awsRegions) {
        setAwsRegions(awsRegions);
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
        if (getAccountIds() != null)
            sb.append("AccountIds: ").append(getAccountIds()).append(",");
        if (getAllAwsRegions() != null)
            sb.append("AllAwsRegions: ").append(getAllAwsRegions()).append(",");
        if (getAwsRegions() != null)
            sb.append("AwsRegions: ").append(getAwsRegions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AccountAggregationSource == false)
            return false;
        AccountAggregationSource other = (AccountAggregationSource) obj;
        if (other.getAccountIds() == null ^ this.getAccountIds() == null)
            return false;
        if (other.getAccountIds() != null && other.getAccountIds().equals(this.getAccountIds()) == false)
            return false;
        if (other.getAllAwsRegions() == null ^ this.getAllAwsRegions() == null)
            return false;
        if (other.getAllAwsRegions() != null && other.getAllAwsRegions().equals(this.getAllAwsRegions()) == false)
            return false;
        if (other.getAwsRegions() == null ^ this.getAwsRegions() == null)
            return false;
        if (other.getAwsRegions() != null && other.getAwsRegions().equals(this.getAwsRegions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountIds() == null) ? 0 : getAccountIds().hashCode());
        hashCode = prime * hashCode + ((getAllAwsRegions() == null) ? 0 : getAllAwsRegions().hashCode());
        hashCode = prime * hashCode + ((getAwsRegions() == null) ? 0 : getAwsRegions().hashCode());
        return hashCode;
    }

    @Override
    public AccountAggregationSource clone() {
        try {
            return (AccountAggregationSource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.config.model.transform.AccountAggregationSourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
