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
package com.amazonaws.services.appsync.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/ListApiKeys" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListApiKeysResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The <code>ApiKey</code> objects.
     * </p>
     */
    private java.util.List<ApiKey> apiKeys;
    /**
     * <p>
     * An identifier to be passed in the next request to this operation to return the next set of items in the list.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The <code>ApiKey</code> objects.
     * </p>
     * 
     * @return The <code>ApiKey</code> objects.
     */

    public java.util.List<ApiKey> getApiKeys() {
        return apiKeys;
    }

    /**
     * <p>
     * The <code>ApiKey</code> objects.
     * </p>
     * 
     * @param apiKeys
     *        The <code>ApiKey</code> objects.
     */

    public void setApiKeys(java.util.Collection<ApiKey> apiKeys) {
        if (apiKeys == null) {
            this.apiKeys = null;
            return;
        }

        this.apiKeys = new java.util.ArrayList<ApiKey>(apiKeys);
    }

    /**
     * <p>
     * The <code>ApiKey</code> objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setApiKeys(java.util.Collection)} or {@link #withApiKeys(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param apiKeys
     *        The <code>ApiKey</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListApiKeysResult withApiKeys(ApiKey... apiKeys) {
        if (this.apiKeys == null) {
            setApiKeys(new java.util.ArrayList<ApiKey>(apiKeys.length));
        }
        for (ApiKey ele : apiKeys) {
            this.apiKeys.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The <code>ApiKey</code> objects.
     * </p>
     * 
     * @param apiKeys
     *        The <code>ApiKey</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListApiKeysResult withApiKeys(java.util.Collection<ApiKey> apiKeys) {
        setApiKeys(apiKeys);
        return this;
    }

    /**
     * <p>
     * An identifier to be passed in the next request to this operation to return the next set of items in the list.
     * </p>
     * 
     * @param nextToken
     *        An identifier to be passed in the next request to this operation to return the next set of items in the
     *        list.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * An identifier to be passed in the next request to this operation to return the next set of items in the list.
     * </p>
     * 
     * @return An identifier to be passed in the next request to this operation to return the next set of items in the
     *         list.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * An identifier to be passed in the next request to this operation to return the next set of items in the list.
     * </p>
     * 
     * @param nextToken
     *        An identifier to be passed in the next request to this operation to return the next set of items in the
     *        list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListApiKeysResult withNextToken(String nextToken) {
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
        if (getApiKeys() != null)
            sb.append("ApiKeys: ").append(getApiKeys()).append(",");
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

        if (obj instanceof ListApiKeysResult == false)
            return false;
        ListApiKeysResult other = (ListApiKeysResult) obj;
        if (other.getApiKeys() == null ^ this.getApiKeys() == null)
            return false;
        if (other.getApiKeys() != null && other.getApiKeys().equals(this.getApiKeys()) == false)
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

        hashCode = prime * hashCode + ((getApiKeys() == null) ? 0 : getApiKeys().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListApiKeysResult clone() {
        try {
            return (ListApiKeysResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
