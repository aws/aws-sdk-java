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
 * The title label options for a visual.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/VisualTitleLabelOptions" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VisualTitleLabelOptions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The visibility of the title label.
     * </p>
     */
    private String visibility;
    /**
     * <p>
     * The short text format of the title label, such as plain text or rich text.
     * </p>
     */
    private ShortFormatText formatText;

    /**
     * <p>
     * The visibility of the title label.
     * </p>
     * 
     * @param visibility
     *        The visibility of the title label.
     * @see Visibility
     */

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    /**
     * <p>
     * The visibility of the title label.
     * </p>
     * 
     * @return The visibility of the title label.
     * @see Visibility
     */

    public String getVisibility() {
        return this.visibility;
    }

    /**
     * <p>
     * The visibility of the title label.
     * </p>
     * 
     * @param visibility
     *        The visibility of the title label.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Visibility
     */

    public VisualTitleLabelOptions withVisibility(String visibility) {
        setVisibility(visibility);
        return this;
    }

    /**
     * <p>
     * The visibility of the title label.
     * </p>
     * 
     * @param visibility
     *        The visibility of the title label.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Visibility
     */

    public VisualTitleLabelOptions withVisibility(Visibility visibility) {
        this.visibility = visibility.toString();
        return this;
    }

    /**
     * <p>
     * The short text format of the title label, such as plain text or rich text.
     * </p>
     * 
     * @param formatText
     *        The short text format of the title label, such as plain text or rich text.
     */

    public void setFormatText(ShortFormatText formatText) {
        this.formatText = formatText;
    }

    /**
     * <p>
     * The short text format of the title label, such as plain text or rich text.
     * </p>
     * 
     * @return The short text format of the title label, such as plain text or rich text.
     */

    public ShortFormatText getFormatText() {
        return this.formatText;
    }

    /**
     * <p>
     * The short text format of the title label, such as plain text or rich text.
     * </p>
     * 
     * @param formatText
     *        The short text format of the title label, such as plain text or rich text.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VisualTitleLabelOptions withFormatText(ShortFormatText formatText) {
        setFormatText(formatText);
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
        if (getFormatText() != null)
            sb.append("FormatText: ").append(getFormatText());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VisualTitleLabelOptions == false)
            return false;
        VisualTitleLabelOptions other = (VisualTitleLabelOptions) obj;
        if (other.getVisibility() == null ^ this.getVisibility() == null)
            return false;
        if (other.getVisibility() != null && other.getVisibility().equals(this.getVisibility()) == false)
            return false;
        if (other.getFormatText() == null ^ this.getFormatText() == null)
            return false;
        if (other.getFormatText() != null && other.getFormatText().equals(this.getFormatText()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVisibility() == null) ? 0 : getVisibility().hashCode());
        hashCode = prime * hashCode + ((getFormatText() == null) ? 0 : getFormatText().hashCode());
        return hashCode;
    }

    @Override
    public VisualTitleLabelOptions clone() {
        try {
            return (VisualTitleLabelOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.VisualTitleLabelOptionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
