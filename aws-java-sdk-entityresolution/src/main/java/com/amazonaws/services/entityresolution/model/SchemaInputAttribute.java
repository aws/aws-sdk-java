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
package com.amazonaws.services.entityresolution.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object containing <code>FieldName</code>, <code>Type</code>, <code>GroupName</code>, <code>MatchKey</code>, and
 * <code>SubType</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/SchemaInputAttribute"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SchemaInputAttribute implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A string containing the field name.
     * </p>
     */
    private String fieldName;
    /**
     * <p>
     * A string that instructs Entity Resolution to combine several columns into a unified column with the identical
     * attribute type.
     * </p>
     * <p>
     * For example, when working with columns such as <code>first_name</code>, <code>middle_name</code>, and
     * <code>last_name</code>, assigning them a common <code>groupName</code> will prompt Entity Resolution to
     * concatenate them into a single value.
     * </p>
     */
    private String groupName;
    /**
     * <p>
     * A key that allows grouping of multiple input attributes into a unified matching group. For example, consider a
     * scenario where the source table contains various addresses, such as <code>business_address</code> and
     * <code>shipping_address</code>. By assigning a <code>matchKey</code> called <code>address</code> to both
     * attributes, Entity Resolution will match records across these fields to create a consolidated matching group. If
     * no <code>matchKey</code> is specified for a column, it won't be utilized for matching purposes but will still be
     * included in the output table.
     * </p>
     */
    private String matchKey;
    /**
     * <p>
     * The subtype of the attribute, selected from a list of values.
     * </p>
     */
    private String subType;
    /**
     * <p>
     * The type of the attribute, selected from a list of values.
     * </p>
     */
    private String type;

    /**
     * <p>
     * A string containing the field name.
     * </p>
     * 
     * @param fieldName
     *        A string containing the field name.
     */

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    /**
     * <p>
     * A string containing the field name.
     * </p>
     * 
     * @return A string containing the field name.
     */

    public String getFieldName() {
        return this.fieldName;
    }

    /**
     * <p>
     * A string containing the field name.
     * </p>
     * 
     * @param fieldName
     *        A string containing the field name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SchemaInputAttribute withFieldName(String fieldName) {
        setFieldName(fieldName);
        return this;
    }

    /**
     * <p>
     * A string that instructs Entity Resolution to combine several columns into a unified column with the identical
     * attribute type.
     * </p>
     * <p>
     * For example, when working with columns such as <code>first_name</code>, <code>middle_name</code>, and
     * <code>last_name</code>, assigning them a common <code>groupName</code> will prompt Entity Resolution to
     * concatenate them into a single value.
     * </p>
     * 
     * @param groupName
     *        A string that instructs Entity Resolution to combine several columns into a unified column with the
     *        identical attribute type. </p>
     *        <p>
     *        For example, when working with columns such as <code>first_name</code>, <code>middle_name</code>, and
     *        <code>last_name</code>, assigning them a common <code>groupName</code> will prompt Entity Resolution to
     *        concatenate them into a single value.
     */

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    /**
     * <p>
     * A string that instructs Entity Resolution to combine several columns into a unified column with the identical
     * attribute type.
     * </p>
     * <p>
     * For example, when working with columns such as <code>first_name</code>, <code>middle_name</code>, and
     * <code>last_name</code>, assigning them a common <code>groupName</code> will prompt Entity Resolution to
     * concatenate them into a single value.
     * </p>
     * 
     * @return A string that instructs Entity Resolution to combine several columns into a unified column with the
     *         identical attribute type. </p>
     *         <p>
     *         For example, when working with columns such as <code>first_name</code>, <code>middle_name</code>, and
     *         <code>last_name</code>, assigning them a common <code>groupName</code> will prompt Entity Resolution to
     *         concatenate them into a single value.
     */

    public String getGroupName() {
        return this.groupName;
    }

    /**
     * <p>
     * A string that instructs Entity Resolution to combine several columns into a unified column with the identical
     * attribute type.
     * </p>
     * <p>
     * For example, when working with columns such as <code>first_name</code>, <code>middle_name</code>, and
     * <code>last_name</code>, assigning them a common <code>groupName</code> will prompt Entity Resolution to
     * concatenate them into a single value.
     * </p>
     * 
     * @param groupName
     *        A string that instructs Entity Resolution to combine several columns into a unified column with the
     *        identical attribute type. </p>
     *        <p>
     *        For example, when working with columns such as <code>first_name</code>, <code>middle_name</code>, and
     *        <code>last_name</code>, assigning them a common <code>groupName</code> will prompt Entity Resolution to
     *        concatenate them into a single value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SchemaInputAttribute withGroupName(String groupName) {
        setGroupName(groupName);
        return this;
    }

    /**
     * <p>
     * A key that allows grouping of multiple input attributes into a unified matching group. For example, consider a
     * scenario where the source table contains various addresses, such as <code>business_address</code> and
     * <code>shipping_address</code>. By assigning a <code>matchKey</code> called <code>address</code> to both
     * attributes, Entity Resolution will match records across these fields to create a consolidated matching group. If
     * no <code>matchKey</code> is specified for a column, it won't be utilized for matching purposes but will still be
     * included in the output table.
     * </p>
     * 
     * @param matchKey
     *        A key that allows grouping of multiple input attributes into a unified matching group. For example,
     *        consider a scenario where the source table contains various addresses, such as
     *        <code>business_address</code> and <code>shipping_address</code>. By assigning a <code>matchKey</code>
     *        called <code>address</code> to both attributes, Entity Resolution will match records across these fields
     *        to create a consolidated matching group. If no <code>matchKey</code> is specified for a column, it won't
     *        be utilized for matching purposes but will still be included in the output table.
     */

    public void setMatchKey(String matchKey) {
        this.matchKey = matchKey;
    }

    /**
     * <p>
     * A key that allows grouping of multiple input attributes into a unified matching group. For example, consider a
     * scenario where the source table contains various addresses, such as <code>business_address</code> and
     * <code>shipping_address</code>. By assigning a <code>matchKey</code> called <code>address</code> to both
     * attributes, Entity Resolution will match records across these fields to create a consolidated matching group. If
     * no <code>matchKey</code> is specified for a column, it won't be utilized for matching purposes but will still be
     * included in the output table.
     * </p>
     * 
     * @return A key that allows grouping of multiple input attributes into a unified matching group. For example,
     *         consider a scenario where the source table contains various addresses, such as
     *         <code>business_address</code> and <code>shipping_address</code>. By assigning a <code>matchKey</code>
     *         called <code>address</code> to both attributes, Entity Resolution will match records across these fields
     *         to create a consolidated matching group. If no <code>matchKey</code> is specified for a column, it won't
     *         be utilized for matching purposes but will still be included in the output table.
     */

    public String getMatchKey() {
        return this.matchKey;
    }

    /**
     * <p>
     * A key that allows grouping of multiple input attributes into a unified matching group. For example, consider a
     * scenario where the source table contains various addresses, such as <code>business_address</code> and
     * <code>shipping_address</code>. By assigning a <code>matchKey</code> called <code>address</code> to both
     * attributes, Entity Resolution will match records across these fields to create a consolidated matching group. If
     * no <code>matchKey</code> is specified for a column, it won't be utilized for matching purposes but will still be
     * included in the output table.
     * </p>
     * 
     * @param matchKey
     *        A key that allows grouping of multiple input attributes into a unified matching group. For example,
     *        consider a scenario where the source table contains various addresses, such as
     *        <code>business_address</code> and <code>shipping_address</code>. By assigning a <code>matchKey</code>
     *        called <code>address</code> to both attributes, Entity Resolution will match records across these fields
     *        to create a consolidated matching group. If no <code>matchKey</code> is specified for a column, it won't
     *        be utilized for matching purposes but will still be included in the output table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SchemaInputAttribute withMatchKey(String matchKey) {
        setMatchKey(matchKey);
        return this;
    }

    /**
     * <p>
     * The subtype of the attribute, selected from a list of values.
     * </p>
     * 
     * @param subType
     *        The subtype of the attribute, selected from a list of values.
     */

    public void setSubType(String subType) {
        this.subType = subType;
    }

    /**
     * <p>
     * The subtype of the attribute, selected from a list of values.
     * </p>
     * 
     * @return The subtype of the attribute, selected from a list of values.
     */

    public String getSubType() {
        return this.subType;
    }

    /**
     * <p>
     * The subtype of the attribute, selected from a list of values.
     * </p>
     * 
     * @param subType
     *        The subtype of the attribute, selected from a list of values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SchemaInputAttribute withSubType(String subType) {
        setSubType(subType);
        return this;
    }

    /**
     * <p>
     * The type of the attribute, selected from a list of values.
     * </p>
     * 
     * @param type
     *        The type of the attribute, selected from a list of values.
     * @see SchemaAttributeType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the attribute, selected from a list of values.
     * </p>
     * 
     * @return The type of the attribute, selected from a list of values.
     * @see SchemaAttributeType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of the attribute, selected from a list of values.
     * </p>
     * 
     * @param type
     *        The type of the attribute, selected from a list of values.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SchemaAttributeType
     */

    public SchemaInputAttribute withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of the attribute, selected from a list of values.
     * </p>
     * 
     * @param type
     *        The type of the attribute, selected from a list of values.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SchemaAttributeType
     */

    public SchemaInputAttribute withType(SchemaAttributeType type) {
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
        if (getFieldName() != null)
            sb.append("FieldName: ").append(getFieldName()).append(",");
        if (getGroupName() != null)
            sb.append("GroupName: ").append(getGroupName()).append(",");
        if (getMatchKey() != null)
            sb.append("MatchKey: ").append(getMatchKey()).append(",");
        if (getSubType() != null)
            sb.append("SubType: ").append(getSubType()).append(",");
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

        if (obj instanceof SchemaInputAttribute == false)
            return false;
        SchemaInputAttribute other = (SchemaInputAttribute) obj;
        if (other.getFieldName() == null ^ this.getFieldName() == null)
            return false;
        if (other.getFieldName() != null && other.getFieldName().equals(this.getFieldName()) == false)
            return false;
        if (other.getGroupName() == null ^ this.getGroupName() == null)
            return false;
        if (other.getGroupName() != null && other.getGroupName().equals(this.getGroupName()) == false)
            return false;
        if (other.getMatchKey() == null ^ this.getMatchKey() == null)
            return false;
        if (other.getMatchKey() != null && other.getMatchKey().equals(this.getMatchKey()) == false)
            return false;
        if (other.getSubType() == null ^ this.getSubType() == null)
            return false;
        if (other.getSubType() != null && other.getSubType().equals(this.getSubType()) == false)
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

        hashCode = prime * hashCode + ((getFieldName() == null) ? 0 : getFieldName().hashCode());
        hashCode = prime * hashCode + ((getGroupName() == null) ? 0 : getGroupName().hashCode());
        hashCode = prime * hashCode + ((getMatchKey() == null) ? 0 : getMatchKey().hashCode());
        hashCode = prime * hashCode + ((getSubType() == null) ? 0 : getSubType().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public SchemaInputAttribute clone() {
        try {
            return (SchemaInputAttribute) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.entityresolution.model.transform.SchemaInputAttributeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
