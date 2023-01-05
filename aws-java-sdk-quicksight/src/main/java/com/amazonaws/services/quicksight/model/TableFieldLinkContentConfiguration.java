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
 * The URL content (text, icon) for the table link configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/TableFieldLinkContentConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TableFieldLinkContentConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The custom text content (value, font configuration) for the table link content configuration.
     * </p>
     */
    private TableFieldCustomTextContent customTextContent;
    /**
     * <p>
     * The custom icon content for the table link content configuration.
     * </p>
     */
    private TableFieldCustomIconContent customIconContent;

    /**
     * <p>
     * The custom text content (value, font configuration) for the table link content configuration.
     * </p>
     * 
     * @param customTextContent
     *        The custom text content (value, font configuration) for the table link content configuration.
     */

    public void setCustomTextContent(TableFieldCustomTextContent customTextContent) {
        this.customTextContent = customTextContent;
    }

    /**
     * <p>
     * The custom text content (value, font configuration) for the table link content configuration.
     * </p>
     * 
     * @return The custom text content (value, font configuration) for the table link content configuration.
     */

    public TableFieldCustomTextContent getCustomTextContent() {
        return this.customTextContent;
    }

    /**
     * <p>
     * The custom text content (value, font configuration) for the table link content configuration.
     * </p>
     * 
     * @param customTextContent
     *        The custom text content (value, font configuration) for the table link content configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableFieldLinkContentConfiguration withCustomTextContent(TableFieldCustomTextContent customTextContent) {
        setCustomTextContent(customTextContent);
        return this;
    }

    /**
     * <p>
     * The custom icon content for the table link content configuration.
     * </p>
     * 
     * @param customIconContent
     *        The custom icon content for the table link content configuration.
     */

    public void setCustomIconContent(TableFieldCustomIconContent customIconContent) {
        this.customIconContent = customIconContent;
    }

    /**
     * <p>
     * The custom icon content for the table link content configuration.
     * </p>
     * 
     * @return The custom icon content for the table link content configuration.
     */

    public TableFieldCustomIconContent getCustomIconContent() {
        return this.customIconContent;
    }

    /**
     * <p>
     * The custom icon content for the table link content configuration.
     * </p>
     * 
     * @param customIconContent
     *        The custom icon content for the table link content configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableFieldLinkContentConfiguration withCustomIconContent(TableFieldCustomIconContent customIconContent) {
        setCustomIconContent(customIconContent);
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
        if (getCustomTextContent() != null)
            sb.append("CustomTextContent: ").append(getCustomTextContent()).append(",");
        if (getCustomIconContent() != null)
            sb.append("CustomIconContent: ").append(getCustomIconContent());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TableFieldLinkContentConfiguration == false)
            return false;
        TableFieldLinkContentConfiguration other = (TableFieldLinkContentConfiguration) obj;
        if (other.getCustomTextContent() == null ^ this.getCustomTextContent() == null)
            return false;
        if (other.getCustomTextContent() != null && other.getCustomTextContent().equals(this.getCustomTextContent()) == false)
            return false;
        if (other.getCustomIconContent() == null ^ this.getCustomIconContent() == null)
            return false;
        if (other.getCustomIconContent() != null && other.getCustomIconContent().equals(this.getCustomIconContent()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCustomTextContent() == null) ? 0 : getCustomTextContent().hashCode());
        hashCode = prime * hashCode + ((getCustomIconContent() == null) ? 0 : getCustomIconContent().hashCode());
        return hashCode;
    }

    @Override
    public TableFieldLinkContentConfiguration clone() {
        try {
            return (TableFieldLinkContentConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.TableFieldLinkContentConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
