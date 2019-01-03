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
package com.amazonaws.services.opsworks.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Contains the response to a <code>DescribeTimeBasedAutoScaling</code> request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/DescribeTimeBasedAutoScaling"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeTimeBasedAutoScalingResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of <code>TimeBasedAutoScalingConfiguration</code> objects that describe the configuration for the
     * specified instances.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<TimeBasedAutoScalingConfiguration> timeBasedAutoScalingConfigurations;

    /**
     * <p>
     * An array of <code>TimeBasedAutoScalingConfiguration</code> objects that describe the configuration for the
     * specified instances.
     * </p>
     * 
     * @return An array of <code>TimeBasedAutoScalingConfiguration</code> objects that describe the configuration for
     *         the specified instances.
     */

    public java.util.List<TimeBasedAutoScalingConfiguration> getTimeBasedAutoScalingConfigurations() {
        if (timeBasedAutoScalingConfigurations == null) {
            timeBasedAutoScalingConfigurations = new com.amazonaws.internal.SdkInternalList<TimeBasedAutoScalingConfiguration>();
        }
        return timeBasedAutoScalingConfigurations;
    }

    /**
     * <p>
     * An array of <code>TimeBasedAutoScalingConfiguration</code> objects that describe the configuration for the
     * specified instances.
     * </p>
     * 
     * @param timeBasedAutoScalingConfigurations
     *        An array of <code>TimeBasedAutoScalingConfiguration</code> objects that describe the configuration for the
     *        specified instances.
     */

    public void setTimeBasedAutoScalingConfigurations(java.util.Collection<TimeBasedAutoScalingConfiguration> timeBasedAutoScalingConfigurations) {
        if (timeBasedAutoScalingConfigurations == null) {
            this.timeBasedAutoScalingConfigurations = null;
            return;
        }

        this.timeBasedAutoScalingConfigurations = new com.amazonaws.internal.SdkInternalList<TimeBasedAutoScalingConfiguration>(
                timeBasedAutoScalingConfigurations);
    }

    /**
     * <p>
     * An array of <code>TimeBasedAutoScalingConfiguration</code> objects that describe the configuration for the
     * specified instances.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTimeBasedAutoScalingConfigurations(java.util.Collection)} or
     * {@link #withTimeBasedAutoScalingConfigurations(java.util.Collection)} if you want to override the existing
     * values.
     * </p>
     * 
     * @param timeBasedAutoScalingConfigurations
     *        An array of <code>TimeBasedAutoScalingConfiguration</code> objects that describe the configuration for the
     *        specified instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTimeBasedAutoScalingResult withTimeBasedAutoScalingConfigurations(TimeBasedAutoScalingConfiguration... timeBasedAutoScalingConfigurations) {
        if (this.timeBasedAutoScalingConfigurations == null) {
            setTimeBasedAutoScalingConfigurations(new com.amazonaws.internal.SdkInternalList<TimeBasedAutoScalingConfiguration>(
                    timeBasedAutoScalingConfigurations.length));
        }
        for (TimeBasedAutoScalingConfiguration ele : timeBasedAutoScalingConfigurations) {
            this.timeBasedAutoScalingConfigurations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>TimeBasedAutoScalingConfiguration</code> objects that describe the configuration for the
     * specified instances.
     * </p>
     * 
     * @param timeBasedAutoScalingConfigurations
     *        An array of <code>TimeBasedAutoScalingConfiguration</code> objects that describe the configuration for the
     *        specified instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTimeBasedAutoScalingResult withTimeBasedAutoScalingConfigurations(
            java.util.Collection<TimeBasedAutoScalingConfiguration> timeBasedAutoScalingConfigurations) {
        setTimeBasedAutoScalingConfigurations(timeBasedAutoScalingConfigurations);
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
        if (getTimeBasedAutoScalingConfigurations() != null)
            sb.append("TimeBasedAutoScalingConfigurations: ").append(getTimeBasedAutoScalingConfigurations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeTimeBasedAutoScalingResult == false)
            return false;
        DescribeTimeBasedAutoScalingResult other = (DescribeTimeBasedAutoScalingResult) obj;
        if (other.getTimeBasedAutoScalingConfigurations() == null ^ this.getTimeBasedAutoScalingConfigurations() == null)
            return false;
        if (other.getTimeBasedAutoScalingConfigurations() != null
                && other.getTimeBasedAutoScalingConfigurations().equals(this.getTimeBasedAutoScalingConfigurations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTimeBasedAutoScalingConfigurations() == null) ? 0 : getTimeBasedAutoScalingConfigurations().hashCode());
        return hashCode;
    }

    @Override
    public DescribeTimeBasedAutoScalingResult clone() {
        try {
            return (DescribeTimeBasedAutoScalingResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
