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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Defines a non-overlapping region of a table's partitions, allowing multiple requests to be executed in parallel.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/Segment" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Segment implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The zero-based index number of the this segment. For example, if the total number of segments is 4, SegmentNumber
     * values will range from zero through three.
     * </p>
     */
    private Integer segmentNumber;
    /**
     * <p>
     * The total numer of segments.
     * </p>
     */
    private Integer totalSegments;

    /**
     * <p>
     * The zero-based index number of the this segment. For example, if the total number of segments is 4, SegmentNumber
     * values will range from zero through three.
     * </p>
     * 
     * @param segmentNumber
     *        The zero-based index number of the this segment. For example, if the total number of segments is 4,
     *        SegmentNumber values will range from zero through three.
     */

    public void setSegmentNumber(Integer segmentNumber) {
        this.segmentNumber = segmentNumber;
    }

    /**
     * <p>
     * The zero-based index number of the this segment. For example, if the total number of segments is 4, SegmentNumber
     * values will range from zero through three.
     * </p>
     * 
     * @return The zero-based index number of the this segment. For example, if the total number of segments is 4,
     *         SegmentNumber values will range from zero through three.
     */

    public Integer getSegmentNumber() {
        return this.segmentNumber;
    }

    /**
     * <p>
     * The zero-based index number of the this segment. For example, if the total number of segments is 4, SegmentNumber
     * values will range from zero through three.
     * </p>
     * 
     * @param segmentNumber
     *        The zero-based index number of the this segment. For example, if the total number of segments is 4,
     *        SegmentNumber values will range from zero through three.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Segment withSegmentNumber(Integer segmentNumber) {
        setSegmentNumber(segmentNumber);
        return this;
    }

    /**
     * <p>
     * The total numer of segments.
     * </p>
     * 
     * @param totalSegments
     *        The total numer of segments.
     */

    public void setTotalSegments(Integer totalSegments) {
        this.totalSegments = totalSegments;
    }

    /**
     * <p>
     * The total numer of segments.
     * </p>
     * 
     * @return The total numer of segments.
     */

    public Integer getTotalSegments() {
        return this.totalSegments;
    }

    /**
     * <p>
     * The total numer of segments.
     * </p>
     * 
     * @param totalSegments
     *        The total numer of segments.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Segment withTotalSegments(Integer totalSegments) {
        setTotalSegments(totalSegments);
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
        if (getSegmentNumber() != null)
            sb.append("SegmentNumber: ").append(getSegmentNumber()).append(",");
        if (getTotalSegments() != null)
            sb.append("TotalSegments: ").append(getTotalSegments());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Segment == false)
            return false;
        Segment other = (Segment) obj;
        if (other.getSegmentNumber() == null ^ this.getSegmentNumber() == null)
            return false;
        if (other.getSegmentNumber() != null && other.getSegmentNumber().equals(this.getSegmentNumber()) == false)
            return false;
        if (other.getTotalSegments() == null ^ this.getTotalSegments() == null)
            return false;
        if (other.getTotalSegments() != null && other.getTotalSegments().equals(this.getTotalSegments()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSegmentNumber() == null) ? 0 : getSegmentNumber().hashCode());
        hashCode = prime * hashCode + ((getTotalSegments() == null) ? 0 : getTotalSegments().hashCode());
        return hashCode;
    }

    @Override
    public Segment clone() {
        try {
            return (Segment) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.SegmentMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
