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
package com.amazonaws.services.iotanalytics.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Summary information about data set contents.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/DatasetContentSummary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DatasetContentSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The version of the data set contents.
     * </p>
     */
    private String version;
    /**
     * <p>
     * The status of the data set contents.
     * </p>
     */
    private DatasetContentStatus status;
    /**
     * <p>
     * The actual time the creation of the data set contents was started.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The time the creation of the data set contents was scheduled to start.
     * </p>
     */
    private java.util.Date scheduleTime;

    /**
     * <p>
     * The version of the data set contents.
     * </p>
     * 
     * @param version
     *        The version of the data set contents.
     */

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * The version of the data set contents.
     * </p>
     * 
     * @return The version of the data set contents.
     */

    public String getVersion() {
        return this.version;
    }

    /**
     * <p>
     * The version of the data set contents.
     * </p>
     * 
     * @param version
     *        The version of the data set contents.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasetContentSummary withVersion(String version) {
        setVersion(version);
        return this;
    }

    /**
     * <p>
     * The status of the data set contents.
     * </p>
     * 
     * @param status
     *        The status of the data set contents.
     */

    public void setStatus(DatasetContentStatus status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the data set contents.
     * </p>
     * 
     * @return The status of the data set contents.
     */

    public DatasetContentStatus getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the data set contents.
     * </p>
     * 
     * @param status
     *        The status of the data set contents.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasetContentSummary withStatus(DatasetContentStatus status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The actual time the creation of the data set contents was started.
     * </p>
     * 
     * @param creationTime
     *        The actual time the creation of the data set contents was started.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The actual time the creation of the data set contents was started.
     * </p>
     * 
     * @return The actual time the creation of the data set contents was started.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The actual time the creation of the data set contents was started.
     * </p>
     * 
     * @param creationTime
     *        The actual time the creation of the data set contents was started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasetContentSummary withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The time the creation of the data set contents was scheduled to start.
     * </p>
     * 
     * @param scheduleTime
     *        The time the creation of the data set contents was scheduled to start.
     */

    public void setScheduleTime(java.util.Date scheduleTime) {
        this.scheduleTime = scheduleTime;
    }

    /**
     * <p>
     * The time the creation of the data set contents was scheduled to start.
     * </p>
     * 
     * @return The time the creation of the data set contents was scheduled to start.
     */

    public java.util.Date getScheduleTime() {
        return this.scheduleTime;
    }

    /**
     * <p>
     * The time the creation of the data set contents was scheduled to start.
     * </p>
     * 
     * @param scheduleTime
     *        The time the creation of the data set contents was scheduled to start.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasetContentSummary withScheduleTime(java.util.Date scheduleTime) {
        setScheduleTime(scheduleTime);
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
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getScheduleTime() != null)
            sb.append("ScheduleTime: ").append(getScheduleTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DatasetContentSummary == false)
            return false;
        DatasetContentSummary other = (DatasetContentSummary) obj;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getScheduleTime() == null ^ this.getScheduleTime() == null)
            return false;
        if (other.getScheduleTime() != null && other.getScheduleTime().equals(this.getScheduleTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getScheduleTime() == null) ? 0 : getScheduleTime().hashCode());
        return hashCode;
    }

    @Override
    public DatasetContentSummary clone() {
        try {
            return (DatasetContentSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotanalytics.model.transform.DatasetContentSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
