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
 * Describes the name of an SSM document.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DocumentIdentifier" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DocumentIdentifier implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the SSM document.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The AWS user account of the person who created the document.
     * </p>
     */
    private String owner;
    /**
     * <p>
     * The operating system platform.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> platformTypes;
    /**
     * <p>
     * The document version.
     * </p>
     */
    private String documentVersion;
    /**
     * <p>
     * The document type.
     * </p>
     */
    private String documentType;
    /**
     * <p>
     * The schema version.
     * </p>
     */
    private String schemaVersion;

    /**
     * <p>
     * The name of the SSM document.
     * </p>
     * 
     * @param name
     *        The name of the SSM document.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the SSM document.
     * </p>
     * 
     * @return The name of the SSM document.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the SSM document.
     * </p>
     * 
     * @param name
     *        The name of the SSM document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DocumentIdentifier withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The AWS user account of the person who created the document.
     * </p>
     * 
     * @param owner
     *        The AWS user account of the person who created the document.
     */

    public void setOwner(String owner) {
        this.owner = owner;
    }

    /**
     * <p>
     * The AWS user account of the person who created the document.
     * </p>
     * 
     * @return The AWS user account of the person who created the document.
     */

    public String getOwner() {
        return this.owner;
    }

    /**
     * <p>
     * The AWS user account of the person who created the document.
     * </p>
     * 
     * @param owner
     *        The AWS user account of the person who created the document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DocumentIdentifier withOwner(String owner) {
        setOwner(owner);
        return this;
    }

    /**
     * <p>
     * The operating system platform.
     * </p>
     * 
     * @return The operating system platform.
     * @see PlatformType
     */

    public java.util.List<String> getPlatformTypes() {
        if (platformTypes == null) {
            platformTypes = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return platformTypes;
    }

    /**
     * <p>
     * The operating system platform.
     * </p>
     * 
     * @param platformTypes
     *        The operating system platform.
     * @see PlatformType
     */

    public void setPlatformTypes(java.util.Collection<String> platformTypes) {
        if (platformTypes == null) {
            this.platformTypes = null;
            return;
        }

        this.platformTypes = new com.amazonaws.internal.SdkInternalList<String>(platformTypes);
    }

    /**
     * <p>
     * The operating system platform.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPlatformTypes(java.util.Collection)} or {@link #withPlatformTypes(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param platformTypes
     *        The operating system platform.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PlatformType
     */

    public DocumentIdentifier withPlatformTypes(String... platformTypes) {
        if (this.platformTypes == null) {
            setPlatformTypes(new com.amazonaws.internal.SdkInternalList<String>(platformTypes.length));
        }
        for (String ele : platformTypes) {
            this.platformTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The operating system platform.
     * </p>
     * 
     * @param platformTypes
     *        The operating system platform.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PlatformType
     */

    public DocumentIdentifier withPlatformTypes(java.util.Collection<String> platformTypes) {
        setPlatformTypes(platformTypes);
        return this;
    }

    /**
     * <p>
     * The operating system platform.
     * </p>
     * 
     * @param platformTypes
     *        The operating system platform.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PlatformType
     */

    public DocumentIdentifier withPlatformTypes(PlatformType... platformTypes) {
        com.amazonaws.internal.SdkInternalList<String> platformTypesCopy = new com.amazonaws.internal.SdkInternalList<String>(platformTypes.length);
        for (PlatformType value : platformTypes) {
            platformTypesCopy.add(value.toString());
        }
        if (getPlatformTypes() == null) {
            setPlatformTypes(platformTypesCopy);
        } else {
            getPlatformTypes().addAll(platformTypesCopy);
        }
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

    public DocumentIdentifier withDocumentVersion(String documentVersion) {
        setDocumentVersion(documentVersion);
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

    public DocumentIdentifier withDocumentType(String documentType) {
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
        this.documentType = documentType.toString();
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

    public DocumentIdentifier withDocumentType(DocumentType documentType) {
        setDocumentType(documentType);
        return this;
    }

    /**
     * <p>
     * The schema version.
     * </p>
     * 
     * @param schemaVersion
     *        The schema version.
     */

    public void setSchemaVersion(String schemaVersion) {
        this.schemaVersion = schemaVersion;
    }

    /**
     * <p>
     * The schema version.
     * </p>
     * 
     * @return The schema version.
     */

    public String getSchemaVersion() {
        return this.schemaVersion;
    }

    /**
     * <p>
     * The schema version.
     * </p>
     * 
     * @param schemaVersion
     *        The schema version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DocumentIdentifier withSchemaVersion(String schemaVersion) {
        setSchemaVersion(schemaVersion);
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
        if (getOwner() != null)
            sb.append("Owner: ").append(getOwner()).append(",");
        if (getPlatformTypes() != null)
            sb.append("PlatformTypes: ").append(getPlatformTypes()).append(",");
        if (getDocumentVersion() != null)
            sb.append("DocumentVersion: ").append(getDocumentVersion()).append(",");
        if (getDocumentType() != null)
            sb.append("DocumentType: ").append(getDocumentType()).append(",");
        if (getSchemaVersion() != null)
            sb.append("SchemaVersion: ").append(getSchemaVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DocumentIdentifier == false)
            return false;
        DocumentIdentifier other = (DocumentIdentifier) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getOwner() == null ^ this.getOwner() == null)
            return false;
        if (other.getOwner() != null && other.getOwner().equals(this.getOwner()) == false)
            return false;
        if (other.getPlatformTypes() == null ^ this.getPlatformTypes() == null)
            return false;
        if (other.getPlatformTypes() != null && other.getPlatformTypes().equals(this.getPlatformTypes()) == false)
            return false;
        if (other.getDocumentVersion() == null ^ this.getDocumentVersion() == null)
            return false;
        if (other.getDocumentVersion() != null && other.getDocumentVersion().equals(this.getDocumentVersion()) == false)
            return false;
        if (other.getDocumentType() == null ^ this.getDocumentType() == null)
            return false;
        if (other.getDocumentType() != null && other.getDocumentType().equals(this.getDocumentType()) == false)
            return false;
        if (other.getSchemaVersion() == null ^ this.getSchemaVersion() == null)
            return false;
        if (other.getSchemaVersion() != null && other.getSchemaVersion().equals(this.getSchemaVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getOwner() == null) ? 0 : getOwner().hashCode());
        hashCode = prime * hashCode + ((getPlatformTypes() == null) ? 0 : getPlatformTypes().hashCode());
        hashCode = prime * hashCode + ((getDocumentVersion() == null) ? 0 : getDocumentVersion().hashCode());
        hashCode = prime * hashCode + ((getDocumentType() == null) ? 0 : getDocumentType().hashCode());
        hashCode = prime * hashCode + ((getSchemaVersion() == null) ? 0 : getSchemaVersion().hashCode());
        return hashCode;
    }

    @Override
    public DocumentIdentifier clone() {
        try {
            return (DocumentIdentifier) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simplesystemsmanagement.model.transform.DocumentIdentifierMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
