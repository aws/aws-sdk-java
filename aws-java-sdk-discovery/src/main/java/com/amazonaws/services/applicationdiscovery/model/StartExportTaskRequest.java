/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.applicationdiscovery.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartExportTaskRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The file format for the returned export data. Default value is <code>CSV</code>.
     * </p>
     */
    private java.util.List<String> exportDataFormat;

    /**
     * <p>
     * The file format for the returned export data. Default value is <code>CSV</code>.
     * </p>
     * 
     * @return The file format for the returned export data. Default value is <code>CSV</code>.
     * @see ExportDataFormat
     */

    public java.util.List<String> getExportDataFormat() {
        return exportDataFormat;
    }

    /**
     * <p>
     * The file format for the returned export data. Default value is <code>CSV</code>.
     * </p>
     * 
     * @param exportDataFormat
     *        The file format for the returned export data. Default value is <code>CSV</code>.
     * @see ExportDataFormat
     */

    public void setExportDataFormat(java.util.Collection<String> exportDataFormat) {
        if (exportDataFormat == null) {
            this.exportDataFormat = null;
            return;
        }

        this.exportDataFormat = new java.util.ArrayList<String>(exportDataFormat);
    }

    /**
     * <p>
     * The file format for the returned export data. Default value is <code>CSV</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExportDataFormat(java.util.Collection)} or {@link #withExportDataFormat(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param exportDataFormat
     *        The file format for the returned export data. Default value is <code>CSV</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExportDataFormat
     */

    public StartExportTaskRequest withExportDataFormat(String... exportDataFormat) {
        if (this.exportDataFormat == null) {
            setExportDataFormat(new java.util.ArrayList<String>(exportDataFormat.length));
        }
        for (String ele : exportDataFormat) {
            this.exportDataFormat.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The file format for the returned export data. Default value is <code>CSV</code>.
     * </p>
     * 
     * @param exportDataFormat
     *        The file format for the returned export data. Default value is <code>CSV</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExportDataFormat
     */

    public StartExportTaskRequest withExportDataFormat(java.util.Collection<String> exportDataFormat) {
        setExportDataFormat(exportDataFormat);
        return this;
    }

    /**
     * <p>
     * The file format for the returned export data. Default value is <code>CSV</code>.
     * </p>
     * 
     * @param exportDataFormat
     *        The file format for the returned export data. Default value is <code>CSV</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExportDataFormat
     */

    public StartExportTaskRequest withExportDataFormat(ExportDataFormat... exportDataFormat) {
        java.util.ArrayList<String> exportDataFormatCopy = new java.util.ArrayList<String>(exportDataFormat.length);
        for (ExportDataFormat value : exportDataFormat) {
            exportDataFormatCopy.add(value.toString());
        }
        if (getExportDataFormat() == null) {
            setExportDataFormat(exportDataFormatCopy);
        } else {
            getExportDataFormat().addAll(exportDataFormatCopy);
        }
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
        if (getExportDataFormat() != null)
            sb.append("ExportDataFormat: ").append(getExportDataFormat());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartExportTaskRequest == false)
            return false;
        StartExportTaskRequest other = (StartExportTaskRequest) obj;
        if (other.getExportDataFormat() == null ^ this.getExportDataFormat() == null)
            return false;
        if (other.getExportDataFormat() != null && other.getExportDataFormat().equals(this.getExportDataFormat()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExportDataFormat() == null) ? 0 : getExportDataFormat().hashCode());
        return hashCode;
    }

    @Override
    public StartExportTaskRequest clone() {
        return (StartExportTaskRequest) super.clone();
    }

}
