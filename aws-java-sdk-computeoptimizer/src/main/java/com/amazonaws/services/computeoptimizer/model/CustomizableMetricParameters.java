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
package com.amazonaws.services.computeoptimizer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Defines the various metric parameters that can be customized, such as threshold and headroom.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/CustomizableMetricParameters"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CustomizableMetricParameters implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The threshold value used for the specified metric parameter.
     * </p>
     * <note>
     * <p>
     * You can only specify the threshold value for CPU utilization.
     * </p>
     * </note>
     */
    private String threshold;
    /**
     * <p>
     * The headroom value in percentage used for the specified metric parameter.
     * </p>
     * <p>
     * The following lists the valid values for CPU and memory utilization.
     * </p>
     * <ul>
     * <li>
     * <p>
     * CPU utilization: <code>PERCENT_30 | PERCENT_20 | PERCENT_0</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Memory utilization: <code>PERCENT_30 | PERCENT_20 | PERCENT_10</code>
     * </p>
     * </li>
     * </ul>
     */
    private String headroom;

    /**
     * <p>
     * The threshold value used for the specified metric parameter.
     * </p>
     * <note>
     * <p>
     * You can only specify the threshold value for CPU utilization.
     * </p>
     * </note>
     * 
     * @param threshold
     *        The threshold value used for the specified metric parameter. </p> <note>
     *        <p>
     *        You can only specify the threshold value for CPU utilization.
     *        </p>
     * @see CustomizableMetricThreshold
     */

    public void setThreshold(String threshold) {
        this.threshold = threshold;
    }

    /**
     * <p>
     * The threshold value used for the specified metric parameter.
     * </p>
     * <note>
     * <p>
     * You can only specify the threshold value for CPU utilization.
     * </p>
     * </note>
     * 
     * @return The threshold value used for the specified metric parameter. </p> <note>
     *         <p>
     *         You can only specify the threshold value for CPU utilization.
     *         </p>
     * @see CustomizableMetricThreshold
     */

    public String getThreshold() {
        return this.threshold;
    }

    /**
     * <p>
     * The threshold value used for the specified metric parameter.
     * </p>
     * <note>
     * <p>
     * You can only specify the threshold value for CPU utilization.
     * </p>
     * </note>
     * 
     * @param threshold
     *        The threshold value used for the specified metric parameter. </p> <note>
     *        <p>
     *        You can only specify the threshold value for CPU utilization.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CustomizableMetricThreshold
     */

    public CustomizableMetricParameters withThreshold(String threshold) {
        setThreshold(threshold);
        return this;
    }

    /**
     * <p>
     * The threshold value used for the specified metric parameter.
     * </p>
     * <note>
     * <p>
     * You can only specify the threshold value for CPU utilization.
     * </p>
     * </note>
     * 
     * @param threshold
     *        The threshold value used for the specified metric parameter. </p> <note>
     *        <p>
     *        You can only specify the threshold value for CPU utilization.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CustomizableMetricThreshold
     */

    public CustomizableMetricParameters withThreshold(CustomizableMetricThreshold threshold) {
        this.threshold = threshold.toString();
        return this;
    }

    /**
     * <p>
     * The headroom value in percentage used for the specified metric parameter.
     * </p>
     * <p>
     * The following lists the valid values for CPU and memory utilization.
     * </p>
     * <ul>
     * <li>
     * <p>
     * CPU utilization: <code>PERCENT_30 | PERCENT_20 | PERCENT_0</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Memory utilization: <code>PERCENT_30 | PERCENT_20 | PERCENT_10</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param headroom
     *        The headroom value in percentage used for the specified metric parameter. </p>
     *        <p>
     *        The following lists the valid values for CPU and memory utilization.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        CPU utilization: <code>PERCENT_30 | PERCENT_20 | PERCENT_0</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Memory utilization: <code>PERCENT_30 | PERCENT_20 | PERCENT_10</code>
     *        </p>
     *        </li>
     * @see CustomizableMetricHeadroom
     */

    public void setHeadroom(String headroom) {
        this.headroom = headroom;
    }

    /**
     * <p>
     * The headroom value in percentage used for the specified metric parameter.
     * </p>
     * <p>
     * The following lists the valid values for CPU and memory utilization.
     * </p>
     * <ul>
     * <li>
     * <p>
     * CPU utilization: <code>PERCENT_30 | PERCENT_20 | PERCENT_0</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Memory utilization: <code>PERCENT_30 | PERCENT_20 | PERCENT_10</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The headroom value in percentage used for the specified metric parameter. </p>
     *         <p>
     *         The following lists the valid values for CPU and memory utilization.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         CPU utilization: <code>PERCENT_30 | PERCENT_20 | PERCENT_0</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Memory utilization: <code>PERCENT_30 | PERCENT_20 | PERCENT_10</code>
     *         </p>
     *         </li>
     * @see CustomizableMetricHeadroom
     */

    public String getHeadroom() {
        return this.headroom;
    }

    /**
     * <p>
     * The headroom value in percentage used for the specified metric parameter.
     * </p>
     * <p>
     * The following lists the valid values for CPU and memory utilization.
     * </p>
     * <ul>
     * <li>
     * <p>
     * CPU utilization: <code>PERCENT_30 | PERCENT_20 | PERCENT_0</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Memory utilization: <code>PERCENT_30 | PERCENT_20 | PERCENT_10</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param headroom
     *        The headroom value in percentage used for the specified metric parameter. </p>
     *        <p>
     *        The following lists the valid values for CPU and memory utilization.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        CPU utilization: <code>PERCENT_30 | PERCENT_20 | PERCENT_0</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Memory utilization: <code>PERCENT_30 | PERCENT_20 | PERCENT_10</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CustomizableMetricHeadroom
     */

    public CustomizableMetricParameters withHeadroom(String headroom) {
        setHeadroom(headroom);
        return this;
    }

    /**
     * <p>
     * The headroom value in percentage used for the specified metric parameter.
     * </p>
     * <p>
     * The following lists the valid values for CPU and memory utilization.
     * </p>
     * <ul>
     * <li>
     * <p>
     * CPU utilization: <code>PERCENT_30 | PERCENT_20 | PERCENT_0</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Memory utilization: <code>PERCENT_30 | PERCENT_20 | PERCENT_10</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param headroom
     *        The headroom value in percentage used for the specified metric parameter. </p>
     *        <p>
     *        The following lists the valid values for CPU and memory utilization.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        CPU utilization: <code>PERCENT_30 | PERCENT_20 | PERCENT_0</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Memory utilization: <code>PERCENT_30 | PERCENT_20 | PERCENT_10</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CustomizableMetricHeadroom
     */

    public CustomizableMetricParameters withHeadroom(CustomizableMetricHeadroom headroom) {
        this.headroom = headroom.toString();
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
        if (getThreshold() != null)
            sb.append("Threshold: ").append(getThreshold()).append(",");
        if (getHeadroom() != null)
            sb.append("Headroom: ").append(getHeadroom());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CustomizableMetricParameters == false)
            return false;
        CustomizableMetricParameters other = (CustomizableMetricParameters) obj;
        if (other.getThreshold() == null ^ this.getThreshold() == null)
            return false;
        if (other.getThreshold() != null && other.getThreshold().equals(this.getThreshold()) == false)
            return false;
        if (other.getHeadroom() == null ^ this.getHeadroom() == null)
            return false;
        if (other.getHeadroom() != null && other.getHeadroom().equals(this.getHeadroom()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getThreshold() == null) ? 0 : getThreshold().hashCode());
        hashCode = prime * hashCode + ((getHeadroom() == null) ? 0 : getHeadroom().hashCode());
        return hashCode;
    }

    @Override
    public CustomizableMetricParameters clone() {
        try {
            return (CustomizableMetricParameters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.computeoptimizer.model.transform.CustomizableMetricParametersMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
