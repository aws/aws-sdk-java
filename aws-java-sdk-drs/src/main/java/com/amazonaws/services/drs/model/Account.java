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
package com.amazonaws.services.drs.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * AWS account.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/Account" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Account implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Account ID of AWS account.
     * </p>
     */
    private String accountID;

    /**
     * <p>
     * Account ID of AWS account.
     * </p>
     * 
     * @param accountID
     *        Account ID of AWS account.
     */

    public void setAccountID(String accountID) {
        this.accountID = accountID;
    }

    /**
     * <p>
     * Account ID of AWS account.
     * </p>
     * 
     * @return Account ID of AWS account.
     */

    public String getAccountID() {
        return this.accountID;
    }

    /**
     * <p>
     * Account ID of AWS account.
     * </p>
     * 
     * @param accountID
     *        Account ID of AWS account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Account withAccountID(String accountID) {
        setAccountID(accountID);
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
        if (getAccountID() != null)
            sb.append("AccountID: ").append(getAccountID());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Account == false)
            return false;
        Account other = (Account) obj;
        if (other.getAccountID() == null ^ this.getAccountID() == null)
            return false;
        if (other.getAccountID() != null && other.getAccountID().equals(this.getAccountID()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountID() == null) ? 0 : getAccountID().hashCode());
        return hashCode;
    }

    @Override
    public Account clone() {
        try {
            return (Account) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.drs.model.transform.AccountMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
