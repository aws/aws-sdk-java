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
 * The theme colors that apply to UI and to charts, excluding data colors. The colors description is a hexadecimal color
 * code that consists of six alphanumerical characters, prefixed with <code>#</code>, for example #37BFF5. For more
 * information, see <a href="https://docs.aws.amazon.com/quicksight/latest/user/themes-in-quicksight.html">Using Themes
 * in Amazon QuickSight</a> in the <i>Amazon QuickSight User Guide.</i>
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/UIColorPalette" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UIColorPalette implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The color of text and other foreground elements that appear over the primary background regions, such as grid
     * lines, borders, table banding, icons, and so on.
     * </p>
     */
    private String primaryForeground;
    /**
     * <p>
     * The background color that applies to visuals and other high emphasis UI.
     * </p>
     */
    private String primaryBackground;
    /**
     * <p>
     * The foreground color that applies to any sheet title, sheet control text, or UI that appears over the secondary
     * background.
     * </p>
     */
    private String secondaryForeground;
    /**
     * <p>
     * The background color that applies to the sheet background and sheet controls.
     * </p>
     */
    private String secondaryBackground;
    /**
     * <p>
     * This color is that applies to selected states and buttons.
     * </p>
     */
    private String accent;
    /**
     * <p>
     * The foreground color that applies to any text or other elements that appear over the accent color.
     * </p>
     */
    private String accentForeground;
    /**
     * <p>
     * The color that applies to error messages.
     * </p>
     */
    private String danger;
    /**
     * <p>
     * The foreground color that applies to any text or other elements that appear over the error color.
     * </p>
     */
    private String dangerForeground;
    /**
     * <p>
     * This color that applies to warning and informational messages.
     * </p>
     */
    private String warning;
    /**
     * <p>
     * The foreground color that applies to any text or other elements that appear over the warning color.
     * </p>
     */
    private String warningForeground;
    /**
     * <p>
     * The color that applies to success messages, for example the check mark for a successful download.
     * </p>
     */
    private String success;
    /**
     * <p>
     * The foreground color that applies to any text or other elements that appear over the success color.
     * </p>
     */
    private String successForeground;
    /**
     * <p>
     * The color that applies to the names of fields that are identified as dimensions.
     * </p>
     */
    private String dimension;
    /**
     * <p>
     * The foreground color that applies to any text or other elements that appear over the dimension color.
     * </p>
     */
    private String dimensionForeground;
    /**
     * <p>
     * The color that applies to the names of fields that are identified as measures.
     * </p>
     */
    private String measure;
    /**
     * <p>
     * The foreground color that applies to any text or other elements that appear over the measure color.
     * </p>
     */
    private String measureForeground;

    /**
     * <p>
     * The color of text and other foreground elements that appear over the primary background regions, such as grid
     * lines, borders, table banding, icons, and so on.
     * </p>
     * 
     * @param primaryForeground
     *        The color of text and other foreground elements that appear over the primary background regions, such as
     *        grid lines, borders, table banding, icons, and so on.
     */

    public void setPrimaryForeground(String primaryForeground) {
        this.primaryForeground = primaryForeground;
    }

    /**
     * <p>
     * The color of text and other foreground elements that appear over the primary background regions, such as grid
     * lines, borders, table banding, icons, and so on.
     * </p>
     * 
     * @return The color of text and other foreground elements that appear over the primary background regions, such as
     *         grid lines, borders, table banding, icons, and so on.
     */

    public String getPrimaryForeground() {
        return this.primaryForeground;
    }

    /**
     * <p>
     * The color of text and other foreground elements that appear over the primary background regions, such as grid
     * lines, borders, table banding, icons, and so on.
     * </p>
     * 
     * @param primaryForeground
     *        The color of text and other foreground elements that appear over the primary background regions, such as
     *        grid lines, borders, table banding, icons, and so on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UIColorPalette withPrimaryForeground(String primaryForeground) {
        setPrimaryForeground(primaryForeground);
        return this;
    }

    /**
     * <p>
     * The background color that applies to visuals and other high emphasis UI.
     * </p>
     * 
     * @param primaryBackground
     *        The background color that applies to visuals and other high emphasis UI.
     */

    public void setPrimaryBackground(String primaryBackground) {
        this.primaryBackground = primaryBackground;
    }

    /**
     * <p>
     * The background color that applies to visuals and other high emphasis UI.
     * </p>
     * 
     * @return The background color that applies to visuals and other high emphasis UI.
     */

    public String getPrimaryBackground() {
        return this.primaryBackground;
    }

    /**
     * <p>
     * The background color that applies to visuals and other high emphasis UI.
     * </p>
     * 
     * @param primaryBackground
     *        The background color that applies to visuals and other high emphasis UI.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UIColorPalette withPrimaryBackground(String primaryBackground) {
        setPrimaryBackground(primaryBackground);
        return this;
    }

    /**
     * <p>
     * The foreground color that applies to any sheet title, sheet control text, or UI that appears over the secondary
     * background.
     * </p>
     * 
     * @param secondaryForeground
     *        The foreground color that applies to any sheet title, sheet control text, or UI that appears over the
     *        secondary background.
     */

    public void setSecondaryForeground(String secondaryForeground) {
        this.secondaryForeground = secondaryForeground;
    }

    /**
     * <p>
     * The foreground color that applies to any sheet title, sheet control text, or UI that appears over the secondary
     * background.
     * </p>
     * 
     * @return The foreground color that applies to any sheet title, sheet control text, or UI that appears over the
     *         secondary background.
     */

    public String getSecondaryForeground() {
        return this.secondaryForeground;
    }

    /**
     * <p>
     * The foreground color that applies to any sheet title, sheet control text, or UI that appears over the secondary
     * background.
     * </p>
     * 
     * @param secondaryForeground
     *        The foreground color that applies to any sheet title, sheet control text, or UI that appears over the
     *        secondary background.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UIColorPalette withSecondaryForeground(String secondaryForeground) {
        setSecondaryForeground(secondaryForeground);
        return this;
    }

    /**
     * <p>
     * The background color that applies to the sheet background and sheet controls.
     * </p>
     * 
     * @param secondaryBackground
     *        The background color that applies to the sheet background and sheet controls.
     */

    public void setSecondaryBackground(String secondaryBackground) {
        this.secondaryBackground = secondaryBackground;
    }

    /**
     * <p>
     * The background color that applies to the sheet background and sheet controls.
     * </p>
     * 
     * @return The background color that applies to the sheet background and sheet controls.
     */

    public String getSecondaryBackground() {
        return this.secondaryBackground;
    }

    /**
     * <p>
     * The background color that applies to the sheet background and sheet controls.
     * </p>
     * 
     * @param secondaryBackground
     *        The background color that applies to the sheet background and sheet controls.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UIColorPalette withSecondaryBackground(String secondaryBackground) {
        setSecondaryBackground(secondaryBackground);
        return this;
    }

    /**
     * <p>
     * This color is that applies to selected states and buttons.
     * </p>
     * 
     * @param accent
     *        This color is that applies to selected states and buttons.
     */

    public void setAccent(String accent) {
        this.accent = accent;
    }

    /**
     * <p>
     * This color is that applies to selected states and buttons.
     * </p>
     * 
     * @return This color is that applies to selected states and buttons.
     */

    public String getAccent() {
        return this.accent;
    }

    /**
     * <p>
     * This color is that applies to selected states and buttons.
     * </p>
     * 
     * @param accent
     *        This color is that applies to selected states and buttons.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UIColorPalette withAccent(String accent) {
        setAccent(accent);
        return this;
    }

    /**
     * <p>
     * The foreground color that applies to any text or other elements that appear over the accent color.
     * </p>
     * 
     * @param accentForeground
     *        The foreground color that applies to any text or other elements that appear over the accent color.
     */

    public void setAccentForeground(String accentForeground) {
        this.accentForeground = accentForeground;
    }

    /**
     * <p>
     * The foreground color that applies to any text or other elements that appear over the accent color.
     * </p>
     * 
     * @return The foreground color that applies to any text or other elements that appear over the accent color.
     */

    public String getAccentForeground() {
        return this.accentForeground;
    }

    /**
     * <p>
     * The foreground color that applies to any text or other elements that appear over the accent color.
     * </p>
     * 
     * @param accentForeground
     *        The foreground color that applies to any text or other elements that appear over the accent color.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UIColorPalette withAccentForeground(String accentForeground) {
        setAccentForeground(accentForeground);
        return this;
    }

    /**
     * <p>
     * The color that applies to error messages.
     * </p>
     * 
     * @param danger
     *        The color that applies to error messages.
     */

    public void setDanger(String danger) {
        this.danger = danger;
    }

    /**
     * <p>
     * The color that applies to error messages.
     * </p>
     * 
     * @return The color that applies to error messages.
     */

    public String getDanger() {
        return this.danger;
    }

    /**
     * <p>
     * The color that applies to error messages.
     * </p>
     * 
     * @param danger
     *        The color that applies to error messages.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UIColorPalette withDanger(String danger) {
        setDanger(danger);
        return this;
    }

    /**
     * <p>
     * The foreground color that applies to any text or other elements that appear over the error color.
     * </p>
     * 
     * @param dangerForeground
     *        The foreground color that applies to any text or other elements that appear over the error color.
     */

    public void setDangerForeground(String dangerForeground) {
        this.dangerForeground = dangerForeground;
    }

    /**
     * <p>
     * The foreground color that applies to any text or other elements that appear over the error color.
     * </p>
     * 
     * @return The foreground color that applies to any text or other elements that appear over the error color.
     */

    public String getDangerForeground() {
        return this.dangerForeground;
    }

    /**
     * <p>
     * The foreground color that applies to any text or other elements that appear over the error color.
     * </p>
     * 
     * @param dangerForeground
     *        The foreground color that applies to any text or other elements that appear over the error color.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UIColorPalette withDangerForeground(String dangerForeground) {
        setDangerForeground(dangerForeground);
        return this;
    }

    /**
     * <p>
     * This color that applies to warning and informational messages.
     * </p>
     * 
     * @param warning
     *        This color that applies to warning and informational messages.
     */

    public void setWarning(String warning) {
        this.warning = warning;
    }

    /**
     * <p>
     * This color that applies to warning and informational messages.
     * </p>
     * 
     * @return This color that applies to warning and informational messages.
     */

    public String getWarning() {
        return this.warning;
    }

    /**
     * <p>
     * This color that applies to warning and informational messages.
     * </p>
     * 
     * @param warning
     *        This color that applies to warning and informational messages.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UIColorPalette withWarning(String warning) {
        setWarning(warning);
        return this;
    }

    /**
     * <p>
     * The foreground color that applies to any text or other elements that appear over the warning color.
     * </p>
     * 
     * @param warningForeground
     *        The foreground color that applies to any text or other elements that appear over the warning color.
     */

    public void setWarningForeground(String warningForeground) {
        this.warningForeground = warningForeground;
    }

    /**
     * <p>
     * The foreground color that applies to any text or other elements that appear over the warning color.
     * </p>
     * 
     * @return The foreground color that applies to any text or other elements that appear over the warning color.
     */

    public String getWarningForeground() {
        return this.warningForeground;
    }

    /**
     * <p>
     * The foreground color that applies to any text or other elements that appear over the warning color.
     * </p>
     * 
     * @param warningForeground
     *        The foreground color that applies to any text or other elements that appear over the warning color.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UIColorPalette withWarningForeground(String warningForeground) {
        setWarningForeground(warningForeground);
        return this;
    }

    /**
     * <p>
     * The color that applies to success messages, for example the check mark for a successful download.
     * </p>
     * 
     * @param success
     *        The color that applies to success messages, for example the check mark for a successful download.
     */

    public void setSuccess(String success) {
        this.success = success;
    }

    /**
     * <p>
     * The color that applies to success messages, for example the check mark for a successful download.
     * </p>
     * 
     * @return The color that applies to success messages, for example the check mark for a successful download.
     */

    public String getSuccess() {
        return this.success;
    }

    /**
     * <p>
     * The color that applies to success messages, for example the check mark for a successful download.
     * </p>
     * 
     * @param success
     *        The color that applies to success messages, for example the check mark for a successful download.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UIColorPalette withSuccess(String success) {
        setSuccess(success);
        return this;
    }

    /**
     * <p>
     * The foreground color that applies to any text or other elements that appear over the success color.
     * </p>
     * 
     * @param successForeground
     *        The foreground color that applies to any text or other elements that appear over the success color.
     */

    public void setSuccessForeground(String successForeground) {
        this.successForeground = successForeground;
    }

    /**
     * <p>
     * The foreground color that applies to any text or other elements that appear over the success color.
     * </p>
     * 
     * @return The foreground color that applies to any text or other elements that appear over the success color.
     */

    public String getSuccessForeground() {
        return this.successForeground;
    }

    /**
     * <p>
     * The foreground color that applies to any text or other elements that appear over the success color.
     * </p>
     * 
     * @param successForeground
     *        The foreground color that applies to any text or other elements that appear over the success color.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UIColorPalette withSuccessForeground(String successForeground) {
        setSuccessForeground(successForeground);
        return this;
    }

    /**
     * <p>
     * The color that applies to the names of fields that are identified as dimensions.
     * </p>
     * 
     * @param dimension
     *        The color that applies to the names of fields that are identified as dimensions.
     */

    public void setDimension(String dimension) {
        this.dimension = dimension;
    }

    /**
     * <p>
     * The color that applies to the names of fields that are identified as dimensions.
     * </p>
     * 
     * @return The color that applies to the names of fields that are identified as dimensions.
     */

    public String getDimension() {
        return this.dimension;
    }

    /**
     * <p>
     * The color that applies to the names of fields that are identified as dimensions.
     * </p>
     * 
     * @param dimension
     *        The color that applies to the names of fields that are identified as dimensions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UIColorPalette withDimension(String dimension) {
        setDimension(dimension);
        return this;
    }

    /**
     * <p>
     * The foreground color that applies to any text or other elements that appear over the dimension color.
     * </p>
     * 
     * @param dimensionForeground
     *        The foreground color that applies to any text or other elements that appear over the dimension color.
     */

    public void setDimensionForeground(String dimensionForeground) {
        this.dimensionForeground = dimensionForeground;
    }

    /**
     * <p>
     * The foreground color that applies to any text or other elements that appear over the dimension color.
     * </p>
     * 
     * @return The foreground color that applies to any text or other elements that appear over the dimension color.
     */

    public String getDimensionForeground() {
        return this.dimensionForeground;
    }

    /**
     * <p>
     * The foreground color that applies to any text or other elements that appear over the dimension color.
     * </p>
     * 
     * @param dimensionForeground
     *        The foreground color that applies to any text or other elements that appear over the dimension color.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UIColorPalette withDimensionForeground(String dimensionForeground) {
        setDimensionForeground(dimensionForeground);
        return this;
    }

    /**
     * <p>
     * The color that applies to the names of fields that are identified as measures.
     * </p>
     * 
     * @param measure
     *        The color that applies to the names of fields that are identified as measures.
     */

    public void setMeasure(String measure) {
        this.measure = measure;
    }

    /**
     * <p>
     * The color that applies to the names of fields that are identified as measures.
     * </p>
     * 
     * @return The color that applies to the names of fields that are identified as measures.
     */

    public String getMeasure() {
        return this.measure;
    }

    /**
     * <p>
     * The color that applies to the names of fields that are identified as measures.
     * </p>
     * 
     * @param measure
     *        The color that applies to the names of fields that are identified as measures.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UIColorPalette withMeasure(String measure) {
        setMeasure(measure);
        return this;
    }

    /**
     * <p>
     * The foreground color that applies to any text or other elements that appear over the measure color.
     * </p>
     * 
     * @param measureForeground
     *        The foreground color that applies to any text or other elements that appear over the measure color.
     */

    public void setMeasureForeground(String measureForeground) {
        this.measureForeground = measureForeground;
    }

    /**
     * <p>
     * The foreground color that applies to any text or other elements that appear over the measure color.
     * </p>
     * 
     * @return The foreground color that applies to any text or other elements that appear over the measure color.
     */

    public String getMeasureForeground() {
        return this.measureForeground;
    }

    /**
     * <p>
     * The foreground color that applies to any text or other elements that appear over the measure color.
     * </p>
     * 
     * @param measureForeground
     *        The foreground color that applies to any text or other elements that appear over the measure color.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UIColorPalette withMeasureForeground(String measureForeground) {
        setMeasureForeground(measureForeground);
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
        if (getPrimaryForeground() != null)
            sb.append("PrimaryForeground: ").append(getPrimaryForeground()).append(",");
        if (getPrimaryBackground() != null)
            sb.append("PrimaryBackground: ").append(getPrimaryBackground()).append(",");
        if (getSecondaryForeground() != null)
            sb.append("SecondaryForeground: ").append(getSecondaryForeground()).append(",");
        if (getSecondaryBackground() != null)
            sb.append("SecondaryBackground: ").append(getSecondaryBackground()).append(",");
        if (getAccent() != null)
            sb.append("Accent: ").append(getAccent()).append(",");
        if (getAccentForeground() != null)
            sb.append("AccentForeground: ").append(getAccentForeground()).append(",");
        if (getDanger() != null)
            sb.append("Danger: ").append(getDanger()).append(",");
        if (getDangerForeground() != null)
            sb.append("DangerForeground: ").append(getDangerForeground()).append(",");
        if (getWarning() != null)
            sb.append("Warning: ").append(getWarning()).append(",");
        if (getWarningForeground() != null)
            sb.append("WarningForeground: ").append(getWarningForeground()).append(",");
        if (getSuccess() != null)
            sb.append("Success: ").append(getSuccess()).append(",");
        if (getSuccessForeground() != null)
            sb.append("SuccessForeground: ").append(getSuccessForeground()).append(",");
        if (getDimension() != null)
            sb.append("Dimension: ").append(getDimension()).append(",");
        if (getDimensionForeground() != null)
            sb.append("DimensionForeground: ").append(getDimensionForeground()).append(",");
        if (getMeasure() != null)
            sb.append("Measure: ").append(getMeasure()).append(",");
        if (getMeasureForeground() != null)
            sb.append("MeasureForeground: ").append(getMeasureForeground());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UIColorPalette == false)
            return false;
        UIColorPalette other = (UIColorPalette) obj;
        if (other.getPrimaryForeground() == null ^ this.getPrimaryForeground() == null)
            return false;
        if (other.getPrimaryForeground() != null && other.getPrimaryForeground().equals(this.getPrimaryForeground()) == false)
            return false;
        if (other.getPrimaryBackground() == null ^ this.getPrimaryBackground() == null)
            return false;
        if (other.getPrimaryBackground() != null && other.getPrimaryBackground().equals(this.getPrimaryBackground()) == false)
            return false;
        if (other.getSecondaryForeground() == null ^ this.getSecondaryForeground() == null)
            return false;
        if (other.getSecondaryForeground() != null && other.getSecondaryForeground().equals(this.getSecondaryForeground()) == false)
            return false;
        if (other.getSecondaryBackground() == null ^ this.getSecondaryBackground() == null)
            return false;
        if (other.getSecondaryBackground() != null && other.getSecondaryBackground().equals(this.getSecondaryBackground()) == false)
            return false;
        if (other.getAccent() == null ^ this.getAccent() == null)
            return false;
        if (other.getAccent() != null && other.getAccent().equals(this.getAccent()) == false)
            return false;
        if (other.getAccentForeground() == null ^ this.getAccentForeground() == null)
            return false;
        if (other.getAccentForeground() != null && other.getAccentForeground().equals(this.getAccentForeground()) == false)
            return false;
        if (other.getDanger() == null ^ this.getDanger() == null)
            return false;
        if (other.getDanger() != null && other.getDanger().equals(this.getDanger()) == false)
            return false;
        if (other.getDangerForeground() == null ^ this.getDangerForeground() == null)
            return false;
        if (other.getDangerForeground() != null && other.getDangerForeground().equals(this.getDangerForeground()) == false)
            return false;
        if (other.getWarning() == null ^ this.getWarning() == null)
            return false;
        if (other.getWarning() != null && other.getWarning().equals(this.getWarning()) == false)
            return false;
        if (other.getWarningForeground() == null ^ this.getWarningForeground() == null)
            return false;
        if (other.getWarningForeground() != null && other.getWarningForeground().equals(this.getWarningForeground()) == false)
            return false;
        if (other.getSuccess() == null ^ this.getSuccess() == null)
            return false;
        if (other.getSuccess() != null && other.getSuccess().equals(this.getSuccess()) == false)
            return false;
        if (other.getSuccessForeground() == null ^ this.getSuccessForeground() == null)
            return false;
        if (other.getSuccessForeground() != null && other.getSuccessForeground().equals(this.getSuccessForeground()) == false)
            return false;
        if (other.getDimension() == null ^ this.getDimension() == null)
            return false;
        if (other.getDimension() != null && other.getDimension().equals(this.getDimension()) == false)
            return false;
        if (other.getDimensionForeground() == null ^ this.getDimensionForeground() == null)
            return false;
        if (other.getDimensionForeground() != null && other.getDimensionForeground().equals(this.getDimensionForeground()) == false)
            return false;
        if (other.getMeasure() == null ^ this.getMeasure() == null)
            return false;
        if (other.getMeasure() != null && other.getMeasure().equals(this.getMeasure()) == false)
            return false;
        if (other.getMeasureForeground() == null ^ this.getMeasureForeground() == null)
            return false;
        if (other.getMeasureForeground() != null && other.getMeasureForeground().equals(this.getMeasureForeground()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPrimaryForeground() == null) ? 0 : getPrimaryForeground().hashCode());
        hashCode = prime * hashCode + ((getPrimaryBackground() == null) ? 0 : getPrimaryBackground().hashCode());
        hashCode = prime * hashCode + ((getSecondaryForeground() == null) ? 0 : getSecondaryForeground().hashCode());
        hashCode = prime * hashCode + ((getSecondaryBackground() == null) ? 0 : getSecondaryBackground().hashCode());
        hashCode = prime * hashCode + ((getAccent() == null) ? 0 : getAccent().hashCode());
        hashCode = prime * hashCode + ((getAccentForeground() == null) ? 0 : getAccentForeground().hashCode());
        hashCode = prime * hashCode + ((getDanger() == null) ? 0 : getDanger().hashCode());
        hashCode = prime * hashCode + ((getDangerForeground() == null) ? 0 : getDangerForeground().hashCode());
        hashCode = prime * hashCode + ((getWarning() == null) ? 0 : getWarning().hashCode());
        hashCode = prime * hashCode + ((getWarningForeground() == null) ? 0 : getWarningForeground().hashCode());
        hashCode = prime * hashCode + ((getSuccess() == null) ? 0 : getSuccess().hashCode());
        hashCode = prime * hashCode + ((getSuccessForeground() == null) ? 0 : getSuccessForeground().hashCode());
        hashCode = prime * hashCode + ((getDimension() == null) ? 0 : getDimension().hashCode());
        hashCode = prime * hashCode + ((getDimensionForeground() == null) ? 0 : getDimensionForeground().hashCode());
        hashCode = prime * hashCode + ((getMeasure() == null) ? 0 : getMeasure().hashCode());
        hashCode = prime * hashCode + ((getMeasureForeground() == null) ? 0 : getMeasureForeground().hashCode());
        return hashCode;
    }

    @Override
    public UIColorPalette clone() {
        try {
            return (UIColorPalette) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.UIColorPaletteMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
