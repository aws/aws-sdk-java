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
 * A control to display a text box that is used to enter multiple entries.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/FilterTextAreaControl" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FilterTextAreaControl implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the <code>FilterTextAreaControl</code>.
     * </p>
     */
    private String filterControlId;
    /**
     * <p>
     * The title of the <code>FilterTextAreaControl</code>.
     * </p>
     */
    private String title;
    /**
     * <p>
     * The source filter ID of the <code>FilterTextAreaControl</code>.
     * </p>
     */
    private String sourceFilterId;
    /**
     * <p>
     * The delimiter that is used to separate the lines in text.
     * </p>
     */
    private String delimiter;
    /**
     * <p>
     * The display options of a control.
     * </p>
     */
    private TextAreaControlDisplayOptions displayOptions;

    /**
     * <p>
     * The ID of the <code>FilterTextAreaControl</code>.
     * </p>
     * 
     * @param filterControlId
     *        The ID of the <code>FilterTextAreaControl</code>.
     */

    public void setFilterControlId(String filterControlId) {
        this.filterControlId = filterControlId;
    }

    /**
     * <p>
     * The ID of the <code>FilterTextAreaControl</code>.
     * </p>
     * 
     * @return The ID of the <code>FilterTextAreaControl</code>.
     */

    public String getFilterControlId() {
        return this.filterControlId;
    }

    /**
     * <p>
     * The ID of the <code>FilterTextAreaControl</code>.
     * </p>
     * 
     * @param filterControlId
     *        The ID of the <code>FilterTextAreaControl</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterTextAreaControl withFilterControlId(String filterControlId) {
        setFilterControlId(filterControlId);
        return this;
    }

    /**
     * <p>
     * The title of the <code>FilterTextAreaControl</code>.
     * </p>
     * 
     * @param title
     *        The title of the <code>FilterTextAreaControl</code>.
     */

    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * <p>
     * The title of the <code>FilterTextAreaControl</code>.
     * </p>
     * 
     * @return The title of the <code>FilterTextAreaControl</code>.
     */

    public String getTitle() {
        return this.title;
    }

    /**
     * <p>
     * The title of the <code>FilterTextAreaControl</code>.
     * </p>
     * 
     * @param title
     *        The title of the <code>FilterTextAreaControl</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterTextAreaControl withTitle(String title) {
        setTitle(title);
        return this;
    }

    /**
     * <p>
     * The source filter ID of the <code>FilterTextAreaControl</code>.
     * </p>
     * 
     * @param sourceFilterId
     *        The source filter ID of the <code>FilterTextAreaControl</code>.
     */

    public void setSourceFilterId(String sourceFilterId) {
        this.sourceFilterId = sourceFilterId;
    }

    /**
     * <p>
     * The source filter ID of the <code>FilterTextAreaControl</code>.
     * </p>
     * 
     * @return The source filter ID of the <code>FilterTextAreaControl</code>.
     */

    public String getSourceFilterId() {
        return this.sourceFilterId;
    }

    /**
     * <p>
     * The source filter ID of the <code>FilterTextAreaControl</code>.
     * </p>
     * 
     * @param sourceFilterId
     *        The source filter ID of the <code>FilterTextAreaControl</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterTextAreaControl withSourceFilterId(String sourceFilterId) {
        setSourceFilterId(sourceFilterId);
        return this;
    }

    /**
     * <p>
     * The delimiter that is used to separate the lines in text.
     * </p>
     * 
     * @param delimiter
     *        The delimiter that is used to separate the lines in text.
     */

    public void setDelimiter(String delimiter) {
        this.delimiter = delimiter;
    }

    /**
     * <p>
     * The delimiter that is used to separate the lines in text.
     * </p>
     * 
     * @return The delimiter that is used to separate the lines in text.
     */

    public String getDelimiter() {
        return this.delimiter;
    }

    /**
     * <p>
     * The delimiter that is used to separate the lines in text.
     * </p>
     * 
     * @param delimiter
     *        The delimiter that is used to separate the lines in text.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterTextAreaControl withDelimiter(String delimiter) {
        setDelimiter(delimiter);
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

    public void setDisplayOptions(TextAreaControlDisplayOptions displayOptions) {
        this.displayOptions = displayOptions;
    }

    /**
     * <p>
     * The display options of a control.
     * </p>
     * 
     * @return The display options of a control.
     */

    public TextAreaControlDisplayOptions getDisplayOptions() {
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

    public FilterTextAreaControl withDisplayOptions(TextAreaControlDisplayOptions displayOptions) {
        setDisplayOptions(displayOptions);
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
        if (getDelimiter() != null)
            sb.append("Delimiter: ").append(getDelimiter()).append(",");
        if (getDisplayOptions() != null)
            sb.append("DisplayOptions: ").append(getDisplayOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FilterTextAreaControl == false)
            return false;
        FilterTextAreaControl other = (FilterTextAreaControl) obj;
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
        if (other.getDelimiter() == null ^ this.getDelimiter() == null)
            return false;
        if (other.getDelimiter() != null && other.getDelimiter().equals(this.getDelimiter()) == false)
            return false;
        if (other.getDisplayOptions() == null ^ this.getDisplayOptions() == null)
            return false;
        if (other.getDisplayOptions() != null && other.getDisplayOptions().equals(this.getDisplayOptions()) == false)
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
        hashCode = prime * hashCode + ((getDelimiter() == null) ? 0 : getDelimiter().hashCode());
        hashCode = prime * hashCode + ((getDisplayOptions() == null) ? 0 : getDisplayOptions().hashCode());
        return hashCode;
    }

    @Override
    public FilterTextAreaControl clone() {
        try {
            return (FilterTextAreaControl) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.FilterTextAreaControlMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
