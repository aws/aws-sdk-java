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
 * This data type is used in the <a>AssessmentRunFilter</a> data type.
 * </p>
 */
public class TimestampRange implements Serializable, Cloneable {

    /**
     * <p>
     * The minimum value of the timestamp range.
     * </p>
     */
    private java.util.Date beginDate;
    /**
     * <p>
     * The maximum value of the timestamp range.
     * </p>
     */
    private java.util.Date endDate;

    /**
     * <p>
     * The minimum value of the timestamp range.
     * </p>
     * 
     * @param beginDate
     *        The minimum value of the timestamp range.
     */

    public void setBeginDate(java.util.Date beginDate) {
        this.beginDate = beginDate;
    }

    /**
     * <p>
     * The minimum value of the timestamp range.
     * </p>
     * 
     * @return The minimum value of the timestamp range.
     */

    public java.util.Date getBeginDate() {
        return this.beginDate;
    }

    /**
     * <p>
     * The minimum value of the timestamp range.
     * </p>
     * 
     * @param beginDate
     *        The minimum value of the timestamp range.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TimestampRange withBeginDate(java.util.Date beginDate) {
        setBeginDate(beginDate);
        return this;
    }

    /**
     * <p>
     * The maximum value of the timestamp range.
     * </p>
     * 
     * @param endDate
     *        The maximum value of the timestamp range.
     */

    public void setEndDate(java.util.Date endDate) {
        this.endDate = endDate;
    }

    /**
     * <p>
     * The maximum value of the timestamp range.
     * </p>
     * 
     * @return The maximum value of the timestamp range.
     */

    public java.util.Date getEndDate() {
        return this.endDate;
    }

    /**
     * <p>
     * The maximum value of the timestamp range.
     * </p>
     * 
     * @param endDate
     *        The maximum value of the timestamp range.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TimestampRange withEndDate(java.util.Date endDate) {
        setEndDate(endDate);
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
        if (getBeginDate() != null)
            sb.append("BeginDate: " + getBeginDate() + ",");
        if (getEndDate() != null)
            sb.append("EndDate: " + getEndDate());
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
        if (other.getBeginDate() == null ^ this.getBeginDate() == null)
            return false;
        if (other.getBeginDate() != null && other.getBeginDate().equals(this.getBeginDate()) == false)
            return false;
        if (other.getEndDate() == null ^ this.getEndDate() == null)
            return false;
        if (other.getEndDate() != null && other.getEndDate().equals(this.getEndDate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBeginDate() == null) ? 0 : getBeginDate().hashCode());
        hashCode = prime * hashCode + ((getEndDate() == null) ? 0 : getEndDate().hashCode());
        return hashCode;
    }

    @Override
    public TimestampRange clone() {
        try {
            return (TimestampRange) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
