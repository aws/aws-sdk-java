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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The details of an AWS account.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AccountDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AccountDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of an AWS account.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * The email of an AWS account.
     * </p>
     */
    private String email;

    /**
     * <p>
     * The ID of an AWS account.
     * </p>
     * 
     * @param accountId
     *        The ID of an AWS account.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The ID of an AWS account.
     * </p>
     * 
     * @return The ID of an AWS account.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The ID of an AWS account.
     * </p>
     * 
     * @param accountId
     *        The ID of an AWS account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccountDetails withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * The email of an AWS account.
     * </p>
     * 
     * @param email
     *        The email of an AWS account.
     */

    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * <p>
     * The email of an AWS account.
     * </p>
     * 
     * @return The email of an AWS account.
     */

    public String getEmail() {
        return this.email;
    }

    /**
     * <p>
     * The email of an AWS account.
     * </p>
     * 
     * @param email
     *        The email of an AWS account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccountDetails withEmail(String email) {
        setEmail(email);
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
        if (getEmail() != null)
            sb.append("Email: ").append(getEmail());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AccountDetails == false)
            return false;
        AccountDetails other = (AccountDetails) obj;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getEmail() == null ^ this.getEmail() == null)
            return false;
        if (other.getEmail() != null && other.getEmail().equals(this.getEmail()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getEmail() == null) ? 0 : getEmail().hashCode());
        return hashCode;
    }

    @Override
    public AccountDetails clone() {
        try {
            return (AccountDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AccountDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
