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
 * The Amazon QuickSight customizations associated with your Amazon Web Services account or a QuickSight namespace in a
 * specific Amazon Web Services Region.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/AccountCustomization" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AccountCustomization implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The default theme for this Amazon QuickSight subscription.
     * </p>
     */
    private String defaultTheme;
    /**
     * <p>
     * The default email customization template.
     * </p>
     */
    private String defaultEmailCustomizationTemplate;

    /**
     * <p>
     * The default theme for this Amazon QuickSight subscription.
     * </p>
     * 
     * @param defaultTheme
     *        The default theme for this Amazon QuickSight subscription.
     */

    public void setDefaultTheme(String defaultTheme) {
        this.defaultTheme = defaultTheme;
    }

    /**
     * <p>
     * The default theme for this Amazon QuickSight subscription.
     * </p>
     * 
     * @return The default theme for this Amazon QuickSight subscription.
     */

    public String getDefaultTheme() {
        return this.defaultTheme;
    }

    /**
     * <p>
     * The default theme for this Amazon QuickSight subscription.
     * </p>
     * 
     * @param defaultTheme
     *        The default theme for this Amazon QuickSight subscription.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccountCustomization withDefaultTheme(String defaultTheme) {
        setDefaultTheme(defaultTheme);
        return this;
    }

    /**
     * <p>
     * The default email customization template.
     * </p>
     * 
     * @param defaultEmailCustomizationTemplate
     *        The default email customization template.
     */

    public void setDefaultEmailCustomizationTemplate(String defaultEmailCustomizationTemplate) {
        this.defaultEmailCustomizationTemplate = defaultEmailCustomizationTemplate;
    }

    /**
     * <p>
     * The default email customization template.
     * </p>
     * 
     * @return The default email customization template.
     */

    public String getDefaultEmailCustomizationTemplate() {
        return this.defaultEmailCustomizationTemplate;
    }

    /**
     * <p>
     * The default email customization template.
     * </p>
     * 
     * @param defaultEmailCustomizationTemplate
     *        The default email customization template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccountCustomization withDefaultEmailCustomizationTemplate(String defaultEmailCustomizationTemplate) {
        setDefaultEmailCustomizationTemplate(defaultEmailCustomizationTemplate);
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
        if (getDefaultTheme() != null)
            sb.append("DefaultTheme: ").append(getDefaultTheme()).append(",");
        if (getDefaultEmailCustomizationTemplate() != null)
            sb.append("DefaultEmailCustomizationTemplate: ").append(getDefaultEmailCustomizationTemplate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AccountCustomization == false)
            return false;
        AccountCustomization other = (AccountCustomization) obj;
        if (other.getDefaultTheme() == null ^ this.getDefaultTheme() == null)
            return false;
        if (other.getDefaultTheme() != null && other.getDefaultTheme().equals(this.getDefaultTheme()) == false)
            return false;
        if (other.getDefaultEmailCustomizationTemplate() == null ^ this.getDefaultEmailCustomizationTemplate() == null)
            return false;
        if (other.getDefaultEmailCustomizationTemplate() != null
                && other.getDefaultEmailCustomizationTemplate().equals(this.getDefaultEmailCustomizationTemplate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDefaultTheme() == null) ? 0 : getDefaultTheme().hashCode());
        hashCode = prime * hashCode + ((getDefaultEmailCustomizationTemplate() == null) ? 0 : getDefaultEmailCustomizationTemplate().hashCode());
        return hashCode;
    }

    @Override
    public AccountCustomization clone() {
        try {
            return (AccountCustomization) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.AccountCustomizationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
