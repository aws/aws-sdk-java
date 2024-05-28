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
package com.amazonaws.services.paymentcryptography.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/payment-cryptography-2021-09-14/ListKeys" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListKeysResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The list of keys created within the caller's Amazon Web Services account and Amazon Web Services Region.
     * </p>
     */
    private java.util.List<KeySummary> keys;
    /**
     * <p>
     * The token for the next set of results, or an empty or null value if there are no more results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The list of keys created within the caller's Amazon Web Services account and Amazon Web Services Region.
     * </p>
     * 
     * @return The list of keys created within the caller's Amazon Web Services account and Amazon Web Services Region.
     */

    public java.util.List<KeySummary> getKeys() {
        return keys;
    }

    /**
     * <p>
     * The list of keys created within the caller's Amazon Web Services account and Amazon Web Services Region.
     * </p>
     * 
     * @param keys
     *        The list of keys created within the caller's Amazon Web Services account and Amazon Web Services Region.
     */

    public void setKeys(java.util.Collection<KeySummary> keys) {
        if (keys == null) {
            this.keys = null;
            return;
        }

        this.keys = new java.util.ArrayList<KeySummary>(keys);
    }

    /**
     * <p>
     * The list of keys created within the caller's Amazon Web Services account and Amazon Web Services Region.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setKeys(java.util.Collection)} or {@link #withKeys(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param keys
     *        The list of keys created within the caller's Amazon Web Services account and Amazon Web Services Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListKeysResult withKeys(KeySummary... keys) {
        if (this.keys == null) {
            setKeys(new java.util.ArrayList<KeySummary>(keys.length));
        }
        for (KeySummary ele : keys) {
            this.keys.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of keys created within the caller's Amazon Web Services account and Amazon Web Services Region.
     * </p>
     * 
     * @param keys
     *        The list of keys created within the caller's Amazon Web Services account and Amazon Web Services Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListKeysResult withKeys(java.util.Collection<KeySummary> keys) {
        setKeys(keys);
        return this;
    }

    /**
     * <p>
     * The token for the next set of results, or an empty or null value if there are no more results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results, or an empty or null value if there are no more results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of results, or an empty or null value if there are no more results.
     * </p>
     * 
     * @return The token for the next set of results, or an empty or null value if there are no more results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of results, or an empty or null value if there are no more results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results, or an empty or null value if there are no more results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListKeysResult withNextToken(String nextToken) {
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
        if (getKeys() != null)
            sb.append("Keys: ").append(getKeys()).append(",");
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

        if (obj instanceof ListKeysResult == false)
            return false;
        ListKeysResult other = (ListKeysResult) obj;
        if (other.getKeys() == null ^ this.getKeys() == null)
            return false;
        if (other.getKeys() != null && other.getKeys().equals(this.getKeys()) == false)
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

        hashCode = prime * hashCode + ((getKeys() == null) ? 0 : getKeys().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListKeysResult clone() {
        try {
            return (ListKeysResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
