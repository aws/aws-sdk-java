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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;


/**
 * Export Task
 */
public class ExportTask implements Serializable {

    private String exportTaskId;

    private String description;

    private String state;

    private String statusMessage;

    private InstanceExportDetails instanceExportDetails;

    private ExportToS3Task exportToS3Task;

    /**
     * Returns the value of the ExportTaskId property for this object.
     *
     * @return The value of the ExportTaskId property for this object.
     */
    public String getExportTaskId() {
        return exportTaskId;
    }
    
    /**
     * Sets the value of the ExportTaskId property for this object.
     *
     * @param exportTaskId The new value for the ExportTaskId property for this object.
     */
    public void setExportTaskId(String exportTaskId) {
        this.exportTaskId = exportTaskId;
    }
    
    /**
     * Sets the value of the ExportTaskId property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param exportTaskId The new value for the ExportTaskId property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ExportTask withExportTaskId(String exportTaskId) {
        this.exportTaskId = exportTaskId;
        return this;
    }

    /**
     * Returns the value of the Description property for this object.
     *
     * @return The value of the Description property for this object.
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * Sets the value of the Description property for this object.
     *
     * @param description The new value for the Description property for this object.
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * Sets the value of the Description property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param description The new value for the Description property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ExportTask withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Returns the value of the State property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>active, cancelling, cancelled, completed
     *
     * @return The value of the State property for this object.
     *
     * @see ExportTaskState
     */
    public String getState() {
        return state;
    }
    
    /**
     * Sets the value of the State property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>active, cancelling, cancelled, completed
     *
     * @param state The new value for the State property for this object.
     *
     * @see ExportTaskState
     */
    public void setState(String state) {
        this.state = state;
    }
    
    /**
     * Sets the value of the State property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>active, cancelling, cancelled, completed
     *
     * @param state The new value for the State property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see ExportTaskState
     */
    public ExportTask withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * Sets the value of the State property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>active, cancelling, cancelled, completed
     *
     * @param state The new value for the State property for this object.
     *
     * @see ExportTaskState
     */
    public void setState(ExportTaskState state) {
        this.state = state.toString();
    }
    
    /**
     * Sets the value of the State property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>active, cancelling, cancelled, completed
     *
     * @param state The new value for the State property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see ExportTaskState
     */
    public ExportTask withState(ExportTaskState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * Returns the value of the StatusMessage property for this object.
     *
     * @return The value of the StatusMessage property for this object.
     */
    public String getStatusMessage() {
        return statusMessage;
    }
    
    /**
     * Sets the value of the StatusMessage property for this object.
     *
     * @param statusMessage The new value for the StatusMessage property for this object.
     */
    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }
    
    /**
     * Sets the value of the StatusMessage property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param statusMessage The new value for the StatusMessage property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ExportTask withStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
        return this;
    }

    /**
     * Returns the value of the InstanceExportDetails property for this
     * object.
     *
     * @return The value of the InstanceExportDetails property for this object.
     */
    public InstanceExportDetails getInstanceExportDetails() {
        return instanceExportDetails;
    }
    
    /**
     * Sets the value of the InstanceExportDetails property for this object.
     *
     * @param instanceExportDetails The new value for the InstanceExportDetails property for this object.
     */
    public void setInstanceExportDetails(InstanceExportDetails instanceExportDetails) {
        this.instanceExportDetails = instanceExportDetails;
    }
    
    /**
     * Sets the value of the InstanceExportDetails property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceExportDetails The new value for the InstanceExportDetails property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ExportTask withInstanceExportDetails(InstanceExportDetails instanceExportDetails) {
        this.instanceExportDetails = instanceExportDetails;
        return this;
    }

    /**
     * Returns the value of the ExportToS3Task property for this object.
     *
     * @return The value of the ExportToS3Task property for this object.
     */
    public ExportToS3Task getExportToS3Task() {
        return exportToS3Task;
    }
    
    /**
     * Sets the value of the ExportToS3Task property for this object.
     *
     * @param exportToS3Task The new value for the ExportToS3Task property for this object.
     */
    public void setExportToS3Task(ExportToS3Task exportToS3Task) {
        this.exportToS3Task = exportToS3Task;
    }
    
    /**
     * Sets the value of the ExportToS3Task property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param exportToS3Task The new value for the ExportToS3Task property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ExportTask withExportToS3Task(ExportToS3Task exportToS3Task) {
        this.exportToS3Task = exportToS3Task;
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
        if (getExportTaskId() != null) sb.append("ExportTaskId: " + getExportTaskId() + ",");
        if (getDescription() != null) sb.append("Description: " + getDescription() + ",");
        if (getState() != null) sb.append("State: " + getState() + ",");
        if (getStatusMessage() != null) sb.append("StatusMessage: " + getStatusMessage() + ",");
        if (getInstanceExportDetails() != null) sb.append("InstanceExportDetails: " + getInstanceExportDetails() + ",");
        if (getExportToS3Task() != null) sb.append("ExportToS3Task: " + getExportToS3Task() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getExportTaskId() == null) ? 0 : getExportTaskId().hashCode()); 
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode()); 
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode()); 
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode()); 
        hashCode = prime * hashCode + ((getInstanceExportDetails() == null) ? 0 : getInstanceExportDetails().hashCode()); 
        hashCode = prime * hashCode + ((getExportToS3Task() == null) ? 0 : getExportToS3Task().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ExportTask == false) return false;
        ExportTask other = (ExportTask)obj;
        
        if (other.getExportTaskId() == null ^ this.getExportTaskId() == null) return false;
        if (other.getExportTaskId() != null && other.getExportTaskId().equals(this.getExportTaskId()) == false) return false; 
        if (other.getDescription() == null ^ this.getDescription() == null) return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false) return false; 
        if (other.getState() == null ^ this.getState() == null) return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false) return false; 
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null) return false;
        if (other.getStatusMessage() != null && other.getStatusMessage().equals(this.getStatusMessage()) == false) return false; 
        if (other.getInstanceExportDetails() == null ^ this.getInstanceExportDetails() == null) return false;
        if (other.getInstanceExportDetails() != null && other.getInstanceExportDetails().equals(this.getInstanceExportDetails()) == false) return false; 
        if (other.getExportToS3Task() == null ^ this.getExportToS3Task() == null) return false;
        if (other.getExportToS3Task() != null && other.getExportToS3Task().equals(this.getExportToS3Task()) == false) return false; 
        return true;
    }
    
}
    