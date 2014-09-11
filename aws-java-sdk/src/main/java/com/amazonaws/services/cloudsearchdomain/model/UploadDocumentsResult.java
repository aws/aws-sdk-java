/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.cloudsearchdomain.model;

import java.io.Serializable;

/**
 * <p>
 * Contains the response to an <code>UploadDocuments</code> request.
 * </p>
 */
public class UploadDocumentsResult implements Serializable {

    /**
     * The status of an <code>UploadDocumentsRequest</code>.
     */
    private String status;

    /**
     * The number of documents that were added to the search domain.
     */
    private Long adds;

    /**
     * The number of documents that were deleted from the search domain.
     */
    private Long deletes;

    /**
     * Any warnings returned by the document service about the documents
     * being uploaded.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<DocumentServiceWarning> warnings;

    /**
     * The status of an <code>UploadDocumentsRequest</code>.
     *
     * @return The status of an <code>UploadDocumentsRequest</code>.
     */
    public String getStatus() {
        return status;
    }
    
    /**
     * The status of an <code>UploadDocumentsRequest</code>.
     *
     * @param status The status of an <code>UploadDocumentsRequest</code>.
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
    /**
     * The status of an <code>UploadDocumentsRequest</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param status The status of an <code>UploadDocumentsRequest</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UploadDocumentsResult withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * The number of documents that were added to the search domain.
     *
     * @return The number of documents that were added to the search domain.
     */
    public Long getAdds() {
        return adds;
    }
    
    /**
     * The number of documents that were added to the search domain.
     *
     * @param adds The number of documents that were added to the search domain.
     */
    public void setAdds(Long adds) {
        this.adds = adds;
    }
    
    /**
     * The number of documents that were added to the search domain.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param adds The number of documents that were added to the search domain.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UploadDocumentsResult withAdds(Long adds) {
        this.adds = adds;
        return this;
    }

    /**
     * The number of documents that were deleted from the search domain.
     *
     * @return The number of documents that were deleted from the search domain.
     */
    public Long getDeletes() {
        return deletes;
    }
    
    /**
     * The number of documents that were deleted from the search domain.
     *
     * @param deletes The number of documents that were deleted from the search domain.
     */
    public void setDeletes(Long deletes) {
        this.deletes = deletes;
    }
    
    /**
     * The number of documents that were deleted from the search domain.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param deletes The number of documents that were deleted from the search domain.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UploadDocumentsResult withDeletes(Long deletes) {
        this.deletes = deletes;
        return this;
    }

    /**
     * Any warnings returned by the document service about the documents
     * being uploaded.
     *
     * @return Any warnings returned by the document service about the documents
     *         being uploaded.
     */
    public java.util.List<DocumentServiceWarning> getWarnings() {
        if (warnings == null) {
              warnings = new com.amazonaws.internal.ListWithAutoConstructFlag<DocumentServiceWarning>();
              warnings.setAutoConstruct(true);
        }
        return warnings;
    }
    
    /**
     * Any warnings returned by the document service about the documents
     * being uploaded.
     *
     * @param warnings Any warnings returned by the document service about the documents
     *         being uploaded.
     */
    public void setWarnings(java.util.Collection<DocumentServiceWarning> warnings) {
        if (warnings == null) {
            this.warnings = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<DocumentServiceWarning> warningsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<DocumentServiceWarning>(warnings.size());
        warningsCopy.addAll(warnings);
        this.warnings = warningsCopy;
    }
    
    /**
     * Any warnings returned by the document service about the documents
     * being uploaded.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param warnings Any warnings returned by the document service about the documents
     *         being uploaded.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UploadDocumentsResult withWarnings(DocumentServiceWarning... warnings) {
        if (getWarnings() == null) setWarnings(new java.util.ArrayList<DocumentServiceWarning>(warnings.length));
        for (DocumentServiceWarning value : warnings) {
            getWarnings().add(value);
        }
        return this;
    }
    
    /**
     * Any warnings returned by the document service about the documents
     * being uploaded.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param warnings Any warnings returned by the document service about the documents
     *         being uploaded.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UploadDocumentsResult withWarnings(java.util.Collection<DocumentServiceWarning> warnings) {
        if (warnings == null) {
            this.warnings = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<DocumentServiceWarning> warningsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<DocumentServiceWarning>(warnings.size());
            warningsCopy.addAll(warnings);
            this.warnings = warningsCopy;
        }

        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getStatus() != null) sb.append("Status: " + getStatus() + ",");
        if (getAdds() != null) sb.append("Adds: " + getAdds() + ",");
        if (getDeletes() != null) sb.append("Deletes: " + getDeletes() + ",");
        if (getWarnings() != null) sb.append("Warnings: " + getWarnings() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof UploadDocumentsResult == false) return false;
        UploadDocumentsResult other = (UploadDocumentsResult)obj;
        
        if (other.getStatus() == null ^ this.getStatus() == null) return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false) return false; 
        if (other.getAdds() == null ^ this.getAdds() == null) return false;
        if (other.getAdds() != null && other.getAdds().equals(this.getAdds()) == false) return false; 
        if (other.getDeletes() == null ^ this.getDeletes() == null) return false;
        if (other.getDeletes() != null && other.getDeletes().equals(this.getDeletes()) == false) return false; 
        if (other.getWarnings() == null ^ this.getWarnings() == null) return false;
        if (other.getWarnings() != null && other.getWarnings().equals(this.getWarnings()) == false) return false; 
        return true;
    }
    
}
    