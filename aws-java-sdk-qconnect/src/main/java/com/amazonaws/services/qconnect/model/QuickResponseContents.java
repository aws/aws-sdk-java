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
 * The content of the quick response stored in different media types.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qconnect-2020-10-19/QuickResponseContents" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class QuickResponseContents implements Serializable, Cloneable, StructuredPojo {

    private QuickResponseContentProvider markdown;

    private QuickResponseContentProvider plainText;

    /**
     * @param markdown
     */

    public void setMarkdown(QuickResponseContentProvider markdown) {
        this.markdown = markdown;
    }

    /**
     * @return
     */

    public QuickResponseContentProvider getMarkdown() {
        return this.markdown;
    }

    /**
     * @param markdown
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QuickResponseContents withMarkdown(QuickResponseContentProvider markdown) {
        setMarkdown(markdown);
        return this;
    }

    /**
     * @param plainText
     */

    public void setPlainText(QuickResponseContentProvider plainText) {
        this.plainText = plainText;
    }

    /**
     * @return
     */

    public QuickResponseContentProvider getPlainText() {
        return this.plainText;
    }

    /**
     * @param plainText
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QuickResponseContents withPlainText(QuickResponseContentProvider plainText) {
        setPlainText(plainText);
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
        if (getMarkdown() != null)
            sb.append("Markdown: ").append(getMarkdown()).append(",");
        if (getPlainText() != null)
            sb.append("PlainText: ").append(getPlainText());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof QuickResponseContents == false)
            return false;
        QuickResponseContents other = (QuickResponseContents) obj;
        if (other.getMarkdown() == null ^ this.getMarkdown() == null)
            return false;
        if (other.getMarkdown() != null && other.getMarkdown().equals(this.getMarkdown()) == false)
            return false;
        if (other.getPlainText() == null ^ this.getPlainText() == null)
            return false;
        if (other.getPlainText() != null && other.getPlainText().equals(this.getPlainText()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMarkdown() == null) ? 0 : getMarkdown().hashCode());
        hashCode = prime * hashCode + ((getPlainText() == null) ? 0 : getPlainText().hashCode());
        return hashCode;
    }

    @Override
    public QuickResponseContents clone() {
        try {
            return (QuickResponseContents) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.qconnect.model.transform.QuickResponseContentsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
