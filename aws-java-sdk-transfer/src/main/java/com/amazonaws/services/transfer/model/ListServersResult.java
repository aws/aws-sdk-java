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
package com.amazonaws.services.transfer.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/ListServers" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListServersResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * When you can get additional results from the <code>ListServers</code> operation, a <code>NextToken</code>
     * parameter is returned in the output. In a following command, you can pass in the <code>NextToken</code> parameter
     * to continue listing additional servers.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * An array of servers that were listed.
     * </p>
     */
    private java.util.List<ListedServer> servers;

    /**
     * <p>
     * When you can get additional results from the <code>ListServers</code> operation, a <code>NextToken</code>
     * parameter is returned in the output. In a following command, you can pass in the <code>NextToken</code> parameter
     * to continue listing additional servers.
     * </p>
     * 
     * @param nextToken
     *        When you can get additional results from the <code>ListServers</code> operation, a <code>NextToken</code>
     *        parameter is returned in the output. In a following command, you can pass in the <code>NextToken</code>
     *        parameter to continue listing additional servers.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * When you can get additional results from the <code>ListServers</code> operation, a <code>NextToken</code>
     * parameter is returned in the output. In a following command, you can pass in the <code>NextToken</code> parameter
     * to continue listing additional servers.
     * </p>
     * 
     * @return When you can get additional results from the <code>ListServers</code> operation, a <code>NextToken</code>
     *         parameter is returned in the output. In a following command, you can pass in the <code>NextToken</code>
     *         parameter to continue listing additional servers.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * When you can get additional results from the <code>ListServers</code> operation, a <code>NextToken</code>
     * parameter is returned in the output. In a following command, you can pass in the <code>NextToken</code> parameter
     * to continue listing additional servers.
     * </p>
     * 
     * @param nextToken
     *        When you can get additional results from the <code>ListServers</code> operation, a <code>NextToken</code>
     *        parameter is returned in the output. In a following command, you can pass in the <code>NextToken</code>
     *        parameter to continue listing additional servers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListServersResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * An array of servers that were listed.
     * </p>
     * 
     * @return An array of servers that were listed.
     */

    public java.util.List<ListedServer> getServers() {
        return servers;
    }

    /**
     * <p>
     * An array of servers that were listed.
     * </p>
     * 
     * @param servers
     *        An array of servers that were listed.
     */

    public void setServers(java.util.Collection<ListedServer> servers) {
        if (servers == null) {
            this.servers = null;
            return;
        }

        this.servers = new java.util.ArrayList<ListedServer>(servers);
    }

    /**
     * <p>
     * An array of servers that were listed.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setServers(java.util.Collection)} or {@link #withServers(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param servers
     *        An array of servers that were listed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListServersResult withServers(ListedServer... servers) {
        if (this.servers == null) {
            setServers(new java.util.ArrayList<ListedServer>(servers.length));
        }
        for (ListedServer ele : servers) {
            this.servers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of servers that were listed.
     * </p>
     * 
     * @param servers
     *        An array of servers that were listed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListServersResult withServers(java.util.Collection<ListedServer> servers) {
        setServers(servers);
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
        if (getServers() != null)
            sb.append("Servers: ").append(getServers());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListServersResult == false)
            return false;
        ListServersResult other = (ListServersResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getServers() == null ^ this.getServers() == null)
            return false;
        if (other.getServers() != null && other.getServers().equals(this.getServers()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getServers() == null) ? 0 : getServers().hashCode());
        return hashCode;
    }

    @Override
    public ListServersResult clone() {
        try {
            return (ListServersResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
