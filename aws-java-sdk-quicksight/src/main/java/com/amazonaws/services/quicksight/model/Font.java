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
 * Determines the font settings.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/Font" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Font implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Determines the font family settings.
     * </p>
     */
    private String fontFamily;

    /**
     * <p>
     * Determines the font family settings.
     * </p>
     * 
     * @param fontFamily
     *        Determines the font family settings.
     */

    public void setFontFamily(String fontFamily) {
        this.fontFamily = fontFamily;
    }

    /**
     * <p>
     * Determines the font family settings.
     * </p>
     * 
     * @return Determines the font family settings.
     */

    public String getFontFamily() {
        return this.fontFamily;
    }

    /**
     * <p>
     * Determines the font family settings.
     * </p>
     * 
     * @param fontFamily
     *        Determines the font family settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Font withFontFamily(String fontFamily) {
        setFontFamily(fontFamily);
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
        if (getFontFamily() != null)
            sb.append("FontFamily: ").append(getFontFamily());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Font == false)
            return false;
        Font other = (Font) obj;
        if (other.getFontFamily() == null ^ this.getFontFamily() == null)
            return false;
        if (other.getFontFamily() != null && other.getFontFamily().equals(this.getFontFamily()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFontFamily() == null) ? 0 : getFontFamily().hashCode());
        return hashCode;
    }

    @Override
    public Font clone() {
        try {
            return (Font) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.FontMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
