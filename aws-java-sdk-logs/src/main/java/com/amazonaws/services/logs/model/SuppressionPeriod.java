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
package com.amazonaws.services.logs.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * If you are suppressing an anomaly temporariliy, this structure defines how long the suppression period is to be.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/SuppressionPeriod" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SuppressionPeriod implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the number of seconds, minutes or hours to suppress this anomaly. There is no maximum.
     * </p>
     */
    private Integer value;
    /**
     * <p>
     * Specifies whether the value of <code>value</code> is in seconds, minutes, or hours.
     * </p>
     */
    private String suppressionUnit;

    /**
     * <p>
     * Specifies the number of seconds, minutes or hours to suppress this anomaly. There is no maximum.
     * </p>
     * 
     * @param value
     *        Specifies the number of seconds, minutes or hours to suppress this anomaly. There is no maximum.
     */

    public void setValue(Integer value) {
        this.value = value;
    }

    /**
     * <p>
     * Specifies the number of seconds, minutes or hours to suppress this anomaly. There is no maximum.
     * </p>
     * 
     * @return Specifies the number of seconds, minutes or hours to suppress this anomaly. There is no maximum.
     */

    public Integer getValue() {
        return this.value;
    }

    /**
     * <p>
     * Specifies the number of seconds, minutes or hours to suppress this anomaly. There is no maximum.
     * </p>
     * 
     * @param value
     *        Specifies the number of seconds, minutes or hours to suppress this anomaly. There is no maximum.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SuppressionPeriod withValue(Integer value) {
        setValue(value);
        return this;
    }

    /**
     * <p>
     * Specifies whether the value of <code>value</code> is in seconds, minutes, or hours.
     * </p>
     * 
     * @param suppressionUnit
     *        Specifies whether the value of <code>value</code> is in seconds, minutes, or hours.
     * @see SuppressionUnit
     */

    public void setSuppressionUnit(String suppressionUnit) {
        this.suppressionUnit = suppressionUnit;
    }

    /**
     * <p>
     * Specifies whether the value of <code>value</code> is in seconds, minutes, or hours.
     * </p>
     * 
     * @return Specifies whether the value of <code>value</code> is in seconds, minutes, or hours.
     * @see SuppressionUnit
     */

    public String getSuppressionUnit() {
        return this.suppressionUnit;
    }

    /**
     * <p>
     * Specifies whether the value of <code>value</code> is in seconds, minutes, or hours.
     * </p>
     * 
     * @param suppressionUnit
     *        Specifies whether the value of <code>value</code> is in seconds, minutes, or hours.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SuppressionUnit
     */

    public SuppressionPeriod withSuppressionUnit(String suppressionUnit) {
        setSuppressionUnit(suppressionUnit);
        return this;
    }

    /**
     * <p>
     * Specifies whether the value of <code>value</code> is in seconds, minutes, or hours.
     * </p>
     * 
     * @param suppressionUnit
     *        Specifies whether the value of <code>value</code> is in seconds, minutes, or hours.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SuppressionUnit
     */

    public SuppressionPeriod withSuppressionUnit(SuppressionUnit suppressionUnit) {
        this.suppressionUnit = suppressionUnit.toString();
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
        if (getSuppressionUnit() != null)
            sb.append("SuppressionUnit: ").append(getSuppressionUnit());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SuppressionPeriod == false)
            return false;
        SuppressionPeriod other = (SuppressionPeriod) obj;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getSuppressionUnit() == null ^ this.getSuppressionUnit() == null)
            return false;
        if (other.getSuppressionUnit() != null && other.getSuppressionUnit().equals(this.getSuppressionUnit()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getSuppressionUnit() == null) ? 0 : getSuppressionUnit().hashCode());
        return hashCode;
    }

    @Override
    public SuppressionPeriod clone() {
        try {
            return (SuppressionPeriod) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.logs.model.transform.SuppressionPeriodMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
