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
package com.amazonaws.services.mgn.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Start export response.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/StartExport" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartExportResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Start export response export task.
     * </p>
     */
    private ExportTask exportTask;

    /**
     * <p>
     * Start export response export task.
     * </p>
     * 
     * @param exportTask
     *        Start export response export task.
     */

    public void setExportTask(ExportTask exportTask) {
        this.exportTask = exportTask;
    }

    /**
     * <p>
     * Start export response export task.
     * </p>
     * 
     * @return Start export response export task.
     */

    public ExportTask getExportTask() {
        return this.exportTask;
    }

    /**
     * <p>
     * Start export response export task.
     * </p>
     * 
     * @param exportTask
     *        Start export response export task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartExportResult withExportTask(ExportTask exportTask) {
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

        if (obj instanceof StartExportResult == false)
            return false;
        StartExportResult other = (StartExportResult) obj;
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
    public StartExportResult clone() {
        try {
            return (StartExportResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
