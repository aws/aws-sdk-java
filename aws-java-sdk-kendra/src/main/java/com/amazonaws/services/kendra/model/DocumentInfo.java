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
 * Identifies a document for which to retrieve status information
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/DocumentInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DocumentInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier of the document.
     * </p>
     */
    private String documentId;
    /**
     * <p>
     * Attributes that identify a specific version of a document to check.
     * </p>
     * <p>
     * The only valid attributes are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * version
     * </p>
     * </li>
     * <li>
     * <p>
     * datasourceId
     * </p>
     * </li>
     * <li>
     * <p>
     * jobExecutionId
     * </p>
     * </li>
     * </ul>
     * <p>
     * The attributes follow these rules:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>dataSourceId</code> and <code>jobExecutionId</code> must be used together.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>version</code> is ignored if <code>dataSourceId</code> and <code>jobExecutionId</code> are not provided.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>dataSourceId</code> and <code>jobExecutionId</code> are provided, but <code>version</code> is not, the
     * version defaults to "0".
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<DocumentAttribute> attributes;

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

    public DocumentInfo withDocumentId(String documentId) {
        setDocumentId(documentId);
        return this;
    }

    /**
     * <p>
     * Attributes that identify a specific version of a document to check.
     * </p>
     * <p>
     * The only valid attributes are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * version
     * </p>
     * </li>
     * <li>
     * <p>
     * datasourceId
     * </p>
     * </li>
     * <li>
     * <p>
     * jobExecutionId
     * </p>
     * </li>
     * </ul>
     * <p>
     * The attributes follow these rules:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>dataSourceId</code> and <code>jobExecutionId</code> must be used together.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>version</code> is ignored if <code>dataSourceId</code> and <code>jobExecutionId</code> are not provided.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>dataSourceId</code> and <code>jobExecutionId</code> are provided, but <code>version</code> is not, the
     * version defaults to "0".
     * </p>
     * </li>
     * </ul>
     * 
     * @return Attributes that identify a specific version of a document to check.</p>
     *         <p>
     *         The only valid attributes are:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         version
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         datasourceId
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         jobExecutionId
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         The attributes follow these rules:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>dataSourceId</code> and <code>jobExecutionId</code> must be used together.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>version</code> is ignored if <code>dataSourceId</code> and <code>jobExecutionId</code> are not
     *         provided.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If <code>dataSourceId</code> and <code>jobExecutionId</code> are provided, but <code>version</code> is
     *         not, the version defaults to "0".
     *         </p>
     *         </li>
     */

    public java.util.List<DocumentAttribute> getAttributes() {
        return attributes;
    }

    /**
     * <p>
     * Attributes that identify a specific version of a document to check.
     * </p>
     * <p>
     * The only valid attributes are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * version
     * </p>
     * </li>
     * <li>
     * <p>
     * datasourceId
     * </p>
     * </li>
     * <li>
     * <p>
     * jobExecutionId
     * </p>
     * </li>
     * </ul>
     * <p>
     * The attributes follow these rules:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>dataSourceId</code> and <code>jobExecutionId</code> must be used together.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>version</code> is ignored if <code>dataSourceId</code> and <code>jobExecutionId</code> are not provided.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>dataSourceId</code> and <code>jobExecutionId</code> are provided, but <code>version</code> is not, the
     * version defaults to "0".
     * </p>
     * </li>
     * </ul>
     * 
     * @param attributes
     *        Attributes that identify a specific version of a document to check.</p>
     *        <p>
     *        The only valid attributes are:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        version
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        datasourceId
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        jobExecutionId
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The attributes follow these rules:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>dataSourceId</code> and <code>jobExecutionId</code> must be used together.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>version</code> is ignored if <code>dataSourceId</code> and <code>jobExecutionId</code> are not
     *        provided.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If <code>dataSourceId</code> and <code>jobExecutionId</code> are provided, but <code>version</code> is
     *        not, the version defaults to "0".
     *        </p>
     *        </li>
     */

    public void setAttributes(java.util.Collection<DocumentAttribute> attributes) {
        if (attributes == null) {
            this.attributes = null;
            return;
        }

        this.attributes = new java.util.ArrayList<DocumentAttribute>(attributes);
    }

    /**
     * <p>
     * Attributes that identify a specific version of a document to check.
     * </p>
     * <p>
     * The only valid attributes are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * version
     * </p>
     * </li>
     * <li>
     * <p>
     * datasourceId
     * </p>
     * </li>
     * <li>
     * <p>
     * jobExecutionId
     * </p>
     * </li>
     * </ul>
     * <p>
     * The attributes follow these rules:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>dataSourceId</code> and <code>jobExecutionId</code> must be used together.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>version</code> is ignored if <code>dataSourceId</code> and <code>jobExecutionId</code> are not provided.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>dataSourceId</code> and <code>jobExecutionId</code> are provided, but <code>version</code> is not, the
     * version defaults to "0".
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAttributes(java.util.Collection)} or {@link #withAttributes(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param attributes
     *        Attributes that identify a specific version of a document to check.</p>
     *        <p>
     *        The only valid attributes are:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        version
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        datasourceId
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        jobExecutionId
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The attributes follow these rules:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>dataSourceId</code> and <code>jobExecutionId</code> must be used together.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>version</code> is ignored if <code>dataSourceId</code> and <code>jobExecutionId</code> are not
     *        provided.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If <code>dataSourceId</code> and <code>jobExecutionId</code> are provided, but <code>version</code> is
     *        not, the version defaults to "0".
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DocumentInfo withAttributes(DocumentAttribute... attributes) {
        if (this.attributes == null) {
            setAttributes(new java.util.ArrayList<DocumentAttribute>(attributes.length));
        }
        for (DocumentAttribute ele : attributes) {
            this.attributes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Attributes that identify a specific version of a document to check.
     * </p>
     * <p>
     * The only valid attributes are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * version
     * </p>
     * </li>
     * <li>
     * <p>
     * datasourceId
     * </p>
     * </li>
     * <li>
     * <p>
     * jobExecutionId
     * </p>
     * </li>
     * </ul>
     * <p>
     * The attributes follow these rules:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>dataSourceId</code> and <code>jobExecutionId</code> must be used together.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>version</code> is ignored if <code>dataSourceId</code> and <code>jobExecutionId</code> are not provided.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>dataSourceId</code> and <code>jobExecutionId</code> are provided, but <code>version</code> is not, the
     * version defaults to "0".
     * </p>
     * </li>
     * </ul>
     * 
     * @param attributes
     *        Attributes that identify a specific version of a document to check.</p>
     *        <p>
     *        The only valid attributes are:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        version
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        datasourceId
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        jobExecutionId
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The attributes follow these rules:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>dataSourceId</code> and <code>jobExecutionId</code> must be used together.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>version</code> is ignored if <code>dataSourceId</code> and <code>jobExecutionId</code> are not
     *        provided.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If <code>dataSourceId</code> and <code>jobExecutionId</code> are provided, but <code>version</code> is
     *        not, the version defaults to "0".
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DocumentInfo withAttributes(java.util.Collection<DocumentAttribute> attributes) {
        setAttributes(attributes);
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
        if (getAttributes() != null)
            sb.append("Attributes: ").append(getAttributes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DocumentInfo == false)
            return false;
        DocumentInfo other = (DocumentInfo) obj;
        if (other.getDocumentId() == null ^ this.getDocumentId() == null)
            return false;
        if (other.getDocumentId() != null && other.getDocumentId().equals(this.getDocumentId()) == false)
            return false;
        if (other.getAttributes() == null ^ this.getAttributes() == null)
            return false;
        if (other.getAttributes() != null && other.getAttributes().equals(this.getAttributes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDocumentId() == null) ? 0 : getDocumentId().hashCode());
        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        return hashCode;
    }

    @Override
    public DocumentInfo clone() {
        try {
            return (DocumentInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kendra.model.transform.DocumentInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
