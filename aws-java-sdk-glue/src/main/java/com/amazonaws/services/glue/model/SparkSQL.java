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
 * Specifies a transform where you enter a SQL query using Spark SQL syntax to transform the data. The output is a
 * single <code>DynamicFrame</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/SparkSQL" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SparkSQL implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the transform node.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The data inputs identified by their node names. You can associate a table name with each input node to use in the
     * SQL query. The name you choose must meet the Spark SQL naming restrictions.
     * </p>
     */
    private java.util.List<String> inputs;
    /**
     * <p>
     * A SQL query that must use Spark SQL syntax and return a single data set.
     * </p>
     */
    private String sqlQuery;
    /**
     * <p>
     * A list of aliases. An alias allows you to specify what name to use in the SQL for a given input. For example, you
     * have a datasource named "MyDataSource". If you specify <code>From</code> as MyDataSource, and <code>Alias</code>
     * as SqlName, then in your SQL you can do:
     * </p>
     * <p>
     * <code>select * from SqlName</code>
     * </p>
     * <p>
     * and that gets data from MyDataSource.
     * </p>
     */
    private java.util.List<SqlAlias> sqlAliases;
    /**
     * <p>
     * Specifies the data schema for the SparkSQL transform.
     * </p>
     */
    private java.util.List<GlueSchema> outputSchemas;

    /**
     * <p>
     * The name of the transform node.
     * </p>
     * 
     * @param name
     *        The name of the transform node.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the transform node.
     * </p>
     * 
     * @return The name of the transform node.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the transform node.
     * </p>
     * 
     * @param name
     *        The name of the transform node.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SparkSQL withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The data inputs identified by their node names. You can associate a table name with each input node to use in the
     * SQL query. The name you choose must meet the Spark SQL naming restrictions.
     * </p>
     * 
     * @return The data inputs identified by their node names. You can associate a table name with each input node to
     *         use in the SQL query. The name you choose must meet the Spark SQL naming restrictions.
     */

    public java.util.List<String> getInputs() {
        return inputs;
    }

    /**
     * <p>
     * The data inputs identified by their node names. You can associate a table name with each input node to use in the
     * SQL query. The name you choose must meet the Spark SQL naming restrictions.
     * </p>
     * 
     * @param inputs
     *        The data inputs identified by their node names. You can associate a table name with each input node to use
     *        in the SQL query. The name you choose must meet the Spark SQL naming restrictions.
     */

    public void setInputs(java.util.Collection<String> inputs) {
        if (inputs == null) {
            this.inputs = null;
            return;
        }

        this.inputs = new java.util.ArrayList<String>(inputs);
    }

    /**
     * <p>
     * The data inputs identified by their node names. You can associate a table name with each input node to use in the
     * SQL query. The name you choose must meet the Spark SQL naming restrictions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInputs(java.util.Collection)} or {@link #withInputs(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param inputs
     *        The data inputs identified by their node names. You can associate a table name with each input node to use
     *        in the SQL query. The name you choose must meet the Spark SQL naming restrictions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SparkSQL withInputs(String... inputs) {
        if (this.inputs == null) {
            setInputs(new java.util.ArrayList<String>(inputs.length));
        }
        for (String ele : inputs) {
            this.inputs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The data inputs identified by their node names. You can associate a table name with each input node to use in the
     * SQL query. The name you choose must meet the Spark SQL naming restrictions.
     * </p>
     * 
     * @param inputs
     *        The data inputs identified by their node names. You can associate a table name with each input node to use
     *        in the SQL query. The name you choose must meet the Spark SQL naming restrictions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SparkSQL withInputs(java.util.Collection<String> inputs) {
        setInputs(inputs);
        return this;
    }

    /**
     * <p>
     * A SQL query that must use Spark SQL syntax and return a single data set.
     * </p>
     * 
     * @param sqlQuery
     *        A SQL query that must use Spark SQL syntax and return a single data set.
     */

    public void setSqlQuery(String sqlQuery) {
        this.sqlQuery = sqlQuery;
    }

    /**
     * <p>
     * A SQL query that must use Spark SQL syntax and return a single data set.
     * </p>
     * 
     * @return A SQL query that must use Spark SQL syntax and return a single data set.
     */

    public String getSqlQuery() {
        return this.sqlQuery;
    }

    /**
     * <p>
     * A SQL query that must use Spark SQL syntax and return a single data set.
     * </p>
     * 
     * @param sqlQuery
     *        A SQL query that must use Spark SQL syntax and return a single data set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SparkSQL withSqlQuery(String sqlQuery) {
        setSqlQuery(sqlQuery);
        return this;
    }

    /**
     * <p>
     * A list of aliases. An alias allows you to specify what name to use in the SQL for a given input. For example, you
     * have a datasource named "MyDataSource". If you specify <code>From</code> as MyDataSource, and <code>Alias</code>
     * as SqlName, then in your SQL you can do:
     * </p>
     * <p>
     * <code>select * from SqlName</code>
     * </p>
     * <p>
     * and that gets data from MyDataSource.
     * </p>
     * 
     * @return A list of aliases. An alias allows you to specify what name to use in the SQL for a given input. For
     *         example, you have a datasource named "MyDataSource". If you specify <code>From</code> as MyDataSource,
     *         and <code>Alias</code> as SqlName, then in your SQL you can do:</p>
     *         <p>
     *         <code>select * from SqlName</code>
     *         </p>
     *         <p>
     *         and that gets data from MyDataSource.
     */

    public java.util.List<SqlAlias> getSqlAliases() {
        return sqlAliases;
    }

    /**
     * <p>
     * A list of aliases. An alias allows you to specify what name to use in the SQL for a given input. For example, you
     * have a datasource named "MyDataSource". If you specify <code>From</code> as MyDataSource, and <code>Alias</code>
     * as SqlName, then in your SQL you can do:
     * </p>
     * <p>
     * <code>select * from SqlName</code>
     * </p>
     * <p>
     * and that gets data from MyDataSource.
     * </p>
     * 
     * @param sqlAliases
     *        A list of aliases. An alias allows you to specify what name to use in the SQL for a given input. For
     *        example, you have a datasource named "MyDataSource". If you specify <code>From</code> as MyDataSource, and
     *        <code>Alias</code> as SqlName, then in your SQL you can do:</p>
     *        <p>
     *        <code>select * from SqlName</code>
     *        </p>
     *        <p>
     *        and that gets data from MyDataSource.
     */

    public void setSqlAliases(java.util.Collection<SqlAlias> sqlAliases) {
        if (sqlAliases == null) {
            this.sqlAliases = null;
            return;
        }

        this.sqlAliases = new java.util.ArrayList<SqlAlias>(sqlAliases);
    }

    /**
     * <p>
     * A list of aliases. An alias allows you to specify what name to use in the SQL for a given input. For example, you
     * have a datasource named "MyDataSource". If you specify <code>From</code> as MyDataSource, and <code>Alias</code>
     * as SqlName, then in your SQL you can do:
     * </p>
     * <p>
     * <code>select * from SqlName</code>
     * </p>
     * <p>
     * and that gets data from MyDataSource.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSqlAliases(java.util.Collection)} or {@link #withSqlAliases(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param sqlAliases
     *        A list of aliases. An alias allows you to specify what name to use in the SQL for a given input. For
     *        example, you have a datasource named "MyDataSource". If you specify <code>From</code> as MyDataSource, and
     *        <code>Alias</code> as SqlName, then in your SQL you can do:</p>
     *        <p>
     *        <code>select * from SqlName</code>
     *        </p>
     *        <p>
     *        and that gets data from MyDataSource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SparkSQL withSqlAliases(SqlAlias... sqlAliases) {
        if (this.sqlAliases == null) {
            setSqlAliases(new java.util.ArrayList<SqlAlias>(sqlAliases.length));
        }
        for (SqlAlias ele : sqlAliases) {
            this.sqlAliases.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of aliases. An alias allows you to specify what name to use in the SQL for a given input. For example, you
     * have a datasource named "MyDataSource". If you specify <code>From</code> as MyDataSource, and <code>Alias</code>
     * as SqlName, then in your SQL you can do:
     * </p>
     * <p>
     * <code>select * from SqlName</code>
     * </p>
     * <p>
     * and that gets data from MyDataSource.
     * </p>
     * 
     * @param sqlAliases
     *        A list of aliases. An alias allows you to specify what name to use in the SQL for a given input. For
     *        example, you have a datasource named "MyDataSource". If you specify <code>From</code> as MyDataSource, and
     *        <code>Alias</code> as SqlName, then in your SQL you can do:</p>
     *        <p>
     *        <code>select * from SqlName</code>
     *        </p>
     *        <p>
     *        and that gets data from MyDataSource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SparkSQL withSqlAliases(java.util.Collection<SqlAlias> sqlAliases) {
        setSqlAliases(sqlAliases);
        return this;
    }

    /**
     * <p>
     * Specifies the data schema for the SparkSQL transform.
     * </p>
     * 
     * @return Specifies the data schema for the SparkSQL transform.
     */

    public java.util.List<GlueSchema> getOutputSchemas() {
        return outputSchemas;
    }

    /**
     * <p>
     * Specifies the data schema for the SparkSQL transform.
     * </p>
     * 
     * @param outputSchemas
     *        Specifies the data schema for the SparkSQL transform.
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
     * Specifies the data schema for the SparkSQL transform.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOutputSchemas(java.util.Collection)} or {@link #withOutputSchemas(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param outputSchemas
     *        Specifies the data schema for the SparkSQL transform.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SparkSQL withOutputSchemas(GlueSchema... outputSchemas) {
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
     * Specifies the data schema for the SparkSQL transform.
     * </p>
     * 
     * @param outputSchemas
     *        Specifies the data schema for the SparkSQL transform.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SparkSQL withOutputSchemas(java.util.Collection<GlueSchema> outputSchemas) {
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
        if (getInputs() != null)
            sb.append("Inputs: ").append(getInputs()).append(",");
        if (getSqlQuery() != null)
            sb.append("SqlQuery: ").append(getSqlQuery()).append(",");
        if (getSqlAliases() != null)
            sb.append("SqlAliases: ").append(getSqlAliases()).append(",");
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

        if (obj instanceof SparkSQL == false)
            return false;
        SparkSQL other = (SparkSQL) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getInputs() == null ^ this.getInputs() == null)
            return false;
        if (other.getInputs() != null && other.getInputs().equals(this.getInputs()) == false)
            return false;
        if (other.getSqlQuery() == null ^ this.getSqlQuery() == null)
            return false;
        if (other.getSqlQuery() != null && other.getSqlQuery().equals(this.getSqlQuery()) == false)
            return false;
        if (other.getSqlAliases() == null ^ this.getSqlAliases() == null)
            return false;
        if (other.getSqlAliases() != null && other.getSqlAliases().equals(this.getSqlAliases()) == false)
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
        hashCode = prime * hashCode + ((getInputs() == null) ? 0 : getInputs().hashCode());
        hashCode = prime * hashCode + ((getSqlQuery() == null) ? 0 : getSqlQuery().hashCode());
        hashCode = prime * hashCode + ((getSqlAliases() == null) ? 0 : getSqlAliases().hashCode());
        hashCode = prime * hashCode + ((getOutputSchemas() == null) ? 0 : getOutputSchemas().hashCode());
        return hashCode;
    }

    @Override
    public SparkSQL clone() {
        try {
            return (SparkSQL) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.SparkSQLMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
