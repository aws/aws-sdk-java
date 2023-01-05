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
package com.amazonaws.services.elasticsearch.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The progress details of a specific domain configuration change.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ChangeProgressStatusDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique change identifier associated with a specific domain configuration change.
     * </p>
     */
    private String changeId;
    /**
     * <p>
     * The time at which the configuration change is made on the domain.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The overall status of the domain configuration change. This field can take the following values:
     * <code>PENDING</code>, <code>PROCESSING</code>, <code>COMPLETED</code> and <code>FAILED</code>
     * </p>
     */
    private String status;
    /**
     * <p>
     * The list of properties involved in the domain configuration change that are still in pending.
     * </p>
     */
    private java.util.List<String> pendingProperties;
    /**
     * <p>
     * The list of properties involved in the domain configuration change that are completed.
     * </p>
     */
    private java.util.List<String> completedProperties;
    /**
     * <p>
     * The total number of stages required for the configuration change.
     * </p>
     */
    private Integer totalNumberOfStages;
    /**
     * <p>
     * The specific stages that the domain is going through to perform the configuration change.
     * </p>
     */
    private java.util.List<ChangeProgressStage> changeProgressStages;

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

    public ChangeProgressStatusDetails withChangeId(String changeId) {
        setChangeId(changeId);
        return this;
    }

    /**
     * <p>
     * The time at which the configuration change is made on the domain.
     * </p>
     * 
     * @param startTime
     *        The time at which the configuration change is made on the domain.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The time at which the configuration change is made on the domain.
     * </p>
     * 
     * @return The time at which the configuration change is made on the domain.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The time at which the configuration change is made on the domain.
     * </p>
     * 
     * @param startTime
     *        The time at which the configuration change is made on the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChangeProgressStatusDetails withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The overall status of the domain configuration change. This field can take the following values:
     * <code>PENDING</code>, <code>PROCESSING</code>, <code>COMPLETED</code> and <code>FAILED</code>
     * </p>
     * 
     * @param status
     *        The overall status of the domain configuration change. This field can take the following values:
     *        <code>PENDING</code>, <code>PROCESSING</code>, <code>COMPLETED</code> and <code>FAILED</code>
     * @see OverallChangeStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The overall status of the domain configuration change. This field can take the following values:
     * <code>PENDING</code>, <code>PROCESSING</code>, <code>COMPLETED</code> and <code>FAILED</code>
     * </p>
     * 
     * @return The overall status of the domain configuration change. This field can take the following values:
     *         <code>PENDING</code>, <code>PROCESSING</code>, <code>COMPLETED</code> and <code>FAILED</code>
     * @see OverallChangeStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The overall status of the domain configuration change. This field can take the following values:
     * <code>PENDING</code>, <code>PROCESSING</code>, <code>COMPLETED</code> and <code>FAILED</code>
     * </p>
     * 
     * @param status
     *        The overall status of the domain configuration change. This field can take the following values:
     *        <code>PENDING</code>, <code>PROCESSING</code>, <code>COMPLETED</code> and <code>FAILED</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OverallChangeStatus
     */

    public ChangeProgressStatusDetails withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The overall status of the domain configuration change. This field can take the following values:
     * <code>PENDING</code>, <code>PROCESSING</code>, <code>COMPLETED</code> and <code>FAILED</code>
     * </p>
     * 
     * @param status
     *        The overall status of the domain configuration change. This field can take the following values:
     *        <code>PENDING</code>, <code>PROCESSING</code>, <code>COMPLETED</code> and <code>FAILED</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OverallChangeStatus
     */

    public ChangeProgressStatusDetails withStatus(OverallChangeStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The list of properties involved in the domain configuration change that are still in pending.
     * </p>
     * 
     * @return The list of properties involved in the domain configuration change that are still in pending.
     */

    public java.util.List<String> getPendingProperties() {
        return pendingProperties;
    }

    /**
     * <p>
     * The list of properties involved in the domain configuration change that are still in pending.
     * </p>
     * 
     * @param pendingProperties
     *        The list of properties involved in the domain configuration change that are still in pending.
     */

    public void setPendingProperties(java.util.Collection<String> pendingProperties) {
        if (pendingProperties == null) {
            this.pendingProperties = null;
            return;
        }

        this.pendingProperties = new java.util.ArrayList<String>(pendingProperties);
    }

    /**
     * <p>
     * The list of properties involved in the domain configuration change that are still in pending.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPendingProperties(java.util.Collection)} or {@link #withPendingProperties(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param pendingProperties
     *        The list of properties involved in the domain configuration change that are still in pending.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChangeProgressStatusDetails withPendingProperties(String... pendingProperties) {
        if (this.pendingProperties == null) {
            setPendingProperties(new java.util.ArrayList<String>(pendingProperties.length));
        }
        for (String ele : pendingProperties) {
            this.pendingProperties.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of properties involved in the domain configuration change that are still in pending.
     * </p>
     * 
     * @param pendingProperties
     *        The list of properties involved in the domain configuration change that are still in pending.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChangeProgressStatusDetails withPendingProperties(java.util.Collection<String> pendingProperties) {
        setPendingProperties(pendingProperties);
        return this;
    }

    /**
     * <p>
     * The list of properties involved in the domain configuration change that are completed.
     * </p>
     * 
     * @return The list of properties involved in the domain configuration change that are completed.
     */

    public java.util.List<String> getCompletedProperties() {
        return completedProperties;
    }

    /**
     * <p>
     * The list of properties involved in the domain configuration change that are completed.
     * </p>
     * 
     * @param completedProperties
     *        The list of properties involved in the domain configuration change that are completed.
     */

    public void setCompletedProperties(java.util.Collection<String> completedProperties) {
        if (completedProperties == null) {
            this.completedProperties = null;
            return;
        }

        this.completedProperties = new java.util.ArrayList<String>(completedProperties);
    }

    /**
     * <p>
     * The list of properties involved in the domain configuration change that are completed.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCompletedProperties(java.util.Collection)} or {@link #withCompletedProperties(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param completedProperties
     *        The list of properties involved in the domain configuration change that are completed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChangeProgressStatusDetails withCompletedProperties(String... completedProperties) {
        if (this.completedProperties == null) {
            setCompletedProperties(new java.util.ArrayList<String>(completedProperties.length));
        }
        for (String ele : completedProperties) {
            this.completedProperties.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of properties involved in the domain configuration change that are completed.
     * </p>
     * 
     * @param completedProperties
     *        The list of properties involved in the domain configuration change that are completed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChangeProgressStatusDetails withCompletedProperties(java.util.Collection<String> completedProperties) {
        setCompletedProperties(completedProperties);
        return this;
    }

    /**
     * <p>
     * The total number of stages required for the configuration change.
     * </p>
     * 
     * @param totalNumberOfStages
     *        The total number of stages required for the configuration change.
     */

    public void setTotalNumberOfStages(Integer totalNumberOfStages) {
        this.totalNumberOfStages = totalNumberOfStages;
    }

    /**
     * <p>
     * The total number of stages required for the configuration change.
     * </p>
     * 
     * @return The total number of stages required for the configuration change.
     */

    public Integer getTotalNumberOfStages() {
        return this.totalNumberOfStages;
    }

    /**
     * <p>
     * The total number of stages required for the configuration change.
     * </p>
     * 
     * @param totalNumberOfStages
     *        The total number of stages required for the configuration change.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChangeProgressStatusDetails withTotalNumberOfStages(Integer totalNumberOfStages) {
        setTotalNumberOfStages(totalNumberOfStages);
        return this;
    }

    /**
     * <p>
     * The specific stages that the domain is going through to perform the configuration change.
     * </p>
     * 
     * @return The specific stages that the domain is going through to perform the configuration change.
     */

    public java.util.List<ChangeProgressStage> getChangeProgressStages() {
        return changeProgressStages;
    }

    /**
     * <p>
     * The specific stages that the domain is going through to perform the configuration change.
     * </p>
     * 
     * @param changeProgressStages
     *        The specific stages that the domain is going through to perform the configuration change.
     */

    public void setChangeProgressStages(java.util.Collection<ChangeProgressStage> changeProgressStages) {
        if (changeProgressStages == null) {
            this.changeProgressStages = null;
            return;
        }

        this.changeProgressStages = new java.util.ArrayList<ChangeProgressStage>(changeProgressStages);
    }

    /**
     * <p>
     * The specific stages that the domain is going through to perform the configuration change.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setChangeProgressStages(java.util.Collection)} or {@link #withChangeProgressStages(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param changeProgressStages
     *        The specific stages that the domain is going through to perform the configuration change.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChangeProgressStatusDetails withChangeProgressStages(ChangeProgressStage... changeProgressStages) {
        if (this.changeProgressStages == null) {
            setChangeProgressStages(new java.util.ArrayList<ChangeProgressStage>(changeProgressStages.length));
        }
        for (ChangeProgressStage ele : changeProgressStages) {
            this.changeProgressStages.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The specific stages that the domain is going through to perform the configuration change.
     * </p>
     * 
     * @param changeProgressStages
     *        The specific stages that the domain is going through to perform the configuration change.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChangeProgressStatusDetails withChangeProgressStages(java.util.Collection<ChangeProgressStage> changeProgressStages) {
        setChangeProgressStages(changeProgressStages);
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
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getPendingProperties() != null)
            sb.append("PendingProperties: ").append(getPendingProperties()).append(",");
        if (getCompletedProperties() != null)
            sb.append("CompletedProperties: ").append(getCompletedProperties()).append(",");
        if (getTotalNumberOfStages() != null)
            sb.append("TotalNumberOfStages: ").append(getTotalNumberOfStages()).append(",");
        if (getChangeProgressStages() != null)
            sb.append("ChangeProgressStages: ").append(getChangeProgressStages());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ChangeProgressStatusDetails == false)
            return false;
        ChangeProgressStatusDetails other = (ChangeProgressStatusDetails) obj;
        if (other.getChangeId() == null ^ this.getChangeId() == null)
            return false;
        if (other.getChangeId() != null && other.getChangeId().equals(this.getChangeId()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getPendingProperties() == null ^ this.getPendingProperties() == null)
            return false;
        if (other.getPendingProperties() != null && other.getPendingProperties().equals(this.getPendingProperties()) == false)
            return false;
        if (other.getCompletedProperties() == null ^ this.getCompletedProperties() == null)
            return false;
        if (other.getCompletedProperties() != null && other.getCompletedProperties().equals(this.getCompletedProperties()) == false)
            return false;
        if (other.getTotalNumberOfStages() == null ^ this.getTotalNumberOfStages() == null)
            return false;
        if (other.getTotalNumberOfStages() != null && other.getTotalNumberOfStages().equals(this.getTotalNumberOfStages()) == false)
            return false;
        if (other.getChangeProgressStages() == null ^ this.getChangeProgressStages() == null)
            return false;
        if (other.getChangeProgressStages() != null && other.getChangeProgressStages().equals(this.getChangeProgressStages()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChangeId() == null) ? 0 : getChangeId().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getPendingProperties() == null) ? 0 : getPendingProperties().hashCode());
        hashCode = prime * hashCode + ((getCompletedProperties() == null) ? 0 : getCompletedProperties().hashCode());
        hashCode = prime * hashCode + ((getTotalNumberOfStages() == null) ? 0 : getTotalNumberOfStages().hashCode());
        hashCode = prime * hashCode + ((getChangeProgressStages() == null) ? 0 : getChangeProgressStages().hashCode());
        return hashCode;
    }

    @Override
    public ChangeProgressStatusDetails clone() {
        try {
            return (ChangeProgressStatusDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.elasticsearch.model.transform.ChangeProgressStatusDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
