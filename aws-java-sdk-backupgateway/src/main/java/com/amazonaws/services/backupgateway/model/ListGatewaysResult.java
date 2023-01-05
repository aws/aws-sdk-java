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
package com.amazonaws.services.backupgateway.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-gateway-2021-01-01/ListGateways" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListGatewaysResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of your gateways.
     * </p>
     */
    private java.util.List<Gateway> gateways;
    /**
     * <p>
     * The next item following a partial list of returned resources. For example, if a request is made to return
     * <code>maxResults</code> number of resources, <code>NextToken</code> allows you to return more items in your list
     * starting at the location pointed to by the next token.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of your gateways.
     * </p>
     * 
     * @return A list of your gateways.
     */

    public java.util.List<Gateway> getGateways() {
        return gateways;
    }

    /**
     * <p>
     * A list of your gateways.
     * </p>
     * 
     * @param gateways
     *        A list of your gateways.
     */

    public void setGateways(java.util.Collection<Gateway> gateways) {
        if (gateways == null) {
            this.gateways = null;
            return;
        }

        this.gateways = new java.util.ArrayList<Gateway>(gateways);
    }

    /**
     * <p>
     * A list of your gateways.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGateways(java.util.Collection)} or {@link #withGateways(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param gateways
     *        A list of your gateways.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListGatewaysResult withGateways(Gateway... gateways) {
        if (this.gateways == null) {
            setGateways(new java.util.ArrayList<Gateway>(gateways.length));
        }
        for (Gateway ele : gateways) {
            this.gateways.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of your gateways.
     * </p>
     * 
     * @param gateways
     *        A list of your gateways.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListGatewaysResult withGateways(java.util.Collection<Gateway> gateways) {
        setGateways(gateways);
        return this;
    }

    /**
     * <p>
     * The next item following a partial list of returned resources. For example, if a request is made to return
     * <code>maxResults</code> number of resources, <code>NextToken</code> allows you to return more items in your list
     * starting at the location pointed to by the next token.
     * </p>
     * 
     * @param nextToken
     *        The next item following a partial list of returned resources. For example, if a request is made to return
     *        <code>maxResults</code> number of resources, <code>NextToken</code> allows you to return more items in
     *        your list starting at the location pointed to by the next token.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The next item following a partial list of returned resources. For example, if a request is made to return
     * <code>maxResults</code> number of resources, <code>NextToken</code> allows you to return more items in your list
     * starting at the location pointed to by the next token.
     * </p>
     * 
     * @return The next item following a partial list of returned resources. For example, if a request is made to return
     *         <code>maxResults</code> number of resources, <code>NextToken</code> allows you to return more items in
     *         your list starting at the location pointed to by the next token.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The next item following a partial list of returned resources. For example, if a request is made to return
     * <code>maxResults</code> number of resources, <code>NextToken</code> allows you to return more items in your list
     * starting at the location pointed to by the next token.
     * </p>
     * 
     * @param nextToken
     *        The next item following a partial list of returned resources. For example, if a request is made to return
     *        <code>maxResults</code> number of resources, <code>NextToken</code> allows you to return more items in
     *        your list starting at the location pointed to by the next token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListGatewaysResult withNextToken(String nextToken) {
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
        if (getGateways() != null)
            sb.append("Gateways: ").append(getGateways()).append(",");
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

        if (obj instanceof ListGatewaysResult == false)
            return false;
        ListGatewaysResult other = (ListGatewaysResult) obj;
        if (other.getGateways() == null ^ this.getGateways() == null)
            return false;
        if (other.getGateways() != null && other.getGateways().equals(this.getGateways()) == false)
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

        hashCode = prime * hashCode + ((getGateways() == null) ? 0 : getGateways().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListGatewaysResult clone() {
        try {
            return (ListGatewaysResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
