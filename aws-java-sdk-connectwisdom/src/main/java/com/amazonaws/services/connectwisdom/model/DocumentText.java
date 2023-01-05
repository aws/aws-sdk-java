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
 * The text of the document.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/DocumentText" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DocumentText implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Highlights in the document text.
     * </p>
     */
    private java.util.List<Highlight> highlights;
    /**
     * <p>
     * Text in the document.
     * </p>
     */
    private String text;

    /**
     * <p>
     * Highlights in the document text.
     * </p>
     * 
     * @return Highlights in the document text.
     */

    public java.util.List<Highlight> getHighlights() {
        return highlights;
    }

    /**
     * <p>
     * Highlights in the document text.
     * </p>
     * 
     * @param highlights
     *        Highlights in the document text.
     */

    public void setHighlights(java.util.Collection<Highlight> highlights) {
        if (highlights == null) {
            this.highlights = null;
            return;
        }

        this.highlights = new java.util.ArrayList<Highlight>(highlights);
    }

    /**
     * <p>
     * Highlights in the document text.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setHighlights(java.util.Collection)} or {@link #withHighlights(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param highlights
     *        Highlights in the document text.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DocumentText withHighlights(Highlight... highlights) {
        if (this.highlights == null) {
            setHighlights(new java.util.ArrayList<Highlight>(highlights.length));
        }
        for (Highlight ele : highlights) {
            this.highlights.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Highlights in the document text.
     * </p>
     * 
     * @param highlights
     *        Highlights in the document text.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DocumentText withHighlights(java.util.Collection<Highlight> highlights) {
        setHighlights(highlights);
        return this;
    }

    /**
     * <p>
     * Text in the document.
     * </p>
     * 
     * @param text
     *        Text in the document.
     */

    public void setText(String text) {
        this.text = text;
    }

    /**
     * <p>
     * Text in the document.
     * </p>
     * 
     * @return Text in the document.
     */

    public String getText() {
        return this.text;
    }

    /**
     * <p>
     * Text in the document.
     * </p>
     * 
     * @param text
     *        Text in the document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DocumentText withText(String text) {
        setText(text);
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
        if (getHighlights() != null)
            sb.append("Highlights: ").append(getHighlights()).append(",");
        if (getText() != null)
            sb.append("Text: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DocumentText == false)
            return false;
        DocumentText other = (DocumentText) obj;
        if (other.getHighlights() == null ^ this.getHighlights() == null)
            return false;
        if (other.getHighlights() != null && other.getHighlights().equals(this.getHighlights()) == false)
            return false;
        if (other.getText() == null ^ this.getText() == null)
            return false;
        if (other.getText() != null && other.getText().equals(this.getText()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHighlights() == null) ? 0 : getHighlights().hashCode());
        hashCode = prime * hashCode + ((getText() == null) ? 0 : getText().hashCode());
        return hashCode;
    }

    @Override
    public DocumentText clone() {
        try {
            return (DocumentText) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connectwisdom.model.transform.DocumentTextMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
