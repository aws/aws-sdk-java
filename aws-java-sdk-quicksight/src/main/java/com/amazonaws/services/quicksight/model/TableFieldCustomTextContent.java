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
 * The custom text content (value, font configuration) for the table link content configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/TableFieldCustomTextContent"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TableFieldCustomTextContent implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The string value of the custom text content for the table URL link content.
     * </p>
     */
    private String value;
    /**
     * <p>
     * The font configuration of the custom text content for the table URL link content.
     * </p>
     */
    private FontConfiguration fontConfiguration;

    /**
     * <p>
     * The string value of the custom text content for the table URL link content.
     * </p>
     * 
     * @param value
     *        The string value of the custom text content for the table URL link content.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The string value of the custom text content for the table URL link content.
     * </p>
     * 
     * @return The string value of the custom text content for the table URL link content.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The string value of the custom text content for the table URL link content.
     * </p>
     * 
     * @param value
     *        The string value of the custom text content for the table URL link content.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableFieldCustomTextContent withValue(String value) {
        setValue(value);
        return this;
    }

    /**
     * <p>
     * The font configuration of the custom text content for the table URL link content.
     * </p>
     * 
     * @param fontConfiguration
     *        The font configuration of the custom text content for the table URL link content.
     */

    public void setFontConfiguration(FontConfiguration fontConfiguration) {
        this.fontConfiguration = fontConfiguration;
    }

    /**
     * <p>
     * The font configuration of the custom text content for the table URL link content.
     * </p>
     * 
     * @return The font configuration of the custom text content for the table URL link content.
     */

    public FontConfiguration getFontConfiguration() {
        return this.fontConfiguration;
    }

    /**
     * <p>
     * The font configuration of the custom text content for the table URL link content.
     * </p>
     * 
     * @param fontConfiguration
     *        The font configuration of the custom text content for the table URL link content.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableFieldCustomTextContent withFontConfiguration(FontConfiguration fontConfiguration) {
        setFontConfiguration(fontConfiguration);
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
        if (getValue() != null)
            sb.append("Value: ").append(getValue()).append(",");
        if (getFontConfiguration() != null)
            sb.append("FontConfiguration: ").append(getFontConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TableFieldCustomTextContent == false)
            return false;
        TableFieldCustomTextContent other = (TableFieldCustomTextContent) obj;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getFontConfiguration() == null ^ this.getFontConfiguration() == null)
            return false;
        if (other.getFontConfiguration() != null && other.getFontConfiguration().equals(this.getFontConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getFontConfiguration() == null) ? 0 : getFontConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public TableFieldCustomTextContent clone() {
        try {
            return (TableFieldCustomTextContent) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.TableFieldCustomTextContentMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
