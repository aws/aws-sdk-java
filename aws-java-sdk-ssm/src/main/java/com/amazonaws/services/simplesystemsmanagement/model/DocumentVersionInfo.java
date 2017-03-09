/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Version information about the document.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DocumentVersionInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DocumentVersionInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The document name.
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
     * The date the document was created.
     * </p>
     */
    private java.util.Date createdDate;
    /**
     * <p>
     * An identifier for the default version of the document.
     * </p>
     */
    private Boolean isDefaultVersion;

    /**
     * <p>
     * The document name.
     * </p>
     * 
     * @param name
     *        The document name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The document name.
     * </p>
     * 
     * @return The document name.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The document name.
     * </p>
     * 
     * @param name
     *        The document name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DocumentVersionInfo withName(String name) {
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

    public DocumentVersionInfo withDocumentVersion(String documentVersion) {
        setDocumentVersion(documentVersion);
        return this;
    }

    /**
     * <p>
     * The date the document was created.
     * </p>
     * 
     * @param createdDate
     *        The date the document was created.
     */

    public void setCreatedDate(java.util.Date createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * <p>
     * The date the document was created.
     * </p>
     * 
     * @return The date the document was created.
     */

    public java.util.Date getCreatedDate() {
        return this.createdDate;
    }

    /**
     * <p>
     * The date the document was created.
     * </p>
     * 
     * @param createdDate
     *        The date the document was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DocumentVersionInfo withCreatedDate(java.util.Date createdDate) {
        setCreatedDate(createdDate);
        return this;
    }

    /**
     * <p>
     * An identifier for the default version of the document.
     * </p>
     * 
     * @param isDefaultVersion
     *        An identifier for the default version of the document.
     */

    public void setIsDefaultVersion(Boolean isDefaultVersion) {
        this.isDefaultVersion = isDefaultVersion;
    }

    /**
     * <p>
     * An identifier for the default version of the document.
     * </p>
     * 
     * @return An identifier for the default version of the document.
     */

    public Boolean getIsDefaultVersion() {
        return this.isDefaultVersion;
    }

    /**
     * <p>
     * An identifier for the default version of the document.
     * </p>
     * 
     * @param isDefaultVersion
     *        An identifier for the default version of the document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DocumentVersionInfo withIsDefaultVersion(Boolean isDefaultVersion) {
        setIsDefaultVersion(isDefaultVersion);
        return this;
    }

    /**
     * <p>
     * An identifier for the default version of the document.
     * </p>
     * 
     * @return An identifier for the default version of the document.
     */

    public Boolean isDefaultVersion() {
        return this.isDefaultVersion;
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
        if (getCreatedDate() != null)
            sb.append("CreatedDate: ").append(getCreatedDate()).append(",");
        if (getIsDefaultVersion() != null)
            sb.append("IsDefaultVersion: ").append(getIsDefaultVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DocumentVersionInfo == false)
            return false;
        DocumentVersionInfo other = (DocumentVersionInfo) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDocumentVersion() == null ^ this.getDocumentVersion() == null)
            return false;
        if (other.getDocumentVersion() != null && other.getDocumentVersion().equals(this.getDocumentVersion()) == false)
            return false;
        if (other.getCreatedDate() == null ^ this.getCreatedDate() == null)
            return false;
        if (other.getCreatedDate() != null && other.getCreatedDate().equals(this.getCreatedDate()) == false)
            return false;
        if (other.getIsDefaultVersion() == null ^ this.getIsDefaultVersion() == null)
            return false;
        if (other.getIsDefaultVersion() != null && other.getIsDefaultVersion().equals(this.getIsDefaultVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDocumentVersion() == null) ? 0 : getDocumentVersion().hashCode());
        hashCode = prime * hashCode + ((getCreatedDate() == null) ? 0 : getCreatedDate().hashCode());
        hashCode = prime * hashCode + ((getIsDefaultVersion() == null) ? 0 : getIsDefaultVersion().hashCode());
        return hashCode;
    }

    @Override
    public DocumentVersionInfo clone() {
        try {
            return (DocumentVersionInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simplesystemsmanagement.model.transform.DocumentVersionInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
