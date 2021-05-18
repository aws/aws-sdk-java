/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lexmodelsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/DeleteExport" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteExportResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of the deleted export.
     * </p>
     */
    private String exportId;
    /**
     * <p>
     * The current status of the deletion. When the deletion is complete, the export will no longer be returned by the
     * operation and calls to the with the export identifier will fail.
     * </p>
     */
    private String exportStatus;

    /**
     * <p>
     * The unique identifier of the deleted export.
     * </p>
     * 
     * @param exportId
     *        The unique identifier of the deleted export.
     */

    public void setExportId(String exportId) {
        this.exportId = exportId;
    }

    /**
     * <p>
     * The unique identifier of the deleted export.
     * </p>
     * 
     * @return The unique identifier of the deleted export.
     */

    public String getExportId() {
        return this.exportId;
    }

    /**
     * <p>
     * The unique identifier of the deleted export.
     * </p>
     * 
     * @param exportId
     *        The unique identifier of the deleted export.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteExportResult withExportId(String exportId) {
        setExportId(exportId);
        return this;
    }

    /**
     * <p>
     * The current status of the deletion. When the deletion is complete, the export will no longer be returned by the
     * operation and calls to the with the export identifier will fail.
     * </p>
     * 
     * @param exportStatus
     *        The current status of the deletion. When the deletion is complete, the export will no longer be returned
     *        by the operation and calls to the with the export identifier will fail.
     * @see ExportStatus
     */

    public void setExportStatus(String exportStatus) {
        this.exportStatus = exportStatus;
    }

    /**
     * <p>
     * The current status of the deletion. When the deletion is complete, the export will no longer be returned by the
     * operation and calls to the with the export identifier will fail.
     * </p>
     * 
     * @return The current status of the deletion. When the deletion is complete, the export will no longer be returned
     *         by the operation and calls to the with the export identifier will fail.
     * @see ExportStatus
     */

    public String getExportStatus() {
        return this.exportStatus;
    }

    /**
     * <p>
     * The current status of the deletion. When the deletion is complete, the export will no longer be returned by the
     * operation and calls to the with the export identifier will fail.
     * </p>
     * 
     * @param exportStatus
     *        The current status of the deletion. When the deletion is complete, the export will no longer be returned
     *        by the operation and calls to the with the export identifier will fail.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExportStatus
     */

    public DeleteExportResult withExportStatus(String exportStatus) {
        setExportStatus(exportStatus);
        return this;
    }

    /**
     * <p>
     * The current status of the deletion. When the deletion is complete, the export will no longer be returned by the
     * operation and calls to the with the export identifier will fail.
     * </p>
     * 
     * @param exportStatus
     *        The current status of the deletion. When the deletion is complete, the export will no longer be returned
     *        by the operation and calls to the with the export identifier will fail.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExportStatus
     */

    public DeleteExportResult withExportStatus(ExportStatus exportStatus) {
        this.exportStatus = exportStatus.toString();
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
        if (getExportId() != null)
            sb.append("ExportId: ").append(getExportId()).append(",");
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

        if (obj instanceof DeleteExportResult == false)
            return false;
        DeleteExportResult other = (DeleteExportResult) obj;
        if (other.getExportId() == null ^ this.getExportId() == null)
            return false;
        if (other.getExportId() != null && other.getExportId().equals(this.getExportId()) == false)
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

        hashCode = prime * hashCode + ((getExportId() == null) ? 0 : getExportId().hashCode());
        hashCode = prime * hashCode + ((getExportStatus() == null) ? 0 : getExportStatus().hashCode());
        return hashCode;
    }

    @Override
    public DeleteExportResult clone() {
        try {
            return (DeleteExportResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
