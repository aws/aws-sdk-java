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
 * The label options for a chart axis. You must specify the field that the label is targeted to.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/AxisLabelOptions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AxisLabelOptions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The font configuration of the axis label.
     * </p>
     */
    private FontConfiguration fontConfiguration;
    /**
     * <p>
     * The text for the axis label.
     * </p>
     */
    private String customLabel;
    /**
     * <p>
     * The options that indicate which field the label belongs to.
     * </p>
     */
    private AxisLabelReferenceOptions applyTo;

    /**
     * <p>
     * The font configuration of the axis label.
     * </p>
     * 
     * @param fontConfiguration
     *        The font configuration of the axis label.
     */

    public void setFontConfiguration(FontConfiguration fontConfiguration) {
        this.fontConfiguration = fontConfiguration;
    }

    /**
     * <p>
     * The font configuration of the axis label.
     * </p>
     * 
     * @return The font configuration of the axis label.
     */

    public FontConfiguration getFontConfiguration() {
        return this.fontConfiguration;
    }

    /**
     * <p>
     * The font configuration of the axis label.
     * </p>
     * 
     * @param fontConfiguration
     *        The font configuration of the axis label.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AxisLabelOptions withFontConfiguration(FontConfiguration fontConfiguration) {
        setFontConfiguration(fontConfiguration);
        return this;
    }

    /**
     * <p>
     * The text for the axis label.
     * </p>
     * 
     * @param customLabel
     *        The text for the axis label.
     */

    public void setCustomLabel(String customLabel) {
        this.customLabel = customLabel;
    }

    /**
     * <p>
     * The text for the axis label.
     * </p>
     * 
     * @return The text for the axis label.
     */

    public String getCustomLabel() {
        return this.customLabel;
    }

    /**
     * <p>
     * The text for the axis label.
     * </p>
     * 
     * @param customLabel
     *        The text for the axis label.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AxisLabelOptions withCustomLabel(String customLabel) {
        setCustomLabel(customLabel);
        return this;
    }

    /**
     * <p>
     * The options that indicate which field the label belongs to.
     * </p>
     * 
     * @param applyTo
     *        The options that indicate which field the label belongs to.
     */

    public void setApplyTo(AxisLabelReferenceOptions applyTo) {
        this.applyTo = applyTo;
    }

    /**
     * <p>
     * The options that indicate which field the label belongs to.
     * </p>
     * 
     * @return The options that indicate which field the label belongs to.
     */

    public AxisLabelReferenceOptions getApplyTo() {
        return this.applyTo;
    }

    /**
     * <p>
     * The options that indicate which field the label belongs to.
     * </p>
     * 
     * @param applyTo
     *        The options that indicate which field the label belongs to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AxisLabelOptions withApplyTo(AxisLabelReferenceOptions applyTo) {
        setApplyTo(applyTo);
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
        if (getFontConfiguration() != null)
            sb.append("FontConfiguration: ").append(getFontConfiguration()).append(",");
        if (getCustomLabel() != null)
            sb.append("CustomLabel: ").append(getCustomLabel()).append(",");
        if (getApplyTo() != null)
            sb.append("ApplyTo: ").append(getApplyTo());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AxisLabelOptions == false)
            return false;
        AxisLabelOptions other = (AxisLabelOptions) obj;
        if (other.getFontConfiguration() == null ^ this.getFontConfiguration() == null)
            return false;
        if (other.getFontConfiguration() != null && other.getFontConfiguration().equals(this.getFontConfiguration()) == false)
            return false;
        if (other.getCustomLabel() == null ^ this.getCustomLabel() == null)
            return false;
        if (other.getCustomLabel() != null && other.getCustomLabel().equals(this.getCustomLabel()) == false)
            return false;
        if (other.getApplyTo() == null ^ this.getApplyTo() == null)
            return false;
        if (other.getApplyTo() != null && other.getApplyTo().equals(this.getApplyTo()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFontConfiguration() == null) ? 0 : getFontConfiguration().hashCode());
        hashCode = prime * hashCode + ((getCustomLabel() == null) ? 0 : getCustomLabel().hashCode());
        hashCode = prime * hashCode + ((getApplyTo() == null) ? 0 : getApplyTo().hashCode());
        return hashCode;
    }

    @Override
    public AxisLabelOptions clone() {
        try {
            return (AxisLabelOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.AxisLabelOptionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
