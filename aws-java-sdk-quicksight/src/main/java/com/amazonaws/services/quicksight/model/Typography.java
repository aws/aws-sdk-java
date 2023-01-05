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
 * Determines the typography options.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/Typography" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Typography implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Determines the list of font families.
     * </p>
     */
    private java.util.List<Font> fontFamilies;

    /**
     * <p>
     * Determines the list of font families.
     * </p>
     * 
     * @return Determines the list of font families.
     */

    public java.util.List<Font> getFontFamilies() {
        return fontFamilies;
    }

    /**
     * <p>
     * Determines the list of font families.
     * </p>
     * 
     * @param fontFamilies
     *        Determines the list of font families.
     */

    public void setFontFamilies(java.util.Collection<Font> fontFamilies) {
        if (fontFamilies == null) {
            this.fontFamilies = null;
            return;
        }

        this.fontFamilies = new java.util.ArrayList<Font>(fontFamilies);
    }

    /**
     * <p>
     * Determines the list of font families.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFontFamilies(java.util.Collection)} or {@link #withFontFamilies(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param fontFamilies
     *        Determines the list of font families.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Typography withFontFamilies(Font... fontFamilies) {
        if (this.fontFamilies == null) {
            setFontFamilies(new java.util.ArrayList<Font>(fontFamilies.length));
        }
        for (Font ele : fontFamilies) {
            this.fontFamilies.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Determines the list of font families.
     * </p>
     * 
     * @param fontFamilies
     *        Determines the list of font families.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Typography withFontFamilies(java.util.Collection<Font> fontFamilies) {
        setFontFamilies(fontFamilies);
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
        if (getFontFamilies() != null)
            sb.append("FontFamilies: ").append(getFontFamilies());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Typography == false)
            return false;
        Typography other = (Typography) obj;
        if (other.getFontFamilies() == null ^ this.getFontFamilies() == null)
            return false;
        if (other.getFontFamilies() != null && other.getFontFamilies().equals(this.getFontFamilies()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFontFamilies() == null) ? 0 : getFontFamilies().hashCode());
        return hashCode;
    }

    @Override
    public Typography clone() {
        try {
            return (Typography) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.TypographyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
