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

package com.amazonaws.services.codedeploy.model;

import java.io.Serializable;

/**
 * <p>
 * Information about a time range.
 * </p>
 */
public class TimeRange implements Serializable, Cloneable {

    /**
     * <p>
     * The time range's start time.
     * </p>
     * <note>Specify null to leave the time range's start time
     * open-ended.</note>
     */
    private java.util.Date start;
    /**
     * <p>
     * The time range's end time.
     * </p>
     * <note>Specify null to leave the time range's end time open-ended.</note>
     */
    private java.util.Date end;

    /**
     * <p>
     * The time range's start time.
     * </p>
     * <note>Specify null to leave the time range's start time
     * open-ended.</note>
     * 
     * @param start
     *        The time range's start time.</p> <note>Specify null to leave the
     *        time range's start time open-ended.
     */
    public void setStart(java.util.Date start) {
        this.start = start;
    }

    /**
     * <p>
     * The time range's start time.
     * </p>
     * <note>Specify null to leave the time range's start time
     * open-ended.</note>
     * 
     * @return The time range's start time.</p> <note>Specify null to leave the
     *         time range's start time open-ended.
     */
    public java.util.Date getStart() {
        return this.start;
    }

    /**
     * <p>
     * The time range's start time.
     * </p>
     * <note>Specify null to leave the time range's start time
     * open-ended.</note>
     * 
     * @param start
     *        The time range's start time.</p> <note>Specify null to leave the
     *        time range's start time open-ended.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public TimeRange withStart(java.util.Date start) {
        setStart(start);
        return this;
    }

    /**
     * <p>
     * The time range's end time.
     * </p>
     * <note>Specify null to leave the time range's end time open-ended.</note>
     * 
     * @param end
     *        The time range's end time.</p> <note>Specify null to leave the
     *        time range's end time open-ended.
     */
    public void setEnd(java.util.Date end) {
        this.end = end;
    }

    /**
     * <p>
     * The time range's end time.
     * </p>
     * <note>Specify null to leave the time range's end time open-ended.</note>
     * 
     * @return The time range's end time.</p> <note>Specify null to leave the
     *         time range's end time open-ended.
     */
    public java.util.Date getEnd() {
        return this.end;
    }

    /**
     * <p>
     * The time range's end time.
     * </p>
     * <note>Specify null to leave the time range's end time open-ended.</note>
     * 
     * @param end
     *        The time range's end time.</p> <note>Specify null to leave the
     *        time range's end time open-ended.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public TimeRange withEnd(java.util.Date end) {
        setEnd(end);
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
        if (getStart() != null)
            sb.append("Start: " + getStart() + ",");
        if (getEnd() != null)
            sb.append("End: " + getEnd());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TimeRange == false)
            return false;
        TimeRange other = (TimeRange) obj;
        if (other.getStart() == null ^ this.getStart() == null)
            return false;
        if (other.getStart() != null
                && other.getStart().equals(this.getStart()) == false)
            return false;
        if (other.getEnd() == null ^ this.getEnd() == null)
            return false;
        if (other.getEnd() != null
                && other.getEnd().equals(this.getEnd()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getStart() == null) ? 0 : getStart().hashCode());
        hashCode = prime * hashCode
                + ((getEnd() == null) ? 0 : getEnd().hashCode());
        return hashCode;
    }

    @Override
    public TimeRange clone() {
        try {
            return (TimeRange) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}