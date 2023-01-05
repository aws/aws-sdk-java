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
package com.amazonaws.services.securitylake.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/DeleteDatalakeDelegatedAdmin"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteDatalakeDelegatedAdminRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The account ID the Security Lake delegated administrator.
     * </p>
     */
    private String account;

    /**
     * <p>
     * The account ID the Security Lake delegated administrator.
     * </p>
     * 
     * @param account
     *        The account ID the Security Lake delegated administrator.
     */

    public void setAccount(String account) {
        this.account = account;
    }

    /**
     * <p>
     * The account ID the Security Lake delegated administrator.
     * </p>
     * 
     * @return The account ID the Security Lake delegated administrator.
     */

    public String getAccount() {
        return this.account;
    }

    /**
     * <p>
     * The account ID the Security Lake delegated administrator.
     * </p>
     * 
     * @param account
     *        The account ID the Security Lake delegated administrator.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteDatalakeDelegatedAdminRequest withAccount(String account) {
        setAccount(account);
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
        if (getAccount() != null)
            sb.append("Account: ").append(getAccount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteDatalakeDelegatedAdminRequest == false)
            return false;
        DeleteDatalakeDelegatedAdminRequest other = (DeleteDatalakeDelegatedAdminRequest) obj;
        if (other.getAccount() == null ^ this.getAccount() == null)
            return false;
        if (other.getAccount() != null && other.getAccount().equals(this.getAccount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccount() == null) ? 0 : getAccount().hashCode());
        return hashCode;
    }

    @Override
    public DeleteDatalakeDelegatedAdminRequest clone() {
        return (DeleteDatalakeDelegatedAdminRequest) super.clone();
    }

}
