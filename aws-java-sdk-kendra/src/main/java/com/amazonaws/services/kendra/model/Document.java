/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * A document in an index.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/Document" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Document implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A unique identifier of the document in the index.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The title of the document.
     * </p>
     */
    private String title;
    /**
     * <p>
     * The contents of the document as a base-64 encoded string.
     * </p>
     */
    private java.nio.ByteBuffer blob;

    private S3Path s3Path;
    /**
     * <p>
     * Custom attributes to apply to the document. Use the custom attributes to provide additional information for
     * searching, to provide facets for refining searches, and to provide additional information in the query response.
     * </p>
     */
    private java.util.List<DocumentAttribute> attributes;
    /**
     * <p>
     * Information to use for user context filtering.
     * </p>
     */
    private java.util.List<Principal> accessControlList;
    /**
     * <p>
     * The file type of the document in the <code>Blob</code> field.
     * </p>
     */
    private String contentType;

    /**
     * <p>
     * A unique identifier of the document in the index.
     * </p>
     * 
     * @param id
     *        A unique identifier of the document in the index.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * A unique identifier of the document in the index.
     * </p>
     * 
     * @return A unique identifier of the document in the index.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * A unique identifier of the document in the index.
     * </p>
     * 
     * @param id
     *        A unique identifier of the document in the index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Document withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The title of the document.
     * </p>
     * 
     * @param title
     *        The title of the document.
     */

    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * <p>
     * The title of the document.
     * </p>
     * 
     * @return The title of the document.
     */

    public String getTitle() {
        return this.title;
    }

    /**
     * <p>
     * The title of the document.
     * </p>
     * 
     * @param title
     *        The title of the document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Document withTitle(String title) {
        setTitle(title);
        return this;
    }

    /**
     * <p>
     * The contents of the document as a base-64 encoded string.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * <p>
     * Warning: ByteBuffers returned by the SDK are mutable. Changes to the content or position of the byte buffer will
     * be seen by all objects that have a reference to this object. It is recommended to call ByteBuffer.duplicate() or
     * ByteBuffer.asReadOnlyBuffer() before using or reading from the buffer. This behavior will be changed in a future
     * major version of the SDK.
     * </p>
     * 
     * @param blob
     *        The contents of the document as a base-64 encoded string.
     */

    public void setBlob(java.nio.ByteBuffer blob) {
        this.blob = blob;
    }

    /**
     * <p>
     * The contents of the document as a base-64 encoded string.
     * </p>
     * <p>
     * {@code ByteBuffer}s are stateful. Calling their {@code get} methods changes their {@code position}. We recommend
     * using {@link java.nio.ByteBuffer#asReadOnlyBuffer()} to create a read-only view of the buffer with an independent
     * {@code position}, and calling {@code get} methods on this rather than directly on the returned {@code ByteBuffer}.
     * Doing so will ensure that anyone else using the {@code ByteBuffer} will not be affected by changes to the
     * {@code position}.
     * </p>
     * 
     * @return The contents of the document as a base-64 encoded string.
     */

    public java.nio.ByteBuffer getBlob() {
        return this.blob;
    }

    /**
     * <p>
     * The contents of the document as a base-64 encoded string.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * <p>
     * Warning: ByteBuffers returned by the SDK are mutable. Changes to the content or position of the byte buffer will
     * be seen by all objects that have a reference to this object. It is recommended to call ByteBuffer.duplicate() or
     * ByteBuffer.asReadOnlyBuffer() before using or reading from the buffer. This behavior will be changed in a future
     * major version of the SDK.
     * </p>
     * 
     * @param blob
     *        The contents of the document as a base-64 encoded string.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Document withBlob(java.nio.ByteBuffer blob) {
        setBlob(blob);
        return this;
    }

    /**
     * @param s3Path
     */

    public void setS3Path(S3Path s3Path) {
        this.s3Path = s3Path;
    }

    /**
     * @return
     */

    public S3Path getS3Path() {
        return this.s3Path;
    }

    /**
     * @param s3Path
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Document withS3Path(S3Path s3Path) {
        setS3Path(s3Path);
        return this;
    }

    /**
     * <p>
     * Custom attributes to apply to the document. Use the custom attributes to provide additional information for
     * searching, to provide facets for refining searches, and to provide additional information in the query response.
     * </p>
     * 
     * @return Custom attributes to apply to the document. Use the custom attributes to provide additional information
     *         for searching, to provide facets for refining searches, and to provide additional information in the
     *         query response.
     */

    public java.util.List<DocumentAttribute> getAttributes() {
        return attributes;
    }

    /**
     * <p>
     * Custom attributes to apply to the document. Use the custom attributes to provide additional information for
     * searching, to provide facets for refining searches, and to provide additional information in the query response.
     * </p>
     * 
     * @param attributes
     *        Custom attributes to apply to the document. Use the custom attributes to provide additional information
     *        for searching, to provide facets for refining searches, and to provide additional information in the query
     *        response.
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
     * Custom attributes to apply to the document. Use the custom attributes to provide additional information for
     * searching, to provide facets for refining searches, and to provide additional information in the query response.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAttributes(java.util.Collection)} or {@link #withAttributes(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param attributes
     *        Custom attributes to apply to the document. Use the custom attributes to provide additional information
     *        for searching, to provide facets for refining searches, and to provide additional information in the query
     *        response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Document withAttributes(DocumentAttribute... attributes) {
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
     * Custom attributes to apply to the document. Use the custom attributes to provide additional information for
     * searching, to provide facets for refining searches, and to provide additional information in the query response.
     * </p>
     * 
     * @param attributes
     *        Custom attributes to apply to the document. Use the custom attributes to provide additional information
     *        for searching, to provide facets for refining searches, and to provide additional information in the query
     *        response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Document withAttributes(java.util.Collection<DocumentAttribute> attributes) {
        setAttributes(attributes);
        return this;
    }

    /**
     * <p>
     * Information to use for user context filtering.
     * </p>
     * 
     * @return Information to use for user context filtering.
     */

    public java.util.List<Principal> getAccessControlList() {
        return accessControlList;
    }

    /**
     * <p>
     * Information to use for user context filtering.
     * </p>
     * 
     * @param accessControlList
     *        Information to use for user context filtering.
     */

    public void setAccessControlList(java.util.Collection<Principal> accessControlList) {
        if (accessControlList == null) {
            this.accessControlList = null;
            return;
        }

        this.accessControlList = new java.util.ArrayList<Principal>(accessControlList);
    }

    /**
     * <p>
     * Information to use for user context filtering.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAccessControlList(java.util.Collection)} or {@link #withAccessControlList(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param accessControlList
     *        Information to use for user context filtering.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Document withAccessControlList(Principal... accessControlList) {
        if (this.accessControlList == null) {
            setAccessControlList(new java.util.ArrayList<Principal>(accessControlList.length));
        }
        for (Principal ele : accessControlList) {
            this.accessControlList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information to use for user context filtering.
     * </p>
     * 
     * @param accessControlList
     *        Information to use for user context filtering.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Document withAccessControlList(java.util.Collection<Principal> accessControlList) {
        setAccessControlList(accessControlList);
        return this;
    }

    /**
     * <p>
     * The file type of the document in the <code>Blob</code> field.
     * </p>
     * 
     * @param contentType
     *        The file type of the document in the <code>Blob</code> field.
     * @see ContentType
     */

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * <p>
     * The file type of the document in the <code>Blob</code> field.
     * </p>
     * 
     * @return The file type of the document in the <code>Blob</code> field.
     * @see ContentType
     */

    public String getContentType() {
        return this.contentType;
    }

    /**
     * <p>
     * The file type of the document in the <code>Blob</code> field.
     * </p>
     * 
     * @param contentType
     *        The file type of the document in the <code>Blob</code> field.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContentType
     */

    public Document withContentType(String contentType) {
        setContentType(contentType);
        return this;
    }

    /**
     * <p>
     * The file type of the document in the <code>Blob</code> field.
     * </p>
     * 
     * @param contentType
     *        The file type of the document in the <code>Blob</code> field.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContentType
     */

    public Document withContentType(ContentType contentType) {
        this.contentType = contentType.toString();
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getTitle() != null)
            sb.append("Title: ").append(getTitle()).append(",");
        if (getBlob() != null)
            sb.append("Blob: ").append(getBlob()).append(",");
        if (getS3Path() != null)
            sb.append("S3Path: ").append(getS3Path()).append(",");
        if (getAttributes() != null)
            sb.append("Attributes: ").append(getAttributes()).append(",");
        if (getAccessControlList() != null)
            sb.append("AccessControlList: ").append(getAccessControlList()).append(",");
        if (getContentType() != null)
            sb.append("ContentType: ").append(getContentType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Document == false)
            return false;
        Document other = (Document) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getTitle() == null ^ this.getTitle() == null)
            return false;
        if (other.getTitle() != null && other.getTitle().equals(this.getTitle()) == false)
            return false;
        if (other.getBlob() == null ^ this.getBlob() == null)
            return false;
        if (other.getBlob() != null && other.getBlob().equals(this.getBlob()) == false)
            return false;
        if (other.getS3Path() == null ^ this.getS3Path() == null)
            return false;
        if (other.getS3Path() != null && other.getS3Path().equals(this.getS3Path()) == false)
            return false;
        if (other.getAttributes() == null ^ this.getAttributes() == null)
            return false;
        if (other.getAttributes() != null && other.getAttributes().equals(this.getAttributes()) == false)
            return false;
        if (other.getAccessControlList() == null ^ this.getAccessControlList() == null)
            return false;
        if (other.getAccessControlList() != null && other.getAccessControlList().equals(this.getAccessControlList()) == false)
            return false;
        if (other.getContentType() == null ^ this.getContentType() == null)
            return false;
        if (other.getContentType() != null && other.getContentType().equals(this.getContentType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getTitle() == null) ? 0 : getTitle().hashCode());
        hashCode = prime * hashCode + ((getBlob() == null) ? 0 : getBlob().hashCode());
        hashCode = prime * hashCode + ((getS3Path() == null) ? 0 : getS3Path().hashCode());
        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        hashCode = prime * hashCode + ((getAccessControlList() == null) ? 0 : getAccessControlList().hashCode());
        hashCode = prime * hashCode + ((getContentType() == null) ? 0 : getContentType().hashCode());
        return hashCode;
    }

    @Override
    public Document clone() {
        try {
            return (Document) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kendra.model.transform.DocumentMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
