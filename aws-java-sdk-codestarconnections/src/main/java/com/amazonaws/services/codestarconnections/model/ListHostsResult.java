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
package com.amazonaws.services.codestarconnections.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-connections-2019-12-01/ListHosts" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListHostsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of hosts and the details for each host, such as status, endpoint, and provider type.
     * </p>
     */
    private java.util.List<Host> hosts;
    /**
     * <p>
     * A token that can be used in the next <code>ListHosts</code> call. To view all items in the list, continue to call
     * this operation with each subsequent token until no more <code>nextToken</code> values are returned.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of hosts and the details for each host, such as status, endpoint, and provider type.
     * </p>
     * 
     * @return A list of hosts and the details for each host, such as status, endpoint, and provider type.
     */

    public java.util.List<Host> getHosts() {
        return hosts;
    }

    /**
     * <p>
     * A list of hosts and the details for each host, such as status, endpoint, and provider type.
     * </p>
     * 
     * @param hosts
     *        A list of hosts and the details for each host, such as status, endpoint, and provider type.
     */

    public void setHosts(java.util.Collection<Host> hosts) {
        if (hosts == null) {
            this.hosts = null;
            return;
        }

        this.hosts = new java.util.ArrayList<Host>(hosts);
    }

    /**
     * <p>
     * A list of hosts and the details for each host, such as status, endpoint, and provider type.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setHosts(java.util.Collection)} or {@link #withHosts(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param hosts
     *        A list of hosts and the details for each host, such as status, endpoint, and provider type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListHostsResult withHosts(Host... hosts) {
        if (this.hosts == null) {
            setHosts(new java.util.ArrayList<Host>(hosts.length));
        }
        for (Host ele : hosts) {
            this.hosts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of hosts and the details for each host, such as status, endpoint, and provider type.
     * </p>
     * 
     * @param hosts
     *        A list of hosts and the details for each host, such as status, endpoint, and provider type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListHostsResult withHosts(java.util.Collection<Host> hosts) {
        setHosts(hosts);
        return this;
    }

    /**
     * <p>
     * A token that can be used in the next <code>ListHosts</code> call. To view all items in the list, continue to call
     * this operation with each subsequent token until no more <code>nextToken</code> values are returned.
     * </p>
     * 
     * @param nextToken
     *        A token that can be used in the next <code>ListHosts</code> call. To view all items in the list, continue
     *        to call this operation with each subsequent token until no more <code>nextToken</code> values are
     *        returned.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token that can be used in the next <code>ListHosts</code> call. To view all items in the list, continue to call
     * this operation with each subsequent token until no more <code>nextToken</code> values are returned.
     * </p>
     * 
     * @return A token that can be used in the next <code>ListHosts</code> call. To view all items in the list, continue
     *         to call this operation with each subsequent token until no more <code>nextToken</code> values are
     *         returned.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token that can be used in the next <code>ListHosts</code> call. To view all items in the list, continue to call
     * this operation with each subsequent token until no more <code>nextToken</code> values are returned.
     * </p>
     * 
     * @param nextToken
     *        A token that can be used in the next <code>ListHosts</code> call. To view all items in the list, continue
     *        to call this operation with each subsequent token until no more <code>nextToken</code> values are
     *        returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListHostsResult withNextToken(String nextToken) {
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
        if (getHosts() != null)
            sb.append("Hosts: ").append(getHosts()).append(",");
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

        if (obj instanceof ListHostsResult == false)
            return false;
        ListHostsResult other = (ListHostsResult) obj;
        if (other.getHosts() == null ^ this.getHosts() == null)
            return false;
        if (other.getHosts() != null && other.getHosts().equals(this.getHosts()) == false)
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

        hashCode = prime * hashCode + ((getHosts() == null) ? 0 : getHosts().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListHostsResult clone() {
        try {
            return (ListHostsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
