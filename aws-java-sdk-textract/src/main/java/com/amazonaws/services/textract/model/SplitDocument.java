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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about the pages of a document, defined by logical boundary.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/textract-2018-06-27/SplitDocument" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SplitDocument implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The index for a given document in a DocumentGroup of a specific Type.
     * </p>
     */
    private Integer index;
    /**
     * <p>
     * An array of page numbers for a for a given document, ordered by logical boundary.
     * </p>
     */
    private java.util.List<Integer> pages;

    /**
     * <p>
     * The index for a given document in a DocumentGroup of a specific Type.
     * </p>
     * 
     * @param index
     *        The index for a given document in a DocumentGroup of a specific Type.
     */

    public void setIndex(Integer index) {
        this.index = index;
    }

    /**
     * <p>
     * The index for a given document in a DocumentGroup of a specific Type.
     * </p>
     * 
     * @return The index for a given document in a DocumentGroup of a specific Type.
     */

    public Integer getIndex() {
        return this.index;
    }

    /**
     * <p>
     * The index for a given document in a DocumentGroup of a specific Type.
     * </p>
     * 
     * @param index
     *        The index for a given document in a DocumentGroup of a specific Type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SplitDocument withIndex(Integer index) {
        setIndex(index);
        return this;
    }

    /**
     * <p>
     * An array of page numbers for a for a given document, ordered by logical boundary.
     * </p>
     * 
     * @return An array of page numbers for a for a given document, ordered by logical boundary.
     */

    public java.util.List<Integer> getPages() {
        return pages;
    }

    /**
     * <p>
     * An array of page numbers for a for a given document, ordered by logical boundary.
     * </p>
     * 
     * @param pages
     *        An array of page numbers for a for a given document, ordered by logical boundary.
     */

    public void setPages(java.util.Collection<Integer> pages) {
        if (pages == null) {
            this.pages = null;
            return;
        }

        this.pages = new java.util.ArrayList<Integer>(pages);
    }

    /**
     * <p>
     * An array of page numbers for a for a given document, ordered by logical boundary.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPages(java.util.Collection)} or {@link #withPages(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param pages
     *        An array of page numbers for a for a given document, ordered by logical boundary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SplitDocument withPages(Integer... pages) {
        if (this.pages == null) {
            setPages(new java.util.ArrayList<Integer>(pages.length));
        }
        for (Integer ele : pages) {
            this.pages.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of page numbers for a for a given document, ordered by logical boundary.
     * </p>
     * 
     * @param pages
     *        An array of page numbers for a for a given document, ordered by logical boundary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SplitDocument withPages(java.util.Collection<Integer> pages) {
        setPages(pages);
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
        if (getIndex() != null)
            sb.append("Index: ").append(getIndex()).append(",");
        if (getPages() != null)
            sb.append("Pages: ").append(getPages());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SplitDocument == false)
            return false;
        SplitDocument other = (SplitDocument) obj;
        if (other.getIndex() == null ^ this.getIndex() == null)
            return false;
        if (other.getIndex() != null && other.getIndex().equals(this.getIndex()) == false)
            return false;
        if (other.getPages() == null ^ this.getPages() == null)
            return false;
        if (other.getPages() != null && other.getPages().equals(this.getPages()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIndex() == null) ? 0 : getIndex().hashCode());
        hashCode = prime * hashCode + ((getPages() == null) ? 0 : getPages().hashCode());
        return hashCode;
    }

    @Override
    public SplitDocument clone() {
        try {
            return (SplitDocument) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.textract.model.transform.SplitDocumentMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
