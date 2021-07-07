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
package com.amazonaws.services.iotsitewise.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/ListProjectAssets" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListProjectAssetsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the project.
     * </p>
     */
    private String projectId;
    /**
     * <p>
     * The token to be used for the next set of paginated results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of results to return for each paginated request.
     * </p>
     * <p>
     * Default: 50
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The ID of the project.
     * </p>
     * 
     * @param projectId
     *        The ID of the project.
     */

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    /**
     * <p>
     * The ID of the project.
     * </p>
     * 
     * @return The ID of the project.
     */

    public String getProjectId() {
        return this.projectId;
    }

    /**
     * <p>
     * The ID of the project.
     * </p>
     * 
     * @param projectId
     *        The ID of the project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListProjectAssetsRequest withProjectId(String projectId) {
        setProjectId(projectId);
        return this;
    }

    /**
     * <p>
     * The token to be used for the next set of paginated results.
     * </p>
     * 
     * @param nextToken
     *        The token to be used for the next set of paginated results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to be used for the next set of paginated results.
     * </p>
     * 
     * @return The token to be used for the next set of paginated results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to be used for the next set of paginated results.
     * </p>
     * 
     * @param nextToken
     *        The token to be used for the next set of paginated results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListProjectAssetsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return for each paginated request.
     * </p>
     * <p>
     * Default: 50
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return for each paginated request.</p>
     *        <p>
     *        Default: 50
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return for each paginated request.
     * </p>
     * <p>
     * Default: 50
     * </p>
     * 
     * @return The maximum number of results to return for each paginated request.</p>
     *         <p>
     *         Default: 50
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return for each paginated request.
     * </p>
     * <p>
     * Default: 50
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return for each paginated request.</p>
     *        <p>
     *        Default: 50
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListProjectAssetsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
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
        if (getProjectId() != null)
            sb.append("ProjectId: ").append(getProjectId()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListProjectAssetsRequest == false)
            return false;
        ListProjectAssetsRequest other = (ListProjectAssetsRequest) obj;
        if (other.getProjectId() == null ^ this.getProjectId() == null)
            return false;
        if (other.getProjectId() != null && other.getProjectId().equals(this.getProjectId()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProjectId() == null) ? 0 : getProjectId().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListProjectAssetsRequest clone() {
        return (ListProjectAssetsRequest) super.clone();
    }

}
