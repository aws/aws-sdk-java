/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.rds.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeExportTasks" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeExportTasksResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A pagination token that can be used in a later <code>DescribeExportTasks</code> request. A marker is used for
     * pagination to identify the location to begin output for the next response of <code>DescribeExportTasks</code>.
     * </p>
     */
    private String marker;
    /**
     * <p>
     * Information about an export of a snapshot to Amazon S3.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ExportTask> exportTasks;

    /**
     * <p>
     * A pagination token that can be used in a later <code>DescribeExportTasks</code> request. A marker is used for
     * pagination to identify the location to begin output for the next response of <code>DescribeExportTasks</code>.
     * </p>
     * 
     * @param marker
     *        A pagination token that can be used in a later <code>DescribeExportTasks</code> request. A marker is used
     *        for pagination to identify the location to begin output for the next response of
     *        <code>DescribeExportTasks</code>.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * A pagination token that can be used in a later <code>DescribeExportTasks</code> request. A marker is used for
     * pagination to identify the location to begin output for the next response of <code>DescribeExportTasks</code>.
     * </p>
     * 
     * @return A pagination token that can be used in a later <code>DescribeExportTasks</code> request. A marker is used
     *         for pagination to identify the location to begin output for the next response of
     *         <code>DescribeExportTasks</code>.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * A pagination token that can be used in a later <code>DescribeExportTasks</code> request. A marker is used for
     * pagination to identify the location to begin output for the next response of <code>DescribeExportTasks</code>.
     * </p>
     * 
     * @param marker
     *        A pagination token that can be used in a later <code>DescribeExportTasks</code> request. A marker is used
     *        for pagination to identify the location to begin output for the next response of
     *        <code>DescribeExportTasks</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeExportTasksResult withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * <p>
     * Information about an export of a snapshot to Amazon S3.
     * </p>
     * 
     * @return Information about an export of a snapshot to Amazon S3.
     */

    public java.util.List<ExportTask> getExportTasks() {
        if (exportTasks == null) {
            exportTasks = new com.amazonaws.internal.SdkInternalList<ExportTask>();
        }
        return exportTasks;
    }

    /**
     * <p>
     * Information about an export of a snapshot to Amazon S3.
     * </p>
     * 
     * @param exportTasks
     *        Information about an export of a snapshot to Amazon S3.
     */

    public void setExportTasks(java.util.Collection<ExportTask> exportTasks) {
        if (exportTasks == null) {
            this.exportTasks = null;
            return;
        }

        this.exportTasks = new com.amazonaws.internal.SdkInternalList<ExportTask>(exportTasks);
    }

    /**
     * <p>
     * Information about an export of a snapshot to Amazon S3.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExportTasks(java.util.Collection)} or {@link #withExportTasks(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param exportTasks
     *        Information about an export of a snapshot to Amazon S3.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeExportTasksResult withExportTasks(ExportTask... exportTasks) {
        if (this.exportTasks == null) {
            setExportTasks(new com.amazonaws.internal.SdkInternalList<ExportTask>(exportTasks.length));
        }
        for (ExportTask ele : exportTasks) {
            this.exportTasks.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about an export of a snapshot to Amazon S3.
     * </p>
     * 
     * @param exportTasks
     *        Information about an export of a snapshot to Amazon S3.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeExportTasksResult withExportTasks(java.util.Collection<ExportTask> exportTasks) {
        setExportTasks(exportTasks);
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
        if (getMarker() != null)
            sb.append("Marker: ").append(getMarker()).append(",");
        if (getExportTasks() != null)
            sb.append("ExportTasks: ").append(getExportTasks());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeExportTasksResult == false)
            return false;
        DescribeExportTasksResult other = (DescribeExportTasksResult) obj;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getExportTasks() == null ^ this.getExportTasks() == null)
            return false;
        if (other.getExportTasks() != null && other.getExportTasks().equals(this.getExportTasks()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode + ((getExportTasks() == null) ? 0 : getExportTasks().hashCode());
        return hashCode;
    }

    @Override
    public DescribeExportTasksResult clone() {
        try {
            return (DescribeExportTasksResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
