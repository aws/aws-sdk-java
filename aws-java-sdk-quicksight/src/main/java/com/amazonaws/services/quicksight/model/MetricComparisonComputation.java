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
 * The metric comparison computation configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/MetricComparisonComputation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MetricComparisonComputation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID for a computation.
     * </p>
     */
    private String computationId;
    /**
     * <p>
     * The name of a computation.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The time field that is used in a computation.
     * </p>
     */
    private DimensionField time;
    /**
     * <p>
     * The field that is used in a metric comparison from value setup.
     * </p>
     */
    private MeasureField fromValue;
    /**
     * <p>
     * The field that is used in a metric comparison to value setup.
     * </p>
     */
    private MeasureField targetValue;

    /**
     * <p>
     * The ID for a computation.
     * </p>
     * 
     * @param computationId
     *        The ID for a computation.
     */

    public void setComputationId(String computationId) {
        this.computationId = computationId;
    }

    /**
     * <p>
     * The ID for a computation.
     * </p>
     * 
     * @return The ID for a computation.
     */

    public String getComputationId() {
        return this.computationId;
    }

    /**
     * <p>
     * The ID for a computation.
     * </p>
     * 
     * @param computationId
     *        The ID for a computation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricComparisonComputation withComputationId(String computationId) {
        setComputationId(computationId);
        return this;
    }

    /**
     * <p>
     * The name of a computation.
     * </p>
     * 
     * @param name
     *        The name of a computation.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of a computation.
     * </p>
     * 
     * @return The name of a computation.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of a computation.
     * </p>
     * 
     * @param name
     *        The name of a computation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricComparisonComputation withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The time field that is used in a computation.
     * </p>
     * 
     * @param time
     *        The time field that is used in a computation.
     */

    public void setTime(DimensionField time) {
        this.time = time;
    }

    /**
     * <p>
     * The time field that is used in a computation.
     * </p>
     * 
     * @return The time field that is used in a computation.
     */

    public DimensionField getTime() {
        return this.time;
    }

    /**
     * <p>
     * The time field that is used in a computation.
     * </p>
     * 
     * @param time
     *        The time field that is used in a computation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricComparisonComputation withTime(DimensionField time) {
        setTime(time);
        return this;
    }

    /**
     * <p>
     * The field that is used in a metric comparison from value setup.
     * </p>
     * 
     * @param fromValue
     *        The field that is used in a metric comparison from value setup.
     */

    public void setFromValue(MeasureField fromValue) {
        this.fromValue = fromValue;
    }

    /**
     * <p>
     * The field that is used in a metric comparison from value setup.
     * </p>
     * 
     * @return The field that is used in a metric comparison from value setup.
     */

    public MeasureField getFromValue() {
        return this.fromValue;
    }

    /**
     * <p>
     * The field that is used in a metric comparison from value setup.
     * </p>
     * 
     * @param fromValue
     *        The field that is used in a metric comparison from value setup.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricComparisonComputation withFromValue(MeasureField fromValue) {
        setFromValue(fromValue);
        return this;
    }

    /**
     * <p>
     * The field that is used in a metric comparison to value setup.
     * </p>
     * 
     * @param targetValue
     *        The field that is used in a metric comparison to value setup.
     */

    public void setTargetValue(MeasureField targetValue) {
        this.targetValue = targetValue;
    }

    /**
     * <p>
     * The field that is used in a metric comparison to value setup.
     * </p>
     * 
     * @return The field that is used in a metric comparison to value setup.
     */

    public MeasureField getTargetValue() {
        return this.targetValue;
    }

    /**
     * <p>
     * The field that is used in a metric comparison to value setup.
     * </p>
     * 
     * @param targetValue
     *        The field that is used in a metric comparison to value setup.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricComparisonComputation withTargetValue(MeasureField targetValue) {
        setTargetValue(targetValue);
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
        if (getComputationId() != null)
            sb.append("ComputationId: ").append(getComputationId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getTime() != null)
            sb.append("Time: ").append(getTime()).append(",");
        if (getFromValue() != null)
            sb.append("FromValue: ").append(getFromValue()).append(",");
        if (getTargetValue() != null)
            sb.append("TargetValue: ").append(getTargetValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MetricComparisonComputation == false)
            return false;
        MetricComparisonComputation other = (MetricComparisonComputation) obj;
        if (other.getComputationId() == null ^ this.getComputationId() == null)
            return false;
        if (other.getComputationId() != null && other.getComputationId().equals(this.getComputationId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getTime() == null ^ this.getTime() == null)
            return false;
        if (other.getTime() != null && other.getTime().equals(this.getTime()) == false)
            return false;
        if (other.getFromValue() == null ^ this.getFromValue() == null)
            return false;
        if (other.getFromValue() != null && other.getFromValue().equals(this.getFromValue()) == false)
            return false;
        if (other.getTargetValue() == null ^ this.getTargetValue() == null)
            return false;
        if (other.getTargetValue() != null && other.getTargetValue().equals(this.getTargetValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getComputationId() == null) ? 0 : getComputationId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getTime() == null) ? 0 : getTime().hashCode());
        hashCode = prime * hashCode + ((getFromValue() == null) ? 0 : getFromValue().hashCode());
        hashCode = prime * hashCode + ((getTargetValue() == null) ? 0 : getTargetValue().hashCode());
        return hashCode;
    }

    @Override
    public MetricComparisonComputation clone() {
        try {
            return (MetricComparisonComputation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.MetricComparisonComputationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
