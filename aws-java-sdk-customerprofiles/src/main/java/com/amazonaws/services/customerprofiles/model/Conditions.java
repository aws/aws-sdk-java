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
package com.amazonaws.services.customerprofiles.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The conditions including range, object count, and threshold for the calculated attribute.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/Conditions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Conditions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The relative time period over which data is included in the aggregation.
     * </p>
     */
    private Range range;
    /**
     * <p>
     * The number of profile objects used for the calculated attribute.
     * </p>
     */
    private Integer objectCount;
    /**
     * <p>
     * The threshold for the calculated attribute.
     * </p>
     */
    private Threshold threshold;

    /**
     * <p>
     * The relative time period over which data is included in the aggregation.
     * </p>
     * 
     * @param range
     *        The relative time period over which data is included in the aggregation.
     */

    public void setRange(Range range) {
        this.range = range;
    }

    /**
     * <p>
     * The relative time period over which data is included in the aggregation.
     * </p>
     * 
     * @return The relative time period over which data is included in the aggregation.
     */

    public Range getRange() {
        return this.range;
    }

    /**
     * <p>
     * The relative time period over which data is included in the aggregation.
     * </p>
     * 
     * @param range
     *        The relative time period over which data is included in the aggregation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Conditions withRange(Range range) {
        setRange(range);
        return this;
    }

    /**
     * <p>
     * The number of profile objects used for the calculated attribute.
     * </p>
     * 
     * @param objectCount
     *        The number of profile objects used for the calculated attribute.
     */

    public void setObjectCount(Integer objectCount) {
        this.objectCount = objectCount;
    }

    /**
     * <p>
     * The number of profile objects used for the calculated attribute.
     * </p>
     * 
     * @return The number of profile objects used for the calculated attribute.
     */

    public Integer getObjectCount() {
        return this.objectCount;
    }

    /**
     * <p>
     * The number of profile objects used for the calculated attribute.
     * </p>
     * 
     * @param objectCount
     *        The number of profile objects used for the calculated attribute.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Conditions withObjectCount(Integer objectCount) {
        setObjectCount(objectCount);
        return this;
    }

    /**
     * <p>
     * The threshold for the calculated attribute.
     * </p>
     * 
     * @param threshold
     *        The threshold for the calculated attribute.
     */

    public void setThreshold(Threshold threshold) {
        this.threshold = threshold;
    }

    /**
     * <p>
     * The threshold for the calculated attribute.
     * </p>
     * 
     * @return The threshold for the calculated attribute.
     */

    public Threshold getThreshold() {
        return this.threshold;
    }

    /**
     * <p>
     * The threshold for the calculated attribute.
     * </p>
     * 
     * @param threshold
     *        The threshold for the calculated attribute.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Conditions withThreshold(Threshold threshold) {
        setThreshold(threshold);
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
        if (getRange() != null)
            sb.append("Range: ").append(getRange()).append(",");
        if (getObjectCount() != null)
            sb.append("ObjectCount: ").append(getObjectCount()).append(",");
        if (getThreshold() != null)
            sb.append("Threshold: ").append(getThreshold());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Conditions == false)
            return false;
        Conditions other = (Conditions) obj;
        if (other.getRange() == null ^ this.getRange() == null)
            return false;
        if (other.getRange() != null && other.getRange().equals(this.getRange()) == false)
            return false;
        if (other.getObjectCount() == null ^ this.getObjectCount() == null)
            return false;
        if (other.getObjectCount() != null && other.getObjectCount().equals(this.getObjectCount()) == false)
            return false;
        if (other.getThreshold() == null ^ this.getThreshold() == null)
            return false;
        if (other.getThreshold() != null && other.getThreshold().equals(this.getThreshold()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRange() == null) ? 0 : getRange().hashCode());
        hashCode = prime * hashCode + ((getObjectCount() == null) ? 0 : getObjectCount().hashCode());
        hashCode = prime * hashCode + ((getThreshold() == null) ? 0 : getThreshold().hashCode());
        return hashCode;
    }

    @Override
    public Conditions clone() {
        try {
            return (Conditions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.customerprofiles.model.transform.ConditionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
