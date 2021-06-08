/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.location.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents an element of a leg within a route. A step contains instructions for how to move to the next step in the
 * leg.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/Step" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Step implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The travel distance between the step's <code>StartPosition</code> and <code>EndPosition</code>.
     * </p>
     */
    private Double distance;
    /**
     * <p>
     * The estimated travel time, in seconds, from the step's <code>StartPosition</code> to the <code>EndPosition</code>
     * . . The travel mode and departure time that you specify in the request determines the calculated time.
     * </p>
     */
    private Double durationSeconds;
    /**
     * <p>
     * The end position of a step. If the position the last step in the leg, this position is the same as the end
     * position of the leg.
     * </p>
     */
    private java.util.List<Double> endPosition;
    /**
     * <p>
     * Represents the start position, or index, in a sequence of steps within the leg's line string geometry. For
     * example, the index of the first step in a leg geometry is <code>0</code>.
     * </p>
     * <p>
     * Included in the response for queries that set <code>IncludeLegGeometry</code> to <code>True</code>.
     * </p>
     */
    private Integer geometryOffset;
    /**
     * <p>
     * The starting position of a step. If the position is the first step in the leg, this position is the same as the
     * start position of the leg.
     * </p>
     */
    private java.util.List<Double> startPosition;

    /**
     * <p>
     * The travel distance between the step's <code>StartPosition</code> and <code>EndPosition</code>.
     * </p>
     * 
     * @param distance
     *        The travel distance between the step's <code>StartPosition</code> and <code>EndPosition</code>.
     */

    public void setDistance(Double distance) {
        this.distance = distance;
    }

    /**
     * <p>
     * The travel distance between the step's <code>StartPosition</code> and <code>EndPosition</code>.
     * </p>
     * 
     * @return The travel distance between the step's <code>StartPosition</code> and <code>EndPosition</code>.
     */

    public Double getDistance() {
        return this.distance;
    }

    /**
     * <p>
     * The travel distance between the step's <code>StartPosition</code> and <code>EndPosition</code>.
     * </p>
     * 
     * @param distance
     *        The travel distance between the step's <code>StartPosition</code> and <code>EndPosition</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Step withDistance(Double distance) {
        setDistance(distance);
        return this;
    }

    /**
     * <p>
     * The estimated travel time, in seconds, from the step's <code>StartPosition</code> to the <code>EndPosition</code>
     * . . The travel mode and departure time that you specify in the request determines the calculated time.
     * </p>
     * 
     * @param durationSeconds
     *        The estimated travel time, in seconds, from the step's <code>StartPosition</code> to the
     *        <code>EndPosition</code>. . The travel mode and departure time that you specify in the request determines
     *        the calculated time.
     */

    public void setDurationSeconds(Double durationSeconds) {
        this.durationSeconds = durationSeconds;
    }

    /**
     * <p>
     * The estimated travel time, in seconds, from the step's <code>StartPosition</code> to the <code>EndPosition</code>
     * . . The travel mode and departure time that you specify in the request determines the calculated time.
     * </p>
     * 
     * @return The estimated travel time, in seconds, from the step's <code>StartPosition</code> to the
     *         <code>EndPosition</code>. . The travel mode and departure time that you specify in the request determines
     *         the calculated time.
     */

    public Double getDurationSeconds() {
        return this.durationSeconds;
    }

    /**
     * <p>
     * The estimated travel time, in seconds, from the step's <code>StartPosition</code> to the <code>EndPosition</code>
     * . . The travel mode and departure time that you specify in the request determines the calculated time.
     * </p>
     * 
     * @param durationSeconds
     *        The estimated travel time, in seconds, from the step's <code>StartPosition</code> to the
     *        <code>EndPosition</code>. . The travel mode and departure time that you specify in the request determines
     *        the calculated time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Step withDurationSeconds(Double durationSeconds) {
        setDurationSeconds(durationSeconds);
        return this;
    }

    /**
     * <p>
     * The end position of a step. If the position the last step in the leg, this position is the same as the end
     * position of the leg.
     * </p>
     * 
     * @return The end position of a step. If the position the last step in the leg, this position is the same as the
     *         end position of the leg.
     */

    public java.util.List<Double> getEndPosition() {
        return endPosition;
    }

    /**
     * <p>
     * The end position of a step. If the position the last step in the leg, this position is the same as the end
     * position of the leg.
     * </p>
     * 
     * @param endPosition
     *        The end position of a step. If the position the last step in the leg, this position is the same as the end
     *        position of the leg.
     */

    public void setEndPosition(java.util.Collection<Double> endPosition) {
        if (endPosition == null) {
            this.endPosition = null;
            return;
        }

        this.endPosition = new java.util.ArrayList<Double>(endPosition);
    }

    /**
     * <p>
     * The end position of a step. If the position the last step in the leg, this position is the same as the end
     * position of the leg.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEndPosition(java.util.Collection)} or {@link #withEndPosition(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param endPosition
     *        The end position of a step. If the position the last step in the leg, this position is the same as the end
     *        position of the leg.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Step withEndPosition(Double... endPosition) {
        if (this.endPosition == null) {
            setEndPosition(new java.util.ArrayList<Double>(endPosition.length));
        }
        for (Double ele : endPosition) {
            this.endPosition.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The end position of a step. If the position the last step in the leg, this position is the same as the end
     * position of the leg.
     * </p>
     * 
     * @param endPosition
     *        The end position of a step. If the position the last step in the leg, this position is the same as the end
     *        position of the leg.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Step withEndPosition(java.util.Collection<Double> endPosition) {
        setEndPosition(endPosition);
        return this;
    }

    /**
     * <p>
     * Represents the start position, or index, in a sequence of steps within the leg's line string geometry. For
     * example, the index of the first step in a leg geometry is <code>0</code>.
     * </p>
     * <p>
     * Included in the response for queries that set <code>IncludeLegGeometry</code> to <code>True</code>.
     * </p>
     * 
     * @param geometryOffset
     *        Represents the start position, or index, in a sequence of steps within the leg's line string geometry. For
     *        example, the index of the first step in a leg geometry is <code>0</code>. </p>
     *        <p>
     *        Included in the response for queries that set <code>IncludeLegGeometry</code> to <code>True</code>.
     */

    public void setGeometryOffset(Integer geometryOffset) {
        this.geometryOffset = geometryOffset;
    }

    /**
     * <p>
     * Represents the start position, or index, in a sequence of steps within the leg's line string geometry. For
     * example, the index of the first step in a leg geometry is <code>0</code>.
     * </p>
     * <p>
     * Included in the response for queries that set <code>IncludeLegGeometry</code> to <code>True</code>.
     * </p>
     * 
     * @return Represents the start position, or index, in a sequence of steps within the leg's line string geometry.
     *         For example, the index of the first step in a leg geometry is <code>0</code>. </p>
     *         <p>
     *         Included in the response for queries that set <code>IncludeLegGeometry</code> to <code>True</code>.
     */

    public Integer getGeometryOffset() {
        return this.geometryOffset;
    }

    /**
     * <p>
     * Represents the start position, or index, in a sequence of steps within the leg's line string geometry. For
     * example, the index of the first step in a leg geometry is <code>0</code>.
     * </p>
     * <p>
     * Included in the response for queries that set <code>IncludeLegGeometry</code> to <code>True</code>.
     * </p>
     * 
     * @param geometryOffset
     *        Represents the start position, or index, in a sequence of steps within the leg's line string geometry. For
     *        example, the index of the first step in a leg geometry is <code>0</code>. </p>
     *        <p>
     *        Included in the response for queries that set <code>IncludeLegGeometry</code> to <code>True</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Step withGeometryOffset(Integer geometryOffset) {
        setGeometryOffset(geometryOffset);
        return this;
    }

    /**
     * <p>
     * The starting position of a step. If the position is the first step in the leg, this position is the same as the
     * start position of the leg.
     * </p>
     * 
     * @return The starting position of a step. If the position is the first step in the leg, this position is the same
     *         as the start position of the leg.
     */

    public java.util.List<Double> getStartPosition() {
        return startPosition;
    }

    /**
     * <p>
     * The starting position of a step. If the position is the first step in the leg, this position is the same as the
     * start position of the leg.
     * </p>
     * 
     * @param startPosition
     *        The starting position of a step. If the position is the first step in the leg, this position is the same
     *        as the start position of the leg.
     */

    public void setStartPosition(java.util.Collection<Double> startPosition) {
        if (startPosition == null) {
            this.startPosition = null;
            return;
        }

        this.startPosition = new java.util.ArrayList<Double>(startPosition);
    }

    /**
     * <p>
     * The starting position of a step. If the position is the first step in the leg, this position is the same as the
     * start position of the leg.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStartPosition(java.util.Collection)} or {@link #withStartPosition(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param startPosition
     *        The starting position of a step. If the position is the first step in the leg, this position is the same
     *        as the start position of the leg.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Step withStartPosition(Double... startPosition) {
        if (this.startPosition == null) {
            setStartPosition(new java.util.ArrayList<Double>(startPosition.length));
        }
        for (Double ele : startPosition) {
            this.startPosition.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The starting position of a step. If the position is the first step in the leg, this position is the same as the
     * start position of the leg.
     * </p>
     * 
     * @param startPosition
     *        The starting position of a step. If the position is the first step in the leg, this position is the same
     *        as the start position of the leg.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Step withStartPosition(java.util.Collection<Double> startPosition) {
        setStartPosition(startPosition);
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
        if (getDistance() != null)
            sb.append("Distance: ").append(getDistance()).append(",");
        if (getDurationSeconds() != null)
            sb.append("DurationSeconds: ").append(getDurationSeconds()).append(",");
        if (getEndPosition() != null)
            sb.append("EndPosition: ").append("***Sensitive Data Redacted***").append(",");
        if (getGeometryOffset() != null)
            sb.append("GeometryOffset: ").append(getGeometryOffset()).append(",");
        if (getStartPosition() != null)
            sb.append("StartPosition: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Step == false)
            return false;
        Step other = (Step) obj;
        if (other.getDistance() == null ^ this.getDistance() == null)
            return false;
        if (other.getDistance() != null && other.getDistance().equals(this.getDistance()) == false)
            return false;
        if (other.getDurationSeconds() == null ^ this.getDurationSeconds() == null)
            return false;
        if (other.getDurationSeconds() != null && other.getDurationSeconds().equals(this.getDurationSeconds()) == false)
            return false;
        if (other.getEndPosition() == null ^ this.getEndPosition() == null)
            return false;
        if (other.getEndPosition() != null && other.getEndPosition().equals(this.getEndPosition()) == false)
            return false;
        if (other.getGeometryOffset() == null ^ this.getGeometryOffset() == null)
            return false;
        if (other.getGeometryOffset() != null && other.getGeometryOffset().equals(this.getGeometryOffset()) == false)
            return false;
        if (other.getStartPosition() == null ^ this.getStartPosition() == null)
            return false;
        if (other.getStartPosition() != null && other.getStartPosition().equals(this.getStartPosition()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDistance() == null) ? 0 : getDistance().hashCode());
        hashCode = prime * hashCode + ((getDurationSeconds() == null) ? 0 : getDurationSeconds().hashCode());
        hashCode = prime * hashCode + ((getEndPosition() == null) ? 0 : getEndPosition().hashCode());
        hashCode = prime * hashCode + ((getGeometryOffset() == null) ? 0 : getGeometryOffset().hashCode());
        hashCode = prime * hashCode + ((getStartPosition() == null) ? 0 : getStartPosition().hashCode());
        return hashCode;
    }

    @Override
    public Step clone() {
        try {
            return (Step) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.location.model.transform.StepMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
