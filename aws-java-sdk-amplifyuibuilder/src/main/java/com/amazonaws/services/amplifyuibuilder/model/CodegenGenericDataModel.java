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
package com.amazonaws.services.amplifyuibuilder.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a model in a generic data schema.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifyuibuilder-2021-08-11/CodegenGenericDataModel"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CodegenGenericDataModel implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The fields in the generic data model.
     * </p>
     */
    private java.util.Map<String, CodegenGenericDataField> fields;
    /**
     * <p>
     * Specifies whether the generic data model is a join table.
     * </p>
     */
    private Boolean isJoinTable;
    /**
     * <p>
     * The primary keys of the generic data model.
     * </p>
     */
    private java.util.List<String> primaryKeys;

    /**
     * <p>
     * The fields in the generic data model.
     * </p>
     * 
     * @return The fields in the generic data model.
     */

    public java.util.Map<String, CodegenGenericDataField> getFields() {
        return fields;
    }

    /**
     * <p>
     * The fields in the generic data model.
     * </p>
     * 
     * @param fields
     *        The fields in the generic data model.
     */

    public void setFields(java.util.Map<String, CodegenGenericDataField> fields) {
        this.fields = fields;
    }

    /**
     * <p>
     * The fields in the generic data model.
     * </p>
     * 
     * @param fields
     *        The fields in the generic data model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodegenGenericDataModel withFields(java.util.Map<String, CodegenGenericDataField> fields) {
        setFields(fields);
        return this;
    }

    /**
     * Add a single Fields entry
     *
     * @see CodegenGenericDataModel#withFields
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CodegenGenericDataModel addFieldsEntry(String key, CodegenGenericDataField value) {
        if (null == this.fields) {
            this.fields = new java.util.HashMap<String, CodegenGenericDataField>();
        }
        if (this.fields.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.fields.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Fields.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodegenGenericDataModel clearFieldsEntries() {
        this.fields = null;
        return this;
    }

    /**
     * <p>
     * Specifies whether the generic data model is a join table.
     * </p>
     * 
     * @param isJoinTable
     *        Specifies whether the generic data model is a join table.
     */

    public void setIsJoinTable(Boolean isJoinTable) {
        this.isJoinTable = isJoinTable;
    }

    /**
     * <p>
     * Specifies whether the generic data model is a join table.
     * </p>
     * 
     * @return Specifies whether the generic data model is a join table.
     */

    public Boolean getIsJoinTable() {
        return this.isJoinTable;
    }

    /**
     * <p>
     * Specifies whether the generic data model is a join table.
     * </p>
     * 
     * @param isJoinTable
     *        Specifies whether the generic data model is a join table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodegenGenericDataModel withIsJoinTable(Boolean isJoinTable) {
        setIsJoinTable(isJoinTable);
        return this;
    }

    /**
     * <p>
     * Specifies whether the generic data model is a join table.
     * </p>
     * 
     * @return Specifies whether the generic data model is a join table.
     */

    public Boolean isJoinTable() {
        return this.isJoinTable;
    }

    /**
     * <p>
     * The primary keys of the generic data model.
     * </p>
     * 
     * @return The primary keys of the generic data model.
     */

    public java.util.List<String> getPrimaryKeys() {
        return primaryKeys;
    }

    /**
     * <p>
     * The primary keys of the generic data model.
     * </p>
     * 
     * @param primaryKeys
     *        The primary keys of the generic data model.
     */

    public void setPrimaryKeys(java.util.Collection<String> primaryKeys) {
        if (primaryKeys == null) {
            this.primaryKeys = null;
            return;
        }

        this.primaryKeys = new java.util.ArrayList<String>(primaryKeys);
    }

    /**
     * <p>
     * The primary keys of the generic data model.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPrimaryKeys(java.util.Collection)} or {@link #withPrimaryKeys(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param primaryKeys
     *        The primary keys of the generic data model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodegenGenericDataModel withPrimaryKeys(String... primaryKeys) {
        if (this.primaryKeys == null) {
            setPrimaryKeys(new java.util.ArrayList<String>(primaryKeys.length));
        }
        for (String ele : primaryKeys) {
            this.primaryKeys.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The primary keys of the generic data model.
     * </p>
     * 
     * @param primaryKeys
     *        The primary keys of the generic data model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodegenGenericDataModel withPrimaryKeys(java.util.Collection<String> primaryKeys) {
        setPrimaryKeys(primaryKeys);
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
        if (getFields() != null)
            sb.append("Fields: ").append(getFields()).append(",");
        if (getIsJoinTable() != null)
            sb.append("IsJoinTable: ").append(getIsJoinTable()).append(",");
        if (getPrimaryKeys() != null)
            sb.append("PrimaryKeys: ").append(getPrimaryKeys());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CodegenGenericDataModel == false)
            return false;
        CodegenGenericDataModel other = (CodegenGenericDataModel) obj;
        if (other.getFields() == null ^ this.getFields() == null)
            return false;
        if (other.getFields() != null && other.getFields().equals(this.getFields()) == false)
            return false;
        if (other.getIsJoinTable() == null ^ this.getIsJoinTable() == null)
            return false;
        if (other.getIsJoinTable() != null && other.getIsJoinTable().equals(this.getIsJoinTable()) == false)
            return false;
        if (other.getPrimaryKeys() == null ^ this.getPrimaryKeys() == null)
            return false;
        if (other.getPrimaryKeys() != null && other.getPrimaryKeys().equals(this.getPrimaryKeys()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFields() == null) ? 0 : getFields().hashCode());
        hashCode = prime * hashCode + ((getIsJoinTable() == null) ? 0 : getIsJoinTable().hashCode());
        hashCode = prime * hashCode + ((getPrimaryKeys() == null) ? 0 : getPrimaryKeys().hashCode());
        return hashCode;
    }

    @Override
    public CodegenGenericDataModel clone() {
        try {
            return (CodegenGenericDataModel) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.amplifyuibuilder.model.transform.CodegenGenericDataModelMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
