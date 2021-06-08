/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * The theme configuration. This configuration contains all of the display properties for a theme.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ThemeConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ThemeConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Color properties that apply to chart data colors.
     * </p>
     */
    private DataColorPalette dataColorPalette;
    /**
     * <p>
     * Color properties that apply to the UI and to charts, excluding the colors that apply to data.
     * </p>
     */
    private UIColorPalette uIColorPalette;
    /**
     * <p>
     * Display options related to sheets.
     * </p>
     */
    private SheetStyle sheet;

    /**
     * <p>
     * Color properties that apply to chart data colors.
     * </p>
     * 
     * @param dataColorPalette
     *        Color properties that apply to chart data colors.
     */

    public void setDataColorPalette(DataColorPalette dataColorPalette) {
        this.dataColorPalette = dataColorPalette;
    }

    /**
     * <p>
     * Color properties that apply to chart data colors.
     * </p>
     * 
     * @return Color properties that apply to chart data colors.
     */

    public DataColorPalette getDataColorPalette() {
        return this.dataColorPalette;
    }

    /**
     * <p>
     * Color properties that apply to chart data colors.
     * </p>
     * 
     * @param dataColorPalette
     *        Color properties that apply to chart data colors.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThemeConfiguration withDataColorPalette(DataColorPalette dataColorPalette) {
        setDataColorPalette(dataColorPalette);
        return this;
    }

    /**
     * <p>
     * Color properties that apply to the UI and to charts, excluding the colors that apply to data.
     * </p>
     * 
     * @param uIColorPalette
     *        Color properties that apply to the UI and to charts, excluding the colors that apply to data.
     */

    public void setUIColorPalette(UIColorPalette uIColorPalette) {
        this.uIColorPalette = uIColorPalette;
    }

    /**
     * <p>
     * Color properties that apply to the UI and to charts, excluding the colors that apply to data.
     * </p>
     * 
     * @return Color properties that apply to the UI and to charts, excluding the colors that apply to data.
     */

    public UIColorPalette getUIColorPalette() {
        return this.uIColorPalette;
    }

    /**
     * <p>
     * Color properties that apply to the UI and to charts, excluding the colors that apply to data.
     * </p>
     * 
     * @param uIColorPalette
     *        Color properties that apply to the UI and to charts, excluding the colors that apply to data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThemeConfiguration withUIColorPalette(UIColorPalette uIColorPalette) {
        setUIColorPalette(uIColorPalette);
        return this;
    }

    /**
     * <p>
     * Display options related to sheets.
     * </p>
     * 
     * @param sheet
     *        Display options related to sheets.
     */

    public void setSheet(SheetStyle sheet) {
        this.sheet = sheet;
    }

    /**
     * <p>
     * Display options related to sheets.
     * </p>
     * 
     * @return Display options related to sheets.
     */

    public SheetStyle getSheet() {
        return this.sheet;
    }

    /**
     * <p>
     * Display options related to sheets.
     * </p>
     * 
     * @param sheet
     *        Display options related to sheets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThemeConfiguration withSheet(SheetStyle sheet) {
        setSheet(sheet);
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
        if (getDataColorPalette() != null)
            sb.append("DataColorPalette: ").append(getDataColorPalette()).append(",");
        if (getUIColorPalette() != null)
            sb.append("UIColorPalette: ").append(getUIColorPalette()).append(",");
        if (getSheet() != null)
            sb.append("Sheet: ").append(getSheet());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ThemeConfiguration == false)
            return false;
        ThemeConfiguration other = (ThemeConfiguration) obj;
        if (other.getDataColorPalette() == null ^ this.getDataColorPalette() == null)
            return false;
        if (other.getDataColorPalette() != null && other.getDataColorPalette().equals(this.getDataColorPalette()) == false)
            return false;
        if (other.getUIColorPalette() == null ^ this.getUIColorPalette() == null)
            return false;
        if (other.getUIColorPalette() != null && other.getUIColorPalette().equals(this.getUIColorPalette()) == false)
            return false;
        if (other.getSheet() == null ^ this.getSheet() == null)
            return false;
        if (other.getSheet() != null && other.getSheet().equals(this.getSheet()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDataColorPalette() == null) ? 0 : getDataColorPalette().hashCode());
        hashCode = prime * hashCode + ((getUIColorPalette() == null) ? 0 : getUIColorPalette().hashCode());
        hashCode = prime * hashCode + ((getSheet() == null) ? 0 : getSheet().hashCode());
        return hashCode;
    }

    @Override
    public ThemeConfiguration clone() {
        try {
            return (ThemeConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.ThemeConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
