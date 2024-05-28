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
 * The default options that correspond to the <code>Dropdown</code> filter control type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DefaultFilterDropDownControlOptions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DefaultFilterDropDownControlOptions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The display options of a control.
     * </p>
     */
    private DropDownControlDisplayOptions displayOptions;
    /**
     * <p>
     * The type of the <code>FilterDropDownControl</code>. Choose one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>MULTI_SELECT</code>: The user can select multiple entries from a dropdown menu.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SINGLE_SELECT</code>: The user can select a single entry from a dropdown menu.
     * </p>
     * </li>
     * </ul>
     */
    private String type;
    /**
     * <p>
     * A list of selectable values that are used in a control.
     * </p>
     */
    private FilterSelectableValues selectableValues;

    /**
     * <p>
     * The display options of a control.
     * </p>
     * 
     * @param displayOptions
     *        The display options of a control.
     */

    public void setDisplayOptions(DropDownControlDisplayOptions displayOptions) {
        this.displayOptions = displayOptions;
    }

    /**
     * <p>
     * The display options of a control.
     * </p>
     * 
     * @return The display options of a control.
     */

    public DropDownControlDisplayOptions getDisplayOptions() {
        return this.displayOptions;
    }

    /**
     * <p>
     * The display options of a control.
     * </p>
     * 
     * @param displayOptions
     *        The display options of a control.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DefaultFilterDropDownControlOptions withDisplayOptions(DropDownControlDisplayOptions displayOptions) {
        setDisplayOptions(displayOptions);
        return this;
    }

    /**
     * <p>
     * The type of the <code>FilterDropDownControl</code>. Choose one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>MULTI_SELECT</code>: The user can select multiple entries from a dropdown menu.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SINGLE_SELECT</code>: The user can select a single entry from a dropdown menu.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The type of the <code>FilterDropDownControl</code>. Choose one of the following options:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>MULTI_SELECT</code>: The user can select multiple entries from a dropdown menu.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SINGLE_SELECT</code>: The user can select a single entry from a dropdown menu.
     *        </p>
     *        </li>
     * @see SheetControlListType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the <code>FilterDropDownControl</code>. Choose one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>MULTI_SELECT</code>: The user can select multiple entries from a dropdown menu.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SINGLE_SELECT</code>: The user can select a single entry from a dropdown menu.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The type of the <code>FilterDropDownControl</code>. Choose one of the following options:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>MULTI_SELECT</code>: The user can select multiple entries from a dropdown menu.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SINGLE_SELECT</code>: The user can select a single entry from a dropdown menu.
     *         </p>
     *         </li>
     * @see SheetControlListType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of the <code>FilterDropDownControl</code>. Choose one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>MULTI_SELECT</code>: The user can select multiple entries from a dropdown menu.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SINGLE_SELECT</code>: The user can select a single entry from a dropdown menu.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The type of the <code>FilterDropDownControl</code>. Choose one of the following options:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>MULTI_SELECT</code>: The user can select multiple entries from a dropdown menu.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SINGLE_SELECT</code>: The user can select a single entry from a dropdown menu.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SheetControlListType
     */

    public DefaultFilterDropDownControlOptions withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of the <code>FilterDropDownControl</code>. Choose one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>MULTI_SELECT</code>: The user can select multiple entries from a dropdown menu.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SINGLE_SELECT</code>: The user can select a single entry from a dropdown menu.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The type of the <code>FilterDropDownControl</code>. Choose one of the following options:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>MULTI_SELECT</code>: The user can select multiple entries from a dropdown menu.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SINGLE_SELECT</code>: The user can select a single entry from a dropdown menu.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SheetControlListType
     */

    public DefaultFilterDropDownControlOptions withType(SheetControlListType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * A list of selectable values that are used in a control.
     * </p>
     * 
     * @param selectableValues
     *        A list of selectable values that are used in a control.
     */

    public void setSelectableValues(FilterSelectableValues selectableValues) {
        this.selectableValues = selectableValues;
    }

    /**
     * <p>
     * A list of selectable values that are used in a control.
     * </p>
     * 
     * @return A list of selectable values that are used in a control.
     */

    public FilterSelectableValues getSelectableValues() {
        return this.selectableValues;
    }

    /**
     * <p>
     * A list of selectable values that are used in a control.
     * </p>
     * 
     * @param selectableValues
     *        A list of selectable values that are used in a control.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DefaultFilterDropDownControlOptions withSelectableValues(FilterSelectableValues selectableValues) {
        setSelectableValues(selectableValues);
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
        if (getDisplayOptions() != null)
            sb.append("DisplayOptions: ").append(getDisplayOptions()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getSelectableValues() != null)
            sb.append("SelectableValues: ").append(getSelectableValues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DefaultFilterDropDownControlOptions == false)
            return false;
        DefaultFilterDropDownControlOptions other = (DefaultFilterDropDownControlOptions) obj;
        if (other.getDisplayOptions() == null ^ this.getDisplayOptions() == null)
            return false;
        if (other.getDisplayOptions() != null && other.getDisplayOptions().equals(this.getDisplayOptions()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getSelectableValues() == null ^ this.getSelectableValues() == null)
            return false;
        if (other.getSelectableValues() != null && other.getSelectableValues().equals(this.getSelectableValues()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDisplayOptions() == null) ? 0 : getDisplayOptions().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getSelectableValues() == null) ? 0 : getSelectableValues().hashCode());
        return hashCode;
    }

    @Override
    public DefaultFilterDropDownControlOptions clone() {
        try {
            return (DefaultFilterDropDownControlOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.DefaultFilterDropDownControlOptionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
