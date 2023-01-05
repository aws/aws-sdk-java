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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The liner axis scale setup.
 * </p>
 * <p>
 * This is a union type structure. For this structure to be valid, only one of the attributes can be defined.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/AxisLinearScale" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AxisLinearScale implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The step count setup of a linear axis.
     * </p>
     */
    private Integer stepCount;
    /**
     * <p>
     * The step size setup of a linear axis.
     * </p>
     */
    private Double stepSize;

    /**
     * <p>
     * The step count setup of a linear axis.
     * </p>
     * 
     * @param stepCount
     *        The step count setup of a linear axis.
     */

    public void setStepCount(Integer stepCount) {
        this.stepCount = stepCount;
    }

    /**
     * <p>
     * The step count setup of a linear axis.
     * </p>
     * 
     * @return The step count setup of a linear axis.
     */

    public Integer getStepCount() {
        return this.stepCount;
    }

    /**
     * <p>
     * The step count setup of a linear axis.
     * </p>
     * 
     * @param stepCount
     *        The step count setup of a linear axis.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AxisLinearScale withStepCount(Integer stepCount) {
        setStepCount(stepCount);
        return this;
    }

    /**
     * <p>
     * The step size setup of a linear axis.
     * </p>
     * 
     * @param stepSize
     *        The step size setup of a linear axis.
     */

    public void setStepSize(Double stepSize) {
        this.stepSize = stepSize;
    }

    /**
     * <p>
     * The step size setup of a linear axis.
     * </p>
     * 
     * @return The step size setup of a linear axis.
     */

    public Double getStepSize() {
        return this.stepSize;
    }

    /**
     * <p>
     * The step size setup of a linear axis.
     * </p>
     * 
     * @param stepSize
     *        The step size setup of a linear axis.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AxisLinearScale withStepSize(Double stepSize) {
        setStepSize(stepSize);
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
        if (getStepCount() != null)
            sb.append("StepCount: ").append(getStepCount()).append(",");
        if (getStepSize() != null)
            sb.append("StepSize: ").append(getStepSize());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AxisLinearScale == false)
            return false;
        AxisLinearScale other = (AxisLinearScale) obj;
        if (other.getStepCount() == null ^ this.getStepCount() == null)
            return false;
        if (other.getStepCount() != null && other.getStepCount().equals(this.getStepCount()) == false)
            return false;
        if (other.getStepSize() == null ^ this.getStepSize() == null)
            return false;
        if (other.getStepSize() != null && other.getStepSize().equals(this.getStepSize()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStepCount() == null) ? 0 : getStepCount().hashCode());
        hashCode = prime * hashCode + ((getStepSize() == null) ? 0 : getStepSize().hashCode());
        return hashCode;
    }

    @Override
    public AxisLinearScale clone() {
        try {
            return (AxisLinearScale) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.AxisLinearScaleMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
