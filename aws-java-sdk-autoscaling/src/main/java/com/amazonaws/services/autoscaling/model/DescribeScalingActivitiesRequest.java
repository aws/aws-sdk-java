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
package com.amazonaws.services.autoscaling.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/DescribeScalingActivities"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeScalingActivitiesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The activity IDs of the desired scaling activities. You can specify up to 50 IDs. If you omit this parameter, all
     * activities for the past six weeks are described. If unknown activities are requested, they are ignored with no
     * error. If you specify an Auto Scaling group, the results are limited to that group.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> activityIds;
    /**
     * <p>
     * The name of the Auto Scaling group.
     * </p>
     */
    private String autoScalingGroupName;
    /**
     * <p>
     * The maximum number of items to return with this call. The default value is <code>100</code> and the maximum value
     * is <code>100</code>.
     * </p>
     */
    private Integer maxRecords;
    /**
     * <p>
     * The token for the next set of items to return. (You received this token from a previous call.)
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The activity IDs of the desired scaling activities. You can specify up to 50 IDs. If you omit this parameter, all
     * activities for the past six weeks are described. If unknown activities are requested, they are ignored with no
     * error. If you specify an Auto Scaling group, the results are limited to that group.
     * </p>
     * 
     * @return The activity IDs of the desired scaling activities. You can specify up to 50 IDs. If you omit this
     *         parameter, all activities for the past six weeks are described. If unknown activities are requested, they
     *         are ignored with no error. If you specify an Auto Scaling group, the results are limited to that group.
     */

    public java.util.List<String> getActivityIds() {
        if (activityIds == null) {
            activityIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return activityIds;
    }

    /**
     * <p>
     * The activity IDs of the desired scaling activities. You can specify up to 50 IDs. If you omit this parameter, all
     * activities for the past six weeks are described. If unknown activities are requested, they are ignored with no
     * error. If you specify an Auto Scaling group, the results are limited to that group.
     * </p>
     * 
     * @param activityIds
     *        The activity IDs of the desired scaling activities. You can specify up to 50 IDs. If you omit this
     *        parameter, all activities for the past six weeks are described. If unknown activities are requested, they
     *        are ignored with no error. If you specify an Auto Scaling group, the results are limited to that group.
     */

    public void setActivityIds(java.util.Collection<String> activityIds) {
        if (activityIds == null) {
            this.activityIds = null;
            return;
        }

        this.activityIds = new com.amazonaws.internal.SdkInternalList<String>(activityIds);
    }

    /**
     * <p>
     * The activity IDs of the desired scaling activities. You can specify up to 50 IDs. If you omit this parameter, all
     * activities for the past six weeks are described. If unknown activities are requested, they are ignored with no
     * error. If you specify an Auto Scaling group, the results are limited to that group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setActivityIds(java.util.Collection)} or {@link #withActivityIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param activityIds
     *        The activity IDs of the desired scaling activities. You can specify up to 50 IDs. If you omit this
     *        parameter, all activities for the past six weeks are described. If unknown activities are requested, they
     *        are ignored with no error. If you specify an Auto Scaling group, the results are limited to that group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeScalingActivitiesRequest withActivityIds(String... activityIds) {
        if (this.activityIds == null) {
            setActivityIds(new com.amazonaws.internal.SdkInternalList<String>(activityIds.length));
        }
        for (String ele : activityIds) {
            this.activityIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The activity IDs of the desired scaling activities. You can specify up to 50 IDs. If you omit this parameter, all
     * activities for the past six weeks are described. If unknown activities are requested, they are ignored with no
     * error. If you specify an Auto Scaling group, the results are limited to that group.
     * </p>
     * 
     * @param activityIds
     *        The activity IDs of the desired scaling activities. You can specify up to 50 IDs. If you omit this
     *        parameter, all activities for the past six weeks are described. If unknown activities are requested, they
     *        are ignored with no error. If you specify an Auto Scaling group, the results are limited to that group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeScalingActivitiesRequest withActivityIds(java.util.Collection<String> activityIds) {
        setActivityIds(activityIds);
        return this;
    }

    /**
     * <p>
     * The name of the Auto Scaling group.
     * </p>
     * 
     * @param autoScalingGroupName
     *        The name of the Auto Scaling group.
     */

    public void setAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
    }

    /**
     * <p>
     * The name of the Auto Scaling group.
     * </p>
     * 
     * @return The name of the Auto Scaling group.
     */

    public String getAutoScalingGroupName() {
        return this.autoScalingGroupName;
    }

    /**
     * <p>
     * The name of the Auto Scaling group.
     * </p>
     * 
     * @param autoScalingGroupName
     *        The name of the Auto Scaling group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeScalingActivitiesRequest withAutoScalingGroupName(String autoScalingGroupName) {
        setAutoScalingGroupName(autoScalingGroupName);
        return this;
    }

    /**
     * <p>
     * The maximum number of items to return with this call. The default value is <code>100</code> and the maximum value
     * is <code>100</code>.
     * </p>
     * 
     * @param maxRecords
     *        The maximum number of items to return with this call. The default value is <code>100</code> and the
     *        maximum value is <code>100</code>.
     */

    public void setMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
    }

    /**
     * <p>
     * The maximum number of items to return with this call. The default value is <code>100</code> and the maximum value
     * is <code>100</code>.
     * </p>
     * 
     * @return The maximum number of items to return with this call. The default value is <code>100</code> and the
     *         maximum value is <code>100</code>.
     */

    public Integer getMaxRecords() {
        return this.maxRecords;
    }

    /**
     * <p>
     * The maximum number of items to return with this call. The default value is <code>100</code> and the maximum value
     * is <code>100</code>.
     * </p>
     * 
     * @param maxRecords
     *        The maximum number of items to return with this call. The default value is <code>100</code> and the
     *        maximum value is <code>100</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeScalingActivitiesRequest withMaxRecords(Integer maxRecords) {
        setMaxRecords(maxRecords);
        return this;
    }

    /**
     * <p>
     * The token for the next set of items to return. (You received this token from a previous call.)
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of items to return. (You received this token from a previous call.)
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of items to return. (You received this token from a previous call.)
     * </p>
     * 
     * @return The token for the next set of items to return. (You received this token from a previous call.)
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of items to return. (You received this token from a previous call.)
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of items to return. (You received this token from a previous call.)
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeScalingActivitiesRequest withNextToken(String nextToken) {
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
        if (getActivityIds() != null)
            sb.append("ActivityIds: ").append(getActivityIds()).append(",");
        if (getAutoScalingGroupName() != null)
            sb.append("AutoScalingGroupName: ").append(getAutoScalingGroupName()).append(",");
        if (getMaxRecords() != null)
            sb.append("MaxRecords: ").append(getMaxRecords()).append(",");
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

        if (obj instanceof DescribeScalingActivitiesRequest == false)
            return false;
        DescribeScalingActivitiesRequest other = (DescribeScalingActivitiesRequest) obj;
        if (other.getActivityIds() == null ^ this.getActivityIds() == null)
            return false;
        if (other.getActivityIds() != null && other.getActivityIds().equals(this.getActivityIds()) == false)
            return false;
        if (other.getAutoScalingGroupName() == null ^ this.getAutoScalingGroupName() == null)
            return false;
        if (other.getAutoScalingGroupName() != null && other.getAutoScalingGroupName().equals(this.getAutoScalingGroupName()) == false)
            return false;
        if (other.getMaxRecords() == null ^ this.getMaxRecords() == null)
            return false;
        if (other.getMaxRecords() != null && other.getMaxRecords().equals(this.getMaxRecords()) == false)
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

        hashCode = prime * hashCode + ((getActivityIds() == null) ? 0 : getActivityIds().hashCode());
        hashCode = prime * hashCode + ((getAutoScalingGroupName() == null) ? 0 : getAutoScalingGroupName().hashCode());
        hashCode = prime * hashCode + ((getMaxRecords() == null) ? 0 : getMaxRecords().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeScalingActivitiesRequest clone() {
        return (DescribeScalingActivitiesRequest) super.clone();
    }

}
