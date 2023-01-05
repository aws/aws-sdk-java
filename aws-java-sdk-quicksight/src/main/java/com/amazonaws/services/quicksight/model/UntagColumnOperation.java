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
 * A transform operation that removes tags associated with a column.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/UntagColumnOperation" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UntagColumnOperation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The column that this operation acts on.
     * </p>
     */
    private String columnName;
    /**
     * <p>
     * The column tags to remove from this column.
     * </p>
     */
    private java.util.List<String> tagNames;

    /**
     * <p>
     * The column that this operation acts on.
     * </p>
     * 
     * @param columnName
     *        The column that this operation acts on.
     */

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    /**
     * <p>
     * The column that this operation acts on.
     * </p>
     * 
     * @return The column that this operation acts on.
     */

    public String getColumnName() {
        return this.columnName;
    }

    /**
     * <p>
     * The column that this operation acts on.
     * </p>
     * 
     * @param columnName
     *        The column that this operation acts on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UntagColumnOperation withColumnName(String columnName) {
        setColumnName(columnName);
        return this;
    }

    /**
     * <p>
     * The column tags to remove from this column.
     * </p>
     * 
     * @return The column tags to remove from this column.
     * @see ColumnTagName
     */

    public java.util.List<String> getTagNames() {
        return tagNames;
    }

    /**
     * <p>
     * The column tags to remove from this column.
     * </p>
     * 
     * @param tagNames
     *        The column tags to remove from this column.
     * @see ColumnTagName
     */

    public void setTagNames(java.util.Collection<String> tagNames) {
        if (tagNames == null) {
            this.tagNames = null;
            return;
        }

        this.tagNames = new java.util.ArrayList<String>(tagNames);
    }

    /**
     * <p>
     * The column tags to remove from this column.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTagNames(java.util.Collection)} or {@link #withTagNames(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param tagNames
     *        The column tags to remove from this column.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ColumnTagName
     */

    public UntagColumnOperation withTagNames(String... tagNames) {
        if (this.tagNames == null) {
            setTagNames(new java.util.ArrayList<String>(tagNames.length));
        }
        for (String ele : tagNames) {
            this.tagNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The column tags to remove from this column.
     * </p>
     * 
     * @param tagNames
     *        The column tags to remove from this column.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ColumnTagName
     */

    public UntagColumnOperation withTagNames(java.util.Collection<String> tagNames) {
        setTagNames(tagNames);
        return this;
    }

    /**
     * <p>
     * The column tags to remove from this column.
     * </p>
     * 
     * @param tagNames
     *        The column tags to remove from this column.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ColumnTagName
     */

    public UntagColumnOperation withTagNames(ColumnTagName... tagNames) {
        java.util.ArrayList<String> tagNamesCopy = new java.util.ArrayList<String>(tagNames.length);
        for (ColumnTagName value : tagNames) {
            tagNamesCopy.add(value.toString());
        }
        if (getTagNames() == null) {
            setTagNames(tagNamesCopy);
        } else {
            getTagNames().addAll(tagNamesCopy);
        }
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
        if (getColumnName() != null)
            sb.append("ColumnName: ").append(getColumnName()).append(",");
        if (getTagNames() != null)
            sb.append("TagNames: ").append(getTagNames());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UntagColumnOperation == false)
            return false;
        UntagColumnOperation other = (UntagColumnOperation) obj;
        if (other.getColumnName() == null ^ this.getColumnName() == null)
            return false;
        if (other.getColumnName() != null && other.getColumnName().equals(this.getColumnName()) == false)
            return false;
        if (other.getTagNames() == null ^ this.getTagNames() == null)
            return false;
        if (other.getTagNames() != null && other.getTagNames().equals(this.getTagNames()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getColumnName() == null) ? 0 : getColumnName().hashCode());
        hashCode = prime * hashCode + ((getTagNames() == null) ? 0 : getTagNames().hashCode());
        return hashCode;
    }

    @Override
    public UntagColumnOperation clone() {
        try {
            return (UntagColumnOperation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.UntagColumnOperationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
