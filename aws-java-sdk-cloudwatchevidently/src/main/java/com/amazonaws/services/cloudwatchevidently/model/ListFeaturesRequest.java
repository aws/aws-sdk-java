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
package com.amazonaws.services.cloudwatchevidently.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/ListFeatures" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListFeaturesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The maximum number of results to include in the response.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The token to use when requesting the next set of results. You received this token from a previous
     * <code>ListFeatures</code> operation.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The name or ARN of the project to return the feature list from.
     * </p>
     */
    private String project;

    /**
     * <p>
     * The maximum number of results to include in the response.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to include in the response.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to include in the response.
     * </p>
     * 
     * @return The maximum number of results to include in the response.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to include in the response.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to include in the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFeaturesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The token to use when requesting the next set of results. You received this token from a previous
     * <code>ListFeatures</code> operation.
     * </p>
     * 
     * @param nextToken
     *        The token to use when requesting the next set of results. You received this token from a previous
     *        <code>ListFeatures</code> operation.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use when requesting the next set of results. You received this token from a previous
     * <code>ListFeatures</code> operation.
     * </p>
     * 
     * @return The token to use when requesting the next set of results. You received this token from a previous
     *         <code>ListFeatures</code> operation.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to use when requesting the next set of results. You received this token from a previous
     * <code>ListFeatures</code> operation.
     * </p>
     * 
     * @param nextToken
     *        The token to use when requesting the next set of results. You received this token from a previous
     *        <code>ListFeatures</code> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFeaturesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The name or ARN of the project to return the feature list from.
     * </p>
     * 
     * @param project
     *        The name or ARN of the project to return the feature list from.
     */

    public void setProject(String project) {
        this.project = project;
    }

    /**
     * <p>
     * The name or ARN of the project to return the feature list from.
     * </p>
     * 
     * @return The name or ARN of the project to return the feature list from.
     */

    public String getProject() {
        return this.project;
    }

    /**
     * <p>
     * The name or ARN of the project to return the feature list from.
     * </p>
     * 
     * @param project
     *        The name or ARN of the project to return the feature list from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFeaturesRequest withProject(String project) {
        setProject(project);
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
        if (getProject() != null)
            sb.append("Project: ").append(getProject());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListFeaturesRequest == false)
            return false;
        ListFeaturesRequest other = (ListFeaturesRequest) obj;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getProject() == null ^ this.getProject() == null)
            return false;
        if (other.getProject() != null && other.getProject().equals(this.getProject()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getProject() == null) ? 0 : getProject().hashCode());
        return hashCode;
    }

    @Override
    public ListFeaturesRequest clone() {
        return (ListFeaturesRequest) super.clone();
    }

}
