/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-plans-2018-01-06/DescribeScalingPlans"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeScalingPlansResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    private java.util.List<ScalingPlan> scalingPlans;

    private String nextToken;

    /**
     * @return
     */

    public java.util.List<ScalingPlan> getScalingPlans() {
        return scalingPlans;
    }

    /**
     * @param scalingPlans
     */

    public void setScalingPlans(java.util.Collection<ScalingPlan> scalingPlans) {
        if (scalingPlans == null) {
            this.scalingPlans = null;
            return;
        }

        this.scalingPlans = new java.util.ArrayList<ScalingPlan>(scalingPlans);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setScalingPlans(java.util.Collection)} or {@link #withScalingPlans(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param scalingPlans
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeScalingPlansResult withScalingPlans(ScalingPlan... scalingPlans) {
        if (this.scalingPlans == null) {
            setScalingPlans(new java.util.ArrayList<ScalingPlan>(scalingPlans.length));
        }
        for (ScalingPlan ele : scalingPlans) {
            this.scalingPlans.add(ele);
        }
        return this;
    }

    /**
     * @param scalingPlans
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeScalingPlansResult withScalingPlans(java.util.Collection<ScalingPlan> scalingPlans) {
        setScalingPlans(scalingPlans);
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

    public DescribeScalingPlansResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getScalingPlans() != null)
            sb.append("ScalingPlans: ").append(getScalingPlans()).append(",");
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

        if (obj instanceof DescribeScalingPlansResult == false)
            return false;
        DescribeScalingPlansResult other = (DescribeScalingPlansResult) obj;
        if (other.getScalingPlans() == null ^ this.getScalingPlans() == null)
            return false;
        if (other.getScalingPlans() != null && other.getScalingPlans().equals(this.getScalingPlans()) == false)
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

        hashCode = prime * hashCode + ((getScalingPlans() == null) ? 0 : getScalingPlans().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeScalingPlansResult clone() {
        try {
            return (DescribeScalingPlansResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
