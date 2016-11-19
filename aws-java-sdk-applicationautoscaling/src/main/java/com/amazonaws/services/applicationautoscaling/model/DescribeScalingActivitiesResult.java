/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.applicationautoscaling.model;

import java.io.Serializable;

/**
 * 
 */
public class DescribeScalingActivitiesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of scaling activity objects.
     * </p>
     */
    private java.util.List<ScalingActivity> scalingActivities;
    /**
     * <p>
     * The token required to get the next set of results. This value is <code>null</code> if there are no more results
     * to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of scaling activity objects.
     * </p>
     * 
     * @return A list of scaling activity objects.
     */

    public java.util.List<ScalingActivity> getScalingActivities() {
        return scalingActivities;
    }

    /**
     * <p>
     * A list of scaling activity objects.
     * </p>
     * 
     * @param scalingActivities
     *        A list of scaling activity objects.
     */

    public void setScalingActivities(java.util.Collection<ScalingActivity> scalingActivities) {
        if (scalingActivities == null) {
            this.scalingActivities = null;
            return;
        }

        this.scalingActivities = new java.util.ArrayList<ScalingActivity>(scalingActivities);
    }

    /**
     * <p>
     * A list of scaling activity objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setScalingActivities(java.util.Collection)} or {@link #withScalingActivities(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param scalingActivities
     *        A list of scaling activity objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeScalingActivitiesResult withScalingActivities(ScalingActivity... scalingActivities) {
        if (this.scalingActivities == null) {
            setScalingActivities(new java.util.ArrayList<ScalingActivity>(scalingActivities.length));
        }
        for (ScalingActivity ele : scalingActivities) {
            this.scalingActivities.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of scaling activity objects.
     * </p>
     * 
     * @param scalingActivities
     *        A list of scaling activity objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeScalingActivitiesResult withScalingActivities(java.util.Collection<ScalingActivity> scalingActivities) {
        setScalingActivities(scalingActivities);
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

    public DescribeScalingActivitiesResult withNextToken(String nextToken) {
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
        if (getScalingActivities() != null)
            sb.append("ScalingActivities: " + getScalingActivities() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeScalingActivitiesResult == false)
            return false;
        DescribeScalingActivitiesResult other = (DescribeScalingActivitiesResult) obj;
        if (other.getScalingActivities() == null ^ this.getScalingActivities() == null)
            return false;
        if (other.getScalingActivities() != null && other.getScalingActivities().equals(this.getScalingActivities()) == false)
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

        hashCode = prime * hashCode + ((getScalingActivities() == null) ? 0 : getScalingActivities().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeScalingActivitiesResult clone() {
        try {
            return (DescribeScalingActivitiesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
