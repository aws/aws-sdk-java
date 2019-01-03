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
package com.amazonaws.services.codedeploy.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a time range.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/TimeRange" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TimeRange implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The start time of the time range.
     * </p>
     * <note>
     * <p>
     * Specify null to leave the start time open-ended.
     * </p>
     * </note>
     */
    private java.util.Date start;
    /**
     * <p>
     * The end time of the time range.
     * </p>
     * <note>
     * <p>
     * Specify null to leave the end time open-ended.
     * </p>
     * </note>
     */
    private java.util.Date end;

    /**
     * <p>
     * The start time of the time range.
     * </p>
     * <note>
     * <p>
     * Specify null to leave the start time open-ended.
     * </p>
     * </note>
     * 
     * @param start
     *        The start time of the time range.</p> <note>
     *        <p>
     *        Specify null to leave the start time open-ended.
     *        </p>
     */

    public void setStart(java.util.Date start) {
        this.start = start;
    }

    /**
     * <p>
     * The start time of the time range.
     * </p>
     * <note>
     * <p>
     * Specify null to leave the start time open-ended.
     * </p>
     * </note>
     * 
     * @return The start time of the time range.</p> <note>
     *         <p>
     *         Specify null to leave the start time open-ended.
     *         </p>
     */

    public java.util.Date getStart() {
        return this.start;
    }

    /**
     * <p>
     * The start time of the time range.
     * </p>
     * <note>
     * <p>
     * Specify null to leave the start time open-ended.
     * </p>
     * </note>
     * 
     * @param start
     *        The start time of the time range.</p> <note>
     *        <p>
     *        Specify null to leave the start time open-ended.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TimeRange withStart(java.util.Date start) {
        setStart(start);
        return this;
    }

    /**
     * <p>
     * The end time of the time range.
     * </p>
     * <note>
     * <p>
     * Specify null to leave the end time open-ended.
     * </p>
     * </note>
     * 
     * @param end
     *        The end time of the time range.</p> <note>
     *        <p>
     *        Specify null to leave the end time open-ended.
     *        </p>
     */

    public void setEnd(java.util.Date end) {
        this.end = end;
    }

    /**
     * <p>
     * The end time of the time range.
     * </p>
     * <note>
     * <p>
     * Specify null to leave the end time open-ended.
     * </p>
     * </note>
     * 
     * @return The end time of the time range.</p> <note>
     *         <p>
     *         Specify null to leave the end time open-ended.
     *         </p>
     */

    public java.util.Date getEnd() {
        return this.end;
    }

    /**
     * <p>
     * The end time of the time range.
     * </p>
     * <note>
     * <p>
     * Specify null to leave the end time open-ended.
     * </p>
     * </note>
     * 
     * @param end
     *        The end time of the time range.</p> <note>
     *        <p>
     *        Specify null to leave the end time open-ended.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TimeRange withEnd(java.util.Date end) {
        setEnd(end);
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
        if (getStart() != null)
            sb.append("Start: ").append(getStart()).append(",");
        if (getEnd() != null)
            sb.append("End: ").append(getEnd());
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
        if (other.getStart() != null && other.getStart().equals(this.getStart()) == false)
            return false;
        if (other.getEnd() == null ^ this.getEnd() == null)
            return false;
        if (other.getEnd() != null && other.getEnd().equals(this.getEnd()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStart() == null) ? 0 : getStart().hashCode());
        hashCode = prime * hashCode + ((getEnd() == null) ? 0 : getEnd().hashCode());
        return hashCode;
    }

    @Override
    public TimeRange clone() {
        try {
            return (TimeRange) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codedeploy.model.transform.TimeRangeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
