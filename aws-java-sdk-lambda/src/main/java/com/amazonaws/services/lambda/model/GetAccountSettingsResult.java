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
package com.amazonaws.services.lambda.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/GetAccountSettings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetAccountSettingsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Limits that are related to concurrency and code storage.
     * </p>
     */
    private AccountLimit accountLimit;
    /**
     * <p>
     * The number of functions and amount of storage in use.
     * </p>
     */
    private AccountUsage accountUsage;

    /**
     * <p>
     * Limits that are related to concurrency and code storage.
     * </p>
     * 
     * @param accountLimit
     *        Limits that are related to concurrency and code storage.
     */

    public void setAccountLimit(AccountLimit accountLimit) {
        this.accountLimit = accountLimit;
    }

    /**
     * <p>
     * Limits that are related to concurrency and code storage.
     * </p>
     * 
     * @return Limits that are related to concurrency and code storage.
     */

    public AccountLimit getAccountLimit() {
        return this.accountLimit;
    }

    /**
     * <p>
     * Limits that are related to concurrency and code storage.
     * </p>
     * 
     * @param accountLimit
     *        Limits that are related to concurrency and code storage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAccountSettingsResult withAccountLimit(AccountLimit accountLimit) {
        setAccountLimit(accountLimit);
        return this;
    }

    /**
     * <p>
     * The number of functions and amount of storage in use.
     * </p>
     * 
     * @param accountUsage
     *        The number of functions and amount of storage in use.
     */

    public void setAccountUsage(AccountUsage accountUsage) {
        this.accountUsage = accountUsage;
    }

    /**
     * <p>
     * The number of functions and amount of storage in use.
     * </p>
     * 
     * @return The number of functions and amount of storage in use.
     */

    public AccountUsage getAccountUsage() {
        return this.accountUsage;
    }

    /**
     * <p>
     * The number of functions and amount of storage in use.
     * </p>
     * 
     * @param accountUsage
     *        The number of functions and amount of storage in use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAccountSettingsResult withAccountUsage(AccountUsage accountUsage) {
        setAccountUsage(accountUsage);
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
        if (getAccountLimit() != null)
            sb.append("AccountLimit: ").append(getAccountLimit()).append(",");
        if (getAccountUsage() != null)
            sb.append("AccountUsage: ").append(getAccountUsage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetAccountSettingsResult == false)
            return false;
        GetAccountSettingsResult other = (GetAccountSettingsResult) obj;
        if (other.getAccountLimit() == null ^ this.getAccountLimit() == null)
            return false;
        if (other.getAccountLimit() != null && other.getAccountLimit().equals(this.getAccountLimit()) == false)
            return false;
        if (other.getAccountUsage() == null ^ this.getAccountUsage() == null)
            return false;
        if (other.getAccountUsage() != null && other.getAccountUsage().equals(this.getAccountUsage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountLimit() == null) ? 0 : getAccountLimit().hashCode());
        hashCode = prime * hashCode + ((getAccountUsage() == null) ? 0 : getAccountUsage().hashCode());
        return hashCode;
    }

    @Override
    public GetAccountSettingsResult clone() {
        try {
            return (GetAccountSettingsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
