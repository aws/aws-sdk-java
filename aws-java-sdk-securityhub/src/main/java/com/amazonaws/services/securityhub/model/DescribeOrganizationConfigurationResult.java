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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DescribeOrganizationConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeOrganizationConfigurationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * Whether to automatically enable Security Hub for new accounts in the organization.
     * </p>
     * <p>
     * If set to <code>true</code>, then Security Hub is enabled for new accounts. If set to false, then new accounts
     * are not added automatically.
     * </p>
     */
    private Boolean autoEnable;
    /**
     * <p>
     * Whether the maximum number of allowed member accounts are already associated with the Security Hub administrator
     * account.
     * </p>
     */
    private Boolean memberAccountLimitReached;

    /**
     * <p>
     * Whether to automatically enable Security Hub for new accounts in the organization.
     * </p>
     * <p>
     * If set to <code>true</code>, then Security Hub is enabled for new accounts. If set to false, then new accounts
     * are not added automatically.
     * </p>
     * 
     * @param autoEnable
     *        Whether to automatically enable Security Hub for new accounts in the organization.</p>
     *        <p>
     *        If set to <code>true</code>, then Security Hub is enabled for new accounts. If set to false, then new
     *        accounts are not added automatically.
     */

    public void setAutoEnable(Boolean autoEnable) {
        this.autoEnable = autoEnable;
    }

    /**
     * <p>
     * Whether to automatically enable Security Hub for new accounts in the organization.
     * </p>
     * <p>
     * If set to <code>true</code>, then Security Hub is enabled for new accounts. If set to false, then new accounts
     * are not added automatically.
     * </p>
     * 
     * @return Whether to automatically enable Security Hub for new accounts in the organization.</p>
     *         <p>
     *         If set to <code>true</code>, then Security Hub is enabled for new accounts. If set to false, then new
     *         accounts are not added automatically.
     */

    public Boolean getAutoEnable() {
        return this.autoEnable;
    }

    /**
     * <p>
     * Whether to automatically enable Security Hub for new accounts in the organization.
     * </p>
     * <p>
     * If set to <code>true</code>, then Security Hub is enabled for new accounts. If set to false, then new accounts
     * are not added automatically.
     * </p>
     * 
     * @param autoEnable
     *        Whether to automatically enable Security Hub for new accounts in the organization.</p>
     *        <p>
     *        If set to <code>true</code>, then Security Hub is enabled for new accounts. If set to false, then new
     *        accounts are not added automatically.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeOrganizationConfigurationResult withAutoEnable(Boolean autoEnable) {
        setAutoEnable(autoEnable);
        return this;
    }

    /**
     * <p>
     * Whether to automatically enable Security Hub for new accounts in the organization.
     * </p>
     * <p>
     * If set to <code>true</code>, then Security Hub is enabled for new accounts. If set to false, then new accounts
     * are not added automatically.
     * </p>
     * 
     * @return Whether to automatically enable Security Hub for new accounts in the organization.</p>
     *         <p>
     *         If set to <code>true</code>, then Security Hub is enabled for new accounts. If set to false, then new
     *         accounts are not added automatically.
     */

    public Boolean isAutoEnable() {
        return this.autoEnable;
    }

    /**
     * <p>
     * Whether the maximum number of allowed member accounts are already associated with the Security Hub administrator
     * account.
     * </p>
     * 
     * @param memberAccountLimitReached
     *        Whether the maximum number of allowed member accounts are already associated with the Security Hub
     *        administrator account.
     */

    public void setMemberAccountLimitReached(Boolean memberAccountLimitReached) {
        this.memberAccountLimitReached = memberAccountLimitReached;
    }

    /**
     * <p>
     * Whether the maximum number of allowed member accounts are already associated with the Security Hub administrator
     * account.
     * </p>
     * 
     * @return Whether the maximum number of allowed member accounts are already associated with the Security Hub
     *         administrator account.
     */

    public Boolean getMemberAccountLimitReached() {
        return this.memberAccountLimitReached;
    }

    /**
     * <p>
     * Whether the maximum number of allowed member accounts are already associated with the Security Hub administrator
     * account.
     * </p>
     * 
     * @param memberAccountLimitReached
     *        Whether the maximum number of allowed member accounts are already associated with the Security Hub
     *        administrator account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeOrganizationConfigurationResult withMemberAccountLimitReached(Boolean memberAccountLimitReached) {
        setMemberAccountLimitReached(memberAccountLimitReached);
        return this;
    }

    /**
     * <p>
     * Whether the maximum number of allowed member accounts are already associated with the Security Hub administrator
     * account.
     * </p>
     * 
     * @return Whether the maximum number of allowed member accounts are already associated with the Security Hub
     *         administrator account.
     */

    public Boolean isMemberAccountLimitReached() {
        return this.memberAccountLimitReached;
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
        if (getAutoEnable() != null)
            sb.append("AutoEnable: ").append(getAutoEnable()).append(",");
        if (getMemberAccountLimitReached() != null)
            sb.append("MemberAccountLimitReached: ").append(getMemberAccountLimitReached());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeOrganizationConfigurationResult == false)
            return false;
        DescribeOrganizationConfigurationResult other = (DescribeOrganizationConfigurationResult) obj;
        if (other.getAutoEnable() == null ^ this.getAutoEnable() == null)
            return false;
        if (other.getAutoEnable() != null && other.getAutoEnable().equals(this.getAutoEnable()) == false)
            return false;
        if (other.getMemberAccountLimitReached() == null ^ this.getMemberAccountLimitReached() == null)
            return false;
        if (other.getMemberAccountLimitReached() != null && other.getMemberAccountLimitReached().equals(this.getMemberAccountLimitReached()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAutoEnable() == null) ? 0 : getAutoEnable().hashCode());
        hashCode = prime * hashCode + ((getMemberAccountLimitReached() == null) ? 0 : getMemberAccountLimitReached().hashCode());
        return hashCode;
    }

    @Override
    public DescribeOrganizationConfigurationResult clone() {
        try {
            return (DescribeOrganizationConfigurationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
