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
 * The SQL query of column selections and row filters from the data table you want.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bcm-data-exports-2023-11-26/DataQuery" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataQuery implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The query statement.
     * </p>
     */
    private String queryStatement;
    /**
     * <p>
     * The table configuration.
     * </p>
     */
    private java.util.Map<String, java.util.Map<String, String>> tableConfigurations;

    /**
     * <p>
     * The query statement.
     * </p>
     * 
     * @param queryStatement
     *        The query statement.
     */

    public void setQueryStatement(String queryStatement) {
        this.queryStatement = queryStatement;
    }

    /**
     * <p>
     * The query statement.
     * </p>
     * 
     * @return The query statement.
     */

    public String getQueryStatement() {
        return this.queryStatement;
    }

    /**
     * <p>
     * The query statement.
     * </p>
     * 
     * @param queryStatement
     *        The query statement.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataQuery withQueryStatement(String queryStatement) {
        setQueryStatement(queryStatement);
        return this;
    }

    /**
     * <p>
     * The table configuration.
     * </p>
     * 
     * @return The table configuration.
     */

    public java.util.Map<String, java.util.Map<String, String>> getTableConfigurations() {
        return tableConfigurations;
    }

    /**
     * <p>
     * The table configuration.
     * </p>
     * 
     * @param tableConfigurations
     *        The table configuration.
     */

    public void setTableConfigurations(java.util.Map<String, java.util.Map<String, String>> tableConfigurations) {
        this.tableConfigurations = tableConfigurations;
    }

    /**
     * <p>
     * The table configuration.
     * </p>
     * 
     * @param tableConfigurations
     *        The table configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataQuery withTableConfigurations(java.util.Map<String, java.util.Map<String, String>> tableConfigurations) {
        setTableConfigurations(tableConfigurations);
        return this;
    }

    /**
     * Add a single TableConfigurations entry
     *
     * @see DataQuery#withTableConfigurations
     * @returns a reference to this object so that method calls can be chained together.
     */

    public DataQuery addTableConfigurationsEntry(String key, java.util.Map<String, String> value) {
        if (null == this.tableConfigurations) {
            this.tableConfigurations = new java.util.HashMap<String, java.util.Map<String, String>>();
        }
        if (this.tableConfigurations.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tableConfigurations.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into TableConfigurations.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataQuery clearTableConfigurationsEntries() {
        this.tableConfigurations = null;
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
        if (getQueryStatement() != null)
            sb.append("QueryStatement: ").append(getQueryStatement()).append(",");
        if (getTableConfigurations() != null)
            sb.append("TableConfigurations: ").append(getTableConfigurations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataQuery == false)
            return false;
        DataQuery other = (DataQuery) obj;
        if (other.getQueryStatement() == null ^ this.getQueryStatement() == null)
            return false;
        if (other.getQueryStatement() != null && other.getQueryStatement().equals(this.getQueryStatement()) == false)
            return false;
        if (other.getTableConfigurations() == null ^ this.getTableConfigurations() == null)
            return false;
        if (other.getTableConfigurations() != null && other.getTableConfigurations().equals(this.getTableConfigurations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getQueryStatement() == null) ? 0 : getQueryStatement().hashCode());
        hashCode = prime * hashCode + ((getTableConfigurations() == null) ? 0 : getTableConfigurations().hashCode());
        return hashCode;
    }

    @Override
    public DataQuery clone() {
        try {
            return (DataQuery) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bcmdataexports.model.transform.DataQueryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
