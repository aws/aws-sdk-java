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
package com.amazonaws.services.amplify.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Describes the request structure for the list artifacts request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/ListArtifacts" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListArtifactsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique ID for an Amplify app.
     * </p>
     */
    private String appId;
    /**
     * <p>
     * The name of a branch that is part of an Amplify app.
     * </p>
     */
    private String branchName;
    /**
     * <p>
     * The unique ID for a job.
     * </p>
     */
    private String jobId;
    /**
     * <p>
     * A pagination token. Set to null to start listing artifacts from start. If a non-null pagination token is returned
     * in a result, pass its value in here to list more artifacts.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of records to list in a single response.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The unique ID for an Amplify app.
     * </p>
     * 
     * @param appId
     *        The unique ID for an Amplify app.
     */

    public void setAppId(String appId) {
        this.appId = appId;
    }

    /**
     * <p>
     * The unique ID for an Amplify app.
     * </p>
     * 
     * @return The unique ID for an Amplify app.
     */

    public String getAppId() {
        return this.appId;
    }

    /**
     * <p>
     * The unique ID for an Amplify app.
     * </p>
     * 
     * @param appId
     *        The unique ID for an Amplify app.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListArtifactsRequest withAppId(String appId) {
        setAppId(appId);
        return this;
    }

    /**
     * <p>
     * The name of a branch that is part of an Amplify app.
     * </p>
     * 
     * @param branchName
     *        The name of a branch that is part of an Amplify app.
     */

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    /**
     * <p>
     * The name of a branch that is part of an Amplify app.
     * </p>
     * 
     * @return The name of a branch that is part of an Amplify app.
     */

    public String getBranchName() {
        return this.branchName;
    }

    /**
     * <p>
     * The name of a branch that is part of an Amplify app.
     * </p>
     * 
     * @param branchName
     *        The name of a branch that is part of an Amplify app.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListArtifactsRequest withBranchName(String branchName) {
        setBranchName(branchName);
        return this;
    }

    /**
     * <p>
     * The unique ID for a job.
     * </p>
     * 
     * @param jobId
     *        The unique ID for a job.
     */

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * The unique ID for a job.
     * </p>
     * 
     * @return The unique ID for a job.
     */

    public String getJobId() {
        return this.jobId;
    }

    /**
     * <p>
     * The unique ID for a job.
     * </p>
     * 
     * @param jobId
     *        The unique ID for a job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListArtifactsRequest withJobId(String jobId) {
        setJobId(jobId);
        return this;
    }

    /**
     * <p>
     * A pagination token. Set to null to start listing artifacts from start. If a non-null pagination token is returned
     * in a result, pass its value in here to list more artifacts.
     * </p>
     * 
     * @param nextToken
     *        A pagination token. Set to null to start listing artifacts from start. If a non-null pagination token is
     *        returned in a result, pass its value in here to list more artifacts.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A pagination token. Set to null to start listing artifacts from start. If a non-null pagination token is returned
     * in a result, pass its value in here to list more artifacts.
     * </p>
     * 
     * @return A pagination token. Set to null to start listing artifacts from start. If a non-null pagination token is
     *         returned in a result, pass its value in here to list more artifacts.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A pagination token. Set to null to start listing artifacts from start. If a non-null pagination token is returned
     * in a result, pass its value in here to list more artifacts.
     * </p>
     * 
     * @param nextToken
     *        A pagination token. Set to null to start listing artifacts from start. If a non-null pagination token is
     *        returned in a result, pass its value in here to list more artifacts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListArtifactsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of records to list in a single response.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of records to list in a single response.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of records to list in a single response.
     * </p>
     * 
     * @return The maximum number of records to list in a single response.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of records to list in a single response.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of records to list in a single response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListArtifactsRequest withMaxResults(Integer maxResults) {
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
        if (getAppId() != null)
            sb.append("AppId: ").append(getAppId()).append(",");
        if (getBranchName() != null)
            sb.append("BranchName: ").append(getBranchName()).append(",");
        if (getJobId() != null)
            sb.append("JobId: ").append(getJobId()).append(",");
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

        if (obj instanceof ListArtifactsRequest == false)
            return false;
        ListArtifactsRequest other = (ListArtifactsRequest) obj;
        if (other.getAppId() == null ^ this.getAppId() == null)
            return false;
        if (other.getAppId() != null && other.getAppId().equals(this.getAppId()) == false)
            return false;
        if (other.getBranchName() == null ^ this.getBranchName() == null)
            return false;
        if (other.getBranchName() != null && other.getBranchName().equals(this.getBranchName()) == false)
            return false;
        if (other.getJobId() == null ^ this.getJobId() == null)
            return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false)
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

        hashCode = prime * hashCode + ((getAppId() == null) ? 0 : getAppId().hashCode());
        hashCode = prime * hashCode + ((getBranchName() == null) ? 0 : getBranchName().hashCode());
        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListArtifactsRequest clone() {
        return (ListArtifactsRequest) super.clone();
    }

}
