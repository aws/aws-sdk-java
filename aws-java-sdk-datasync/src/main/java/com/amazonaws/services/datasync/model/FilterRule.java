/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.datasync.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies which files, folders and objects to include or exclude when transferring files from source to destination.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/FilterRule" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FilterRule implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of filter rule to apply. AWS DataSync only supports the SIMPLE_PATTERN rule type.
     * </p>
     */
    private String filterType;
    /**
     * <p>
     * A single filter string that consists of the patterns to include or exclude. The patterns are delimited by "|"
     * (that is, a pipe), for example: <code>/folder1|/folder2</code>
     * </p>
     * <p>
     * </p>
     */
    private String value;

    /**
     * <p>
     * The type of filter rule to apply. AWS DataSync only supports the SIMPLE_PATTERN rule type.
     * </p>
     * 
     * @param filterType
     *        The type of filter rule to apply. AWS DataSync only supports the SIMPLE_PATTERN rule type.
     * @see FilterType
     */

    public void setFilterType(String filterType) {
        this.filterType = filterType;
    }

    /**
     * <p>
     * The type of filter rule to apply. AWS DataSync only supports the SIMPLE_PATTERN rule type.
     * </p>
     * 
     * @return The type of filter rule to apply. AWS DataSync only supports the SIMPLE_PATTERN rule type.
     * @see FilterType
     */

    public String getFilterType() {
        return this.filterType;
    }

    /**
     * <p>
     * The type of filter rule to apply. AWS DataSync only supports the SIMPLE_PATTERN rule type.
     * </p>
     * 
     * @param filterType
     *        The type of filter rule to apply. AWS DataSync only supports the SIMPLE_PATTERN rule type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FilterType
     */

    public FilterRule withFilterType(String filterType) {
        setFilterType(filterType);
        return this;
    }

    /**
     * <p>
     * The type of filter rule to apply. AWS DataSync only supports the SIMPLE_PATTERN rule type.
     * </p>
     * 
     * @param filterType
     *        The type of filter rule to apply. AWS DataSync only supports the SIMPLE_PATTERN rule type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FilterType
     */

    public FilterRule withFilterType(FilterType filterType) {
        this.filterType = filterType.toString();
        return this;
    }

    /**
     * <p>
     * A single filter string that consists of the patterns to include or exclude. The patterns are delimited by "|"
     * (that is, a pipe), for example: <code>/folder1|/folder2</code>
     * </p>
     * <p>
     * </p>
     * 
     * @param value
     *        A single filter string that consists of the patterns to include or exclude. The patterns are delimited by
     *        "|" (that is, a pipe), for example: <code>/folder1|/folder2</code> </p>
     *        <p>
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * A single filter string that consists of the patterns to include or exclude. The patterns are delimited by "|"
     * (that is, a pipe), for example: <code>/folder1|/folder2</code>
     * </p>
     * <p>
     * </p>
     * 
     * @return A single filter string that consists of the patterns to include or exclude. The patterns are delimited by
     *         "|" (that is, a pipe), for example: <code>/folder1|/folder2</code> </p>
     *         <p>
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * A single filter string that consists of the patterns to include or exclude. The patterns are delimited by "|"
     * (that is, a pipe), for example: <code>/folder1|/folder2</code>
     * </p>
     * <p>
     * </p>
     * 
     * @param value
     *        A single filter string that consists of the patterns to include or exclude. The patterns are delimited by
     *        "|" (that is, a pipe), for example: <code>/folder1|/folder2</code> </p>
     *        <p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterRule withValue(String value) {
        setValue(value);
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
        if (getFilterType() != null)
            sb.append("FilterType: ").append(getFilterType()).append(",");
        if (getValue() != null)
            sb.append("Value: ").append(getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FilterRule == false)
            return false;
        FilterRule other = (FilterRule) obj;
        if (other.getFilterType() == null ^ this.getFilterType() == null)
            return false;
        if (other.getFilterType() != null && other.getFilterType().equals(this.getFilterType()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFilterType() == null) ? 0 : getFilterType().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public FilterRule clone() {
        try {
            return (FilterRule) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.datasync.model.transform.FilterRuleMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
