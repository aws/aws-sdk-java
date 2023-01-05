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
 * A control from a date filter that is used to specify date and time.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/FilterDateTimePickerControl"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FilterDateTimePickerControl implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the <code>FilterDateTimePickerControl</code>.
     * </p>
     */
    private String filterControlId;
    /**
     * <p>
     * The title of the <code>FilterDateTimePickerControl</code>.
     * </p>
     */
    private String title;
    /**
     * <p>
     * The source filter ID of the <code>FilterDateTimePickerControl</code>.
     * </p>
     */
    private String sourceFilterId;
    /**
     * <p>
     * The display options of a control.
     * </p>
     */
    private DateTimePickerControlDisplayOptions displayOptions;
    /**
     * <p>
     * The date time picker type of a <code>FilterDateTimePickerControl</code>. Choose one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SINGLE_VALUED</code>: The filter condition is a fixed date.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DATE_RANGE</code>: The filter condition is a date time range.
     * </p>
     * </li>
     * </ul>
     */
    private String type;

    /**
     * <p>
     * The ID of the <code>FilterDateTimePickerControl</code>.
     * </p>
     * 
     * @param filterControlId
     *        The ID of the <code>FilterDateTimePickerControl</code>.
     */

    public void setFilterControlId(String filterControlId) {
        this.filterControlId = filterControlId;
    }

    /**
     * <p>
     * The ID of the <code>FilterDateTimePickerControl</code>.
     * </p>
     * 
     * @return The ID of the <code>FilterDateTimePickerControl</code>.
     */

    public String getFilterControlId() {
        return this.filterControlId;
    }

    /**
     * <p>
     * The ID of the <code>FilterDateTimePickerControl</code>.
     * </p>
     * 
     * @param filterControlId
     *        The ID of the <code>FilterDateTimePickerControl</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterDateTimePickerControl withFilterControlId(String filterControlId) {
        setFilterControlId(filterControlId);
        return this;
    }

    /**
     * <p>
     * The title of the <code>FilterDateTimePickerControl</code>.
     * </p>
     * 
     * @param title
     *        The title of the <code>FilterDateTimePickerControl</code>.
     */

    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * <p>
     * The title of the <code>FilterDateTimePickerControl</code>.
     * </p>
     * 
     * @return The title of the <code>FilterDateTimePickerControl</code>.
     */

    public String getTitle() {
        return this.title;
    }

    /**
     * <p>
     * The title of the <code>FilterDateTimePickerControl</code>.
     * </p>
     * 
     * @param title
     *        The title of the <code>FilterDateTimePickerControl</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterDateTimePickerControl withTitle(String title) {
        setTitle(title);
        return this;
    }

    /**
     * <p>
     * The source filter ID of the <code>FilterDateTimePickerControl</code>.
     * </p>
     * 
     * @param sourceFilterId
     *        The source filter ID of the <code>FilterDateTimePickerControl</code>.
     */

    public void setSourceFilterId(String sourceFilterId) {
        this.sourceFilterId = sourceFilterId;
    }

    /**
     * <p>
     * The source filter ID of the <code>FilterDateTimePickerControl</code>.
     * </p>
     * 
     * @return The source filter ID of the <code>FilterDateTimePickerControl</code>.
     */

    public String getSourceFilterId() {
        return this.sourceFilterId;
    }

    /**
     * <p>
     * The source filter ID of the <code>FilterDateTimePickerControl</code>.
     * </p>
     * 
     * @param sourceFilterId
     *        The source filter ID of the <code>FilterDateTimePickerControl</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterDateTimePickerControl withSourceFilterId(String sourceFilterId) {
        setSourceFilterId(sourceFilterId);
        return this;
    }

    /**
     * <p>
     * The display options of a control.
     * </p>
     * 
     * @param displayOptions
     *        The display options of a control.
     */

    public void setDisplayOptions(DateTimePickerControlDisplayOptions displayOptions) {
        this.displayOptions = displayOptions;
    }

    /**
     * <p>
     * The display options of a control.
     * </p>
     * 
     * @return The display options of a control.
     */

    public DateTimePickerControlDisplayOptions getDisplayOptions() {
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

    public FilterDateTimePickerControl withDisplayOptions(DateTimePickerControlDisplayOptions displayOptions) {
        setDisplayOptions(displayOptions);
        return this;
    }

    /**
     * <p>
     * The date time picker type of a <code>FilterDateTimePickerControl</code>. Choose one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SINGLE_VALUED</code>: The filter condition is a fixed date.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DATE_RANGE</code>: The filter condition is a date time range.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The date time picker type of a <code>FilterDateTimePickerControl</code>. Choose one of the following
     *        options:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SINGLE_VALUED</code>: The filter condition is a fixed date.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DATE_RANGE</code>: The filter condition is a date time range.
     *        </p>
     *        </li>
     * @see SheetControlDateTimePickerType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The date time picker type of a <code>FilterDateTimePickerControl</code>. Choose one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SINGLE_VALUED</code>: The filter condition is a fixed date.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DATE_RANGE</code>: The filter condition is a date time range.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The date time picker type of a <code>FilterDateTimePickerControl</code>. Choose one of the following
     *         options:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>SINGLE_VALUED</code>: The filter condition is a fixed date.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DATE_RANGE</code>: The filter condition is a date time range.
     *         </p>
     *         </li>
     * @see SheetControlDateTimePickerType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The date time picker type of a <code>FilterDateTimePickerControl</code>. Choose one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SINGLE_VALUED</code>: The filter condition is a fixed date.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DATE_RANGE</code>: The filter condition is a date time range.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The date time picker type of a <code>FilterDateTimePickerControl</code>. Choose one of the following
     *        options:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SINGLE_VALUED</code>: The filter condition is a fixed date.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DATE_RANGE</code>: The filter condition is a date time range.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SheetControlDateTimePickerType
     */

    public FilterDateTimePickerControl withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The date time picker type of a <code>FilterDateTimePickerControl</code>. Choose one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SINGLE_VALUED</code>: The filter condition is a fixed date.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DATE_RANGE</code>: The filter condition is a date time range.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The date time picker type of a <code>FilterDateTimePickerControl</code>. Choose one of the following
     *        options:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SINGLE_VALUED</code>: The filter condition is a fixed date.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DATE_RANGE</code>: The filter condition is a date time range.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SheetControlDateTimePickerType
     */

    public FilterDateTimePickerControl withType(SheetControlDateTimePickerType type) {
        this.type = type.toString();
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
        if (getFilterControlId() != null)
            sb.append("FilterControlId: ").append(getFilterControlId()).append(",");
        if (getTitle() != null)
            sb.append("Title: ").append(getTitle()).append(",");
        if (getSourceFilterId() != null)
            sb.append("SourceFilterId: ").append(getSourceFilterId()).append(",");
        if (getDisplayOptions() != null)
            sb.append("DisplayOptions: ").append(getDisplayOptions()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FilterDateTimePickerControl == false)
            return false;
        FilterDateTimePickerControl other = (FilterDateTimePickerControl) obj;
        if (other.getFilterControlId() == null ^ this.getFilterControlId() == null)
            return false;
        if (other.getFilterControlId() != null && other.getFilterControlId().equals(this.getFilterControlId()) == false)
            return false;
        if (other.getTitle() == null ^ this.getTitle() == null)
            return false;
        if (other.getTitle() != null && other.getTitle().equals(this.getTitle()) == false)
            return false;
        if (other.getSourceFilterId() == null ^ this.getSourceFilterId() == null)
            return false;
        if (other.getSourceFilterId() != null && other.getSourceFilterId().equals(this.getSourceFilterId()) == false)
            return false;
        if (other.getDisplayOptions() == null ^ this.getDisplayOptions() == null)
            return false;
        if (other.getDisplayOptions() != null && other.getDisplayOptions().equals(this.getDisplayOptions()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFilterControlId() == null) ? 0 : getFilterControlId().hashCode());
        hashCode = prime * hashCode + ((getTitle() == null) ? 0 : getTitle().hashCode());
        hashCode = prime * hashCode + ((getSourceFilterId() == null) ? 0 : getSourceFilterId().hashCode());
        hashCode = prime * hashCode + ((getDisplayOptions() == null) ? 0 : getDisplayOptions().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public FilterDateTimePickerControl clone() {
        try {
            return (FilterDateTimePickerControl) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.FilterDateTimePickerControlMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
