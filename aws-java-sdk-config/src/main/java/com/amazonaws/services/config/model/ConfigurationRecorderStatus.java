/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.config.model;

import java.io.Serializable;

/**
 * <p>
 * The current status of the configuration recorder.
 * </p>
 */
public class ConfigurationRecorderStatus implements Serializable {

    /**
     * The name of the configuration recorder.
     */
    private String name;

    /**
     * The time the recorder was last started.
     */
    private java.util.Date lastStartTime;

    /**
     * The time the recorder was last stopped.
     */
    private java.util.Date lastStopTime;

    /**
     * Specifies whether the recorder is currently recording or not.
     */
    private Boolean recording;

    /**
     * The last (previous) status of the recorder.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, Success, Failure
     */
    private String lastStatus;

    /**
     * The error code indicating that the recording failed.
     */
    private String lastErrorCode;

    /**
     * The message indicating that the recording failed due to an error.
     */
    private String lastErrorMessage;

    /**
     * The time when the status was last changed.
     */
    private java.util.Date lastStatusChangeTime;

    /**
     * The name of the configuration recorder.
     *
     * @return The name of the configuration recorder.
     */
    public String getName() {
        return name;
    }
    
    /**
     * The name of the configuration recorder.
     *
     * @param name The name of the configuration recorder.
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * The name of the configuration recorder.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param name The name of the configuration recorder.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ConfigurationRecorderStatus withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * The time the recorder was last started.
     *
     * @return The time the recorder was last started.
     */
    public java.util.Date getLastStartTime() {
        return lastStartTime;
    }
    
    /**
     * The time the recorder was last started.
     *
     * @param lastStartTime The time the recorder was last started.
     */
    public void setLastStartTime(java.util.Date lastStartTime) {
        this.lastStartTime = lastStartTime;
    }
    
    /**
     * The time the recorder was last started.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param lastStartTime The time the recorder was last started.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ConfigurationRecorderStatus withLastStartTime(java.util.Date lastStartTime) {
        this.lastStartTime = lastStartTime;
        return this;
    }

    /**
     * The time the recorder was last stopped.
     *
     * @return The time the recorder was last stopped.
     */
    public java.util.Date getLastStopTime() {
        return lastStopTime;
    }
    
    /**
     * The time the recorder was last stopped.
     *
     * @param lastStopTime The time the recorder was last stopped.
     */
    public void setLastStopTime(java.util.Date lastStopTime) {
        this.lastStopTime = lastStopTime;
    }
    
    /**
     * The time the recorder was last stopped.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param lastStopTime The time the recorder was last stopped.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ConfigurationRecorderStatus withLastStopTime(java.util.Date lastStopTime) {
        this.lastStopTime = lastStopTime;
        return this;
    }

    /**
     * Specifies whether the recorder is currently recording or not.
     *
     * @return Specifies whether the recorder is currently recording or not.
     */
    public Boolean isRecording() {
        return recording;
    }
    
    /**
     * Specifies whether the recorder is currently recording or not.
     *
     * @param recording Specifies whether the recorder is currently recording or not.
     */
    public void setRecording(Boolean recording) {
        this.recording = recording;
    }
    
    /**
     * Specifies whether the recorder is currently recording or not.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param recording Specifies whether the recorder is currently recording or not.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ConfigurationRecorderStatus withRecording(Boolean recording) {
        this.recording = recording;
        return this;
    }

    /**
     * Specifies whether the recorder is currently recording or not.
     *
     * @return Specifies whether the recorder is currently recording or not.
     */
    public Boolean getRecording() {
        return recording;
    }

    /**
     * The last (previous) status of the recorder.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, Success, Failure
     *
     * @return The last (previous) status of the recorder.
     *
     * @see RecorderStatus
     */
    public String getLastStatus() {
        return lastStatus;
    }
    
    /**
     * The last (previous) status of the recorder.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, Success, Failure
     *
     * @param lastStatus The last (previous) status of the recorder.
     *
     * @see RecorderStatus
     */
    public void setLastStatus(String lastStatus) {
        this.lastStatus = lastStatus;
    }
    
    /**
     * The last (previous) status of the recorder.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, Success, Failure
     *
     * @param lastStatus The last (previous) status of the recorder.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see RecorderStatus
     */
    public ConfigurationRecorderStatus withLastStatus(String lastStatus) {
        this.lastStatus = lastStatus;
        return this;
    }

    /**
     * The last (previous) status of the recorder.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, Success, Failure
     *
     * @param lastStatus The last (previous) status of the recorder.
     *
     * @see RecorderStatus
     */
    public void setLastStatus(RecorderStatus lastStatus) {
        this.lastStatus = lastStatus.toString();
    }
    
    /**
     * The last (previous) status of the recorder.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, Success, Failure
     *
     * @param lastStatus The last (previous) status of the recorder.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see RecorderStatus
     */
    public ConfigurationRecorderStatus withLastStatus(RecorderStatus lastStatus) {
        this.lastStatus = lastStatus.toString();
        return this;
    }

    /**
     * The error code indicating that the recording failed.
     *
     * @return The error code indicating that the recording failed.
     */
    public String getLastErrorCode() {
        return lastErrorCode;
    }
    
    /**
     * The error code indicating that the recording failed.
     *
     * @param lastErrorCode The error code indicating that the recording failed.
     */
    public void setLastErrorCode(String lastErrorCode) {
        this.lastErrorCode = lastErrorCode;
    }
    
    /**
     * The error code indicating that the recording failed.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param lastErrorCode The error code indicating that the recording failed.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ConfigurationRecorderStatus withLastErrorCode(String lastErrorCode) {
        this.lastErrorCode = lastErrorCode;
        return this;
    }

    /**
     * The message indicating that the recording failed due to an error.
     *
     * @return The message indicating that the recording failed due to an error.
     */
    public String getLastErrorMessage() {
        return lastErrorMessage;
    }
    
    /**
     * The message indicating that the recording failed due to an error.
     *
     * @param lastErrorMessage The message indicating that the recording failed due to an error.
     */
    public void setLastErrorMessage(String lastErrorMessage) {
        this.lastErrorMessage = lastErrorMessage;
    }
    
    /**
     * The message indicating that the recording failed due to an error.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param lastErrorMessage The message indicating that the recording failed due to an error.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ConfigurationRecorderStatus withLastErrorMessage(String lastErrorMessage) {
        this.lastErrorMessage = lastErrorMessage;
        return this;
    }

    /**
     * The time when the status was last changed.
     *
     * @return The time when the status was last changed.
     */
    public java.util.Date getLastStatusChangeTime() {
        return lastStatusChangeTime;
    }
    
    /**
     * The time when the status was last changed.
     *
     * @param lastStatusChangeTime The time when the status was last changed.
     */
    public void setLastStatusChangeTime(java.util.Date lastStatusChangeTime) {
        this.lastStatusChangeTime = lastStatusChangeTime;
    }
    
    /**
     * The time when the status was last changed.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param lastStatusChangeTime The time when the status was last changed.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ConfigurationRecorderStatus withLastStatusChangeTime(java.util.Date lastStatusChangeTime) {
        this.lastStatusChangeTime = lastStatusChangeTime;
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
        if (getName() != null) sb.append("Name: " + getName() + ",");
        if (getLastStartTime() != null) sb.append("LastStartTime: " + getLastStartTime() + ",");
        if (getLastStopTime() != null) sb.append("LastStopTime: " + getLastStopTime() + ",");
        if (isRecording() != null) sb.append("Recording: " + isRecording() + ",");
        if (getLastStatus() != null) sb.append("LastStatus: " + getLastStatus() + ",");
        if (getLastErrorCode() != null) sb.append("LastErrorCode: " + getLastErrorCode() + ",");
        if (getLastErrorMessage() != null) sb.append("LastErrorMessage: " + getLastErrorMessage() + ",");
        if (getLastStatusChangeTime() != null) sb.append("LastStatusChangeTime: " + getLastStatusChangeTime() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode()); 
        hashCode = prime * hashCode + ((getLastStartTime() == null) ? 0 : getLastStartTime().hashCode()); 
        hashCode = prime * hashCode + ((getLastStopTime() == null) ? 0 : getLastStopTime().hashCode()); 
        hashCode = prime * hashCode + ((isRecording() == null) ? 0 : isRecording().hashCode()); 
        hashCode = prime * hashCode + ((getLastStatus() == null) ? 0 : getLastStatus().hashCode()); 
        hashCode = prime * hashCode + ((getLastErrorCode() == null) ? 0 : getLastErrorCode().hashCode()); 
        hashCode = prime * hashCode + ((getLastErrorMessage() == null) ? 0 : getLastErrorMessage().hashCode()); 
        hashCode = prime * hashCode + ((getLastStatusChangeTime() == null) ? 0 : getLastStatusChangeTime().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ConfigurationRecorderStatus == false) return false;
        ConfigurationRecorderStatus other = (ConfigurationRecorderStatus)obj;
        
        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false; 
        if (other.getLastStartTime() == null ^ this.getLastStartTime() == null) return false;
        if (other.getLastStartTime() != null && other.getLastStartTime().equals(this.getLastStartTime()) == false) return false; 
        if (other.getLastStopTime() == null ^ this.getLastStopTime() == null) return false;
        if (other.getLastStopTime() != null && other.getLastStopTime().equals(this.getLastStopTime()) == false) return false; 
        if (other.isRecording() == null ^ this.isRecording() == null) return false;
        if (other.isRecording() != null && other.isRecording().equals(this.isRecording()) == false) return false; 
        if (other.getLastStatus() == null ^ this.getLastStatus() == null) return false;
        if (other.getLastStatus() != null && other.getLastStatus().equals(this.getLastStatus()) == false) return false; 
        if (other.getLastErrorCode() == null ^ this.getLastErrorCode() == null) return false;
        if (other.getLastErrorCode() != null && other.getLastErrorCode().equals(this.getLastErrorCode()) == false) return false; 
        if (other.getLastErrorMessage() == null ^ this.getLastErrorMessage() == null) return false;
        if (other.getLastErrorMessage() != null && other.getLastErrorMessage().equals(this.getLastErrorMessage()) == false) return false; 
        if (other.getLastStatusChangeTime() == null ^ this.getLastStatusChangeTime() == null) return false;
        if (other.getLastStatusChangeTime() != null && other.getLastStatusChangeTime().equals(this.getLastStatusChangeTime()) == false) return false; 
        return true;
    }
    
}
    