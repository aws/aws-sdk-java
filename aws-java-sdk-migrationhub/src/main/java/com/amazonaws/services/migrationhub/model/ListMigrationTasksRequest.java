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
package com.amazonaws.services.migrationhub.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWSMigrationHub-2017-05-31/ListMigrationTasks" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListMigrationTasksRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * If a <code>NextToken</code> was returned by a previous call, there are more results available. To retrieve the
     * next page of results, make the call again using the returned token in <code>NextToken</code>.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Value to specify how many results are returned per page.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * Filter migration tasks by discovered resource name.
     * </p>
     */
    private String resourceName;

    /**
     * <p>
     * If a <code>NextToken</code> was returned by a previous call, there are more results available. To retrieve the
     * next page of results, make the call again using the returned token in <code>NextToken</code>.
     * </p>
     * 
     * @param nextToken
     *        If a <code>NextToken</code> was returned by a previous call, there are more results available. To retrieve
     *        the next page of results, make the call again using the returned token in <code>NextToken</code>.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If a <code>NextToken</code> was returned by a previous call, there are more results available. To retrieve the
     * next page of results, make the call again using the returned token in <code>NextToken</code>.
     * </p>
     * 
     * @return If a <code>NextToken</code> was returned by a previous call, there are more results available. To
     *         retrieve the next page of results, make the call again using the returned token in <code>NextToken</code>
     *         .
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If a <code>NextToken</code> was returned by a previous call, there are more results available. To retrieve the
     * next page of results, make the call again using the returned token in <code>NextToken</code>.
     * </p>
     * 
     * @param nextToken
     *        If a <code>NextToken</code> was returned by a previous call, there are more results available. To retrieve
     *        the next page of results, make the call again using the returned token in <code>NextToken</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMigrationTasksRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Value to specify how many results are returned per page.
     * </p>
     * 
     * @param maxResults
     *        Value to specify how many results are returned per page.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * Value to specify how many results are returned per page.
     * </p>
     * 
     * @return Value to specify how many results are returned per page.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * Value to specify how many results are returned per page.
     * </p>
     * 
     * @param maxResults
     *        Value to specify how many results are returned per page.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMigrationTasksRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * Filter migration tasks by discovered resource name.
     * </p>
     * 
     * @param resourceName
     *        Filter migration tasks by discovered resource name.
     */

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    /**
     * <p>
     * Filter migration tasks by discovered resource name.
     * </p>
     * 
     * @return Filter migration tasks by discovered resource name.
     */

    public String getResourceName() {
        return this.resourceName;
    }

    /**
     * <p>
     * Filter migration tasks by discovered resource name.
     * </p>
     * 
     * @param resourceName
     *        Filter migration tasks by discovered resource name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMigrationTasksRequest withResourceName(String resourceName) {
        setResourceName(resourceName);
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
        if (getResourceName() != null)
            sb.append("ResourceName: ").append(getResourceName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListMigrationTasksRequest == false)
            return false;
        ListMigrationTasksRequest other = (ListMigrationTasksRequest) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getResourceName() == null ^ this.getResourceName() == null)
            return false;
        if (other.getResourceName() != null && other.getResourceName().equals(this.getResourceName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getResourceName() == null) ? 0 : getResourceName().hashCode());
        return hashCode;
    }

    @Override
    public ListMigrationTasksRequest clone() {
        return (ListMigrationTasksRequest) super.clone();
    }

}
