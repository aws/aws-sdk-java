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
 * The field series item configuration of a line chart.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/FieldSeriesItem" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FieldSeriesItem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The field ID of the field for which you are setting the axis binding.
     * </p>
     */
    private String fieldId;
    /**
     * <p>
     * The axis that you are binding the field to.
     * </p>
     */
    private String axisBinding;
    /**
     * <p>
     * The options that determine the presentation of line series associated to the field.
     * </p>
     */
    private LineChartSeriesSettings settings;

    /**
     * <p>
     * The field ID of the field for which you are setting the axis binding.
     * </p>
     * 
     * @param fieldId
     *        The field ID of the field for which you are setting the axis binding.
     */

    public void setFieldId(String fieldId) {
        this.fieldId = fieldId;
    }

    /**
     * <p>
     * The field ID of the field for which you are setting the axis binding.
     * </p>
     * 
     * @return The field ID of the field for which you are setting the axis binding.
     */

    public String getFieldId() {
        return this.fieldId;
    }

    /**
     * <p>
     * The field ID of the field for which you are setting the axis binding.
     * </p>
     * 
     * @param fieldId
     *        The field ID of the field for which you are setting the axis binding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FieldSeriesItem withFieldId(String fieldId) {
        setFieldId(fieldId);
        return this;
    }

    /**
     * <p>
     * The axis that you are binding the field to.
     * </p>
     * 
     * @param axisBinding
     *        The axis that you are binding the field to.
     * @see AxisBinding
     */

    public void setAxisBinding(String axisBinding) {
        this.axisBinding = axisBinding;
    }

    /**
     * <p>
     * The axis that you are binding the field to.
     * </p>
     * 
     * @return The axis that you are binding the field to.
     * @see AxisBinding
     */

    public String getAxisBinding() {
        return this.axisBinding;
    }

    /**
     * <p>
     * The axis that you are binding the field to.
     * </p>
     * 
     * @param axisBinding
     *        The axis that you are binding the field to.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AxisBinding
     */

    public FieldSeriesItem withAxisBinding(String axisBinding) {
        setAxisBinding(axisBinding);
        return this;
    }

    /**
     * <p>
     * The axis that you are binding the field to.
     * </p>
     * 
     * @param axisBinding
     *        The axis that you are binding the field to.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AxisBinding
     */

    public FieldSeriesItem withAxisBinding(AxisBinding axisBinding) {
        this.axisBinding = axisBinding.toString();
        return this;
    }

    /**
     * <p>
     * The options that determine the presentation of line series associated to the field.
     * </p>
     * 
     * @param settings
     *        The options that determine the presentation of line series associated to the field.
     */

    public void setSettings(LineChartSeriesSettings settings) {
        this.settings = settings;
    }

    /**
     * <p>
     * The options that determine the presentation of line series associated to the field.
     * </p>
     * 
     * @return The options that determine the presentation of line series associated to the field.
     */

    public LineChartSeriesSettings getSettings() {
        return this.settings;
    }

    /**
     * <p>
     * The options that determine the presentation of line series associated to the field.
     * </p>
     * 
     * @param settings
     *        The options that determine the presentation of line series associated to the field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FieldSeriesItem withSettings(LineChartSeriesSettings settings) {
        setSettings(settings);
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
        if (getFieldId() != null)
            sb.append("FieldId: ").append(getFieldId()).append(",");
        if (getAxisBinding() != null)
            sb.append("AxisBinding: ").append(getAxisBinding()).append(",");
        if (getSettings() != null)
            sb.append("Settings: ").append(getSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FieldSeriesItem == false)
            return false;
        FieldSeriesItem other = (FieldSeriesItem) obj;
        if (other.getFieldId() == null ^ this.getFieldId() == null)
            return false;
        if (other.getFieldId() != null && other.getFieldId().equals(this.getFieldId()) == false)
            return false;
        if (other.getAxisBinding() == null ^ this.getAxisBinding() == null)
            return false;
        if (other.getAxisBinding() != null && other.getAxisBinding().equals(this.getAxisBinding()) == false)
            return false;
        if (other.getSettings() == null ^ this.getSettings() == null)
            return false;
        if (other.getSettings() != null && other.getSettings().equals(this.getSettings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFieldId() == null) ? 0 : getFieldId().hashCode());
        hashCode = prime * hashCode + ((getAxisBinding() == null) ? 0 : getAxisBinding().hashCode());
        hashCode = prime * hashCode + ((getSettings() == null) ? 0 : getSettings().hashCode());
        return hashCode;
    }

    @Override
    public FieldSeriesItem clone() {
        try {
            return (FieldSeriesItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.FieldSeriesItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
