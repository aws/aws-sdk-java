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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/UpdateDocument" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateDocumentRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A valid JSON or YAML string.
     * </p>
     */
    private String content;
    /**
     * <p>
     * A list of key and value pairs that describe attachments to a version of a document.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<AttachmentsSource> attachments;
    /**
     * <p>
     * The name of the document that you want to update.
     * </p>
     */
    private String name;
    /**
     * <p>
     * An optional field specifying the version of the artifact you are updating with the document. For example,
     * "Release 12, Update 6". This value is unique across all versions of a document, and cannot be changed.
     * </p>
     */
    private String versionName;
    /**
     * <p>
     * The version of the document that you want to update.
     * </p>
     */
    private String documentVersion;
    /**
     * <p>
     * Specify the document format for the new document version. Systems Manager supports JSON and YAML documents. JSON
     * is the default format.
     * </p>
     */
    private String documentFormat;
    /**
     * <p>
     * Specify a new target type for the document.
     * </p>
     */
    private String targetType;

    /**
     * <p>
     * A valid JSON or YAML string.
     * </p>
     * 
     * @param content
     *        A valid JSON or YAML string.
     */

    public void setContent(String content) {
        this.content = content;
    }

    /**
     * <p>
     * A valid JSON or YAML string.
     * </p>
     * 
     * @return A valid JSON or YAML string.
     */

    public String getContent() {
        return this.content;
    }

    /**
     * <p>
     * A valid JSON or YAML string.
     * </p>
     * 
     * @param content
     *        A valid JSON or YAML string.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDocumentRequest withContent(String content) {
        setContent(content);
        return this;
    }

    /**
     * <p>
     * A list of key and value pairs that describe attachments to a version of a document.
     * </p>
     * 
     * @return A list of key and value pairs that describe attachments to a version of a document.
     */

    public java.util.List<AttachmentsSource> getAttachments() {
        if (attachments == null) {
            attachments = new com.amazonaws.internal.SdkInternalList<AttachmentsSource>();
        }
        return attachments;
    }

    /**
     * <p>
     * A list of key and value pairs that describe attachments to a version of a document.
     * </p>
     * 
     * @param attachments
     *        A list of key and value pairs that describe attachments to a version of a document.
     */

    public void setAttachments(java.util.Collection<AttachmentsSource> attachments) {
        if (attachments == null) {
            this.attachments = null;
            return;
        }

        this.attachments = new com.amazonaws.internal.SdkInternalList<AttachmentsSource>(attachments);
    }

    /**
     * <p>
     * A list of key and value pairs that describe attachments to a version of a document.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAttachments(java.util.Collection)} or {@link #withAttachments(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param attachments
     *        A list of key and value pairs that describe attachments to a version of a document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDocumentRequest withAttachments(AttachmentsSource... attachments) {
        if (this.attachments == null) {
            setAttachments(new com.amazonaws.internal.SdkInternalList<AttachmentsSource>(attachments.length));
        }
        for (AttachmentsSource ele : attachments) {
            this.attachments.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of key and value pairs that describe attachments to a version of a document.
     * </p>
     * 
     * @param attachments
     *        A list of key and value pairs that describe attachments to a version of a document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDocumentRequest withAttachments(java.util.Collection<AttachmentsSource> attachments) {
        setAttachments(attachments);
        return this;
    }

    /**
     * <p>
     * The name of the document that you want to update.
     * </p>
     * 
     * @param name
     *        The name of the document that you want to update.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the document that you want to update.
     * </p>
     * 
     * @return The name of the document that you want to update.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the document that you want to update.
     * </p>
     * 
     * @param name
     *        The name of the document that you want to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDocumentRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * An optional field specifying the version of the artifact you are updating with the document. For example,
     * "Release 12, Update 6". This value is unique across all versions of a document, and cannot be changed.
     * </p>
     * 
     * @param versionName
     *        An optional field specifying the version of the artifact you are updating with the document. For example,
     *        "Release 12, Update 6". This value is unique across all versions of a document, and cannot be changed.
     */

    public void setVersionName(String versionName) {
        this.versionName = versionName;
    }

    /**
     * <p>
     * An optional field specifying the version of the artifact you are updating with the document. For example,
     * "Release 12, Update 6". This value is unique across all versions of a document, and cannot be changed.
     * </p>
     * 
     * @return An optional field specifying the version of the artifact you are updating with the document. For example,
     *         "Release 12, Update 6". This value is unique across all versions of a document, and cannot be changed.
     */

    public String getVersionName() {
        return this.versionName;
    }

    /**
     * <p>
     * An optional field specifying the version of the artifact you are updating with the document. For example,
     * "Release 12, Update 6". This value is unique across all versions of a document, and cannot be changed.
     * </p>
     * 
     * @param versionName
     *        An optional field specifying the version of the artifact you are updating with the document. For example,
     *        "Release 12, Update 6". This value is unique across all versions of a document, and cannot be changed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDocumentRequest withVersionName(String versionName) {
        setVersionName(versionName);
        return this;
    }

    /**
     * <p>
     * The version of the document that you want to update.
     * </p>
     * 
     * @param documentVersion
     *        The version of the document that you want to update.
     */

    public void setDocumentVersion(String documentVersion) {
        this.documentVersion = documentVersion;
    }

    /**
     * <p>
     * The version of the document that you want to update.
     * </p>
     * 
     * @return The version of the document that you want to update.
     */

    public String getDocumentVersion() {
        return this.documentVersion;
    }

    /**
     * <p>
     * The version of the document that you want to update.
     * </p>
     * 
     * @param documentVersion
     *        The version of the document that you want to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDocumentRequest withDocumentVersion(String documentVersion) {
        setDocumentVersion(documentVersion);
        return this;
    }

    /**
     * <p>
     * Specify the document format for the new document version. Systems Manager supports JSON and YAML documents. JSON
     * is the default format.
     * </p>
     * 
     * @param documentFormat
     *        Specify the document format for the new document version. Systems Manager supports JSON and YAML
     *        documents. JSON is the default format.
     * @see DocumentFormat
     */

    public void setDocumentFormat(String documentFormat) {
        this.documentFormat = documentFormat;
    }

    /**
     * <p>
     * Specify the document format for the new document version. Systems Manager supports JSON and YAML documents. JSON
     * is the default format.
     * </p>
     * 
     * @return Specify the document format for the new document version. Systems Manager supports JSON and YAML
     *         documents. JSON is the default format.
     * @see DocumentFormat
     */

    public String getDocumentFormat() {
        return this.documentFormat;
    }

    /**
     * <p>
     * Specify the document format for the new document version. Systems Manager supports JSON and YAML documents. JSON
     * is the default format.
     * </p>
     * 
     * @param documentFormat
     *        Specify the document format for the new document version. Systems Manager supports JSON and YAML
     *        documents. JSON is the default format.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DocumentFormat
     */

    public UpdateDocumentRequest withDocumentFormat(String documentFormat) {
        setDocumentFormat(documentFormat);
        return this;
    }

    /**
     * <p>
     * Specify the document format for the new document version. Systems Manager supports JSON and YAML documents. JSON
     * is the default format.
     * </p>
     * 
     * @param documentFormat
     *        Specify the document format for the new document version. Systems Manager supports JSON and YAML
     *        documents. JSON is the default format.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DocumentFormat
     */

    public UpdateDocumentRequest withDocumentFormat(DocumentFormat documentFormat) {
        this.documentFormat = documentFormat.toString();
        return this;
    }

    /**
     * <p>
     * Specify a new target type for the document.
     * </p>
     * 
     * @param targetType
     *        Specify a new target type for the document.
     */

    public void setTargetType(String targetType) {
        this.targetType = targetType;
    }

    /**
     * <p>
     * Specify a new target type for the document.
     * </p>
     * 
     * @return Specify a new target type for the document.
     */

    public String getTargetType() {
        return this.targetType;
    }

    /**
     * <p>
     * Specify a new target type for the document.
     * </p>
     * 
     * @param targetType
     *        Specify a new target type for the document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDocumentRequest withTargetType(String targetType) {
        setTargetType(targetType);
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
        if (getContent() != null)
            sb.append("Content: ").append(getContent()).append(",");
        if (getAttachments() != null)
            sb.append("Attachments: ").append(getAttachments()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getVersionName() != null)
            sb.append("VersionName: ").append(getVersionName()).append(",");
        if (getDocumentVersion() != null)
            sb.append("DocumentVersion: ").append(getDocumentVersion()).append(",");
        if (getDocumentFormat() != null)
            sb.append("DocumentFormat: ").append(getDocumentFormat()).append(",");
        if (getTargetType() != null)
            sb.append("TargetType: ").append(getTargetType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateDocumentRequest == false)
            return false;
        UpdateDocumentRequest other = (UpdateDocumentRequest) obj;
        if (other.getContent() == null ^ this.getContent() == null)
            return false;
        if (other.getContent() != null && other.getContent().equals(this.getContent()) == false)
            return false;
        if (other.getAttachments() == null ^ this.getAttachments() == null)
            return false;
        if (other.getAttachments() != null && other.getAttachments().equals(this.getAttachments()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getVersionName() == null ^ this.getVersionName() == null)
            return false;
        if (other.getVersionName() != null && other.getVersionName().equals(this.getVersionName()) == false)
            return false;
        if (other.getDocumentVersion() == null ^ this.getDocumentVersion() == null)
            return false;
        if (other.getDocumentVersion() != null && other.getDocumentVersion().equals(this.getDocumentVersion()) == false)
            return false;
        if (other.getDocumentFormat() == null ^ this.getDocumentFormat() == null)
            return false;
        if (other.getDocumentFormat() != null && other.getDocumentFormat().equals(this.getDocumentFormat()) == false)
            return false;
        if (other.getTargetType() == null ^ this.getTargetType() == null)
            return false;
        if (other.getTargetType() != null && other.getTargetType().equals(this.getTargetType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContent() == null) ? 0 : getContent().hashCode());
        hashCode = prime * hashCode + ((getAttachments() == null) ? 0 : getAttachments().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getVersionName() == null) ? 0 : getVersionName().hashCode());
        hashCode = prime * hashCode + ((getDocumentVersion() == null) ? 0 : getDocumentVersion().hashCode());
        hashCode = prime * hashCode + ((getDocumentFormat() == null) ? 0 : getDocumentFormat().hashCode());
        hashCode = prime * hashCode + ((getTargetType() == null) ? 0 : getTargetType().hashCode());
        return hashCode;
    }

    @Override
    public UpdateDocumentRequest clone() {
        return (UpdateDocumentRequest) super.clone();
    }

}
