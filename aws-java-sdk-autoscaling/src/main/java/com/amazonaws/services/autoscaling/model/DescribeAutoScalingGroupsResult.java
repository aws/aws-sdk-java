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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/DescribeAutoScalingGroups"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeAutoScalingGroupsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The groups.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<AutoScalingGroup> autoScalingGroups;
    /**
     * <p>
     * A string that indicates that the response contains more items than can be returned in a single response. To
     * receive additional items, specify this string for the <code>NextToken</code> value when requesting the next set
     * of items. This value is null when there are no more items to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The groups.
     * </p>
     * 
     * @return The groups.
     */

    public java.util.List<AutoScalingGroup> getAutoScalingGroups() {
        if (autoScalingGroups == null) {
            autoScalingGroups = new com.amazonaws.internal.SdkInternalList<AutoScalingGroup>();
        }
        return autoScalingGroups;
    }

    /**
     * <p>
     * The groups.
     * </p>
     * 
     * @param autoScalingGroups
     *        The groups.
     */

    public void setAutoScalingGroups(java.util.Collection<AutoScalingGroup> autoScalingGroups) {
        if (autoScalingGroups == null) {
            this.autoScalingGroups = null;
            return;
        }

        this.autoScalingGroups = new com.amazonaws.internal.SdkInternalList<AutoScalingGroup>(autoScalingGroups);
    }

    /**
     * <p>
     * The groups.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAutoScalingGroups(java.util.Collection)} or {@link #withAutoScalingGroups(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param autoScalingGroups
     *        The groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAutoScalingGroupsResult withAutoScalingGroups(AutoScalingGroup... autoScalingGroups) {
        if (this.autoScalingGroups == null) {
            setAutoScalingGroups(new com.amazonaws.internal.SdkInternalList<AutoScalingGroup>(autoScalingGroups.length));
        }
        for (AutoScalingGroup ele : autoScalingGroups) {
            this.autoScalingGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The groups.
     * </p>
     * 
     * @param autoScalingGroups
     *        The groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAutoScalingGroupsResult withAutoScalingGroups(java.util.Collection<AutoScalingGroup> autoScalingGroups) {
        setAutoScalingGroups(autoScalingGroups);
        return this;
    }

    /**
     * <p>
     * A string that indicates that the response contains more items than can be returned in a single response. To
     * receive additional items, specify this string for the <code>NextToken</code> value when requesting the next set
     * of items. This value is null when there are no more items to return.
     * </p>
     * 
     * @param nextToken
     *        A string that indicates that the response contains more items than can be returned in a single response.
     *        To receive additional items, specify this string for the <code>NextToken</code> value when requesting the
     *        next set of items. This value is null when there are no more items to return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A string that indicates that the response contains more items than can be returned in a single response. To
     * receive additional items, specify this string for the <code>NextToken</code> value when requesting the next set
     * of items. This value is null when there are no more items to return.
     * </p>
     * 
     * @return A string that indicates that the response contains more items than can be returned in a single response.
     *         To receive additional items, specify this string for the <code>NextToken</code> value when requesting the
     *         next set of items. This value is null when there are no more items to return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A string that indicates that the response contains more items than can be returned in a single response. To
     * receive additional items, specify this string for the <code>NextToken</code> value when requesting the next set
     * of items. This value is null when there are no more items to return.
     * </p>
     * 
     * @param nextToken
     *        A string that indicates that the response contains more items than can be returned in a single response.
     *        To receive additional items, specify this string for the <code>NextToken</code> value when requesting the
     *        next set of items. This value is null when there are no more items to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAutoScalingGroupsResult withNextToken(String nextToken) {
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
        if (getAutoScalingGroups() != null)
            sb.append("AutoScalingGroups: ").append(getAutoScalingGroups()).append(",");
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

        if (obj instanceof DescribeAutoScalingGroupsResult == false)
            return false;
        DescribeAutoScalingGroupsResult other = (DescribeAutoScalingGroupsResult) obj;
        if (other.getAutoScalingGroups() == null ^ this.getAutoScalingGroups() == null)
            return false;
        if (other.getAutoScalingGroups() != null && other.getAutoScalingGroups().equals(this.getAutoScalingGroups()) == false)
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

        hashCode = prime * hashCode + ((getAutoScalingGroups() == null) ? 0 : getAutoScalingGroups().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeAutoScalingGroupsResult clone() {
        try {
            return (DescribeAutoScalingGroupsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
