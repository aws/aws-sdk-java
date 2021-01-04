/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A map filter for querying findings. Each map filter provides the field to check, the value to look for, and the
 * comparison operator.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/MapFilter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MapFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The key of the map filter. For example, for <code>ResourceTags</code>, <code>Key</code> identifies the name of
     * the tag. For <code>UserDefinedFields</code>, <code>Key</code> is the name of the field.
     * </p>
     */
    private String key;
    /**
     * <p>
     * The value for the key in the map filter. Filter values are case sensitive. For example, one of the values for a
     * tag called <code>Department</code> might be <code>Security</code>. If you provide <code>security</code> as the
     * filter value, then there is no match.
     * </p>
     */
    private String value;
    /**
     * <p>
     * The condition to apply to the key value when querying for findings with a map filter.
     * </p>
     * <p>
     * To search for values that exactly match the filter value, use <code>EQUALS</code>. For example, for the
     * <code>ResourceTags</code> field, the filter <code>Department EQUALS Security</code> matches findings that have
     * the value <code>Security</code> for the tag <code>Department</code>.
     * </p>
     * <p>
     * To search for values other than the filter value, use <code>NOT_EQUALS</code>. For example, for the
     * <code>ResourceTags</code> field, the filter <code>Department NOT_EQUALS Finance</code> matches findings that do
     * not have the value <code>Finance</code> for the tag <code>Department</code>.
     * </p>
     * <p>
     * <code>EQUALS</code> filters on the same field are joined by <code>OR</code>. A finding matches if it matches any
     * one of those filters.
     * </p>
     * <p>
     * <code>NOT_EQUALS</code> filters on the same field are joined by <code>AND</code>. A finding matches only if it
     * matches all of those filters.
     * </p>
     * <p>
     * You cannot have both an <code>EQUALS</code> filter and a <code>NOT_EQUALS</code> filter on the same field.
     * </p>
     */
    private String comparison;

    /**
     * <p>
     * The key of the map filter. For example, for <code>ResourceTags</code>, <code>Key</code> identifies the name of
     * the tag. For <code>UserDefinedFields</code>, <code>Key</code> is the name of the field.
     * </p>
     * 
     * @param key
     *        The key of the map filter. For example, for <code>ResourceTags</code>, <code>Key</code> identifies the
     *        name of the tag. For <code>UserDefinedFields</code>, <code>Key</code> is the name of the field.
     */

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * The key of the map filter. For example, for <code>ResourceTags</code>, <code>Key</code> identifies the name of
     * the tag. For <code>UserDefinedFields</code>, <code>Key</code> is the name of the field.
     * </p>
     * 
     * @return The key of the map filter. For example, for <code>ResourceTags</code>, <code>Key</code> identifies the
     *         name of the tag. For <code>UserDefinedFields</code>, <code>Key</code> is the name of the field.
     */

    public String getKey() {
        return this.key;
    }

    /**
     * <p>
     * The key of the map filter. For example, for <code>ResourceTags</code>, <code>Key</code> identifies the name of
     * the tag. For <code>UserDefinedFields</code>, <code>Key</code> is the name of the field.
     * </p>
     * 
     * @param key
     *        The key of the map filter. For example, for <code>ResourceTags</code>, <code>Key</code> identifies the
     *        name of the tag. For <code>UserDefinedFields</code>, <code>Key</code> is the name of the field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MapFilter withKey(String key) {
        setKey(key);
        return this;
    }

    /**
     * <p>
     * The value for the key in the map filter. Filter values are case sensitive. For example, one of the values for a
     * tag called <code>Department</code> might be <code>Security</code>. If you provide <code>security</code> as the
     * filter value, then there is no match.
     * </p>
     * 
     * @param value
     *        The value for the key in the map filter. Filter values are case sensitive. For example, one of the values
     *        for a tag called <code>Department</code> might be <code>Security</code>. If you provide
     *        <code>security</code> as the filter value, then there is no match.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The value for the key in the map filter. Filter values are case sensitive. For example, one of the values for a
     * tag called <code>Department</code> might be <code>Security</code>. If you provide <code>security</code> as the
     * filter value, then there is no match.
     * </p>
     * 
     * @return The value for the key in the map filter. Filter values are case sensitive. For example, one of the values
     *         for a tag called <code>Department</code> might be <code>Security</code>. If you provide
     *         <code>security</code> as the filter value, then there is no match.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The value for the key in the map filter. Filter values are case sensitive. For example, one of the values for a
     * tag called <code>Department</code> might be <code>Security</code>. If you provide <code>security</code> as the
     * filter value, then there is no match.
     * </p>
     * 
     * @param value
     *        The value for the key in the map filter. Filter values are case sensitive. For example, one of the values
     *        for a tag called <code>Department</code> might be <code>Security</code>. If you provide
     *        <code>security</code> as the filter value, then there is no match.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MapFilter withValue(String value) {
        setValue(value);
        return this;
    }

    /**
     * <p>
     * The condition to apply to the key value when querying for findings with a map filter.
     * </p>
     * <p>
     * To search for values that exactly match the filter value, use <code>EQUALS</code>. For example, for the
     * <code>ResourceTags</code> field, the filter <code>Department EQUALS Security</code> matches findings that have
     * the value <code>Security</code> for the tag <code>Department</code>.
     * </p>
     * <p>
     * To search for values other than the filter value, use <code>NOT_EQUALS</code>. For example, for the
     * <code>ResourceTags</code> field, the filter <code>Department NOT_EQUALS Finance</code> matches findings that do
     * not have the value <code>Finance</code> for the tag <code>Department</code>.
     * </p>
     * <p>
     * <code>EQUALS</code> filters on the same field are joined by <code>OR</code>. A finding matches if it matches any
     * one of those filters.
     * </p>
     * <p>
     * <code>NOT_EQUALS</code> filters on the same field are joined by <code>AND</code>. A finding matches only if it
     * matches all of those filters.
     * </p>
     * <p>
     * You cannot have both an <code>EQUALS</code> filter and a <code>NOT_EQUALS</code> filter on the same field.
     * </p>
     * 
     * @param comparison
     *        The condition to apply to the key value when querying for findings with a map filter.</p>
     *        <p>
     *        To search for values that exactly match the filter value, use <code>EQUALS</code>. For example, for the
     *        <code>ResourceTags</code> field, the filter <code>Department EQUALS Security</code> matches findings that
     *        have the value <code>Security</code> for the tag <code>Department</code>.
     *        </p>
     *        <p>
     *        To search for values other than the filter value, use <code>NOT_EQUALS</code>. For example, for the
     *        <code>ResourceTags</code> field, the filter <code>Department NOT_EQUALS Finance</code> matches findings
     *        that do not have the value <code>Finance</code> for the tag <code>Department</code>.
     *        </p>
     *        <p>
     *        <code>EQUALS</code> filters on the same field are joined by <code>OR</code>. A finding matches if it
     *        matches any one of those filters.
     *        </p>
     *        <p>
     *        <code>NOT_EQUALS</code> filters on the same field are joined by <code>AND</code>. A finding matches only
     *        if it matches all of those filters.
     *        </p>
     *        <p>
     *        You cannot have both an <code>EQUALS</code> filter and a <code>NOT_EQUALS</code> filter on the same field.
     * @see MapFilterComparison
     */

    public void setComparison(String comparison) {
        this.comparison = comparison;
    }

    /**
     * <p>
     * The condition to apply to the key value when querying for findings with a map filter.
     * </p>
     * <p>
     * To search for values that exactly match the filter value, use <code>EQUALS</code>. For example, for the
     * <code>ResourceTags</code> field, the filter <code>Department EQUALS Security</code> matches findings that have
     * the value <code>Security</code> for the tag <code>Department</code>.
     * </p>
     * <p>
     * To search for values other than the filter value, use <code>NOT_EQUALS</code>. For example, for the
     * <code>ResourceTags</code> field, the filter <code>Department NOT_EQUALS Finance</code> matches findings that do
     * not have the value <code>Finance</code> for the tag <code>Department</code>.
     * </p>
     * <p>
     * <code>EQUALS</code> filters on the same field are joined by <code>OR</code>. A finding matches if it matches any
     * one of those filters.
     * </p>
     * <p>
     * <code>NOT_EQUALS</code> filters on the same field are joined by <code>AND</code>. A finding matches only if it
     * matches all of those filters.
     * </p>
     * <p>
     * You cannot have both an <code>EQUALS</code> filter and a <code>NOT_EQUALS</code> filter on the same field.
     * </p>
     * 
     * @return The condition to apply to the key value when querying for findings with a map filter.</p>
     *         <p>
     *         To search for values that exactly match the filter value, use <code>EQUALS</code>. For example, for the
     *         <code>ResourceTags</code> field, the filter <code>Department EQUALS Security</code> matches findings that
     *         have the value <code>Security</code> for the tag <code>Department</code>.
     *         </p>
     *         <p>
     *         To search for values other than the filter value, use <code>NOT_EQUALS</code>. For example, for the
     *         <code>ResourceTags</code> field, the filter <code>Department NOT_EQUALS Finance</code> matches findings
     *         that do not have the value <code>Finance</code> for the tag <code>Department</code>.
     *         </p>
     *         <p>
     *         <code>EQUALS</code> filters on the same field are joined by <code>OR</code>. A finding matches if it
     *         matches any one of those filters.
     *         </p>
     *         <p>
     *         <code>NOT_EQUALS</code> filters on the same field are joined by <code>AND</code>. A finding matches only
     *         if it matches all of those filters.
     *         </p>
     *         <p>
     *         You cannot have both an <code>EQUALS</code> filter and a <code>NOT_EQUALS</code> filter on the same
     *         field.
     * @see MapFilterComparison
     */

    public String getComparison() {
        return this.comparison;
    }

    /**
     * <p>
     * The condition to apply to the key value when querying for findings with a map filter.
     * </p>
     * <p>
     * To search for values that exactly match the filter value, use <code>EQUALS</code>. For example, for the
     * <code>ResourceTags</code> field, the filter <code>Department EQUALS Security</code> matches findings that have
     * the value <code>Security</code> for the tag <code>Department</code>.
     * </p>
     * <p>
     * To search for values other than the filter value, use <code>NOT_EQUALS</code>. For example, for the
     * <code>ResourceTags</code> field, the filter <code>Department NOT_EQUALS Finance</code> matches findings that do
     * not have the value <code>Finance</code> for the tag <code>Department</code>.
     * </p>
     * <p>
     * <code>EQUALS</code> filters on the same field are joined by <code>OR</code>. A finding matches if it matches any
     * one of those filters.
     * </p>
     * <p>
     * <code>NOT_EQUALS</code> filters on the same field are joined by <code>AND</code>. A finding matches only if it
     * matches all of those filters.
     * </p>
     * <p>
     * You cannot have both an <code>EQUALS</code> filter and a <code>NOT_EQUALS</code> filter on the same field.
     * </p>
     * 
     * @param comparison
     *        The condition to apply to the key value when querying for findings with a map filter.</p>
     *        <p>
     *        To search for values that exactly match the filter value, use <code>EQUALS</code>. For example, for the
     *        <code>ResourceTags</code> field, the filter <code>Department EQUALS Security</code> matches findings that
     *        have the value <code>Security</code> for the tag <code>Department</code>.
     *        </p>
     *        <p>
     *        To search for values other than the filter value, use <code>NOT_EQUALS</code>. For example, for the
     *        <code>ResourceTags</code> field, the filter <code>Department NOT_EQUALS Finance</code> matches findings
     *        that do not have the value <code>Finance</code> for the tag <code>Department</code>.
     *        </p>
     *        <p>
     *        <code>EQUALS</code> filters on the same field are joined by <code>OR</code>. A finding matches if it
     *        matches any one of those filters.
     *        </p>
     *        <p>
     *        <code>NOT_EQUALS</code> filters on the same field are joined by <code>AND</code>. A finding matches only
     *        if it matches all of those filters.
     *        </p>
     *        <p>
     *        You cannot have both an <code>EQUALS</code> filter and a <code>NOT_EQUALS</code> filter on the same field.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MapFilterComparison
     */

    public MapFilter withComparison(String comparison) {
        setComparison(comparison);
        return this;
    }

    /**
     * <p>
     * The condition to apply to the key value when querying for findings with a map filter.
     * </p>
     * <p>
     * To search for values that exactly match the filter value, use <code>EQUALS</code>. For example, for the
     * <code>ResourceTags</code> field, the filter <code>Department EQUALS Security</code> matches findings that have
     * the value <code>Security</code> for the tag <code>Department</code>.
     * </p>
     * <p>
     * To search for values other than the filter value, use <code>NOT_EQUALS</code>. For example, for the
     * <code>ResourceTags</code> field, the filter <code>Department NOT_EQUALS Finance</code> matches findings that do
     * not have the value <code>Finance</code> for the tag <code>Department</code>.
     * </p>
     * <p>
     * <code>EQUALS</code> filters on the same field are joined by <code>OR</code>. A finding matches if it matches any
     * one of those filters.
     * </p>
     * <p>
     * <code>NOT_EQUALS</code> filters on the same field are joined by <code>AND</code>. A finding matches only if it
     * matches all of those filters.
     * </p>
     * <p>
     * You cannot have both an <code>EQUALS</code> filter and a <code>NOT_EQUALS</code> filter on the same field.
     * </p>
     * 
     * @param comparison
     *        The condition to apply to the key value when querying for findings with a map filter.</p>
     *        <p>
     *        To search for values that exactly match the filter value, use <code>EQUALS</code>. For example, for the
     *        <code>ResourceTags</code> field, the filter <code>Department EQUALS Security</code> matches findings that
     *        have the value <code>Security</code> for the tag <code>Department</code>.
     *        </p>
     *        <p>
     *        To search for values other than the filter value, use <code>NOT_EQUALS</code>. For example, for the
     *        <code>ResourceTags</code> field, the filter <code>Department NOT_EQUALS Finance</code> matches findings
     *        that do not have the value <code>Finance</code> for the tag <code>Department</code>.
     *        </p>
     *        <p>
     *        <code>EQUALS</code> filters on the same field are joined by <code>OR</code>. A finding matches if it
     *        matches any one of those filters.
     *        </p>
     *        <p>
     *        <code>NOT_EQUALS</code> filters on the same field are joined by <code>AND</code>. A finding matches only
     *        if it matches all of those filters.
     *        </p>
     *        <p>
     *        You cannot have both an <code>EQUALS</code> filter and a <code>NOT_EQUALS</code> filter on the same field.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MapFilterComparison
     */

    public MapFilter withComparison(MapFilterComparison comparison) {
        this.comparison = comparison.toString();
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
        if (getKey() != null)
            sb.append("Key: ").append(getKey()).append(",");
        if (getValue() != null)
            sb.append("Value: ").append(getValue()).append(",");
        if (getComparison() != null)
            sb.append("Comparison: ").append(getComparison());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MapFilter == false)
            return false;
        MapFilter other = (MapFilter) obj;
        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getComparison() == null ^ this.getComparison() == null)
            return false;
        if (other.getComparison() != null && other.getComparison().equals(this.getComparison()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getComparison() == null) ? 0 : getComparison().hashCode());
        return hashCode;
    }

    @Override
    public MapFilter clone() {
        try {
            return (MapFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.MapFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
