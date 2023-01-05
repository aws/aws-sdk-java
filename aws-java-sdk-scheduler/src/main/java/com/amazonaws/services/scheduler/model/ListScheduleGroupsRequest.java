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
package com.amazonaws.services.scheduler.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/scheduler-2021-06-30/ListScheduleGroups" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListScheduleGroupsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * If specified, limits the number of results returned by this operation. The operation also returns a
     * <code>NextToken</code> which you can use in a subsequent operation to retrieve the next set of results.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The name prefix that you can use to return a filtered list of your schedule groups.
     * </p>
     */
    private String namePrefix;
    /**
     * <p>
     * The token returned by a previous call to retrieve the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * If specified, limits the number of results returned by this operation. The operation also returns a
     * <code>NextToken</code> which you can use in a subsequent operation to retrieve the next set of results.
     * </p>
     * 
     * @param maxResults
     *        If specified, limits the number of results returned by this operation. The operation also returns a
     *        <code>NextToken</code> which you can use in a subsequent operation to retrieve the next set of results.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * If specified, limits the number of results returned by this operation. The operation also returns a
     * <code>NextToken</code> which you can use in a subsequent operation to retrieve the next set of results.
     * </p>
     * 
     * @return If specified, limits the number of results returned by this operation. The operation also returns a
     *         <code>NextToken</code> which you can use in a subsequent operation to retrieve the next set of results.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * If specified, limits the number of results returned by this operation. The operation also returns a
     * <code>NextToken</code> which you can use in a subsequent operation to retrieve the next set of results.
     * </p>
     * 
     * @param maxResults
     *        If specified, limits the number of results returned by this operation. The operation also returns a
     *        <code>NextToken</code> which you can use in a subsequent operation to retrieve the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListScheduleGroupsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The name prefix that you can use to return a filtered list of your schedule groups.
     * </p>
     * 
     * @param namePrefix
     *        The name prefix that you can use to return a filtered list of your schedule groups.
     */

    public void setNamePrefix(String namePrefix) {
        this.namePrefix = namePrefix;
    }

    /**
     * <p>
     * The name prefix that you can use to return a filtered list of your schedule groups.
     * </p>
     * 
     * @return The name prefix that you can use to return a filtered list of your schedule groups.
     */

    public String getNamePrefix() {
        return this.namePrefix;
    }

    /**
     * <p>
     * The name prefix that you can use to return a filtered list of your schedule groups.
     * </p>
     * 
     * @param namePrefix
     *        The name prefix that you can use to return a filtered list of your schedule groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListScheduleGroupsRequest withNamePrefix(String namePrefix) {
        setNamePrefix(namePrefix);
        return this;
    }

    /**
     * <p>
     * The token returned by a previous call to retrieve the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The token returned by a previous call to retrieve the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token returned by a previous call to retrieve the next set of results.
     * </p>
     * 
     * @return The token returned by a previous call to retrieve the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token returned by a previous call to retrieve the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The token returned by a previous call to retrieve the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListScheduleGroupsRequest withNextToken(String nextToken) {
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
        if (getNamePrefix() != null)
            sb.append("NamePrefix: ").append(getNamePrefix()).append(",");
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

        if (obj instanceof ListScheduleGroupsRequest == false)
            return false;
        ListScheduleGroupsRequest other = (ListScheduleGroupsRequest) obj;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNamePrefix() == null ^ this.getNamePrefix() == null)
            return false;
        if (other.getNamePrefix() != null && other.getNamePrefix().equals(this.getNamePrefix()) == false)
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
        hashCode = prime * hashCode + ((getNamePrefix() == null) ? 0 : getNamePrefix().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListScheduleGroupsRequest clone() {
        return (ListScheduleGroupsRequest) super.clone();
    }

}
