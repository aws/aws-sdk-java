/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * <p>
 * Describes an export task.
 * </p>
 */
public class ExportTask implements Serializable {

    /**
     * The ID of the export task.
     */
    private String exportTaskId;

    /**
     * A description of the resource being exported.
     */
    private String description;

    /**
     * The state of the conversion task.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>active, cancelling, cancelled, completed
     */
    private String state;

    /**
     * The status message related to the export task.
     */
    private String statusMessage;

    /**
     * The instance being exported.
     */
    private InstanceExportDetails instanceExportDetails;

    /**
     * 
     */
    private ExportToS3Task exportToS3Task;

    /**
     * The ID of the export task.
     *
     * @return The ID of the export task.
     */
    public String getExportTaskId() {
        return exportTaskId;
    }
    
    /**
     * The ID of the export task.
     *
     * @param exportTaskId The ID of the export task.
     */
    public void setExportTaskId(String exportTaskId) {
        this.exportTaskId = exportTaskId;
    }
    
    /**
     * The ID of the export task.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param exportTaskId The ID of the export task.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ExportTask withExportTaskId(String exportTaskId) {
        this.exportTaskId = exportTaskId;
        return this;
    }

    /**
     * A description of the resource being exported.
     *
     * @return A description of the resource being exported.
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * A description of the resource being exported.
     *
     * @param description A description of the resource being exported.
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * A description of the resource being exported.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param description A description of the resource being exported.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ExportTask withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * The state of the conversion task.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>active, cancelling, cancelled, completed
     *
     * @return The state of the conversion task.
     *
     * @see ExportTaskState
     */
    public String getState() {
        return state;
    }
    
    /**
     * The state of the conversion task.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>active, cancelling, cancelled, completed
     *
     * @param state The state of the conversion task.
     *
     * @see ExportTaskState
     */
    public void setState(String state) {
        this.state = state;
    }
    
    /**
     * The state of the conversion task.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>active, cancelling, cancelled, completed
     *
     * @param state The state of the conversion task.
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
     * The state of the conversion task.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>active, cancelling, cancelled, completed
     *
     * @param state The state of the conversion task.
     *
     * @see ExportTaskState
     */
    public void setState(ExportTaskState state) {
        this.state = state.toString();
    }
    
    /**
     * The state of the conversion task.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>active, cancelling, cancelled, completed
     *
     * @param state The state of the conversion task.
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
     * The status message related to the export task.
     *
     * @return The status message related to the export task.
     */
    public String getStatusMessage() {
        return statusMessage;
    }
    
    /**
     * The status message related to the export task.
     *
     * @param statusMessage The status message related to the export task.
     */
    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }
    
    /**
     * The status message related to the export task.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param statusMessage The status message related to the export task.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ExportTask withStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
        return this;
    }

    /**
     * The instance being exported.
     *
     * @return The instance being exported.
     */
    public InstanceExportDetails getInstanceExportDetails() {
        return instanceExportDetails;
    }
    
    /**
     * The instance being exported.
     *
     * @param instanceExportDetails The instance being exported.
     */
    public void setInstanceExportDetails(InstanceExportDetails instanceExportDetails) {
        this.instanceExportDetails = instanceExportDetails;
    }
    
    /**
     * The instance being exported.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceExportDetails The instance being exported.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ExportTask withInstanceExportDetails(InstanceExportDetails instanceExportDetails) {
        this.instanceExportDetails = instanceExportDetails;
        return this;
    }

    /**
     * 
     *
     * @return 
     */
    public ExportToS3Task getExportToS3Task() {
        return exportToS3Task;
    }
    
    /**
     * 
     *
     * @param exportToS3Task 
     */
    public void setExportToS3Task(ExportToS3Task exportToS3Task) {
        this.exportToS3Task = exportToS3Task;
    }
    
    /**
     * 
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param exportToS3Task 
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
    