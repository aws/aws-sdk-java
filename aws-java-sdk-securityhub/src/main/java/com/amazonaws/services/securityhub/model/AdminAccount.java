/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents a Security Hub administrator account designated by an organization management account.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AdminAccount" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AdminAccount implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The AWS account identifier of the Security Hub administrator account.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * The current status of the Security Hub administrator account. Indicates whether the account is currently enabled
     * as a Security Hub administrator.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The AWS account identifier of the Security Hub administrator account.
     * </p>
     * 
     * @param accountId
     *        The AWS account identifier of the Security Hub administrator account.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The AWS account identifier of the Security Hub administrator account.
     * </p>
     * 
     * @return The AWS account identifier of the Security Hub administrator account.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The AWS account identifier of the Security Hub administrator account.
     * </p>
     * 
     * @param accountId
     *        The AWS account identifier of the Security Hub administrator account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdminAccount withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * The current status of the Security Hub administrator account. Indicates whether the account is currently enabled
     * as a Security Hub administrator.
     * </p>
     * 
     * @param status
     *        The current status of the Security Hub administrator account. Indicates whether the account is currently
     *        enabled as a Security Hub administrator.
     * @see AdminStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the Security Hub administrator account. Indicates whether the account is currently enabled
     * as a Security Hub administrator.
     * </p>
     * 
     * @return The current status of the Security Hub administrator account. Indicates whether the account is currently
     *         enabled as a Security Hub administrator.
     * @see AdminStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status of the Security Hub administrator account. Indicates whether the account is currently enabled
     * as a Security Hub administrator.
     * </p>
     * 
     * @param status
     *        The current status of the Security Hub administrator account. Indicates whether the account is currently
     *        enabled as a Security Hub administrator.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AdminStatus
     */

    public AdminAccount withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The current status of the Security Hub administrator account. Indicates whether the account is currently enabled
     * as a Security Hub administrator.
     * </p>
     * 
     * @param status
     *        The current status of the Security Hub administrator account. Indicates whether the account is currently
     *        enabled as a Security Hub administrator.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AdminStatus
     */

    public AdminAccount withStatus(AdminStatus status) {
        this.status = status.toString();
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
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AdminAccount == false)
            return false;
        AdminAccount other = (AdminAccount) obj;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public AdminAccount clone() {
        try {
            return (AdminAccount) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AdminAccountMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
