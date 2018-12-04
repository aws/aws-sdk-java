/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/GetDocument" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDocumentResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the Systems Manager document.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The document version.
     * </p>
     */
    private String documentVersion;
    /**
     * <p>
     * The contents of the Systems Manager document.
     * </p>
     */
    private String content;
    /**
     * <p>
     * The document type.
     * </p>
     */
    private String documentType;
    /**
     * <p>
     * The document format, either JSON or YAML.
     * </p>
     */
    private String documentFormat;

    /**
     * <p>
     * The name of the Systems Manager document.
     * </p>
     * 
     * @param name
     *        The name of the Systems Manager document.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the Systems Manager document.
     * </p>
     * 
     * @return The name of the Systems Manager document.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the Systems Manager document.
     * </p>
     * 
     * @param name
     *        The name of the Systems Manager document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDocumentResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The document version.
     * </p>
     * 
     * @param documentVersion
     *        The document version.
     */

    public void setDocumentVersion(String documentVersion) {
        this.documentVersion = documentVersion;
    }

    /**
     * <p>
     * The document version.
     * </p>
     * 
     * @return The document version.
     */

    public String getDocumentVersion() {
        return this.documentVersion;
    }

    /**
     * <p>
     * The document version.
     * </p>
     * 
     * @param documentVersion
     *        The document version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDocumentResult withDocumentVersion(String documentVersion) {
        setDocumentVersion(documentVersion);
        return this;
    }

    /**
     * <p>
     * The contents of the Systems Manager document.
     * </p>
     * 
     * @param content
     *        The contents of the Systems Manager document.
     */

    public void setContent(String content) {
        this.content = content;
    }

    /**
     * <p>
     * The contents of the Systems Manager document.
     * </p>
     * 
     * @return The contents of the Systems Manager document.
     */

    public String getContent() {
        return this.content;
    }

    /**
     * <p>
     * The contents of the Systems Manager document.
     * </p>
     * 
     * @param content
     *        The contents of the Systems Manager document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDocumentResult withContent(String content) {
        setContent(content);
        return this;
    }

    /**
     * <p>
     * The document type.
     * </p>
     * 
     * @param documentType
     *        The document type.
     * @see DocumentType
     */

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    /**
     * <p>
     * The document type.
     * </p>
     * 
     * @return The document type.
     * @see DocumentType
     */

    public String getDocumentType() {
        return this.documentType;
    }

    /**
     * <p>
     * The document type.
     * </p>
     * 
     * @param documentType
     *        The document type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DocumentType
     */

    public GetDocumentResult withDocumentType(String documentType) {
        setDocumentType(documentType);
        return this;
    }

    /**
     * <p>
     * The document type.
     * </p>
     * 
     * @param documentType
     *        The document type.
     * @see DocumentType
     */

    public void setDocumentType(DocumentType documentType) {
        withDocumentType(documentType);
    }

    /**
     * <p>
     * The document type.
     * </p>
     * 
     * @param documentType
     *        The document type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DocumentType
     */

    public GetDocumentResult withDocumentType(DocumentType documentType) {
        this.documentType = documentType.toString();
        return this;
    }

    /**
     * <p>
     * The document format, either JSON or YAML.
     * </p>
     * 
     * @param documentFormat
     *        The document format, either JSON or YAML.
     * @see DocumentFormat
     */

    public void setDocumentFormat(String documentFormat) {
        this.documentFormat = documentFormat;
    }

    /**
     * <p>
     * The document format, either JSON or YAML.
     * </p>
     * 
     * @return The document format, either JSON or YAML.
     * @see DocumentFormat
     */

    public String getDocumentFormat() {
        return this.documentFormat;
    }

    /**
     * <p>
     * The document format, either JSON or YAML.
     * </p>
     * 
     * @param documentFormat
     *        The document format, either JSON or YAML.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DocumentFormat
     */

    public GetDocumentResult withDocumentFormat(String documentFormat) {
        setDocumentFormat(documentFormat);
        return this;
    }

    /**
     * <p>
     * The document format, either JSON or YAML.
     * </p>
     * 
     * @param documentFormat
     *        The document format, either JSON or YAML.
     * @see DocumentFormat
     */

    public void setDocumentFormat(DocumentFormat documentFormat) {
        withDocumentFormat(documentFormat);
    }

    /**
     * <p>
     * The document format, either JSON or YAML.
     * </p>
     * 
     * @param documentFormat
     *        The document format, either JSON or YAML.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DocumentFormat
     */

    public GetDocumentResult withDocumentFormat(DocumentFormat documentFormat) {
        this.documentFormat = documentFormat.toString();
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDocumentVersion() != null)
            sb.append("DocumentVersion: ").append(getDocumentVersion()).append(",");
        if (getContent() != null)
            sb.append("Content: ").append(getContent()).append(",");
        if (getDocumentType() != null)
            sb.append("DocumentType: ").append(getDocumentType()).append(",");
        if (getDocumentFormat() != null)
            sb.append("DocumentFormat: ").append(getDocumentFormat());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDocumentResult == false)
            return false;
        GetDocumentResult other = (GetDocumentResult) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDocumentVersion() == null ^ this.getDocumentVersion() == null)
            return false;
        if (other.getDocumentVersion() != null && other.getDocumentVersion().equals(this.getDocumentVersion()) == false)
            return false;
        if (other.getContent() == null ^ this.getContent() == null)
            return false;
        if (other.getContent() != null && other.getContent().equals(this.getContent()) == false)
            return false;
        if (other.getDocumentType() == null ^ this.getDocumentType() == null)
            return false;
        if (other.getDocumentType() != null && other.getDocumentType().equals(this.getDocumentType()) == false)
            return false;
        if (other.getDocumentFormat() == null ^ this.getDocumentFormat() == null)
            return false;
        if (other.getDocumentFormat() != null && other.getDocumentFormat().equals(this.getDocumentFormat()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDocumentVersion() == null) ? 0 : getDocumentVersion().hashCode());
        hashCode = prime * hashCode + ((getContent() == null) ? 0 : getContent().hashCode());
        hashCode = prime * hashCode + ((getDocumentType() == null) ? 0 : getDocumentType().hashCode());
        hashCode = prime * hashCode + ((getDocumentFormat() == null) ? 0 : getDocumentFormat().hashCode());
        return hashCode;
    }

    @Override
    public GetDocumentResult clone() {
        try {
            return (GetDocumentResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
