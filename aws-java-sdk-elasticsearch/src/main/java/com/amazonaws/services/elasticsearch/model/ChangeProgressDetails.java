/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.elasticsearch.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies change details of the domain configuration change.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ChangeProgressDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique change identifier associated with a specific domain configuration change.
     * </p>
     */
    private String changeId;
    /**
     * <p>
     * Contains an optional message associated with the domain configuration change.
     * </p>
     */
    private String message;
    /**
     * <p>
     * The current status of the configuration change.
     * </p>
     */
    private String configChangeStatus;
    /**
     * <p>
     * The time that the configuration change was initiated, in Universal Coordinated Time (UTC).
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The last time that the configuration change was updated.
     * </p>
     */
    private java.util.Date lastUpdatedTime;
    /**
     * <p>
     * The IAM principal who initiated the configuration change.
     * </p>
     */
    private String initiatedBy;

    /**
     * <p>
     * The unique change identifier associated with a specific domain configuration change.
     * </p>
     * 
     * @param changeId
     *        The unique change identifier associated with a specific domain configuration change.
     */

    public void setChangeId(String changeId) {
        this.changeId = changeId;
    }

    /**
     * <p>
     * The unique change identifier associated with a specific domain configuration change.
     * </p>
     * 
     * @return The unique change identifier associated with a specific domain configuration change.
     */

    public String getChangeId() {
        return this.changeId;
    }

    /**
     * <p>
     * The unique change identifier associated with a specific domain configuration change.
     * </p>
     * 
     * @param changeId
     *        The unique change identifier associated with a specific domain configuration change.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChangeProgressDetails withChangeId(String changeId) {
        setChangeId(changeId);
        return this;
    }

    /**
     * <p>
     * Contains an optional message associated with the domain configuration change.
     * </p>
     * 
     * @param message
     *        Contains an optional message associated with the domain configuration change.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * Contains an optional message associated with the domain configuration change.
     * </p>
     * 
     * @return Contains an optional message associated with the domain configuration change.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * Contains an optional message associated with the domain configuration change.
     * </p>
     * 
     * @param message
     *        Contains an optional message associated with the domain configuration change.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChangeProgressDetails withMessage(String message) {
        setMessage(message);
        return this;
    }

    /**
     * <p>
     * The current status of the configuration change.
     * </p>
     * 
     * @param configChangeStatus
     *        The current status of the configuration change.
     * @see ConfigChangeStatus
     */

    public void setConfigChangeStatus(String configChangeStatus) {
        this.configChangeStatus = configChangeStatus;
    }

    /**
     * <p>
     * The current status of the configuration change.
     * </p>
     * 
     * @return The current status of the configuration change.
     * @see ConfigChangeStatus
     */

    public String getConfigChangeStatus() {
        return this.configChangeStatus;
    }

    /**
     * <p>
     * The current status of the configuration change.
     * </p>
     * 
     * @param configChangeStatus
     *        The current status of the configuration change.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConfigChangeStatus
     */

    public ChangeProgressDetails withConfigChangeStatus(String configChangeStatus) {
        setConfigChangeStatus(configChangeStatus);
        return this;
    }

    /**
     * <p>
     * The current status of the configuration change.
     * </p>
     * 
     * @param configChangeStatus
     *        The current status of the configuration change.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConfigChangeStatus
     */

    public ChangeProgressDetails withConfigChangeStatus(ConfigChangeStatus configChangeStatus) {
        this.configChangeStatus = configChangeStatus.toString();
        return this;
    }

    /**
     * <p>
     * The time that the configuration change was initiated, in Universal Coordinated Time (UTC).
     * </p>
     * 
     * @param startTime
     *        The time that the configuration change was initiated, in Universal Coordinated Time (UTC).
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The time that the configuration change was initiated, in Universal Coordinated Time (UTC).
     * </p>
     * 
     * @return The time that the configuration change was initiated, in Universal Coordinated Time (UTC).
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The time that the configuration change was initiated, in Universal Coordinated Time (UTC).
     * </p>
     * 
     * @param startTime
     *        The time that the configuration change was initiated, in Universal Coordinated Time (UTC).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChangeProgressDetails withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The last time that the configuration change was updated.
     * </p>
     * 
     * @param lastUpdatedTime
     *        The last time that the configuration change was updated.
     */

    public void setLastUpdatedTime(java.util.Date lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    /**
     * <p>
     * The last time that the configuration change was updated.
     * </p>
     * 
     * @return The last time that the configuration change was updated.
     */

    public java.util.Date getLastUpdatedTime() {
        return this.lastUpdatedTime;
    }

    /**
     * <p>
     * The last time that the configuration change was updated.
     * </p>
     * 
     * @param lastUpdatedTime
     *        The last time that the configuration change was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChangeProgressDetails withLastUpdatedTime(java.util.Date lastUpdatedTime) {
        setLastUpdatedTime(lastUpdatedTime);
        return this;
    }

    /**
     * <p>
     * The IAM principal who initiated the configuration change.
     * </p>
     * 
     * @param initiatedBy
     *        The IAM principal who initiated the configuration change.
     * @see InitiatedBy
     */

    public void setInitiatedBy(String initiatedBy) {
        this.initiatedBy = initiatedBy;
    }

    /**
     * <p>
     * The IAM principal who initiated the configuration change.
     * </p>
     * 
     * @return The IAM principal who initiated the configuration change.
     * @see InitiatedBy
     */

    public String getInitiatedBy() {
        return this.initiatedBy;
    }

    /**
     * <p>
     * The IAM principal who initiated the configuration change.
     * </p>
     * 
     * @param initiatedBy
     *        The IAM principal who initiated the configuration change.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InitiatedBy
     */

    public ChangeProgressDetails withInitiatedBy(String initiatedBy) {
        setInitiatedBy(initiatedBy);
        return this;
    }

    /**
     * <p>
     * The IAM principal who initiated the configuration change.
     * </p>
     * 
     * @param initiatedBy
     *        The IAM principal who initiated the configuration change.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InitiatedBy
     */

    public ChangeProgressDetails withInitiatedBy(InitiatedBy initiatedBy) {
        this.initiatedBy = initiatedBy.toString();
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
        if (getChangeId() != null)
            sb.append("ChangeId: ").append(getChangeId()).append(",");
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage()).append(",");
        if (getConfigChangeStatus() != null)
            sb.append("ConfigChangeStatus: ").append(getConfigChangeStatus()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getLastUpdatedTime() != null)
            sb.append("LastUpdatedTime: ").append(getLastUpdatedTime()).append(",");
        if (getInitiatedBy() != null)
            sb.append("InitiatedBy: ").append(getInitiatedBy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ChangeProgressDetails == false)
            return false;
        ChangeProgressDetails other = (ChangeProgressDetails) obj;
        if (other.getChangeId() == null ^ this.getChangeId() == null)
            return false;
        if (other.getChangeId() != null && other.getChangeId().equals(this.getChangeId()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        if (other.getConfigChangeStatus() == null ^ this.getConfigChangeStatus() == null)
            return false;
        if (other.getConfigChangeStatus() != null && other.getConfigChangeStatus().equals(this.getConfigChangeStatus()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getLastUpdatedTime() == null ^ this.getLastUpdatedTime() == null)
            return false;
        if (other.getLastUpdatedTime() != null && other.getLastUpdatedTime().equals(this.getLastUpdatedTime()) == false)
            return false;
        if (other.getInitiatedBy() == null ^ this.getInitiatedBy() == null)
            return false;
        if (other.getInitiatedBy() != null && other.getInitiatedBy().equals(this.getInitiatedBy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChangeId() == null) ? 0 : getChangeId().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode + ((getConfigChangeStatus() == null) ? 0 : getConfigChangeStatus().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedTime() == null) ? 0 : getLastUpdatedTime().hashCode());
        hashCode = prime * hashCode + ((getInitiatedBy() == null) ? 0 : getInitiatedBy().hashCode());
        return hashCode;
    }

    @Override
    public ChangeProgressDetails clone() {
        try {
            return (ChangeProgressDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.elasticsearch.model.transform.ChangeProgressDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
