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
 * Describe Export Tasks Result
 */
public class DescribeExportTasksResult implements Serializable {

    private com.amazonaws.internal.ListWithAutoConstructFlag<ExportTask> exportTasks;

    /**
     * Returns the value of the ExportTasks property for this object.
     *
     * @return The value of the ExportTasks property for this object.
     */
    public java.util.List<ExportTask> getExportTasks() {
        if (exportTasks == null) {
              exportTasks = new com.amazonaws.internal.ListWithAutoConstructFlag<ExportTask>();
              exportTasks.setAutoConstruct(true);
        }
        return exportTasks;
    }
    
    /**
     * Sets the value of the ExportTasks property for this object.
     *
     * @param exportTasks The new value for the ExportTasks property for this object.
     */
    public void setExportTasks(java.util.Collection<ExportTask> exportTasks) {
        if (exportTasks == null) {
            this.exportTasks = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<ExportTask> exportTasksCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ExportTask>(exportTasks.size());
        exportTasksCopy.addAll(exportTasks);
        this.exportTasks = exportTasksCopy;
    }
    
    /**
     * Sets the value of the ExportTasks property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param exportTasks The new value for the ExportTasks property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeExportTasksResult withExportTasks(ExportTask... exportTasks) {
        if (getExportTasks() == null) setExportTasks(new java.util.ArrayList<ExportTask>(exportTasks.length));
        for (ExportTask value : exportTasks) {
            getExportTasks().add(value);
        }
        return this;
    }
    
    /**
     * Sets the value of the ExportTasks property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param exportTasks The new value for the ExportTasks property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeExportTasksResult withExportTasks(java.util.Collection<ExportTask> exportTasks) {
        if (exportTasks == null) {
            this.exportTasks = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<ExportTask> exportTasksCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ExportTask>(exportTasks.size());
            exportTasksCopy.addAll(exportTasks);
            this.exportTasks = exportTasksCopy;
        }

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
        if (getExportTasks() != null) sb.append("ExportTasks: " + getExportTasks() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getExportTasks() == null) ? 0 : getExportTasks().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeExportTasksResult == false) return false;
        DescribeExportTasksResult other = (DescribeExportTasksResult)obj;
        
        if (other.getExportTasks() == null ^ this.getExportTasks() == null) return false;
        if (other.getExportTasks() != null && other.getExportTasks().equals(this.getExportTasks()) == false) return false; 
        return true;
    }
    
}
    