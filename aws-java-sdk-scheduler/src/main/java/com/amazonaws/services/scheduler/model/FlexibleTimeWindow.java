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
package com.amazonaws.services.scheduler.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Allows you to configure a time window during which EventBridge Scheduler invokes the schedule.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/scheduler-2021-06-30/FlexibleTimeWindow" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FlexibleTimeWindow implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The maximum time window during which a schedule can be invoked.
     * </p>
     */
    private Integer maximumWindowInMinutes;
    /**
     * <p>
     * Determines whether the schedule is invoked within a flexible time window.
     * </p>
     */
    private String mode;

    /**
     * <p>
     * The maximum time window during which a schedule can be invoked.
     * </p>
     * 
     * @param maximumWindowInMinutes
     *        The maximum time window during which a schedule can be invoked.
     */

    public void setMaximumWindowInMinutes(Integer maximumWindowInMinutes) {
        this.maximumWindowInMinutes = maximumWindowInMinutes;
    }

    /**
     * <p>
     * The maximum time window during which a schedule can be invoked.
     * </p>
     * 
     * @return The maximum time window during which a schedule can be invoked.
     */

    public Integer getMaximumWindowInMinutes() {
        return this.maximumWindowInMinutes;
    }

    /**
     * <p>
     * The maximum time window during which a schedule can be invoked.
     * </p>
     * 
     * @param maximumWindowInMinutes
     *        The maximum time window during which a schedule can be invoked.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FlexibleTimeWindow withMaximumWindowInMinutes(Integer maximumWindowInMinutes) {
        setMaximumWindowInMinutes(maximumWindowInMinutes);
        return this;
    }

    /**
     * <p>
     * Determines whether the schedule is invoked within a flexible time window.
     * </p>
     * 
     * @param mode
     *        Determines whether the schedule is invoked within a flexible time window.
     * @see FlexibleTimeWindowMode
     */

    public void setMode(String mode) {
        this.mode = mode;
    }

    /**
     * <p>
     * Determines whether the schedule is invoked within a flexible time window.
     * </p>
     * 
     * @return Determines whether the schedule is invoked within a flexible time window.
     * @see FlexibleTimeWindowMode
     */

    public String getMode() {
        return this.mode;
    }

    /**
     * <p>
     * Determines whether the schedule is invoked within a flexible time window.
     * </p>
     * 
     * @param mode
     *        Determines whether the schedule is invoked within a flexible time window.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FlexibleTimeWindowMode
     */

    public FlexibleTimeWindow withMode(String mode) {
        setMode(mode);
        return this;
    }

    /**
     * <p>
     * Determines whether the schedule is invoked within a flexible time window.
     * </p>
     * 
     * @param mode
     *        Determines whether the schedule is invoked within a flexible time window.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FlexibleTimeWindowMode
     */

    public FlexibleTimeWindow withMode(FlexibleTimeWindowMode mode) {
        this.mode = mode.toString();
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
        if (getMaximumWindowInMinutes() != null)
            sb.append("MaximumWindowInMinutes: ").append(getMaximumWindowInMinutes()).append(",");
        if (getMode() != null)
            sb.append("Mode: ").append(getMode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FlexibleTimeWindow == false)
            return false;
        FlexibleTimeWindow other = (FlexibleTimeWindow) obj;
        if (other.getMaximumWindowInMinutes() == null ^ this.getMaximumWindowInMinutes() == null)
            return false;
        if (other.getMaximumWindowInMinutes() != null && other.getMaximumWindowInMinutes().equals(this.getMaximumWindowInMinutes()) == false)
            return false;
        if (other.getMode() == null ^ this.getMode() == null)
            return false;
        if (other.getMode() != null && other.getMode().equals(this.getMode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaximumWindowInMinutes() == null) ? 0 : getMaximumWindowInMinutes().hashCode());
        hashCode = prime * hashCode + ((getMode() == null) ? 0 : getMode().hashCode());
        return hashCode;
    }

    @Override
    public FlexibleTimeWindow clone() {
        try {
            return (FlexibleTimeWindow) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.scheduler.model.transform.FlexibleTimeWindowMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
