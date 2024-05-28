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
package com.amazonaws.services.dataexchange.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Extra details specific to the affected scope in this Redshift data set.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dataexchange-2017-07-25/RedshiftDataShareDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RedshiftDataShareDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the underlying Redshift data share that is being affected by this notification.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The database name in the Redshift data share that is being affected by this notification.
     * </p>
     */
    private String database;
    /**
     * <p>
     * A function name in the Redshift database that is being affected by this notification.
     * </p>
     */
    private String function;
    /**
     * <p>
     * A table name in the Redshift database that is being affected by this notification.
     * </p>
     */
    private String table;
    /**
     * <p>
     * A schema name in the Redshift database that is being affected by this notification.
     * </p>
     */
    private String schema;
    /**
     * <p>
     * A view name in the Redshift database that is being affected by this notification.
     * </p>
     */
    private String view;

    /**
     * <p>
     * The ARN of the underlying Redshift data share that is being affected by this notification.
     * </p>
     * 
     * @param arn
     *        The ARN of the underlying Redshift data share that is being affected by this notification.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN of the underlying Redshift data share that is being affected by this notification.
     * </p>
     * 
     * @return The ARN of the underlying Redshift data share that is being affected by this notification.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN of the underlying Redshift data share that is being affected by this notification.
     * </p>
     * 
     * @param arn
     *        The ARN of the underlying Redshift data share that is being affected by this notification.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RedshiftDataShareDetails withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The database name in the Redshift data share that is being affected by this notification.
     * </p>
     * 
     * @param database
     *        The database name in the Redshift data share that is being affected by this notification.
     */

    public void setDatabase(String database) {
        this.database = database;
    }

    /**
     * <p>
     * The database name in the Redshift data share that is being affected by this notification.
     * </p>
     * 
     * @return The database name in the Redshift data share that is being affected by this notification.
     */

    public String getDatabase() {
        return this.database;
    }

    /**
     * <p>
     * The database name in the Redshift data share that is being affected by this notification.
     * </p>
     * 
     * @param database
     *        The database name in the Redshift data share that is being affected by this notification.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RedshiftDataShareDetails withDatabase(String database) {
        setDatabase(database);
        return this;
    }

    /**
     * <p>
     * A function name in the Redshift database that is being affected by this notification.
     * </p>
     * 
     * @param function
     *        A function name in the Redshift database that is being affected by this notification.
     */

    public void setFunction(String function) {
        this.function = function;
    }

    /**
     * <p>
     * A function name in the Redshift database that is being affected by this notification.
     * </p>
     * 
     * @return A function name in the Redshift database that is being affected by this notification.
     */

    public String getFunction() {
        return this.function;
    }

    /**
     * <p>
     * A function name in the Redshift database that is being affected by this notification.
     * </p>
     * 
     * @param function
     *        A function name in the Redshift database that is being affected by this notification.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RedshiftDataShareDetails withFunction(String function) {
        setFunction(function);
        return this;
    }

    /**
     * <p>
     * A table name in the Redshift database that is being affected by this notification.
     * </p>
     * 
     * @param table
     *        A table name in the Redshift database that is being affected by this notification.
     */

    public void setTable(String table) {
        this.table = table;
    }

    /**
     * <p>
     * A table name in the Redshift database that is being affected by this notification.
     * </p>
     * 
     * @return A table name in the Redshift database that is being affected by this notification.
     */

    public String getTable() {
        return this.table;
    }

    /**
     * <p>
     * A table name in the Redshift database that is being affected by this notification.
     * </p>
     * 
     * @param table
     *        A table name in the Redshift database that is being affected by this notification.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RedshiftDataShareDetails withTable(String table) {
        setTable(table);
        return this;
    }

    /**
     * <p>
     * A schema name in the Redshift database that is being affected by this notification.
     * </p>
     * 
     * @param schema
     *        A schema name in the Redshift database that is being affected by this notification.
     */

    public void setSchema(String schema) {
        this.schema = schema;
    }

    /**
     * <p>
     * A schema name in the Redshift database that is being affected by this notification.
     * </p>
     * 
     * @return A schema name in the Redshift database that is being affected by this notification.
     */

    public String getSchema() {
        return this.schema;
    }

    /**
     * <p>
     * A schema name in the Redshift database that is being affected by this notification.
     * </p>
     * 
     * @param schema
     *        A schema name in the Redshift database that is being affected by this notification.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RedshiftDataShareDetails withSchema(String schema) {
        setSchema(schema);
        return this;
    }

    /**
     * <p>
     * A view name in the Redshift database that is being affected by this notification.
     * </p>
     * 
     * @param view
     *        A view name in the Redshift database that is being affected by this notification.
     */

    public void setView(String view) {
        this.view = view;
    }

    /**
     * <p>
     * A view name in the Redshift database that is being affected by this notification.
     * </p>
     * 
     * @return A view name in the Redshift database that is being affected by this notification.
     */

    public String getView() {
        return this.view;
    }

    /**
     * <p>
     * A view name in the Redshift database that is being affected by this notification.
     * </p>
     * 
     * @param view
     *        A view name in the Redshift database that is being affected by this notification.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RedshiftDataShareDetails withView(String view) {
        setView(view);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getDatabase() != null)
            sb.append("Database: ").append(getDatabase()).append(",");
        if (getFunction() != null)
            sb.append("Function: ").append(getFunction()).append(",");
        if (getTable() != null)
            sb.append("Table: ").append(getTable()).append(",");
        if (getSchema() != null)
            sb.append("Schema: ").append(getSchema()).append(",");
        if (getView() != null)
            sb.append("View: ").append(getView());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RedshiftDataShareDetails == false)
            return false;
        RedshiftDataShareDetails other = (RedshiftDataShareDetails) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getDatabase() == null ^ this.getDatabase() == null)
            return false;
        if (other.getDatabase() != null && other.getDatabase().equals(this.getDatabase()) == false)
            return false;
        if (other.getFunction() == null ^ this.getFunction() == null)
            return false;
        if (other.getFunction() != null && other.getFunction().equals(this.getFunction()) == false)
            return false;
        if (other.getTable() == null ^ this.getTable() == null)
            return false;
        if (other.getTable() != null && other.getTable().equals(this.getTable()) == false)
            return false;
        if (other.getSchema() == null ^ this.getSchema() == null)
            return false;
        if (other.getSchema() != null && other.getSchema().equals(this.getSchema()) == false)
            return false;
        if (other.getView() == null ^ this.getView() == null)
            return false;
        if (other.getView() != null && other.getView().equals(this.getView()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getDatabase() == null) ? 0 : getDatabase().hashCode());
        hashCode = prime * hashCode + ((getFunction() == null) ? 0 : getFunction().hashCode());
        hashCode = prime * hashCode + ((getTable() == null) ? 0 : getTable().hashCode());
        hashCode = prime * hashCode + ((getSchema() == null) ? 0 : getSchema().hashCode());
        hashCode = prime * hashCode + ((getView() == null) ? 0 : getView().hashCode());
        return hashCode;
    }

    @Override
    public RedshiftDataShareDetails clone() {
        try {
            return (RedshiftDataShareDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.dataexchange.model.transform.RedshiftDataShareDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
