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
package com.amazonaws.services.qbusiness.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The details of a document within an Amazon Q Business index.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/DocumentDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DocumentDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier of the document.
     * </p>
     */
    private String documentId;
    /**
     * <p>
     * The current status of the document.
     * </p>
     */
    private String status;
    /**
     * <p>
     * An error message associated with the document.
     * </p>
     */
    private ErrorDetail error;
    /**
     * <p>
     * The timestamp for when the document was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The timestamp for when the document was last updated.
     * </p>
     */
    private java.util.Date updatedAt;

    /**
     * <p>
     * The identifier of the document.
     * </p>
     * 
     * @param documentId
     *        The identifier of the document.
     */

    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }

    /**
     * <p>
     * The identifier of the document.
     * </p>
     * 
     * @return The identifier of the document.
     */

    public String getDocumentId() {
        return this.documentId;
    }

    /**
     * <p>
     * The identifier of the document.
     * </p>
     * 
     * @param documentId
     *        The identifier of the document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DocumentDetails withDocumentId(String documentId) {
        setDocumentId(documentId);
        return this;
    }

    /**
     * <p>
     * The current status of the document.
     * </p>
     * 
     * @param status
     *        The current status of the document.
     * @see DocumentStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the document.
     * </p>
     * 
     * @return The current status of the document.
     * @see DocumentStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status of the document.
     * </p>
     * 
     * @param status
     *        The current status of the document.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DocumentStatus
     */

    public DocumentDetails withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The current status of the document.
     * </p>
     * 
     * @param status
     *        The current status of the document.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DocumentStatus
     */

    public DocumentDetails withStatus(DocumentStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * An error message associated with the document.
     * </p>
     * 
     * @param error
     *        An error message associated with the document.
     */

    public void setError(ErrorDetail error) {
        this.error = error;
    }

    /**
     * <p>
     * An error message associated with the document.
     * </p>
     * 
     * @return An error message associated with the document.
     */

    public ErrorDetail getError() {
        return this.error;
    }

    /**
     * <p>
     * An error message associated with the document.
     * </p>
     * 
     * @param error
     *        An error message associated with the document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DocumentDetails withError(ErrorDetail error) {
        setError(error);
        return this;
    }

    /**
     * <p>
     * The timestamp for when the document was created.
     * </p>
     * 
     * @param createdAt
     *        The timestamp for when the document was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The timestamp for when the document was created.
     * </p>
     * 
     * @return The timestamp for when the document was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The timestamp for when the document was created.
     * </p>
     * 
     * @param createdAt
     *        The timestamp for when the document was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DocumentDetails withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The timestamp for when the document was last updated.
     * </p>
     * 
     * @param updatedAt
     *        The timestamp for when the document was last updated.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The timestamp for when the document was last updated.
     * </p>
     * 
     * @return The timestamp for when the document was last updated.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The timestamp for when the document was last updated.
     * </p>
     * 
     * @param updatedAt
     *        The timestamp for when the document was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DocumentDetails withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
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
        if (getDocumentId() != null)
            sb.append("DocumentId: ").append(getDocumentId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getError() != null)
            sb.append("Error: ").append(getError()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DocumentDetails == false)
            return false;
        DocumentDetails other = (DocumentDetails) obj;
        if (other.getDocumentId() == null ^ this.getDocumentId() == null)
            return false;
        if (other.getDocumentId() != null && other.getDocumentId().equals(this.getDocumentId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getError() == null ^ this.getError() == null)
            return false;
        if (other.getError() != null && other.getError().equals(this.getError()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDocumentId() == null) ? 0 : getDocumentId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getError() == null) ? 0 : getError().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        return hashCode;
    }

    @Override
    public DocumentDetails clone() {
        try {
            return (DocumentDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.qbusiness.model.transform.DocumentDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
