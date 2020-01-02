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
package com.amazonaws.services.sso.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information about your AWS account.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-2019-06-10/AccountInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AccountInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier of the AWS account that is assigned to the user.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * The display name of the AWS account that is assigned to the user.
     * </p>
     */
    private String accountName;
    /**
     * <p>
     * The email address of the AWS account that is assigned to the user.
     * </p>
     */
    private String emailAddress;

    /**
     * <p>
     * The identifier of the AWS account that is assigned to the user.
     * </p>
     * 
     * @param accountId
     *        The identifier of the AWS account that is assigned to the user.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The identifier of the AWS account that is assigned to the user.
     * </p>
     * 
     * @return The identifier of the AWS account that is assigned to the user.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The identifier of the AWS account that is assigned to the user.
     * </p>
     * 
     * @param accountId
     *        The identifier of the AWS account that is assigned to the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccountInfo withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * The display name of the AWS account that is assigned to the user.
     * </p>
     * 
     * @param accountName
     *        The display name of the AWS account that is assigned to the user.
     */

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    /**
     * <p>
     * The display name of the AWS account that is assigned to the user.
     * </p>
     * 
     * @return The display name of the AWS account that is assigned to the user.
     */

    public String getAccountName() {
        return this.accountName;
    }

    /**
     * <p>
     * The display name of the AWS account that is assigned to the user.
     * </p>
     * 
     * @param accountName
     *        The display name of the AWS account that is assigned to the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccountInfo withAccountName(String accountName) {
        setAccountName(accountName);
        return this;
    }

    /**
     * <p>
     * The email address of the AWS account that is assigned to the user.
     * </p>
     * 
     * @param emailAddress
     *        The email address of the AWS account that is assigned to the user.
     */

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    /**
     * <p>
     * The email address of the AWS account that is assigned to the user.
     * </p>
     * 
     * @return The email address of the AWS account that is assigned to the user.
     */

    public String getEmailAddress() {
        return this.emailAddress;
    }

    /**
     * <p>
     * The email address of the AWS account that is assigned to the user.
     * </p>
     * 
     * @param emailAddress
     *        The email address of the AWS account that is assigned to the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccountInfo withEmailAddress(String emailAddress) {
        setEmailAddress(emailAddress);
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
        if (getAccountName() != null)
            sb.append("AccountName: ").append(getAccountName()).append(",");
        if (getEmailAddress() != null)
            sb.append("EmailAddress: ").append(getEmailAddress());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AccountInfo == false)
            return false;
        AccountInfo other = (AccountInfo) obj;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getAccountName() == null ^ this.getAccountName() == null)
            return false;
        if (other.getAccountName() != null && other.getAccountName().equals(this.getAccountName()) == false)
            return false;
        if (other.getEmailAddress() == null ^ this.getEmailAddress() == null)
            return false;
        if (other.getEmailAddress() != null && other.getEmailAddress().equals(this.getEmailAddress()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getAccountName() == null) ? 0 : getAccountName().hashCode());
        hashCode = prime * hashCode + ((getEmailAddress() == null) ? 0 : getEmailAddress().hashCode());
        return hashCode;
    }

    @Override
    public AccountInfo clone() {
        try {
            return (AccountInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sso.model.transform.AccountInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
