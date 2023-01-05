/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.transcribe.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A time range, in milliseconds, between two points in your media file.
 * </p>
 * <p>
 * You can use <code>StartTime</code> and <code>EndTime</code> to search a custom segment. For example, setting
 * <code>StartTime</code> to 10000 and <code>EndTime</code> to 50000 only searches for your specified criteria in the
 * audio contained between the 10,000 millisecond mark and the 50,000 millisecond mark of your media file. You must use
 * <code>StartTime</code> and <code>EndTime</code> as a set; that is, if you include one, you must include both.
 * </p>
 * <p>
 * You can use also <code>First</code> to search from the start of the audio until the time that you specify, or
 * <code>Last</code> to search from the time that you specify until the end of the audio. For example, setting
 * <code>First</code> to 50000 only searches for your specified criteria in the audio contained between the start of the
 * media file to the 50,000 millisecond mark. You can use <code>First</code> and <code>Last</code> independently of each
 * other.
 * </p>
 * <p>
 * If you prefer to use percentage instead of milliseconds, see .
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/AbsoluteTimeRange" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbsoluteTimeRange implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The time, in milliseconds, when Amazon Transcribe starts searching for the specified criteria in your audio. If
     * you include <code>StartTime</code> in your request, you must also include <code>EndTime</code>.
     * </p>
     */
    private Long startTime;
    /**
     * <p>
     * The time, in milliseconds, when Amazon Transcribe stops searching for the specified criteria in your audio. If
     * you include <code>EndTime</code> in your request, you must also include <code>StartTime</code>.
     * </p>
     */
    private Long endTime;
    /**
     * <p>
     * The time, in milliseconds, from the start of your media file until the specified value. Amazon Transcribe
     * searches for your specified criteria in this time segment.
     * </p>
     */
    private Long first;
    /**
     * <p>
     * The time, in milliseconds, from the specified value until the end of your media file. Amazon Transcribe searches
     * for your specified criteria in this time segment.
     * </p>
     */
    private Long last;

    /**
     * <p>
     * The time, in milliseconds, when Amazon Transcribe starts searching for the specified criteria in your audio. If
     * you include <code>StartTime</code> in your request, you must also include <code>EndTime</code>.
     * </p>
     * 
     * @param startTime
     *        The time, in milliseconds, when Amazon Transcribe starts searching for the specified criteria in your
     *        audio. If you include <code>StartTime</code> in your request, you must also include <code>EndTime</code>.
     */

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The time, in milliseconds, when Amazon Transcribe starts searching for the specified criteria in your audio. If
     * you include <code>StartTime</code> in your request, you must also include <code>EndTime</code>.
     * </p>
     * 
     * @return The time, in milliseconds, when Amazon Transcribe starts searching for the specified criteria in your
     *         audio. If you include <code>StartTime</code> in your request, you must also include <code>EndTime</code>.
     */

    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The time, in milliseconds, when Amazon Transcribe starts searching for the specified criteria in your audio. If
     * you include <code>StartTime</code> in your request, you must also include <code>EndTime</code>.
     * </p>
     * 
     * @param startTime
     *        The time, in milliseconds, when Amazon Transcribe starts searching for the specified criteria in your
     *        audio. If you include <code>StartTime</code> in your request, you must also include <code>EndTime</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AbsoluteTimeRange withStartTime(Long startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The time, in milliseconds, when Amazon Transcribe stops searching for the specified criteria in your audio. If
     * you include <code>EndTime</code> in your request, you must also include <code>StartTime</code>.
     * </p>
     * 
     * @param endTime
     *        The time, in milliseconds, when Amazon Transcribe stops searching for the specified criteria in your
     *        audio. If you include <code>EndTime</code> in your request, you must also include <code>StartTime</code>.
     */

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The time, in milliseconds, when Amazon Transcribe stops searching for the specified criteria in your audio. If
     * you include <code>EndTime</code> in your request, you must also include <code>StartTime</code>.
     * </p>
     * 
     * @return The time, in milliseconds, when Amazon Transcribe stops searching for the specified criteria in your
     *         audio. If you include <code>EndTime</code> in your request, you must also include <code>StartTime</code>.
     */

    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The time, in milliseconds, when Amazon Transcribe stops searching for the specified criteria in your audio. If
     * you include <code>EndTime</code> in your request, you must also include <code>StartTime</code>.
     * </p>
     * 
     * @param endTime
     *        The time, in milliseconds, when Amazon Transcribe stops searching for the specified criteria in your
     *        audio. If you include <code>EndTime</code> in your request, you must also include <code>StartTime</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AbsoluteTimeRange withEndTime(Long endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * The time, in milliseconds, from the start of your media file until the specified value. Amazon Transcribe
     * searches for your specified criteria in this time segment.
     * </p>
     * 
     * @param first
     *        The time, in milliseconds, from the start of your media file until the specified value. Amazon Transcribe
     *        searches for your specified criteria in this time segment.
     */

    public void setFirst(Long first) {
        this.first = first;
    }

    /**
     * <p>
     * The time, in milliseconds, from the start of your media file until the specified value. Amazon Transcribe
     * searches for your specified criteria in this time segment.
     * </p>
     * 
     * @return The time, in milliseconds, from the start of your media file until the specified value. Amazon Transcribe
     *         searches for your specified criteria in this time segment.
     */

    public Long getFirst() {
        return this.first;
    }

    /**
     * <p>
     * The time, in milliseconds, from the start of your media file until the specified value. Amazon Transcribe
     * searches for your specified criteria in this time segment.
     * </p>
     * 
     * @param first
     *        The time, in milliseconds, from the start of your media file until the specified value. Amazon Transcribe
     *        searches for your specified criteria in this time segment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AbsoluteTimeRange withFirst(Long first) {
        setFirst(first);
        return this;
    }

    /**
     * <p>
     * The time, in milliseconds, from the specified value until the end of your media file. Amazon Transcribe searches
     * for your specified criteria in this time segment.
     * </p>
     * 
     * @param last
     *        The time, in milliseconds, from the specified value until the end of your media file. Amazon Transcribe
     *        searches for your specified criteria in this time segment.
     */

    public void setLast(Long last) {
        this.last = last;
    }

    /**
     * <p>
     * The time, in milliseconds, from the specified value until the end of your media file. Amazon Transcribe searches
     * for your specified criteria in this time segment.
     * </p>
     * 
     * @return The time, in milliseconds, from the specified value until the end of your media file. Amazon Transcribe
     *         searches for your specified criteria in this time segment.
     */

    public Long getLast() {
        return this.last;
    }

    /**
     * <p>
     * The time, in milliseconds, from the specified value until the end of your media file. Amazon Transcribe searches
     * for your specified criteria in this time segment.
     * </p>
     * 
     * @param last
     *        The time, in milliseconds, from the specified value until the end of your media file. Amazon Transcribe
     *        searches for your specified criteria in this time segment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AbsoluteTimeRange withLast(Long last) {
        setLast(last);
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
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getFirst() != null)
            sb.append("First: ").append(getFirst()).append(",");
        if (getLast() != null)
            sb.append("Last: ").append(getLast());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AbsoluteTimeRange == false)
            return false;
        AbsoluteTimeRange other = (AbsoluteTimeRange) obj;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getFirst() == null ^ this.getFirst() == null)
            return false;
        if (other.getFirst() != null && other.getFirst().equals(this.getFirst()) == false)
            return false;
        if (other.getLast() == null ^ this.getLast() == null)
            return false;
        if (other.getLast() != null && other.getLast().equals(this.getLast()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getFirst() == null) ? 0 : getFirst().hashCode());
        hashCode = prime * hashCode + ((getLast() == null) ? 0 : getLast().hashCode());
        return hashCode;
    }

    @Override
    public AbsoluteTimeRange clone() {
        try {
            return (AbsoluteTimeRange) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.transcribe.model.transform.AbsoluteTimeRangeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
