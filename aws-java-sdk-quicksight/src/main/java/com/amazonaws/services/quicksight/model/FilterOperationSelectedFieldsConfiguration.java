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
 * The configuration of selected fields in the<code>CustomActionFilterOperation</code>.
 * </p>
 * <p>
 * This is a union type structure. For this structure to be valid, only one of the attributes can be defined.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/FilterOperationSelectedFieldsConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FilterOperationSelectedFieldsConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Chooses the fields that are filtered in <code>CustomActionFilterOperation</code>.
     * </p>
     */
    private java.util.List<String> selectedFields;
    /**
     * <p>
     * A structure that contains the options that choose which fields are filtered in the
     * <code>CustomActionFilterOperation</code>.
     * </p>
     * <p>
     * Valid values are defined as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALL_FIELDS</code>: Applies the filter operation to all fields.
     * </p>
     * </li>
     * </ul>
     */
    private String selectedFieldOptions;

    /**
     * <p>
     * Chooses the fields that are filtered in <code>CustomActionFilterOperation</code>.
     * </p>
     * 
     * @return Chooses the fields that are filtered in <code>CustomActionFilterOperation</code>.
     */

    public java.util.List<String> getSelectedFields() {
        return selectedFields;
    }

    /**
     * <p>
     * Chooses the fields that are filtered in <code>CustomActionFilterOperation</code>.
     * </p>
     * 
     * @param selectedFields
     *        Chooses the fields that are filtered in <code>CustomActionFilterOperation</code>.
     */

    public void setSelectedFields(java.util.Collection<String> selectedFields) {
        if (selectedFields == null) {
            this.selectedFields = null;
            return;
        }

        this.selectedFields = new java.util.ArrayList<String>(selectedFields);
    }

    /**
     * <p>
     * Chooses the fields that are filtered in <code>CustomActionFilterOperation</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSelectedFields(java.util.Collection)} or {@link #withSelectedFields(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param selectedFields
     *        Chooses the fields that are filtered in <code>CustomActionFilterOperation</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterOperationSelectedFieldsConfiguration withSelectedFields(String... selectedFields) {
        if (this.selectedFields == null) {
            setSelectedFields(new java.util.ArrayList<String>(selectedFields.length));
        }
        for (String ele : selectedFields) {
            this.selectedFields.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Chooses the fields that are filtered in <code>CustomActionFilterOperation</code>.
     * </p>
     * 
     * @param selectedFields
     *        Chooses the fields that are filtered in <code>CustomActionFilterOperation</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterOperationSelectedFieldsConfiguration withSelectedFields(java.util.Collection<String> selectedFields) {
        setSelectedFields(selectedFields);
        return this;
    }

    /**
     * <p>
     * A structure that contains the options that choose which fields are filtered in the
     * <code>CustomActionFilterOperation</code>.
     * </p>
     * <p>
     * Valid values are defined as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALL_FIELDS</code>: Applies the filter operation to all fields.
     * </p>
     * </li>
     * </ul>
     * 
     * @param selectedFieldOptions
     *        A structure that contains the options that choose which fields are filtered in the
     *        <code>CustomActionFilterOperation</code>.</p>
     *        <p>
     *        Valid values are defined as follows:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ALL_FIELDS</code>: Applies the filter operation to all fields.
     *        </p>
     *        </li>
     * @see SelectedFieldOptions
     */

    public void setSelectedFieldOptions(String selectedFieldOptions) {
        this.selectedFieldOptions = selectedFieldOptions;
    }

    /**
     * <p>
     * A structure that contains the options that choose which fields are filtered in the
     * <code>CustomActionFilterOperation</code>.
     * </p>
     * <p>
     * Valid values are defined as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALL_FIELDS</code>: Applies the filter operation to all fields.
     * </p>
     * </li>
     * </ul>
     * 
     * @return A structure that contains the options that choose which fields are filtered in the
     *         <code>CustomActionFilterOperation</code>.</p>
     *         <p>
     *         Valid values are defined as follows:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ALL_FIELDS</code>: Applies the filter operation to all fields.
     *         </p>
     *         </li>
     * @see SelectedFieldOptions
     */

    public String getSelectedFieldOptions() {
        return this.selectedFieldOptions;
    }

    /**
     * <p>
     * A structure that contains the options that choose which fields are filtered in the
     * <code>CustomActionFilterOperation</code>.
     * </p>
     * <p>
     * Valid values are defined as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALL_FIELDS</code>: Applies the filter operation to all fields.
     * </p>
     * </li>
     * </ul>
     * 
     * @param selectedFieldOptions
     *        A structure that contains the options that choose which fields are filtered in the
     *        <code>CustomActionFilterOperation</code>.</p>
     *        <p>
     *        Valid values are defined as follows:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ALL_FIELDS</code>: Applies the filter operation to all fields.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SelectedFieldOptions
     */

    public FilterOperationSelectedFieldsConfiguration withSelectedFieldOptions(String selectedFieldOptions) {
        setSelectedFieldOptions(selectedFieldOptions);
        return this;
    }

    /**
     * <p>
     * A structure that contains the options that choose which fields are filtered in the
     * <code>CustomActionFilterOperation</code>.
     * </p>
     * <p>
     * Valid values are defined as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALL_FIELDS</code>: Applies the filter operation to all fields.
     * </p>
     * </li>
     * </ul>
     * 
     * @param selectedFieldOptions
     *        A structure that contains the options that choose which fields are filtered in the
     *        <code>CustomActionFilterOperation</code>.</p>
     *        <p>
     *        Valid values are defined as follows:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ALL_FIELDS</code>: Applies the filter operation to all fields.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SelectedFieldOptions
     */

    public FilterOperationSelectedFieldsConfiguration withSelectedFieldOptions(SelectedFieldOptions selectedFieldOptions) {
        this.selectedFieldOptions = selectedFieldOptions.toString();
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
        if (getSelectedFields() != null)
            sb.append("SelectedFields: ").append(getSelectedFields()).append(",");
        if (getSelectedFieldOptions() != null)
            sb.append("SelectedFieldOptions: ").append(getSelectedFieldOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FilterOperationSelectedFieldsConfiguration == false)
            return false;
        FilterOperationSelectedFieldsConfiguration other = (FilterOperationSelectedFieldsConfiguration) obj;
        if (other.getSelectedFields() == null ^ this.getSelectedFields() == null)
            return false;
        if (other.getSelectedFields() != null && other.getSelectedFields().equals(this.getSelectedFields()) == false)
            return false;
        if (other.getSelectedFieldOptions() == null ^ this.getSelectedFieldOptions() == null)
            return false;
        if (other.getSelectedFieldOptions() != null && other.getSelectedFieldOptions().equals(this.getSelectedFieldOptions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSelectedFields() == null) ? 0 : getSelectedFields().hashCode());
        hashCode = prime * hashCode + ((getSelectedFieldOptions() == null) ? 0 : getSelectedFieldOptions().hashCode());
        return hashCode;
    }

    @Override
    public FilterOperationSelectedFieldsConfiguration clone() {
        try {
            return (FilterOperationSelectedFieldsConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.FilterOperationSelectedFieldsConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
