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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A policy that specifies update behavior for the crawler.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/DirectSchemaChangePolicy" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DirectSchemaChangePolicy implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Whether to use the specified update behavior when the crawler finds a changed schema.
     * </p>
     */
    private Boolean enableUpdateCatalog;
    /**
     * <p>
     * The update behavior when the crawler finds a changed schema.
     * </p>
     */
    private String updateBehavior;
    /**
     * <p>
     * Specifies the table in the database that the schema change policy applies to.
     * </p>
     */
    private String table;
    /**
     * <p>
     * Specifies the database that the schema change policy applies to.
     * </p>
     */
    private String database;

    /**
     * <p>
     * Whether to use the specified update behavior when the crawler finds a changed schema.
     * </p>
     * 
     * @param enableUpdateCatalog
     *        Whether to use the specified update behavior when the crawler finds a changed schema.
     */

    public void setEnableUpdateCatalog(Boolean enableUpdateCatalog) {
        this.enableUpdateCatalog = enableUpdateCatalog;
    }

    /**
     * <p>
     * Whether to use the specified update behavior when the crawler finds a changed schema.
     * </p>
     * 
     * @return Whether to use the specified update behavior when the crawler finds a changed schema.
     */

    public Boolean getEnableUpdateCatalog() {
        return this.enableUpdateCatalog;
    }

    /**
     * <p>
     * Whether to use the specified update behavior when the crawler finds a changed schema.
     * </p>
     * 
     * @param enableUpdateCatalog
     *        Whether to use the specified update behavior when the crawler finds a changed schema.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DirectSchemaChangePolicy withEnableUpdateCatalog(Boolean enableUpdateCatalog) {
        setEnableUpdateCatalog(enableUpdateCatalog);
        return this;
    }

    /**
     * <p>
     * Whether to use the specified update behavior when the crawler finds a changed schema.
     * </p>
     * 
     * @return Whether to use the specified update behavior when the crawler finds a changed schema.
     */

    public Boolean isEnableUpdateCatalog() {
        return this.enableUpdateCatalog;
    }

    /**
     * <p>
     * The update behavior when the crawler finds a changed schema.
     * </p>
     * 
     * @param updateBehavior
     *        The update behavior when the crawler finds a changed schema.
     * @see UpdateCatalogBehavior
     */

    public void setUpdateBehavior(String updateBehavior) {
        this.updateBehavior = updateBehavior;
    }

    /**
     * <p>
     * The update behavior when the crawler finds a changed schema.
     * </p>
     * 
     * @return The update behavior when the crawler finds a changed schema.
     * @see UpdateCatalogBehavior
     */

    public String getUpdateBehavior() {
        return this.updateBehavior;
    }

    /**
     * <p>
     * The update behavior when the crawler finds a changed schema.
     * </p>
     * 
     * @param updateBehavior
     *        The update behavior when the crawler finds a changed schema.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UpdateCatalogBehavior
     */

    public DirectSchemaChangePolicy withUpdateBehavior(String updateBehavior) {
        setUpdateBehavior(updateBehavior);
        return this;
    }

    /**
     * <p>
     * The update behavior when the crawler finds a changed schema.
     * </p>
     * 
     * @param updateBehavior
     *        The update behavior when the crawler finds a changed schema.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UpdateCatalogBehavior
     */

    public DirectSchemaChangePolicy withUpdateBehavior(UpdateCatalogBehavior updateBehavior) {
        this.updateBehavior = updateBehavior.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the table in the database that the schema change policy applies to.
     * </p>
     * 
     * @param table
     *        Specifies the table in the database that the schema change policy applies to.
     */

    public void setTable(String table) {
        this.table = table;
    }

    /**
     * <p>
     * Specifies the table in the database that the schema change policy applies to.
     * </p>
     * 
     * @return Specifies the table in the database that the schema change policy applies to.
     */

    public String getTable() {
        return this.table;
    }

    /**
     * <p>
     * Specifies the table in the database that the schema change policy applies to.
     * </p>
     * 
     * @param table
     *        Specifies the table in the database that the schema change policy applies to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DirectSchemaChangePolicy withTable(String table) {
        setTable(table);
        return this;
    }

    /**
     * <p>
     * Specifies the database that the schema change policy applies to.
     * </p>
     * 
     * @param database
     *        Specifies the database that the schema change policy applies to.
     */

    public void setDatabase(String database) {
        this.database = database;
    }

    /**
     * <p>
     * Specifies the database that the schema change policy applies to.
     * </p>
     * 
     * @return Specifies the database that the schema change policy applies to.
     */

    public String getDatabase() {
        return this.database;
    }

    /**
     * <p>
     * Specifies the database that the schema change policy applies to.
     * </p>
     * 
     * @param database
     *        Specifies the database that the schema change policy applies to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DirectSchemaChangePolicy withDatabase(String database) {
        setDatabase(database);
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
        if (getEnableUpdateCatalog() != null)
            sb.append("EnableUpdateCatalog: ").append(getEnableUpdateCatalog()).append(",");
        if (getUpdateBehavior() != null)
            sb.append("UpdateBehavior: ").append(getUpdateBehavior()).append(",");
        if (getTable() != null)
            sb.append("Table: ").append(getTable()).append(",");
        if (getDatabase() != null)
            sb.append("Database: ").append(getDatabase());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DirectSchemaChangePolicy == false)
            return false;
        DirectSchemaChangePolicy other = (DirectSchemaChangePolicy) obj;
        if (other.getEnableUpdateCatalog() == null ^ this.getEnableUpdateCatalog() == null)
            return false;
        if (other.getEnableUpdateCatalog() != null && other.getEnableUpdateCatalog().equals(this.getEnableUpdateCatalog()) == false)
            return false;
        if (other.getUpdateBehavior() == null ^ this.getUpdateBehavior() == null)
            return false;
        if (other.getUpdateBehavior() != null && other.getUpdateBehavior().equals(this.getUpdateBehavior()) == false)
            return false;
        if (other.getTable() == null ^ this.getTable() == null)
            return false;
        if (other.getTable() != null && other.getTable().equals(this.getTable()) == false)
            return false;
        if (other.getDatabase() == null ^ this.getDatabase() == null)
            return false;
        if (other.getDatabase() != null && other.getDatabase().equals(this.getDatabase()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnableUpdateCatalog() == null) ? 0 : getEnableUpdateCatalog().hashCode());
        hashCode = prime * hashCode + ((getUpdateBehavior() == null) ? 0 : getUpdateBehavior().hashCode());
        hashCode = prime * hashCode + ((getTable() == null) ? 0 : getTable().hashCode());
        hashCode = prime * hashCode + ((getDatabase() == null) ? 0 : getDatabase().hashCode());
        return hashCode;
    }

    @Override
    public DirectSchemaChangePolicy clone() {
        try {
            return (DirectSchemaChangePolicy) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.DirectSchemaChangePolicyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
