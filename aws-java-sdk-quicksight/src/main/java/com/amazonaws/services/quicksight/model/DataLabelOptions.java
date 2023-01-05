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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DataLabelOptions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataLabelOptions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Determines the visibility of the data labels.
     * </p>
     */
    private String visibility;
    /**
     * <p>
     * Determines the visibility of the category field labels.
     * </p>
     */
    private String categoryLabelVisibility;
    /**
     * <p>
     * Determines the visibility of the measure field labels.
     * </p>
     */
    private String measureLabelVisibility;
    /**
     * <p>
     * The option that determines the data label type.
     * </p>
     */
    private java.util.List<DataLabelType> dataLabelTypes;
    /**
     * <p>
     * Determines the position of the data labels.
     * </p>
     */
    private String position;
    /**
     * <p>
     * Determines the content of the data labels.
     * </p>
     */
    private String labelContent;
    /**
     * <p>
     * Determines the font configuration of the data labels.
     * </p>
     */
    private FontConfiguration labelFontConfiguration;
    /**
     * <p>
     * Determines the color of the data labels.
     * </p>
     */
    private String labelColor;
    /**
     * <p>
     * Determines whether overlap is enabled or disabled for the data labels.
     * </p>
     */
    private String overlap;

    /**
     * <p>
     * Determines the visibility of the data labels.
     * </p>
     * 
     * @param visibility
     *        Determines the visibility of the data labels.
     * @see Visibility
     */

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    /**
     * <p>
     * Determines the visibility of the data labels.
     * </p>
     * 
     * @return Determines the visibility of the data labels.
     * @see Visibility
     */

    public String getVisibility() {
        return this.visibility;
    }

    /**
     * <p>
     * Determines the visibility of the data labels.
     * </p>
     * 
     * @param visibility
     *        Determines the visibility of the data labels.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Visibility
     */

    public DataLabelOptions withVisibility(String visibility) {
        setVisibility(visibility);
        return this;
    }

    /**
     * <p>
     * Determines the visibility of the data labels.
     * </p>
     * 
     * @param visibility
     *        Determines the visibility of the data labels.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Visibility
     */

    public DataLabelOptions withVisibility(Visibility visibility) {
        this.visibility = visibility.toString();
        return this;
    }

    /**
     * <p>
     * Determines the visibility of the category field labels.
     * </p>
     * 
     * @param categoryLabelVisibility
     *        Determines the visibility of the category field labels.
     * @see Visibility
     */

    public void setCategoryLabelVisibility(String categoryLabelVisibility) {
        this.categoryLabelVisibility = categoryLabelVisibility;
    }

    /**
     * <p>
     * Determines the visibility of the category field labels.
     * </p>
     * 
     * @return Determines the visibility of the category field labels.
     * @see Visibility
     */

    public String getCategoryLabelVisibility() {
        return this.categoryLabelVisibility;
    }

    /**
     * <p>
     * Determines the visibility of the category field labels.
     * </p>
     * 
     * @param categoryLabelVisibility
     *        Determines the visibility of the category field labels.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Visibility
     */

    public DataLabelOptions withCategoryLabelVisibility(String categoryLabelVisibility) {
        setCategoryLabelVisibility(categoryLabelVisibility);
        return this;
    }

    /**
     * <p>
     * Determines the visibility of the category field labels.
     * </p>
     * 
     * @param categoryLabelVisibility
     *        Determines the visibility of the category field labels.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Visibility
     */

    public DataLabelOptions withCategoryLabelVisibility(Visibility categoryLabelVisibility) {
        this.categoryLabelVisibility = categoryLabelVisibility.toString();
        return this;
    }

    /**
     * <p>
     * Determines the visibility of the measure field labels.
     * </p>
     * 
     * @param measureLabelVisibility
     *        Determines the visibility of the measure field labels.
     * @see Visibility
     */

    public void setMeasureLabelVisibility(String measureLabelVisibility) {
        this.measureLabelVisibility = measureLabelVisibility;
    }

    /**
     * <p>
     * Determines the visibility of the measure field labels.
     * </p>
     * 
     * @return Determines the visibility of the measure field labels.
     * @see Visibility
     */

    public String getMeasureLabelVisibility() {
        return this.measureLabelVisibility;
    }

    /**
     * <p>
     * Determines the visibility of the measure field labels.
     * </p>
     * 
     * @param measureLabelVisibility
     *        Determines the visibility of the measure field labels.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Visibility
     */

    public DataLabelOptions withMeasureLabelVisibility(String measureLabelVisibility) {
        setMeasureLabelVisibility(measureLabelVisibility);
        return this;
    }

    /**
     * <p>
     * Determines the visibility of the measure field labels.
     * </p>
     * 
     * @param measureLabelVisibility
     *        Determines the visibility of the measure field labels.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Visibility
     */

    public DataLabelOptions withMeasureLabelVisibility(Visibility measureLabelVisibility) {
        this.measureLabelVisibility = measureLabelVisibility.toString();
        return this;
    }

    /**
     * <p>
     * The option that determines the data label type.
     * </p>
     * 
     * @return The option that determines the data label type.
     */

    public java.util.List<DataLabelType> getDataLabelTypes() {
        return dataLabelTypes;
    }

    /**
     * <p>
     * The option that determines the data label type.
     * </p>
     * 
     * @param dataLabelTypes
     *        The option that determines the data label type.
     */

    public void setDataLabelTypes(java.util.Collection<DataLabelType> dataLabelTypes) {
        if (dataLabelTypes == null) {
            this.dataLabelTypes = null;
            return;
        }

        this.dataLabelTypes = new java.util.ArrayList<DataLabelType>(dataLabelTypes);
    }

    /**
     * <p>
     * The option that determines the data label type.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDataLabelTypes(java.util.Collection)} or {@link #withDataLabelTypes(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param dataLabelTypes
     *        The option that determines the data label type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataLabelOptions withDataLabelTypes(DataLabelType... dataLabelTypes) {
        if (this.dataLabelTypes == null) {
            setDataLabelTypes(new java.util.ArrayList<DataLabelType>(dataLabelTypes.length));
        }
        for (DataLabelType ele : dataLabelTypes) {
            this.dataLabelTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The option that determines the data label type.
     * </p>
     * 
     * @param dataLabelTypes
     *        The option that determines the data label type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataLabelOptions withDataLabelTypes(java.util.Collection<DataLabelType> dataLabelTypes) {
        setDataLabelTypes(dataLabelTypes);
        return this;
    }

    /**
     * <p>
     * Determines the position of the data labels.
     * </p>
     * 
     * @param position
     *        Determines the position of the data labels.
     * @see DataLabelPosition
     */

    public void setPosition(String position) {
        this.position = position;
    }

    /**
     * <p>
     * Determines the position of the data labels.
     * </p>
     * 
     * @return Determines the position of the data labels.
     * @see DataLabelPosition
     */

    public String getPosition() {
        return this.position;
    }

    /**
     * <p>
     * Determines the position of the data labels.
     * </p>
     * 
     * @param position
     *        Determines the position of the data labels.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataLabelPosition
     */

    public DataLabelOptions withPosition(String position) {
        setPosition(position);
        return this;
    }

    /**
     * <p>
     * Determines the position of the data labels.
     * </p>
     * 
     * @param position
     *        Determines the position of the data labels.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataLabelPosition
     */

    public DataLabelOptions withPosition(DataLabelPosition position) {
        this.position = position.toString();
        return this;
    }

    /**
     * <p>
     * Determines the content of the data labels.
     * </p>
     * 
     * @param labelContent
     *        Determines the content of the data labels.
     * @see DataLabelContent
     */

    public void setLabelContent(String labelContent) {
        this.labelContent = labelContent;
    }

    /**
     * <p>
     * Determines the content of the data labels.
     * </p>
     * 
     * @return Determines the content of the data labels.
     * @see DataLabelContent
     */

    public String getLabelContent() {
        return this.labelContent;
    }

    /**
     * <p>
     * Determines the content of the data labels.
     * </p>
     * 
     * @param labelContent
     *        Determines the content of the data labels.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataLabelContent
     */

    public DataLabelOptions withLabelContent(String labelContent) {
        setLabelContent(labelContent);
        return this;
    }

    /**
     * <p>
     * Determines the content of the data labels.
     * </p>
     * 
     * @param labelContent
     *        Determines the content of the data labels.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataLabelContent
     */

    public DataLabelOptions withLabelContent(DataLabelContent labelContent) {
        this.labelContent = labelContent.toString();
        return this;
    }

    /**
     * <p>
     * Determines the font configuration of the data labels.
     * </p>
     * 
     * @param labelFontConfiguration
     *        Determines the font configuration of the data labels.
     */

    public void setLabelFontConfiguration(FontConfiguration labelFontConfiguration) {
        this.labelFontConfiguration = labelFontConfiguration;
    }

    /**
     * <p>
     * Determines the font configuration of the data labels.
     * </p>
     * 
     * @return Determines the font configuration of the data labels.
     */

    public FontConfiguration getLabelFontConfiguration() {
        return this.labelFontConfiguration;
    }

    /**
     * <p>
     * Determines the font configuration of the data labels.
     * </p>
     * 
     * @param labelFontConfiguration
     *        Determines the font configuration of the data labels.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataLabelOptions withLabelFontConfiguration(FontConfiguration labelFontConfiguration) {
        setLabelFontConfiguration(labelFontConfiguration);
        return this;
    }

    /**
     * <p>
     * Determines the color of the data labels.
     * </p>
     * 
     * @param labelColor
     *        Determines the color of the data labels.
     */

    public void setLabelColor(String labelColor) {
        this.labelColor = labelColor;
    }

    /**
     * <p>
     * Determines the color of the data labels.
     * </p>
     * 
     * @return Determines the color of the data labels.
     */

    public String getLabelColor() {
        return this.labelColor;
    }

    /**
     * <p>
     * Determines the color of the data labels.
     * </p>
     * 
     * @param labelColor
     *        Determines the color of the data labels.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataLabelOptions withLabelColor(String labelColor) {
        setLabelColor(labelColor);
        return this;
    }

    /**
     * <p>
     * Determines whether overlap is enabled or disabled for the data labels.
     * </p>
     * 
     * @param overlap
     *        Determines whether overlap is enabled or disabled for the data labels.
     * @see DataLabelOverlap
     */

    public void setOverlap(String overlap) {
        this.overlap = overlap;
    }

    /**
     * <p>
     * Determines whether overlap is enabled or disabled for the data labels.
     * </p>
     * 
     * @return Determines whether overlap is enabled or disabled for the data labels.
     * @see DataLabelOverlap
     */

    public String getOverlap() {
        return this.overlap;
    }

    /**
     * <p>
     * Determines whether overlap is enabled or disabled for the data labels.
     * </p>
     * 
     * @param overlap
     *        Determines whether overlap is enabled or disabled for the data labels.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataLabelOverlap
     */

    public DataLabelOptions withOverlap(String overlap) {
        setOverlap(overlap);
        return this;
    }

    /**
     * <p>
     * Determines whether overlap is enabled or disabled for the data labels.
     * </p>
     * 
     * @param overlap
     *        Determines whether overlap is enabled or disabled for the data labels.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataLabelOverlap
     */

    public DataLabelOptions withOverlap(DataLabelOverlap overlap) {
        this.overlap = overlap.toString();
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
        if (getDataLabelTypes() != null)
            sb.append("DataLabelTypes: ").append(getDataLabelTypes()).append(",");
        if (getPosition() != null)
            sb.append("Position: ").append(getPosition()).append(",");
        if (getLabelContent() != null)
            sb.append("LabelContent: ").append(getLabelContent()).append(",");
        if (getLabelFontConfiguration() != null)
            sb.append("LabelFontConfiguration: ").append(getLabelFontConfiguration()).append(",");
        if (getLabelColor() != null)
            sb.append("LabelColor: ").append(getLabelColor()).append(",");
        if (getOverlap() != null)
            sb.append("Overlap: ").append(getOverlap());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataLabelOptions == false)
            return false;
        DataLabelOptions other = (DataLabelOptions) obj;
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
        if (other.getDataLabelTypes() == null ^ this.getDataLabelTypes() == null)
            return false;
        if (other.getDataLabelTypes() != null && other.getDataLabelTypes().equals(this.getDataLabelTypes()) == false)
            return false;
        if (other.getPosition() == null ^ this.getPosition() == null)
            return false;
        if (other.getPosition() != null && other.getPosition().equals(this.getPosition()) == false)
            return false;
        if (other.getLabelContent() == null ^ this.getLabelContent() == null)
            return false;
        if (other.getLabelContent() != null && other.getLabelContent().equals(this.getLabelContent()) == false)
            return false;
        if (other.getLabelFontConfiguration() == null ^ this.getLabelFontConfiguration() == null)
            return false;
        if (other.getLabelFontConfiguration() != null && other.getLabelFontConfiguration().equals(this.getLabelFontConfiguration()) == false)
            return false;
        if (other.getLabelColor() == null ^ this.getLabelColor() == null)
            return false;
        if (other.getLabelColor() != null && other.getLabelColor().equals(this.getLabelColor()) == false)
            return false;
        if (other.getOverlap() == null ^ this.getOverlap() == null)
            return false;
        if (other.getOverlap() != null && other.getOverlap().equals(this.getOverlap()) == false)
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
        hashCode = prime * hashCode + ((getDataLabelTypes() == null) ? 0 : getDataLabelTypes().hashCode());
        hashCode = prime * hashCode + ((getPosition() == null) ? 0 : getPosition().hashCode());
        hashCode = prime * hashCode + ((getLabelContent() == null) ? 0 : getLabelContent().hashCode());
        hashCode = prime * hashCode + ((getLabelFontConfiguration() == null) ? 0 : getLabelFontConfiguration().hashCode());
        hashCode = prime * hashCode + ((getLabelColor() == null) ? 0 : getLabelColor().hashCode());
        hashCode = prime * hashCode + ((getOverlap() == null) ? 0 : getOverlap().hashCode());
        return hashCode;
    }

    @Override
    public DataLabelOptions clone() {
        try {
            return (DataLabelOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.DataLabelOptionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
