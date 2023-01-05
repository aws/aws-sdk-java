/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.networkmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the current status of an account within an Amazon Web Services Organization, including service-linked roles
 * (SLRs).
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/AccountStatus" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AccountStatus implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of an account within the Amazon Web Services Organization.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * The status of SLR deployment for the account.
     * </p>
     */
    private String sLRDeploymentStatus;

    /**
     * <p>
     * The ID of an account within the Amazon Web Services Organization.
     * </p>
     * 
     * @param accountId
     *        The ID of an account within the Amazon Web Services Organization.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The ID of an account within the Amazon Web Services Organization.
     * </p>
     * 
     * @return The ID of an account within the Amazon Web Services Organization.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The ID of an account within the Amazon Web Services Organization.
     * </p>
     * 
     * @param accountId
     *        The ID of an account within the Amazon Web Services Organization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccountStatus withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * The status of SLR deployment for the account.
     * </p>
     * 
     * @param sLRDeploymentStatus
     *        The status of SLR deployment for the account.
     */

    public void setSLRDeploymentStatus(String sLRDeploymentStatus) {
        this.sLRDeploymentStatus = sLRDeploymentStatus;
    }

    /**
     * <p>
     * The status of SLR deployment for the account.
     * </p>
     * 
     * @return The status of SLR deployment for the account.
     */

    public String getSLRDeploymentStatus() {
        return this.sLRDeploymentStatus;
    }

    /**
     * <p>
     * The status of SLR deployment for the account.
     * </p>
     * 
     * @param sLRDeploymentStatus
     *        The status of SLR deployment for the account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccountStatus withSLRDeploymentStatus(String sLRDeploymentStatus) {
        setSLRDeploymentStatus(sLRDeploymentStatus);
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
        if (getSLRDeploymentStatus() != null)
            sb.append("SLRDeploymentStatus: ").append(getSLRDeploymentStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AccountStatus == false)
            return false;
        AccountStatus other = (AccountStatus) obj;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getSLRDeploymentStatus() == null ^ this.getSLRDeploymentStatus() == null)
            return false;
        if (other.getSLRDeploymentStatus() != null && other.getSLRDeploymentStatus().equals(this.getSLRDeploymentStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getSLRDeploymentStatus() == null) ? 0 : getSLRDeploymentStatus().hashCode());
        return hashCode;
    }

    @Override
    public AccountStatus clone() {
        try {
            return (AccountStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.networkmanager.model.transform.AccountStatusMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
