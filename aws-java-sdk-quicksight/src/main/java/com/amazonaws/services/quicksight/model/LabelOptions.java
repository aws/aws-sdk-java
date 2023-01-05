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
 * The share label options for the labels.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/LabelOptions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LabelOptions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Determines whether or not the label is visible.
     * </p>
     */
    private String visibility;
    /**
     * <p>
     * The font configuration of the label.
     * </p>
     */
    private FontConfiguration fontConfiguration;
    /**
     * <p>
     * The text for the label.
     * </p>
     */
    private String customLabel;

    /**
     * <p>
     * Determines whether or not the label is visible.
     * </p>
     * 
     * @param visibility
     *        Determines whether or not the label is visible.
     * @see Visibility
     */

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    /**
     * <p>
     * Determines whether or not the label is visible.
     * </p>
     * 
     * @return Determines whether or not the label is visible.
     * @see Visibility
     */

    public String getVisibility() {
        return this.visibility;
    }

    /**
     * <p>
     * Determines whether or not the label is visible.
     * </p>
     * 
     * @param visibility
     *        Determines whether or not the label is visible.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Visibility
     */

    public LabelOptions withVisibility(String visibility) {
        setVisibility(visibility);
        return this;
    }

    /**
     * <p>
     * Determines whether or not the label is visible.
     * </p>
     * 
     * @param visibility
     *        Determines whether or not the label is visible.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Visibility
     */

    public LabelOptions withVisibility(Visibility visibility) {
        this.visibility = visibility.toString();
        return this;
    }

    /**
     * <p>
     * The font configuration of the label.
     * </p>
     * 
     * @param fontConfiguration
     *        The font configuration of the label.
     */

    public void setFontConfiguration(FontConfiguration fontConfiguration) {
        this.fontConfiguration = fontConfiguration;
    }

    /**
     * <p>
     * The font configuration of the label.
     * </p>
     * 
     * @return The font configuration of the label.
     */

    public FontConfiguration getFontConfiguration() {
        return this.fontConfiguration;
    }

    /**
     * <p>
     * The font configuration of the label.
     * </p>
     * 
     * @param fontConfiguration
     *        The font configuration of the label.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LabelOptions withFontConfiguration(FontConfiguration fontConfiguration) {
        setFontConfiguration(fontConfiguration);
        return this;
    }

    /**
     * <p>
     * The text for the label.
     * </p>
     * 
     * @param customLabel
     *        The text for the label.
     */

    public void setCustomLabel(String customLabel) {
        this.customLabel = customLabel;
    }

    /**
     * <p>
     * The text for the label.
     * </p>
     * 
     * @return The text for the label.
     */

    public String getCustomLabel() {
        return this.customLabel;
    }

    /**
     * <p>
     * The text for the label.
     * </p>
     * 
     * @param customLabel
     *        The text for the label.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LabelOptions withCustomLabel(String customLabel) {
        setCustomLabel(customLabel);
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
        if (getFontConfiguration() != null)
            sb.append("FontConfiguration: ").append(getFontConfiguration()).append(",");
        if (getCustomLabel() != null)
            sb.append("CustomLabel: ").append(getCustomLabel());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LabelOptions == false)
            return false;
        LabelOptions other = (LabelOptions) obj;
        if (other.getVisibility() == null ^ this.getVisibility() == null)
            return false;
        if (other.getVisibility() != null && other.getVisibility().equals(this.getVisibility()) == false)
            return false;
        if (other.getFontConfiguration() == null ^ this.getFontConfiguration() == null)
            return false;
        if (other.getFontConfiguration() != null && other.getFontConfiguration().equals(this.getFontConfiguration()) == false)
            return false;
        if (other.getCustomLabel() == null ^ this.getCustomLabel() == null)
            return false;
        if (other.getCustomLabel() != null && other.getCustomLabel().equals(this.getCustomLabel()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVisibility() == null) ? 0 : getVisibility().hashCode());
        hashCode = prime * hashCode + ((getFontConfiguration() == null) ? 0 : getFontConfiguration().hashCode());
        hashCode = prime * hashCode + ((getCustomLabel() == null) ? 0 : getCustomLabel().hashCode());
        return hashCode;
    }

    @Override
    public LabelOptions clone() {
        try {
            return (LabelOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.LabelOptionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
