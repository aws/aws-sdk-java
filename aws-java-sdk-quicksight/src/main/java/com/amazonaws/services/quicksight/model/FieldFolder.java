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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A FieldFolder element is a folder that contains fields and nested subfolders.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/FieldFolder" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FieldFolder implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The description for a field folder.
     * </p>
     */
    private String description;
    /**
     * <p>
     * A folder has a list of columns. A column can only be in one folder.
     * </p>
     */
    private java.util.List<String> columns;

    /**
     * <p>
     * The description for a field folder.
     * </p>
     * 
     * @param description
     *        The description for a field folder.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description for a field folder.
     * </p>
     * 
     * @return The description for a field folder.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description for a field folder.
     * </p>
     * 
     * @param description
     *        The description for a field folder.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FieldFolder withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * A folder has a list of columns. A column can only be in one folder.
     * </p>
     * 
     * @return A folder has a list of columns. A column can only be in one folder.
     */

    public java.util.List<String> getColumns() {
        return columns;
    }

    /**
     * <p>
     * A folder has a list of columns. A column can only be in one folder.
     * </p>
     * 
     * @param columns
     *        A folder has a list of columns. A column can only be in one folder.
     */

    public void setColumns(java.util.Collection<String> columns) {
        if (columns == null) {
            this.columns = null;
            return;
        }

        this.columns = new java.util.ArrayList<String>(columns);
    }

    /**
     * <p>
     * A folder has a list of columns. A column can only be in one folder.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setColumns(java.util.Collection)} or {@link #withColumns(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param columns
     *        A folder has a list of columns. A column can only be in one folder.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FieldFolder withColumns(String... columns) {
        if (this.columns == null) {
            setColumns(new java.util.ArrayList<String>(columns.length));
        }
        for (String ele : columns) {
            this.columns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A folder has a list of columns. A column can only be in one folder.
     * </p>
     * 
     * @param columns
     *        A folder has a list of columns. A column can only be in one folder.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FieldFolder withColumns(java.util.Collection<String> columns) {
        setColumns(columns);
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getColumns() != null)
            sb.append("Columns: ").append(getColumns());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FieldFolder == false)
            return false;
        FieldFolder other = (FieldFolder) obj;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getColumns() == null ^ this.getColumns() == null)
            return false;
        if (other.getColumns() != null && other.getColumns().equals(this.getColumns()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getColumns() == null) ? 0 : getColumns().hashCode());
        return hashCode;
    }

    @Override
    public FieldFolder clone() {
        try {
            return (FieldFolder) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.FieldFolderMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
