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
package com.amazonaws.services.config.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The current status of the configuration recorder.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/ConfigurationRecorderStatus" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConfigurationRecorderStatus implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the configuration recorder.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The time the recorder was last started.
     * </p>
     */
    private java.util.Date lastStartTime;
    /**
     * <p>
     * The time the recorder was last stopped.
     * </p>
     */
    private java.util.Date lastStopTime;
    /**
     * <p>
     * Specifies whether or not the recorder is currently recording.
     * </p>
     */
    private Boolean recording;
    /**
     * <p>
     * The last (previous) status of the recorder.
     * </p>
     */
    private String lastStatus;
    /**
     * <p>
     * The error code indicating that the recording failed.
     * </p>
     */
    private String lastErrorCode;
    /**
     * <p>
     * The message indicating that the recording failed due to an error.
     * </p>
     */
    private String lastErrorMessage;
    /**
     * <p>
     * The time when the status was last changed.
     * </p>
     */
    private java.util.Date lastStatusChangeTime;

    /**
     * <p>
     * The name of the configuration recorder.
     * </p>
     * 
     * @param name
     *        The name of the configuration recorder.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the configuration recorder.
     * </p>
     * 
     * @return The name of the configuration recorder.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the configuration recorder.
     * </p>
     * 
     * @param name
     *        The name of the configuration recorder.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigurationRecorderStatus withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The time the recorder was last started.
     * </p>
     * 
     * @param lastStartTime
     *        The time the recorder was last started.
     */

    public void setLastStartTime(java.util.Date lastStartTime) {
        this.lastStartTime = lastStartTime;
    }

    /**
     * <p>
     * The time the recorder was last started.
     * </p>
     * 
     * @return The time the recorder was last started.
     */

    public java.util.Date getLastStartTime() {
        return this.lastStartTime;
    }

    /**
     * <p>
     * The time the recorder was last started.
     * </p>
     * 
     * @param lastStartTime
     *        The time the recorder was last started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigurationRecorderStatus withLastStartTime(java.util.Date lastStartTime) {
        setLastStartTime(lastStartTime);
        return this;
    }

    /**
     * <p>
     * The time the recorder was last stopped.
     * </p>
     * 
     * @param lastStopTime
     *        The time the recorder was last stopped.
     */

    public void setLastStopTime(java.util.Date lastStopTime) {
        this.lastStopTime = lastStopTime;
    }

    /**
     * <p>
     * The time the recorder was last stopped.
     * </p>
     * 
     * @return The time the recorder was last stopped.
     */

    public java.util.Date getLastStopTime() {
        return this.lastStopTime;
    }

    /**
     * <p>
     * The time the recorder was last stopped.
     * </p>
     * 
     * @param lastStopTime
     *        The time the recorder was last stopped.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigurationRecorderStatus withLastStopTime(java.util.Date lastStopTime) {
        setLastStopTime(lastStopTime);
        return this;
    }

    /**
     * <p>
     * Specifies whether or not the recorder is currently recording.
     * </p>
     * 
     * @param recording
     *        Specifies whether or not the recorder is currently recording.
     */

    public void setRecording(Boolean recording) {
        this.recording = recording;
    }

    /**
     * <p>
     * Specifies whether or not the recorder is currently recording.
     * </p>
     * 
     * @return Specifies whether or not the recorder is currently recording.
     */

    public Boolean getRecording() {
        return this.recording;
    }

    /**
     * <p>
     * Specifies whether or not the recorder is currently recording.
     * </p>
     * 
     * @param recording
     *        Specifies whether or not the recorder is currently recording.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigurationRecorderStatus withRecording(Boolean recording) {
        setRecording(recording);
        return this;
    }

    /**
     * <p>
     * Specifies whether or not the recorder is currently recording.
     * </p>
     * 
     * @return Specifies whether or not the recorder is currently recording.
     */

    public Boolean isRecording() {
        return this.recording;
    }

    /**
     * <p>
     * The last (previous) status of the recorder.
     * </p>
     * 
     * @param lastStatus
     *        The last (previous) status of the recorder.
     * @see RecorderStatus
     */

    public void setLastStatus(String lastStatus) {
        this.lastStatus = lastStatus;
    }

    /**
     * <p>
     * The last (previous) status of the recorder.
     * </p>
     * 
     * @return The last (previous) status of the recorder.
     * @see RecorderStatus
     */

    public String getLastStatus() {
        return this.lastStatus;
    }

    /**
     * <p>
     * The last (previous) status of the recorder.
     * </p>
     * 
     * @param lastStatus
     *        The last (previous) status of the recorder.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RecorderStatus
     */

    public ConfigurationRecorderStatus withLastStatus(String lastStatus) {
        setLastStatus(lastStatus);
        return this;
    }

    /**
     * <p>
     * The last (previous) status of the recorder.
     * </p>
     * 
     * @param lastStatus
     *        The last (previous) status of the recorder.
     * @see RecorderStatus
     */

    public void setLastStatus(RecorderStatus lastStatus) {
        withLastStatus(lastStatus);
    }

    /**
     * <p>
     * The last (previous) status of the recorder.
     * </p>
     * 
     * @param lastStatus
     *        The last (previous) status of the recorder.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RecorderStatus
     */

    public ConfigurationRecorderStatus withLastStatus(RecorderStatus lastStatus) {
        this.lastStatus = lastStatus.toString();
        return this;
    }

    /**
     * <p>
     * The error code indicating that the recording failed.
     * </p>
     * 
     * @param lastErrorCode
     *        The error code indicating that the recording failed.
     */

    public void setLastErrorCode(String lastErrorCode) {
        this.lastErrorCode = lastErrorCode;
    }

    /**
     * <p>
     * The error code indicating that the recording failed.
     * </p>
     * 
     * @return The error code indicating that the recording failed.
     */

    public String getLastErrorCode() {
        return this.lastErrorCode;
    }

    /**
     * <p>
     * The error code indicating that the recording failed.
     * </p>
     * 
     * @param lastErrorCode
     *        The error code indicating that the recording failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigurationRecorderStatus withLastErrorCode(String lastErrorCode) {
        setLastErrorCode(lastErrorCode);
        return this;
    }

    /**
     * <p>
     * The message indicating that the recording failed due to an error.
     * </p>
     * 
     * @param lastErrorMessage
     *        The message indicating that the recording failed due to an error.
     */

    public void setLastErrorMessage(String lastErrorMessage) {
        this.lastErrorMessage = lastErrorMessage;
    }

    /**
     * <p>
     * The message indicating that the recording failed due to an error.
     * </p>
     * 
     * @return The message indicating that the recording failed due to an error.
     */

    public String getLastErrorMessage() {
        return this.lastErrorMessage;
    }

    /**
     * <p>
     * The message indicating that the recording failed due to an error.
     * </p>
     * 
     * @param lastErrorMessage
     *        The message indicating that the recording failed due to an error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigurationRecorderStatus withLastErrorMessage(String lastErrorMessage) {
        setLastErrorMessage(lastErrorMessage);
        return this;
    }

    /**
     * <p>
     * The time when the status was last changed.
     * </p>
     * 
     * @param lastStatusChangeTime
     *        The time when the status was last changed.
     */

    public void setLastStatusChangeTime(java.util.Date lastStatusChangeTime) {
        this.lastStatusChangeTime = lastStatusChangeTime;
    }

    /**
     * <p>
     * The time when the status was last changed.
     * </p>
     * 
     * @return The time when the status was last changed.
     */

    public java.util.Date getLastStatusChangeTime() {
        return this.lastStatusChangeTime;
    }

    /**
     * <p>
     * The time when the status was last changed.
     * </p>
     * 
     * @param lastStatusChangeTime
     *        The time when the status was last changed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigurationRecorderStatus withLastStatusChangeTime(java.util.Date lastStatusChangeTime) {
        setLastStatusChangeTime(lastStatusChangeTime);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getLastStartTime() != null)
            sb.append("LastStartTime: ").append(getLastStartTime()).append(",");
        if (getLastStopTime() != null)
            sb.append("LastStopTime: ").append(getLastStopTime()).append(",");
        if (getRecording() != null)
            sb.append("Recording: ").append(getRecording()).append(",");
        if (getLastStatus() != null)
            sb.append("LastStatus: ").append(getLastStatus()).append(",");
        if (getLastErrorCode() != null)
            sb.append("LastErrorCode: ").append(getLastErrorCode()).append(",");
        if (getLastErrorMessage() != null)
            sb.append("LastErrorMessage: ").append(getLastErrorMessage()).append(",");
        if (getLastStatusChangeTime() != null)
            sb.append("LastStatusChangeTime: ").append(getLastStatusChangeTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConfigurationRecorderStatus == false)
            return false;
        ConfigurationRecorderStatus other = (ConfigurationRecorderStatus) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getLastStartTime() == null ^ this.getLastStartTime() == null)
            return false;
        if (other.getLastStartTime() != null && other.getLastStartTime().equals(this.getLastStartTime()) == false)
            return false;
        if (other.getLastStopTime() == null ^ this.getLastStopTime() == null)
            return false;
        if (other.getLastStopTime() != null && other.getLastStopTime().equals(this.getLastStopTime()) == false)
            return false;
        if (other.getRecording() == null ^ this.getRecording() == null)
            return false;
        if (other.getRecording() != null && other.getRecording().equals(this.getRecording()) == false)
            return false;
        if (other.getLastStatus() == null ^ this.getLastStatus() == null)
            return false;
        if (other.getLastStatus() != null && other.getLastStatus().equals(this.getLastStatus()) == false)
            return false;
        if (other.getLastErrorCode() == null ^ this.getLastErrorCode() == null)
            return false;
        if (other.getLastErrorCode() != null && other.getLastErrorCode().equals(this.getLastErrorCode()) == false)
            return false;
        if (other.getLastErrorMessage() == null ^ this.getLastErrorMessage() == null)
            return false;
        if (other.getLastErrorMessage() != null && other.getLastErrorMessage().equals(this.getLastErrorMessage()) == false)
            return false;
        if (other.getLastStatusChangeTime() == null ^ this.getLastStatusChangeTime() == null)
            return false;
        if (other.getLastStatusChangeTime() != null && other.getLastStatusChangeTime().equals(this.getLastStatusChangeTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getLastStartTime() == null) ? 0 : getLastStartTime().hashCode());
        hashCode = prime * hashCode + ((getLastStopTime() == null) ? 0 : getLastStopTime().hashCode());
        hashCode = prime * hashCode + ((getRecording() == null) ? 0 : getRecording().hashCode());
        hashCode = prime * hashCode + ((getLastStatus() == null) ? 0 : getLastStatus().hashCode());
        hashCode = prime * hashCode + ((getLastErrorCode() == null) ? 0 : getLastErrorCode().hashCode());
        hashCode = prime * hashCode + ((getLastErrorMessage() == null) ? 0 : getLastErrorMessage().hashCode());
        hashCode = prime * hashCode + ((getLastStatusChangeTime() == null) ? 0 : getLastStatusChangeTime().hashCode());
        return hashCode;
    }

    @Override
    public ConfigurationRecorderStatus clone() {
        try {
            return (ConfigurationRecorderStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.config.model.transform.ConfigurationRecorderStatusMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
