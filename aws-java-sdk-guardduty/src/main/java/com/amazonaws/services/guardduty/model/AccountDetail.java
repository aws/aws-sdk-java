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
package com.amazonaws.services.guardduty.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * An object containing the member's accountId and email address.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/AccountDetail" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AccountDetail implements Serializable, Cloneable, StructuredPojo {

    /** Member account ID. */
    private String accountId;
    /** Member account's email address. */
    private String email;

    /**
     * Member account ID.
     * 
     * @param accountId
     *        Member account ID.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * Member account ID.
     * 
     * @return Member account ID.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * Member account ID.
     * 
     * @param accountId
     *        Member account ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccountDetail withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * Member account's email address.
     * 
     * @param email
     *        Member account's email address.
     */

    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Member account's email address.
     * 
     * @return Member account's email address.
     */

    public String getEmail() {
        return this.email;
    }

    /**
     * Member account's email address.
     * 
     * @param email
     *        Member account's email address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccountDetail withEmail(String email) {
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

        if (obj instanceof AccountDetail == false)
            return false;
        AccountDetail other = (AccountDetail) obj;
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
    public AccountDetail clone() {
        try {
            return (AccountDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.guardduty.model.transform.AccountDetailMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
