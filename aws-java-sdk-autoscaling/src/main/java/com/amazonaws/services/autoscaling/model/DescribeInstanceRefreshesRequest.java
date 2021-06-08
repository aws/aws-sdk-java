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
package com.amazonaws.services.autoscaling.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/DescribeInstanceRefreshes"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeInstanceRefreshesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the Auto Scaling group.
     * </p>
     */
    private String autoScalingGroupName;
    /**
     * <p>
     * One or more instance refresh IDs.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> instanceRefreshIds;
    /**
     * <p>
     * The token for the next set of items to return. (You received this token from a previous call.)
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of items to return with this call. The default value is <code>50</code> and the maximum value
     * is <code>100</code>.
     * </p>
     */
    private Integer maxRecords;

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

    public DescribeInstanceRefreshesRequest withAutoScalingGroupName(String autoScalingGroupName) {
        setAutoScalingGroupName(autoScalingGroupName);
        return this;
    }

    /**
     * <p>
     * One or more instance refresh IDs.
     * </p>
     * 
     * @return One or more instance refresh IDs.
     */

    public java.util.List<String> getInstanceRefreshIds() {
        if (instanceRefreshIds == null) {
            instanceRefreshIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return instanceRefreshIds;
    }

    /**
     * <p>
     * One or more instance refresh IDs.
     * </p>
     * 
     * @param instanceRefreshIds
     *        One or more instance refresh IDs.
     */

    public void setInstanceRefreshIds(java.util.Collection<String> instanceRefreshIds) {
        if (instanceRefreshIds == null) {
            this.instanceRefreshIds = null;
            return;
        }

        this.instanceRefreshIds = new com.amazonaws.internal.SdkInternalList<String>(instanceRefreshIds);
    }

    /**
     * <p>
     * One or more instance refresh IDs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInstanceRefreshIds(java.util.Collection)} or {@link #withInstanceRefreshIds(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param instanceRefreshIds
     *        One or more instance refresh IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInstanceRefreshesRequest withInstanceRefreshIds(String... instanceRefreshIds) {
        if (this.instanceRefreshIds == null) {
            setInstanceRefreshIds(new com.amazonaws.internal.SdkInternalList<String>(instanceRefreshIds.length));
        }
        for (String ele : instanceRefreshIds) {
            this.instanceRefreshIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more instance refresh IDs.
     * </p>
     * 
     * @param instanceRefreshIds
     *        One or more instance refresh IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInstanceRefreshesRequest withInstanceRefreshIds(java.util.Collection<String> instanceRefreshIds) {
        setInstanceRefreshIds(instanceRefreshIds);
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

    public DescribeInstanceRefreshesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of items to return with this call. The default value is <code>50</code> and the maximum value
     * is <code>100</code>.
     * </p>
     * 
     * @param maxRecords
     *        The maximum number of items to return with this call. The default value is <code>50</code> and the maximum
     *        value is <code>100</code>.
     */

    public void setMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
    }

    /**
     * <p>
     * The maximum number of items to return with this call. The default value is <code>50</code> and the maximum value
     * is <code>100</code>.
     * </p>
     * 
     * @return The maximum number of items to return with this call. The default value is <code>50</code> and the
     *         maximum value is <code>100</code>.
     */

    public Integer getMaxRecords() {
        return this.maxRecords;
    }

    /**
     * <p>
     * The maximum number of items to return with this call. The default value is <code>50</code> and the maximum value
     * is <code>100</code>.
     * </p>
     * 
     * @param maxRecords
     *        The maximum number of items to return with this call. The default value is <code>50</code> and the maximum
     *        value is <code>100</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInstanceRefreshesRequest withMaxRecords(Integer maxRecords) {
        setMaxRecords(maxRecords);
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
        if (getAutoScalingGroupName() != null)
            sb.append("AutoScalingGroupName: ").append(getAutoScalingGroupName()).append(",");
        if (getInstanceRefreshIds() != null)
            sb.append("InstanceRefreshIds: ").append(getInstanceRefreshIds()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxRecords() != null)
            sb.append("MaxRecords: ").append(getMaxRecords());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeInstanceRefreshesRequest == false)
            return false;
        DescribeInstanceRefreshesRequest other = (DescribeInstanceRefreshesRequest) obj;
        if (other.getAutoScalingGroupName() == null ^ this.getAutoScalingGroupName() == null)
            return false;
        if (other.getAutoScalingGroupName() != null && other.getAutoScalingGroupName().equals(this.getAutoScalingGroupName()) == false)
            return false;
        if (other.getInstanceRefreshIds() == null ^ this.getInstanceRefreshIds() == null)
            return false;
        if (other.getInstanceRefreshIds() != null && other.getInstanceRefreshIds().equals(this.getInstanceRefreshIds()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxRecords() == null ^ this.getMaxRecords() == null)
            return false;
        if (other.getMaxRecords() != null && other.getMaxRecords().equals(this.getMaxRecords()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAutoScalingGroupName() == null) ? 0 : getAutoScalingGroupName().hashCode());
        hashCode = prime * hashCode + ((getInstanceRefreshIds() == null) ? 0 : getInstanceRefreshIds().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxRecords() == null) ? 0 : getMaxRecords().hashCode());
        return hashCode;
    }

    @Override
    public DescribeInstanceRefreshesRequest clone() {
        return (DescribeInstanceRefreshesRequest) super.clone();
    }

}
