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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The text format for the title.
 * </p>
 * <p>
 * This is a union type structure. For this structure to be valid, only one of the attributes can be defined.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ShortFormatText" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ShortFormatText implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Plain text format.
     * </p>
     */
    private String plainText;
    /**
     * <p>
     * Rich text. Examples of rich text include bold, underline, and italics.
     * </p>
     */
    private String richText;

    /**
     * <p>
     * Plain text format.
     * </p>
     * 
     * @param plainText
     *        Plain text format.
     */

    public void setPlainText(String plainText) {
        this.plainText = plainText;
    }

    /**
     * <p>
     * Plain text format.
     * </p>
     * 
     * @return Plain text format.
     */

    public String getPlainText() {
        return this.plainText;
    }

    /**
     * <p>
     * Plain text format.
     * </p>
     * 
     * @param plainText
     *        Plain text format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ShortFormatText withPlainText(String plainText) {
        setPlainText(plainText);
        return this;
    }

    /**
     * <p>
     * Rich text. Examples of rich text include bold, underline, and italics.
     * </p>
     * 
     * @param richText
     *        Rich text. Examples of rich text include bold, underline, and italics.
     */

    public void setRichText(String richText) {
        this.richText = richText;
    }

    /**
     * <p>
     * Rich text. Examples of rich text include bold, underline, and italics.
     * </p>
     * 
     * @return Rich text. Examples of rich text include bold, underline, and italics.
     */

    public String getRichText() {
        return this.richText;
    }

    /**
     * <p>
     * Rich text. Examples of rich text include bold, underline, and italics.
     * </p>
     * 
     * @param richText
     *        Rich text. Examples of rich text include bold, underline, and italics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ShortFormatText withRichText(String richText) {
        setRichText(richText);
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
        if (getPlainText() != null)
            sb.append("PlainText: ").append(getPlainText()).append(",");
        if (getRichText() != null)
            sb.append("RichText: ").append(getRichText());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ShortFormatText == false)
            return false;
        ShortFormatText other = (ShortFormatText) obj;
        if (other.getPlainText() == null ^ this.getPlainText() == null)
            return false;
        if (other.getPlainText() != null && other.getPlainText().equals(this.getPlainText()) == false)
            return false;
        if (other.getRichText() == null ^ this.getRichText() == null)
            return false;
        if (other.getRichText() != null && other.getRichText().equals(this.getRichText()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPlainText() == null) ? 0 : getPlainText().hashCode());
        hashCode = prime * hashCode + ((getRichText() == null) ? 0 : getRichText().hashCode());
        return hashCode;
    }

    @Override
    public ShortFormatText clone() {
        try {
            return (ShortFormatText) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.ShortFormatTextMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
