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
package com.amazonaws.services.keyspaces.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Returns the name of the specified table, the keyspace it is stored in, and the unique identifier in the format of an
 * Amazon Resource Name (ARN).
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/keyspaces-2022-02-10/TableSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TableSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the keyspace that the table is stored in.
     * </p>
     */
    private String keyspaceName;
    /**
     * <p>
     * The name of the table.
     * </p>
     */
    private String tableName;
    /**
     * <p>
     * The unique identifier of the table in the format of an Amazon Resource Name (ARN).
     * </p>
     */
    private String resourceArn;

    /**
     * <p>
     * The name of the keyspace that the table is stored in.
     * </p>
     * 
     * @param keyspaceName
     *        The name of the keyspace that the table is stored in.
     */

    public void setKeyspaceName(String keyspaceName) {
        this.keyspaceName = keyspaceName;
    }

    /**
     * <p>
     * The name of the keyspace that the table is stored in.
     * </p>
     * 
     * @return The name of the keyspace that the table is stored in.
     */

    public String getKeyspaceName() {
        return this.keyspaceName;
    }

    /**
     * <p>
     * The name of the keyspace that the table is stored in.
     * </p>
     * 
     * @param keyspaceName
     *        The name of the keyspace that the table is stored in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableSummary withKeyspaceName(String keyspaceName) {
        setKeyspaceName(keyspaceName);
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

    public TableSummary withTableName(String tableName) {
        setTableName(tableName);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the table in the format of an Amazon Resource Name (ARN).
     * </p>
     * 
     * @param resourceArn
     *        The unique identifier of the table in the format of an Amazon Resource Name (ARN).
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The unique identifier of the table in the format of an Amazon Resource Name (ARN).
     * </p>
     * 
     * @return The unique identifier of the table in the format of an Amazon Resource Name (ARN).
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p>
     * The unique identifier of the table in the format of an Amazon Resource Name (ARN).
     * </p>
     * 
     * @param resourceArn
     *        The unique identifier of the table in the format of an Amazon Resource Name (ARN).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableSummary withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
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
        if (getKeyspaceName() != null)
            sb.append("KeyspaceName: ").append(getKeyspaceName()).append(",");
        if (getTableName() != null)
            sb.append("TableName: ").append(getTableName()).append(",");
        if (getResourceArn() != null)
            sb.append("ResourceArn: ").append(getResourceArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TableSummary == false)
            return false;
        TableSummary other = (TableSummary) obj;
        if (other.getKeyspaceName() == null ^ this.getKeyspaceName() == null)
            return false;
        if (other.getKeyspaceName() != null && other.getKeyspaceName().equals(this.getKeyspaceName()) == false)
            return false;
        if (other.getTableName() == null ^ this.getTableName() == null)
            return false;
        if (other.getTableName() != null && other.getTableName().equals(this.getTableName()) == false)
            return false;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKeyspaceName() == null) ? 0 : getKeyspaceName().hashCode());
        hashCode = prime * hashCode + ((getTableName() == null) ? 0 : getTableName().hashCode());
        hashCode = prime * hashCode + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        return hashCode;
    }

    @Override
    public TableSummary clone() {
        try {
            return (TableSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.keyspaces.model.transform.TableSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
