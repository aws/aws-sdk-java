/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * The default options that correspond to the <code>Slider</code> filter control type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DefaultSliderControlOptions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DefaultSliderControlOptions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The display options of a control.
     * </p>
     */
    private SliderControlDisplayOptions displayOptions;
    /**
     * <p>
     * The type of the <code>DefaultSliderControlOptions</code>. Choose one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SINGLE_POINT</code>: Filter against(equals) a single data point.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RANGE</code>: Filter data that is in a specified range.
     * </p>
     * </li>
     * </ul>
     */
    private String type;
    /**
     * <p>
     * The larger value that is displayed at the right of the slider.
     * </p>
     */
    private Double maximumValue;
    /**
     * <p>
     * The smaller value that is displayed at the left of the slider.
     * </p>
     */
    private Double minimumValue;
    /**
     * <p>
     * The number of increments that the slider bar is divided into.
     * </p>
     */
    private Double stepSize;

    /**
     * <p>
     * The display options of a control.
     * </p>
     * 
     * @param displayOptions
     *        The display options of a control.
     */

    public void setDisplayOptions(SliderControlDisplayOptions displayOptions) {
        this.displayOptions = displayOptions;
    }

    /**
     * <p>
     * The display options of a control.
     * </p>
     * 
     * @return The display options of a control.
     */

    public SliderControlDisplayOptions getDisplayOptions() {
        return this.displayOptions;
    }

    /**
     * <p>
     * The display options of a control.
     * </p>
     * 
     * @param displayOptions
     *        The display options of a control.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DefaultSliderControlOptions withDisplayOptions(SliderControlDisplayOptions displayOptions) {
        setDisplayOptions(displayOptions);
        return this;
    }

    /**
     * <p>
     * The type of the <code>DefaultSliderControlOptions</code>. Choose one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SINGLE_POINT</code>: Filter against(equals) a single data point.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RANGE</code>: Filter data that is in a specified range.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The type of the <code>DefaultSliderControlOptions</code>. Choose one of the following options:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SINGLE_POINT</code>: Filter against(equals) a single data point.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RANGE</code>: Filter data that is in a specified range.
     *        </p>
     *        </li>
     * @see SheetControlSliderType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the <code>DefaultSliderControlOptions</code>. Choose one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SINGLE_POINT</code>: Filter against(equals) a single data point.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RANGE</code>: Filter data that is in a specified range.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The type of the <code>DefaultSliderControlOptions</code>. Choose one of the following options:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>SINGLE_POINT</code>: Filter against(equals) a single data point.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>RANGE</code>: Filter data that is in a specified range.
     *         </p>
     *         </li>
     * @see SheetControlSliderType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of the <code>DefaultSliderControlOptions</code>. Choose one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SINGLE_POINT</code>: Filter against(equals) a single data point.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RANGE</code>: Filter data that is in a specified range.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The type of the <code>DefaultSliderControlOptions</code>. Choose one of the following options:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SINGLE_POINT</code>: Filter against(equals) a single data point.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RANGE</code>: Filter data that is in a specified range.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SheetControlSliderType
     */

    public DefaultSliderControlOptions withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of the <code>DefaultSliderControlOptions</code>. Choose one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SINGLE_POINT</code>: Filter against(equals) a single data point.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RANGE</code>: Filter data that is in a specified range.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The type of the <code>DefaultSliderControlOptions</code>. Choose one of the following options:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SINGLE_POINT</code>: Filter against(equals) a single data point.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RANGE</code>: Filter data that is in a specified range.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SheetControlSliderType
     */

    public DefaultSliderControlOptions withType(SheetControlSliderType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The larger value that is displayed at the right of the slider.
     * </p>
     * 
     * @param maximumValue
     *        The larger value that is displayed at the right of the slider.
     */

    public void setMaximumValue(Double maximumValue) {
        this.maximumValue = maximumValue;
    }

    /**
     * <p>
     * The larger value that is displayed at the right of the slider.
     * </p>
     * 
     * @return The larger value that is displayed at the right of the slider.
     */

    public Double getMaximumValue() {
        return this.maximumValue;
    }

    /**
     * <p>
     * The larger value that is displayed at the right of the slider.
     * </p>
     * 
     * @param maximumValue
     *        The larger value that is displayed at the right of the slider.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DefaultSliderControlOptions withMaximumValue(Double maximumValue) {
        setMaximumValue(maximumValue);
        return this;
    }

    /**
     * <p>
     * The smaller value that is displayed at the left of the slider.
     * </p>
     * 
     * @param minimumValue
     *        The smaller value that is displayed at the left of the slider.
     */

    public void setMinimumValue(Double minimumValue) {
        this.minimumValue = minimumValue;
    }

    /**
     * <p>
     * The smaller value that is displayed at the left of the slider.
     * </p>
     * 
     * @return The smaller value that is displayed at the left of the slider.
     */

    public Double getMinimumValue() {
        return this.minimumValue;
    }

    /**
     * <p>
     * The smaller value that is displayed at the left of the slider.
     * </p>
     * 
     * @param minimumValue
     *        The smaller value that is displayed at the left of the slider.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DefaultSliderControlOptions withMinimumValue(Double minimumValue) {
        setMinimumValue(minimumValue);
        return this;
    }

    /**
     * <p>
     * The number of increments that the slider bar is divided into.
     * </p>
     * 
     * @param stepSize
     *        The number of increments that the slider bar is divided into.
     */

    public void setStepSize(Double stepSize) {
        this.stepSize = stepSize;
    }

    /**
     * <p>
     * The number of increments that the slider bar is divided into.
     * </p>
     * 
     * @return The number of increments that the slider bar is divided into.
     */

    public Double getStepSize() {
        return this.stepSize;
    }

    /**
     * <p>
     * The number of increments that the slider bar is divided into.
     * </p>
     * 
     * @param stepSize
     *        The number of increments that the slider bar is divided into.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DefaultSliderControlOptions withStepSize(Double stepSize) {
        setStepSize(stepSize);
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
        if (getDisplayOptions() != null)
            sb.append("DisplayOptions: ").append(getDisplayOptions()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getMaximumValue() != null)
            sb.append("MaximumValue: ").append(getMaximumValue()).append(",");
        if (getMinimumValue() != null)
            sb.append("MinimumValue: ").append(getMinimumValue()).append(",");
        if (getStepSize() != null)
            sb.append("StepSize: ").append(getStepSize());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DefaultSliderControlOptions == false)
            return false;
        DefaultSliderControlOptions other = (DefaultSliderControlOptions) obj;
        if (other.getDisplayOptions() == null ^ this.getDisplayOptions() == null)
            return false;
        if (other.getDisplayOptions() != null && other.getDisplayOptions().equals(this.getDisplayOptions()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getMaximumValue() == null ^ this.getMaximumValue() == null)
            return false;
        if (other.getMaximumValue() != null && other.getMaximumValue().equals(this.getMaximumValue()) == false)
            return false;
        if (other.getMinimumValue() == null ^ this.getMinimumValue() == null)
            return false;
        if (other.getMinimumValue() != null && other.getMinimumValue().equals(this.getMinimumValue()) == false)
            return false;
        if (other.getStepSize() == null ^ this.getStepSize() == null)
            return false;
        if (other.getStepSize() != null && other.getStepSize().equals(this.getStepSize()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDisplayOptions() == null) ? 0 : getDisplayOptions().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getMaximumValue() == null) ? 0 : getMaximumValue().hashCode());
        hashCode = prime * hashCode + ((getMinimumValue() == null) ? 0 : getMinimumValue().hashCode());
        hashCode = prime * hashCode + ((getStepSize() == null) ? 0 : getStepSize().hashCode());
        return hashCode;
    }

    @Override
    public DefaultSliderControlOptions clone() {
        try {
            return (DefaultSliderControlOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.DefaultSliderControlOptionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
