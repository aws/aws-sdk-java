/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.imagebuilder.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Defines criteria to exclude AMIs from lifecycle actions based on the last time they were used to launch an instance.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/LifecyclePolicyDetailExclusionRulesAmisLastLaunched"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LifecyclePolicyDetailExclusionRulesAmisLastLaunched implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The integer number of units for the time period. For example <code>6</code> (months).
     * </p>
     */
    private Integer value;
    /**
     * <p>
     * Defines the unit of time that the lifecycle policy uses to calculate elapsed time since the last instance
     * launched from the AMI. For example: days, weeks, months, or years.
     * </p>
     */
    private String unit;

    /**
     * <p>
     * The integer number of units for the time period. For example <code>6</code> (months).
     * </p>
     * 
     * @param value
     *        The integer number of units for the time period. For example <code>6</code> (months).
     */

    public void setValue(Integer value) {
        this.value = value;
    }

    /**
     * <p>
     * The integer number of units for the time period. For example <code>6</code> (months).
     * </p>
     * 
     * @return The integer number of units for the time period. For example <code>6</code> (months).
     */

    public Integer getValue() {
        return this.value;
    }

    /**
     * <p>
     * The integer number of units for the time period. For example <code>6</code> (months).
     * </p>
     * 
     * @param value
     *        The integer number of units for the time period. For example <code>6</code> (months).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LifecyclePolicyDetailExclusionRulesAmisLastLaunched withValue(Integer value) {
        setValue(value);
        return this;
    }

    /**
     * <p>
     * Defines the unit of time that the lifecycle policy uses to calculate elapsed time since the last instance
     * launched from the AMI. For example: days, weeks, months, or years.
     * </p>
     * 
     * @param unit
     *        Defines the unit of time that the lifecycle policy uses to calculate elapsed time since the last instance
     *        launched from the AMI. For example: days, weeks, months, or years.
     * @see LifecyclePolicyTimeUnit
     */

    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * <p>
     * Defines the unit of time that the lifecycle policy uses to calculate elapsed time since the last instance
     * launched from the AMI. For example: days, weeks, months, or years.
     * </p>
     * 
     * @return Defines the unit of time that the lifecycle policy uses to calculate elapsed time since the last instance
     *         launched from the AMI. For example: days, weeks, months, or years.
     * @see LifecyclePolicyTimeUnit
     */

    public String getUnit() {
        return this.unit;
    }

    /**
     * <p>
     * Defines the unit of time that the lifecycle policy uses to calculate elapsed time since the last instance
     * launched from the AMI. For example: days, weeks, months, or years.
     * </p>
     * 
     * @param unit
     *        Defines the unit of time that the lifecycle policy uses to calculate elapsed time since the last instance
     *        launched from the AMI. For example: days, weeks, months, or years.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LifecyclePolicyTimeUnit
     */

    public LifecyclePolicyDetailExclusionRulesAmisLastLaunched withUnit(String unit) {
        setUnit(unit);
        return this;
    }

    /**
     * <p>
     * Defines the unit of time that the lifecycle policy uses to calculate elapsed time since the last instance
     * launched from the AMI. For example: days, weeks, months, or years.
     * </p>
     * 
     * @param unit
     *        Defines the unit of time that the lifecycle policy uses to calculate elapsed time since the last instance
     *        launched from the AMI. For example: days, weeks, months, or years.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LifecyclePolicyTimeUnit
     */

    public LifecyclePolicyDetailExclusionRulesAmisLastLaunched withUnit(LifecyclePolicyTimeUnit unit) {
        this.unit = unit.toString();
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
        if (getValue() != null)
            sb.append("Value: ").append(getValue()).append(",");
        if (getUnit() != null)
            sb.append("Unit: ").append(getUnit());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LifecyclePolicyDetailExclusionRulesAmisLastLaunched == false)
            return false;
        LifecyclePolicyDetailExclusionRulesAmisLastLaunched other = (LifecyclePolicyDetailExclusionRulesAmisLastLaunched) obj;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getUnit() == null ^ this.getUnit() == null)
            return false;
        if (other.getUnit() != null && other.getUnit().equals(this.getUnit()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getUnit() == null) ? 0 : getUnit().hashCode());
        return hashCode;
    }

    @Override
    public LifecyclePolicyDetailExclusionRulesAmisLastLaunched clone() {
        try {
            return (LifecyclePolicyDetailExclusionRulesAmisLastLaunched) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.imagebuilder.model.transform.LifecyclePolicyDetailExclusionRulesAmisLastLaunchedMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
