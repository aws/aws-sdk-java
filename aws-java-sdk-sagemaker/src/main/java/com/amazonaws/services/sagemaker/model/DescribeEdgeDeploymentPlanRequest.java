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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeEdgeDeploymentPlan"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeEdgeDeploymentPlanRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the deployment plan to describe.
     * </p>
     */
    private String edgeDeploymentPlanName;
    /**
     * <p>
     * If the edge deployment plan has enough stages to require tokening, then this is the response from the last list
     * of stages returned.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of results to select (50 by default).
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The name of the deployment plan to describe.
     * </p>
     * 
     * @param edgeDeploymentPlanName
     *        The name of the deployment plan to describe.
     */

    public void setEdgeDeploymentPlanName(String edgeDeploymentPlanName) {
        this.edgeDeploymentPlanName = edgeDeploymentPlanName;
    }

    /**
     * <p>
     * The name of the deployment plan to describe.
     * </p>
     * 
     * @return The name of the deployment plan to describe.
     */

    public String getEdgeDeploymentPlanName() {
        return this.edgeDeploymentPlanName;
    }

    /**
     * <p>
     * The name of the deployment plan to describe.
     * </p>
     * 
     * @param edgeDeploymentPlanName
     *        The name of the deployment plan to describe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEdgeDeploymentPlanRequest withEdgeDeploymentPlanName(String edgeDeploymentPlanName) {
        setEdgeDeploymentPlanName(edgeDeploymentPlanName);
        return this;
    }

    /**
     * <p>
     * If the edge deployment plan has enough stages to require tokening, then this is the response from the last list
     * of stages returned.
     * </p>
     * 
     * @param nextToken
     *        If the edge deployment plan has enough stages to require tokening, then this is the response from the last
     *        list of stages returned.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the edge deployment plan has enough stages to require tokening, then this is the response from the last list
     * of stages returned.
     * </p>
     * 
     * @return If the edge deployment plan has enough stages to require tokening, then this is the response from the
     *         last list of stages returned.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the edge deployment plan has enough stages to require tokening, then this is the response from the last list
     * of stages returned.
     * </p>
     * 
     * @param nextToken
     *        If the edge deployment plan has enough stages to require tokening, then this is the response from the last
     *        list of stages returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEdgeDeploymentPlanRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to select (50 by default).
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to select (50 by default).
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to select (50 by default).
     * </p>
     * 
     * @return The maximum number of results to select (50 by default).
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to select (50 by default).
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to select (50 by default).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEdgeDeploymentPlanRequest withMaxResults(Integer maxResults) {
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
        if (getEdgeDeploymentPlanName() != null)
            sb.append("EdgeDeploymentPlanName: ").append(getEdgeDeploymentPlanName()).append(",");
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

        if (obj instanceof DescribeEdgeDeploymentPlanRequest == false)
            return false;
        DescribeEdgeDeploymentPlanRequest other = (DescribeEdgeDeploymentPlanRequest) obj;
        if (other.getEdgeDeploymentPlanName() == null ^ this.getEdgeDeploymentPlanName() == null)
            return false;
        if (other.getEdgeDeploymentPlanName() != null && other.getEdgeDeploymentPlanName().equals(this.getEdgeDeploymentPlanName()) == false)
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

        hashCode = prime * hashCode + ((getEdgeDeploymentPlanName() == null) ? 0 : getEdgeDeploymentPlanName().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public DescribeEdgeDeploymentPlanRequest clone() {
        return (DescribeEdgeDeploymentPlanRequest) super.clone();
    }

}
