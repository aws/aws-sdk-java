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
 * The table cell style for a cell in pivot table or table visual.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/TableCellStyle" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TableCellStyle implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The visibility of the table cells.
     * </p>
     */
    private String visibility;
    /**
     * <p>
     * The font configuration of the table cells.
     * </p>
     */
    private FontConfiguration fontConfiguration;
    /**
     * <p>
     * The text wrap (none, wrap) for the table cells.
     * </p>
     */
    private String textWrap;
    /**
     * <p>
     * The horizontal text alignment (left, center, right, auto) for the table cells.
     * </p>
     */
    private String horizontalTextAlignment;
    /**
     * <p>
     * The vertical text alignment (top, middle, bottom) for the table cells.
     * </p>
     */
    private String verticalTextAlignment;
    /**
     * <p>
     * The background color for the table cells.
     * </p>
     */
    private String backgroundColor;
    /**
     * <p>
     * The height color for the table cells.
     * </p>
     */
    private Integer height;
    /**
     * <p>
     * The borders for the table cells.
     * </p>
     */
    private GlobalTableBorderOptions border;

    /**
     * <p>
     * The visibility of the table cells.
     * </p>
     * 
     * @param visibility
     *        The visibility of the table cells.
     * @see Visibility
     */

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    /**
     * <p>
     * The visibility of the table cells.
     * </p>
     * 
     * @return The visibility of the table cells.
     * @see Visibility
     */

    public String getVisibility() {
        return this.visibility;
    }

    /**
     * <p>
     * The visibility of the table cells.
     * </p>
     * 
     * @param visibility
     *        The visibility of the table cells.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Visibility
     */

    public TableCellStyle withVisibility(String visibility) {
        setVisibility(visibility);
        return this;
    }

    /**
     * <p>
     * The visibility of the table cells.
     * </p>
     * 
     * @param visibility
     *        The visibility of the table cells.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Visibility
     */

    public TableCellStyle withVisibility(Visibility visibility) {
        this.visibility = visibility.toString();
        return this;
    }

    /**
     * <p>
     * The font configuration of the table cells.
     * </p>
     * 
     * @param fontConfiguration
     *        The font configuration of the table cells.
     */

    public void setFontConfiguration(FontConfiguration fontConfiguration) {
        this.fontConfiguration = fontConfiguration;
    }

    /**
     * <p>
     * The font configuration of the table cells.
     * </p>
     * 
     * @return The font configuration of the table cells.
     */

    public FontConfiguration getFontConfiguration() {
        return this.fontConfiguration;
    }

    /**
     * <p>
     * The font configuration of the table cells.
     * </p>
     * 
     * @param fontConfiguration
     *        The font configuration of the table cells.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableCellStyle withFontConfiguration(FontConfiguration fontConfiguration) {
        setFontConfiguration(fontConfiguration);
        return this;
    }

    /**
     * <p>
     * The text wrap (none, wrap) for the table cells.
     * </p>
     * 
     * @param textWrap
     *        The text wrap (none, wrap) for the table cells.
     * @see TextWrap
     */

    public void setTextWrap(String textWrap) {
        this.textWrap = textWrap;
    }

    /**
     * <p>
     * The text wrap (none, wrap) for the table cells.
     * </p>
     * 
     * @return The text wrap (none, wrap) for the table cells.
     * @see TextWrap
     */

    public String getTextWrap() {
        return this.textWrap;
    }

    /**
     * <p>
     * The text wrap (none, wrap) for the table cells.
     * </p>
     * 
     * @param textWrap
     *        The text wrap (none, wrap) for the table cells.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TextWrap
     */

    public TableCellStyle withTextWrap(String textWrap) {
        setTextWrap(textWrap);
        return this;
    }

    /**
     * <p>
     * The text wrap (none, wrap) for the table cells.
     * </p>
     * 
     * @param textWrap
     *        The text wrap (none, wrap) for the table cells.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TextWrap
     */

    public TableCellStyle withTextWrap(TextWrap textWrap) {
        this.textWrap = textWrap.toString();
        return this;
    }

    /**
     * <p>
     * The horizontal text alignment (left, center, right, auto) for the table cells.
     * </p>
     * 
     * @param horizontalTextAlignment
     *        The horizontal text alignment (left, center, right, auto) for the table cells.
     * @see HorizontalTextAlignment
     */

    public void setHorizontalTextAlignment(String horizontalTextAlignment) {
        this.horizontalTextAlignment = horizontalTextAlignment;
    }

    /**
     * <p>
     * The horizontal text alignment (left, center, right, auto) for the table cells.
     * </p>
     * 
     * @return The horizontal text alignment (left, center, right, auto) for the table cells.
     * @see HorizontalTextAlignment
     */

    public String getHorizontalTextAlignment() {
        return this.horizontalTextAlignment;
    }

    /**
     * <p>
     * The horizontal text alignment (left, center, right, auto) for the table cells.
     * </p>
     * 
     * @param horizontalTextAlignment
     *        The horizontal text alignment (left, center, right, auto) for the table cells.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HorizontalTextAlignment
     */

    public TableCellStyle withHorizontalTextAlignment(String horizontalTextAlignment) {
        setHorizontalTextAlignment(horizontalTextAlignment);
        return this;
    }

    /**
     * <p>
     * The horizontal text alignment (left, center, right, auto) for the table cells.
     * </p>
     * 
     * @param horizontalTextAlignment
     *        The horizontal text alignment (left, center, right, auto) for the table cells.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HorizontalTextAlignment
     */

    public TableCellStyle withHorizontalTextAlignment(HorizontalTextAlignment horizontalTextAlignment) {
        this.horizontalTextAlignment = horizontalTextAlignment.toString();
        return this;
    }

    /**
     * <p>
     * The vertical text alignment (top, middle, bottom) for the table cells.
     * </p>
     * 
     * @param verticalTextAlignment
     *        The vertical text alignment (top, middle, bottom) for the table cells.
     * @see VerticalTextAlignment
     */

    public void setVerticalTextAlignment(String verticalTextAlignment) {
        this.verticalTextAlignment = verticalTextAlignment;
    }

    /**
     * <p>
     * The vertical text alignment (top, middle, bottom) for the table cells.
     * </p>
     * 
     * @return The vertical text alignment (top, middle, bottom) for the table cells.
     * @see VerticalTextAlignment
     */

    public String getVerticalTextAlignment() {
        return this.verticalTextAlignment;
    }

    /**
     * <p>
     * The vertical text alignment (top, middle, bottom) for the table cells.
     * </p>
     * 
     * @param verticalTextAlignment
     *        The vertical text alignment (top, middle, bottom) for the table cells.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VerticalTextAlignment
     */

    public TableCellStyle withVerticalTextAlignment(String verticalTextAlignment) {
        setVerticalTextAlignment(verticalTextAlignment);
        return this;
    }

    /**
     * <p>
     * The vertical text alignment (top, middle, bottom) for the table cells.
     * </p>
     * 
     * @param verticalTextAlignment
     *        The vertical text alignment (top, middle, bottom) for the table cells.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VerticalTextAlignment
     */

    public TableCellStyle withVerticalTextAlignment(VerticalTextAlignment verticalTextAlignment) {
        this.verticalTextAlignment = verticalTextAlignment.toString();
        return this;
    }

    /**
     * <p>
     * The background color for the table cells.
     * </p>
     * 
     * @param backgroundColor
     *        The background color for the table cells.
     */

    public void setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    /**
     * <p>
     * The background color for the table cells.
     * </p>
     * 
     * @return The background color for the table cells.
     */

    public String getBackgroundColor() {
        return this.backgroundColor;
    }

    /**
     * <p>
     * The background color for the table cells.
     * </p>
     * 
     * @param backgroundColor
     *        The background color for the table cells.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableCellStyle withBackgroundColor(String backgroundColor) {
        setBackgroundColor(backgroundColor);
        return this;
    }

    /**
     * <p>
     * The height color for the table cells.
     * </p>
     * 
     * @param height
     *        The height color for the table cells.
     */

    public void setHeight(Integer height) {
        this.height = height;
    }

    /**
     * <p>
     * The height color for the table cells.
     * </p>
     * 
     * @return The height color for the table cells.
     */

    public Integer getHeight() {
        return this.height;
    }

    /**
     * <p>
     * The height color for the table cells.
     * </p>
     * 
     * @param height
     *        The height color for the table cells.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableCellStyle withHeight(Integer height) {
        setHeight(height);
        return this;
    }

    /**
     * <p>
     * The borders for the table cells.
     * </p>
     * 
     * @param border
     *        The borders for the table cells.
     */

    public void setBorder(GlobalTableBorderOptions border) {
        this.border = border;
    }

    /**
     * <p>
     * The borders for the table cells.
     * </p>
     * 
     * @return The borders for the table cells.
     */

    public GlobalTableBorderOptions getBorder() {
        return this.border;
    }

    /**
     * <p>
     * The borders for the table cells.
     * </p>
     * 
     * @param border
     *        The borders for the table cells.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableCellStyle withBorder(GlobalTableBorderOptions border) {
        setBorder(border);
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
        if (getVisibility() != null)
            sb.append("Visibility: ").append(getVisibility()).append(",");
        if (getFontConfiguration() != null)
            sb.append("FontConfiguration: ").append(getFontConfiguration()).append(",");
        if (getTextWrap() != null)
            sb.append("TextWrap: ").append(getTextWrap()).append(",");
        if (getHorizontalTextAlignment() != null)
            sb.append("HorizontalTextAlignment: ").append(getHorizontalTextAlignment()).append(",");
        if (getVerticalTextAlignment() != null)
            sb.append("VerticalTextAlignment: ").append(getVerticalTextAlignment()).append(",");
        if (getBackgroundColor() != null)
            sb.append("BackgroundColor: ").append(getBackgroundColor()).append(",");
        if (getHeight() != null)
            sb.append("Height: ").append(getHeight()).append(",");
        if (getBorder() != null)
            sb.append("Border: ").append(getBorder());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TableCellStyle == false)
            return false;
        TableCellStyle other = (TableCellStyle) obj;
        if (other.getVisibility() == null ^ this.getVisibility() == null)
            return false;
        if (other.getVisibility() != null && other.getVisibility().equals(this.getVisibility()) == false)
            return false;
        if (other.getFontConfiguration() == null ^ this.getFontConfiguration() == null)
            return false;
        if (other.getFontConfiguration() != null && other.getFontConfiguration().equals(this.getFontConfiguration()) == false)
            return false;
        if (other.getTextWrap() == null ^ this.getTextWrap() == null)
            return false;
        if (other.getTextWrap() != null && other.getTextWrap().equals(this.getTextWrap()) == false)
            return false;
        if (other.getHorizontalTextAlignment() == null ^ this.getHorizontalTextAlignment() == null)
            return false;
        if (other.getHorizontalTextAlignment() != null && other.getHorizontalTextAlignment().equals(this.getHorizontalTextAlignment()) == false)
            return false;
        if (other.getVerticalTextAlignment() == null ^ this.getVerticalTextAlignment() == null)
            return false;
        if (other.getVerticalTextAlignment() != null && other.getVerticalTextAlignment().equals(this.getVerticalTextAlignment()) == false)
            return false;
        if (other.getBackgroundColor() == null ^ this.getBackgroundColor() == null)
            return false;
        if (other.getBackgroundColor() != null && other.getBackgroundColor().equals(this.getBackgroundColor()) == false)
            return false;
        if (other.getHeight() == null ^ this.getHeight() == null)
            return false;
        if (other.getHeight() != null && other.getHeight().equals(this.getHeight()) == false)
            return false;
        if (other.getBorder() == null ^ this.getBorder() == null)
            return false;
        if (other.getBorder() != null && other.getBorder().equals(this.getBorder()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVisibility() == null) ? 0 : getVisibility().hashCode());
        hashCode = prime * hashCode + ((getFontConfiguration() == null) ? 0 : getFontConfiguration().hashCode());
        hashCode = prime * hashCode + ((getTextWrap() == null) ? 0 : getTextWrap().hashCode());
        hashCode = prime * hashCode + ((getHorizontalTextAlignment() == null) ? 0 : getHorizontalTextAlignment().hashCode());
        hashCode = prime * hashCode + ((getVerticalTextAlignment() == null) ? 0 : getVerticalTextAlignment().hashCode());
        hashCode = prime * hashCode + ((getBackgroundColor() == null) ? 0 : getBackgroundColor().hashCode());
        hashCode = prime * hashCode + ((getHeight() == null) ? 0 : getHeight().hashCode());
        hashCode = prime * hashCode + ((getBorder() == null) ? 0 : getBorder().hashCode());
        return hashCode;
    }

    @Override
    public TableCellStyle clone() {
        try {
            return (TableCellStyle) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.TableCellStyleMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
