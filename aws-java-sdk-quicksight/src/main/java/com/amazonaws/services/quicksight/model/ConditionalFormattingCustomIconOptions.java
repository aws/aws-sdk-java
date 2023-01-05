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
 * Custom icon options for an icon set.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ConditionalFormattingCustomIconOptions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConditionalFormattingCustomIconOptions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Determines the type of icon.
     * </p>
     */
    private String icon;
    /**
     * <p>
     * Determines the Unicode icon type.
     * </p>
     */
    private String unicodeIcon;

    /**
     * <p>
     * Determines the type of icon.
     * </p>
     * 
     * @param icon
     *        Determines the type of icon.
     * @see Icon
     */

    public void setIcon(String icon) {
        this.icon = icon;
    }

    /**
     * <p>
     * Determines the type of icon.
     * </p>
     * 
     * @return Determines the type of icon.
     * @see Icon
     */

    public String getIcon() {
        return this.icon;
    }

    /**
     * <p>
     * Determines the type of icon.
     * </p>
     * 
     * @param icon
     *        Determines the type of icon.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Icon
     */

    public ConditionalFormattingCustomIconOptions withIcon(String icon) {
        setIcon(icon);
        return this;
    }

    /**
     * <p>
     * Determines the type of icon.
     * </p>
     * 
     * @param icon
     *        Determines the type of icon.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Icon
     */

    public ConditionalFormattingCustomIconOptions withIcon(Icon icon) {
        this.icon = icon.toString();
        return this;
    }

    /**
     * <p>
     * Determines the Unicode icon type.
     * </p>
     * 
     * @param unicodeIcon
     *        Determines the Unicode icon type.
     */

    public void setUnicodeIcon(String unicodeIcon) {
        this.unicodeIcon = unicodeIcon;
    }

    /**
     * <p>
     * Determines the Unicode icon type.
     * </p>
     * 
     * @return Determines the Unicode icon type.
     */

    public String getUnicodeIcon() {
        return this.unicodeIcon;
    }

    /**
     * <p>
     * Determines the Unicode icon type.
     * </p>
     * 
     * @param unicodeIcon
     *        Determines the Unicode icon type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConditionalFormattingCustomIconOptions withUnicodeIcon(String unicodeIcon) {
        setUnicodeIcon(unicodeIcon);
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
        if (getIcon() != null)
            sb.append("Icon: ").append(getIcon()).append(",");
        if (getUnicodeIcon() != null)
            sb.append("UnicodeIcon: ").append(getUnicodeIcon());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConditionalFormattingCustomIconOptions == false)
            return false;
        ConditionalFormattingCustomIconOptions other = (ConditionalFormattingCustomIconOptions) obj;
        if (other.getIcon() == null ^ this.getIcon() == null)
            return false;
        if (other.getIcon() != null && other.getIcon().equals(this.getIcon()) == false)
            return false;
        if (other.getUnicodeIcon() == null ^ this.getUnicodeIcon() == null)
            return false;
        if (other.getUnicodeIcon() != null && other.getUnicodeIcon().equals(this.getUnicodeIcon()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIcon() == null) ? 0 : getIcon().hashCode());
        hashCode = prime * hashCode + ((getUnicodeIcon() == null) ? 0 : getUnicodeIcon().hashCode());
        return hashCode;
    }

    @Override
    public ConditionalFormattingCustomIconOptions clone() {
        try {
            return (ConditionalFormattingCustomIconOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.ConditionalFormattingCustomIconOptionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
