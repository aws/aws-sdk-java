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
package com.amazonaws.services.inspector2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that describes the details of a number filter.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/NumberFilter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NumberFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The lowest number to be included in the filter.
     * </p>
     */
    private Double lowerInclusive;
    /**
     * <p>
     * The highest number to be included in the filter.
     * </p>
     */
    private Double upperInclusive;

    /**
     * <p>
     * The lowest number to be included in the filter.
     * </p>
     * 
     * @param lowerInclusive
     *        The lowest number to be included in the filter.
     */

    public void setLowerInclusive(Double lowerInclusive) {
        this.lowerInclusive = lowerInclusive;
    }

    /**
     * <p>
     * The lowest number to be included in the filter.
     * </p>
     * 
     * @return The lowest number to be included in the filter.
     */

    public Double getLowerInclusive() {
        return this.lowerInclusive;
    }

    /**
     * <p>
     * The lowest number to be included in the filter.
     * </p>
     * 
     * @param lowerInclusive
     *        The lowest number to be included in the filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NumberFilter withLowerInclusive(Double lowerInclusive) {
        setLowerInclusive(lowerInclusive);
        return this;
    }

    /**
     * <p>
     * The highest number to be included in the filter.
     * </p>
     * 
     * @param upperInclusive
     *        The highest number to be included in the filter.
     */

    public void setUpperInclusive(Double upperInclusive) {
        this.upperInclusive = upperInclusive;
    }

    /**
     * <p>
     * The highest number to be included in the filter.
     * </p>
     * 
     * @return The highest number to be included in the filter.
     */

    public Double getUpperInclusive() {
        return this.upperInclusive;
    }

    /**
     * <p>
     * The highest number to be included in the filter.
     * </p>
     * 
     * @param upperInclusive
     *        The highest number to be included in the filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NumberFilter withUpperInclusive(Double upperInclusive) {
        setUpperInclusive(upperInclusive);
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
        if (getLowerInclusive() != null)
            sb.append("LowerInclusive: ").append(getLowerInclusive()).append(",");
        if (getUpperInclusive() != null)
            sb.append("UpperInclusive: ").append(getUpperInclusive());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NumberFilter == false)
            return false;
        NumberFilter other = (NumberFilter) obj;
        if (other.getLowerInclusive() == null ^ this.getLowerInclusive() == null)
            return false;
        if (other.getLowerInclusive() != null && other.getLowerInclusive().equals(this.getLowerInclusive()) == false)
            return false;
        if (other.getUpperInclusive() == null ^ this.getUpperInclusive() == null)
            return false;
        if (other.getUpperInclusive() != null && other.getUpperInclusive().equals(this.getUpperInclusive()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLowerInclusive() == null) ? 0 : getLowerInclusive().hashCode());
        hashCode = prime * hashCode + ((getUpperInclusive() == null) ? 0 : getUpperInclusive().hashCode());
        return hashCode;
    }

    @Override
    public NumberFilter clone() {
        try {
            return (NumberFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.inspector2.model.transform.NumberFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
