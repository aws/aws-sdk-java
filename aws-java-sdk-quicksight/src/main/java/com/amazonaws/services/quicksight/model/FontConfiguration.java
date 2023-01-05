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
 * Configures the display properties of the given text.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/FontConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FontConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The option that determines the text display size.
     * </p>
     */
    private FontSize fontSize;
    /**
     * <p>
     * Determines the appearance of decorative lines on the text.
     * </p>
     */
    private String fontDecoration;
    /**
     * <p>
     * Determines the color of the text.
     * </p>
     */
    private String fontColor;
    /**
     * <p>
     * The option that determines the text display weight, or boldness.
     * </p>
     */
    private FontWeight fontWeight;
    /**
     * <p>
     * Determines the text display face that is inherited by the given font family.
     * </p>
     */
    private String fontStyle;

    /**
     * <p>
     * The option that determines the text display size.
     * </p>
     * 
     * @param fontSize
     *        The option that determines the text display size.
     */

    public void setFontSize(FontSize fontSize) {
        this.fontSize = fontSize;
    }

    /**
     * <p>
     * The option that determines the text display size.
     * </p>
     * 
     * @return The option that determines the text display size.
     */

    public FontSize getFontSize() {
        return this.fontSize;
    }

    /**
     * <p>
     * The option that determines the text display size.
     * </p>
     * 
     * @param fontSize
     *        The option that determines the text display size.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FontConfiguration withFontSize(FontSize fontSize) {
        setFontSize(fontSize);
        return this;
    }

    /**
     * <p>
     * Determines the appearance of decorative lines on the text.
     * </p>
     * 
     * @param fontDecoration
     *        Determines the appearance of decorative lines on the text.
     * @see FontDecoration
     */

    public void setFontDecoration(String fontDecoration) {
        this.fontDecoration = fontDecoration;
    }

    /**
     * <p>
     * Determines the appearance of decorative lines on the text.
     * </p>
     * 
     * @return Determines the appearance of decorative lines on the text.
     * @see FontDecoration
     */

    public String getFontDecoration() {
        return this.fontDecoration;
    }

    /**
     * <p>
     * Determines the appearance of decorative lines on the text.
     * </p>
     * 
     * @param fontDecoration
     *        Determines the appearance of decorative lines on the text.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FontDecoration
     */

    public FontConfiguration withFontDecoration(String fontDecoration) {
        setFontDecoration(fontDecoration);
        return this;
    }

    /**
     * <p>
     * Determines the appearance of decorative lines on the text.
     * </p>
     * 
     * @param fontDecoration
     *        Determines the appearance of decorative lines on the text.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FontDecoration
     */

    public FontConfiguration withFontDecoration(FontDecoration fontDecoration) {
        this.fontDecoration = fontDecoration.toString();
        return this;
    }

    /**
     * <p>
     * Determines the color of the text.
     * </p>
     * 
     * @param fontColor
     *        Determines the color of the text.
     */

    public void setFontColor(String fontColor) {
        this.fontColor = fontColor;
    }

    /**
     * <p>
     * Determines the color of the text.
     * </p>
     * 
     * @return Determines the color of the text.
     */

    public String getFontColor() {
        return this.fontColor;
    }

    /**
     * <p>
     * Determines the color of the text.
     * </p>
     * 
     * @param fontColor
     *        Determines the color of the text.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FontConfiguration withFontColor(String fontColor) {
        setFontColor(fontColor);
        return this;
    }

    /**
     * <p>
     * The option that determines the text display weight, or boldness.
     * </p>
     * 
     * @param fontWeight
     *        The option that determines the text display weight, or boldness.
     */

    public void setFontWeight(FontWeight fontWeight) {
        this.fontWeight = fontWeight;
    }

    /**
     * <p>
     * The option that determines the text display weight, or boldness.
     * </p>
     * 
     * @return The option that determines the text display weight, or boldness.
     */

    public FontWeight getFontWeight() {
        return this.fontWeight;
    }

    /**
     * <p>
     * The option that determines the text display weight, or boldness.
     * </p>
     * 
     * @param fontWeight
     *        The option that determines the text display weight, or boldness.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FontConfiguration withFontWeight(FontWeight fontWeight) {
        setFontWeight(fontWeight);
        return this;
    }

    /**
     * <p>
     * Determines the text display face that is inherited by the given font family.
     * </p>
     * 
     * @param fontStyle
     *        Determines the text display face that is inherited by the given font family.
     * @see FontStyle
     */

    public void setFontStyle(String fontStyle) {
        this.fontStyle = fontStyle;
    }

    /**
     * <p>
     * Determines the text display face that is inherited by the given font family.
     * </p>
     * 
     * @return Determines the text display face that is inherited by the given font family.
     * @see FontStyle
     */

    public String getFontStyle() {
        return this.fontStyle;
    }

    /**
     * <p>
     * Determines the text display face that is inherited by the given font family.
     * </p>
     * 
     * @param fontStyle
     *        Determines the text display face that is inherited by the given font family.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FontStyle
     */

    public FontConfiguration withFontStyle(String fontStyle) {
        setFontStyle(fontStyle);
        return this;
    }

    /**
     * <p>
     * Determines the text display face that is inherited by the given font family.
     * </p>
     * 
     * @param fontStyle
     *        Determines the text display face that is inherited by the given font family.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FontStyle
     */

    public FontConfiguration withFontStyle(FontStyle fontStyle) {
        this.fontStyle = fontStyle.toString();
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
        if (getFontSize() != null)
            sb.append("FontSize: ").append(getFontSize()).append(",");
        if (getFontDecoration() != null)
            sb.append("FontDecoration: ").append(getFontDecoration()).append(",");
        if (getFontColor() != null)
            sb.append("FontColor: ").append(getFontColor()).append(",");
        if (getFontWeight() != null)
            sb.append("FontWeight: ").append(getFontWeight()).append(",");
        if (getFontStyle() != null)
            sb.append("FontStyle: ").append(getFontStyle());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FontConfiguration == false)
            return false;
        FontConfiguration other = (FontConfiguration) obj;
        if (other.getFontSize() == null ^ this.getFontSize() == null)
            return false;
        if (other.getFontSize() != null && other.getFontSize().equals(this.getFontSize()) == false)
            return false;
        if (other.getFontDecoration() == null ^ this.getFontDecoration() == null)
            return false;
        if (other.getFontDecoration() != null && other.getFontDecoration().equals(this.getFontDecoration()) == false)
            return false;
        if (other.getFontColor() == null ^ this.getFontColor() == null)
            return false;
        if (other.getFontColor() != null && other.getFontColor().equals(this.getFontColor()) == false)
            return false;
        if (other.getFontWeight() == null ^ this.getFontWeight() == null)
            return false;
        if (other.getFontWeight() != null && other.getFontWeight().equals(this.getFontWeight()) == false)
            return false;
        if (other.getFontStyle() == null ^ this.getFontStyle() == null)
            return false;
        if (other.getFontStyle() != null && other.getFontStyle().equals(this.getFontStyle()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFontSize() == null) ? 0 : getFontSize().hashCode());
        hashCode = prime * hashCode + ((getFontDecoration() == null) ? 0 : getFontDecoration().hashCode());
        hashCode = prime * hashCode + ((getFontColor() == null) ? 0 : getFontColor().hashCode());
        hashCode = prime * hashCode + ((getFontWeight() == null) ? 0 : getFontWeight().hashCode());
        hashCode = prime * hashCode + ((getFontStyle() == null) ? 0 : getFontStyle().hashCode());
        return hashCode;
    }

    @Override
    public FontConfiguration clone() {
        try {
            return (FontConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.FontConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
