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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#cancelExportTask(CancelExportTaskRequest) CancelExportTask operation}.
 * 
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#cancelExportTask(CancelExportTaskRequest)
 */
public class CancelExportTaskRequest extends AmazonWebServiceRequest implements Serializable {

    private String exportTaskId;

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
    public CancelExportTaskRequest withExportTaskId(String exportTaskId) {
        this.exportTaskId = exportTaskId;
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
        if (getExportTaskId() != null) sb.append("ExportTaskId: " + getExportTaskId() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getExportTaskId() == null) ? 0 : getExportTaskId().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CancelExportTaskRequest == false) return false;
        CancelExportTaskRequest other = (CancelExportTaskRequest)obj;
        
        if (other.getExportTaskId() == null ^ this.getExportTaskId() == null) return false;
        if (other.getExportTaskId() != null && other.getExportTaskId().equals(this.getExportTaskId()) == false) return false; 
        return true;
    }
    
}
    