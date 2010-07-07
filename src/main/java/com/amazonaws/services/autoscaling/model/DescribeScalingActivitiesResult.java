/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.autoscaling.model;

/**
 * <p>
 * 
 * </p>
 */
public class DescribeScalingActivitiesResult {

    /**
     * A list of the requested scaling activities.
     */
    private java.util.List<Activity> activities;

    /**
     * Acts as a paging mechanism for large result sets. Set to a non-empty
     * string if there are additional results waiting to be returned. Pass
     * this in to subsequent calls to return additional results.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String nextToken;

    /**
     * A list of the requested scaling activities.
     *
     * @return A list of the requested scaling activities.
     */
    public java.util.List<Activity> getActivities() {
        if (activities == null) {
            activities = new java.util.ArrayList<Activity>();
        }
        return activities;
    }
    
    /**
     * A list of the requested scaling activities.
     *
     * @param activities A list of the requested scaling activities.
     */
    public void setActivities(java.util.Collection<Activity> activities) {
        java.util.List<Activity> activitiesCopy = new java.util.ArrayList<Activity>();
        if (activities != null) {
            activitiesCopy.addAll(activities);
        }
        this.activities = activitiesCopy;
    }
    
    /**
     * A list of the requested scaling activities.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param activities A list of the requested scaling activities.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeScalingActivitiesResult withActivities(Activity... activities) {
        for (Activity value : activities) {
            getActivities().add(value);
        }
        return this;
    }
    
    /**
     * A list of the requested scaling activities.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param activities A list of the requested scaling activities.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeScalingActivitiesResult withActivities(java.util.Collection<Activity> activities) {
        java.util.List<Activity> activitiesCopy = new java.util.ArrayList<Activity>();
        if (activities != null) {
            activitiesCopy.addAll(activities);
        }
        this.activities = activitiesCopy;

        return this;
    }
    
    /**
     * Acts as a paging mechanism for large result sets. Set to a non-empty
     * string if there are additional results waiting to be returned. Pass
     * this in to subsequent calls to return additional results.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return Acts as a paging mechanism for large result sets. Set to a non-empty
     *         string if there are additional results waiting to be returned. Pass
     *         this in to subsequent calls to return additional results.
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * Acts as a paging mechanism for large result sets. Set to a non-empty
     * string if there are additional results waiting to be returned. Pass
     * this in to subsequent calls to return additional results.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param nextToken Acts as a paging mechanism for large result sets. Set to a non-empty
     *         string if there are additional results waiting to be returned. Pass
     *         this in to subsequent calls to return additional results.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * Acts as a paging mechanism for large result sets. Set to a non-empty
     * string if there are additional results waiting to be returned. Pass
     * this in to subsequent calls to return additional results.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param nextToken Acts as a paging mechanism for large result sets. Set to a non-empty
     *         string if there are additional results waiting to be returned. Pass
     *         this in to subsequent calls to return additional results.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeScalingActivitiesResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    
    
    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        sb.append("Activities: " + activities + ", ");
        sb.append("NextToken: " + nextToken + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    