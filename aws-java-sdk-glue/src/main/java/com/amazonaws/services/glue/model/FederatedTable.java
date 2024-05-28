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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A table that points to an entity outside the Glue Data Catalog.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/FederatedTable" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FederatedTable implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A unique identifier for the federated table.
     * </p>
     */
    private String identifier;
    /**
     * <p>
     * A unique identifier for the federated database.
     * </p>
     */
    private String databaseIdentifier;
    /**
     * <p>
     * The name of the connection to the external metastore.
     * </p>
     */
    private String connectionName;

    /**
     * <p>
     * A unique identifier for the federated table.
     * </p>
     * 
     * @param identifier
     *        A unique identifier for the federated table.
     */

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    /**
     * <p>
     * A unique identifier for the federated table.
     * </p>
     * 
     * @return A unique identifier for the federated table.
     */

    public String getIdentifier() {
        return this.identifier;
    }

    /**
     * <p>
     * A unique identifier for the federated table.
     * </p>
     * 
     * @param identifier
     *        A unique identifier for the federated table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FederatedTable withIdentifier(String identifier) {
        setIdentifier(identifier);
        return this;
    }

    /**
     * <p>
     * A unique identifier for the federated database.
     * </p>
     * 
     * @param databaseIdentifier
     *        A unique identifier for the federated database.
     */

    public void setDatabaseIdentifier(String databaseIdentifier) {
        this.databaseIdentifier = databaseIdentifier;
    }

    /**
     * <p>
     * A unique identifier for the federated database.
     * </p>
     * 
     * @return A unique identifier for the federated database.
     */

    public String getDatabaseIdentifier() {
        return this.databaseIdentifier;
    }

    /**
     * <p>
     * A unique identifier for the federated database.
     * </p>
     * 
     * @param databaseIdentifier
     *        A unique identifier for the federated database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FederatedTable withDatabaseIdentifier(String databaseIdentifier) {
        setDatabaseIdentifier(databaseIdentifier);
        return this;
    }

    /**
     * <p>
     * The name of the connection to the external metastore.
     * </p>
     * 
     * @param connectionName
     *        The name of the connection to the external metastore.
     */

    public void setConnectionName(String connectionName) {
        this.connectionName = connectionName;
    }

    /**
     * <p>
     * The name of the connection to the external metastore.
     * </p>
     * 
     * @return The name of the connection to the external metastore.
     */

    public String getConnectionName() {
        return this.connectionName;
    }

    /**
     * <p>
     * The name of the connection to the external metastore.
     * </p>
     * 
     * @param connectionName
     *        The name of the connection to the external metastore.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FederatedTable withConnectionName(String connectionName) {
        setConnectionName(connectionName);
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
        if (getIdentifier() != null)
            sb.append("Identifier: ").append(getIdentifier()).append(",");
        if (getDatabaseIdentifier() != null)
            sb.append("DatabaseIdentifier: ").append(getDatabaseIdentifier()).append(",");
        if (getConnectionName() != null)
            sb.append("ConnectionName: ").append(getConnectionName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FederatedTable == false)
            return false;
        FederatedTable other = (FederatedTable) obj;
        if (other.getIdentifier() == null ^ this.getIdentifier() == null)
            return false;
        if (other.getIdentifier() != null && other.getIdentifier().equals(this.getIdentifier()) == false)
            return false;
        if (other.getDatabaseIdentifier() == null ^ this.getDatabaseIdentifier() == null)
            return false;
        if (other.getDatabaseIdentifier() != null && other.getDatabaseIdentifier().equals(this.getDatabaseIdentifier()) == false)
            return false;
        if (other.getConnectionName() == null ^ this.getConnectionName() == null)
            return false;
        if (other.getConnectionName() != null && other.getConnectionName().equals(this.getConnectionName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIdentifier() == null) ? 0 : getIdentifier().hashCode());
        hashCode = prime * hashCode + ((getDatabaseIdentifier() == null) ? 0 : getDatabaseIdentifier().hashCode());
        hashCode = prime * hashCode + ((getConnectionName() == null) ? 0 : getConnectionName().hashCode());
        return hashCode;
    }

    @Override
    public FederatedTable clone() {
        try {
            return (FederatedTable) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.FederatedTableMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
