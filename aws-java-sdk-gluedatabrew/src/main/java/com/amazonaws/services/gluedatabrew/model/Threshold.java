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
package com.amazonaws.services.gluedatabrew.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The threshold used with a non-aggregate check expression. The non-aggregate check expression will be applied to each
 * row in a specific column. Then the threshold will be used to determine whether the validation succeeds.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/Threshold" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Threshold implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The value of a threshold.
     * </p>
     */
    private Double value;
    /**
     * <p>
     * The type of a threshold. Used for comparison of an actual count of rows that satisfy the rule to the threshold
     * value.
     * </p>
     */
    private String type;
    /**
     * <p>
     * Unit of threshold value. Can be either a COUNT or PERCENTAGE of the full sample size used for validation.
     * </p>
     */
    private String unit;

    /**
     * <p>
     * The value of a threshold.
     * </p>
     * 
     * @param value
     *        The value of a threshold.
     */

    public void setValue(Double value) {
        this.value = value;
    }

    /**
     * <p>
     * The value of a threshold.
     * </p>
     * 
     * @return The value of a threshold.
     */

    public Double getValue() {
        return this.value;
    }

    /**
     * <p>
     * The value of a threshold.
     * </p>
     * 
     * @param value
     *        The value of a threshold.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Threshold withValue(Double value) {
        setValue(value);
        return this;
    }

    /**
     * <p>
     * The type of a threshold. Used for comparison of an actual count of rows that satisfy the rule to the threshold
     * value.
     * </p>
     * 
     * @param type
     *        The type of a threshold. Used for comparison of an actual count of rows that satisfy the rule to the
     *        threshold value.
     * @see ThresholdType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of a threshold. Used for comparison of an actual count of rows that satisfy the rule to the threshold
     * value.
     * </p>
     * 
     * @return The type of a threshold. Used for comparison of an actual count of rows that satisfy the rule to the
     *         threshold value.
     * @see ThresholdType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of a threshold. Used for comparison of an actual count of rows that satisfy the rule to the threshold
     * value.
     * </p>
     * 
     * @param type
     *        The type of a threshold. Used for comparison of an actual count of rows that satisfy the rule to the
     *        threshold value.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ThresholdType
     */

    public Threshold withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of a threshold. Used for comparison of an actual count of rows that satisfy the rule to the threshold
     * value.
     * </p>
     * 
     * @param type
     *        The type of a threshold. Used for comparison of an actual count of rows that satisfy the rule to the
     *        threshold value.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ThresholdType
     */

    public Threshold withType(ThresholdType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * Unit of threshold value. Can be either a COUNT or PERCENTAGE of the full sample size used for validation.
     * </p>
     * 
     * @param unit
     *        Unit of threshold value. Can be either a COUNT or PERCENTAGE of the full sample size used for validation.
     * @see ThresholdUnit
     */

    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * <p>
     * Unit of threshold value. Can be either a COUNT or PERCENTAGE of the full sample size used for validation.
     * </p>
     * 
     * @return Unit of threshold value. Can be either a COUNT or PERCENTAGE of the full sample size used for validation.
     * @see ThresholdUnit
     */

    public String getUnit() {
        return this.unit;
    }

    /**
     * <p>
     * Unit of threshold value. Can be either a COUNT or PERCENTAGE of the full sample size used for validation.
     * </p>
     * 
     * @param unit
     *        Unit of threshold value. Can be either a COUNT or PERCENTAGE of the full sample size used for validation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ThresholdUnit
     */

    public Threshold withUnit(String unit) {
        setUnit(unit);
        return this;
    }

    /**
     * <p>
     * Unit of threshold value. Can be either a COUNT or PERCENTAGE of the full sample size used for validation.
     * </p>
     * 
     * @param unit
     *        Unit of threshold value. Can be either a COUNT or PERCENTAGE of the full sample size used for validation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ThresholdUnit
     */

    public Threshold withUnit(ThresholdUnit unit) {
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
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

        if (obj instanceof Threshold == false)
            return false;
        Threshold other = (Threshold) obj;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
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
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getUnit() == null) ? 0 : getUnit().hashCode());
        return hashCode;
    }

    @Override
    public Threshold clone() {
        try {
            return (Threshold) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.gluedatabrew.model.transform.ThresholdMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
