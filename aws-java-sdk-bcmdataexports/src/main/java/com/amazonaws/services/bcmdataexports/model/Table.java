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
package com.amazonaws.services.bcmdataexports.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The details for the data export table.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bcm-data-exports-2023-11-26/Table" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Table implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The description for the table.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The name of the table.
     * </p>
     */
    private String tableName;
    /**
     * <p>
     * The properties for the table.
     * </p>
     */
    private java.util.List<TablePropertyDescription> tableProperties;

    /**
     * <p>
     * The description for the table.
     * </p>
     * 
     * @param description
     *        The description for the table.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description for the table.
     * </p>
     * 
     * @return The description for the table.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description for the table.
     * </p>
     * 
     * @param description
     *        The description for the table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Table withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The name of the table.
     * </p>
     * 
     * @param tableName
     *        The name of the table.
     */

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * <p>
     * The name of the table.
     * </p>
     * 
     * @return The name of the table.
     */

    public String getTableName() {
        return this.tableName;
    }

    /**
     * <p>
     * The name of the table.
     * </p>
     * 
     * @param tableName
     *        The name of the table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Table withTableName(String tableName) {
        setTableName(tableName);
        return this;
    }

    /**
     * <p>
     * The properties for the table.
     * </p>
     * 
     * @return The properties for the table.
     */

    public java.util.List<TablePropertyDescription> getTableProperties() {
        return tableProperties;
    }

    /**
     * <p>
     * The properties for the table.
     * </p>
     * 
     * @param tableProperties
     *        The properties for the table.
     */

    public void setTableProperties(java.util.Collection<TablePropertyDescription> tableProperties) {
        if (tableProperties == null) {
            this.tableProperties = null;
            return;
        }

        this.tableProperties = new java.util.ArrayList<TablePropertyDescription>(tableProperties);
    }

    /**
     * <p>
     * The properties for the table.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTableProperties(java.util.Collection)} or {@link #withTableProperties(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param tableProperties
     *        The properties for the table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Table withTableProperties(TablePropertyDescription... tableProperties) {
        if (this.tableProperties == null) {
            setTableProperties(new java.util.ArrayList<TablePropertyDescription>(tableProperties.length));
        }
        for (TablePropertyDescription ele : tableProperties) {
            this.tableProperties.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The properties for the table.
     * </p>
     * 
     * @param tableProperties
     *        The properties for the table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Table withTableProperties(java.util.Collection<TablePropertyDescription> tableProperties) {
        setTableProperties(tableProperties);
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
        if (getTableName() != null)
            sb.append("TableName: ").append(getTableName()).append(",");
        if (getTableProperties() != null)
            sb.append("TableProperties: ").append(getTableProperties());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Table == false)
            return false;
        Table other = (Table) obj;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getTableName() == null ^ this.getTableName() == null)
            return false;
        if (other.getTableName() != null && other.getTableName().equals(this.getTableName()) == false)
            return false;
        if (other.getTableProperties() == null ^ this.getTableProperties() == null)
            return false;
        if (other.getTableProperties() != null && other.getTableProperties().equals(this.getTableProperties()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getTableName() == null) ? 0 : getTableName().hashCode());
        hashCode = prime * hashCode + ((getTableProperties() == null) ? 0 : getTableProperties().hashCode());
        return hashCode;
    }

    @Override
    public Table clone() {
        try {
            return (Table) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bcmdataexports.model.transform.TableMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
