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
 * A collection of options that configure how each panel displays in a small multiples chart.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/PanelConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PanelConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Configures the title display within each small multiples panel.
     * </p>
     */
    private PanelTitleOptions title;
    /**
     * <p>
     * Determines whether or not each panel displays a border.
     * </p>
     */
    private String borderVisibility;
    /**
     * <p>
     * Sets the line thickness of panel borders.
     * </p>
     */
    private String borderThickness;
    /**
     * <p>
     * Sets the line style of panel borders.
     * </p>
     */
    private String borderStyle;
    /**
     * <p>
     * Sets the line color of panel borders.
     * </p>
     */
    private String borderColor;
    /**
     * <p>
     * Determines whether or not negative space between sibling panels is rendered.
     * </p>
     */
    private String gutterVisibility;
    /**
     * <p>
     * Sets the total amount of negative space to display between sibling panels.
     * </p>
     */
    private String gutterSpacing;
    /**
     * <p>
     * Determines whether or not a background for each small multiples panel is rendered.
     * </p>
     */
    private String backgroundVisibility;
    /**
     * <p>
     * Sets the background color for each panel.
     * </p>
     */
    private String backgroundColor;

    /**
     * <p>
     * Configures the title display within each small multiples panel.
     * </p>
     * 
     * @param title
     *        Configures the title display within each small multiples panel.
     */

    public void setTitle(PanelTitleOptions title) {
        this.title = title;
    }

    /**
     * <p>
     * Configures the title display within each small multiples panel.
     * </p>
     * 
     * @return Configures the title display within each small multiples panel.
     */

    public PanelTitleOptions getTitle() {
        return this.title;
    }

    /**
     * <p>
     * Configures the title display within each small multiples panel.
     * </p>
     * 
     * @param title
     *        Configures the title display within each small multiples panel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PanelConfiguration withTitle(PanelTitleOptions title) {
        setTitle(title);
        return this;
    }

    /**
     * <p>
     * Determines whether or not each panel displays a border.
     * </p>
     * 
     * @param borderVisibility
     *        Determines whether or not each panel displays a border.
     * @see Visibility
     */

    public void setBorderVisibility(String borderVisibility) {
        this.borderVisibility = borderVisibility;
    }

    /**
     * <p>
     * Determines whether or not each panel displays a border.
     * </p>
     * 
     * @return Determines whether or not each panel displays a border.
     * @see Visibility
     */

    public String getBorderVisibility() {
        return this.borderVisibility;
    }

    /**
     * <p>
     * Determines whether or not each panel displays a border.
     * </p>
     * 
     * @param borderVisibility
     *        Determines whether or not each panel displays a border.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Visibility
     */

    public PanelConfiguration withBorderVisibility(String borderVisibility) {
        setBorderVisibility(borderVisibility);
        return this;
    }

    /**
     * <p>
     * Determines whether or not each panel displays a border.
     * </p>
     * 
     * @param borderVisibility
     *        Determines whether or not each panel displays a border.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Visibility
     */

    public PanelConfiguration withBorderVisibility(Visibility borderVisibility) {
        this.borderVisibility = borderVisibility.toString();
        return this;
    }

    /**
     * <p>
     * Sets the line thickness of panel borders.
     * </p>
     * 
     * @param borderThickness
     *        Sets the line thickness of panel borders.
     */

    public void setBorderThickness(String borderThickness) {
        this.borderThickness = borderThickness;
    }

    /**
     * <p>
     * Sets the line thickness of panel borders.
     * </p>
     * 
     * @return Sets the line thickness of panel borders.
     */

    public String getBorderThickness() {
        return this.borderThickness;
    }

    /**
     * <p>
     * Sets the line thickness of panel borders.
     * </p>
     * 
     * @param borderThickness
     *        Sets the line thickness of panel borders.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PanelConfiguration withBorderThickness(String borderThickness) {
        setBorderThickness(borderThickness);
        return this;
    }

    /**
     * <p>
     * Sets the line style of panel borders.
     * </p>
     * 
     * @param borderStyle
     *        Sets the line style of panel borders.
     * @see PanelBorderStyle
     */

    public void setBorderStyle(String borderStyle) {
        this.borderStyle = borderStyle;
    }

    /**
     * <p>
     * Sets the line style of panel borders.
     * </p>
     * 
     * @return Sets the line style of panel borders.
     * @see PanelBorderStyle
     */

    public String getBorderStyle() {
        return this.borderStyle;
    }

    /**
     * <p>
     * Sets the line style of panel borders.
     * </p>
     * 
     * @param borderStyle
     *        Sets the line style of panel borders.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PanelBorderStyle
     */

    public PanelConfiguration withBorderStyle(String borderStyle) {
        setBorderStyle(borderStyle);
        return this;
    }

    /**
     * <p>
     * Sets the line style of panel borders.
     * </p>
     * 
     * @param borderStyle
     *        Sets the line style of panel borders.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PanelBorderStyle
     */

    public PanelConfiguration withBorderStyle(PanelBorderStyle borderStyle) {
        this.borderStyle = borderStyle.toString();
        return this;
    }

    /**
     * <p>
     * Sets the line color of panel borders.
     * </p>
     * 
     * @param borderColor
     *        Sets the line color of panel borders.
     */

    public void setBorderColor(String borderColor) {
        this.borderColor = borderColor;
    }

    /**
     * <p>
     * Sets the line color of panel borders.
     * </p>
     * 
     * @return Sets the line color of panel borders.
     */

    public String getBorderColor() {
        return this.borderColor;
    }

    /**
     * <p>
     * Sets the line color of panel borders.
     * </p>
     * 
     * @param borderColor
     *        Sets the line color of panel borders.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PanelConfiguration withBorderColor(String borderColor) {
        setBorderColor(borderColor);
        return this;
    }

    /**
     * <p>
     * Determines whether or not negative space between sibling panels is rendered.
     * </p>
     * 
     * @param gutterVisibility
     *        Determines whether or not negative space between sibling panels is rendered.
     * @see Visibility
     */

    public void setGutterVisibility(String gutterVisibility) {
        this.gutterVisibility = gutterVisibility;
    }

    /**
     * <p>
     * Determines whether or not negative space between sibling panels is rendered.
     * </p>
     * 
     * @return Determines whether or not negative space between sibling panels is rendered.
     * @see Visibility
     */

    public String getGutterVisibility() {
        return this.gutterVisibility;
    }

    /**
     * <p>
     * Determines whether or not negative space between sibling panels is rendered.
     * </p>
     * 
     * @param gutterVisibility
     *        Determines whether or not negative space between sibling panels is rendered.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Visibility
     */

    public PanelConfiguration withGutterVisibility(String gutterVisibility) {
        setGutterVisibility(gutterVisibility);
        return this;
    }

    /**
     * <p>
     * Determines whether or not negative space between sibling panels is rendered.
     * </p>
     * 
     * @param gutterVisibility
     *        Determines whether or not negative space between sibling panels is rendered.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Visibility
     */

    public PanelConfiguration withGutterVisibility(Visibility gutterVisibility) {
        this.gutterVisibility = gutterVisibility.toString();
        return this;
    }

    /**
     * <p>
     * Sets the total amount of negative space to display between sibling panels.
     * </p>
     * 
     * @param gutterSpacing
     *        Sets the total amount of negative space to display between sibling panels.
     */

    public void setGutterSpacing(String gutterSpacing) {
        this.gutterSpacing = gutterSpacing;
    }

    /**
     * <p>
     * Sets the total amount of negative space to display between sibling panels.
     * </p>
     * 
     * @return Sets the total amount of negative space to display between sibling panels.
     */

    public String getGutterSpacing() {
        return this.gutterSpacing;
    }

    /**
     * <p>
     * Sets the total amount of negative space to display between sibling panels.
     * </p>
     * 
     * @param gutterSpacing
     *        Sets the total amount of negative space to display between sibling panels.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PanelConfiguration withGutterSpacing(String gutterSpacing) {
        setGutterSpacing(gutterSpacing);
        return this;
    }

    /**
     * <p>
     * Determines whether or not a background for each small multiples panel is rendered.
     * </p>
     * 
     * @param backgroundVisibility
     *        Determines whether or not a background for each small multiples panel is rendered.
     * @see Visibility
     */

    public void setBackgroundVisibility(String backgroundVisibility) {
        this.backgroundVisibility = backgroundVisibility;
    }

    /**
     * <p>
     * Determines whether or not a background for each small multiples panel is rendered.
     * </p>
     * 
     * @return Determines whether or not a background for each small multiples panel is rendered.
     * @see Visibility
     */

    public String getBackgroundVisibility() {
        return this.backgroundVisibility;
    }

    /**
     * <p>
     * Determines whether or not a background for each small multiples panel is rendered.
     * </p>
     * 
     * @param backgroundVisibility
     *        Determines whether or not a background for each small multiples panel is rendered.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Visibility
     */

    public PanelConfiguration withBackgroundVisibility(String backgroundVisibility) {
        setBackgroundVisibility(backgroundVisibility);
        return this;
    }

    /**
     * <p>
     * Determines whether or not a background for each small multiples panel is rendered.
     * </p>
     * 
     * @param backgroundVisibility
     *        Determines whether or not a background for each small multiples panel is rendered.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Visibility
     */

    public PanelConfiguration withBackgroundVisibility(Visibility backgroundVisibility) {
        this.backgroundVisibility = backgroundVisibility.toString();
        return this;
    }

    /**
     * <p>
     * Sets the background color for each panel.
     * </p>
     * 
     * @param backgroundColor
     *        Sets the background color for each panel.
     */

    public void setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    /**
     * <p>
     * Sets the background color for each panel.
     * </p>
     * 
     * @return Sets the background color for each panel.
     */

    public String getBackgroundColor() {
        return this.backgroundColor;
    }

    /**
     * <p>
     * Sets the background color for each panel.
     * </p>
     * 
     * @param backgroundColor
     *        Sets the background color for each panel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PanelConfiguration withBackgroundColor(String backgroundColor) {
        setBackgroundColor(backgroundColor);
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
        if (getTitle() != null)
            sb.append("Title: ").append(getTitle()).append(",");
        if (getBorderVisibility() != null)
            sb.append("BorderVisibility: ").append(getBorderVisibility()).append(",");
        if (getBorderThickness() != null)
            sb.append("BorderThickness: ").append(getBorderThickness()).append(",");
        if (getBorderStyle() != null)
            sb.append("BorderStyle: ").append(getBorderStyle()).append(",");
        if (getBorderColor() != null)
            sb.append("BorderColor: ").append(getBorderColor()).append(",");
        if (getGutterVisibility() != null)
            sb.append("GutterVisibility: ").append(getGutterVisibility()).append(",");
        if (getGutterSpacing() != null)
            sb.append("GutterSpacing: ").append(getGutterSpacing()).append(",");
        if (getBackgroundVisibility() != null)
            sb.append("BackgroundVisibility: ").append(getBackgroundVisibility()).append(",");
        if (getBackgroundColor() != null)
            sb.append("BackgroundColor: ").append(getBackgroundColor());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PanelConfiguration == false)
            return false;
        PanelConfiguration other = (PanelConfiguration) obj;
        if (other.getTitle() == null ^ this.getTitle() == null)
            return false;
        if (other.getTitle() != null && other.getTitle().equals(this.getTitle()) == false)
            return false;
        if (other.getBorderVisibility() == null ^ this.getBorderVisibility() == null)
            return false;
        if (other.getBorderVisibility() != null && other.getBorderVisibility().equals(this.getBorderVisibility()) == false)
            return false;
        if (other.getBorderThickness() == null ^ this.getBorderThickness() == null)
            return false;
        if (other.getBorderThickness() != null && other.getBorderThickness().equals(this.getBorderThickness()) == false)
            return false;
        if (other.getBorderStyle() == null ^ this.getBorderStyle() == null)
            return false;
        if (other.getBorderStyle() != null && other.getBorderStyle().equals(this.getBorderStyle()) == false)
            return false;
        if (other.getBorderColor() == null ^ this.getBorderColor() == null)
            return false;
        if (other.getBorderColor() != null && other.getBorderColor().equals(this.getBorderColor()) == false)
            return false;
        if (other.getGutterVisibility() == null ^ this.getGutterVisibility() == null)
            return false;
        if (other.getGutterVisibility() != null && other.getGutterVisibility().equals(this.getGutterVisibility()) == false)
            return false;
        if (other.getGutterSpacing() == null ^ this.getGutterSpacing() == null)
            return false;
        if (other.getGutterSpacing() != null && other.getGutterSpacing().equals(this.getGutterSpacing()) == false)
            return false;
        if (other.getBackgroundVisibility() == null ^ this.getBackgroundVisibility() == null)
            return false;
        if (other.getBackgroundVisibility() != null && other.getBackgroundVisibility().equals(this.getBackgroundVisibility()) == false)
            return false;
        if (other.getBackgroundColor() == null ^ this.getBackgroundColor() == null)
            return false;
        if (other.getBackgroundColor() != null && other.getBackgroundColor().equals(this.getBackgroundColor()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTitle() == null) ? 0 : getTitle().hashCode());
        hashCode = prime * hashCode + ((getBorderVisibility() == null) ? 0 : getBorderVisibility().hashCode());
        hashCode = prime * hashCode + ((getBorderThickness() == null) ? 0 : getBorderThickness().hashCode());
        hashCode = prime * hashCode + ((getBorderStyle() == null) ? 0 : getBorderStyle().hashCode());
        hashCode = prime * hashCode + ((getBorderColor() == null) ? 0 : getBorderColor().hashCode());
        hashCode = prime * hashCode + ((getGutterVisibility() == null) ? 0 : getGutterVisibility().hashCode());
        hashCode = prime * hashCode + ((getGutterSpacing() == null) ? 0 : getGutterSpacing().hashCode());
        hashCode = prime * hashCode + ((getBackgroundVisibility() == null) ? 0 : getBackgroundVisibility().hashCode());
        hashCode = prime * hashCode + ((getBackgroundColor() == null) ? 0 : getBackgroundColor().hashCode());
        return hashCode;
    }

    @Override
    public PanelConfiguration clone() {
        try {
            return (PanelConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.PanelConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
