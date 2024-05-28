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
package com.amazonaws.services.workspaces.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about about the account link.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/AccountLink" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AccountLink implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier of the account link.
     * </p>
     */
    private String accountLinkId;
    /**
     * <p>
     * The status of the account link.
     * </p>
     */
    private String accountLinkStatus;
    /**
     * <p>
     * The identifier of the source account.
     * </p>
     */
    private String sourceAccountId;
    /**
     * <p>
     * The identifier of the target account.
     * </p>
     */
    private String targetAccountId;

    /**
     * <p>
     * The identifier of the account link.
     * </p>
     * 
     * @param accountLinkId
     *        The identifier of the account link.
     */

    public void setAccountLinkId(String accountLinkId) {
        this.accountLinkId = accountLinkId;
    }

    /**
     * <p>
     * The identifier of the account link.
     * </p>
     * 
     * @return The identifier of the account link.
     */

    public String getAccountLinkId() {
        return this.accountLinkId;
    }

    /**
     * <p>
     * The identifier of the account link.
     * </p>
     * 
     * @param accountLinkId
     *        The identifier of the account link.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccountLink withAccountLinkId(String accountLinkId) {
        setAccountLinkId(accountLinkId);
        return this;
    }

    /**
     * <p>
     * The status of the account link.
     * </p>
     * 
     * @param accountLinkStatus
     *        The status of the account link.
     * @see AccountLinkStatusEnum
     */

    public void setAccountLinkStatus(String accountLinkStatus) {
        this.accountLinkStatus = accountLinkStatus;
    }

    /**
     * <p>
     * The status of the account link.
     * </p>
     * 
     * @return The status of the account link.
     * @see AccountLinkStatusEnum
     */

    public String getAccountLinkStatus() {
        return this.accountLinkStatus;
    }

    /**
     * <p>
     * The status of the account link.
     * </p>
     * 
     * @param accountLinkStatus
     *        The status of the account link.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AccountLinkStatusEnum
     */

    public AccountLink withAccountLinkStatus(String accountLinkStatus) {
        setAccountLinkStatus(accountLinkStatus);
        return this;
    }

    /**
     * <p>
     * The status of the account link.
     * </p>
     * 
     * @param accountLinkStatus
     *        The status of the account link.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AccountLinkStatusEnum
     */

    public AccountLink withAccountLinkStatus(AccountLinkStatusEnum accountLinkStatus) {
        this.accountLinkStatus = accountLinkStatus.toString();
        return this;
    }

    /**
     * <p>
     * The identifier of the source account.
     * </p>
     * 
     * @param sourceAccountId
     *        The identifier of the source account.
     */

    public void setSourceAccountId(String sourceAccountId) {
        this.sourceAccountId = sourceAccountId;
    }

    /**
     * <p>
     * The identifier of the source account.
     * </p>
     * 
     * @return The identifier of the source account.
     */

    public String getSourceAccountId() {
        return this.sourceAccountId;
    }

    /**
     * <p>
     * The identifier of the source account.
     * </p>
     * 
     * @param sourceAccountId
     *        The identifier of the source account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccountLink withSourceAccountId(String sourceAccountId) {
        setSourceAccountId(sourceAccountId);
        return this;
    }

    /**
     * <p>
     * The identifier of the target account.
     * </p>
     * 
     * @param targetAccountId
     *        The identifier of the target account.
     */

    public void setTargetAccountId(String targetAccountId) {
        this.targetAccountId = targetAccountId;
    }

    /**
     * <p>
     * The identifier of the target account.
     * </p>
     * 
     * @return The identifier of the target account.
     */

    public String getTargetAccountId() {
        return this.targetAccountId;
    }

    /**
     * <p>
     * The identifier of the target account.
     * </p>
     * 
     * @param targetAccountId
     *        The identifier of the target account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccountLink withTargetAccountId(String targetAccountId) {
        setTargetAccountId(targetAccountId);
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
        if (getAccountLinkId() != null)
            sb.append("AccountLinkId: ").append(getAccountLinkId()).append(",");
        if (getAccountLinkStatus() != null)
            sb.append("AccountLinkStatus: ").append(getAccountLinkStatus()).append(",");
        if (getSourceAccountId() != null)
            sb.append("SourceAccountId: ").append(getSourceAccountId()).append(",");
        if (getTargetAccountId() != null)
            sb.append("TargetAccountId: ").append(getTargetAccountId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AccountLink == false)
            return false;
        AccountLink other = (AccountLink) obj;
        if (other.getAccountLinkId() == null ^ this.getAccountLinkId() == null)
            return false;
        if (other.getAccountLinkId() != null && other.getAccountLinkId().equals(this.getAccountLinkId()) == false)
            return false;
        if (other.getAccountLinkStatus() == null ^ this.getAccountLinkStatus() == null)
            return false;
        if (other.getAccountLinkStatus() != null && other.getAccountLinkStatus().equals(this.getAccountLinkStatus()) == false)
            return false;
        if (other.getSourceAccountId() == null ^ this.getSourceAccountId() == null)
            return false;
        if (other.getSourceAccountId() != null && other.getSourceAccountId().equals(this.getSourceAccountId()) == false)
            return false;
        if (other.getTargetAccountId() == null ^ this.getTargetAccountId() == null)
            return false;
        if (other.getTargetAccountId() != null && other.getTargetAccountId().equals(this.getTargetAccountId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountLinkId() == null) ? 0 : getAccountLinkId().hashCode());
        hashCode = prime * hashCode + ((getAccountLinkStatus() == null) ? 0 : getAccountLinkStatus().hashCode());
        hashCode = prime * hashCode + ((getSourceAccountId() == null) ? 0 : getSourceAccountId().hashCode());
        hashCode = prime * hashCode + ((getTargetAccountId() == null) ? 0 : getTargetAccountId().hashCode());
        return hashCode;
    }

    @Override
    public AccountLink clone() {
        try {
            return (AccountLink) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.workspaces.model.transform.AccountLinkMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
