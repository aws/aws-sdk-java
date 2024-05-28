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
package com.amazonaws.services.frauddetector.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Range of area under curve (auc) expected from the model. A range greater than 0.1 indicates higher model
 * uncertainity. A range is the difference between upper and lower bound of auc.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/UncertaintyRange" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UncertaintyRange implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The lower bound value of the area under curve (auc).
     * </p>
     */
    private Float lowerBoundValue;
    /**
     * <p>
     * The upper bound value of the area under curve (auc).
     * </p>
     */
    private Float upperBoundValue;

    /**
     * <p>
     * The lower bound value of the area under curve (auc).
     * </p>
     * 
     * @param lowerBoundValue
     *        The lower bound value of the area under curve (auc).
     */

    public void setLowerBoundValue(Float lowerBoundValue) {
        this.lowerBoundValue = lowerBoundValue;
    }

    /**
     * <p>
     * The lower bound value of the area under curve (auc).
     * </p>
     * 
     * @return The lower bound value of the area under curve (auc).
     */

    public Float getLowerBoundValue() {
        return this.lowerBoundValue;
    }

    /**
     * <p>
     * The lower bound value of the area under curve (auc).
     * </p>
     * 
     * @param lowerBoundValue
     *        The lower bound value of the area under curve (auc).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UncertaintyRange withLowerBoundValue(Float lowerBoundValue) {
        setLowerBoundValue(lowerBoundValue);
        return this;
    }

    /**
     * <p>
     * The upper bound value of the area under curve (auc).
     * </p>
     * 
     * @param upperBoundValue
     *        The upper bound value of the area under curve (auc).
     */

    public void setUpperBoundValue(Float upperBoundValue) {
        this.upperBoundValue = upperBoundValue;
    }

    /**
     * <p>
     * The upper bound value of the area under curve (auc).
     * </p>
     * 
     * @return The upper bound value of the area under curve (auc).
     */

    public Float getUpperBoundValue() {
        return this.upperBoundValue;
    }

    /**
     * <p>
     * The upper bound value of the area under curve (auc).
     * </p>
     * 
     * @param upperBoundValue
     *        The upper bound value of the area under curve (auc).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UncertaintyRange withUpperBoundValue(Float upperBoundValue) {
        setUpperBoundValue(upperBoundValue);
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
        if (getLowerBoundValue() != null)
            sb.append("LowerBoundValue: ").append(getLowerBoundValue()).append(",");
        if (getUpperBoundValue() != null)
            sb.append("UpperBoundValue: ").append(getUpperBoundValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UncertaintyRange == false)
            return false;
        UncertaintyRange other = (UncertaintyRange) obj;
        if (other.getLowerBoundValue() == null ^ this.getLowerBoundValue() == null)
            return false;
        if (other.getLowerBoundValue() != null && other.getLowerBoundValue().equals(this.getLowerBoundValue()) == false)
            return false;
        if (other.getUpperBoundValue() == null ^ this.getUpperBoundValue() == null)
            return false;
        if (other.getUpperBoundValue() != null && other.getUpperBoundValue().equals(this.getUpperBoundValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLowerBoundValue() == null) ? 0 : getLowerBoundValue().hashCode());
        hashCode = prime * hashCode + ((getUpperBoundValue() == null) ? 0 : getUpperBoundValue().hashCode());
        return hashCode;
    }

    @Override
    public UncertaintyRange clone() {
        try {
            return (UncertaintyRange) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.frauddetector.model.transform.UncertaintyRangeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
