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
package com.amazonaws.services.organizations.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/CloseAccount" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CloseAccountRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Retrieves the Amazon Web Services account Id for the current <code>CloseAccount</code> API request.
     * </p>
     */
    private String accountId;

    /**
     * <p>
     * Retrieves the Amazon Web Services account Id for the current <code>CloseAccount</code> API request.
     * </p>
     * 
     * @param accountId
     *        Retrieves the Amazon Web Services account Id for the current <code>CloseAccount</code> API request.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * Retrieves the Amazon Web Services account Id for the current <code>CloseAccount</code> API request.
     * </p>
     * 
     * @return Retrieves the Amazon Web Services account Id for the current <code>CloseAccount</code> API request.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * Retrieves the Amazon Web Services account Id for the current <code>CloseAccount</code> API request.
     * </p>
     * 
     * @param accountId
     *        Retrieves the Amazon Web Services account Id for the current <code>CloseAccount</code> API request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloseAccountRequest withAccountId(String accountId) {
        setAccountId(accountId);
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
            sb.append("AccountId: ").append(getAccountId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CloseAccountRequest == false)
            return false;
        CloseAccountRequest other = (CloseAccountRequest) obj;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        return hashCode;
    }

    @Override
    public CloseAccountRequest clone() {
        return (CloseAccountRequest) super.clone();
    }

}
