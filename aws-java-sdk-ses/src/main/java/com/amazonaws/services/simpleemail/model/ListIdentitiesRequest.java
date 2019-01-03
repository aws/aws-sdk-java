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
package com.amazonaws.services.simpleemail.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents a request to return a list of all identities (email addresses and domains) that you have attempted to
 * verify under your AWS account, regardless of verification status.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/ListIdentities" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListIdentitiesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The type of the identities to list. Possible values are "EmailAddress" and "Domain". If this parameter is
     * omitted, then all identities will be listed.
     * </p>
     */
    private String identityType;
    /**
     * <p>
     * The token to use for pagination.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of identities per page. Possible values are 1-1000 inclusive.
     * </p>
     */
    private Integer maxItems;

    /**
     * <p>
     * The type of the identities to list. Possible values are "EmailAddress" and "Domain". If this parameter is
     * omitted, then all identities will be listed.
     * </p>
     * 
     * @param identityType
     *        The type of the identities to list. Possible values are "EmailAddress" and "Domain". If this parameter is
     *        omitted, then all identities will be listed.
     * @see IdentityType
     */

    public void setIdentityType(String identityType) {
        this.identityType = identityType;
    }

    /**
     * <p>
     * The type of the identities to list. Possible values are "EmailAddress" and "Domain". If this parameter is
     * omitted, then all identities will be listed.
     * </p>
     * 
     * @return The type of the identities to list. Possible values are "EmailAddress" and "Domain". If this parameter is
     *         omitted, then all identities will be listed.
     * @see IdentityType
     */

    public String getIdentityType() {
        return this.identityType;
    }

    /**
     * <p>
     * The type of the identities to list. Possible values are "EmailAddress" and "Domain". If this parameter is
     * omitted, then all identities will be listed.
     * </p>
     * 
     * @param identityType
     *        The type of the identities to list. Possible values are "EmailAddress" and "Domain". If this parameter is
     *        omitted, then all identities will be listed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IdentityType
     */

    public ListIdentitiesRequest withIdentityType(String identityType) {
        setIdentityType(identityType);
        return this;
    }

    /**
     * <p>
     * The type of the identities to list. Possible values are "EmailAddress" and "Domain". If this parameter is
     * omitted, then all identities will be listed.
     * </p>
     * 
     * @param identityType
     *        The type of the identities to list. Possible values are "EmailAddress" and "Domain". If this parameter is
     *        omitted, then all identities will be listed.
     * @see IdentityType
     */

    public void setIdentityType(IdentityType identityType) {
        withIdentityType(identityType);
    }

    /**
     * <p>
     * The type of the identities to list. Possible values are "EmailAddress" and "Domain". If this parameter is
     * omitted, then all identities will be listed.
     * </p>
     * 
     * @param identityType
     *        The type of the identities to list. Possible values are "EmailAddress" and "Domain". If this parameter is
     *        omitted, then all identities will be listed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IdentityType
     */

    public ListIdentitiesRequest withIdentityType(IdentityType identityType) {
        this.identityType = identityType.toString();
        return this;
    }

    /**
     * <p>
     * The token to use for pagination.
     * </p>
     * 
     * @param nextToken
     *        The token to use for pagination.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use for pagination.
     * </p>
     * 
     * @return The token to use for pagination.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to use for pagination.
     * </p>
     * 
     * @param nextToken
     *        The token to use for pagination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIdentitiesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of identities per page. Possible values are 1-1000 inclusive.
     * </p>
     * 
     * @param maxItems
     *        The maximum number of identities per page. Possible values are 1-1000 inclusive.
     */

    public void setMaxItems(Integer maxItems) {
        this.maxItems = maxItems;
    }

    /**
     * <p>
     * The maximum number of identities per page. Possible values are 1-1000 inclusive.
     * </p>
     * 
     * @return The maximum number of identities per page. Possible values are 1-1000 inclusive.
     */

    public Integer getMaxItems() {
        return this.maxItems;
    }

    /**
     * <p>
     * The maximum number of identities per page. Possible values are 1-1000 inclusive.
     * </p>
     * 
     * @param maxItems
     *        The maximum number of identities per page. Possible values are 1-1000 inclusive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIdentitiesRequest withMaxItems(Integer maxItems) {
        setMaxItems(maxItems);
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
        if (getIdentityType() != null)
            sb.append("IdentityType: ").append(getIdentityType()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxItems() != null)
            sb.append("MaxItems: ").append(getMaxItems());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListIdentitiesRequest == false)
            return false;
        ListIdentitiesRequest other = (ListIdentitiesRequest) obj;
        if (other.getIdentityType() == null ^ this.getIdentityType() == null)
            return false;
        if (other.getIdentityType() != null && other.getIdentityType().equals(this.getIdentityType()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxItems() == null ^ this.getMaxItems() == null)
            return false;
        if (other.getMaxItems() != null && other.getMaxItems().equals(this.getMaxItems()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIdentityType() == null) ? 0 : getIdentityType().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxItems() == null) ? 0 : getMaxItems().hashCode());
        return hashCode;
    }

    @Override
    public ListIdentitiesRequest clone() {
        return (ListIdentitiesRequest) super.clone();
    }

}
