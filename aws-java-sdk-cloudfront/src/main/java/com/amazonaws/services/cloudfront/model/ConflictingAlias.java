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
package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * An alias (also called a CNAME) and the CloudFront distribution and Amazon Web Services account ID that it’s
 * associated with. The distribution and account IDs are partially hidden, which allows you to identify the
 * distributions and accounts that you own, but helps to protect the information of ones that you don’t own.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/ConflictingAlias" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConflictingAlias implements Serializable, Cloneable {

    /**
     * <p>
     * An alias (also called a CNAME).
     * </p>
     */
    private String alias;
    /**
     * <p>
     * The (partially hidden) ID of the CloudFront distribution associated with the alias.
     * </p>
     */
    private String distributionId;
    /**
     * <p>
     * The (partially hidden) ID of the Amazon Web Services account that owns the distribution that’s associated with
     * the alias.
     * </p>
     */
    private String accountId;

    /**
     * <p>
     * An alias (also called a CNAME).
     * </p>
     * 
     * @param alias
     *        An alias (also called a CNAME).
     */

    public void setAlias(String alias) {
        this.alias = alias;
    }

    /**
     * <p>
     * An alias (also called a CNAME).
     * </p>
     * 
     * @return An alias (also called a CNAME).
     */

    public String getAlias() {
        return this.alias;
    }

    /**
     * <p>
     * An alias (also called a CNAME).
     * </p>
     * 
     * @param alias
     *        An alias (also called a CNAME).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConflictingAlias withAlias(String alias) {
        setAlias(alias);
        return this;
    }

    /**
     * <p>
     * The (partially hidden) ID of the CloudFront distribution associated with the alias.
     * </p>
     * 
     * @param distributionId
     *        The (partially hidden) ID of the CloudFront distribution associated with the alias.
     */

    public void setDistributionId(String distributionId) {
        this.distributionId = distributionId;
    }

    /**
     * <p>
     * The (partially hidden) ID of the CloudFront distribution associated with the alias.
     * </p>
     * 
     * @return The (partially hidden) ID of the CloudFront distribution associated with the alias.
     */

    public String getDistributionId() {
        return this.distributionId;
    }

    /**
     * <p>
     * The (partially hidden) ID of the CloudFront distribution associated with the alias.
     * </p>
     * 
     * @param distributionId
     *        The (partially hidden) ID of the CloudFront distribution associated with the alias.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConflictingAlias withDistributionId(String distributionId) {
        setDistributionId(distributionId);
        return this;
    }

    /**
     * <p>
     * The (partially hidden) ID of the Amazon Web Services account that owns the distribution that’s associated with
     * the alias.
     * </p>
     * 
     * @param accountId
     *        The (partially hidden) ID of the Amazon Web Services account that owns the distribution that’s associated
     *        with the alias.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The (partially hidden) ID of the Amazon Web Services account that owns the distribution that’s associated with
     * the alias.
     * </p>
     * 
     * @return The (partially hidden) ID of the Amazon Web Services account that owns the distribution that’s associated
     *         with the alias.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The (partially hidden) ID of the Amazon Web Services account that owns the distribution that’s associated with
     * the alias.
     * </p>
     * 
     * @param accountId
     *        The (partially hidden) ID of the Amazon Web Services account that owns the distribution that’s associated
     *        with the alias.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConflictingAlias withAccountId(String accountId) {
        setAccountId(accountId);
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
        if (getAlias() != null)
            sb.append("Alias: ").append(getAlias()).append(",");
        if (getDistributionId() != null)
            sb.append("DistributionId: ").append(getDistributionId()).append(",");
        if (getAccountId() != null)
            sb.append("AccountId: ").append(getAccountId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConflictingAlias == false)
            return false;
        ConflictingAlias other = (ConflictingAlias) obj;
        if (other.getAlias() == null ^ this.getAlias() == null)
            return false;
        if (other.getAlias() != null && other.getAlias().equals(this.getAlias()) == false)
            return false;
        if (other.getDistributionId() == null ^ this.getDistributionId() == null)
            return false;
        if (other.getDistributionId() != null && other.getDistributionId().equals(this.getDistributionId()) == false)
            return false;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAlias() == null) ? 0 : getAlias().hashCode());
        hashCode = prime * hashCode + ((getDistributionId() == null) ? 0 : getDistributionId().hashCode());
        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        return hashCode;
    }

    @Override
    public ConflictingAlias clone() {
        try {
            return (ConflictingAlias) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
