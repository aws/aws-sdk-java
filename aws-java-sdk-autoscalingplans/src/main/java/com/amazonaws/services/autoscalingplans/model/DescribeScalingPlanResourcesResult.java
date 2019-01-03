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
package com.amazonaws.services.autoscalingplans.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-plans-2018-01-06/DescribeScalingPlanResources"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeScalingPlanResourcesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the scalable resources.
     * </p>
     */
    private java.util.List<ScalingPlanResource> scalingPlanResources;
    /**
     * <p>
     * The token required to get the next set of results. This value is <code>null</code> if there are no more results
     * to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Information about the scalable resources.
     * </p>
     * 
     * @return Information about the scalable resources.
     */

    public java.util.List<ScalingPlanResource> getScalingPlanResources() {
        return scalingPlanResources;
    }

    /**
     * <p>
     * Information about the scalable resources.
     * </p>
     * 
     * @param scalingPlanResources
     *        Information about the scalable resources.
     */

    public void setScalingPlanResources(java.util.Collection<ScalingPlanResource> scalingPlanResources) {
        if (scalingPlanResources == null) {
            this.scalingPlanResources = null;
            return;
        }

        this.scalingPlanResources = new java.util.ArrayList<ScalingPlanResource>(scalingPlanResources);
    }

    /**
     * <p>
     * Information about the scalable resources.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setScalingPlanResources(java.util.Collection)} or {@link #withScalingPlanResources(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param scalingPlanResources
     *        Information about the scalable resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeScalingPlanResourcesResult withScalingPlanResources(ScalingPlanResource... scalingPlanResources) {
        if (this.scalingPlanResources == null) {
            setScalingPlanResources(new java.util.ArrayList<ScalingPlanResource>(scalingPlanResources.length));
        }
        for (ScalingPlanResource ele : scalingPlanResources) {
            this.scalingPlanResources.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the scalable resources.
     * </p>
     * 
     * @param scalingPlanResources
     *        Information about the scalable resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeScalingPlanResourcesResult withScalingPlanResources(java.util.Collection<ScalingPlanResource> scalingPlanResources) {
        setScalingPlanResources(scalingPlanResources);
        return this;
    }

    /**
     * <p>
     * The token required to get the next set of results. This value is <code>null</code> if there are no more results
     * to return.
     * </p>
     * 
     * @param nextToken
     *        The token required to get the next set of results. This value is <code>null</code> if there are no more
     *        results to return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token required to get the next set of results. This value is <code>null</code> if there are no more results
     * to return.
     * </p>
     * 
     * @return The token required to get the next set of results. This value is <code>null</code> if there are no more
     *         results to return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token required to get the next set of results. This value is <code>null</code> if there are no more results
     * to return.
     * </p>
     * 
     * @param nextToken
     *        The token required to get the next set of results. This value is <code>null</code> if there are no more
     *        results to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeScalingPlanResourcesResult withNextToken(String nextToken) {
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
        if (getScalingPlanResources() != null)
            sb.append("ScalingPlanResources: ").append(getScalingPlanResources()).append(",");
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

        if (obj instanceof DescribeScalingPlanResourcesResult == false)
            return false;
        DescribeScalingPlanResourcesResult other = (DescribeScalingPlanResourcesResult) obj;
        if (other.getScalingPlanResources() == null ^ this.getScalingPlanResources() == null)
            return false;
        if (other.getScalingPlanResources() != null && other.getScalingPlanResources().equals(this.getScalingPlanResources()) == false)
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

        hashCode = prime * hashCode + ((getScalingPlanResources() == null) ? 0 : getScalingPlanResources().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeScalingPlanResourcesResult clone() {
        try {
            return (DescribeScalingPlanResourcesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
