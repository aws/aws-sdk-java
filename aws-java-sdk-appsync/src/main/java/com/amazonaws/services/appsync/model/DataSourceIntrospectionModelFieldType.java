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
package com.amazonaws.services.appsync.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents the type data for each field retrieved from the introspection.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/DataSourceIntrospectionModelFieldType"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataSourceIntrospectionModelFieldType implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the classification of data. For example, this could be set to values like <code>Scalar</code> or
     * <code>NonNull</code> to indicate a fundamental property of the field.
     * </p>
     * <p>
     * Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Scalar</code>: Indicates the value is a primitive type (scalar).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NonNull</code>: Indicates the field cannot be <code>null</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>List</code>: Indicates the field contains a list.
     * </p>
     * </li>
     * </ul>
     */
    private String kind;
    /**
     * <p>
     * The name of the data type that represents the field. For example, <code>String</code> is a valid
     * <code>name</code> value.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The <code>DataSourceIntrospectionModelFieldType</code> object data. The <code>type</code> is only present if
     * <code>DataSourceIntrospectionModelFieldType.kind</code> is set to <code>NonNull</code> or <code>List</code>.
     * </p>
     * <p>
     * The <code>type</code> typically contains its own <code>kind</code> and <code>name</code> fields to represent the
     * actual type data. For instance, <code>type</code> could contain a <code>kind</code> value of <code>Scalar</code>
     * with a <code>name</code> value of <code>String</code>. The values <code>Scalar</code> and <code>String</code>
     * will be collectively stored in the <code>values</code> field.
     * </p>
     */
    private DataSourceIntrospectionModelFieldType type;
    /**
     * <p>
     * The values of the <code>type</code> field. This field represents the AppSync data type equivalent of the
     * introspected field.
     * </p>
     */
    private java.util.List<String> values;

    /**
     * <p>
     * Specifies the classification of data. For example, this could be set to values like <code>Scalar</code> or
     * <code>NonNull</code> to indicate a fundamental property of the field.
     * </p>
     * <p>
     * Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Scalar</code>: Indicates the value is a primitive type (scalar).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NonNull</code>: Indicates the field cannot be <code>null</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>List</code>: Indicates the field contains a list.
     * </p>
     * </li>
     * </ul>
     * 
     * @param kind
     *        Specifies the classification of data. For example, this could be set to values like <code>Scalar</code> or
     *        <code>NonNull</code> to indicate a fundamental property of the field.</p>
     *        <p>
     *        Valid values include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Scalar</code>: Indicates the value is a primitive type (scalar).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NonNull</code>: Indicates the field cannot be <code>null</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>List</code>: Indicates the field contains a list.
     *        </p>
     *        </li>
     */

    public void setKind(String kind) {
        this.kind = kind;
    }

    /**
     * <p>
     * Specifies the classification of data. For example, this could be set to values like <code>Scalar</code> or
     * <code>NonNull</code> to indicate a fundamental property of the field.
     * </p>
     * <p>
     * Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Scalar</code>: Indicates the value is a primitive type (scalar).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NonNull</code>: Indicates the field cannot be <code>null</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>List</code>: Indicates the field contains a list.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Specifies the classification of data. For example, this could be set to values like <code>Scalar</code>
     *         or <code>NonNull</code> to indicate a fundamental property of the field.</p>
     *         <p>
     *         Valid values include:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Scalar</code>: Indicates the value is a primitive type (scalar).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NonNull</code>: Indicates the field cannot be <code>null</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>List</code>: Indicates the field contains a list.
     *         </p>
     *         </li>
     */

    public String getKind() {
        return this.kind;
    }

    /**
     * <p>
     * Specifies the classification of data. For example, this could be set to values like <code>Scalar</code> or
     * <code>NonNull</code> to indicate a fundamental property of the field.
     * </p>
     * <p>
     * Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Scalar</code>: Indicates the value is a primitive type (scalar).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NonNull</code>: Indicates the field cannot be <code>null</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>List</code>: Indicates the field contains a list.
     * </p>
     * </li>
     * </ul>
     * 
     * @param kind
     *        Specifies the classification of data. For example, this could be set to values like <code>Scalar</code> or
     *        <code>NonNull</code> to indicate a fundamental property of the field.</p>
     *        <p>
     *        Valid values include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Scalar</code>: Indicates the value is a primitive type (scalar).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NonNull</code>: Indicates the field cannot be <code>null</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>List</code>: Indicates the field contains a list.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceIntrospectionModelFieldType withKind(String kind) {
        setKind(kind);
        return this;
    }

    /**
     * <p>
     * The name of the data type that represents the field. For example, <code>String</code> is a valid
     * <code>name</code> value.
     * </p>
     * 
     * @param name
     *        The name of the data type that represents the field. For example, <code>String</code> is a valid
     *        <code>name</code> value.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the data type that represents the field. For example, <code>String</code> is a valid
     * <code>name</code> value.
     * </p>
     * 
     * @return The name of the data type that represents the field. For example, <code>String</code> is a valid
     *         <code>name</code> value.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the data type that represents the field. For example, <code>String</code> is a valid
     * <code>name</code> value.
     * </p>
     * 
     * @param name
     *        The name of the data type that represents the field. For example, <code>String</code> is a valid
     *        <code>name</code> value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceIntrospectionModelFieldType withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The <code>DataSourceIntrospectionModelFieldType</code> object data. The <code>type</code> is only present if
     * <code>DataSourceIntrospectionModelFieldType.kind</code> is set to <code>NonNull</code> or <code>List</code>.
     * </p>
     * <p>
     * The <code>type</code> typically contains its own <code>kind</code> and <code>name</code> fields to represent the
     * actual type data. For instance, <code>type</code> could contain a <code>kind</code> value of <code>Scalar</code>
     * with a <code>name</code> value of <code>String</code>. The values <code>Scalar</code> and <code>String</code>
     * will be collectively stored in the <code>values</code> field.
     * </p>
     * 
     * @param type
     *        The <code>DataSourceIntrospectionModelFieldType</code> object data. The <code>type</code> is only present
     *        if <code>DataSourceIntrospectionModelFieldType.kind</code> is set to <code>NonNull</code> or
     *        <code>List</code>. </p>
     *        <p>
     *        The <code>type</code> typically contains its own <code>kind</code> and <code>name</code> fields to
     *        represent the actual type data. For instance, <code>type</code> could contain a <code>kind</code> value of
     *        <code>Scalar</code> with a <code>name</code> value of <code>String</code>. The values <code>Scalar</code>
     *        and <code>String</code> will be collectively stored in the <code>values</code> field.
     */

    public void setType(DataSourceIntrospectionModelFieldType type) {
        this.type = type;
    }

    /**
     * <p>
     * The <code>DataSourceIntrospectionModelFieldType</code> object data. The <code>type</code> is only present if
     * <code>DataSourceIntrospectionModelFieldType.kind</code> is set to <code>NonNull</code> or <code>List</code>.
     * </p>
     * <p>
     * The <code>type</code> typically contains its own <code>kind</code> and <code>name</code> fields to represent the
     * actual type data. For instance, <code>type</code> could contain a <code>kind</code> value of <code>Scalar</code>
     * with a <code>name</code> value of <code>String</code>. The values <code>Scalar</code> and <code>String</code>
     * will be collectively stored in the <code>values</code> field.
     * </p>
     * 
     * @return The <code>DataSourceIntrospectionModelFieldType</code> object data. The <code>type</code> is only present
     *         if <code>DataSourceIntrospectionModelFieldType.kind</code> is set to <code>NonNull</code> or
     *         <code>List</code>. </p>
     *         <p>
     *         The <code>type</code> typically contains its own <code>kind</code> and <code>name</code> fields to
     *         represent the actual type data. For instance, <code>type</code> could contain a <code>kind</code> value
     *         of <code>Scalar</code> with a <code>name</code> value of <code>String</code>. The values
     *         <code>Scalar</code> and <code>String</code> will be collectively stored in the <code>values</code> field.
     */

    public DataSourceIntrospectionModelFieldType getType() {
        return this.type;
    }

    /**
     * <p>
     * The <code>DataSourceIntrospectionModelFieldType</code> object data. The <code>type</code> is only present if
     * <code>DataSourceIntrospectionModelFieldType.kind</code> is set to <code>NonNull</code> or <code>List</code>.
     * </p>
     * <p>
     * The <code>type</code> typically contains its own <code>kind</code> and <code>name</code> fields to represent the
     * actual type data. For instance, <code>type</code> could contain a <code>kind</code> value of <code>Scalar</code>
     * with a <code>name</code> value of <code>String</code>. The values <code>Scalar</code> and <code>String</code>
     * will be collectively stored in the <code>values</code> field.
     * </p>
     * 
     * @param type
     *        The <code>DataSourceIntrospectionModelFieldType</code> object data. The <code>type</code> is only present
     *        if <code>DataSourceIntrospectionModelFieldType.kind</code> is set to <code>NonNull</code> or
     *        <code>List</code>. </p>
     *        <p>
     *        The <code>type</code> typically contains its own <code>kind</code> and <code>name</code> fields to
     *        represent the actual type data. For instance, <code>type</code> could contain a <code>kind</code> value of
     *        <code>Scalar</code> with a <code>name</code> value of <code>String</code>. The values <code>Scalar</code>
     *        and <code>String</code> will be collectively stored in the <code>values</code> field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceIntrospectionModelFieldType withType(DataSourceIntrospectionModelFieldType type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The values of the <code>type</code> field. This field represents the AppSync data type equivalent of the
     * introspected field.
     * </p>
     * 
     * @return The values of the <code>type</code> field. This field represents the AppSync data type equivalent of the
     *         introspected field.
     */

    public java.util.List<String> getValues() {
        return values;
    }

    /**
     * <p>
     * The values of the <code>type</code> field. This field represents the AppSync data type equivalent of the
     * introspected field.
     * </p>
     * 
     * @param values
     *        The values of the <code>type</code> field. This field represents the AppSync data type equivalent of the
     *        introspected field.
     */

    public void setValues(java.util.Collection<String> values) {
        if (values == null) {
            this.values = null;
            return;
        }

        this.values = new java.util.ArrayList<String>(values);
    }

    /**
     * <p>
     * The values of the <code>type</code> field. This field represents the AppSync data type equivalent of the
     * introspected field.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setValues(java.util.Collection)} or {@link #withValues(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param values
     *        The values of the <code>type</code> field. This field represents the AppSync data type equivalent of the
     *        introspected field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceIntrospectionModelFieldType withValues(String... values) {
        if (this.values == null) {
            setValues(new java.util.ArrayList<String>(values.length));
        }
        for (String ele : values) {
            this.values.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The values of the <code>type</code> field. This field represents the AppSync data type equivalent of the
     * introspected field.
     * </p>
     * 
     * @param values
     *        The values of the <code>type</code> field. This field represents the AppSync data type equivalent of the
     *        introspected field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceIntrospectionModelFieldType withValues(java.util.Collection<String> values) {
        setValues(values);
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
        if (getKind() != null)
            sb.append("Kind: ").append(getKind()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getValues() != null)
            sb.append("Values: ").append(getValues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataSourceIntrospectionModelFieldType == false)
            return false;
        DataSourceIntrospectionModelFieldType other = (DataSourceIntrospectionModelFieldType) obj;
        if (other.getKind() == null ^ this.getKind() == null)
            return false;
        if (other.getKind() != null && other.getKind().equals(this.getKind()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getValues() == null ^ this.getValues() == null)
            return false;
        if (other.getValues() != null && other.getValues().equals(this.getValues()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKind() == null) ? 0 : getKind().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getValues() == null) ? 0 : getValues().hashCode());
        return hashCode;
    }

    @Override
    public DataSourceIntrospectionModelFieldType clone() {
        try {
            return (DataSourceIntrospectionModelFieldType) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appsync.model.transform.DataSourceIntrospectionModelFieldTypeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
