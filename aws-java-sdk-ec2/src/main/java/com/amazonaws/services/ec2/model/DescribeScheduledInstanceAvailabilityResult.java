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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceResult;

/**
 * <p>
 * Contains the output of DescribeScheduledInstanceAvailability.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeScheduledInstanceAvailabilityResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The token required to retrieve the next set of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Information about the available Scheduled Instances.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ScheduledInstanceAvailability> scheduledInstanceAvailabilitySet;

    /**
     * <p>
     * The token required to retrieve the next set of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     * 
     * @param nextToken
     *        The token required to retrieve the next set of results. This value is <code>null</code> when there are no
     *        more results to return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token required to retrieve the next set of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     * 
     * @return The token required to retrieve the next set of results. This value is <code>null</code> when there are no
     *         more results to return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token required to retrieve the next set of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     * 
     * @param nextToken
     *        The token required to retrieve the next set of results. This value is <code>null</code> when there are no
     *        more results to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeScheduledInstanceAvailabilityResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Information about the available Scheduled Instances.
     * </p>
     * 
     * @return Information about the available Scheduled Instances.
     */

    public java.util.List<ScheduledInstanceAvailability> getScheduledInstanceAvailabilitySet() {
        if (scheduledInstanceAvailabilitySet == null) {
            scheduledInstanceAvailabilitySet = new com.amazonaws.internal.SdkInternalList<ScheduledInstanceAvailability>();
        }
        return scheduledInstanceAvailabilitySet;
    }

    /**
     * <p>
     * Information about the available Scheduled Instances.
     * </p>
     * 
     * @param scheduledInstanceAvailabilitySet
     *        Information about the available Scheduled Instances.
     */

    public void setScheduledInstanceAvailabilitySet(java.util.Collection<ScheduledInstanceAvailability> scheduledInstanceAvailabilitySet) {
        if (scheduledInstanceAvailabilitySet == null) {
            this.scheduledInstanceAvailabilitySet = null;
            return;
        }

        this.scheduledInstanceAvailabilitySet = new com.amazonaws.internal.SdkInternalList<ScheduledInstanceAvailability>(scheduledInstanceAvailabilitySet);
    }

    /**
     * <p>
     * Information about the available Scheduled Instances.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setScheduledInstanceAvailabilitySet(java.util.Collection)} or
     * {@link #withScheduledInstanceAvailabilitySet(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param scheduledInstanceAvailabilitySet
     *        Information about the available Scheduled Instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeScheduledInstanceAvailabilityResult withScheduledInstanceAvailabilitySet(ScheduledInstanceAvailability... scheduledInstanceAvailabilitySet) {
        if (this.scheduledInstanceAvailabilitySet == null) {
            setScheduledInstanceAvailabilitySet(new com.amazonaws.internal.SdkInternalList<ScheduledInstanceAvailability>(
                    scheduledInstanceAvailabilitySet.length));
        }
        for (ScheduledInstanceAvailability ele : scheduledInstanceAvailabilitySet) {
            this.scheduledInstanceAvailabilitySet.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the available Scheduled Instances.
     * </p>
     * 
     * @param scheduledInstanceAvailabilitySet
     *        Information about the available Scheduled Instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeScheduledInstanceAvailabilityResult withScheduledInstanceAvailabilitySet(
            java.util.Collection<ScheduledInstanceAvailability> scheduledInstanceAvailabilitySet) {
        setScheduledInstanceAvailabilitySet(scheduledInstanceAvailabilitySet);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getScheduledInstanceAvailabilitySet() != null)
            sb.append("ScheduledInstanceAvailabilitySet: ").append(getScheduledInstanceAvailabilitySet());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeScheduledInstanceAvailabilityResult == false)
            return false;
        DescribeScheduledInstanceAvailabilityResult other = (DescribeScheduledInstanceAvailabilityResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getScheduledInstanceAvailabilitySet() == null ^ this.getScheduledInstanceAvailabilitySet() == null)
            return false;
        if (other.getScheduledInstanceAvailabilitySet() != null
                && other.getScheduledInstanceAvailabilitySet().equals(this.getScheduledInstanceAvailabilitySet()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getScheduledInstanceAvailabilitySet() == null) ? 0 : getScheduledInstanceAvailabilitySet().hashCode());
        return hashCode;
    }

    @Override
    public DescribeScheduledInstanceAvailabilityResult clone() {
        try {
            return (DescribeScheduledInstanceAvailabilityResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
