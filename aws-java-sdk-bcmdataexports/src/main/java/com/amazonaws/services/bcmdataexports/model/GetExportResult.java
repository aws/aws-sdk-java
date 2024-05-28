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
package com.amazonaws.services.bcmdataexports.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bcm-data-exports-2023-11-26/GetExport" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetExportResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The data for this specific export.
     * </p>
     */
    private Export export;
    /**
     * <p>
     * The status of this specific export.
     * </p>
     */
    private ExportStatus exportStatus;

    /**
     * <p>
     * The data for this specific export.
     * </p>
     * 
     * @param export
     *        The data for this specific export.
     */

    public void setExport(Export export) {
        this.export = export;
    }

    /**
     * <p>
     * The data for this specific export.
     * </p>
     * 
     * @return The data for this specific export.
     */

    public Export getExport() {
        return this.export;
    }

    /**
     * <p>
     * The data for this specific export.
     * </p>
     * 
     * @param export
     *        The data for this specific export.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetExportResult withExport(Export export) {
        setExport(export);
        return this;
    }

    /**
     * <p>
     * The status of this specific export.
     * </p>
     * 
     * @param exportStatus
     *        The status of this specific export.
     */

    public void setExportStatus(ExportStatus exportStatus) {
        this.exportStatus = exportStatus;
    }

    /**
     * <p>
     * The status of this specific export.
     * </p>
     * 
     * @return The status of this specific export.
     */

    public ExportStatus getExportStatus() {
        return this.exportStatus;
    }

    /**
     * <p>
     * The status of this specific export.
     * </p>
     * 
     * @param exportStatus
     *        The status of this specific export.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetExportResult withExportStatus(ExportStatus exportStatus) {
        setExportStatus(exportStatus);
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
        if (getExport() != null)
            sb.append("Export: ").append(getExport()).append(",");
        if (getExportStatus() != null)
            sb.append("ExportStatus: ").append(getExportStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetExportResult == false)
            return false;
        GetExportResult other = (GetExportResult) obj;
        if (other.getExport() == null ^ this.getExport() == null)
            return false;
        if (other.getExport() != null && other.getExport().equals(this.getExport()) == false)
            return false;
        if (other.getExportStatus() == null ^ this.getExportStatus() == null)
            return false;
        if (other.getExportStatus() != null && other.getExportStatus().equals(this.getExportStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExport() == null) ? 0 : getExport().hashCode());
        hashCode = prime * hashCode + ((getExportStatus() == null) ? 0 : getExportStatus().hashCode());
        return hashCode;
    }

    @Override
    public GetExportResult clone() {
        try {
            return (GetExportResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
