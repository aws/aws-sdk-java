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
 * The options for a table field.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/TableFieldOption" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TableFieldOption implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The field ID for a table field.
     * </p>
     */
    private String fieldId;
    /**
     * <p>
     * The width for a table field.
     * </p>
     */
    private String width;
    /**
     * <p>
     * The custom label for a table field.
     * </p>
     */
    private String customLabel;
    /**
     * <p>
     * The visibility of a table field.
     * </p>
     */
    private String visibility;
    /**
     * <p>
     * The URL configuration for a table field.
     * </p>
     */
    private TableFieldURLConfiguration uRLStyling;

    /**
     * <p>
     * The field ID for a table field.
     * </p>
     * 
     * @param fieldId
     *        The field ID for a table field.
     */

    public void setFieldId(String fieldId) {
        this.fieldId = fieldId;
    }

    /**
     * <p>
     * The field ID for a table field.
     * </p>
     * 
     * @return The field ID for a table field.
     */

    public String getFieldId() {
        return this.fieldId;
    }

    /**
     * <p>
     * The field ID for a table field.
     * </p>
     * 
     * @param fieldId
     *        The field ID for a table field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableFieldOption withFieldId(String fieldId) {
        setFieldId(fieldId);
        return this;
    }

    /**
     * <p>
     * The width for a table field.
     * </p>
     * 
     * @param width
     *        The width for a table field.
     */

    public void setWidth(String width) {
        this.width = width;
    }

    /**
     * <p>
     * The width for a table field.
     * </p>
     * 
     * @return The width for a table field.
     */

    public String getWidth() {
        return this.width;
    }

    /**
     * <p>
     * The width for a table field.
     * </p>
     * 
     * @param width
     *        The width for a table field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableFieldOption withWidth(String width) {
        setWidth(width);
        return this;
    }

    /**
     * <p>
     * The custom label for a table field.
     * </p>
     * 
     * @param customLabel
     *        The custom label for a table field.
     */

    public void setCustomLabel(String customLabel) {
        this.customLabel = customLabel;
    }

    /**
     * <p>
     * The custom label for a table field.
     * </p>
     * 
     * @return The custom label for a table field.
     */

    public String getCustomLabel() {
        return this.customLabel;
    }

    /**
     * <p>
     * The custom label for a table field.
     * </p>
     * 
     * @param customLabel
     *        The custom label for a table field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableFieldOption withCustomLabel(String customLabel) {
        setCustomLabel(customLabel);
        return this;
    }

    /**
     * <p>
     * The visibility of a table field.
     * </p>
     * 
     * @param visibility
     *        The visibility of a table field.
     * @see Visibility
     */

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    /**
     * <p>
     * The visibility of a table field.
     * </p>
     * 
     * @return The visibility of a table field.
     * @see Visibility
     */

    public String getVisibility() {
        return this.visibility;
    }

    /**
     * <p>
     * The visibility of a table field.
     * </p>
     * 
     * @param visibility
     *        The visibility of a table field.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Visibility
     */

    public TableFieldOption withVisibility(String visibility) {
        setVisibility(visibility);
        return this;
    }

    /**
     * <p>
     * The visibility of a table field.
     * </p>
     * 
     * @param visibility
     *        The visibility of a table field.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Visibility
     */

    public TableFieldOption withVisibility(Visibility visibility) {
        this.visibility = visibility.toString();
        return this;
    }

    /**
     * <p>
     * The URL configuration for a table field.
     * </p>
     * 
     * @param uRLStyling
     *        The URL configuration for a table field.
     */

    public void setURLStyling(TableFieldURLConfiguration uRLStyling) {
        this.uRLStyling = uRLStyling;
    }

    /**
     * <p>
     * The URL configuration for a table field.
     * </p>
     * 
     * @return The URL configuration for a table field.
     */

    public TableFieldURLConfiguration getURLStyling() {
        return this.uRLStyling;
    }

    /**
     * <p>
     * The URL configuration for a table field.
     * </p>
     * 
     * @param uRLStyling
     *        The URL configuration for a table field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableFieldOption withURLStyling(TableFieldURLConfiguration uRLStyling) {
        setURLStyling(uRLStyling);
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
        if (getFieldId() != null)
            sb.append("FieldId: ").append(getFieldId()).append(",");
        if (getWidth() != null)
            sb.append("Width: ").append(getWidth()).append(",");
        if (getCustomLabel() != null)
            sb.append("CustomLabel: ").append(getCustomLabel()).append(",");
        if (getVisibility() != null)
            sb.append("Visibility: ").append(getVisibility()).append(",");
        if (getURLStyling() != null)
            sb.append("URLStyling: ").append(getURLStyling());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TableFieldOption == false)
            return false;
        TableFieldOption other = (TableFieldOption) obj;
        if (other.getFieldId() == null ^ this.getFieldId() == null)
            return false;
        if (other.getFieldId() != null && other.getFieldId().equals(this.getFieldId()) == false)
            return false;
        if (other.getWidth() == null ^ this.getWidth() == null)
            return false;
        if (other.getWidth() != null && other.getWidth().equals(this.getWidth()) == false)
            return false;
        if (other.getCustomLabel() == null ^ this.getCustomLabel() == null)
            return false;
        if (other.getCustomLabel() != null && other.getCustomLabel().equals(this.getCustomLabel()) == false)
            return false;
        if (other.getVisibility() == null ^ this.getVisibility() == null)
            return false;
        if (other.getVisibility() != null && other.getVisibility().equals(this.getVisibility()) == false)
            return false;
        if (other.getURLStyling() == null ^ this.getURLStyling() == null)
            return false;
        if (other.getURLStyling() != null && other.getURLStyling().equals(this.getURLStyling()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFieldId() == null) ? 0 : getFieldId().hashCode());
        hashCode = prime * hashCode + ((getWidth() == null) ? 0 : getWidth().hashCode());
        hashCode = prime * hashCode + ((getCustomLabel() == null) ? 0 : getCustomLabel().hashCode());
        hashCode = prime * hashCode + ((getVisibility() == null) ? 0 : getVisibility().hashCode());
        hashCode = prime * hashCode + ((getURLStyling() == null) ? 0 : getURLStyling().hashCode());
        return hashCode;
    }

    @Override
    public TableFieldOption clone() {
        try {
            return (TableFieldOption) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.TableFieldOptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
