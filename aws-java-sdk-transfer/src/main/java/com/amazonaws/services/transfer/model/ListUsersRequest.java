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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/ListUsers" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListUsersRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the number of users to return as a response to the <code>ListUsers</code> request.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * When you can get additional results from the <code>ListUsers</code> call, a <code>NextToken</code> parameter is
     * returned in the output. You can then pass in a subsequent command the <code>NextToken</code> parameter to
     * continue listing additional users.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * A system-assigned unique identifier for a Secure File Transfer Protocol (SFTP) server that has users are assigned
     * to it.
     * </p>
     */
    private String serverId;

    /**
     * <p>
     * Specifies the number of users to return as a response to the <code>ListUsers</code> request.
     * </p>
     * 
     * @param maxResults
     *        Specifies the number of users to return as a response to the <code>ListUsers</code> request.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * Specifies the number of users to return as a response to the <code>ListUsers</code> request.
     * </p>
     * 
     * @return Specifies the number of users to return as a response to the <code>ListUsers</code> request.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * Specifies the number of users to return as a response to the <code>ListUsers</code> request.
     * </p>
     * 
     * @param maxResults
     *        Specifies the number of users to return as a response to the <code>ListUsers</code> request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListUsersRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * When you can get additional results from the <code>ListUsers</code> call, a <code>NextToken</code> parameter is
     * returned in the output. You can then pass in a subsequent command the <code>NextToken</code> parameter to
     * continue listing additional users.
     * </p>
     * 
     * @param nextToken
     *        When you can get additional results from the <code>ListUsers</code> call, a <code>NextToken</code>
     *        parameter is returned in the output. You can then pass in a subsequent command the <code>NextToken</code>
     *        parameter to continue listing additional users.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * When you can get additional results from the <code>ListUsers</code> call, a <code>NextToken</code> parameter is
     * returned in the output. You can then pass in a subsequent command the <code>NextToken</code> parameter to
     * continue listing additional users.
     * </p>
     * 
     * @return When you can get additional results from the <code>ListUsers</code> call, a <code>NextToken</code>
     *         parameter is returned in the output. You can then pass in a subsequent command the <code>NextToken</code>
     *         parameter to continue listing additional users.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * When you can get additional results from the <code>ListUsers</code> call, a <code>NextToken</code> parameter is
     * returned in the output. You can then pass in a subsequent command the <code>NextToken</code> parameter to
     * continue listing additional users.
     * </p>
     * 
     * @param nextToken
     *        When you can get additional results from the <code>ListUsers</code> call, a <code>NextToken</code>
     *        parameter is returned in the output. You can then pass in a subsequent command the <code>NextToken</code>
     *        parameter to continue listing additional users.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListUsersRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * A system-assigned unique identifier for a Secure File Transfer Protocol (SFTP) server that has users are assigned
     * to it.
     * </p>
     * 
     * @param serverId
     *        A system-assigned unique identifier for a Secure File Transfer Protocol (SFTP) server that has users are
     *        assigned to it.
     */

    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    /**
     * <p>
     * A system-assigned unique identifier for a Secure File Transfer Protocol (SFTP) server that has users are assigned
     * to it.
     * </p>
     * 
     * @return A system-assigned unique identifier for a Secure File Transfer Protocol (SFTP) server that has users are
     *         assigned to it.
     */

    public String getServerId() {
        return this.serverId;
    }

    /**
     * <p>
     * A system-assigned unique identifier for a Secure File Transfer Protocol (SFTP) server that has users are assigned
     * to it.
     * </p>
     * 
     * @param serverId
     *        A system-assigned unique identifier for a Secure File Transfer Protocol (SFTP) server that has users are
     *        assigned to it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListUsersRequest withServerId(String serverId) {
        setServerId(serverId);
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
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getServerId() != null)
            sb.append("ServerId: ").append(getServerId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListUsersRequest == false)
            return false;
        ListUsersRequest other = (ListUsersRequest) obj;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getServerId() == null ^ this.getServerId() == null)
            return false;
        if (other.getServerId() != null && other.getServerId().equals(this.getServerId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getServerId() == null) ? 0 : getServerId().hashCode());
        return hashCode;
    }

    @Override
    public ListUsersRequest clone() {
        return (ListUsersRequest) super.clone();
    }

}
