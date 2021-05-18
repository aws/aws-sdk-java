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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/DeleteImport" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteImportResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of the deleted import.
     * </p>
     */
    private String importId;
    /**
     * <p>
     * The current status of the deletion. When the deletion is complete, the import will no longer be returned by the
     * operation and calls to the with the import identifier will fail.
     * </p>
     */
    private String importStatus;

    /**
     * <p>
     * The unique identifier of the deleted import.
     * </p>
     * 
     * @param importId
     *        The unique identifier of the deleted import.
     */

    public void setImportId(String importId) {
        this.importId = importId;
    }

    /**
     * <p>
     * The unique identifier of the deleted import.
     * </p>
     * 
     * @return The unique identifier of the deleted import.
     */

    public String getImportId() {
        return this.importId;
    }

    /**
     * <p>
     * The unique identifier of the deleted import.
     * </p>
     * 
     * @param importId
     *        The unique identifier of the deleted import.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteImportResult withImportId(String importId) {
        setImportId(importId);
        return this;
    }

    /**
     * <p>
     * The current status of the deletion. When the deletion is complete, the import will no longer be returned by the
     * operation and calls to the with the import identifier will fail.
     * </p>
     * 
     * @param importStatus
     *        The current status of the deletion. When the deletion is complete, the import will no longer be returned
     *        by the operation and calls to the with the import identifier will fail.
     * @see ImportStatus
     */

    public void setImportStatus(String importStatus) {
        this.importStatus = importStatus;
    }

    /**
     * <p>
     * The current status of the deletion. When the deletion is complete, the import will no longer be returned by the
     * operation and calls to the with the import identifier will fail.
     * </p>
     * 
     * @return The current status of the deletion. When the deletion is complete, the import will no longer be returned
     *         by the operation and calls to the with the import identifier will fail.
     * @see ImportStatus
     */

    public String getImportStatus() {
        return this.importStatus;
    }

    /**
     * <p>
     * The current status of the deletion. When the deletion is complete, the import will no longer be returned by the
     * operation and calls to the with the import identifier will fail.
     * </p>
     * 
     * @param importStatus
     *        The current status of the deletion. When the deletion is complete, the import will no longer be returned
     *        by the operation and calls to the with the import identifier will fail.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImportStatus
     */

    public DeleteImportResult withImportStatus(String importStatus) {
        setImportStatus(importStatus);
        return this;
    }

    /**
     * <p>
     * The current status of the deletion. When the deletion is complete, the import will no longer be returned by the
     * operation and calls to the with the import identifier will fail.
     * </p>
     * 
     * @param importStatus
     *        The current status of the deletion. When the deletion is complete, the import will no longer be returned
     *        by the operation and calls to the with the import identifier will fail.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImportStatus
     */

    public DeleteImportResult withImportStatus(ImportStatus importStatus) {
        this.importStatus = importStatus.toString();
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
        if (getImportId() != null)
            sb.append("ImportId: ").append(getImportId()).append(",");
        if (getImportStatus() != null)
            sb.append("ImportStatus: ").append(getImportStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteImportResult == false)
            return false;
        DeleteImportResult other = (DeleteImportResult) obj;
        if (other.getImportId() == null ^ this.getImportId() == null)
            return false;
        if (other.getImportId() != null && other.getImportId().equals(this.getImportId()) == false)
            return false;
        if (other.getImportStatus() == null ^ this.getImportStatus() == null)
            return false;
        if (other.getImportStatus() != null && other.getImportStatus().equals(this.getImportStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getImportId() == null) ? 0 : getImportId().hashCode());
        hashCode = prime * hashCode + ((getImportStatus() == null) ? 0 : getImportStatus().hashCode());
        return hashCode;
    }

    @Override
    public DeleteImportResult clone() {
        try {
            return (DeleteImportResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
