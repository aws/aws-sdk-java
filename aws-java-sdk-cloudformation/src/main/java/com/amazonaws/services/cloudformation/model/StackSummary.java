/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudformation.model;

import java.io.Serializable;

/**
 * <p>
 * The StackSummary Data Type
 * </p>
 */
public class StackSummary implements Serializable, Cloneable {

    /**
     * <p>
     * Unique stack identifier.
     * </p>
     */
    private String stackId;
    /**
     * <p>
     * The name associated with the stack.
     * </p>
     */
    private String stackName;
    /**
     * <p>
     * The template description of the template used to create the stack.
     * </p>
     */
    private String templateDescription;
    /**
     * <p>
     * The time the stack was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The time the stack was last updated. This field will only be returned if the stack has been updated at least
     * once.
     * </p>
     */
    private java.util.Date lastUpdatedTime;
    /**
     * <p>
     * The time the stack was deleted.
     * </p>
     */
    private java.util.Date deletionTime;
    /**
     * <p>
     * The current status of the stack.
     * </p>
     */
    private String stackStatus;
    /**
     * <p>
     * Success/Failure message associated with the stack status.
     * </p>
     */
    private String stackStatusReason;

    /**
     * <p>
     * Unique stack identifier.
     * </p>
     * 
     * @param stackId
     *        Unique stack identifier.
     */

    public void setStackId(String stackId) {
        this.stackId = stackId;
    }

    /**
     * <p>
     * Unique stack identifier.
     * </p>
     * 
     * @return Unique stack identifier.
     */

    public String getStackId() {
        return this.stackId;
    }

    /**
     * <p>
     * Unique stack identifier.
     * </p>
     * 
     * @param stackId
     *        Unique stack identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StackSummary withStackId(String stackId) {
        setStackId(stackId);
        return this;
    }

    /**
     * <p>
     * The name associated with the stack.
     * </p>
     * 
     * @param stackName
     *        The name associated with the stack.
     */

    public void setStackName(String stackName) {
        this.stackName = stackName;
    }

    /**
     * <p>
     * The name associated with the stack.
     * </p>
     * 
     * @return The name associated with the stack.
     */

    public String getStackName() {
        return this.stackName;
    }

    /**
     * <p>
     * The name associated with the stack.
     * </p>
     * 
     * @param stackName
     *        The name associated with the stack.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StackSummary withStackName(String stackName) {
        setStackName(stackName);
        return this;
    }

    /**
     * <p>
     * The template description of the template used to create the stack.
     * </p>
     * 
     * @param templateDescription
     *        The template description of the template used to create the stack.
     */

    public void setTemplateDescription(String templateDescription) {
        this.templateDescription = templateDescription;
    }

    /**
     * <p>
     * The template description of the template used to create the stack.
     * </p>
     * 
     * @return The template description of the template used to create the stack.
     */

    public String getTemplateDescription() {
        return this.templateDescription;
    }

    /**
     * <p>
     * The template description of the template used to create the stack.
     * </p>
     * 
     * @param templateDescription
     *        The template description of the template used to create the stack.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StackSummary withTemplateDescription(String templateDescription) {
        setTemplateDescription(templateDescription);
        return this;
    }

    /**
     * <p>
     * The time the stack was created.
     * </p>
     * 
     * @param creationTime
     *        The time the stack was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time the stack was created.
     * </p>
     * 
     * @return The time the stack was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The time the stack was created.
     * </p>
     * 
     * @param creationTime
     *        The time the stack was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StackSummary withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The time the stack was last updated. This field will only be returned if the stack has been updated at least
     * once.
     * </p>
     * 
     * @param lastUpdatedTime
     *        The time the stack was last updated. This field will only be returned if the stack has been updated at
     *        least once.
     */

    public void setLastUpdatedTime(java.util.Date lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    /**
     * <p>
     * The time the stack was last updated. This field will only be returned if the stack has been updated at least
     * once.
     * </p>
     * 
     * @return The time the stack was last updated. This field will only be returned if the stack has been updated at
     *         least once.
     */

    public java.util.Date getLastUpdatedTime() {
        return this.lastUpdatedTime;
    }

    /**
     * <p>
     * The time the stack was last updated. This field will only be returned if the stack has been updated at least
     * once.
     * </p>
     * 
     * @param lastUpdatedTime
     *        The time the stack was last updated. This field will only be returned if the stack has been updated at
     *        least once.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StackSummary withLastUpdatedTime(java.util.Date lastUpdatedTime) {
        setLastUpdatedTime(lastUpdatedTime);
        return this;
    }

    /**
     * <p>
     * The time the stack was deleted.
     * </p>
     * 
     * @param deletionTime
     *        The time the stack was deleted.
     */

    public void setDeletionTime(java.util.Date deletionTime) {
        this.deletionTime = deletionTime;
    }

    /**
     * <p>
     * The time the stack was deleted.
     * </p>
     * 
     * @return The time the stack was deleted.
     */

    public java.util.Date getDeletionTime() {
        return this.deletionTime;
    }

    /**
     * <p>
     * The time the stack was deleted.
     * </p>
     * 
     * @param deletionTime
     *        The time the stack was deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StackSummary withDeletionTime(java.util.Date deletionTime) {
        setDeletionTime(deletionTime);
        return this;
    }

    /**
     * <p>
     * The current status of the stack.
     * </p>
     * 
     * @param stackStatus
     *        The current status of the stack.
     * @see StackStatus
     */

    public void setStackStatus(String stackStatus) {
        this.stackStatus = stackStatus;
    }

    /**
     * <p>
     * The current status of the stack.
     * </p>
     * 
     * @return The current status of the stack.
     * @see StackStatus
     */

    public String getStackStatus() {
        return this.stackStatus;
    }

    /**
     * <p>
     * The current status of the stack.
     * </p>
     * 
     * @param stackStatus
     *        The current status of the stack.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StackStatus
     */

    public StackSummary withStackStatus(String stackStatus) {
        setStackStatus(stackStatus);
        return this;
    }

    /**
     * <p>
     * The current status of the stack.
     * </p>
     * 
     * @param stackStatus
     *        The current status of the stack.
     * @see StackStatus
     */

    public void setStackStatus(StackStatus stackStatus) {
        this.stackStatus = stackStatus.toString();
    }

    /**
     * <p>
     * The current status of the stack.
     * </p>
     * 
     * @param stackStatus
     *        The current status of the stack.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StackStatus
     */

    public StackSummary withStackStatus(StackStatus stackStatus) {
        setStackStatus(stackStatus);
        return this;
    }

    /**
     * <p>
     * Success/Failure message associated with the stack status.
     * </p>
     * 
     * @param stackStatusReason
     *        Success/Failure message associated with the stack status.
     */

    public void setStackStatusReason(String stackStatusReason) {
        this.stackStatusReason = stackStatusReason;
    }

    /**
     * <p>
     * Success/Failure message associated with the stack status.
     * </p>
     * 
     * @return Success/Failure message associated with the stack status.
     */

    public String getStackStatusReason() {
        return this.stackStatusReason;
    }

    /**
     * <p>
     * Success/Failure message associated with the stack status.
     * </p>
     * 
     * @param stackStatusReason
     *        Success/Failure message associated with the stack status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StackSummary withStackStatusReason(String stackStatusReason) {
        setStackStatusReason(stackStatusReason);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getStackId() != null)
            sb.append("StackId: " + getStackId() + ",");
        if (getStackName() != null)
            sb.append("StackName: " + getStackName() + ",");
        if (getTemplateDescription() != null)
            sb.append("TemplateDescription: " + getTemplateDescription() + ",");
        if (getCreationTime() != null)
            sb.append("CreationTime: " + getCreationTime() + ",");
        if (getLastUpdatedTime() != null)
            sb.append("LastUpdatedTime: " + getLastUpdatedTime() + ",");
        if (getDeletionTime() != null)
            sb.append("DeletionTime: " + getDeletionTime() + ",");
        if (getStackStatus() != null)
            sb.append("StackStatus: " + getStackStatus() + ",");
        if (getStackStatusReason() != null)
            sb.append("StackStatusReason: " + getStackStatusReason());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StackSummary == false)
            return false;
        StackSummary other = (StackSummary) obj;
        if (other.getStackId() == null ^ this.getStackId() == null)
            return false;
        if (other.getStackId() != null && other.getStackId().equals(this.getStackId()) == false)
            return false;
        if (other.getStackName() == null ^ this.getStackName() == null)
            return false;
        if (other.getStackName() != null && other.getStackName().equals(this.getStackName()) == false)
            return false;
        if (other.getTemplateDescription() == null ^ this.getTemplateDescription() == null)
            return false;
        if (other.getTemplateDescription() != null && other.getTemplateDescription().equals(this.getTemplateDescription()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getLastUpdatedTime() == null ^ this.getLastUpdatedTime() == null)
            return false;
        if (other.getLastUpdatedTime() != null && other.getLastUpdatedTime().equals(this.getLastUpdatedTime()) == false)
            return false;
        if (other.getDeletionTime() == null ^ this.getDeletionTime() == null)
            return false;
        if (other.getDeletionTime() != null && other.getDeletionTime().equals(this.getDeletionTime()) == false)
            return false;
        if (other.getStackStatus() == null ^ this.getStackStatus() == null)
            return false;
        if (other.getStackStatus() != null && other.getStackStatus().equals(this.getStackStatus()) == false)
            return false;
        if (other.getStackStatusReason() == null ^ this.getStackStatusReason() == null)
            return false;
        if (other.getStackStatusReason() != null && other.getStackStatusReason().equals(this.getStackStatusReason()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStackId() == null) ? 0 : getStackId().hashCode());
        hashCode = prime * hashCode + ((getStackName() == null) ? 0 : getStackName().hashCode());
        hashCode = prime * hashCode + ((getTemplateDescription() == null) ? 0 : getTemplateDescription().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedTime() == null) ? 0 : getLastUpdatedTime().hashCode());
        hashCode = prime * hashCode + ((getDeletionTime() == null) ? 0 : getDeletionTime().hashCode());
        hashCode = prime * hashCode + ((getStackStatus() == null) ? 0 : getStackStatus().hashCode());
        hashCode = prime * hashCode + ((getStackStatusReason() == null) ? 0 : getStackStatusReason().hashCode());
        return hashCode;
    }

    @Override
    public StackSummary clone() {
        try {
            return (StackSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
