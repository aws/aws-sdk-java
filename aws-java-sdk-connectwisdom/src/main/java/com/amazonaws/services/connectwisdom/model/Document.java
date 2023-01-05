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
package com.amazonaws.services.connectwisdom.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The document.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/Document" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Document implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A reference to the content resource.
     * </p>
     */
    private ContentReference contentReference;
    /**
     * <p>
     * The excerpt from the document.
     * </p>
     */
    private DocumentText excerpt;
    /**
     * <p>
     * The title of the document.
     * </p>
     */
    private DocumentText title;

    /**
     * <p>
     * A reference to the content resource.
     * </p>
     * 
     * @param contentReference
     *        A reference to the content resource.
     */

    public void setContentReference(ContentReference contentReference) {
        this.contentReference = contentReference;
    }

    /**
     * <p>
     * A reference to the content resource.
     * </p>
     * 
     * @return A reference to the content resource.
     */

    public ContentReference getContentReference() {
        return this.contentReference;
    }

    /**
     * <p>
     * A reference to the content resource.
     * </p>
     * 
     * @param contentReference
     *        A reference to the content resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Document withContentReference(ContentReference contentReference) {
        setContentReference(contentReference);
        return this;
    }

    /**
     * <p>
     * The excerpt from the document.
     * </p>
     * 
     * @param excerpt
     *        The excerpt from the document.
     */

    public void setExcerpt(DocumentText excerpt) {
        this.excerpt = excerpt;
    }

    /**
     * <p>
     * The excerpt from the document.
     * </p>
     * 
     * @return The excerpt from the document.
     */

    public DocumentText getExcerpt() {
        return this.excerpt;
    }

    /**
     * <p>
     * The excerpt from the document.
     * </p>
     * 
     * @param excerpt
     *        The excerpt from the document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Document withExcerpt(DocumentText excerpt) {
        setExcerpt(excerpt);
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

    public void setTitle(DocumentText title) {
        this.title = title;
    }

    /**
     * <p>
     * The title of the document.
     * </p>
     * 
     * @return The title of the document.
     */

    public DocumentText getTitle() {
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

    public Document withTitle(DocumentText title) {
        setTitle(title);
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
        if (getContentReference() != null)
            sb.append("ContentReference: ").append(getContentReference()).append(",");
        if (getExcerpt() != null)
            sb.append("Excerpt: ").append(getExcerpt()).append(",");
        if (getTitle() != null)
            sb.append("Title: ").append(getTitle());
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
        if (other.getContentReference() == null ^ this.getContentReference() == null)
            return false;
        if (other.getContentReference() != null && other.getContentReference().equals(this.getContentReference()) == false)
            return false;
        if (other.getExcerpt() == null ^ this.getExcerpt() == null)
            return false;
        if (other.getExcerpt() != null && other.getExcerpt().equals(this.getExcerpt()) == false)
            return false;
        if (other.getTitle() == null ^ this.getTitle() == null)
            return false;
        if (other.getTitle() != null && other.getTitle().equals(this.getTitle()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContentReference() == null) ? 0 : getContentReference().hashCode());
        hashCode = prime * hashCode + ((getExcerpt() == null) ? 0 : getExcerpt().hashCode());
        hashCode = prime * hashCode + ((getTitle() == null) ? 0 : getTitle().hashCode());
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
        com.amazonaws.services.connectwisdom.model.transform.DocumentMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
