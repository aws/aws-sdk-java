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
package com.amazonaws.services.athena.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/ListNamedQueries" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListNamedQueriesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The token that specifies where to start pagination if a previous request was truncated.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of queries to return in this request.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The name of the workgroup from which the named queries are being returned.
     * </p>
     */
    private String workGroup;

    /**
     * <p>
     * The token that specifies where to start pagination if a previous request was truncated.
     * </p>
     * 
     * @param nextToken
     *        The token that specifies where to start pagination if a previous request was truncated.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token that specifies where to start pagination if a previous request was truncated.
     * </p>
     * 
     * @return The token that specifies where to start pagination if a previous request was truncated.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token that specifies where to start pagination if a previous request was truncated.
     * </p>
     * 
     * @param nextToken
     *        The token that specifies where to start pagination if a previous request was truncated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListNamedQueriesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of queries to return in this request.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of queries to return in this request.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of queries to return in this request.
     * </p>
     * 
     * @return The maximum number of queries to return in this request.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of queries to return in this request.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of queries to return in this request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListNamedQueriesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The name of the workgroup from which the named queries are being returned.
     * </p>
     * 
     * @param workGroup
     *        The name of the workgroup from which the named queries are being returned.
     */

    public void setWorkGroup(String workGroup) {
        this.workGroup = workGroup;
    }

    /**
     * <p>
     * The name of the workgroup from which the named queries are being returned.
     * </p>
     * 
     * @return The name of the workgroup from which the named queries are being returned.
     */

    public String getWorkGroup() {
        return this.workGroup;
    }

    /**
     * <p>
     * The name of the workgroup from which the named queries are being returned.
     * </p>
     * 
     * @param workGroup
     *        The name of the workgroup from which the named queries are being returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListNamedQueriesRequest withWorkGroup(String workGroup) {
        setWorkGroup(workGroup);
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
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getWorkGroup() != null)
            sb.append("WorkGroup: ").append(getWorkGroup());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListNamedQueriesRequest == false)
            return false;
        ListNamedQueriesRequest other = (ListNamedQueriesRequest) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getWorkGroup() == null ^ this.getWorkGroup() == null)
            return false;
        if (other.getWorkGroup() != null && other.getWorkGroup().equals(this.getWorkGroup()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getWorkGroup() == null) ? 0 : getWorkGroup().hashCode());
        return hashCode;
    }

    @Override
    public ListNamedQueriesRequest clone() {
        return (ListNamedQueriesRequest) super.clone();
    }

}
