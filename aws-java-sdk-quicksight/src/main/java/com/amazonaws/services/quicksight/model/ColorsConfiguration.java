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
 * The color configurations for a column.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ColorsConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ColorsConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A list of up to 50 custom colors.
     * </p>
     */
    private java.util.List<CustomColor> customColors;

    /**
     * <p>
     * A list of up to 50 custom colors.
     * </p>
     * 
     * @return A list of up to 50 custom colors.
     */

    public java.util.List<CustomColor> getCustomColors() {
        return customColors;
    }

    /**
     * <p>
     * A list of up to 50 custom colors.
     * </p>
     * 
     * @param customColors
     *        A list of up to 50 custom colors.
     */

    public void setCustomColors(java.util.Collection<CustomColor> customColors) {
        if (customColors == null) {
            this.customColors = null;
            return;
        }

        this.customColors = new java.util.ArrayList<CustomColor>(customColors);
    }

    /**
     * <p>
     * A list of up to 50 custom colors.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCustomColors(java.util.Collection)} or {@link #withCustomColors(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param customColors
     *        A list of up to 50 custom colors.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ColorsConfiguration withCustomColors(CustomColor... customColors) {
        if (this.customColors == null) {
            setCustomColors(new java.util.ArrayList<CustomColor>(customColors.length));
        }
        for (CustomColor ele : customColors) {
            this.customColors.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of up to 50 custom colors.
     * </p>
     * 
     * @param customColors
     *        A list of up to 50 custom colors.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ColorsConfiguration withCustomColors(java.util.Collection<CustomColor> customColors) {
        setCustomColors(customColors);
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
        if (getCustomColors() != null)
            sb.append("CustomColors: ").append(getCustomColors());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ColorsConfiguration == false)
            return false;
        ColorsConfiguration other = (ColorsConfiguration) obj;
        if (other.getCustomColors() == null ^ this.getCustomColors() == null)
            return false;
        if (other.getCustomColors() != null && other.getCustomColors().equals(this.getCustomColors()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCustomColors() == null) ? 0 : getCustomColors().hashCode());
        return hashCode;
    }

    @Override
    public ColorsConfiguration clone() {
        try {
            return (ColorsConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.ColorsConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
