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
package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Structure containing the estimated age range, in years, for a face.
 * </p>
 * <p>
 * Amazon Rekognition estimates an age range for faces detected in the input image. Estimated age ranges can overlap. A
 * face of a 5-year-old might have an estimated range of 4-6, while the face of a 6-year-old might have an estimated
 * range of 4-8.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AgeRange implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The lowest estimated age.
     * </p>
     */
    private Integer low;
    /**
     * <p>
     * The highest estimated age.
     * </p>
     */
    private Integer high;

    /**
     * <p>
     * The lowest estimated age.
     * </p>
     * 
     * @param low
     *        The lowest estimated age.
     */

    public void setLow(Integer low) {
        this.low = low;
    }

    /**
     * <p>
     * The lowest estimated age.
     * </p>
     * 
     * @return The lowest estimated age.
     */

    public Integer getLow() {
        return this.low;
    }

    /**
     * <p>
     * The lowest estimated age.
     * </p>
     * 
     * @param low
     *        The lowest estimated age.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgeRange withLow(Integer low) {
        setLow(low);
        return this;
    }

    /**
     * <p>
     * The highest estimated age.
     * </p>
     * 
     * @param high
     *        The highest estimated age.
     */

    public void setHigh(Integer high) {
        this.high = high;
    }

    /**
     * <p>
     * The highest estimated age.
     * </p>
     * 
     * @return The highest estimated age.
     */

    public Integer getHigh() {
        return this.high;
    }

    /**
     * <p>
     * The highest estimated age.
     * </p>
     * 
     * @param high
     *        The highest estimated age.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgeRange withHigh(Integer high) {
        setHigh(high);
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
        if (getLow() != null)
            sb.append("Low: ").append(getLow()).append(",");
        if (getHigh() != null)
            sb.append("High: ").append(getHigh());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AgeRange == false)
            return false;
        AgeRange other = (AgeRange) obj;
        if (other.getLow() == null ^ this.getLow() == null)
            return false;
        if (other.getLow() != null && other.getLow().equals(this.getLow()) == false)
            return false;
        if (other.getHigh() == null ^ this.getHigh() == null)
            return false;
        if (other.getHigh() != null && other.getHigh().equals(this.getHigh()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLow() == null) ? 0 : getLow().hashCode());
        hashCode = prime * hashCode + ((getHigh() == null) ? 0 : getHigh().hashCode());
        return hashCode;
    }

    @Override
    public AgeRange clone() {
        try {
            return (AgeRange) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.rekognition.model.transform.AgeRangeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
