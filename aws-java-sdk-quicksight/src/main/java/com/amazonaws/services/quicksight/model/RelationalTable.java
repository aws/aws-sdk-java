/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * A physical table type for relational data sources.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/RelationalTable" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RelationalTable implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the data source.
     * </p>
     */
    private String dataSourceArn;
    /**
     * <p>
     * The schema name. This name applies to certain relational database engines.
     * </p>
     */
    private String schema;
    /**
     * <p>
     * The name of the relational table.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The column schema of the table.
     * </p>
     */
    private java.util.List<InputColumn> inputColumns;

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the data source.
     * </p>
     * 
     * @param dataSourceArn
     *        The Amazon Resource Name (ARN) for the data source.
     */

    public void setDataSourceArn(String dataSourceArn) {
        this.dataSourceArn = dataSourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the data source.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the data source.
     */

    public String getDataSourceArn() {
        return this.dataSourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the data source.
     * </p>
     * 
     * @param dataSourceArn
     *        The Amazon Resource Name (ARN) for the data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RelationalTable withDataSourceArn(String dataSourceArn) {
        setDataSourceArn(dataSourceArn);
        return this;
    }

    /**
     * <p>
     * The schema name. This name applies to certain relational database engines.
     * </p>
     * 
     * @param schema
     *        The schema name. This name applies to certain relational database engines.
     */

    public void setSchema(String schema) {
        this.schema = schema;
    }

    /**
     * <p>
     * The schema name. This name applies to certain relational database engines.
     * </p>
     * 
     * @return The schema name. This name applies to certain relational database engines.
     */

    public String getSchema() {
        return this.schema;
    }

    /**
     * <p>
     * The schema name. This name applies to certain relational database engines.
     * </p>
     * 
     * @param schema
     *        The schema name. This name applies to certain relational database engines.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RelationalTable withSchema(String schema) {
        setSchema(schema);
        return this;
    }

    /**
     * <p>
     * The name of the relational table.
     * </p>
     * 
     * @param name
     *        The name of the relational table.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the relational table.
     * </p>
     * 
     * @return The name of the relational table.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the relational table.
     * </p>
     * 
     * @param name
     *        The name of the relational table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RelationalTable withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The column schema of the table.
     * </p>
     * 
     * @return The column schema of the table.
     */

    public java.util.List<InputColumn> getInputColumns() {
        return inputColumns;
    }

    /**
     * <p>
     * The column schema of the table.
     * </p>
     * 
     * @param inputColumns
     *        The column schema of the table.
     */

    public void setInputColumns(java.util.Collection<InputColumn> inputColumns) {
        if (inputColumns == null) {
            this.inputColumns = null;
            return;
        }

        this.inputColumns = new java.util.ArrayList<InputColumn>(inputColumns);
    }

    /**
     * <p>
     * The column schema of the table.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInputColumns(java.util.Collection)} or {@link #withInputColumns(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param inputColumns
     *        The column schema of the table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RelationalTable withInputColumns(InputColumn... inputColumns) {
        if (this.inputColumns == null) {
            setInputColumns(new java.util.ArrayList<InputColumn>(inputColumns.length));
        }
        for (InputColumn ele : inputColumns) {
            this.inputColumns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The column schema of the table.
     * </p>
     * 
     * @param inputColumns
     *        The column schema of the table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RelationalTable withInputColumns(java.util.Collection<InputColumn> inputColumns) {
        setInputColumns(inputColumns);
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
        if (getDataSourceArn() != null)
            sb.append("DataSourceArn: ").append(getDataSourceArn()).append(",");
        if (getSchema() != null)
            sb.append("Schema: ").append(getSchema()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getInputColumns() != null)
            sb.append("InputColumns: ").append(getInputColumns());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RelationalTable == false)
            return false;
        RelationalTable other = (RelationalTable) obj;
        if (other.getDataSourceArn() == null ^ this.getDataSourceArn() == null)
            return false;
        if (other.getDataSourceArn() != null && other.getDataSourceArn().equals(this.getDataSourceArn()) == false)
            return false;
        if (other.getSchema() == null ^ this.getSchema() == null)
            return false;
        if (other.getSchema() != null && other.getSchema().equals(this.getSchema()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getInputColumns() == null ^ this.getInputColumns() == null)
            return false;
        if (other.getInputColumns() != null && other.getInputColumns().equals(this.getInputColumns()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDataSourceArn() == null) ? 0 : getDataSourceArn().hashCode());
        hashCode = prime * hashCode + ((getSchema() == null) ? 0 : getSchema().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getInputColumns() == null) ? 0 : getInputColumns().hashCode());
        return hashCode;
    }

    @Override
    public RelationalTable clone() {
        try {
            return (RelationalTable) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.RelationalTableMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
