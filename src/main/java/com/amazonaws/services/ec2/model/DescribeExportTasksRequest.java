/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#describeExportTasks(DescribeExportTasksRequest) DescribeExportTasks operation}.
 * 
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#describeExportTasks(DescribeExportTasksRequest)
 */
public class DescribeExportTasksRequest extends AmazonWebServiceRequest {

    private java.util.List<String> exportTaskIds;

    /**
     * Returns the value of the ExportTaskIds property for this object.
     *
     * @return The value of the ExportTaskIds property for this object.
     */
    public java.util.List<String> getExportTaskIds() {
        
        if (exportTaskIds == null) {
            exportTaskIds = new java.util.ArrayList<String>();
        }
        return exportTaskIds;
    }
    
    /**
     * Sets the value of the ExportTaskIds property for this object.
     *
     * @param exportTaskIds The new value for the ExportTaskIds property for this object.
     */
    public void setExportTaskIds(java.util.Collection<String> exportTaskIds) {
        if (exportTaskIds == null) {
            this.exportTaskIds = null;
            return;
        }

        java.util.List<String> exportTaskIdsCopy = new java.util.ArrayList<String>(exportTaskIds.size());
        exportTaskIdsCopy.addAll(exportTaskIds);
        this.exportTaskIds = exportTaskIdsCopy;
    }
    
    /**
     * Sets the value of the ExportTaskIds property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param exportTaskIds The new value for the ExportTaskIds property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeExportTasksRequest withExportTaskIds(String... exportTaskIds) {
        if (getExportTaskIds() == null) setExportTaskIds(new java.util.ArrayList<String>(exportTaskIds.length));
        for (String value : exportTaskIds) {
            getExportTaskIds().add(value);
        }
        return this;
    }
    
    /**
     * Sets the value of the ExportTaskIds property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param exportTaskIds The new value for the ExportTaskIds property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeExportTasksRequest withExportTaskIds(java.util.Collection<String> exportTaskIds) {
        if (exportTaskIds == null) {
            this.exportTaskIds = null;
        } else {
            java.util.List<String> exportTaskIdsCopy = new java.util.ArrayList<String>(exportTaskIds.size());
            exportTaskIdsCopy.addAll(exportTaskIds);
            this.exportTaskIds = exportTaskIdsCopy;
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
        if (exportTaskIds != null) sb.append("ExportTaskIds: " + exportTaskIds + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getExportTaskIds() == null) ? 0 : getExportTaskIds().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof DescribeExportTasksRequest == false) return false;
        DescribeExportTasksRequest other = (DescribeExportTasksRequest)obj;
        
        if (other.getExportTaskIds() == null ^ this.getExportTaskIds() == null) return false;
        if (other.getExportTaskIds() != null && other.getExportTaskIds().equals(this.getExportTaskIds()) == false) return false; 
        return true;
    }
    
}
    