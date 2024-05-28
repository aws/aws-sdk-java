/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.qconnect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details about the source content text data.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qconnect-2020-10-19/TextData" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TextData implements Serializable, Cloneable, StructuredPojo {

    private DocumentText excerpt;

    private DocumentText title;

    /**
     * @param excerpt
     */

    public void setExcerpt(DocumentText excerpt) {
        this.excerpt = excerpt;
    }

    /**
     * @return
     */

    public DocumentText getExcerpt() {
        return this.excerpt;
    }

    /**
     * @param excerpt
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TextData withExcerpt(DocumentText excerpt) {
        setExcerpt(excerpt);
        return this;
    }

    /**
     * @param title
     */

    public void setTitle(DocumentText title) {
        this.title = title;
    }

    /**
     * @return
     */

    public DocumentText getTitle() {
        return this.title;
    }

    /**
     * @param title
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TextData withTitle(DocumentText title) {
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

        if (obj instanceof TextData == false)
            return false;
        TextData other = (TextData) obj;
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

        hashCode = prime * hashCode + ((getExcerpt() == null) ? 0 : getExcerpt().hashCode());
        hashCode = prime * hashCode + ((getTitle() == null) ? 0 : getTitle().hashCode());
        return hashCode;
    }

    @Override
    public TextData clone() {
        try {
            return (TextData) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.qconnect.model.transform.TextDataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
