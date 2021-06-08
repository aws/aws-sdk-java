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
package com.amazonaws.services.guardduty.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The account within the organization specified as the GuardDuty delegated administrator.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/AdminAccount" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AdminAccount implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The AWS account ID for the account.
     * </p>
     */
    private String adminAccountId;
    /**
     * <p>
     * Indicates whether the account is enabled as the delegated administrator.
     * </p>
     */
    private String adminStatus;

    /**
     * <p>
     * The AWS account ID for the account.
     * </p>
     * 
     * @param adminAccountId
     *        The AWS account ID for the account.
     */

    public void setAdminAccountId(String adminAccountId) {
        this.adminAccountId = adminAccountId;
    }

    /**
     * <p>
     * The AWS account ID for the account.
     * </p>
     * 
     * @return The AWS account ID for the account.
     */

    public String getAdminAccountId() {
        return this.adminAccountId;
    }

    /**
     * <p>
     * The AWS account ID for the account.
     * </p>
     * 
     * @param adminAccountId
     *        The AWS account ID for the account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdminAccount withAdminAccountId(String adminAccountId) {
        setAdminAccountId(adminAccountId);
        return this;
    }

    /**
     * <p>
     * Indicates whether the account is enabled as the delegated administrator.
     * </p>
     * 
     * @param adminStatus
     *        Indicates whether the account is enabled as the delegated administrator.
     * @see AdminStatus
     */

    public void setAdminStatus(String adminStatus) {
        this.adminStatus = adminStatus;
    }

    /**
     * <p>
     * Indicates whether the account is enabled as the delegated administrator.
     * </p>
     * 
     * @return Indicates whether the account is enabled as the delegated administrator.
     * @see AdminStatus
     */

    public String getAdminStatus() {
        return this.adminStatus;
    }

    /**
     * <p>
     * Indicates whether the account is enabled as the delegated administrator.
     * </p>
     * 
     * @param adminStatus
     *        Indicates whether the account is enabled as the delegated administrator.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AdminStatus
     */

    public AdminAccount withAdminStatus(String adminStatus) {
        setAdminStatus(adminStatus);
        return this;
    }

    /**
     * <p>
     * Indicates whether the account is enabled as the delegated administrator.
     * </p>
     * 
     * @param adminStatus
     *        Indicates whether the account is enabled as the delegated administrator.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AdminStatus
     */

    public AdminAccount withAdminStatus(AdminStatus adminStatus) {
        this.adminStatus = adminStatus.toString();
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
        if (getAdminAccountId() != null)
            sb.append("AdminAccountId: ").append(getAdminAccountId()).append(",");
        if (getAdminStatus() != null)
            sb.append("AdminStatus: ").append(getAdminStatus());
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
        if (other.getAdminAccountId() == null ^ this.getAdminAccountId() == null)
            return false;
        if (other.getAdminAccountId() != null && other.getAdminAccountId().equals(this.getAdminAccountId()) == false)
            return false;
        if (other.getAdminStatus() == null ^ this.getAdminStatus() == null)
            return false;
        if (other.getAdminStatus() != null && other.getAdminStatus().equals(this.getAdminStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAdminAccountId() == null) ? 0 : getAdminAccountId().hashCode());
        hashCode = prime * hashCode + ((getAdminStatus() == null) ? 0 : getAdminStatus().hashCode());
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
        com.amazonaws.services.guardduty.model.transform.AdminAccountMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
