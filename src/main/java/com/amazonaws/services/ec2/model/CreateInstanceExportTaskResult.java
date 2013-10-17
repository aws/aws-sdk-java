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
 * Create Instance Export Task Result
 */
public class CreateInstanceExportTaskResult implements Serializable {

    private ExportTask exportTask;

    /**
     * Returns the value of the ExportTask property for this object.
     *
     * @return The value of the ExportTask property for this object.
     */
    public ExportTask getExportTask() {
        return exportTask;
    }
    
    /**
     * Sets the value of the ExportTask property for this object.
     *
     * @param exportTask The new value for the ExportTask property for this object.
     */
    public void setExportTask(ExportTask exportTask) {
        this.exportTask = exportTask;
    }
    
    /**
     * Sets the value of the ExportTask property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param exportTask The new value for the ExportTask property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateInstanceExportTaskResult withExportTask(ExportTask exportTask) {
        this.exportTask = exportTask;
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
        if (getExportTask() != null) sb.append("ExportTask: " + getExportTask() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getExportTask() == null) ? 0 : getExportTask().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateInstanceExportTaskResult == false) return false;
        CreateInstanceExportTaskResult other = (CreateInstanceExportTaskResult)obj;
        
        if (other.getExportTask() == null ^ this.getExportTask() == null) return false;
        if (other.getExportTask() != null && other.getExportTask().equals(this.getExportTask()) == false) return false; 
        return true;
    }
    
}
    