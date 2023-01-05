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
 * The custom icon content for the table link content configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/TableFieldCustomIconContent"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TableFieldCustomIconContent implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The icon set type (link) of the custom icon content for table URL link content.
     * </p>
     */
    private String icon;

    /**
     * <p>
     * The icon set type (link) of the custom icon content for table URL link content.
     * </p>
     * 
     * @param icon
     *        The icon set type (link) of the custom icon content for table URL link content.
     * @see TableFieldIconSetType
     */

    public void setIcon(String icon) {
        this.icon = icon;
    }

    /**
     * <p>
     * The icon set type (link) of the custom icon content for table URL link content.
     * </p>
     * 
     * @return The icon set type (link) of the custom icon content for table URL link content.
     * @see TableFieldIconSetType
     */

    public String getIcon() {
        return this.icon;
    }

    /**
     * <p>
     * The icon set type (link) of the custom icon content for table URL link content.
     * </p>
     * 
     * @param icon
     *        The icon set type (link) of the custom icon content for table URL link content.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TableFieldIconSetType
     */

    public TableFieldCustomIconContent withIcon(String icon) {
        setIcon(icon);
        return this;
    }

    /**
     * <p>
     * The icon set type (link) of the custom icon content for table URL link content.
     * </p>
     * 
     * @param icon
     *        The icon set type (link) of the custom icon content for table URL link content.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TableFieldIconSetType
     */

    public TableFieldCustomIconContent withIcon(TableFieldIconSetType icon) {
        this.icon = icon.toString();
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
            sb.append("Icon: ").append(getIcon());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TableFieldCustomIconContent == false)
            return false;
        TableFieldCustomIconContent other = (TableFieldCustomIconContent) obj;
        if (other.getIcon() == null ^ this.getIcon() == null)
            return false;
        if (other.getIcon() != null && other.getIcon().equals(this.getIcon()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIcon() == null) ? 0 : getIcon().hashCode());
        return hashCode;
    }

    @Override
    public TableFieldCustomIconContent clone() {
        try {
            return (TableFieldCustomIconContent) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.TableFieldCustomIconContentMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
