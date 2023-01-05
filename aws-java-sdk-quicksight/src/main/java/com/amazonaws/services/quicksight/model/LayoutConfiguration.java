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
 * The configuration that determines what the type of layout will be used on a sheet.
 * </p>
 * <p>
 * This is a union type structure. For this structure to be valid, only one of the attributes can be defined.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/LayoutConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LayoutConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A type of layout that can be used on a sheet. In a grid layout, visuals snap to a grid with standard spacing and
     * alignment. Dashboards are displayed as designed, with options to fit to screen or view at actual size. A grid
     * layout can be configured to behave in one of two ways when the viewport is resized: <code>FIXED</code> or
     * <code>RESPONSIVE</code>.
     * </p>
     */
    private GridLayoutConfiguration gridLayout;
    /**
     * <p>
     * A free-form is optimized for a fixed width and has more control over the exact placement of layout elements.
     * </p>
     */
    private FreeFormLayoutConfiguration freeFormLayout;
    /**
     * <p>
     * A section based layout organizes visuals into multiple sections and has customized header, footer and page break.
     * </p>
     */
    private SectionBasedLayoutConfiguration sectionBasedLayout;

    /**
     * <p>
     * A type of layout that can be used on a sheet. In a grid layout, visuals snap to a grid with standard spacing and
     * alignment. Dashboards are displayed as designed, with options to fit to screen or view at actual size. A grid
     * layout can be configured to behave in one of two ways when the viewport is resized: <code>FIXED</code> or
     * <code>RESPONSIVE</code>.
     * </p>
     * 
     * @param gridLayout
     *        A type of layout that can be used on a sheet. In a grid layout, visuals snap to a grid with standard
     *        spacing and alignment. Dashboards are displayed as designed, with options to fit to screen or view at
     *        actual size. A grid layout can be configured to behave in one of two ways when the viewport is resized:
     *        <code>FIXED</code> or <code>RESPONSIVE</code>.
     */

    public void setGridLayout(GridLayoutConfiguration gridLayout) {
        this.gridLayout = gridLayout;
    }

    /**
     * <p>
     * A type of layout that can be used on a sheet. In a grid layout, visuals snap to a grid with standard spacing and
     * alignment. Dashboards are displayed as designed, with options to fit to screen or view at actual size. A grid
     * layout can be configured to behave in one of two ways when the viewport is resized: <code>FIXED</code> or
     * <code>RESPONSIVE</code>.
     * </p>
     * 
     * @return A type of layout that can be used on a sheet. In a grid layout, visuals snap to a grid with standard
     *         spacing and alignment. Dashboards are displayed as designed, with options to fit to screen or view at
     *         actual size. A grid layout can be configured to behave in one of two ways when the viewport is resized:
     *         <code>FIXED</code> or <code>RESPONSIVE</code>.
     */

    public GridLayoutConfiguration getGridLayout() {
        return this.gridLayout;
    }

    /**
     * <p>
     * A type of layout that can be used on a sheet. In a grid layout, visuals snap to a grid with standard spacing and
     * alignment. Dashboards are displayed as designed, with options to fit to screen or view at actual size. A grid
     * layout can be configured to behave in one of two ways when the viewport is resized: <code>FIXED</code> or
     * <code>RESPONSIVE</code>.
     * </p>
     * 
     * @param gridLayout
     *        A type of layout that can be used on a sheet. In a grid layout, visuals snap to a grid with standard
     *        spacing and alignment. Dashboards are displayed as designed, with options to fit to screen or view at
     *        actual size. A grid layout can be configured to behave in one of two ways when the viewport is resized:
     *        <code>FIXED</code> or <code>RESPONSIVE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LayoutConfiguration withGridLayout(GridLayoutConfiguration gridLayout) {
        setGridLayout(gridLayout);
        return this;
    }

    /**
     * <p>
     * A free-form is optimized for a fixed width and has more control over the exact placement of layout elements.
     * </p>
     * 
     * @param freeFormLayout
     *        A free-form is optimized for a fixed width and has more control over the exact placement of layout
     *        elements.
     */

    public void setFreeFormLayout(FreeFormLayoutConfiguration freeFormLayout) {
        this.freeFormLayout = freeFormLayout;
    }

    /**
     * <p>
     * A free-form is optimized for a fixed width and has more control over the exact placement of layout elements.
     * </p>
     * 
     * @return A free-form is optimized for a fixed width and has more control over the exact placement of layout
     *         elements.
     */

    public FreeFormLayoutConfiguration getFreeFormLayout() {
        return this.freeFormLayout;
    }

    /**
     * <p>
     * A free-form is optimized for a fixed width and has more control over the exact placement of layout elements.
     * </p>
     * 
     * @param freeFormLayout
     *        A free-form is optimized for a fixed width and has more control over the exact placement of layout
     *        elements.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LayoutConfiguration withFreeFormLayout(FreeFormLayoutConfiguration freeFormLayout) {
        setFreeFormLayout(freeFormLayout);
        return this;
    }

    /**
     * <p>
     * A section based layout organizes visuals into multiple sections and has customized header, footer and page break.
     * </p>
     * 
     * @param sectionBasedLayout
     *        A section based layout organizes visuals into multiple sections and has customized header, footer and page
     *        break.
     */

    public void setSectionBasedLayout(SectionBasedLayoutConfiguration sectionBasedLayout) {
        this.sectionBasedLayout = sectionBasedLayout;
    }

    /**
     * <p>
     * A section based layout organizes visuals into multiple sections and has customized header, footer and page break.
     * </p>
     * 
     * @return A section based layout organizes visuals into multiple sections and has customized header, footer and
     *         page break.
     */

    public SectionBasedLayoutConfiguration getSectionBasedLayout() {
        return this.sectionBasedLayout;
    }

    /**
     * <p>
     * A section based layout organizes visuals into multiple sections and has customized header, footer and page break.
     * </p>
     * 
     * @param sectionBasedLayout
     *        A section based layout organizes visuals into multiple sections and has customized header, footer and page
     *        break.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LayoutConfiguration withSectionBasedLayout(SectionBasedLayoutConfiguration sectionBasedLayout) {
        setSectionBasedLayout(sectionBasedLayout);
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
        if (getGridLayout() != null)
            sb.append("GridLayout: ").append(getGridLayout()).append(",");
        if (getFreeFormLayout() != null)
            sb.append("FreeFormLayout: ").append(getFreeFormLayout()).append(",");
        if (getSectionBasedLayout() != null)
            sb.append("SectionBasedLayout: ").append(getSectionBasedLayout());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LayoutConfiguration == false)
            return false;
        LayoutConfiguration other = (LayoutConfiguration) obj;
        if (other.getGridLayout() == null ^ this.getGridLayout() == null)
            return false;
        if (other.getGridLayout() != null && other.getGridLayout().equals(this.getGridLayout()) == false)
            return false;
        if (other.getFreeFormLayout() == null ^ this.getFreeFormLayout() == null)
            return false;
        if (other.getFreeFormLayout() != null && other.getFreeFormLayout().equals(this.getFreeFormLayout()) == false)
            return false;
        if (other.getSectionBasedLayout() == null ^ this.getSectionBasedLayout() == null)
            return false;
        if (other.getSectionBasedLayout() != null && other.getSectionBasedLayout().equals(this.getSectionBasedLayout()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGridLayout() == null) ? 0 : getGridLayout().hashCode());
        hashCode = prime * hashCode + ((getFreeFormLayout() == null) ? 0 : getFreeFormLayout().hashCode());
        hashCode = prime * hashCode + ((getSectionBasedLayout() == null) ? 0 : getSectionBasedLayout().hashCode());
        return hashCode;
    }

    @Override
    public LayoutConfiguration clone() {
        try {
            return (LayoutConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.LayoutConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
