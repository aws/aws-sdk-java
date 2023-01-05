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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-gateway-2021-01-01/ListHypervisors" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListHypervisorsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The maximum number of hypervisors to list.
     * </p>
     */
    private Integer maxResults;
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
     * The maximum number of hypervisors to list.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of hypervisors to list.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of hypervisors to list.
     * </p>
     * 
     * @return The maximum number of hypervisors to list.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of hypervisors to list.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of hypervisors to list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListHypervisorsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
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

    public ListHypervisorsRequest withNextToken(String nextToken) {
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
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
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

        if (obj instanceof ListHypervisorsRequest == false)
            return false;
        ListHypervisorsRequest other = (ListHypervisorsRequest) obj;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
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

        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListHypervisorsRequest clone() {
        return (ListHypervisorsRequest) super.clone();
    }

}
