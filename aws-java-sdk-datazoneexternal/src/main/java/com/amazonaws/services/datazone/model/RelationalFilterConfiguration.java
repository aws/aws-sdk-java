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
package com.amazonaws.services.datazone.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The relational filter configuration for the data source.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/RelationalFilterConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RelationalFilterConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The database name specified in the relational filter configuration for the data source.
     * </p>
     */
    private String databaseName;
    /**
     * <p>
     * The filter expressions specified in the relational filter configuration for the data source.
     * </p>
     */
    private java.util.List<FilterExpression> filterExpressions;
    /**
     * <p>
     * The schema name specified in the relational filter configuration for the data source.
     * </p>
     */
    private String schemaName;

    /**
     * <p>
     * The database name specified in the relational filter configuration for the data source.
     * </p>
     * 
     * @param databaseName
     *        The database name specified in the relational filter configuration for the data source.
     */

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    /**
     * <p>
     * The database name specified in the relational filter configuration for the data source.
     * </p>
     * 
     * @return The database name specified in the relational filter configuration for the data source.
     */

    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * <p>
     * The database name specified in the relational filter configuration for the data source.
     * </p>
     * 
     * @param databaseName
     *        The database name specified in the relational filter configuration for the data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RelationalFilterConfiguration withDatabaseName(String databaseName) {
        setDatabaseName(databaseName);
        return this;
    }

    /**
     * <p>
     * The filter expressions specified in the relational filter configuration for the data source.
     * </p>
     * 
     * @return The filter expressions specified in the relational filter configuration for the data source.
     */

    public java.util.List<FilterExpression> getFilterExpressions() {
        return filterExpressions;
    }

    /**
     * <p>
     * The filter expressions specified in the relational filter configuration for the data source.
     * </p>
     * 
     * @param filterExpressions
     *        The filter expressions specified in the relational filter configuration for the data source.
     */

    public void setFilterExpressions(java.util.Collection<FilterExpression> filterExpressions) {
        if (filterExpressions == null) {
            this.filterExpressions = null;
            return;
        }

        this.filterExpressions = new java.util.ArrayList<FilterExpression>(filterExpressions);
    }

    /**
     * <p>
     * The filter expressions specified in the relational filter configuration for the data source.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilterExpressions(java.util.Collection)} or {@link #withFilterExpressions(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param filterExpressions
     *        The filter expressions specified in the relational filter configuration for the data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RelationalFilterConfiguration withFilterExpressions(FilterExpression... filterExpressions) {
        if (this.filterExpressions == null) {
            setFilterExpressions(new java.util.ArrayList<FilterExpression>(filterExpressions.length));
        }
        for (FilterExpression ele : filterExpressions) {
            this.filterExpressions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The filter expressions specified in the relational filter configuration for the data source.
     * </p>
     * 
     * @param filterExpressions
     *        The filter expressions specified in the relational filter configuration for the data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RelationalFilterConfiguration withFilterExpressions(java.util.Collection<FilterExpression> filterExpressions) {
        setFilterExpressions(filterExpressions);
        return this;
    }

    /**
     * <p>
     * The schema name specified in the relational filter configuration for the data source.
     * </p>
     * 
     * @param schemaName
     *        The schema name specified in the relational filter configuration for the data source.
     */

    public void setSchemaName(String schemaName) {
        this.schemaName = schemaName;
    }

    /**
     * <p>
     * The schema name specified in the relational filter configuration for the data source.
     * </p>
     * 
     * @return The schema name specified in the relational filter configuration for the data source.
     */

    public String getSchemaName() {
        return this.schemaName;
    }

    /**
     * <p>
     * The schema name specified in the relational filter configuration for the data source.
     * </p>
     * 
     * @param schemaName
     *        The schema name specified in the relational filter configuration for the data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RelationalFilterConfiguration withSchemaName(String schemaName) {
        setSchemaName(schemaName);
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
        if (getDatabaseName() != null)
            sb.append("DatabaseName: ").append(getDatabaseName()).append(",");
        if (getFilterExpressions() != null)
            sb.append("FilterExpressions: ").append(getFilterExpressions()).append(",");
        if (getSchemaName() != null)
            sb.append("SchemaName: ").append(getSchemaName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RelationalFilterConfiguration == false)
            return false;
        RelationalFilterConfiguration other = (RelationalFilterConfiguration) obj;
        if (other.getDatabaseName() == null ^ this.getDatabaseName() == null)
            return false;
        if (other.getDatabaseName() != null && other.getDatabaseName().equals(this.getDatabaseName()) == false)
            return false;
        if (other.getFilterExpressions() == null ^ this.getFilterExpressions() == null)
            return false;
        if (other.getFilterExpressions() != null && other.getFilterExpressions().equals(this.getFilterExpressions()) == false)
            return false;
        if (other.getSchemaName() == null ^ this.getSchemaName() == null)
            return false;
        if (other.getSchemaName() != null && other.getSchemaName().equals(this.getSchemaName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDatabaseName() == null) ? 0 : getDatabaseName().hashCode());
        hashCode = prime * hashCode + ((getFilterExpressions() == null) ? 0 : getFilterExpressions().hashCode());
        hashCode = prime * hashCode + ((getSchemaName() == null) ? 0 : getSchemaName().hashCode());
        return hashCode;
    }

    @Override
    public RelationalFilterConfiguration clone() {
        try {
            return (RelationalFilterConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.datazone.model.transform.RelationalFilterConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
