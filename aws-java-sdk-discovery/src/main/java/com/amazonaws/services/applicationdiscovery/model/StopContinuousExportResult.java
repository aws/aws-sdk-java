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
package com.amazonaws.services.applicationdiscovery.model;

import java.io.Serializable;
import javax.annotation.Generated;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StopContinuousExportResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Timestamp that represents when this continuous export started collecting data.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * Timestamp that represents when this continuous export was stopped.
     * </p>
     */
    private java.util.Date stopTime;

    /**
     * <p>
     * Timestamp that represents when this continuous export started collecting data.
     * </p>
     * 
     * @param startTime
     *        Timestamp that represents when this continuous export started collecting data.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * Timestamp that represents when this continuous export started collecting data.
     * </p>
     * 
     * @return Timestamp that represents when this continuous export started collecting data.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * Timestamp that represents when this continuous export started collecting data.
     * </p>
     * 
     * @param startTime
     *        Timestamp that represents when this continuous export started collecting data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StopContinuousExportResult withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * Timestamp that represents when this continuous export was stopped.
     * </p>
     * 
     * @param stopTime
     *        Timestamp that represents when this continuous export was stopped.
     */

    public void setStopTime(java.util.Date stopTime) {
        this.stopTime = stopTime;
    }

    /**
     * <p>
     * Timestamp that represents when this continuous export was stopped.
     * </p>
     * 
     * @return Timestamp that represents when this continuous export was stopped.
     */

    public java.util.Date getStopTime() {
        return this.stopTime;
    }

    /**
     * <p>
     * Timestamp that represents when this continuous export was stopped.
     * </p>
     * 
     * @param stopTime
     *        Timestamp that represents when this continuous export was stopped.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StopContinuousExportResult withStopTime(java.util.Date stopTime) {
        setStopTime(stopTime);
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
        if (getStopTime() != null)
            sb.append("StopTime: ").append(getStopTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StopContinuousExportResult == false)
            return false;
        StopContinuousExportResult other = (StopContinuousExportResult) obj;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getStopTime() == null ^ this.getStopTime() == null)
            return false;
        if (other.getStopTime() != null && other.getStopTime().equals(this.getStopTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getStopTime() == null) ? 0 : getStopTime().hashCode());
        return hashCode;
    }

    @Override
    public StopContinuousExportResult clone() {
        try {
            return (StopContinuousExportResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
