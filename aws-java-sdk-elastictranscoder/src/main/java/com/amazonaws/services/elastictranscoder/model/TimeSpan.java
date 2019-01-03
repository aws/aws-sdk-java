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
package com.amazonaws.services.elastictranscoder.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Settings that determine when a clip begins and how long it lasts.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TimeSpan implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The place in the input file where you want a clip to start. The format can be either HH:mm:ss.SSS (maximum value:
     * 23:59:59.999; SSS is thousandths of a second) or sssss.SSS (maximum value: 86399.999). If you don't specify a
     * value, Elastic Transcoder starts at the beginning of the input file.
     * </p>
     */
    private String startTime;
    /**
     * <p>
     * The duration of the clip. The format can be either HH:mm:ss.SSS (maximum value: 23:59:59.999; SSS is thousandths
     * of a second) or sssss.SSS (maximum value: 86399.999). If you don't specify a value, Elastic Transcoder creates an
     * output file from StartTime to the end of the file.
     * </p>
     * <p>
     * If you specify a value longer than the duration of the input file, Elastic Transcoder transcodes the file and
     * returns a warning message.
     * </p>
     */
    private String duration;

    /**
     * <p>
     * The place in the input file where you want a clip to start. The format can be either HH:mm:ss.SSS (maximum value:
     * 23:59:59.999; SSS is thousandths of a second) or sssss.SSS (maximum value: 86399.999). If you don't specify a
     * value, Elastic Transcoder starts at the beginning of the input file.
     * </p>
     * 
     * @param startTime
     *        The place in the input file where you want a clip to start. The format can be either HH:mm:ss.SSS (maximum
     *        value: 23:59:59.999; SSS is thousandths of a second) or sssss.SSS (maximum value: 86399.999). If you don't
     *        specify a value, Elastic Transcoder starts at the beginning of the input file.
     */

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The place in the input file where you want a clip to start. The format can be either HH:mm:ss.SSS (maximum value:
     * 23:59:59.999; SSS is thousandths of a second) or sssss.SSS (maximum value: 86399.999). If you don't specify a
     * value, Elastic Transcoder starts at the beginning of the input file.
     * </p>
     * 
     * @return The place in the input file where you want a clip to start. The format can be either HH:mm:ss.SSS
     *         (maximum value: 23:59:59.999; SSS is thousandths of a second) or sssss.SSS (maximum value: 86399.999). If
     *         you don't specify a value, Elastic Transcoder starts at the beginning of the input file.
     */

    public String getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The place in the input file where you want a clip to start. The format can be either HH:mm:ss.SSS (maximum value:
     * 23:59:59.999; SSS is thousandths of a second) or sssss.SSS (maximum value: 86399.999). If you don't specify a
     * value, Elastic Transcoder starts at the beginning of the input file.
     * </p>
     * 
     * @param startTime
     *        The place in the input file where you want a clip to start. The format can be either HH:mm:ss.SSS (maximum
     *        value: 23:59:59.999; SSS is thousandths of a second) or sssss.SSS (maximum value: 86399.999). If you don't
     *        specify a value, Elastic Transcoder starts at the beginning of the input file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TimeSpan withStartTime(String startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The duration of the clip. The format can be either HH:mm:ss.SSS (maximum value: 23:59:59.999; SSS is thousandths
     * of a second) or sssss.SSS (maximum value: 86399.999). If you don't specify a value, Elastic Transcoder creates an
     * output file from StartTime to the end of the file.
     * </p>
     * <p>
     * If you specify a value longer than the duration of the input file, Elastic Transcoder transcodes the file and
     * returns a warning message.
     * </p>
     * 
     * @param duration
     *        The duration of the clip. The format can be either HH:mm:ss.SSS (maximum value: 23:59:59.999; SSS is
     *        thousandths of a second) or sssss.SSS (maximum value: 86399.999). If you don't specify a value, Elastic
     *        Transcoder creates an output file from StartTime to the end of the file.</p>
     *        <p>
     *        If you specify a value longer than the duration of the input file, Elastic Transcoder transcodes the file
     *        and returns a warning message.
     */

    public void setDuration(String duration) {
        this.duration = duration;
    }

    /**
     * <p>
     * The duration of the clip. The format can be either HH:mm:ss.SSS (maximum value: 23:59:59.999; SSS is thousandths
     * of a second) or sssss.SSS (maximum value: 86399.999). If you don't specify a value, Elastic Transcoder creates an
     * output file from StartTime to the end of the file.
     * </p>
     * <p>
     * If you specify a value longer than the duration of the input file, Elastic Transcoder transcodes the file and
     * returns a warning message.
     * </p>
     * 
     * @return The duration of the clip. The format can be either HH:mm:ss.SSS (maximum value: 23:59:59.999; SSS is
     *         thousandths of a second) or sssss.SSS (maximum value: 86399.999). If you don't specify a value, Elastic
     *         Transcoder creates an output file from StartTime to the end of the file.</p>
     *         <p>
     *         If you specify a value longer than the duration of the input file, Elastic Transcoder transcodes the file
     *         and returns a warning message.
     */

    public String getDuration() {
        return this.duration;
    }

    /**
     * <p>
     * The duration of the clip. The format can be either HH:mm:ss.SSS (maximum value: 23:59:59.999; SSS is thousandths
     * of a second) or sssss.SSS (maximum value: 86399.999). If you don't specify a value, Elastic Transcoder creates an
     * output file from StartTime to the end of the file.
     * </p>
     * <p>
     * If you specify a value longer than the duration of the input file, Elastic Transcoder transcodes the file and
     * returns a warning message.
     * </p>
     * 
     * @param duration
     *        The duration of the clip. The format can be either HH:mm:ss.SSS (maximum value: 23:59:59.999; SSS is
     *        thousandths of a second) or sssss.SSS (maximum value: 86399.999). If you don't specify a value, Elastic
     *        Transcoder creates an output file from StartTime to the end of the file.</p>
     *        <p>
     *        If you specify a value longer than the duration of the input file, Elastic Transcoder transcodes the file
     *        and returns a warning message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TimeSpan withDuration(String duration) {
        setDuration(duration);
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
        if (getDuration() != null)
            sb.append("Duration: ").append(getDuration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TimeSpan == false)
            return false;
        TimeSpan other = (TimeSpan) obj;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getDuration() == null ^ this.getDuration() == null)
            return false;
        if (other.getDuration() != null && other.getDuration().equals(this.getDuration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getDuration() == null) ? 0 : getDuration().hashCode());
        return hashCode;
    }

    @Override
    public TimeSpan clone() {
        try {
            return (TimeSpan) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.elastictranscoder.model.transform.TimeSpanMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
