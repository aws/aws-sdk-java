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
package com.amazonaws.services.kendra.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information about the status of documents submitted for indexing.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/Status" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Status implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier of the document.
     * </p>
     */
    private String documentId;
    /**
     * <p>
     * The current status of a document.
     * </p>
     * <p>
     * If the document was submitted for deletion, the status is <code>NOT_FOUND</code> after the document is deleted.
     * </p>
     */
    private String documentStatus;
    /**
     * <p>
     * Indicates the source of the error.
     * </p>
     */
    private String failureCode;
    /**
     * <p>
     * Provides detailed information about why the document couldn't be indexed. Use this information to correct the
     * error before you resubmit the document for indexing.
     * </p>
     */
    private String failureReason;

    /**
     * <p>
     * The unique identifier of the document.
     * </p>
     * 
     * @param documentId
     *        The unique identifier of the document.
     */

    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }

    /**
     * <p>
     * The unique identifier of the document.
     * </p>
     * 
     * @return The unique identifier of the document.
     */

    public String getDocumentId() {
        return this.documentId;
    }

    /**
     * <p>
     * The unique identifier of the document.
     * </p>
     * 
     * @param documentId
     *        The unique identifier of the document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Status withDocumentId(String documentId) {
        setDocumentId(documentId);
        return this;
    }

    /**
     * <p>
     * The current status of a document.
     * </p>
     * <p>
     * If the document was submitted for deletion, the status is <code>NOT_FOUND</code> after the document is deleted.
     * </p>
     * 
     * @param documentStatus
     *        The current status of a document.</p>
     *        <p>
     *        If the document was submitted for deletion, the status is <code>NOT_FOUND</code> after the document is
     *        deleted.
     * @see DocumentStatus
     */

    public void setDocumentStatus(String documentStatus) {
        this.documentStatus = documentStatus;
    }

    /**
     * <p>
     * The current status of a document.
     * </p>
     * <p>
     * If the document was submitted for deletion, the status is <code>NOT_FOUND</code> after the document is deleted.
     * </p>
     * 
     * @return The current status of a document.</p>
     *         <p>
     *         If the document was submitted for deletion, the status is <code>NOT_FOUND</code> after the document is
     *         deleted.
     * @see DocumentStatus
     */

    public String getDocumentStatus() {
        return this.documentStatus;
    }

    /**
     * <p>
     * The current status of a document.
     * </p>
     * <p>
     * If the document was submitted for deletion, the status is <code>NOT_FOUND</code> after the document is deleted.
     * </p>
     * 
     * @param documentStatus
     *        The current status of a document.</p>
     *        <p>
     *        If the document was submitted for deletion, the status is <code>NOT_FOUND</code> after the document is
     *        deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DocumentStatus
     */

    public Status withDocumentStatus(String documentStatus) {
        setDocumentStatus(documentStatus);
        return this;
    }

    /**
     * <p>
     * The current status of a document.
     * </p>
     * <p>
     * If the document was submitted for deletion, the status is <code>NOT_FOUND</code> after the document is deleted.
     * </p>
     * 
     * @param documentStatus
     *        The current status of a document.</p>
     *        <p>
     *        If the document was submitted for deletion, the status is <code>NOT_FOUND</code> after the document is
     *        deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DocumentStatus
     */

    public Status withDocumentStatus(DocumentStatus documentStatus) {
        this.documentStatus = documentStatus.toString();
        return this;
    }

    /**
     * <p>
     * Indicates the source of the error.
     * </p>
     * 
     * @param failureCode
     *        Indicates the source of the error.
     */

    public void setFailureCode(String failureCode) {
        this.failureCode = failureCode;
    }

    /**
     * <p>
     * Indicates the source of the error.
     * </p>
     * 
     * @return Indicates the source of the error.
     */

    public String getFailureCode() {
        return this.failureCode;
    }

    /**
     * <p>
     * Indicates the source of the error.
     * </p>
     * 
     * @param failureCode
     *        Indicates the source of the error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Status withFailureCode(String failureCode) {
        setFailureCode(failureCode);
        return this;
    }

    /**
     * <p>
     * Provides detailed information about why the document couldn't be indexed. Use this information to correct the
     * error before you resubmit the document for indexing.
     * </p>
     * 
     * @param failureReason
     *        Provides detailed information about why the document couldn't be indexed. Use this information to correct
     *        the error before you resubmit the document for indexing.
     */

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * Provides detailed information about why the document couldn't be indexed. Use this information to correct the
     * error before you resubmit the document for indexing.
     * </p>
     * 
     * @return Provides detailed information about why the document couldn't be indexed. Use this information to correct
     *         the error before you resubmit the document for indexing.
     */

    public String getFailureReason() {
        return this.failureReason;
    }

    /**
     * <p>
     * Provides detailed information about why the document couldn't be indexed. Use this information to correct the
     * error before you resubmit the document for indexing.
     * </p>
     * 
     * @param failureReason
     *        Provides detailed information about why the document couldn't be indexed. Use this information to correct
     *        the error before you resubmit the document for indexing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Status withFailureReason(String failureReason) {
        setFailureReason(failureReason);
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
        if (getDocumentStatus() != null)
            sb.append("DocumentStatus: ").append(getDocumentStatus()).append(",");
        if (getFailureCode() != null)
            sb.append("FailureCode: ").append(getFailureCode()).append(",");
        if (getFailureReason() != null)
            sb.append("FailureReason: ").append(getFailureReason());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Status == false)
            return false;
        Status other = (Status) obj;
        if (other.getDocumentId() == null ^ this.getDocumentId() == null)
            return false;
        if (other.getDocumentId() != null && other.getDocumentId().equals(this.getDocumentId()) == false)
            return false;
        if (other.getDocumentStatus() == null ^ this.getDocumentStatus() == null)
            return false;
        if (other.getDocumentStatus() != null && other.getDocumentStatus().equals(this.getDocumentStatus()) == false)
            return false;
        if (other.getFailureCode() == null ^ this.getFailureCode() == null)
            return false;
        if (other.getFailureCode() != null && other.getFailureCode().equals(this.getFailureCode()) == false)
            return false;
        if (other.getFailureReason() == null ^ this.getFailureReason() == null)
            return false;
        if (other.getFailureReason() != null && other.getFailureReason().equals(this.getFailureReason()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDocumentId() == null) ? 0 : getDocumentId().hashCode());
        hashCode = prime * hashCode + ((getDocumentStatus() == null) ? 0 : getDocumentStatus().hashCode());
        hashCode = prime * hashCode + ((getFailureCode() == null) ? 0 : getFailureCode().hashCode());
        hashCode = prime * hashCode + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        return hashCode;
    }

    @Override
    public Status clone() {
        try {
            return (Status) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kendra.model.transform.StatusMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
