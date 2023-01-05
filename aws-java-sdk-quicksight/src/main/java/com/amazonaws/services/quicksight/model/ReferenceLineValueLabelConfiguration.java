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
 * The value label configuration of the label in a reference line.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ReferenceLineValueLabelConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReferenceLineValueLabelConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The relative position of the value label. Choose one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>BEFORE_CUSTOM_LABEL</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AFTER_CUSTOM_LABEL</code>
     * </p>
     * </li>
     * </ul>
     */
    private String relativePosition;
    /**
     * <p>
     * The format configuration of the value label.
     * </p>
     */
    private NumericFormatConfiguration formatConfiguration;

    /**
     * <p>
     * The relative position of the value label. Choose one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>BEFORE_CUSTOM_LABEL</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AFTER_CUSTOM_LABEL</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param relativePosition
     *        The relative position of the value label. Choose one of the following options:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>BEFORE_CUSTOM_LABEL</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AFTER_CUSTOM_LABEL</code>
     *        </p>
     *        </li>
     * @see ReferenceLineValueLabelRelativePosition
     */

    public void setRelativePosition(String relativePosition) {
        this.relativePosition = relativePosition;
    }

    /**
     * <p>
     * The relative position of the value label. Choose one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>BEFORE_CUSTOM_LABEL</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AFTER_CUSTOM_LABEL</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The relative position of the value label. Choose one of the following options:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>BEFORE_CUSTOM_LABEL</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AFTER_CUSTOM_LABEL</code>
     *         </p>
     *         </li>
     * @see ReferenceLineValueLabelRelativePosition
     */

    public String getRelativePosition() {
        return this.relativePosition;
    }

    /**
     * <p>
     * The relative position of the value label. Choose one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>BEFORE_CUSTOM_LABEL</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AFTER_CUSTOM_LABEL</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param relativePosition
     *        The relative position of the value label. Choose one of the following options:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>BEFORE_CUSTOM_LABEL</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AFTER_CUSTOM_LABEL</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReferenceLineValueLabelRelativePosition
     */

    public ReferenceLineValueLabelConfiguration withRelativePosition(String relativePosition) {
        setRelativePosition(relativePosition);
        return this;
    }

    /**
     * <p>
     * The relative position of the value label. Choose one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>BEFORE_CUSTOM_LABEL</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AFTER_CUSTOM_LABEL</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param relativePosition
     *        The relative position of the value label. Choose one of the following options:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>BEFORE_CUSTOM_LABEL</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AFTER_CUSTOM_LABEL</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReferenceLineValueLabelRelativePosition
     */

    public ReferenceLineValueLabelConfiguration withRelativePosition(ReferenceLineValueLabelRelativePosition relativePosition) {
        this.relativePosition = relativePosition.toString();
        return this;
    }

    /**
     * <p>
     * The format configuration of the value label.
     * </p>
     * 
     * @param formatConfiguration
     *        The format configuration of the value label.
     */

    public void setFormatConfiguration(NumericFormatConfiguration formatConfiguration) {
        this.formatConfiguration = formatConfiguration;
    }

    /**
     * <p>
     * The format configuration of the value label.
     * </p>
     * 
     * @return The format configuration of the value label.
     */

    public NumericFormatConfiguration getFormatConfiguration() {
        return this.formatConfiguration;
    }

    /**
     * <p>
     * The format configuration of the value label.
     * </p>
     * 
     * @param formatConfiguration
     *        The format configuration of the value label.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReferenceLineValueLabelConfiguration withFormatConfiguration(NumericFormatConfiguration formatConfiguration) {
        setFormatConfiguration(formatConfiguration);
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
        if (getRelativePosition() != null)
            sb.append("RelativePosition: ").append(getRelativePosition()).append(",");
        if (getFormatConfiguration() != null)
            sb.append("FormatConfiguration: ").append(getFormatConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReferenceLineValueLabelConfiguration == false)
            return false;
        ReferenceLineValueLabelConfiguration other = (ReferenceLineValueLabelConfiguration) obj;
        if (other.getRelativePosition() == null ^ this.getRelativePosition() == null)
            return false;
        if (other.getRelativePosition() != null && other.getRelativePosition().equals(this.getRelativePosition()) == false)
            return false;
        if (other.getFormatConfiguration() == null ^ this.getFormatConfiguration() == null)
            return false;
        if (other.getFormatConfiguration() != null && other.getFormatConfiguration().equals(this.getFormatConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRelativePosition() == null) ? 0 : getRelativePosition().hashCode());
        hashCode = prime * hashCode + ((getFormatConfiguration() == null) ? 0 : getFormatConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public ReferenceLineValueLabelConfiguration clone() {
        try {
            return (ReferenceLineValueLabelConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.ReferenceLineValueLabelConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
