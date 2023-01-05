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
 * The options that determine the presentation of the data labels.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/FunnelChartDataLabelOptions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FunnelChartDataLabelOptions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The visibility option that determines if data labels are displayed.
     * </p>
     */
    private String visibility;
    /**
     * <p>
     * The visibility of the category labels within the data labels.
     * </p>
     */
    private String categoryLabelVisibility;
    /**
     * <p>
     * The visibility of the measure labels within the data labels.
     * </p>
     */
    private String measureLabelVisibility;
    /**
     * <p>
     * Determines the positioning of the data label relative to a section of the funnel.
     * </p>
     */
    private String position;
    /**
     * <p>
     * The font configuration for the data labels.
     * </p>
     * <p>
     * Only the <code>FontSize</code> attribute of the font configuration is used for data labels.
     * </p>
     */
    private FontConfiguration labelFontConfiguration;
    /**
     * <p>
     * The color of the data label text.
     * </p>
     */
    private String labelColor;
    /**
     * <p>
     * Determines the style of the metric labels.
     * </p>
     */
    private String measureDataLabelStyle;

    /**
     * <p>
     * The visibility option that determines if data labels are displayed.
     * </p>
     * 
     * @param visibility
     *        The visibility option that determines if data labels are displayed.
     * @see Visibility
     */

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    /**
     * <p>
     * The visibility option that determines if data labels are displayed.
     * </p>
     * 
     * @return The visibility option that determines if data labels are displayed.
     * @see Visibility
     */

    public String getVisibility() {
        return this.visibility;
    }

    /**
     * <p>
     * The visibility option that determines if data labels are displayed.
     * </p>
     * 
     * @param visibility
     *        The visibility option that determines if data labels are displayed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Visibility
     */

    public FunnelChartDataLabelOptions withVisibility(String visibility) {
        setVisibility(visibility);
        return this;
    }

    /**
     * <p>
     * The visibility option that determines if data labels are displayed.
     * </p>
     * 
     * @param visibility
     *        The visibility option that determines if data labels are displayed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Visibility
     */

    public FunnelChartDataLabelOptions withVisibility(Visibility visibility) {
        this.visibility = visibility.toString();
        return this;
    }

    /**
     * <p>
     * The visibility of the category labels within the data labels.
     * </p>
     * 
     * @param categoryLabelVisibility
     *        The visibility of the category labels within the data labels.
     * @see Visibility
     */

    public void setCategoryLabelVisibility(String categoryLabelVisibility) {
        this.categoryLabelVisibility = categoryLabelVisibility;
    }

    /**
     * <p>
     * The visibility of the category labels within the data labels.
     * </p>
     * 
     * @return The visibility of the category labels within the data labels.
     * @see Visibility
     */

    public String getCategoryLabelVisibility() {
        return this.categoryLabelVisibility;
    }

    /**
     * <p>
     * The visibility of the category labels within the data labels.
     * </p>
     * 
     * @param categoryLabelVisibility
     *        The visibility of the category labels within the data labels.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Visibility
     */

    public FunnelChartDataLabelOptions withCategoryLabelVisibility(String categoryLabelVisibility) {
        setCategoryLabelVisibility(categoryLabelVisibility);
        return this;
    }

    /**
     * <p>
     * The visibility of the category labels within the data labels.
     * </p>
     * 
     * @param categoryLabelVisibility
     *        The visibility of the category labels within the data labels.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Visibility
     */

    public FunnelChartDataLabelOptions withCategoryLabelVisibility(Visibility categoryLabelVisibility) {
        this.categoryLabelVisibility = categoryLabelVisibility.toString();
        return this;
    }

    /**
     * <p>
     * The visibility of the measure labels within the data labels.
     * </p>
     * 
     * @param measureLabelVisibility
     *        The visibility of the measure labels within the data labels.
     * @see Visibility
     */

    public void setMeasureLabelVisibility(String measureLabelVisibility) {
        this.measureLabelVisibility = measureLabelVisibility;
    }

    /**
     * <p>
     * The visibility of the measure labels within the data labels.
     * </p>
     * 
     * @return The visibility of the measure labels within the data labels.
     * @see Visibility
     */

    public String getMeasureLabelVisibility() {
        return this.measureLabelVisibility;
    }

    /**
     * <p>
     * The visibility of the measure labels within the data labels.
     * </p>
     * 
     * @param measureLabelVisibility
     *        The visibility of the measure labels within the data labels.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Visibility
     */

    public FunnelChartDataLabelOptions withMeasureLabelVisibility(String measureLabelVisibility) {
        setMeasureLabelVisibility(measureLabelVisibility);
        return this;
    }

    /**
     * <p>
     * The visibility of the measure labels within the data labels.
     * </p>
     * 
     * @param measureLabelVisibility
     *        The visibility of the measure labels within the data labels.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Visibility
     */

    public FunnelChartDataLabelOptions withMeasureLabelVisibility(Visibility measureLabelVisibility) {
        this.measureLabelVisibility = measureLabelVisibility.toString();
        return this;
    }

    /**
     * <p>
     * Determines the positioning of the data label relative to a section of the funnel.
     * </p>
     * 
     * @param position
     *        Determines the positioning of the data label relative to a section of the funnel.
     * @see DataLabelPosition
     */

    public void setPosition(String position) {
        this.position = position;
    }

    /**
     * <p>
     * Determines the positioning of the data label relative to a section of the funnel.
     * </p>
     * 
     * @return Determines the positioning of the data label relative to a section of the funnel.
     * @see DataLabelPosition
     */

    public String getPosition() {
        return this.position;
    }

    /**
     * <p>
     * Determines the positioning of the data label relative to a section of the funnel.
     * </p>
     * 
     * @param position
     *        Determines the positioning of the data label relative to a section of the funnel.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataLabelPosition
     */

    public FunnelChartDataLabelOptions withPosition(String position) {
        setPosition(position);
        return this;
    }

    /**
     * <p>
     * Determines the positioning of the data label relative to a section of the funnel.
     * </p>
     * 
     * @param position
     *        Determines the positioning of the data label relative to a section of the funnel.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataLabelPosition
     */

    public FunnelChartDataLabelOptions withPosition(DataLabelPosition position) {
        this.position = position.toString();
        return this;
    }

    /**
     * <p>
     * The font configuration for the data labels.
     * </p>
     * <p>
     * Only the <code>FontSize</code> attribute of the font configuration is used for data labels.
     * </p>
     * 
     * @param labelFontConfiguration
     *        The font configuration for the data labels.</p>
     *        <p>
     *        Only the <code>FontSize</code> attribute of the font configuration is used for data labels.
     */

    public void setLabelFontConfiguration(FontConfiguration labelFontConfiguration) {
        this.labelFontConfiguration = labelFontConfiguration;
    }

    /**
     * <p>
     * The font configuration for the data labels.
     * </p>
     * <p>
     * Only the <code>FontSize</code> attribute of the font configuration is used for data labels.
     * </p>
     * 
     * @return The font configuration for the data labels.</p>
     *         <p>
     *         Only the <code>FontSize</code> attribute of the font configuration is used for data labels.
     */

    public FontConfiguration getLabelFontConfiguration() {
        return this.labelFontConfiguration;
    }

    /**
     * <p>
     * The font configuration for the data labels.
     * </p>
     * <p>
     * Only the <code>FontSize</code> attribute of the font configuration is used for data labels.
     * </p>
     * 
     * @param labelFontConfiguration
     *        The font configuration for the data labels.</p>
     *        <p>
     *        Only the <code>FontSize</code> attribute of the font configuration is used for data labels.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FunnelChartDataLabelOptions withLabelFontConfiguration(FontConfiguration labelFontConfiguration) {
        setLabelFontConfiguration(labelFontConfiguration);
        return this;
    }

    /**
     * <p>
     * The color of the data label text.
     * </p>
     * 
     * @param labelColor
     *        The color of the data label text.
     */

    public void setLabelColor(String labelColor) {
        this.labelColor = labelColor;
    }

    /**
     * <p>
     * The color of the data label text.
     * </p>
     * 
     * @return The color of the data label text.
     */

    public String getLabelColor() {
        return this.labelColor;
    }

    /**
     * <p>
     * The color of the data label text.
     * </p>
     * 
     * @param labelColor
     *        The color of the data label text.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FunnelChartDataLabelOptions withLabelColor(String labelColor) {
        setLabelColor(labelColor);
        return this;
    }

    /**
     * <p>
     * Determines the style of the metric labels.
     * </p>
     * 
     * @param measureDataLabelStyle
     *        Determines the style of the metric labels.
     * @see FunnelChartMeasureDataLabelStyle
     */

    public void setMeasureDataLabelStyle(String measureDataLabelStyle) {
        this.measureDataLabelStyle = measureDataLabelStyle;
    }

    /**
     * <p>
     * Determines the style of the metric labels.
     * </p>
     * 
     * @return Determines the style of the metric labels.
     * @see FunnelChartMeasureDataLabelStyle
     */

    public String getMeasureDataLabelStyle() {
        return this.measureDataLabelStyle;
    }

    /**
     * <p>
     * Determines the style of the metric labels.
     * </p>
     * 
     * @param measureDataLabelStyle
     *        Determines the style of the metric labels.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FunnelChartMeasureDataLabelStyle
     */

    public FunnelChartDataLabelOptions withMeasureDataLabelStyle(String measureDataLabelStyle) {
        setMeasureDataLabelStyle(measureDataLabelStyle);
        return this;
    }

    /**
     * <p>
     * Determines the style of the metric labels.
     * </p>
     * 
     * @param measureDataLabelStyle
     *        Determines the style of the metric labels.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FunnelChartMeasureDataLabelStyle
     */

    public FunnelChartDataLabelOptions withMeasureDataLabelStyle(FunnelChartMeasureDataLabelStyle measureDataLabelStyle) {
        this.measureDataLabelStyle = measureDataLabelStyle.toString();
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
        if (getCategoryLabelVisibility() != null)
            sb.append("CategoryLabelVisibility: ").append(getCategoryLabelVisibility()).append(",");
        if (getMeasureLabelVisibility() != null)
            sb.append("MeasureLabelVisibility: ").append(getMeasureLabelVisibility()).append(",");
        if (getPosition() != null)
            sb.append("Position: ").append(getPosition()).append(",");
        if (getLabelFontConfiguration() != null)
            sb.append("LabelFontConfiguration: ").append(getLabelFontConfiguration()).append(",");
        if (getLabelColor() != null)
            sb.append("LabelColor: ").append(getLabelColor()).append(",");
        if (getMeasureDataLabelStyle() != null)
            sb.append("MeasureDataLabelStyle: ").append(getMeasureDataLabelStyle());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FunnelChartDataLabelOptions == false)
            return false;
        FunnelChartDataLabelOptions other = (FunnelChartDataLabelOptions) obj;
        if (other.getVisibility() == null ^ this.getVisibility() == null)
            return false;
        if (other.getVisibility() != null && other.getVisibility().equals(this.getVisibility()) == false)
            return false;
        if (other.getCategoryLabelVisibility() == null ^ this.getCategoryLabelVisibility() == null)
            return false;
        if (other.getCategoryLabelVisibility() != null && other.getCategoryLabelVisibility().equals(this.getCategoryLabelVisibility()) == false)
            return false;
        if (other.getMeasureLabelVisibility() == null ^ this.getMeasureLabelVisibility() == null)
            return false;
        if (other.getMeasureLabelVisibility() != null && other.getMeasureLabelVisibility().equals(this.getMeasureLabelVisibility()) == false)
            return false;
        if (other.getPosition() == null ^ this.getPosition() == null)
            return false;
        if (other.getPosition() != null && other.getPosition().equals(this.getPosition()) == false)
            return false;
        if (other.getLabelFontConfiguration() == null ^ this.getLabelFontConfiguration() == null)
            return false;
        if (other.getLabelFontConfiguration() != null && other.getLabelFontConfiguration().equals(this.getLabelFontConfiguration()) == false)
            return false;
        if (other.getLabelColor() == null ^ this.getLabelColor() == null)
            return false;
        if (other.getLabelColor() != null && other.getLabelColor().equals(this.getLabelColor()) == false)
            return false;
        if (other.getMeasureDataLabelStyle() == null ^ this.getMeasureDataLabelStyle() == null)
            return false;
        if (other.getMeasureDataLabelStyle() != null && other.getMeasureDataLabelStyle().equals(this.getMeasureDataLabelStyle()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVisibility() == null) ? 0 : getVisibility().hashCode());
        hashCode = prime * hashCode + ((getCategoryLabelVisibility() == null) ? 0 : getCategoryLabelVisibility().hashCode());
        hashCode = prime * hashCode + ((getMeasureLabelVisibility() == null) ? 0 : getMeasureLabelVisibility().hashCode());
        hashCode = prime * hashCode + ((getPosition() == null) ? 0 : getPosition().hashCode());
        hashCode = prime * hashCode + ((getLabelFontConfiguration() == null) ? 0 : getLabelFontConfiguration().hashCode());
        hashCode = prime * hashCode + ((getLabelColor() == null) ? 0 : getLabelColor().hashCode());
        hashCode = prime * hashCode + ((getMeasureDataLabelStyle() == null) ? 0 : getMeasureDataLabelStyle().hashCode());
        return hashCode;
    }

    @Override
    public FunnelChartDataLabelOptions clone() {
        try {
            return (FunnelChartDataLabelOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.FunnelChartDataLabelOptionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
