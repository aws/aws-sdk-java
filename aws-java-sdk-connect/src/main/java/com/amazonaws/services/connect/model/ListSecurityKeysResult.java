/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListSecurityKeys" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListSecurityKeysResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The security keys.
     * </p>
     */
    private java.util.List<SecurityKey> securityKeys;
    /**
     * <p>
     * If there are additional results, this is the token for the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The security keys.
     * </p>
     * 
     * @return The security keys.
     */

    public java.util.List<SecurityKey> getSecurityKeys() {
        return securityKeys;
    }

    /**
     * <p>
     * The security keys.
     * </p>
     * 
     * @param securityKeys
     *        The security keys.
     */

    public void setSecurityKeys(java.util.Collection<SecurityKey> securityKeys) {
        if (securityKeys == null) {
            this.securityKeys = null;
            return;
        }

        this.securityKeys = new java.util.ArrayList<SecurityKey>(securityKeys);
    }

    /**
     * <p>
     * The security keys.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityKeys(java.util.Collection)} or {@link #withSecurityKeys(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param securityKeys
     *        The security keys.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSecurityKeysResult withSecurityKeys(SecurityKey... securityKeys) {
        if (this.securityKeys == null) {
            setSecurityKeys(new java.util.ArrayList<SecurityKey>(securityKeys.length));
        }
        for (SecurityKey ele : securityKeys) {
            this.securityKeys.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The security keys.
     * </p>
     * 
     * @param securityKeys
     *        The security keys.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSecurityKeysResult withSecurityKeys(java.util.Collection<SecurityKey> securityKeys) {
        setSecurityKeys(securityKeys);
        return this;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of results.
     * </p>
     * 
     * @param nextToken
     *        If there are additional results, this is the token for the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of results.
     * </p>
     * 
     * @return If there are additional results, this is the token for the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of results.
     * </p>
     * 
     * @param nextToken
     *        If there are additional results, this is the token for the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSecurityKeysResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getSecurityKeys() != null)
            sb.append("SecurityKeys: ").append(getSecurityKeys()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListSecurityKeysResult == false)
            return false;
        ListSecurityKeysResult other = (ListSecurityKeysResult) obj;
        if (other.getSecurityKeys() == null ^ this.getSecurityKeys() == null)
            return false;
        if (other.getSecurityKeys() != null && other.getSecurityKeys().equals(this.getSecurityKeys()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSecurityKeys() == null) ? 0 : getSecurityKeys().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListSecurityKeysResult clone() {
        try {
            return (ListSecurityKeysResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
