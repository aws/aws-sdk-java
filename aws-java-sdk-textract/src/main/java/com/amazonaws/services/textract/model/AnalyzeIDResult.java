/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.textract.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/textract-2018-06-27/AnalyzeID" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AnalyzeIDResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The list of documents processed by AnalyzeID. Includes a number denoting their place in the list and the response
     * structure for the document.
     * </p>
     */
    private java.util.List<IdentityDocument> identityDocuments;

    private DocumentMetadata documentMetadata;
    /**
     * <p>
     * The version of the AnalyzeIdentity API being used to process documents.
     * </p>
     */
    private String analyzeIDModelVersion;

    /**
     * <p>
     * The list of documents processed by AnalyzeID. Includes a number denoting their place in the list and the response
     * structure for the document.
     * </p>
     * 
     * @return The list of documents processed by AnalyzeID. Includes a number denoting their place in the list and the
     *         response structure for the document.
     */

    public java.util.List<IdentityDocument> getIdentityDocuments() {
        return identityDocuments;
    }

    /**
     * <p>
     * The list of documents processed by AnalyzeID. Includes a number denoting their place in the list and the response
     * structure for the document.
     * </p>
     * 
     * @param identityDocuments
     *        The list of documents processed by AnalyzeID. Includes a number denoting their place in the list and the
     *        response structure for the document.
     */

    public void setIdentityDocuments(java.util.Collection<IdentityDocument> identityDocuments) {
        if (identityDocuments == null) {
            this.identityDocuments = null;
            return;
        }

        this.identityDocuments = new java.util.ArrayList<IdentityDocument>(identityDocuments);
    }

    /**
     * <p>
     * The list of documents processed by AnalyzeID. Includes a number denoting their place in the list and the response
     * structure for the document.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIdentityDocuments(java.util.Collection)} or {@link #withIdentityDocuments(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param identityDocuments
     *        The list of documents processed by AnalyzeID. Includes a number denoting their place in the list and the
     *        response structure for the document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalyzeIDResult withIdentityDocuments(IdentityDocument... identityDocuments) {
        if (this.identityDocuments == null) {
            setIdentityDocuments(new java.util.ArrayList<IdentityDocument>(identityDocuments.length));
        }
        for (IdentityDocument ele : identityDocuments) {
            this.identityDocuments.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of documents processed by AnalyzeID. Includes a number denoting their place in the list and the response
     * structure for the document.
     * </p>
     * 
     * @param identityDocuments
     *        The list of documents processed by AnalyzeID. Includes a number denoting their place in the list and the
     *        response structure for the document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalyzeIDResult withIdentityDocuments(java.util.Collection<IdentityDocument> identityDocuments) {
        setIdentityDocuments(identityDocuments);
        return this;
    }

    /**
     * @param documentMetadata
     */

    public void setDocumentMetadata(DocumentMetadata documentMetadata) {
        this.documentMetadata = documentMetadata;
    }

    /**
     * @return
     */

    public DocumentMetadata getDocumentMetadata() {
        return this.documentMetadata;
    }

    /**
     * @param documentMetadata
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalyzeIDResult withDocumentMetadata(DocumentMetadata documentMetadata) {
        setDocumentMetadata(documentMetadata);
        return this;
    }

    /**
     * <p>
     * The version of the AnalyzeIdentity API being used to process documents.
     * </p>
     * 
     * @param analyzeIDModelVersion
     *        The version of the AnalyzeIdentity API being used to process documents.
     */

    public void setAnalyzeIDModelVersion(String analyzeIDModelVersion) {
        this.analyzeIDModelVersion = analyzeIDModelVersion;
    }

    /**
     * <p>
     * The version of the AnalyzeIdentity API being used to process documents.
     * </p>
     * 
     * @return The version of the AnalyzeIdentity API being used to process documents.
     */

    public String getAnalyzeIDModelVersion() {
        return this.analyzeIDModelVersion;
    }

    /**
     * <p>
     * The version of the AnalyzeIdentity API being used to process documents.
     * </p>
     * 
     * @param analyzeIDModelVersion
     *        The version of the AnalyzeIdentity API being used to process documents.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalyzeIDResult withAnalyzeIDModelVersion(String analyzeIDModelVersion) {
        setAnalyzeIDModelVersion(analyzeIDModelVersion);
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
        if (getIdentityDocuments() != null)
            sb.append("IdentityDocuments: ").append(getIdentityDocuments()).append(",");
        if (getDocumentMetadata() != null)
            sb.append("DocumentMetadata: ").append(getDocumentMetadata()).append(",");
        if (getAnalyzeIDModelVersion() != null)
            sb.append("AnalyzeIDModelVersion: ").append(getAnalyzeIDModelVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AnalyzeIDResult == false)
            return false;
        AnalyzeIDResult other = (AnalyzeIDResult) obj;
        if (other.getIdentityDocuments() == null ^ this.getIdentityDocuments() == null)
            return false;
        if (other.getIdentityDocuments() != null && other.getIdentityDocuments().equals(this.getIdentityDocuments()) == false)
            return false;
        if (other.getDocumentMetadata() == null ^ this.getDocumentMetadata() == null)
            return false;
        if (other.getDocumentMetadata() != null && other.getDocumentMetadata().equals(this.getDocumentMetadata()) == false)
            return false;
        if (other.getAnalyzeIDModelVersion() == null ^ this.getAnalyzeIDModelVersion() == null)
            return false;
        if (other.getAnalyzeIDModelVersion() != null && other.getAnalyzeIDModelVersion().equals(this.getAnalyzeIDModelVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIdentityDocuments() == null) ? 0 : getIdentityDocuments().hashCode());
        hashCode = prime * hashCode + ((getDocumentMetadata() == null) ? 0 : getDocumentMetadata().hashCode());
        hashCode = prime * hashCode + ((getAnalyzeIDModelVersion() == null) ? 0 : getAnalyzeIDModelVersion().hashCode());
        return hashCode;
    }

    @Override
    public AnalyzeIDResult clone() {
        try {
            return (AnalyzeIDResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
