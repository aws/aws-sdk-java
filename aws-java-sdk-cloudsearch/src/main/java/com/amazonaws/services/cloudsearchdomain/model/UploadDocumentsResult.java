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
package com.amazonaws.services.cloudsearchdomain.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Contains the response to an <code>UploadDocuments</code> request.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UploadDocumentsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The status of an <code>UploadDocumentsRequest</code>.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The number of documents that were added to the search domain.
     * </p>
     */
    private Long adds;
    /**
     * <p>
     * The number of documents that were deleted from the search domain.
     * </p>
     */
    private Long deletes;
    /**
     * <p>
     * Any warnings returned by the document service about the documents being uploaded.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<DocumentServiceWarning> warnings;

    /**
     * <p>
     * The status of an <code>UploadDocumentsRequest</code>.
     * </p>
     * 
     * @param status
     *        The status of an <code>UploadDocumentsRequest</code>.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of an <code>UploadDocumentsRequest</code>.
     * </p>
     * 
     * @return The status of an <code>UploadDocumentsRequest</code>.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of an <code>UploadDocumentsRequest</code>.
     * </p>
     * 
     * @param status
     *        The status of an <code>UploadDocumentsRequest</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UploadDocumentsResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The number of documents that were added to the search domain.
     * </p>
     * 
     * @param adds
     *        The number of documents that were added to the search domain.
     */

    public void setAdds(Long adds) {
        this.adds = adds;
    }

    /**
     * <p>
     * The number of documents that were added to the search domain.
     * </p>
     * 
     * @return The number of documents that were added to the search domain.
     */

    public Long getAdds() {
        return this.adds;
    }

    /**
     * <p>
     * The number of documents that were added to the search domain.
     * </p>
     * 
     * @param adds
     *        The number of documents that were added to the search domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UploadDocumentsResult withAdds(Long adds) {
        setAdds(adds);
        return this;
    }

    /**
     * <p>
     * The number of documents that were deleted from the search domain.
     * </p>
     * 
     * @param deletes
     *        The number of documents that were deleted from the search domain.
     */

    public void setDeletes(Long deletes) {
        this.deletes = deletes;
    }

    /**
     * <p>
     * The number of documents that were deleted from the search domain.
     * </p>
     * 
     * @return The number of documents that were deleted from the search domain.
     */

    public Long getDeletes() {
        return this.deletes;
    }

    /**
     * <p>
     * The number of documents that were deleted from the search domain.
     * </p>
     * 
     * @param deletes
     *        The number of documents that were deleted from the search domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UploadDocumentsResult withDeletes(Long deletes) {
        setDeletes(deletes);
        return this;
    }

    /**
     * <p>
     * Any warnings returned by the document service about the documents being uploaded.
     * </p>
     * 
     * @return Any warnings returned by the document service about the documents being uploaded.
     */

    public java.util.List<DocumentServiceWarning> getWarnings() {
        if (warnings == null) {
            warnings = new com.amazonaws.internal.SdkInternalList<DocumentServiceWarning>();
        }
        return warnings;
    }

    /**
     * <p>
     * Any warnings returned by the document service about the documents being uploaded.
     * </p>
     * 
     * @param warnings
     *        Any warnings returned by the document service about the documents being uploaded.
     */

    public void setWarnings(java.util.Collection<DocumentServiceWarning> warnings) {
        if (warnings == null) {
            this.warnings = null;
            return;
        }

        this.warnings = new com.amazonaws.internal.SdkInternalList<DocumentServiceWarning>(warnings);
    }

    /**
     * <p>
     * Any warnings returned by the document service about the documents being uploaded.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setWarnings(java.util.Collection)} or {@link #withWarnings(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param warnings
     *        Any warnings returned by the document service about the documents being uploaded.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UploadDocumentsResult withWarnings(DocumentServiceWarning... warnings) {
        if (this.warnings == null) {
            setWarnings(new com.amazonaws.internal.SdkInternalList<DocumentServiceWarning>(warnings.length));
        }
        for (DocumentServiceWarning ele : warnings) {
            this.warnings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Any warnings returned by the document service about the documents being uploaded.
     * </p>
     * 
     * @param warnings
     *        Any warnings returned by the document service about the documents being uploaded.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UploadDocumentsResult withWarnings(java.util.Collection<DocumentServiceWarning> warnings) {
        setWarnings(warnings);
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
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getAdds() != null)
            sb.append("Adds: ").append(getAdds()).append(",");
        if (getDeletes() != null)
            sb.append("Deletes: ").append(getDeletes()).append(",");
        if (getWarnings() != null)
            sb.append("Warnings: ").append(getWarnings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UploadDocumentsResult == false)
            return false;
        UploadDocumentsResult other = (UploadDocumentsResult) obj;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getAdds() == null ^ this.getAdds() == null)
            return false;
        if (other.getAdds() != null && other.getAdds().equals(this.getAdds()) == false)
            return false;
        if (other.getDeletes() == null ^ this.getDeletes() == null)
            return false;
        if (other.getDeletes() != null && other.getDeletes().equals(this.getDeletes()) == false)
            return false;
        if (other.getWarnings() == null ^ this.getWarnings() == null)
            return false;
        if (other.getWarnings() != null && other.getWarnings().equals(this.getWarnings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getAdds() == null) ? 0 : getAdds().hashCode());
        hashCode = prime * hashCode + ((getDeletes() == null) ? 0 : getDeletes().hashCode());
        hashCode = prime * hashCode + ((getWarnings() == null) ? 0 : getWarnings().hashCode());
        return hashCode;
    }

    @Override
    public UploadDocumentsResult clone() {
        try {
            return (UploadDocumentsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
