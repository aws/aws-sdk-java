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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/GetAccountLink" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetAccountLinkResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The account link of the account link to retrieve.
     * </p>
     */
    private AccountLink accountLink;

    /**
     * <p>
     * The account link of the account link to retrieve.
     * </p>
     * 
     * @param accountLink
     *        The account link of the account link to retrieve.
     */

    public void setAccountLink(AccountLink accountLink) {
        this.accountLink = accountLink;
    }

    /**
     * <p>
     * The account link of the account link to retrieve.
     * </p>
     * 
     * @return The account link of the account link to retrieve.
     */

    public AccountLink getAccountLink() {
        return this.accountLink;
    }

    /**
     * <p>
     * The account link of the account link to retrieve.
     * </p>
     * 
     * @param accountLink
     *        The account link of the account link to retrieve.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAccountLinkResult withAccountLink(AccountLink accountLink) {
        setAccountLink(accountLink);
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
        if (getAccountLink() != null)
            sb.append("AccountLink: ").append(getAccountLink());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetAccountLinkResult == false)
            return false;
        GetAccountLinkResult other = (GetAccountLinkResult) obj;
        if (other.getAccountLink() == null ^ this.getAccountLink() == null)
            return false;
        if (other.getAccountLink() != null && other.getAccountLink().equals(this.getAccountLink()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountLink() == null) ? 0 : getAccountLink().hashCode());
        return hashCode;
    }

    @Override
    public GetAccountLinkResult clone() {
        try {
            return (GetAccountLinkResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
