/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.inspector.model;

import java.io.Serializable;

/**
 * <p>
 * This data type is used in the <a>AssessmentsFilter</a> and <a>RunsFilter</a>
 * data types.
 * </p>
 */
public class TimestampRange implements Serializable, Cloneable {

    /**
     * <p>
     * The minimum value of the timestamp range.
     * </p>
     */
    private java.util.Date minimum;
    /**
     * <p>
     * The maximum value of the timestamp range.
     * </p>
     */
    private java.util.Date maximum;

    /**
     * <p>
     * The minimum value of the timestamp range.
     * </p>
     * 
     * @param minimum
     *        The minimum value of the timestamp range.
     */
    public void setMinimum(java.util.Date minimum) {
        this.minimum = minimum;
    }

    /**
     * <p>
     * The minimum value of the timestamp range.
     * </p>
     * 
     * @return The minimum value of the timestamp range.
     */
    public java.util.Date getMinimum() {
        return this.minimum;
    }

    /**
     * <p>
     * The minimum value of the timestamp range.
     * </p>
     * 
     * @param minimum
     *        The minimum value of the timestamp range.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public TimestampRange withMinimum(java.util.Date minimum) {
        setMinimum(minimum);
        return this;
    }

    /**
     * <p>
     * The maximum value of the timestamp range.
     * </p>
     * 
     * @param maximum
     *        The maximum value of the timestamp range.
     */
    public void setMaximum(java.util.Date maximum) {
        this.maximum = maximum;
    }

    /**
     * <p>
     * The maximum value of the timestamp range.
     * </p>
     * 
     * @return The maximum value of the timestamp range.
     */
    public java.util.Date getMaximum() {
        return this.maximum;
    }

    /**
     * <p>
     * The maximum value of the timestamp range.
     * </p>
     * 
     * @param maximum
     *        The maximum value of the timestamp range.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public TimestampRange withMaximum(java.util.Date maximum) {
        setMaximum(maximum);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getMinimum() != null)
            sb.append("Minimum: " + getMinimum() + ",");
        if (getMaximum() != null)
            sb.append("Maximum: " + getMaximum());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TimestampRange == false)
            return false;
        TimestampRange other = (TimestampRange) obj;
        if (other.getMinimum() == null ^ this.getMinimum() == null)
            return false;
        if (other.getMinimum() != null
                && other.getMinimum().equals(this.getMinimum()) == false)
            return false;
        if (other.getMaximum() == null ^ this.getMaximum() == null)
            return false;
        if (other.getMaximum() != null
                && other.getMaximum().equals(this.getMaximum()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getMinimum() == null) ? 0 : getMinimum().hashCode());
        hashCode = prime * hashCode
                + ((getMaximum() == null) ? 0 : getMaximum().hashCode());
        return hashCode;
    }

    @Override
    public TimestampRange clone() {
        try {
            return (TimestampRange) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}