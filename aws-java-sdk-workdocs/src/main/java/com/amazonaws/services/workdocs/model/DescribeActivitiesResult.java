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
package com.amazonaws.services.workdocs.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/DescribeActivities" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeActivitiesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The list of activities for the specified user and time period.
     * </p>
     */
    private java.util.List<Activity> userActivities;
    /**
     * <p>
     * The marker for the next set of results.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * The list of activities for the specified user and time period.
     * </p>
     * 
     * @return The list of activities for the specified user and time period.
     */

    public java.util.List<Activity> getUserActivities() {
        return userActivities;
    }

    /**
     * <p>
     * The list of activities for the specified user and time period.
     * </p>
     * 
     * @param userActivities
     *        The list of activities for the specified user and time period.
     */

    public void setUserActivities(java.util.Collection<Activity> userActivities) {
        if (userActivities == null) {
            this.userActivities = null;
            return;
        }

        this.userActivities = new java.util.ArrayList<Activity>(userActivities);
    }

    /**
     * <p>
     * The list of activities for the specified user and time period.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUserActivities(java.util.Collection)} or {@link #withUserActivities(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param userActivities
     *        The list of activities for the specified user and time period.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeActivitiesResult withUserActivities(Activity... userActivities) {
        if (this.userActivities == null) {
            setUserActivities(new java.util.ArrayList<Activity>(userActivities.length));
        }
        for (Activity ele : userActivities) {
            this.userActivities.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of activities for the specified user and time period.
     * </p>
     * 
     * @param userActivities
     *        The list of activities for the specified user and time period.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeActivitiesResult withUserActivities(java.util.Collection<Activity> userActivities) {
        setUserActivities(userActivities);
        return this;
    }

    /**
     * <p>
     * The marker for the next set of results.
     * </p>
     * 
     * @param marker
     *        The marker for the next set of results.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * The marker for the next set of results.
     * </p>
     * 
     * @return The marker for the next set of results.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * The marker for the next set of results.
     * </p>
     * 
     * @param marker
     *        The marker for the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeActivitiesResult withMarker(String marker) {
        setMarker(marker);
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
        if (getUserActivities() != null)
            sb.append("UserActivities: ").append(getUserActivities()).append(",");
        if (getMarker() != null)
            sb.append("Marker: ").append(getMarker());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeActivitiesResult == false)
            return false;
        DescribeActivitiesResult other = (DescribeActivitiesResult) obj;
        if (other.getUserActivities() == null ^ this.getUserActivities() == null)
            return false;
        if (other.getUserActivities() != null && other.getUserActivities().equals(this.getUserActivities()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserActivities() == null) ? 0 : getUserActivities().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        return hashCode;
    }

    @Override
    public DescribeActivitiesResult clone() {
        try {
            return (DescribeActivitiesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
