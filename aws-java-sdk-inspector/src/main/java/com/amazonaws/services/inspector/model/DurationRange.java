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
 * This data type is used in the <a>AssessmentsFilter</a> data type.
 * </p>
 */
public class DurationRange implements Serializable, Cloneable {

    /**
     * <p>
     * The minimum value of the duration range. Must be greater than zero.
     * </p>
     */
    private Integer minimum;
    /**
     * <p>
     * The maximum value of the duration range. Must be less than or equal to
     * 604800 seconds (1 week).
     * </p>
     */
    private Integer maximum;

    /**
     * <p>
     * The minimum value of the duration range. Must be greater than zero.
     * </p>
     * 
     * @param minimum
     *        The minimum value of the duration range. Must be greater than
     *        zero.
     */
    public void setMinimum(Integer minimum) {
        this.minimum = minimum;
    }

    /**
     * <p>
     * The minimum value of the duration range. Must be greater than zero.
     * </p>
     * 
     * @return The minimum value of the duration range. Must be greater than
     *         zero.
     */
    public Integer getMinimum() {
        return this.minimum;
    }

    /**
     * <p>
     * The minimum value of the duration range. Must be greater than zero.
     * </p>
     * 
     * @param minimum
     *        The minimum value of the duration range. Must be greater than
     *        zero.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public DurationRange withMinimum(Integer minimum) {
        setMinimum(minimum);
        return this;
    }

    /**
     * <p>
     * The maximum value of the duration range. Must be less than or equal to
     * 604800 seconds (1 week).
     * </p>
     * 
     * @param maximum
     *        The maximum value of the duration range. Must be less than or
     *        equal to 604800 seconds (1 week).
     */
    public void setMaximum(Integer maximum) {
        this.maximum = maximum;
    }

    /**
     * <p>
     * The maximum value of the duration range. Must be less than or equal to
     * 604800 seconds (1 week).
     * </p>
     * 
     * @return The maximum value of the duration range. Must be less than or
     *         equal to 604800 seconds (1 week).
     */
    public Integer getMaximum() {
        return this.maximum;
    }

    /**
     * <p>
     * The maximum value of the duration range. Must be less than or equal to
     * 604800 seconds (1 week).
     * </p>
     * 
     * @param maximum
     *        The maximum value of the duration range. Must be less than or
     *        equal to 604800 seconds (1 week).
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public DurationRange withMaximum(Integer maximum) {
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

        if (obj instanceof DurationRange == false)
            return false;
        DurationRange other = (DurationRange) obj;
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
    public DurationRange clone() {
        try {
            return (DurationRange) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}