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
package com.amazonaws.services.comprehend.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/ClassifyDocument" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ClassifyDocumentResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The classes used by the document being analyzed. These are used for multi-class trained models. Individual
     * classes are mutually exclusive and each document is expected to have only a single class assigned to it. For
     * example, an animal can be a dog or a cat, but not both at the same time.
     * </p>
     */
    private java.util.List<DocumentClass> classes;
    /**
     * <p>
     * The labels used the document being analyzed. These are used for multi-label trained models. Individual labels
     * represent different categories that are related in some manner and are not mutually exclusive. For example, a
     * movie can be just an action movie, or it can be an action movie, a science fiction movie, and a comedy, all at
     * the same time.
     * </p>
     */
    private java.util.List<DocumentLabel> labels;
    /**
     * <p>
     * Extraction information about the document. This field is present in the response only if your request includes
     * the <code>Byte</code> parameter.
     * </p>
     */
    private DocumentMetadata documentMetadata;
    /**
     * <p>
     * The document type for each page in the input document. This field is present in the response only if your request
     * includes the <code>Byte</code> parameter.
     * </p>
     */
    private java.util.List<DocumentTypeListItem> documentType;
    /**
     * <p>
     * Page-level errors that the system detected while processing the input document. The field is empty if the system
     * encountered no errors.
     * </p>
     */
    private java.util.List<ErrorsListItem> errors;

    /**
     * <p>
     * The classes used by the document being analyzed. These are used for multi-class trained models. Individual
     * classes are mutually exclusive and each document is expected to have only a single class assigned to it. For
     * example, an animal can be a dog or a cat, but not both at the same time.
     * </p>
     * 
     * @return The classes used by the document being analyzed. These are used for multi-class trained models.
     *         Individual classes are mutually exclusive and each document is expected to have only a single class
     *         assigned to it. For example, an animal can be a dog or a cat, but not both at the same time.
     */

    public java.util.List<DocumentClass> getClasses() {
        return classes;
    }

    /**
     * <p>
     * The classes used by the document being analyzed. These are used for multi-class trained models. Individual
     * classes are mutually exclusive and each document is expected to have only a single class assigned to it. For
     * example, an animal can be a dog or a cat, but not both at the same time.
     * </p>
     * 
     * @param classes
     *        The classes used by the document being analyzed. These are used for multi-class trained models. Individual
     *        classes are mutually exclusive and each document is expected to have only a single class assigned to it.
     *        For example, an animal can be a dog or a cat, but not both at the same time.
     */

    public void setClasses(java.util.Collection<DocumentClass> classes) {
        if (classes == null) {
            this.classes = null;
            return;
        }

        this.classes = new java.util.ArrayList<DocumentClass>(classes);
    }

    /**
     * <p>
     * The classes used by the document being analyzed. These are used for multi-class trained models. Individual
     * classes are mutually exclusive and each document is expected to have only a single class assigned to it. For
     * example, an animal can be a dog or a cat, but not both at the same time.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setClasses(java.util.Collection)} or {@link #withClasses(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param classes
     *        The classes used by the document being analyzed. These are used for multi-class trained models. Individual
     *        classes are mutually exclusive and each document is expected to have only a single class assigned to it.
     *        For example, an animal can be a dog or a cat, but not both at the same time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClassifyDocumentResult withClasses(DocumentClass... classes) {
        if (this.classes == null) {
            setClasses(new java.util.ArrayList<DocumentClass>(classes.length));
        }
        for (DocumentClass ele : classes) {
            this.classes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The classes used by the document being analyzed. These are used for multi-class trained models. Individual
     * classes are mutually exclusive and each document is expected to have only a single class assigned to it. For
     * example, an animal can be a dog or a cat, but not both at the same time.
     * </p>
     * 
     * @param classes
     *        The classes used by the document being analyzed. These are used for multi-class trained models. Individual
     *        classes are mutually exclusive and each document is expected to have only a single class assigned to it.
     *        For example, an animal can be a dog or a cat, but not both at the same time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClassifyDocumentResult withClasses(java.util.Collection<DocumentClass> classes) {
        setClasses(classes);
        return this;
    }

    /**
     * <p>
     * The labels used the document being analyzed. These are used for multi-label trained models. Individual labels
     * represent different categories that are related in some manner and are not mutually exclusive. For example, a
     * movie can be just an action movie, or it can be an action movie, a science fiction movie, and a comedy, all at
     * the same time.
     * </p>
     * 
     * @return The labels used the document being analyzed. These are used for multi-label trained models. Individual
     *         labels represent different categories that are related in some manner and are not mutually exclusive. For
     *         example, a movie can be just an action movie, or it can be an action movie, a science fiction movie, and
     *         a comedy, all at the same time.
     */

    public java.util.List<DocumentLabel> getLabels() {
        return labels;
    }

    /**
     * <p>
     * The labels used the document being analyzed. These are used for multi-label trained models. Individual labels
     * represent different categories that are related in some manner and are not mutually exclusive. For example, a
     * movie can be just an action movie, or it can be an action movie, a science fiction movie, and a comedy, all at
     * the same time.
     * </p>
     * 
     * @param labels
     *        The labels used the document being analyzed. These are used for multi-label trained models. Individual
     *        labels represent different categories that are related in some manner and are not mutually exclusive. For
     *        example, a movie can be just an action movie, or it can be an action movie, a science fiction movie, and a
     *        comedy, all at the same time.
     */

    public void setLabels(java.util.Collection<DocumentLabel> labels) {
        if (labels == null) {
            this.labels = null;
            return;
        }

        this.labels = new java.util.ArrayList<DocumentLabel>(labels);
    }

    /**
     * <p>
     * The labels used the document being analyzed. These are used for multi-label trained models. Individual labels
     * represent different categories that are related in some manner and are not mutually exclusive. For example, a
     * movie can be just an action movie, or it can be an action movie, a science fiction movie, and a comedy, all at
     * the same time.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLabels(java.util.Collection)} or {@link #withLabels(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param labels
     *        The labels used the document being analyzed. These are used for multi-label trained models. Individual
     *        labels represent different categories that are related in some manner and are not mutually exclusive. For
     *        example, a movie can be just an action movie, or it can be an action movie, a science fiction movie, and a
     *        comedy, all at the same time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClassifyDocumentResult withLabels(DocumentLabel... labels) {
        if (this.labels == null) {
            setLabels(new java.util.ArrayList<DocumentLabel>(labels.length));
        }
        for (DocumentLabel ele : labels) {
            this.labels.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The labels used the document being analyzed. These are used for multi-label trained models. Individual labels
     * represent different categories that are related in some manner and are not mutually exclusive. For example, a
     * movie can be just an action movie, or it can be an action movie, a science fiction movie, and a comedy, all at
     * the same time.
     * </p>
     * 
     * @param labels
     *        The labels used the document being analyzed. These are used for multi-label trained models. Individual
     *        labels represent different categories that are related in some manner and are not mutually exclusive. For
     *        example, a movie can be just an action movie, or it can be an action movie, a science fiction movie, and a
     *        comedy, all at the same time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClassifyDocumentResult withLabels(java.util.Collection<DocumentLabel> labels) {
        setLabels(labels);
        return this;
    }

    /**
     * <p>
     * Extraction information about the document. This field is present in the response only if your request includes
     * the <code>Byte</code> parameter.
     * </p>
     * 
     * @param documentMetadata
     *        Extraction information about the document. This field is present in the response only if your request
     *        includes the <code>Byte</code> parameter.
     */

    public void setDocumentMetadata(DocumentMetadata documentMetadata) {
        this.documentMetadata = documentMetadata;
    }

    /**
     * <p>
     * Extraction information about the document. This field is present in the response only if your request includes
     * the <code>Byte</code> parameter.
     * </p>
     * 
     * @return Extraction information about the document. This field is present in the response only if your request
     *         includes the <code>Byte</code> parameter.
     */

    public DocumentMetadata getDocumentMetadata() {
        return this.documentMetadata;
    }

    /**
     * <p>
     * Extraction information about the document. This field is present in the response only if your request includes
     * the <code>Byte</code> parameter.
     * </p>
     * 
     * @param documentMetadata
     *        Extraction information about the document. This field is present in the response only if your request
     *        includes the <code>Byte</code> parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClassifyDocumentResult withDocumentMetadata(DocumentMetadata documentMetadata) {
        setDocumentMetadata(documentMetadata);
        return this;
    }

    /**
     * <p>
     * The document type for each page in the input document. This field is present in the response only if your request
     * includes the <code>Byte</code> parameter.
     * </p>
     * 
     * @return The document type for each page in the input document. This field is present in the response only if your
     *         request includes the <code>Byte</code> parameter.
     */

    public java.util.List<DocumentTypeListItem> getDocumentType() {
        return documentType;
    }

    /**
     * <p>
     * The document type for each page in the input document. This field is present in the response only if your request
     * includes the <code>Byte</code> parameter.
     * </p>
     * 
     * @param documentType
     *        The document type for each page in the input document. This field is present in the response only if your
     *        request includes the <code>Byte</code> parameter.
     */

    public void setDocumentType(java.util.Collection<DocumentTypeListItem> documentType) {
        if (documentType == null) {
            this.documentType = null;
            return;
        }

        this.documentType = new java.util.ArrayList<DocumentTypeListItem>(documentType);
    }

    /**
     * <p>
     * The document type for each page in the input document. This field is present in the response only if your request
     * includes the <code>Byte</code> parameter.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDocumentType(java.util.Collection)} or {@link #withDocumentType(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param documentType
     *        The document type for each page in the input document. This field is present in the response only if your
     *        request includes the <code>Byte</code> parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClassifyDocumentResult withDocumentType(DocumentTypeListItem... documentType) {
        if (this.documentType == null) {
            setDocumentType(new java.util.ArrayList<DocumentTypeListItem>(documentType.length));
        }
        for (DocumentTypeListItem ele : documentType) {
            this.documentType.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The document type for each page in the input document. This field is present in the response only if your request
     * includes the <code>Byte</code> parameter.
     * </p>
     * 
     * @param documentType
     *        The document type for each page in the input document. This field is present in the response only if your
     *        request includes the <code>Byte</code> parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClassifyDocumentResult withDocumentType(java.util.Collection<DocumentTypeListItem> documentType) {
        setDocumentType(documentType);
        return this;
    }

    /**
     * <p>
     * Page-level errors that the system detected while processing the input document. The field is empty if the system
     * encountered no errors.
     * </p>
     * 
     * @return Page-level errors that the system detected while processing the input document. The field is empty if the
     *         system encountered no errors.
     */

    public java.util.List<ErrorsListItem> getErrors() {
        return errors;
    }

    /**
     * <p>
     * Page-level errors that the system detected while processing the input document. The field is empty if the system
     * encountered no errors.
     * </p>
     * 
     * @param errors
     *        Page-level errors that the system detected while processing the input document. The field is empty if the
     *        system encountered no errors.
     */

    public void setErrors(java.util.Collection<ErrorsListItem> errors) {
        if (errors == null) {
            this.errors = null;
            return;
        }

        this.errors = new java.util.ArrayList<ErrorsListItem>(errors);
    }

    /**
     * <p>
     * Page-level errors that the system detected while processing the input document. The field is empty if the system
     * encountered no errors.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setErrors(java.util.Collection)} or {@link #withErrors(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param errors
     *        Page-level errors that the system detected while processing the input document. The field is empty if the
     *        system encountered no errors.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClassifyDocumentResult withErrors(ErrorsListItem... errors) {
        if (this.errors == null) {
            setErrors(new java.util.ArrayList<ErrorsListItem>(errors.length));
        }
        for (ErrorsListItem ele : errors) {
            this.errors.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Page-level errors that the system detected while processing the input document. The field is empty if the system
     * encountered no errors.
     * </p>
     * 
     * @param errors
     *        Page-level errors that the system detected while processing the input document. The field is empty if the
     *        system encountered no errors.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClassifyDocumentResult withErrors(java.util.Collection<ErrorsListItem> errors) {
        setErrors(errors);
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
        if (getClasses() != null)
            sb.append("Classes: ").append(getClasses()).append(",");
        if (getLabels() != null)
            sb.append("Labels: ").append(getLabels()).append(",");
        if (getDocumentMetadata() != null)
            sb.append("DocumentMetadata: ").append(getDocumentMetadata()).append(",");
        if (getDocumentType() != null)
            sb.append("DocumentType: ").append(getDocumentType()).append(",");
        if (getErrors() != null)
            sb.append("Errors: ").append(getErrors());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ClassifyDocumentResult == false)
            return false;
        ClassifyDocumentResult other = (ClassifyDocumentResult) obj;
        if (other.getClasses() == null ^ this.getClasses() == null)
            return false;
        if (other.getClasses() != null && other.getClasses().equals(this.getClasses()) == false)
            return false;
        if (other.getLabels() == null ^ this.getLabels() == null)
            return false;
        if (other.getLabels() != null && other.getLabels().equals(this.getLabels()) == false)
            return false;
        if (other.getDocumentMetadata() == null ^ this.getDocumentMetadata() == null)
            return false;
        if (other.getDocumentMetadata() != null && other.getDocumentMetadata().equals(this.getDocumentMetadata()) == false)
            return false;
        if (other.getDocumentType() == null ^ this.getDocumentType() == null)
            return false;
        if (other.getDocumentType() != null && other.getDocumentType().equals(this.getDocumentType()) == false)
            return false;
        if (other.getErrors() == null ^ this.getErrors() == null)
            return false;
        if (other.getErrors() != null && other.getErrors().equals(this.getErrors()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClasses() == null) ? 0 : getClasses().hashCode());
        hashCode = prime * hashCode + ((getLabels() == null) ? 0 : getLabels().hashCode());
        hashCode = prime * hashCode + ((getDocumentMetadata() == null) ? 0 : getDocumentMetadata().hashCode());
        hashCode = prime * hashCode + ((getDocumentType() == null) ? 0 : getDocumentType().hashCode());
        hashCode = prime * hashCode + ((getErrors() == null) ? 0 : getErrors().hashCode());
        return hashCode;
    }

    @Override
    public ClassifyDocumentResult clone() {
        try {
            return (ClassifyDocumentResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
