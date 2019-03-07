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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/DescribeAutoScalingInstances"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeAutoScalingInstancesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The instances.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<AutoScalingInstanceDetails> autoScalingInstances;
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
     * The instances.
     * </p>
     * 
     * @return The instances.
     */

    public java.util.List<AutoScalingInstanceDetails> getAutoScalingInstances() {
        if (autoScalingInstances == null) {
            autoScalingInstances = new com.amazonaws.internal.SdkInternalList<AutoScalingInstanceDetails>();
        }
        return autoScalingInstances;
    }

    /**
     * <p>
     * The instances.
     * </p>
     * 
     * @param autoScalingInstances
     *        The instances.
     */

    public void setAutoScalingInstances(java.util.Collection<AutoScalingInstanceDetails> autoScalingInstances) {
        if (autoScalingInstances == null) {
            this.autoScalingInstances = null;
            return;
        }

        this.autoScalingInstances = new com.amazonaws.internal.SdkInternalList<AutoScalingInstanceDetails>(autoScalingInstances);
    }

    /**
     * <p>
     * The instances.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAutoScalingInstances(java.util.Collection)} or {@link #withAutoScalingInstances(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param autoScalingInstances
     *        The instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAutoScalingInstancesResult withAutoScalingInstances(AutoScalingInstanceDetails... autoScalingInstances) {
        if (this.autoScalingInstances == null) {
            setAutoScalingInstances(new com.amazonaws.internal.SdkInternalList<AutoScalingInstanceDetails>(autoScalingInstances.length));
        }
        for (AutoScalingInstanceDetails ele : autoScalingInstances) {
            this.autoScalingInstances.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The instances.
     * </p>
     * 
     * @param autoScalingInstances
     *        The instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAutoScalingInstancesResult withAutoScalingInstances(java.util.Collection<AutoScalingInstanceDetails> autoScalingInstances) {
        setAutoScalingInstances(autoScalingInstances);
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

    public DescribeAutoScalingInstancesResult withNextToken(String nextToken) {
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
        if (getAutoScalingInstances() != null)
            sb.append("AutoScalingInstances: ").append(getAutoScalingInstances()).append(",");
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

        if (obj instanceof DescribeAutoScalingInstancesResult == false)
            return false;
        DescribeAutoScalingInstancesResult other = (DescribeAutoScalingInstancesResult) obj;
        if (other.getAutoScalingInstances() == null ^ this.getAutoScalingInstances() == null)
            return false;
        if (other.getAutoScalingInstances() != null && other.getAutoScalingInstances().equals(this.getAutoScalingInstances()) == false)
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

        hashCode = prime * hashCode + ((getAutoScalingInstances() == null) ? 0 : getAutoScalingInstances().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeAutoScalingInstancesResult clone() {
        try {
            return (DescribeAutoScalingInstancesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
