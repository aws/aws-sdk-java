/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.elastictranscoder.model;

import java.io.Serializable;


/**
 * <p>
 * Settings that determine when a clip begins and how long it lasts.
 * </p>
 */
public class TimeSpan implements Serializable {

    /**
     * The place in the input file where you want a clip to start. The format
     * can be either HH:mm:ss.SSS (maximum value: 23:59:59.999; SSS is
     * thousandths of a second) or sssss.SSS (maximum value: 86399.999). If
     * you don't specify a value, Elastic Transcoder starts at the beginning
     * of the input file.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^\d{1,5}([.]\d{0,3})?$)|(^(((([0-1]?\d)|(2[0-3])):)?(([0-5]?\d):))?(([0-5]?\d))([.]\d{0,3})?$)<br/>
     */
    private String startTime;

    /**
     * The duration of the clip. The format can be either HH:mm:ss.SSS
     * (maximum value: 23:59:59.999; SSS is thousandths of a second) or
     * sssss.SSS (maximum value: 86399.999). If you don't specify a value,
     * Elastic Transcoder creates an output file from StartTime to the end of
     * the file. <p>If you specify a value longer than the duration of the
     * input file , Elastic Transcoder transcodes the file and returns a
     * warning message.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^\d{1,5}([.]\d{0,3})?$)|(^(((([0-1]?\d)|(2[0-3])):)?(([0-5]?\d):))?(([0-5]?\d))([.]\d{0,3})?$)<br/>
     */
    private String duration;

    /**
     * The place in the input file where you want a clip to start. The format
     * can be either HH:mm:ss.SSS (maximum value: 23:59:59.999; SSS is
     * thousandths of a second) or sssss.SSS (maximum value: 86399.999). If
     * you don't specify a value, Elastic Transcoder starts at the beginning
     * of the input file.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^\d{1,5}([.]\d{0,3})?$)|(^(((([0-1]?\d)|(2[0-3])):)?(([0-5]?\d):))?(([0-5]?\d))([.]\d{0,3})?$)<br/>
     *
     * @return The place in the input file where you want a clip to start. The format
     *         can be either HH:mm:ss.SSS (maximum value: 23:59:59.999; SSS is
     *         thousandths of a second) or sssss.SSS (maximum value: 86399.999). If
     *         you don't specify a value, Elastic Transcoder starts at the beginning
     *         of the input file.
     */
    public String getStartTime() {
        return startTime;
    }
    
    /**
     * The place in the input file where you want a clip to start. The format
     * can be either HH:mm:ss.SSS (maximum value: 23:59:59.999; SSS is
     * thousandths of a second) or sssss.SSS (maximum value: 86399.999). If
     * you don't specify a value, Elastic Transcoder starts at the beginning
     * of the input file.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^\d{1,5}([.]\d{0,3})?$)|(^(((([0-1]?\d)|(2[0-3])):)?(([0-5]?\d):))?(([0-5]?\d))([.]\d{0,3})?$)<br/>
     *
     * @param startTime The place in the input file where you want a clip to start. The format
     *         can be either HH:mm:ss.SSS (maximum value: 23:59:59.999; SSS is
     *         thousandths of a second) or sssss.SSS (maximum value: 86399.999). If
     *         you don't specify a value, Elastic Transcoder starts at the beginning
     *         of the input file.
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }
    
    /**
     * The place in the input file where you want a clip to start. The format
     * can be either HH:mm:ss.SSS (maximum value: 23:59:59.999; SSS is
     * thousandths of a second) or sssss.SSS (maximum value: 86399.999). If
     * you don't specify a value, Elastic Transcoder starts at the beginning
     * of the input file.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^\d{1,5}([.]\d{0,3})?$)|(^(((([0-1]?\d)|(2[0-3])):)?(([0-5]?\d):))?(([0-5]?\d))([.]\d{0,3})?$)<br/>
     *
     * @param startTime The place in the input file where you want a clip to start. The format
     *         can be either HH:mm:ss.SSS (maximum value: 23:59:59.999; SSS is
     *         thousandths of a second) or sssss.SSS (maximum value: 86399.999). If
     *         you don't specify a value, Elastic Transcoder starts at the beginning
     *         of the input file.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public TimeSpan withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * The duration of the clip. The format can be either HH:mm:ss.SSS
     * (maximum value: 23:59:59.999; SSS is thousandths of a second) or
     * sssss.SSS (maximum value: 86399.999). If you don't specify a value,
     * Elastic Transcoder creates an output file from StartTime to the end of
     * the file. <p>If you specify a value longer than the duration of the
     * input file , Elastic Transcoder transcodes the file and returns a
     * warning message.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^\d{1,5}([.]\d{0,3})?$)|(^(((([0-1]?\d)|(2[0-3])):)?(([0-5]?\d):))?(([0-5]?\d))([.]\d{0,3})?$)<br/>
     *
     * @return The duration of the clip. The format can be either HH:mm:ss.SSS
     *         (maximum value: 23:59:59.999; SSS is thousandths of a second) or
     *         sssss.SSS (maximum value: 86399.999). If you don't specify a value,
     *         Elastic Transcoder creates an output file from StartTime to the end of
     *         the file. <p>If you specify a value longer than the duration of the
     *         input file , Elastic Transcoder transcodes the file and returns a
     *         warning message.
     */
    public String getDuration() {
        return duration;
    }
    
    /**
     * The duration of the clip. The format can be either HH:mm:ss.SSS
     * (maximum value: 23:59:59.999; SSS is thousandths of a second) or
     * sssss.SSS (maximum value: 86399.999). If you don't specify a value,
     * Elastic Transcoder creates an output file from StartTime to the end of
     * the file. <p>If you specify a value longer than the duration of the
     * input file , Elastic Transcoder transcodes the file and returns a
     * warning message.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^\d{1,5}([.]\d{0,3})?$)|(^(((([0-1]?\d)|(2[0-3])):)?(([0-5]?\d):))?(([0-5]?\d))([.]\d{0,3})?$)<br/>
     *
     * @param duration The duration of the clip. The format can be either HH:mm:ss.SSS
     *         (maximum value: 23:59:59.999; SSS is thousandths of a second) or
     *         sssss.SSS (maximum value: 86399.999). If you don't specify a value,
     *         Elastic Transcoder creates an output file from StartTime to the end of
     *         the file. <p>If you specify a value longer than the duration of the
     *         input file , Elastic Transcoder transcodes the file and returns a
     *         warning message.
     */
    public void setDuration(String duration) {
        this.duration = duration;
    }
    
    /**
     * The duration of the clip. The format can be either HH:mm:ss.SSS
     * (maximum value: 23:59:59.999; SSS is thousandths of a second) or
     * sssss.SSS (maximum value: 86399.999). If you don't specify a value,
     * Elastic Transcoder creates an output file from StartTime to the end of
     * the file. <p>If you specify a value longer than the duration of the
     * input file , Elastic Transcoder transcodes the file and returns a
     * warning message.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^\d{1,5}([.]\d{0,3})?$)|(^(((([0-1]?\d)|(2[0-3])):)?(([0-5]?\d):))?(([0-5]?\d))([.]\d{0,3})?$)<br/>
     *
     * @param duration The duration of the clip. The format can be either HH:mm:ss.SSS
     *         (maximum value: 23:59:59.999; SSS is thousandths of a second) or
     *         sssss.SSS (maximum value: 86399.999). If you don't specify a value,
     *         Elastic Transcoder creates an output file from StartTime to the end of
     *         the file. <p>If you specify a value longer than the duration of the
     *         input file , Elastic Transcoder transcodes the file and returns a
     *         warning message.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public TimeSpan withDuration(String duration) {
        this.duration = duration;
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
        if (getStartTime() != null) sb.append("StartTime: " + getStartTime() + ",");
        if (getDuration() != null) sb.append("Duration: " + getDuration() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof TimeSpan == false) return false;
        TimeSpan other = (TimeSpan)obj;
        
        if (other.getStartTime() == null ^ this.getStartTime() == null) return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false) return false; 
        if (other.getDuration() == null ^ this.getDuration() == null) return false;
        if (other.getDuration() != null && other.getDuration().equals(this.getDuration()) == false) return false; 
        return true;
    }
    
}
    