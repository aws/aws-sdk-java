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
 * A control to display a horizontal toggle bar. This is used to change a value by sliding the toggle.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ParameterSliderControl" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ParameterSliderControl implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the <code>ParameterSliderControl</code>.
     * </p>
     */
    private String parameterControlId;
    /**
     * <p>
     * The title of the <code>ParameterSliderControl</code>.
     * </p>
     */
    private String title;
    /**
     * <p>
     * The source parameter name of the <code>ParameterSliderControl</code>.
     * </p>
     */
    private String sourceParameterName;
    /**
     * <p>
     * The display options of a control.
     * </p>
     */
    private SliderControlDisplayOptions displayOptions;
    /**
     * <p>
     * The smaller value that is displayed at the left of the slider.
     * </p>
     */
    private Double maximumValue;
    /**
     * <p>
     * The larger value that is displayed at the right of the slider.
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
     * The ID of the <code>ParameterSliderControl</code>.
     * </p>
     * 
     * @param parameterControlId
     *        The ID of the <code>ParameterSliderControl</code>.
     */

    public void setParameterControlId(String parameterControlId) {
        this.parameterControlId = parameterControlId;
    }

    /**
     * <p>
     * The ID of the <code>ParameterSliderControl</code>.
     * </p>
     * 
     * @return The ID of the <code>ParameterSliderControl</code>.
     */

    public String getParameterControlId() {
        return this.parameterControlId;
    }

    /**
     * <p>
     * The ID of the <code>ParameterSliderControl</code>.
     * </p>
     * 
     * @param parameterControlId
     *        The ID of the <code>ParameterSliderControl</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParameterSliderControl withParameterControlId(String parameterControlId) {
        setParameterControlId(parameterControlId);
        return this;
    }

    /**
     * <p>
     * The title of the <code>ParameterSliderControl</code>.
     * </p>
     * 
     * @param title
     *        The title of the <code>ParameterSliderControl</code>.
     */

    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * <p>
     * The title of the <code>ParameterSliderControl</code>.
     * </p>
     * 
     * @return The title of the <code>ParameterSliderControl</code>.
     */

    public String getTitle() {
        return this.title;
    }

    /**
     * <p>
     * The title of the <code>ParameterSliderControl</code>.
     * </p>
     * 
     * @param title
     *        The title of the <code>ParameterSliderControl</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParameterSliderControl withTitle(String title) {
        setTitle(title);
        return this;
    }

    /**
     * <p>
     * The source parameter name of the <code>ParameterSliderControl</code>.
     * </p>
     * 
     * @param sourceParameterName
     *        The source parameter name of the <code>ParameterSliderControl</code>.
     */

    public void setSourceParameterName(String sourceParameterName) {
        this.sourceParameterName = sourceParameterName;
    }

    /**
     * <p>
     * The source parameter name of the <code>ParameterSliderControl</code>.
     * </p>
     * 
     * @return The source parameter name of the <code>ParameterSliderControl</code>.
     */

    public String getSourceParameterName() {
        return this.sourceParameterName;
    }

    /**
     * <p>
     * The source parameter name of the <code>ParameterSliderControl</code>.
     * </p>
     * 
     * @param sourceParameterName
     *        The source parameter name of the <code>ParameterSliderControl</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParameterSliderControl withSourceParameterName(String sourceParameterName) {
        setSourceParameterName(sourceParameterName);
        return this;
    }

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

    public ParameterSliderControl withDisplayOptions(SliderControlDisplayOptions displayOptions) {
        setDisplayOptions(displayOptions);
        return this;
    }

    /**
     * <p>
     * The smaller value that is displayed at the left of the slider.
     * </p>
     * 
     * @param maximumValue
     *        The smaller value that is displayed at the left of the slider.
     */

    public void setMaximumValue(Double maximumValue) {
        this.maximumValue = maximumValue;
    }

    /**
     * <p>
     * The smaller value that is displayed at the left of the slider.
     * </p>
     * 
     * @return The smaller value that is displayed at the left of the slider.
     */

    public Double getMaximumValue() {
        return this.maximumValue;
    }

    /**
     * <p>
     * The smaller value that is displayed at the left of the slider.
     * </p>
     * 
     * @param maximumValue
     *        The smaller value that is displayed at the left of the slider.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParameterSliderControl withMaximumValue(Double maximumValue) {
        setMaximumValue(maximumValue);
        return this;
    }

    /**
     * <p>
     * The larger value that is displayed at the right of the slider.
     * </p>
     * 
     * @param minimumValue
     *        The larger value that is displayed at the right of the slider.
     */

    public void setMinimumValue(Double minimumValue) {
        this.minimumValue = minimumValue;
    }

    /**
     * <p>
     * The larger value that is displayed at the right of the slider.
     * </p>
     * 
     * @return The larger value that is displayed at the right of the slider.
     */

    public Double getMinimumValue() {
        return this.minimumValue;
    }

    /**
     * <p>
     * The larger value that is displayed at the right of the slider.
     * </p>
     * 
     * @param minimumValue
     *        The larger value that is displayed at the right of the slider.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParameterSliderControl withMinimumValue(Double minimumValue) {
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

    public ParameterSliderControl withStepSize(Double stepSize) {
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
        if (getParameterControlId() != null)
            sb.append("ParameterControlId: ").append(getParameterControlId()).append(",");
        if (getTitle() != null)
            sb.append("Title: ").append(getTitle()).append(",");
        if (getSourceParameterName() != null)
            sb.append("SourceParameterName: ").append(getSourceParameterName()).append(",");
        if (getDisplayOptions() != null)
            sb.append("DisplayOptions: ").append(getDisplayOptions()).append(",");
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

        if (obj instanceof ParameterSliderControl == false)
            return false;
        ParameterSliderControl other = (ParameterSliderControl) obj;
        if (other.getParameterControlId() == null ^ this.getParameterControlId() == null)
            return false;
        if (other.getParameterControlId() != null && other.getParameterControlId().equals(this.getParameterControlId()) == false)
            return false;
        if (other.getTitle() == null ^ this.getTitle() == null)
            return false;
        if (other.getTitle() != null && other.getTitle().equals(this.getTitle()) == false)
            return false;
        if (other.getSourceParameterName() == null ^ this.getSourceParameterName() == null)
            return false;
        if (other.getSourceParameterName() != null && other.getSourceParameterName().equals(this.getSourceParameterName()) == false)
            return false;
        if (other.getDisplayOptions() == null ^ this.getDisplayOptions() == null)
            return false;
        if (other.getDisplayOptions() != null && other.getDisplayOptions().equals(this.getDisplayOptions()) == false)
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

        hashCode = prime * hashCode + ((getParameterControlId() == null) ? 0 : getParameterControlId().hashCode());
        hashCode = prime * hashCode + ((getTitle() == null) ? 0 : getTitle().hashCode());
        hashCode = prime * hashCode + ((getSourceParameterName() == null) ? 0 : getSourceParameterName().hashCode());
        hashCode = prime * hashCode + ((getDisplayOptions() == null) ? 0 : getDisplayOptions().hashCode());
        hashCode = prime * hashCode + ((getMaximumValue() == null) ? 0 : getMaximumValue().hashCode());
        hashCode = prime * hashCode + ((getMinimumValue() == null) ? 0 : getMinimumValue().hashCode());
        hashCode = prime * hashCode + ((getStepSize() == null) ? 0 : getStepSize().hashCode());
        return hashCode;
    }

    @Override
    public ParameterSliderControl clone() {
        try {
            return (ParameterSliderControl) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.ParameterSliderControlMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
