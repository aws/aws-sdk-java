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
package com.amazonaws.services.transfer.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/ListHostKeys" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListHostKeysResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Returns a token that you can use to call <code>ListHostKeys</code> again and receive additional results, if there
     * are any.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Returns the server identifier that contains the listed host keys.
     * </p>
     */
    private String serverId;
    /**
     * <p>
     * Returns an array, where each item contains the details of a host key.
     * </p>
     */
    private java.util.List<ListedHostKey> hostKeys;

    /**
     * <p>
     * Returns a token that you can use to call <code>ListHostKeys</code> again and receive additional results, if there
     * are any.
     * </p>
     * 
     * @param nextToken
     *        Returns a token that you can use to call <code>ListHostKeys</code> again and receive additional results,
     *        if there are any.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Returns a token that you can use to call <code>ListHostKeys</code> again and receive additional results, if there
     * are any.
     * </p>
     * 
     * @return Returns a token that you can use to call <code>ListHostKeys</code> again and receive additional results,
     *         if there are any.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Returns a token that you can use to call <code>ListHostKeys</code> again and receive additional results, if there
     * are any.
     * </p>
     * 
     * @param nextToken
     *        Returns a token that you can use to call <code>ListHostKeys</code> again and receive additional results,
     *        if there are any.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListHostKeysResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Returns the server identifier that contains the listed host keys.
     * </p>
     * 
     * @param serverId
     *        Returns the server identifier that contains the listed host keys.
     */

    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    /**
     * <p>
     * Returns the server identifier that contains the listed host keys.
     * </p>
     * 
     * @return Returns the server identifier that contains the listed host keys.
     */

    public String getServerId() {
        return this.serverId;
    }

    /**
     * <p>
     * Returns the server identifier that contains the listed host keys.
     * </p>
     * 
     * @param serverId
     *        Returns the server identifier that contains the listed host keys.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListHostKeysResult withServerId(String serverId) {
        setServerId(serverId);
        return this;
    }

    /**
     * <p>
     * Returns an array, where each item contains the details of a host key.
     * </p>
     * 
     * @return Returns an array, where each item contains the details of a host key.
     */

    public java.util.List<ListedHostKey> getHostKeys() {
        return hostKeys;
    }

    /**
     * <p>
     * Returns an array, where each item contains the details of a host key.
     * </p>
     * 
     * @param hostKeys
     *        Returns an array, where each item contains the details of a host key.
     */

    public void setHostKeys(java.util.Collection<ListedHostKey> hostKeys) {
        if (hostKeys == null) {
            this.hostKeys = null;
            return;
        }

        this.hostKeys = new java.util.ArrayList<ListedHostKey>(hostKeys);
    }

    /**
     * <p>
     * Returns an array, where each item contains the details of a host key.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setHostKeys(java.util.Collection)} or {@link #withHostKeys(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param hostKeys
     *        Returns an array, where each item contains the details of a host key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListHostKeysResult withHostKeys(ListedHostKey... hostKeys) {
        if (this.hostKeys == null) {
            setHostKeys(new java.util.ArrayList<ListedHostKey>(hostKeys.length));
        }
        for (ListedHostKey ele : hostKeys) {
            this.hostKeys.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Returns an array, where each item contains the details of a host key.
     * </p>
     * 
     * @param hostKeys
     *        Returns an array, where each item contains the details of a host key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListHostKeysResult withHostKeys(java.util.Collection<ListedHostKey> hostKeys) {
        setHostKeys(hostKeys);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getServerId() != null)
            sb.append("ServerId: ").append(getServerId()).append(",");
        if (getHostKeys() != null)
            sb.append("HostKeys: ").append(getHostKeys());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListHostKeysResult == false)
            return false;
        ListHostKeysResult other = (ListHostKeysResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getServerId() == null ^ this.getServerId() == null)
            return false;
        if (other.getServerId() != null && other.getServerId().equals(this.getServerId()) == false)
            return false;
        if (other.getHostKeys() == null ^ this.getHostKeys() == null)
            return false;
        if (other.getHostKeys() != null && other.getHostKeys().equals(this.getHostKeys()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getServerId() == null) ? 0 : getServerId().hashCode());
        hashCode = prime * hashCode + ((getHostKeys() == null) ? 0 : getHostKeys().hashCode());
        return hashCode;
    }

    @Override
    public ListHostKeysResult clone() {
        try {
            return (ListHostKeysResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
