/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the percentile and percentile value.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PercentPair implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The percentile.
     * </p>
     */
    private Double percent;
    /**
     * <p>
     * The value of the percentile.
     * </p>
     */
    private Double value;

    /**
     * <p>
     * The percentile.
     * </p>
     * 
     * @param percent
     *        The percentile.
     */

    public void setPercent(Double percent) {
        this.percent = percent;
    }

    /**
     * <p>
     * The percentile.
     * </p>
     * 
     * @return The percentile.
     */

    public Double getPercent() {
        return this.percent;
    }

    /**
     * <p>
     * The percentile.
     * </p>
     * 
     * @param percent
     *        The percentile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PercentPair withPercent(Double percent) {
        setPercent(percent);
        return this;
    }

    /**
     * <p>
     * The value of the percentile.
     * </p>
     * 
     * @param value
     *        The value of the percentile.
     */

    public void setValue(Double value) {
        this.value = value;
    }

    /**
     * <p>
     * The value of the percentile.
     * </p>
     * 
     * @return The value of the percentile.
     */

    public Double getValue() {
        return this.value;
    }

    /**
     * <p>
     * The value of the percentile.
     * </p>
     * 
     * @param value
     *        The value of the percentile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PercentPair withValue(Double value) {
        setValue(value);
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
        if (getPercent() != null)
            sb.append("Percent: ").append(getPercent()).append(",");
        if (getValue() != null)
            sb.append("Value: ").append(getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PercentPair == false)
            return false;
        PercentPair other = (PercentPair) obj;
        if (other.getPercent() == null ^ this.getPercent() == null)
            return false;
        if (other.getPercent() != null && other.getPercent().equals(this.getPercent()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPercent() == null) ? 0 : getPercent().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public PercentPair clone() {
        try {
            return (PercentPair) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iot.model.transform.PercentPairMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
