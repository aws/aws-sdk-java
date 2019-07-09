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
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/StatusDetailFilters" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StatusDetailFilters implements Serializable, Cloneable, StructuredPojo {

    private String accountId;

    private String memberAccountRuleStatus;

    /**
     * @param accountId
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * @return
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * @param accountId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StatusDetailFilters withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * @param memberAccountRuleStatus
     * @see MemberAccountRuleStatus
     */

    public void setMemberAccountRuleStatus(String memberAccountRuleStatus) {
        this.memberAccountRuleStatus = memberAccountRuleStatus;
    }

    /**
     * @return
     * @see MemberAccountRuleStatus
     */

    public String getMemberAccountRuleStatus() {
        return this.memberAccountRuleStatus;
    }

    /**
     * @param memberAccountRuleStatus
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MemberAccountRuleStatus
     */

    public StatusDetailFilters withMemberAccountRuleStatus(String memberAccountRuleStatus) {
        setMemberAccountRuleStatus(memberAccountRuleStatus);
        return this;
    }

    /**
     * @param memberAccountRuleStatus
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MemberAccountRuleStatus
     */

    public StatusDetailFilters withMemberAccountRuleStatus(MemberAccountRuleStatus memberAccountRuleStatus) {
        this.memberAccountRuleStatus = memberAccountRuleStatus.toString();
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
        if (getMemberAccountRuleStatus() != null)
            sb.append("MemberAccountRuleStatus: ").append(getMemberAccountRuleStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StatusDetailFilters == false)
            return false;
        StatusDetailFilters other = (StatusDetailFilters) obj;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getMemberAccountRuleStatus() == null ^ this.getMemberAccountRuleStatus() == null)
            return false;
        if (other.getMemberAccountRuleStatus() != null && other.getMemberAccountRuleStatus().equals(this.getMemberAccountRuleStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getMemberAccountRuleStatus() == null) ? 0 : getMemberAccountRuleStatus().hashCode());
        return hashCode;
    }

    @Override
    public StatusDetailFilters clone() {
        try {
            return (StatusDetailFilters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.config.model.transform.StatusDetailFiltersMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
