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
 * The formatting configuration for the icon.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ConditionalFormattingIcon"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConditionalFormattingIcon implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Formatting configuration for icon set.
     * </p>
     */
    private ConditionalFormattingIconSet iconSet;
    /**
     * <p>
     * Determines the custom condition for an icon set.
     * </p>
     */
    private ConditionalFormattingCustomIconCondition customCondition;

    /**
     * <p>
     * Formatting configuration for icon set.
     * </p>
     * 
     * @param iconSet
     *        Formatting configuration for icon set.
     */

    public void setIconSet(ConditionalFormattingIconSet iconSet) {
        this.iconSet = iconSet;
    }

    /**
     * <p>
     * Formatting configuration for icon set.
     * </p>
     * 
     * @return Formatting configuration for icon set.
     */

    public ConditionalFormattingIconSet getIconSet() {
        return this.iconSet;
    }

    /**
     * <p>
     * Formatting configuration for icon set.
     * </p>
     * 
     * @param iconSet
     *        Formatting configuration for icon set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConditionalFormattingIcon withIconSet(ConditionalFormattingIconSet iconSet) {
        setIconSet(iconSet);
        return this;
    }

    /**
     * <p>
     * Determines the custom condition for an icon set.
     * </p>
     * 
     * @param customCondition
     *        Determines the custom condition for an icon set.
     */

    public void setCustomCondition(ConditionalFormattingCustomIconCondition customCondition) {
        this.customCondition = customCondition;
    }

    /**
     * <p>
     * Determines the custom condition for an icon set.
     * </p>
     * 
     * @return Determines the custom condition for an icon set.
     */

    public ConditionalFormattingCustomIconCondition getCustomCondition() {
        return this.customCondition;
    }

    /**
     * <p>
     * Determines the custom condition for an icon set.
     * </p>
     * 
     * @param customCondition
     *        Determines the custom condition for an icon set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConditionalFormattingIcon withCustomCondition(ConditionalFormattingCustomIconCondition customCondition) {
        setCustomCondition(customCondition);
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
        if (getIconSet() != null)
            sb.append("IconSet: ").append(getIconSet()).append(",");
        if (getCustomCondition() != null)
            sb.append("CustomCondition: ").append(getCustomCondition());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConditionalFormattingIcon == false)
            return false;
        ConditionalFormattingIcon other = (ConditionalFormattingIcon) obj;
        if (other.getIconSet() == null ^ this.getIconSet() == null)
            return false;
        if (other.getIconSet() != null && other.getIconSet().equals(this.getIconSet()) == false)
            return false;
        if (other.getCustomCondition() == null ^ this.getCustomCondition() == null)
            return false;
        if (other.getCustomCondition() != null && other.getCustomCondition().equals(this.getCustomCondition()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIconSet() == null) ? 0 : getIconSet().hashCode());
        hashCode = prime * hashCode + ((getCustomCondition() == null) ? 0 : getCustomCondition().hashCode());
        return hashCode;
    }

    @Override
    public ConditionalFormattingIcon clone() {
        try {
            return (ConditionalFormattingIcon) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.ConditionalFormattingIconMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
