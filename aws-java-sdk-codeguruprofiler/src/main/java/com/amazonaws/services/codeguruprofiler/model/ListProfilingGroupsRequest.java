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
package com.amazonaws.services.codeguruprofiler.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Request for ListProfilingGroups operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguruprofiler-2019-07-18/ListProfilingGroups"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListProfilingGroupsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * If set to true, returns the full description of the profiling groups instead of the names. Defaults to false.
     * </p>
     */
    private Boolean includeDescription;

    private Integer maxResults;

    private String nextToken;

    /**
     * <p>
     * If set to true, returns the full description of the profiling groups instead of the names. Defaults to false.
     * </p>
     * 
     * @param includeDescription
     *        If set to true, returns the full description of the profiling groups instead of the names. Defaults to
     *        false.
     */

    public void setIncludeDescription(Boolean includeDescription) {
        this.includeDescription = includeDescription;
    }

    /**
     * <p>
     * If set to true, returns the full description of the profiling groups instead of the names. Defaults to false.
     * </p>
     * 
     * @return If set to true, returns the full description of the profiling groups instead of the names. Defaults to
     *         false.
     */

    public Boolean getIncludeDescription() {
        return this.includeDescription;
    }

    /**
     * <p>
     * If set to true, returns the full description of the profiling groups instead of the names. Defaults to false.
     * </p>
     * 
     * @param includeDescription
     *        If set to true, returns the full description of the profiling groups instead of the names. Defaults to
     *        false.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListProfilingGroupsRequest withIncludeDescription(Boolean includeDescription) {
        setIncludeDescription(includeDescription);
        return this;
    }

    /**
     * <p>
     * If set to true, returns the full description of the profiling groups instead of the names. Defaults to false.
     * </p>
     * 
     * @return If set to true, returns the full description of the profiling groups instead of the names. Defaults to
     *         false.
     */

    public Boolean isIncludeDescription() {
        return this.includeDescription;
    }

    /**
     * @param maxResults
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * @return
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @param maxResults
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListProfilingGroupsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * @param nextToken
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * @return
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @param nextToken
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListProfilingGroupsRequest withNextToken(String nextToken) {
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
        if (getIncludeDescription() != null)
            sb.append("IncludeDescription: ").append(getIncludeDescription()).append(",");
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

        if (obj instanceof ListProfilingGroupsRequest == false)
            return false;
        ListProfilingGroupsRequest other = (ListProfilingGroupsRequest) obj;
        if (other.getIncludeDescription() == null ^ this.getIncludeDescription() == null)
            return false;
        if (other.getIncludeDescription() != null && other.getIncludeDescription().equals(this.getIncludeDescription()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getIncludeDescription() == null) ? 0 : getIncludeDescription().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListProfilingGroupsRequest clone() {
        return (ListProfilingGroupsRequest) super.clone();
    }

}
