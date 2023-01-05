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
 * An element within a free-form layout.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/FreeFormLayoutElement" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FreeFormLayoutElement implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A unique identifier for an element within a free-form layout.
     * </p>
     */
    private String elementId;
    /**
     * <p>
     * The type of element.
     * </p>
     */
    private String elementType;
    /**
     * <p>
     * The x-axis coordinate of the element.
     * </p>
     */
    private String xAxisLocation;
    /**
     * <p>
     * The y-axis coordinate of the element.
     * </p>
     */
    private String yAxisLocation;
    /**
     * <p>
     * The width of an element within a free-form layout.
     * </p>
     */
    private String width;
    /**
     * <p>
     * The height of an element within a free-form layout.
     * </p>
     */
    private String height;
    /**
     * <p>
     * The visibility of an element within a free-form layout.
     * </p>
     */
    private String visibility;
    /**
     * <p>
     * The rendering rules that determine when an element should be displayed within a free-form layout.
     * </p>
     */
    private java.util.List<SheetElementRenderingRule> renderingRules;
    /**
     * <p>
     * The border style configuration of a free-form layout element.
     * </p>
     */
    private FreeFormLayoutElementBorderStyle borderStyle;
    /**
     * <p>
     * The border style configuration of a free-form layout element. This border style is used when the element is
     * selected.
     * </p>
     */
    private FreeFormLayoutElementBorderStyle selectedBorderStyle;
    /**
     * <p>
     * The background style configuration of a free-form layout element.
     * </p>
     */
    private FreeFormLayoutElementBackgroundStyle backgroundStyle;
    /**
     * <p>
     * The loading animation configuration of a free-form layout element.
     * </p>
     */
    private LoadingAnimation loadingAnimation;

    /**
     * <p>
     * A unique identifier for an element within a free-form layout.
     * </p>
     * 
     * @param elementId
     *        A unique identifier for an element within a free-form layout.
     */

    public void setElementId(String elementId) {
        this.elementId = elementId;
    }

    /**
     * <p>
     * A unique identifier for an element within a free-form layout.
     * </p>
     * 
     * @return A unique identifier for an element within a free-form layout.
     */

    public String getElementId() {
        return this.elementId;
    }

    /**
     * <p>
     * A unique identifier for an element within a free-form layout.
     * </p>
     * 
     * @param elementId
     *        A unique identifier for an element within a free-form layout.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FreeFormLayoutElement withElementId(String elementId) {
        setElementId(elementId);
        return this;
    }

    /**
     * <p>
     * The type of element.
     * </p>
     * 
     * @param elementType
     *        The type of element.
     * @see LayoutElementType
     */

    public void setElementType(String elementType) {
        this.elementType = elementType;
    }

    /**
     * <p>
     * The type of element.
     * </p>
     * 
     * @return The type of element.
     * @see LayoutElementType
     */

    public String getElementType() {
        return this.elementType;
    }

    /**
     * <p>
     * The type of element.
     * </p>
     * 
     * @param elementType
     *        The type of element.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LayoutElementType
     */

    public FreeFormLayoutElement withElementType(String elementType) {
        setElementType(elementType);
        return this;
    }

    /**
     * <p>
     * The type of element.
     * </p>
     * 
     * @param elementType
     *        The type of element.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LayoutElementType
     */

    public FreeFormLayoutElement withElementType(LayoutElementType elementType) {
        this.elementType = elementType.toString();
        return this;
    }

    /**
     * <p>
     * The x-axis coordinate of the element.
     * </p>
     * 
     * @param xAxisLocation
     *        The x-axis coordinate of the element.
     */

    public void setXAxisLocation(String xAxisLocation) {
        this.xAxisLocation = xAxisLocation;
    }

    /**
     * <p>
     * The x-axis coordinate of the element.
     * </p>
     * 
     * @return The x-axis coordinate of the element.
     */

    public String getXAxisLocation() {
        return this.xAxisLocation;
    }

    /**
     * <p>
     * The x-axis coordinate of the element.
     * </p>
     * 
     * @param xAxisLocation
     *        The x-axis coordinate of the element.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FreeFormLayoutElement withXAxisLocation(String xAxisLocation) {
        setXAxisLocation(xAxisLocation);
        return this;
    }

    /**
     * <p>
     * The y-axis coordinate of the element.
     * </p>
     * 
     * @param yAxisLocation
     *        The y-axis coordinate of the element.
     */

    public void setYAxisLocation(String yAxisLocation) {
        this.yAxisLocation = yAxisLocation;
    }

    /**
     * <p>
     * The y-axis coordinate of the element.
     * </p>
     * 
     * @return The y-axis coordinate of the element.
     */

    public String getYAxisLocation() {
        return this.yAxisLocation;
    }

    /**
     * <p>
     * The y-axis coordinate of the element.
     * </p>
     * 
     * @param yAxisLocation
     *        The y-axis coordinate of the element.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FreeFormLayoutElement withYAxisLocation(String yAxisLocation) {
        setYAxisLocation(yAxisLocation);
        return this;
    }

    /**
     * <p>
     * The width of an element within a free-form layout.
     * </p>
     * 
     * @param width
     *        The width of an element within a free-form layout.
     */

    public void setWidth(String width) {
        this.width = width;
    }

    /**
     * <p>
     * The width of an element within a free-form layout.
     * </p>
     * 
     * @return The width of an element within a free-form layout.
     */

    public String getWidth() {
        return this.width;
    }

    /**
     * <p>
     * The width of an element within a free-form layout.
     * </p>
     * 
     * @param width
     *        The width of an element within a free-form layout.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FreeFormLayoutElement withWidth(String width) {
        setWidth(width);
        return this;
    }

    /**
     * <p>
     * The height of an element within a free-form layout.
     * </p>
     * 
     * @param height
     *        The height of an element within a free-form layout.
     */

    public void setHeight(String height) {
        this.height = height;
    }

    /**
     * <p>
     * The height of an element within a free-form layout.
     * </p>
     * 
     * @return The height of an element within a free-form layout.
     */

    public String getHeight() {
        return this.height;
    }

    /**
     * <p>
     * The height of an element within a free-form layout.
     * </p>
     * 
     * @param height
     *        The height of an element within a free-form layout.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FreeFormLayoutElement withHeight(String height) {
        setHeight(height);
        return this;
    }

    /**
     * <p>
     * The visibility of an element within a free-form layout.
     * </p>
     * 
     * @param visibility
     *        The visibility of an element within a free-form layout.
     * @see Visibility
     */

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    /**
     * <p>
     * The visibility of an element within a free-form layout.
     * </p>
     * 
     * @return The visibility of an element within a free-form layout.
     * @see Visibility
     */

    public String getVisibility() {
        return this.visibility;
    }

    /**
     * <p>
     * The visibility of an element within a free-form layout.
     * </p>
     * 
     * @param visibility
     *        The visibility of an element within a free-form layout.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Visibility
     */

    public FreeFormLayoutElement withVisibility(String visibility) {
        setVisibility(visibility);
        return this;
    }

    /**
     * <p>
     * The visibility of an element within a free-form layout.
     * </p>
     * 
     * @param visibility
     *        The visibility of an element within a free-form layout.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Visibility
     */

    public FreeFormLayoutElement withVisibility(Visibility visibility) {
        this.visibility = visibility.toString();
        return this;
    }

    /**
     * <p>
     * The rendering rules that determine when an element should be displayed within a free-form layout.
     * </p>
     * 
     * @return The rendering rules that determine when an element should be displayed within a free-form layout.
     */

    public java.util.List<SheetElementRenderingRule> getRenderingRules() {
        return renderingRules;
    }

    /**
     * <p>
     * The rendering rules that determine when an element should be displayed within a free-form layout.
     * </p>
     * 
     * @param renderingRules
     *        The rendering rules that determine when an element should be displayed within a free-form layout.
     */

    public void setRenderingRules(java.util.Collection<SheetElementRenderingRule> renderingRules) {
        if (renderingRules == null) {
            this.renderingRules = null;
            return;
        }

        this.renderingRules = new java.util.ArrayList<SheetElementRenderingRule>(renderingRules);
    }

    /**
     * <p>
     * The rendering rules that determine when an element should be displayed within a free-form layout.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRenderingRules(java.util.Collection)} or {@link #withRenderingRules(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param renderingRules
     *        The rendering rules that determine when an element should be displayed within a free-form layout.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FreeFormLayoutElement withRenderingRules(SheetElementRenderingRule... renderingRules) {
        if (this.renderingRules == null) {
            setRenderingRules(new java.util.ArrayList<SheetElementRenderingRule>(renderingRules.length));
        }
        for (SheetElementRenderingRule ele : renderingRules) {
            this.renderingRules.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The rendering rules that determine when an element should be displayed within a free-form layout.
     * </p>
     * 
     * @param renderingRules
     *        The rendering rules that determine when an element should be displayed within a free-form layout.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FreeFormLayoutElement withRenderingRules(java.util.Collection<SheetElementRenderingRule> renderingRules) {
        setRenderingRules(renderingRules);
        return this;
    }

    /**
     * <p>
     * The border style configuration of a free-form layout element.
     * </p>
     * 
     * @param borderStyle
     *        The border style configuration of a free-form layout element.
     */

    public void setBorderStyle(FreeFormLayoutElementBorderStyle borderStyle) {
        this.borderStyle = borderStyle;
    }

    /**
     * <p>
     * The border style configuration of a free-form layout element.
     * </p>
     * 
     * @return The border style configuration of a free-form layout element.
     */

    public FreeFormLayoutElementBorderStyle getBorderStyle() {
        return this.borderStyle;
    }

    /**
     * <p>
     * The border style configuration of a free-form layout element.
     * </p>
     * 
     * @param borderStyle
     *        The border style configuration of a free-form layout element.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FreeFormLayoutElement withBorderStyle(FreeFormLayoutElementBorderStyle borderStyle) {
        setBorderStyle(borderStyle);
        return this;
    }

    /**
     * <p>
     * The border style configuration of a free-form layout element. This border style is used when the element is
     * selected.
     * </p>
     * 
     * @param selectedBorderStyle
     *        The border style configuration of a free-form layout element. This border style is used when the element
     *        is selected.
     */

    public void setSelectedBorderStyle(FreeFormLayoutElementBorderStyle selectedBorderStyle) {
        this.selectedBorderStyle = selectedBorderStyle;
    }

    /**
     * <p>
     * The border style configuration of a free-form layout element. This border style is used when the element is
     * selected.
     * </p>
     * 
     * @return The border style configuration of a free-form layout element. This border style is used when the element
     *         is selected.
     */

    public FreeFormLayoutElementBorderStyle getSelectedBorderStyle() {
        return this.selectedBorderStyle;
    }

    /**
     * <p>
     * The border style configuration of a free-form layout element. This border style is used when the element is
     * selected.
     * </p>
     * 
     * @param selectedBorderStyle
     *        The border style configuration of a free-form layout element. This border style is used when the element
     *        is selected.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FreeFormLayoutElement withSelectedBorderStyle(FreeFormLayoutElementBorderStyle selectedBorderStyle) {
        setSelectedBorderStyle(selectedBorderStyle);
        return this;
    }

    /**
     * <p>
     * The background style configuration of a free-form layout element.
     * </p>
     * 
     * @param backgroundStyle
     *        The background style configuration of a free-form layout element.
     */

    public void setBackgroundStyle(FreeFormLayoutElementBackgroundStyle backgroundStyle) {
        this.backgroundStyle = backgroundStyle;
    }

    /**
     * <p>
     * The background style configuration of a free-form layout element.
     * </p>
     * 
     * @return The background style configuration of a free-form layout element.
     */

    public FreeFormLayoutElementBackgroundStyle getBackgroundStyle() {
        return this.backgroundStyle;
    }

    /**
     * <p>
     * The background style configuration of a free-form layout element.
     * </p>
     * 
     * @param backgroundStyle
     *        The background style configuration of a free-form layout element.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FreeFormLayoutElement withBackgroundStyle(FreeFormLayoutElementBackgroundStyle backgroundStyle) {
        setBackgroundStyle(backgroundStyle);
        return this;
    }

    /**
     * <p>
     * The loading animation configuration of a free-form layout element.
     * </p>
     * 
     * @param loadingAnimation
     *        The loading animation configuration of a free-form layout element.
     */

    public void setLoadingAnimation(LoadingAnimation loadingAnimation) {
        this.loadingAnimation = loadingAnimation;
    }

    /**
     * <p>
     * The loading animation configuration of a free-form layout element.
     * </p>
     * 
     * @return The loading animation configuration of a free-form layout element.
     */

    public LoadingAnimation getLoadingAnimation() {
        return this.loadingAnimation;
    }

    /**
     * <p>
     * The loading animation configuration of a free-form layout element.
     * </p>
     * 
     * @param loadingAnimation
     *        The loading animation configuration of a free-form layout element.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FreeFormLayoutElement withLoadingAnimation(LoadingAnimation loadingAnimation) {
        setLoadingAnimation(loadingAnimation);
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
        if (getElementId() != null)
            sb.append("ElementId: ").append(getElementId()).append(",");
        if (getElementType() != null)
            sb.append("ElementType: ").append(getElementType()).append(",");
        if (getXAxisLocation() != null)
            sb.append("XAxisLocation: ").append(getXAxisLocation()).append(",");
        if (getYAxisLocation() != null)
            sb.append("YAxisLocation: ").append(getYAxisLocation()).append(",");
        if (getWidth() != null)
            sb.append("Width: ").append(getWidth()).append(",");
        if (getHeight() != null)
            sb.append("Height: ").append(getHeight()).append(",");
        if (getVisibility() != null)
            sb.append("Visibility: ").append(getVisibility()).append(",");
        if (getRenderingRules() != null)
            sb.append("RenderingRules: ").append(getRenderingRules()).append(",");
        if (getBorderStyle() != null)
            sb.append("BorderStyle: ").append(getBorderStyle()).append(",");
        if (getSelectedBorderStyle() != null)
            sb.append("SelectedBorderStyle: ").append(getSelectedBorderStyle()).append(",");
        if (getBackgroundStyle() != null)
            sb.append("BackgroundStyle: ").append(getBackgroundStyle()).append(",");
        if (getLoadingAnimation() != null)
            sb.append("LoadingAnimation: ").append(getLoadingAnimation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FreeFormLayoutElement == false)
            return false;
        FreeFormLayoutElement other = (FreeFormLayoutElement) obj;
        if (other.getElementId() == null ^ this.getElementId() == null)
            return false;
        if (other.getElementId() != null && other.getElementId().equals(this.getElementId()) == false)
            return false;
        if (other.getElementType() == null ^ this.getElementType() == null)
            return false;
        if (other.getElementType() != null && other.getElementType().equals(this.getElementType()) == false)
            return false;
        if (other.getXAxisLocation() == null ^ this.getXAxisLocation() == null)
            return false;
        if (other.getXAxisLocation() != null && other.getXAxisLocation().equals(this.getXAxisLocation()) == false)
            return false;
        if (other.getYAxisLocation() == null ^ this.getYAxisLocation() == null)
            return false;
        if (other.getYAxisLocation() != null && other.getYAxisLocation().equals(this.getYAxisLocation()) == false)
            return false;
        if (other.getWidth() == null ^ this.getWidth() == null)
            return false;
        if (other.getWidth() != null && other.getWidth().equals(this.getWidth()) == false)
            return false;
        if (other.getHeight() == null ^ this.getHeight() == null)
            return false;
        if (other.getHeight() != null && other.getHeight().equals(this.getHeight()) == false)
            return false;
        if (other.getVisibility() == null ^ this.getVisibility() == null)
            return false;
        if (other.getVisibility() != null && other.getVisibility().equals(this.getVisibility()) == false)
            return false;
        if (other.getRenderingRules() == null ^ this.getRenderingRules() == null)
            return false;
        if (other.getRenderingRules() != null && other.getRenderingRules().equals(this.getRenderingRules()) == false)
            return false;
        if (other.getBorderStyle() == null ^ this.getBorderStyle() == null)
            return false;
        if (other.getBorderStyle() != null && other.getBorderStyle().equals(this.getBorderStyle()) == false)
            return false;
        if (other.getSelectedBorderStyle() == null ^ this.getSelectedBorderStyle() == null)
            return false;
        if (other.getSelectedBorderStyle() != null && other.getSelectedBorderStyle().equals(this.getSelectedBorderStyle()) == false)
            return false;
        if (other.getBackgroundStyle() == null ^ this.getBackgroundStyle() == null)
            return false;
        if (other.getBackgroundStyle() != null && other.getBackgroundStyle().equals(this.getBackgroundStyle()) == false)
            return false;
        if (other.getLoadingAnimation() == null ^ this.getLoadingAnimation() == null)
            return false;
        if (other.getLoadingAnimation() != null && other.getLoadingAnimation().equals(this.getLoadingAnimation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getElementId() == null) ? 0 : getElementId().hashCode());
        hashCode = prime * hashCode + ((getElementType() == null) ? 0 : getElementType().hashCode());
        hashCode = prime * hashCode + ((getXAxisLocation() == null) ? 0 : getXAxisLocation().hashCode());
        hashCode = prime * hashCode + ((getYAxisLocation() == null) ? 0 : getYAxisLocation().hashCode());
        hashCode = prime * hashCode + ((getWidth() == null) ? 0 : getWidth().hashCode());
        hashCode = prime * hashCode + ((getHeight() == null) ? 0 : getHeight().hashCode());
        hashCode = prime * hashCode + ((getVisibility() == null) ? 0 : getVisibility().hashCode());
        hashCode = prime * hashCode + ((getRenderingRules() == null) ? 0 : getRenderingRules().hashCode());
        hashCode = prime * hashCode + ((getBorderStyle() == null) ? 0 : getBorderStyle().hashCode());
        hashCode = prime * hashCode + ((getSelectedBorderStyle() == null) ? 0 : getSelectedBorderStyle().hashCode());
        hashCode = prime * hashCode + ((getBackgroundStyle() == null) ? 0 : getBackgroundStyle().hashCode());
        hashCode = prime * hashCode + ((getLoadingAnimation() == null) ? 0 : getLoadingAnimation().hashCode());
        return hashCode;
    }

    @Override
    public FreeFormLayoutElement clone() {
        try {
            return (FreeFormLayoutElement) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.FreeFormLayoutElementMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
