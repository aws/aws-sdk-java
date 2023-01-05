/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudwatchevidently.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An array of structures that define the traffic allocation percentages among the feature variations during each step
 * of a launch. This also defines the start time of each step.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/ScheduledSplitsLaunchConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ScheduledSplitsLaunchConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An array of structures that define the traffic allocation percentages among the feature variations during each
     * step of the launch. This also defines the start time of each step.
     * </p>
     */
    private java.util.List<ScheduledSplitConfig> steps;

    /**
     * <p>
     * An array of structures that define the traffic allocation percentages among the feature variations during each
     * step of the launch. This also defines the start time of each step.
     * </p>
     * 
     * @return An array of structures that define the traffic allocation percentages among the feature variations during
     *         each step of the launch. This also defines the start time of each step.
     */

    public java.util.List<ScheduledSplitConfig> getSteps() {
        return steps;
    }

    /**
     * <p>
     * An array of structures that define the traffic allocation percentages among the feature variations during each
     * step of the launch. This also defines the start time of each step.
     * </p>
     * 
     * @param steps
     *        An array of structures that define the traffic allocation percentages among the feature variations during
     *        each step of the launch. This also defines the start time of each step.
     */

    public void setSteps(java.util.Collection<ScheduledSplitConfig> steps) {
        if (steps == null) {
            this.steps = null;
            return;
        }

        this.steps = new java.util.ArrayList<ScheduledSplitConfig>(steps);
    }

    /**
     * <p>
     * An array of structures that define the traffic allocation percentages among the feature variations during each
     * step of the launch. This also defines the start time of each step.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSteps(java.util.Collection)} or {@link #withSteps(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param steps
     *        An array of structures that define the traffic allocation percentages among the feature variations during
     *        each step of the launch. This also defines the start time of each step.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduledSplitsLaunchConfig withSteps(ScheduledSplitConfig... steps) {
        if (this.steps == null) {
            setSteps(new java.util.ArrayList<ScheduledSplitConfig>(steps.length));
        }
        for (ScheduledSplitConfig ele : steps) {
            this.steps.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of structures that define the traffic allocation percentages among the feature variations during each
     * step of the launch. This also defines the start time of each step.
     * </p>
     * 
     * @param steps
     *        An array of structures that define the traffic allocation percentages among the feature variations during
     *        each step of the launch. This also defines the start time of each step.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduledSplitsLaunchConfig withSteps(java.util.Collection<ScheduledSplitConfig> steps) {
        setSteps(steps);
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
        if (getSteps() != null)
            sb.append("Steps: ").append(getSteps());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ScheduledSplitsLaunchConfig == false)
            return false;
        ScheduledSplitsLaunchConfig other = (ScheduledSplitsLaunchConfig) obj;
        if (other.getSteps() == null ^ this.getSteps() == null)
            return false;
        if (other.getSteps() != null && other.getSteps().equals(this.getSteps()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSteps() == null) ? 0 : getSteps().hashCode());
        return hashCode;
    }

    @Override
    public ScheduledSplitsLaunchConfig clone() {
        try {
            return (ScheduledSplitsLaunchConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cloudwatchevidently.model.transform.ScheduledSplitsLaunchConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
