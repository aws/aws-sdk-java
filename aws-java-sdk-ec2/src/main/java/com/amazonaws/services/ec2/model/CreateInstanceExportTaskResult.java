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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceResult;

/**
 * <p>
 * Contains the output for CreateInstanceExportTask.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateInstanceExportTaskResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the instance export task.
     * </p>
     */
    private ExportTask exportTask;

    /**
     * <p>
     * Information about the instance export task.
     * </p>
     * 
     * @param exportTask
     *        Information about the instance export task.
     */

    public void setExportTask(ExportTask exportTask) {
        this.exportTask = exportTask;
    }

    /**
     * <p>
     * Information about the instance export task.
     * </p>
     * 
     * @return Information about the instance export task.
     */

    public ExportTask getExportTask() {
        return this.exportTask;
    }

    /**
     * <p>
     * Information about the instance export task.
     * </p>
     * 
     * @param exportTask
     *        Information about the instance export task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInstanceExportTaskResult withExportTask(ExportTask exportTask) {
        setExportTask(exportTask);
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
        if (getExportTask() != null)
            sb.append("ExportTask: ").append(getExportTask());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateInstanceExportTaskResult == false)
            return false;
        CreateInstanceExportTaskResult other = (CreateInstanceExportTaskResult) obj;
        if (other.getExportTask() == null ^ this.getExportTask() == null)
            return false;
        if (other.getExportTask() != null && other.getExportTask().equals(this.getExportTask()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExportTask() == null) ? 0 : getExportTask().hashCode());
        return hashCode;
    }

    @Override
    public CreateInstanceExportTaskResult clone() {
        try {
            return (CreateInstanceExportTaskResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
