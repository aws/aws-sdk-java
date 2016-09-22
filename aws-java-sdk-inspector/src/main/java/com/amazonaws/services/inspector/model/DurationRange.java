/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.inspector.model;

import java.io.Serializable;

/**
 * <p>
 * This data type is used in the <a>AssessmentTemplateFilter</a> data type.
 * </p>
 */
public class DurationRange implements Serializable, Cloneable {

    /**
     * <p>
     * The minimum value of the duration range. Must be greater than zero.
     * </p>
     */
    private Integer minSeconds;
    /**
     * <p>
     * The maximum value of the duration range. Must be less than or equal to 604800 seconds (1 week).
     * </p>
     */
    private Integer maxSeconds;

    /**
     * <p>
     * The minimum value of the duration range. Must be greater than zero.
     * </p>
     * 
     * @param minSeconds
     *        The minimum value of the duration range. Must be greater than zero.
     */

    public void setMinSeconds(Integer minSeconds) {
        this.minSeconds = minSeconds;
    }

    /**
     * <p>
     * The minimum value of the duration range. Must be greater than zero.
     * </p>
     * 
     * @return The minimum value of the duration range. Must be greater than zero.
     */

    public Integer getMinSeconds() {
        return this.minSeconds;
    }

    /**
     * <p>
     * The minimum value of the duration range. Must be greater than zero.
     * </p>
     * 
     * @param minSeconds
     *        The minimum value of the duration range. Must be greater than zero.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DurationRange withMinSeconds(Integer minSeconds) {
        setMinSeconds(minSeconds);
        return this;
    }

    /**
     * <p>
     * The maximum value of the duration range. Must be less than or equal to 604800 seconds (1 week).
     * </p>
     * 
     * @param maxSeconds
     *        The maximum value of the duration range. Must be less than or equal to 604800 seconds (1 week).
     */

    public void setMaxSeconds(Integer maxSeconds) {
        this.maxSeconds = maxSeconds;
    }

    /**
     * <p>
     * The maximum value of the duration range. Must be less than or equal to 604800 seconds (1 week).
     * </p>
     * 
     * @return The maximum value of the duration range. Must be less than or equal to 604800 seconds (1 week).
     */

    public Integer getMaxSeconds() {
        return this.maxSeconds;
    }

    /**
     * <p>
     * The maximum value of the duration range. Must be less than or equal to 604800 seconds (1 week).
     * </p>
     * 
     * @param maxSeconds
     *        The maximum value of the duration range. Must be less than or equal to 604800 seconds (1 week).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DurationRange withMaxSeconds(Integer maxSeconds) {
        setMaxSeconds(maxSeconds);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getMinSeconds() != null)
            sb.append("MinSeconds: " + getMinSeconds() + ",");
        if (getMaxSeconds() != null)
            sb.append("MaxSeconds: " + getMaxSeconds());
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
        if (other.getMinSeconds() == null ^ this.getMinSeconds() == null)
            return false;
        if (other.getMinSeconds() != null && other.getMinSeconds().equals(this.getMinSeconds()) == false)
            return false;
        if (other.getMaxSeconds() == null ^ this.getMaxSeconds() == null)
            return false;
        if (other.getMaxSeconds() != null && other.getMaxSeconds().equals(this.getMaxSeconds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMinSeconds() == null) ? 0 : getMinSeconds().hashCode());
        hashCode = prime * hashCode + ((getMaxSeconds() == null) ? 0 : getMaxSeconds().hashCode());
        return hashCode;
    }

    @Override
    public DurationRange clone() {
        try {
            return (DurationRange) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
