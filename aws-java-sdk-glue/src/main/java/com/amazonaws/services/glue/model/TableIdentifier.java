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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A structure that describes a target table for resource linking.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/TableIdentifier" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TableIdentifier implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the Data Catalog in which the table resides.
     * </p>
     */
    private String catalogId;
    /**
     * <p>
     * The name of the catalog database that contains the target table.
     * </p>
     */
    private String databaseName;
    /**
     * <p>
     * The name of the target table.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The ID of the Data Catalog in which the table resides.
     * </p>
     * 
     * @param catalogId
     *        The ID of the Data Catalog in which the table resides.
     */

    public void setCatalogId(String catalogId) {
        this.catalogId = catalogId;
    }

    /**
     * <p>
     * The ID of the Data Catalog in which the table resides.
     * </p>
     * 
     * @return The ID of the Data Catalog in which the table resides.
     */

    public String getCatalogId() {
        return this.catalogId;
    }

    /**
     * <p>
     * The ID of the Data Catalog in which the table resides.
     * </p>
     * 
     * @param catalogId
     *        The ID of the Data Catalog in which the table resides.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableIdentifier withCatalogId(String catalogId) {
        setCatalogId(catalogId);
        return this;
    }

    /**
     * <p>
     * The name of the catalog database that contains the target table.
     * </p>
     * 
     * @param databaseName
     *        The name of the catalog database that contains the target table.
     */

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    /**
     * <p>
     * The name of the catalog database that contains the target table.
     * </p>
     * 
     * @return The name of the catalog database that contains the target table.
     */

    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * <p>
     * The name of the catalog database that contains the target table.
     * </p>
     * 
     * @param databaseName
     *        The name of the catalog database that contains the target table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableIdentifier withDatabaseName(String databaseName) {
        setDatabaseName(databaseName);
        return this;
    }

    /**
     * <p>
     * The name of the target table.
     * </p>
     * 
     * @param name
     *        The name of the target table.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the target table.
     * </p>
     * 
     * @return The name of the target table.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the target table.
     * </p>
     * 
     * @param name
     *        The name of the target table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableIdentifier withName(String name) {
        setName(name);
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
        if (getCatalogId() != null)
            sb.append("CatalogId: ").append(getCatalogId()).append(",");
        if (getDatabaseName() != null)
            sb.append("DatabaseName: ").append(getDatabaseName()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TableIdentifier == false)
            return false;
        TableIdentifier other = (TableIdentifier) obj;
        if (other.getCatalogId() == null ^ this.getCatalogId() == null)
            return false;
        if (other.getCatalogId() != null && other.getCatalogId().equals(this.getCatalogId()) == false)
            return false;
        if (other.getDatabaseName() == null ^ this.getDatabaseName() == null)
            return false;
        if (other.getDatabaseName() != null && other.getDatabaseName().equals(this.getDatabaseName()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCatalogId() == null) ? 0 : getCatalogId().hashCode());
        hashCode = prime * hashCode + ((getDatabaseName() == null) ? 0 : getDatabaseName().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public TableIdentifier clone() {
        try {
            return (TableIdentifier) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.TableIdentifierMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
