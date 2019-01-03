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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Defines the possible values for an integer hyperparameter.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/IntegerParameterRangeSpecification"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IntegerParameterRangeSpecification implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The minimum integer value allowed.
     * </p>
     */
    private String minValue;
    /**
     * <p>
     * The maximum integer value allowed.
     * </p>
     */
    private String maxValue;

    /**
     * <p>
     * The minimum integer value allowed.
     * </p>
     * 
     * @param minValue
     *        The minimum integer value allowed.
     */

    public void setMinValue(String minValue) {
        this.minValue = minValue;
    }

    /**
     * <p>
     * The minimum integer value allowed.
     * </p>
     * 
     * @return The minimum integer value allowed.
     */

    public String getMinValue() {
        return this.minValue;
    }

    /**
     * <p>
     * The minimum integer value allowed.
     * </p>
     * 
     * @param minValue
     *        The minimum integer value allowed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IntegerParameterRangeSpecification withMinValue(String minValue) {
        setMinValue(minValue);
        return this;
    }

    /**
     * <p>
     * The maximum integer value allowed.
     * </p>
     * 
     * @param maxValue
     *        The maximum integer value allowed.
     */

    public void setMaxValue(String maxValue) {
        this.maxValue = maxValue;
    }

    /**
     * <p>
     * The maximum integer value allowed.
     * </p>
     * 
     * @return The maximum integer value allowed.
     */

    public String getMaxValue() {
        return this.maxValue;
    }

    /**
     * <p>
     * The maximum integer value allowed.
     * </p>
     * 
     * @param maxValue
     *        The maximum integer value allowed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IntegerParameterRangeSpecification withMaxValue(String maxValue) {
        setMaxValue(maxValue);
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
        if (getMinValue() != null)
            sb.append("MinValue: ").append(getMinValue()).append(",");
        if (getMaxValue() != null)
            sb.append("MaxValue: ").append(getMaxValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IntegerParameterRangeSpecification == false)
            return false;
        IntegerParameterRangeSpecification other = (IntegerParameterRangeSpecification) obj;
        if (other.getMinValue() == null ^ this.getMinValue() == null)
            return false;
        if (other.getMinValue() != null && other.getMinValue().equals(this.getMinValue()) == false)
            return false;
        if (other.getMaxValue() == null ^ this.getMaxValue() == null)
            return false;
        if (other.getMaxValue() != null && other.getMaxValue().equals(this.getMaxValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMinValue() == null) ? 0 : getMinValue().hashCode());
        hashCode = prime * hashCode + ((getMaxValue() == null) ? 0 : getMaxValue().hashCode());
        return hashCode;
    }

    @Override
    public IntegerParameterRangeSpecification clone() {
        try {
            return (IntegerParameterRangeSpecification) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.IntegerParameterRangeSpecificationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
