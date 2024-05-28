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
package com.amazonaws.services.guardduty.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the coverage statistics of the features for the entire Amazon Web Services organization.
 * </p>
 * <p>
 * When you create a new Amazon Web Services organization, it might take up to 24 hours to generate the statistics
 * summary for this organization.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/OrganizationStatistics" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OrganizationStatistics implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Total number of accounts in your Amazon Web Services organization.
     * </p>
     */
    private Integer totalAccountsCount;
    /**
     * <p>
     * Total number of accounts in your Amazon Web Services organization that are associated with GuardDuty.
     * </p>
     */
    private Integer memberAccountsCount;
    /**
     * <p>
     * Total number of active accounts in your Amazon Web Services organization that are associated with GuardDuty.
     * </p>
     */
    private Integer activeAccountsCount;
    /**
     * <p>
     * Total number of accounts that have enabled GuardDuty.
     * </p>
     */
    private Integer enabledAccountsCount;
    /**
     * <p>
     * Retrieves the coverage statistics for each feature.
     * </p>
     */
    private java.util.List<OrganizationFeatureStatistics> countByFeature;

    /**
     * <p>
     * Total number of accounts in your Amazon Web Services organization.
     * </p>
     * 
     * @param totalAccountsCount
     *        Total number of accounts in your Amazon Web Services organization.
     */

    public void setTotalAccountsCount(Integer totalAccountsCount) {
        this.totalAccountsCount = totalAccountsCount;
    }

    /**
     * <p>
     * Total number of accounts in your Amazon Web Services organization.
     * </p>
     * 
     * @return Total number of accounts in your Amazon Web Services organization.
     */

    public Integer getTotalAccountsCount() {
        return this.totalAccountsCount;
    }

    /**
     * <p>
     * Total number of accounts in your Amazon Web Services organization.
     * </p>
     * 
     * @param totalAccountsCount
     *        Total number of accounts in your Amazon Web Services organization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrganizationStatistics withTotalAccountsCount(Integer totalAccountsCount) {
        setTotalAccountsCount(totalAccountsCount);
        return this;
    }

    /**
     * <p>
     * Total number of accounts in your Amazon Web Services organization that are associated with GuardDuty.
     * </p>
     * 
     * @param memberAccountsCount
     *        Total number of accounts in your Amazon Web Services organization that are associated with GuardDuty.
     */

    public void setMemberAccountsCount(Integer memberAccountsCount) {
        this.memberAccountsCount = memberAccountsCount;
    }

    /**
     * <p>
     * Total number of accounts in your Amazon Web Services organization that are associated with GuardDuty.
     * </p>
     * 
     * @return Total number of accounts in your Amazon Web Services organization that are associated with GuardDuty.
     */

    public Integer getMemberAccountsCount() {
        return this.memberAccountsCount;
    }

    /**
     * <p>
     * Total number of accounts in your Amazon Web Services organization that are associated with GuardDuty.
     * </p>
     * 
     * @param memberAccountsCount
     *        Total number of accounts in your Amazon Web Services organization that are associated with GuardDuty.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrganizationStatistics withMemberAccountsCount(Integer memberAccountsCount) {
        setMemberAccountsCount(memberAccountsCount);
        return this;
    }

    /**
     * <p>
     * Total number of active accounts in your Amazon Web Services organization that are associated with GuardDuty.
     * </p>
     * 
     * @param activeAccountsCount
     *        Total number of active accounts in your Amazon Web Services organization that are associated with
     *        GuardDuty.
     */

    public void setActiveAccountsCount(Integer activeAccountsCount) {
        this.activeAccountsCount = activeAccountsCount;
    }

    /**
     * <p>
     * Total number of active accounts in your Amazon Web Services organization that are associated with GuardDuty.
     * </p>
     * 
     * @return Total number of active accounts in your Amazon Web Services organization that are associated with
     *         GuardDuty.
     */

    public Integer getActiveAccountsCount() {
        return this.activeAccountsCount;
    }

    /**
     * <p>
     * Total number of active accounts in your Amazon Web Services organization that are associated with GuardDuty.
     * </p>
     * 
     * @param activeAccountsCount
     *        Total number of active accounts in your Amazon Web Services organization that are associated with
     *        GuardDuty.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrganizationStatistics withActiveAccountsCount(Integer activeAccountsCount) {
        setActiveAccountsCount(activeAccountsCount);
        return this;
    }

    /**
     * <p>
     * Total number of accounts that have enabled GuardDuty.
     * </p>
     * 
     * @param enabledAccountsCount
     *        Total number of accounts that have enabled GuardDuty.
     */

    public void setEnabledAccountsCount(Integer enabledAccountsCount) {
        this.enabledAccountsCount = enabledAccountsCount;
    }

    /**
     * <p>
     * Total number of accounts that have enabled GuardDuty.
     * </p>
     * 
     * @return Total number of accounts that have enabled GuardDuty.
     */

    public Integer getEnabledAccountsCount() {
        return this.enabledAccountsCount;
    }

    /**
     * <p>
     * Total number of accounts that have enabled GuardDuty.
     * </p>
     * 
     * @param enabledAccountsCount
     *        Total number of accounts that have enabled GuardDuty.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrganizationStatistics withEnabledAccountsCount(Integer enabledAccountsCount) {
        setEnabledAccountsCount(enabledAccountsCount);
        return this;
    }

    /**
     * <p>
     * Retrieves the coverage statistics for each feature.
     * </p>
     * 
     * @return Retrieves the coverage statistics for each feature.
     */

    public java.util.List<OrganizationFeatureStatistics> getCountByFeature() {
        return countByFeature;
    }

    /**
     * <p>
     * Retrieves the coverage statistics for each feature.
     * </p>
     * 
     * @param countByFeature
     *        Retrieves the coverage statistics for each feature.
     */

    public void setCountByFeature(java.util.Collection<OrganizationFeatureStatistics> countByFeature) {
        if (countByFeature == null) {
            this.countByFeature = null;
            return;
        }

        this.countByFeature = new java.util.ArrayList<OrganizationFeatureStatistics>(countByFeature);
    }

    /**
     * <p>
     * Retrieves the coverage statistics for each feature.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCountByFeature(java.util.Collection)} or {@link #withCountByFeature(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param countByFeature
     *        Retrieves the coverage statistics for each feature.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrganizationStatistics withCountByFeature(OrganizationFeatureStatistics... countByFeature) {
        if (this.countByFeature == null) {
            setCountByFeature(new java.util.ArrayList<OrganizationFeatureStatistics>(countByFeature.length));
        }
        for (OrganizationFeatureStatistics ele : countByFeature) {
            this.countByFeature.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Retrieves the coverage statistics for each feature.
     * </p>
     * 
     * @param countByFeature
     *        Retrieves the coverage statistics for each feature.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrganizationStatistics withCountByFeature(java.util.Collection<OrganizationFeatureStatistics> countByFeature) {
        setCountByFeature(countByFeature);
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
        if (getTotalAccountsCount() != null)
            sb.append("TotalAccountsCount: ").append(getTotalAccountsCount()).append(",");
        if (getMemberAccountsCount() != null)
            sb.append("MemberAccountsCount: ").append(getMemberAccountsCount()).append(",");
        if (getActiveAccountsCount() != null)
            sb.append("ActiveAccountsCount: ").append(getActiveAccountsCount()).append(",");
        if (getEnabledAccountsCount() != null)
            sb.append("EnabledAccountsCount: ").append(getEnabledAccountsCount()).append(",");
        if (getCountByFeature() != null)
            sb.append("CountByFeature: ").append(getCountByFeature());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OrganizationStatistics == false)
            return false;
        OrganizationStatistics other = (OrganizationStatistics) obj;
        if (other.getTotalAccountsCount() == null ^ this.getTotalAccountsCount() == null)
            return false;
        if (other.getTotalAccountsCount() != null && other.getTotalAccountsCount().equals(this.getTotalAccountsCount()) == false)
            return false;
        if (other.getMemberAccountsCount() == null ^ this.getMemberAccountsCount() == null)
            return false;
        if (other.getMemberAccountsCount() != null && other.getMemberAccountsCount().equals(this.getMemberAccountsCount()) == false)
            return false;
        if (other.getActiveAccountsCount() == null ^ this.getActiveAccountsCount() == null)
            return false;
        if (other.getActiveAccountsCount() != null && other.getActiveAccountsCount().equals(this.getActiveAccountsCount()) == false)
            return false;
        if (other.getEnabledAccountsCount() == null ^ this.getEnabledAccountsCount() == null)
            return false;
        if (other.getEnabledAccountsCount() != null && other.getEnabledAccountsCount().equals(this.getEnabledAccountsCount()) == false)
            return false;
        if (other.getCountByFeature() == null ^ this.getCountByFeature() == null)
            return false;
        if (other.getCountByFeature() != null && other.getCountByFeature().equals(this.getCountByFeature()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTotalAccountsCount() == null) ? 0 : getTotalAccountsCount().hashCode());
        hashCode = prime * hashCode + ((getMemberAccountsCount() == null) ? 0 : getMemberAccountsCount().hashCode());
        hashCode = prime * hashCode + ((getActiveAccountsCount() == null) ? 0 : getActiveAccountsCount().hashCode());
        hashCode = prime * hashCode + ((getEnabledAccountsCount() == null) ? 0 : getEnabledAccountsCount().hashCode());
        hashCode = prime * hashCode + ((getCountByFeature() == null) ? 0 : getCountByFeature().hashCode());
        return hashCode;
    }

    @Override
    public OrganizationStatistics clone() {
        try {
            return (OrganizationStatistics) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.guardduty.model.transform.OrganizationStatisticsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
