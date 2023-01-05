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
 * The label configuration of a reference line.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ReferenceLineLabelConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReferenceLineLabelConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The value label configuration of the label in a reference line.
     * </p>
     */
    private ReferenceLineValueLabelConfiguration valueLabelConfiguration;
    /**
     * <p>
     * The custom label configuration of the label in a reference line.
     * </p>
     */
    private ReferenceLineCustomLabelConfiguration customLabelConfiguration;
    /**
     * <p>
     * The font configuration of the label in a reference line.
     * </p>
     */
    private FontConfiguration fontConfiguration;
    /**
     * <p>
     * The font color configuration of the label in a reference line.
     * </p>
     */
    private String fontColor;
    /**
     * <p>
     * The horizontal position configuration of the label in a reference line. Choose one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>LEFT</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CENTER</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RIGHT</code>
     * </p>
     * </li>
     * </ul>
     */
    private String horizontalPosition;
    /**
     * <p>
     * The vertical position configuration of the label in a reference line. Choose one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ABOVE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BELOW</code>
     * </p>
     * </li>
     * </ul>
     */
    private String verticalPosition;

    /**
     * <p>
     * The value label configuration of the label in a reference line.
     * </p>
     * 
     * @param valueLabelConfiguration
     *        The value label configuration of the label in a reference line.
     */

    public void setValueLabelConfiguration(ReferenceLineValueLabelConfiguration valueLabelConfiguration) {
        this.valueLabelConfiguration = valueLabelConfiguration;
    }

    /**
     * <p>
     * The value label configuration of the label in a reference line.
     * </p>
     * 
     * @return The value label configuration of the label in a reference line.
     */

    public ReferenceLineValueLabelConfiguration getValueLabelConfiguration() {
        return this.valueLabelConfiguration;
    }

    /**
     * <p>
     * The value label configuration of the label in a reference line.
     * </p>
     * 
     * @param valueLabelConfiguration
     *        The value label configuration of the label in a reference line.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReferenceLineLabelConfiguration withValueLabelConfiguration(ReferenceLineValueLabelConfiguration valueLabelConfiguration) {
        setValueLabelConfiguration(valueLabelConfiguration);
        return this;
    }

    /**
     * <p>
     * The custom label configuration of the label in a reference line.
     * </p>
     * 
     * @param customLabelConfiguration
     *        The custom label configuration of the label in a reference line.
     */

    public void setCustomLabelConfiguration(ReferenceLineCustomLabelConfiguration customLabelConfiguration) {
        this.customLabelConfiguration = customLabelConfiguration;
    }

    /**
     * <p>
     * The custom label configuration of the label in a reference line.
     * </p>
     * 
     * @return The custom label configuration of the label in a reference line.
     */

    public ReferenceLineCustomLabelConfiguration getCustomLabelConfiguration() {
        return this.customLabelConfiguration;
    }

    /**
     * <p>
     * The custom label configuration of the label in a reference line.
     * </p>
     * 
     * @param customLabelConfiguration
     *        The custom label configuration of the label in a reference line.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReferenceLineLabelConfiguration withCustomLabelConfiguration(ReferenceLineCustomLabelConfiguration customLabelConfiguration) {
        setCustomLabelConfiguration(customLabelConfiguration);
        return this;
    }

    /**
     * <p>
     * The font configuration of the label in a reference line.
     * </p>
     * 
     * @param fontConfiguration
     *        The font configuration of the label in a reference line.
     */

    public void setFontConfiguration(FontConfiguration fontConfiguration) {
        this.fontConfiguration = fontConfiguration;
    }

    /**
     * <p>
     * The font configuration of the label in a reference line.
     * </p>
     * 
     * @return The font configuration of the label in a reference line.
     */

    public FontConfiguration getFontConfiguration() {
        return this.fontConfiguration;
    }

    /**
     * <p>
     * The font configuration of the label in a reference line.
     * </p>
     * 
     * @param fontConfiguration
     *        The font configuration of the label in a reference line.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReferenceLineLabelConfiguration withFontConfiguration(FontConfiguration fontConfiguration) {
        setFontConfiguration(fontConfiguration);
        return this;
    }

    /**
     * <p>
     * The font color configuration of the label in a reference line.
     * </p>
     * 
     * @param fontColor
     *        The font color configuration of the label in a reference line.
     */

    public void setFontColor(String fontColor) {
        this.fontColor = fontColor;
    }

    /**
     * <p>
     * The font color configuration of the label in a reference line.
     * </p>
     * 
     * @return The font color configuration of the label in a reference line.
     */

    public String getFontColor() {
        return this.fontColor;
    }

    /**
     * <p>
     * The font color configuration of the label in a reference line.
     * </p>
     * 
     * @param fontColor
     *        The font color configuration of the label in a reference line.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReferenceLineLabelConfiguration withFontColor(String fontColor) {
        setFontColor(fontColor);
        return this;
    }

    /**
     * <p>
     * The horizontal position configuration of the label in a reference line. Choose one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>LEFT</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CENTER</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RIGHT</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param horizontalPosition
     *        The horizontal position configuration of the label in a reference line. Choose one of the following
     *        options:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>LEFT</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CENTER</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RIGHT</code>
     *        </p>
     *        </li>
     * @see ReferenceLineLabelHorizontalPosition
     */

    public void setHorizontalPosition(String horizontalPosition) {
        this.horizontalPosition = horizontalPosition;
    }

    /**
     * <p>
     * The horizontal position configuration of the label in a reference line. Choose one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>LEFT</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CENTER</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RIGHT</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The horizontal position configuration of the label in a reference line. Choose one of the following
     *         options:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>LEFT</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CENTER</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>RIGHT</code>
     *         </p>
     *         </li>
     * @see ReferenceLineLabelHorizontalPosition
     */

    public String getHorizontalPosition() {
        return this.horizontalPosition;
    }

    /**
     * <p>
     * The horizontal position configuration of the label in a reference line. Choose one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>LEFT</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CENTER</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RIGHT</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param horizontalPosition
     *        The horizontal position configuration of the label in a reference line. Choose one of the following
     *        options:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>LEFT</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CENTER</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RIGHT</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReferenceLineLabelHorizontalPosition
     */

    public ReferenceLineLabelConfiguration withHorizontalPosition(String horizontalPosition) {
        setHorizontalPosition(horizontalPosition);
        return this;
    }

    /**
     * <p>
     * The horizontal position configuration of the label in a reference line. Choose one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>LEFT</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CENTER</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RIGHT</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param horizontalPosition
     *        The horizontal position configuration of the label in a reference line. Choose one of the following
     *        options:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>LEFT</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CENTER</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RIGHT</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReferenceLineLabelHorizontalPosition
     */

    public ReferenceLineLabelConfiguration withHorizontalPosition(ReferenceLineLabelHorizontalPosition horizontalPosition) {
        this.horizontalPosition = horizontalPosition.toString();
        return this;
    }

    /**
     * <p>
     * The vertical position configuration of the label in a reference line. Choose one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ABOVE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BELOW</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param verticalPosition
     *        The vertical position configuration of the label in a reference line. Choose one of the following
     *        options:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ABOVE</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>BELOW</code>
     *        </p>
     *        </li>
     * @see ReferenceLineLabelVerticalPosition
     */

    public void setVerticalPosition(String verticalPosition) {
        this.verticalPosition = verticalPosition;
    }

    /**
     * <p>
     * The vertical position configuration of the label in a reference line. Choose one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ABOVE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BELOW</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The vertical position configuration of the label in a reference line. Choose one of the following
     *         options:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ABOVE</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>BELOW</code>
     *         </p>
     *         </li>
     * @see ReferenceLineLabelVerticalPosition
     */

    public String getVerticalPosition() {
        return this.verticalPosition;
    }

    /**
     * <p>
     * The vertical position configuration of the label in a reference line. Choose one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ABOVE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BELOW</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param verticalPosition
     *        The vertical position configuration of the label in a reference line. Choose one of the following
     *        options:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ABOVE</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>BELOW</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReferenceLineLabelVerticalPosition
     */

    public ReferenceLineLabelConfiguration withVerticalPosition(String verticalPosition) {
        setVerticalPosition(verticalPosition);
        return this;
    }

    /**
     * <p>
     * The vertical position configuration of the label in a reference line. Choose one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ABOVE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BELOW</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param verticalPosition
     *        The vertical position configuration of the label in a reference line. Choose one of the following
     *        options:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ABOVE</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>BELOW</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReferenceLineLabelVerticalPosition
     */

    public ReferenceLineLabelConfiguration withVerticalPosition(ReferenceLineLabelVerticalPosition verticalPosition) {
        this.verticalPosition = verticalPosition.toString();
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
        if (getValueLabelConfiguration() != null)
            sb.append("ValueLabelConfiguration: ").append(getValueLabelConfiguration()).append(",");
        if (getCustomLabelConfiguration() != null)
            sb.append("CustomLabelConfiguration: ").append(getCustomLabelConfiguration()).append(",");
        if (getFontConfiguration() != null)
            sb.append("FontConfiguration: ").append(getFontConfiguration()).append(",");
        if (getFontColor() != null)
            sb.append("FontColor: ").append(getFontColor()).append(",");
        if (getHorizontalPosition() != null)
            sb.append("HorizontalPosition: ").append(getHorizontalPosition()).append(",");
        if (getVerticalPosition() != null)
            sb.append("VerticalPosition: ").append(getVerticalPosition());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReferenceLineLabelConfiguration == false)
            return false;
        ReferenceLineLabelConfiguration other = (ReferenceLineLabelConfiguration) obj;
        if (other.getValueLabelConfiguration() == null ^ this.getValueLabelConfiguration() == null)
            return false;
        if (other.getValueLabelConfiguration() != null && other.getValueLabelConfiguration().equals(this.getValueLabelConfiguration()) == false)
            return false;
        if (other.getCustomLabelConfiguration() == null ^ this.getCustomLabelConfiguration() == null)
            return false;
        if (other.getCustomLabelConfiguration() != null && other.getCustomLabelConfiguration().equals(this.getCustomLabelConfiguration()) == false)
            return false;
        if (other.getFontConfiguration() == null ^ this.getFontConfiguration() == null)
            return false;
        if (other.getFontConfiguration() != null && other.getFontConfiguration().equals(this.getFontConfiguration()) == false)
            return false;
        if (other.getFontColor() == null ^ this.getFontColor() == null)
            return false;
        if (other.getFontColor() != null && other.getFontColor().equals(this.getFontColor()) == false)
            return false;
        if (other.getHorizontalPosition() == null ^ this.getHorizontalPosition() == null)
            return false;
        if (other.getHorizontalPosition() != null && other.getHorizontalPosition().equals(this.getHorizontalPosition()) == false)
            return false;
        if (other.getVerticalPosition() == null ^ this.getVerticalPosition() == null)
            return false;
        if (other.getVerticalPosition() != null && other.getVerticalPosition().equals(this.getVerticalPosition()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getValueLabelConfiguration() == null) ? 0 : getValueLabelConfiguration().hashCode());
        hashCode = prime * hashCode + ((getCustomLabelConfiguration() == null) ? 0 : getCustomLabelConfiguration().hashCode());
        hashCode = prime * hashCode + ((getFontConfiguration() == null) ? 0 : getFontConfiguration().hashCode());
        hashCode = prime * hashCode + ((getFontColor() == null) ? 0 : getFontColor().hashCode());
        hashCode = prime * hashCode + ((getHorizontalPosition() == null) ? 0 : getHorizontalPosition().hashCode());
        hashCode = prime * hashCode + ((getVerticalPosition() == null) ? 0 : getVerticalPosition().hashCode());
        return hashCode;
    }

    @Override
    public ReferenceLineLabelConfiguration clone() {
        try {
            return (ReferenceLineLabelConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.ReferenceLineLabelConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
