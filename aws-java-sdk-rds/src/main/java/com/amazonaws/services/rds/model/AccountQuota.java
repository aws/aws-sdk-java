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
package com.amazonaws.services.rds.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes a quota for an AWS account, for example, the number of DB instances allowed.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/AccountQuota" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AccountQuota implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the Amazon RDS quota for this AWS account.
     * </p>
     */
    private String accountQuotaName;
    /**
     * <p>
     * The amount currently used toward the quota maximum.
     * </p>
     */
    private Long used;
    /**
     * <p>
     * The maximum allowed value for the quota.
     * </p>
     */
    private Long max;

    /**
     * <p>
     * The name of the Amazon RDS quota for this AWS account.
     * </p>
     * 
     * @param accountQuotaName
     *        The name of the Amazon RDS quota for this AWS account.
     */

    public void setAccountQuotaName(String accountQuotaName) {
        this.accountQuotaName = accountQuotaName;
    }

    /**
     * <p>
     * The name of the Amazon RDS quota for this AWS account.
     * </p>
     * 
     * @return The name of the Amazon RDS quota for this AWS account.
     */

    public String getAccountQuotaName() {
        return this.accountQuotaName;
    }

    /**
     * <p>
     * The name of the Amazon RDS quota for this AWS account.
     * </p>
     * 
     * @param accountQuotaName
     *        The name of the Amazon RDS quota for this AWS account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccountQuota withAccountQuotaName(String accountQuotaName) {
        setAccountQuotaName(accountQuotaName);
        return this;
    }

    /**
     * <p>
     * The amount currently used toward the quota maximum.
     * </p>
     * 
     * @param used
     *        The amount currently used toward the quota maximum.
     */

    public void setUsed(Long used) {
        this.used = used;
    }

    /**
     * <p>
     * The amount currently used toward the quota maximum.
     * </p>
     * 
     * @return The amount currently used toward the quota maximum.
     */

    public Long getUsed() {
        return this.used;
    }

    /**
     * <p>
     * The amount currently used toward the quota maximum.
     * </p>
     * 
     * @param used
     *        The amount currently used toward the quota maximum.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccountQuota withUsed(Long used) {
        setUsed(used);
        return this;
    }

    /**
     * <p>
     * The maximum allowed value for the quota.
     * </p>
     * 
     * @param max
     *        The maximum allowed value for the quota.
     */

    public void setMax(Long max) {
        this.max = max;
    }

    /**
     * <p>
     * The maximum allowed value for the quota.
     * </p>
     * 
     * @return The maximum allowed value for the quota.
     */

    public Long getMax() {
        return this.max;
    }

    /**
     * <p>
     * The maximum allowed value for the quota.
     * </p>
     * 
     * @param max
     *        The maximum allowed value for the quota.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccountQuota withMax(Long max) {
        setMax(max);
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
        if (getAccountQuotaName() != null)
            sb.append("AccountQuotaName: ").append(getAccountQuotaName()).append(",");
        if (getUsed() != null)
            sb.append("Used: ").append(getUsed()).append(",");
        if (getMax() != null)
            sb.append("Max: ").append(getMax());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AccountQuota == false)
            return false;
        AccountQuota other = (AccountQuota) obj;
        if (other.getAccountQuotaName() == null ^ this.getAccountQuotaName() == null)
            return false;
        if (other.getAccountQuotaName() != null && other.getAccountQuotaName().equals(this.getAccountQuotaName()) == false)
            return false;
        if (other.getUsed() == null ^ this.getUsed() == null)
            return false;
        if (other.getUsed() != null && other.getUsed().equals(this.getUsed()) == false)
            return false;
        if (other.getMax() == null ^ this.getMax() == null)
            return false;
        if (other.getMax() != null && other.getMax().equals(this.getMax()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountQuotaName() == null) ? 0 : getAccountQuotaName().hashCode());
        hashCode = prime * hashCode + ((getUsed() == null) ? 0 : getUsed().hashCode());
        hashCode = prime * hashCode + ((getMax() == null) ? 0 : getMax().hashCode());
        return hashCode;
    }

    @Override
    public AccountQuota clone() {
        try {
            return (AccountQuota) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
