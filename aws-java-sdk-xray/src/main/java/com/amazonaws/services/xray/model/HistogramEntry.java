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
package com.amazonaws.services.xray.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An entry in a histogram for a statistic. A histogram maps the range of observed values on the X axis, and the
 * prevalence of each value on the Y axis.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/HistogramEntry" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HistogramEntry implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The value of the entry.
     * </p>
     */
    private Double value;
    /**
     * <p>
     * The prevalence of the entry.
     * </p>
     */
    private Integer count;

    /**
     * <p>
     * The value of the entry.
     * </p>
     * 
     * @param value
     *        The value of the entry.
     */

    public void setValue(Double value) {
        this.value = value;
    }

    /**
     * <p>
     * The value of the entry.
     * </p>
     * 
     * @return The value of the entry.
     */

    public Double getValue() {
        return this.value;
    }

    /**
     * <p>
     * The value of the entry.
     * </p>
     * 
     * @param value
     *        The value of the entry.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HistogramEntry withValue(Double value) {
        setValue(value);
        return this;
    }

    /**
     * <p>
     * The prevalence of the entry.
     * </p>
     * 
     * @param count
     *        The prevalence of the entry.
     */

    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * <p>
     * The prevalence of the entry.
     * </p>
     * 
     * @return The prevalence of the entry.
     */

    public Integer getCount() {
        return this.count;
    }

    /**
     * <p>
     * The prevalence of the entry.
     * </p>
     * 
     * @param count
     *        The prevalence of the entry.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HistogramEntry withCount(Integer count) {
        setCount(count);
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
        if (getCount() != null)
            sb.append("Count: ").append(getCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HistogramEntry == false)
            return false;
        HistogramEntry other = (HistogramEntry) obj;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getCount() == null ^ this.getCount() == null)
            return false;
        if (other.getCount() != null && other.getCount().equals(this.getCount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getCount() == null) ? 0 : getCount().hashCode());
        return hashCode;
    }

    @Override
    public HistogramEntry clone() {
        try {
            return (HistogramEntry) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.xray.model.transform.HistogramEntryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
