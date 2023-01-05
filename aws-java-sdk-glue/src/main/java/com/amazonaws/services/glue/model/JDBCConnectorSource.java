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
 * Specifies a connector to a JDBC data source.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/JDBCConnectorSource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JDBCConnectorSource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the data source.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The name of the connection that is associated with the connector.
     * </p>
     */
    private String connectionName;
    /**
     * <p>
     * The name of a connector that assists with accessing the data store in Glue Studio.
     * </p>
     */
    private String connectorName;
    /**
     * <p>
     * The type of connection, such as marketplace.jdbc or custom.jdbc, designating a connection to a JDBC data store.
     * </p>
     */
    private String connectionType;
    /**
     * <p>
     * Additional connection options for the connector.
     * </p>
     */
    private JDBCConnectorOptions additionalOptions;
    /**
     * <p>
     * The name of the table in the data source.
     * </p>
     */
    private String connectionTable;
    /**
     * <p>
     * The table or SQL query to get the data from. You can specify either <code>ConnectionTable</code> or
     * <code>query</code>, but not both.
     * </p>
     */
    private String query;
    /**
     * <p>
     * Specifies the data schema for the custom JDBC source.
     * </p>
     */
    private java.util.List<GlueSchema> outputSchemas;

    /**
     * <p>
     * The name of the data source.
     * </p>
     * 
     * @param name
     *        The name of the data source.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the data source.
     * </p>
     * 
     * @return The name of the data source.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the data source.
     * </p>
     * 
     * @param name
     *        The name of the data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JDBCConnectorSource withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The name of the connection that is associated with the connector.
     * </p>
     * 
     * @param connectionName
     *        The name of the connection that is associated with the connector.
     */

    public void setConnectionName(String connectionName) {
        this.connectionName = connectionName;
    }

    /**
     * <p>
     * The name of the connection that is associated with the connector.
     * </p>
     * 
     * @return The name of the connection that is associated with the connector.
     */

    public String getConnectionName() {
        return this.connectionName;
    }

    /**
     * <p>
     * The name of the connection that is associated with the connector.
     * </p>
     * 
     * @param connectionName
     *        The name of the connection that is associated with the connector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JDBCConnectorSource withConnectionName(String connectionName) {
        setConnectionName(connectionName);
        return this;
    }

    /**
     * <p>
     * The name of a connector that assists with accessing the data store in Glue Studio.
     * </p>
     * 
     * @param connectorName
     *        The name of a connector that assists with accessing the data store in Glue Studio.
     */

    public void setConnectorName(String connectorName) {
        this.connectorName = connectorName;
    }

    /**
     * <p>
     * The name of a connector that assists with accessing the data store in Glue Studio.
     * </p>
     * 
     * @return The name of a connector that assists with accessing the data store in Glue Studio.
     */

    public String getConnectorName() {
        return this.connectorName;
    }

    /**
     * <p>
     * The name of a connector that assists with accessing the data store in Glue Studio.
     * </p>
     * 
     * @param connectorName
     *        The name of a connector that assists with accessing the data store in Glue Studio.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JDBCConnectorSource withConnectorName(String connectorName) {
        setConnectorName(connectorName);
        return this;
    }

    /**
     * <p>
     * The type of connection, such as marketplace.jdbc or custom.jdbc, designating a connection to a JDBC data store.
     * </p>
     * 
     * @param connectionType
     *        The type of connection, such as marketplace.jdbc or custom.jdbc, designating a connection to a JDBC data
     *        store.
     */

    public void setConnectionType(String connectionType) {
        this.connectionType = connectionType;
    }

    /**
     * <p>
     * The type of connection, such as marketplace.jdbc or custom.jdbc, designating a connection to a JDBC data store.
     * </p>
     * 
     * @return The type of connection, such as marketplace.jdbc or custom.jdbc, designating a connection to a JDBC data
     *         store.
     */

    public String getConnectionType() {
        return this.connectionType;
    }

    /**
     * <p>
     * The type of connection, such as marketplace.jdbc or custom.jdbc, designating a connection to a JDBC data store.
     * </p>
     * 
     * @param connectionType
     *        The type of connection, such as marketplace.jdbc or custom.jdbc, designating a connection to a JDBC data
     *        store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JDBCConnectorSource withConnectionType(String connectionType) {
        setConnectionType(connectionType);
        return this;
    }

    /**
     * <p>
     * Additional connection options for the connector.
     * </p>
     * 
     * @param additionalOptions
     *        Additional connection options for the connector.
     */

    public void setAdditionalOptions(JDBCConnectorOptions additionalOptions) {
        this.additionalOptions = additionalOptions;
    }

    /**
     * <p>
     * Additional connection options for the connector.
     * </p>
     * 
     * @return Additional connection options for the connector.
     */

    public JDBCConnectorOptions getAdditionalOptions() {
        return this.additionalOptions;
    }

    /**
     * <p>
     * Additional connection options for the connector.
     * </p>
     * 
     * @param additionalOptions
     *        Additional connection options for the connector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JDBCConnectorSource withAdditionalOptions(JDBCConnectorOptions additionalOptions) {
        setAdditionalOptions(additionalOptions);
        return this;
    }

    /**
     * <p>
     * The name of the table in the data source.
     * </p>
     * 
     * @param connectionTable
     *        The name of the table in the data source.
     */

    public void setConnectionTable(String connectionTable) {
        this.connectionTable = connectionTable;
    }

    /**
     * <p>
     * The name of the table in the data source.
     * </p>
     * 
     * @return The name of the table in the data source.
     */

    public String getConnectionTable() {
        return this.connectionTable;
    }

    /**
     * <p>
     * The name of the table in the data source.
     * </p>
     * 
     * @param connectionTable
     *        The name of the table in the data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JDBCConnectorSource withConnectionTable(String connectionTable) {
        setConnectionTable(connectionTable);
        return this;
    }

    /**
     * <p>
     * The table or SQL query to get the data from. You can specify either <code>ConnectionTable</code> or
     * <code>query</code>, but not both.
     * </p>
     * 
     * @param query
     *        The table or SQL query to get the data from. You can specify either <code>ConnectionTable</code> or
     *        <code>query</code>, but not both.
     */

    public void setQuery(String query) {
        this.query = query;
    }

    /**
     * <p>
     * The table or SQL query to get the data from. You can specify either <code>ConnectionTable</code> or
     * <code>query</code>, but not both.
     * </p>
     * 
     * @return The table or SQL query to get the data from. You can specify either <code>ConnectionTable</code> or
     *         <code>query</code>, but not both.
     */

    public String getQuery() {
        return this.query;
    }

    /**
     * <p>
     * The table or SQL query to get the data from. You can specify either <code>ConnectionTable</code> or
     * <code>query</code>, but not both.
     * </p>
     * 
     * @param query
     *        The table or SQL query to get the data from. You can specify either <code>ConnectionTable</code> or
     *        <code>query</code>, but not both.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JDBCConnectorSource withQuery(String query) {
        setQuery(query);
        return this;
    }

    /**
     * <p>
     * Specifies the data schema for the custom JDBC source.
     * </p>
     * 
     * @return Specifies the data schema for the custom JDBC source.
     */

    public java.util.List<GlueSchema> getOutputSchemas() {
        return outputSchemas;
    }

    /**
     * <p>
     * Specifies the data schema for the custom JDBC source.
     * </p>
     * 
     * @param outputSchemas
     *        Specifies the data schema for the custom JDBC source.
     */

    public void setOutputSchemas(java.util.Collection<GlueSchema> outputSchemas) {
        if (outputSchemas == null) {
            this.outputSchemas = null;
            return;
        }

        this.outputSchemas = new java.util.ArrayList<GlueSchema>(outputSchemas);
    }

    /**
     * <p>
     * Specifies the data schema for the custom JDBC source.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOutputSchemas(java.util.Collection)} or {@link #withOutputSchemas(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param outputSchemas
     *        Specifies the data schema for the custom JDBC source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JDBCConnectorSource withOutputSchemas(GlueSchema... outputSchemas) {
        if (this.outputSchemas == null) {
            setOutputSchemas(new java.util.ArrayList<GlueSchema>(outputSchemas.length));
        }
        for (GlueSchema ele : outputSchemas) {
            this.outputSchemas.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies the data schema for the custom JDBC source.
     * </p>
     * 
     * @param outputSchemas
     *        Specifies the data schema for the custom JDBC source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JDBCConnectorSource withOutputSchemas(java.util.Collection<GlueSchema> outputSchemas) {
        setOutputSchemas(outputSchemas);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getConnectionName() != null)
            sb.append("ConnectionName: ").append(getConnectionName()).append(",");
        if (getConnectorName() != null)
            sb.append("ConnectorName: ").append(getConnectorName()).append(",");
        if (getConnectionType() != null)
            sb.append("ConnectionType: ").append(getConnectionType()).append(",");
        if (getAdditionalOptions() != null)
            sb.append("AdditionalOptions: ").append(getAdditionalOptions()).append(",");
        if (getConnectionTable() != null)
            sb.append("ConnectionTable: ").append(getConnectionTable()).append(",");
        if (getQuery() != null)
            sb.append("Query: ").append(getQuery()).append(",");
        if (getOutputSchemas() != null)
            sb.append("OutputSchemas: ").append(getOutputSchemas());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof JDBCConnectorSource == false)
            return false;
        JDBCConnectorSource other = (JDBCConnectorSource) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getConnectionName() == null ^ this.getConnectionName() == null)
            return false;
        if (other.getConnectionName() != null && other.getConnectionName().equals(this.getConnectionName()) == false)
            return false;
        if (other.getConnectorName() == null ^ this.getConnectorName() == null)
            return false;
        if (other.getConnectorName() != null && other.getConnectorName().equals(this.getConnectorName()) == false)
            return false;
        if (other.getConnectionType() == null ^ this.getConnectionType() == null)
            return false;
        if (other.getConnectionType() != null && other.getConnectionType().equals(this.getConnectionType()) == false)
            return false;
        if (other.getAdditionalOptions() == null ^ this.getAdditionalOptions() == null)
            return false;
        if (other.getAdditionalOptions() != null && other.getAdditionalOptions().equals(this.getAdditionalOptions()) == false)
            return false;
        if (other.getConnectionTable() == null ^ this.getConnectionTable() == null)
            return false;
        if (other.getConnectionTable() != null && other.getConnectionTable().equals(this.getConnectionTable()) == false)
            return false;
        if (other.getQuery() == null ^ this.getQuery() == null)
            return false;
        if (other.getQuery() != null && other.getQuery().equals(this.getQuery()) == false)
            return false;
        if (other.getOutputSchemas() == null ^ this.getOutputSchemas() == null)
            return false;
        if (other.getOutputSchemas() != null && other.getOutputSchemas().equals(this.getOutputSchemas()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getConnectionName() == null) ? 0 : getConnectionName().hashCode());
        hashCode = prime * hashCode + ((getConnectorName() == null) ? 0 : getConnectorName().hashCode());
        hashCode = prime * hashCode + ((getConnectionType() == null) ? 0 : getConnectionType().hashCode());
        hashCode = prime * hashCode + ((getAdditionalOptions() == null) ? 0 : getAdditionalOptions().hashCode());
        hashCode = prime * hashCode + ((getConnectionTable() == null) ? 0 : getConnectionTable().hashCode());
        hashCode = prime * hashCode + ((getQuery() == null) ? 0 : getQuery().hashCode());
        hashCode = prime * hashCode + ((getOutputSchemas() == null) ? 0 : getOutputSchemas().hashCode());
        return hashCode;
    }

    @Override
    public JDBCConnectorSource clone() {
        try {
            return (JDBCConnectorSource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.JDBCConnectorSourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
