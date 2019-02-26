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
package com.amazonaws.services.robomaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/ListDeploymentJobs" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListDeploymentJobsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of deployment jobs that meet the criteria of the request.
     * </p>
     */
    private java.util.List<DeploymentJob> deploymentJobs;
    /**
     * <p>
     * The <code>nextToken</code> value to include in a future <code>ListDeploymentJobs</code> request. When the results
     * of a <code>ListDeploymentJobs</code> request exceed <code>maxResults</code>, this value can be used to retrieve
     * the next page of results. This value is <code>null</code> when there are no more results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of deployment jobs that meet the criteria of the request.
     * </p>
     * 
     * @return A list of deployment jobs that meet the criteria of the request.
     */

    public java.util.List<DeploymentJob> getDeploymentJobs() {
        return deploymentJobs;
    }

    /**
     * <p>
     * A list of deployment jobs that meet the criteria of the request.
     * </p>
     * 
     * @param deploymentJobs
     *        A list of deployment jobs that meet the criteria of the request.
     */

    public void setDeploymentJobs(java.util.Collection<DeploymentJob> deploymentJobs) {
        if (deploymentJobs == null) {
            this.deploymentJobs = null;
            return;
        }

        this.deploymentJobs = new java.util.ArrayList<DeploymentJob>(deploymentJobs);
    }

    /**
     * <p>
     * A list of deployment jobs that meet the criteria of the request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDeploymentJobs(java.util.Collection)} or {@link #withDeploymentJobs(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param deploymentJobs
     *        A list of deployment jobs that meet the criteria of the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDeploymentJobsResult withDeploymentJobs(DeploymentJob... deploymentJobs) {
        if (this.deploymentJobs == null) {
            setDeploymentJobs(new java.util.ArrayList<DeploymentJob>(deploymentJobs.length));
        }
        for (DeploymentJob ele : deploymentJobs) {
            this.deploymentJobs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of deployment jobs that meet the criteria of the request.
     * </p>
     * 
     * @param deploymentJobs
     *        A list of deployment jobs that meet the criteria of the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDeploymentJobsResult withDeploymentJobs(java.util.Collection<DeploymentJob> deploymentJobs) {
        setDeploymentJobs(deploymentJobs);
        return this;
    }

    /**
     * <p>
     * The <code>nextToken</code> value to include in a future <code>ListDeploymentJobs</code> request. When the results
     * of a <code>ListDeploymentJobs</code> request exceed <code>maxResults</code>, this value can be used to retrieve
     * the next page of results. This value is <code>null</code> when there are no more results to return.
     * </p>
     * 
     * @param nextToken
     *        The <code>nextToken</code> value to include in a future <code>ListDeploymentJobs</code> request. When the
     *        results of a <code>ListDeploymentJobs</code> request exceed <code>maxResults</code>, this value can be
     *        used to retrieve the next page of results. This value is <code>null</code> when there are no more results
     *        to return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value to include in a future <code>ListDeploymentJobs</code> request. When the results
     * of a <code>ListDeploymentJobs</code> request exceed <code>maxResults</code>, this value can be used to retrieve
     * the next page of results. This value is <code>null</code> when there are no more results to return.
     * </p>
     * 
     * @return The <code>nextToken</code> value to include in a future <code>ListDeploymentJobs</code> request. When the
     *         results of a <code>ListDeploymentJobs</code> request exceed <code>maxResults</code>, this value can be
     *         used to retrieve the next page of results. This value is <code>null</code> when there are no more results
     *         to return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value to include in a future <code>ListDeploymentJobs</code> request. When the results
     * of a <code>ListDeploymentJobs</code> request exceed <code>maxResults</code>, this value can be used to retrieve
     * the next page of results. This value is <code>null</code> when there are no more results to return.
     * </p>
     * 
     * @param nextToken
     *        The <code>nextToken</code> value to include in a future <code>ListDeploymentJobs</code> request. When the
     *        results of a <code>ListDeploymentJobs</code> request exceed <code>maxResults</code>, this value can be
     *        used to retrieve the next page of results. This value is <code>null</code> when there are no more results
     *        to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDeploymentJobsResult withNextToken(String nextToken) {
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
        if (getDeploymentJobs() != null)
            sb.append("DeploymentJobs: ").append(getDeploymentJobs()).append(",");
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

        if (obj instanceof ListDeploymentJobsResult == false)
            return false;
        ListDeploymentJobsResult other = (ListDeploymentJobsResult) obj;
        if (other.getDeploymentJobs() == null ^ this.getDeploymentJobs() == null)
            return false;
        if (other.getDeploymentJobs() != null && other.getDeploymentJobs().equals(this.getDeploymentJobs()) == false)
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

        hashCode = prime * hashCode + ((getDeploymentJobs() == null) ? 0 : getDeploymentJobs().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListDeploymentJobsResult clone() {
        try {
            return (ListDeploymentJobsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
