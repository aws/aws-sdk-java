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
package com.amazonaws.services.lookoutequipment.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about the specific inference event, including start and end time, diagnostics information, event
 * duration and so on.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/InferenceEventSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InferenceEventSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the inference scheduler being used for the inference event.
     * </p>
     */
    private String inferenceSchedulerArn;
    /**
     * <p>
     * The name of the inference scheduler being used for the inference events.
     * </p>
     */
    private String inferenceSchedulerName;
    /**
     * <p>
     * Indicates the starting time of an inference event.
     * </p>
     */
    private java.util.Date eventStartTime;
    /**
     * <p>
     * Indicates the ending time of an inference event.
     * </p>
     */
    private java.util.Date eventEndTime;
    /**
     * <p>
     * An array which specifies the names and values of all sensors contributing to an inference event.
     * </p>
     */
    private String diagnostics;
    /**
     * <p>
     * Indicates the size of an inference event in seconds.
     * </p>
     */
    private Long eventDurationInSeconds;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the inference scheduler being used for the inference event.
     * </p>
     * 
     * @param inferenceSchedulerArn
     *        The Amazon Resource Name (ARN) of the inference scheduler being used for the inference event.
     */

    public void setInferenceSchedulerArn(String inferenceSchedulerArn) {
        this.inferenceSchedulerArn = inferenceSchedulerArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the inference scheduler being used for the inference event.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the inference scheduler being used for the inference event.
     */

    public String getInferenceSchedulerArn() {
        return this.inferenceSchedulerArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the inference scheduler being used for the inference event.
     * </p>
     * 
     * @param inferenceSchedulerArn
     *        The Amazon Resource Name (ARN) of the inference scheduler being used for the inference event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InferenceEventSummary withInferenceSchedulerArn(String inferenceSchedulerArn) {
        setInferenceSchedulerArn(inferenceSchedulerArn);
        return this;
    }

    /**
     * <p>
     * The name of the inference scheduler being used for the inference events.
     * </p>
     * 
     * @param inferenceSchedulerName
     *        The name of the inference scheduler being used for the inference events.
     */

    public void setInferenceSchedulerName(String inferenceSchedulerName) {
        this.inferenceSchedulerName = inferenceSchedulerName;
    }

    /**
     * <p>
     * The name of the inference scheduler being used for the inference events.
     * </p>
     * 
     * @return The name of the inference scheduler being used for the inference events.
     */

    public String getInferenceSchedulerName() {
        return this.inferenceSchedulerName;
    }

    /**
     * <p>
     * The name of the inference scheduler being used for the inference events.
     * </p>
     * 
     * @param inferenceSchedulerName
     *        The name of the inference scheduler being used for the inference events.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InferenceEventSummary withInferenceSchedulerName(String inferenceSchedulerName) {
        setInferenceSchedulerName(inferenceSchedulerName);
        return this;
    }

    /**
     * <p>
     * Indicates the starting time of an inference event.
     * </p>
     * 
     * @param eventStartTime
     *        Indicates the starting time of an inference event.
     */

    public void setEventStartTime(java.util.Date eventStartTime) {
        this.eventStartTime = eventStartTime;
    }

    /**
     * <p>
     * Indicates the starting time of an inference event.
     * </p>
     * 
     * @return Indicates the starting time of an inference event.
     */

    public java.util.Date getEventStartTime() {
        return this.eventStartTime;
    }

    /**
     * <p>
     * Indicates the starting time of an inference event.
     * </p>
     * 
     * @param eventStartTime
     *        Indicates the starting time of an inference event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InferenceEventSummary withEventStartTime(java.util.Date eventStartTime) {
        setEventStartTime(eventStartTime);
        return this;
    }

    /**
     * <p>
     * Indicates the ending time of an inference event.
     * </p>
     * 
     * @param eventEndTime
     *        Indicates the ending time of an inference event.
     */

    public void setEventEndTime(java.util.Date eventEndTime) {
        this.eventEndTime = eventEndTime;
    }

    /**
     * <p>
     * Indicates the ending time of an inference event.
     * </p>
     * 
     * @return Indicates the ending time of an inference event.
     */

    public java.util.Date getEventEndTime() {
        return this.eventEndTime;
    }

    /**
     * <p>
     * Indicates the ending time of an inference event.
     * </p>
     * 
     * @param eventEndTime
     *        Indicates the ending time of an inference event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InferenceEventSummary withEventEndTime(java.util.Date eventEndTime) {
        setEventEndTime(eventEndTime);
        return this;
    }

    /**
     * <p>
     * An array which specifies the names and values of all sensors contributing to an inference event.
     * </p>
     * 
     * @param diagnostics
     *        An array which specifies the names and values of all sensors contributing to an inference event.
     */

    public void setDiagnostics(String diagnostics) {
        this.diagnostics = diagnostics;
    }

    /**
     * <p>
     * An array which specifies the names and values of all sensors contributing to an inference event.
     * </p>
     * 
     * @return An array which specifies the names and values of all sensors contributing to an inference event.
     */

    public String getDiagnostics() {
        return this.diagnostics;
    }

    /**
     * <p>
     * An array which specifies the names and values of all sensors contributing to an inference event.
     * </p>
     * 
     * @param diagnostics
     *        An array which specifies the names and values of all sensors contributing to an inference event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InferenceEventSummary withDiagnostics(String diagnostics) {
        setDiagnostics(diagnostics);
        return this;
    }

    /**
     * <p>
     * Indicates the size of an inference event in seconds.
     * </p>
     * 
     * @param eventDurationInSeconds
     *        Indicates the size of an inference event in seconds.
     */

    public void setEventDurationInSeconds(Long eventDurationInSeconds) {
        this.eventDurationInSeconds = eventDurationInSeconds;
    }

    /**
     * <p>
     * Indicates the size of an inference event in seconds.
     * </p>
     * 
     * @return Indicates the size of an inference event in seconds.
     */

    public Long getEventDurationInSeconds() {
        return this.eventDurationInSeconds;
    }

    /**
     * <p>
     * Indicates the size of an inference event in seconds.
     * </p>
     * 
     * @param eventDurationInSeconds
     *        Indicates the size of an inference event in seconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InferenceEventSummary withEventDurationInSeconds(Long eventDurationInSeconds) {
        setEventDurationInSeconds(eventDurationInSeconds);
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
        if (getInferenceSchedulerArn() != null)
            sb.append("InferenceSchedulerArn: ").append(getInferenceSchedulerArn()).append(",");
        if (getInferenceSchedulerName() != null)
            sb.append("InferenceSchedulerName: ").append(getInferenceSchedulerName()).append(",");
        if (getEventStartTime() != null)
            sb.append("EventStartTime: ").append(getEventStartTime()).append(",");
        if (getEventEndTime() != null)
            sb.append("EventEndTime: ").append(getEventEndTime()).append(",");
        if (getDiagnostics() != null)
            sb.append("Diagnostics: ").append(getDiagnostics()).append(",");
        if (getEventDurationInSeconds() != null)
            sb.append("EventDurationInSeconds: ").append(getEventDurationInSeconds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InferenceEventSummary == false)
            return false;
        InferenceEventSummary other = (InferenceEventSummary) obj;
        if (other.getInferenceSchedulerArn() == null ^ this.getInferenceSchedulerArn() == null)
            return false;
        if (other.getInferenceSchedulerArn() != null && other.getInferenceSchedulerArn().equals(this.getInferenceSchedulerArn()) == false)
            return false;
        if (other.getInferenceSchedulerName() == null ^ this.getInferenceSchedulerName() == null)
            return false;
        if (other.getInferenceSchedulerName() != null && other.getInferenceSchedulerName().equals(this.getInferenceSchedulerName()) == false)
            return false;
        if (other.getEventStartTime() == null ^ this.getEventStartTime() == null)
            return false;
        if (other.getEventStartTime() != null && other.getEventStartTime().equals(this.getEventStartTime()) == false)
            return false;
        if (other.getEventEndTime() == null ^ this.getEventEndTime() == null)
            return false;
        if (other.getEventEndTime() != null && other.getEventEndTime().equals(this.getEventEndTime()) == false)
            return false;
        if (other.getDiagnostics() == null ^ this.getDiagnostics() == null)
            return false;
        if (other.getDiagnostics() != null && other.getDiagnostics().equals(this.getDiagnostics()) == false)
            return false;
        if (other.getEventDurationInSeconds() == null ^ this.getEventDurationInSeconds() == null)
            return false;
        if (other.getEventDurationInSeconds() != null && other.getEventDurationInSeconds().equals(this.getEventDurationInSeconds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInferenceSchedulerArn() == null) ? 0 : getInferenceSchedulerArn().hashCode());
        hashCode = prime * hashCode + ((getInferenceSchedulerName() == null) ? 0 : getInferenceSchedulerName().hashCode());
        hashCode = prime * hashCode + ((getEventStartTime() == null) ? 0 : getEventStartTime().hashCode());
        hashCode = prime * hashCode + ((getEventEndTime() == null) ? 0 : getEventEndTime().hashCode());
        hashCode = prime * hashCode + ((getDiagnostics() == null) ? 0 : getDiagnostics().hashCode());
        hashCode = prime * hashCode + ((getEventDurationInSeconds() == null) ? 0 : getEventDurationInSeconds().hashCode());
        return hashCode;
    }

    @Override
    public InferenceEventSummary clone() {
        try {
            return (InferenceEventSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lookoutequipment.model.transform.InferenceEventSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
