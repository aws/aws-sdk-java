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
 * Determines the icon display configuration.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ConditionalFormattingIconDisplayConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConditionalFormattingIconDisplayConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Determines the icon display configuration.
     * </p>
     */
    private String iconDisplayOption;

    /**
     * <p>
     * Determines the icon display configuration.
     * </p>
     * 
     * @param iconDisplayOption
     *        Determines the icon display configuration.
     * @see ConditionalFormattingIconDisplayOption
     */

    public void setIconDisplayOption(String iconDisplayOption) {
        this.iconDisplayOption = iconDisplayOption;
    }

    /**
     * <p>
     * Determines the icon display configuration.
     * </p>
     * 
     * @return Determines the icon display configuration.
     * @see ConditionalFormattingIconDisplayOption
     */

    public String getIconDisplayOption() {
        return this.iconDisplayOption;
    }

    /**
     * <p>
     * Determines the icon display configuration.
     * </p>
     * 
     * @param iconDisplayOption
     *        Determines the icon display configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConditionalFormattingIconDisplayOption
     */

    public ConditionalFormattingIconDisplayConfiguration withIconDisplayOption(String iconDisplayOption) {
        setIconDisplayOption(iconDisplayOption);
        return this;
    }

    /**
     * <p>
     * Determines the icon display configuration.
     * </p>
     * 
     * @param iconDisplayOption
     *        Determines the icon display configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConditionalFormattingIconDisplayOption
     */

    public ConditionalFormattingIconDisplayConfiguration withIconDisplayOption(ConditionalFormattingIconDisplayOption iconDisplayOption) {
        this.iconDisplayOption = iconDisplayOption.toString();
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
        if (getIconDisplayOption() != null)
            sb.append("IconDisplayOption: ").append(getIconDisplayOption());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConditionalFormattingIconDisplayConfiguration == false)
            return false;
        ConditionalFormattingIconDisplayConfiguration other = (ConditionalFormattingIconDisplayConfiguration) obj;
        if (other.getIconDisplayOption() == null ^ this.getIconDisplayOption() == null)
            return false;
        if (other.getIconDisplayOption() != null && other.getIconDisplayOption().equals(this.getIconDisplayOption()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIconDisplayOption() == null) ? 0 : getIconDisplayOption().hashCode());
        return hashCode;
    }

    @Override
    public ConditionalFormattingIconDisplayConfiguration clone() {
        try {
            return (ConditionalFormattingIconDisplayConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.ConditionalFormattingIconDisplayConfigurationMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
