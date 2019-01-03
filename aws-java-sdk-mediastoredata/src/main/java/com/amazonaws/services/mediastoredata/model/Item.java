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
package com.amazonaws.services.mediastoredata.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A metadata entry for a folder or object.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediastore-data-2017-09-01/Item" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Item implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the item.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The item type (folder or object).
     * </p>
     */
    private String type;
    /**
     * <p>
     * The ETag that represents a unique instance of the item.
     * </p>
     */
    private String eTag;
    /**
     * <p>
     * The date and time that the item was last modified.
     * </p>
     */
    private java.util.Date lastModified;
    /**
     * <p>
     * The content type of the item.
     * </p>
     */
    private String contentType;
    /**
     * <p>
     * The length of the item in bytes.
     * </p>
     */
    private Long contentLength;

    /**
     * <p>
     * The name of the item.
     * </p>
     * 
     * @param name
     *        The name of the item.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the item.
     * </p>
     * 
     * @return The name of the item.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the item.
     * </p>
     * 
     * @param name
     *        The name of the item.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Item withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The item type (folder or object).
     * </p>
     * 
     * @param type
     *        The item type (folder or object).
     * @see ItemType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The item type (folder or object).
     * </p>
     * 
     * @return The item type (folder or object).
     * @see ItemType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The item type (folder or object).
     * </p>
     * 
     * @param type
     *        The item type (folder or object).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ItemType
     */

    public Item withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The item type (folder or object).
     * </p>
     * 
     * @param type
     *        The item type (folder or object).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ItemType
     */

    public Item withType(ItemType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The ETag that represents a unique instance of the item.
     * </p>
     * 
     * @param eTag
     *        The ETag that represents a unique instance of the item.
     */

    public void setETag(String eTag) {
        this.eTag = eTag;
    }

    /**
     * <p>
     * The ETag that represents a unique instance of the item.
     * </p>
     * 
     * @return The ETag that represents a unique instance of the item.
     */

    public String getETag() {
        return this.eTag;
    }

    /**
     * <p>
     * The ETag that represents a unique instance of the item.
     * </p>
     * 
     * @param eTag
     *        The ETag that represents a unique instance of the item.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Item withETag(String eTag) {
        setETag(eTag);
        return this;
    }

    /**
     * <p>
     * The date and time that the item was last modified.
     * </p>
     * 
     * @param lastModified
     *        The date and time that the item was last modified.
     */

    public void setLastModified(java.util.Date lastModified) {
        this.lastModified = lastModified;
    }

    /**
     * <p>
     * The date and time that the item was last modified.
     * </p>
     * 
     * @return The date and time that the item was last modified.
     */

    public java.util.Date getLastModified() {
        return this.lastModified;
    }

    /**
     * <p>
     * The date and time that the item was last modified.
     * </p>
     * 
     * @param lastModified
     *        The date and time that the item was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Item withLastModified(java.util.Date lastModified) {
        setLastModified(lastModified);
        return this;
    }

    /**
     * <p>
     * The content type of the item.
     * </p>
     * 
     * @param contentType
     *        The content type of the item.
     */

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * <p>
     * The content type of the item.
     * </p>
     * 
     * @return The content type of the item.
     */

    public String getContentType() {
        return this.contentType;
    }

    /**
     * <p>
     * The content type of the item.
     * </p>
     * 
     * @param contentType
     *        The content type of the item.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Item withContentType(String contentType) {
        setContentType(contentType);
        return this;
    }

    /**
     * <p>
     * The length of the item in bytes.
     * </p>
     * 
     * @param contentLength
     *        The length of the item in bytes.
     */

    public void setContentLength(Long contentLength) {
        this.contentLength = contentLength;
    }

    /**
     * <p>
     * The length of the item in bytes.
     * </p>
     * 
     * @return The length of the item in bytes.
     */

    public Long getContentLength() {
        return this.contentLength;
    }

    /**
     * <p>
     * The length of the item in bytes.
     * </p>
     * 
     * @param contentLength
     *        The length of the item in bytes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Item withContentLength(Long contentLength) {
        setContentLength(contentLength);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getETag() != null)
            sb.append("ETag: ").append(getETag()).append(",");
        if (getLastModified() != null)
            sb.append("LastModified: ").append(getLastModified()).append(",");
        if (getContentType() != null)
            sb.append("ContentType: ").append(getContentType()).append(",");
        if (getContentLength() != null)
            sb.append("ContentLength: ").append(getContentLength());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Item == false)
            return false;
        Item other = (Item) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getETag() == null ^ this.getETag() == null)
            return false;
        if (other.getETag() != null && other.getETag().equals(this.getETag()) == false)
            return false;
        if (other.getLastModified() == null ^ this.getLastModified() == null)
            return false;
        if (other.getLastModified() != null && other.getLastModified().equals(this.getLastModified()) == false)
            return false;
        if (other.getContentType() == null ^ this.getContentType() == null)
            return false;
        if (other.getContentType() != null && other.getContentType().equals(this.getContentType()) == false)
            return false;
        if (other.getContentLength() == null ^ this.getContentLength() == null)
            return false;
        if (other.getContentLength() != null && other.getContentLength().equals(this.getContentLength()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getETag() == null) ? 0 : getETag().hashCode());
        hashCode = prime * hashCode + ((getLastModified() == null) ? 0 : getLastModified().hashCode());
        hashCode = prime * hashCode + ((getContentType() == null) ? 0 : getContentType().hashCode());
        hashCode = prime * hashCode + ((getContentLength() == null) ? 0 : getContentLength().hashCode());
        return hashCode;
    }

    @Override
    public Item clone() {
        try {
            return (Item) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediastoredata.model.transform.ItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
