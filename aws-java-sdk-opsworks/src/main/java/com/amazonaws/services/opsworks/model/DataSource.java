/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.opsworks.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes an app's data source.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/DataSource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataSource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The data source's type, <code>AutoSelectOpsworksMysqlInstance</code>, <code>OpsworksMysqlInstance</code>,
     * <code>RdsDbInstance</code>, or <code>None</code>.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The data source's ARN.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The database name.
     * </p>
     */
    private String databaseName;

    /**
     * <p>
     * The data source's type, <code>AutoSelectOpsworksMysqlInstance</code>, <code>OpsworksMysqlInstance</code>,
     * <code>RdsDbInstance</code>, or <code>None</code>.
     * </p>
     * 
     * @param type
     *        The data source's type, <code>AutoSelectOpsworksMysqlInstance</code>, <code>OpsworksMysqlInstance</code>,
     *        <code>RdsDbInstance</code>, or <code>None</code>.
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The data source's type, <code>AutoSelectOpsworksMysqlInstance</code>, <code>OpsworksMysqlInstance</code>,
     * <code>RdsDbInstance</code>, or <code>None</code>.
     * </p>
     * 
     * @return The data source's type, <code>AutoSelectOpsworksMysqlInstance</code>, <code>OpsworksMysqlInstance</code>,
     *         <code>RdsDbInstance</code>, or <code>None</code>.
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The data source's type, <code>AutoSelectOpsworksMysqlInstance</code>, <code>OpsworksMysqlInstance</code>,
     * <code>RdsDbInstance</code>, or <code>None</code>.
     * </p>
     * 
     * @param type
     *        The data source's type, <code>AutoSelectOpsworksMysqlInstance</code>, <code>OpsworksMysqlInstance</code>,
     *        <code>RdsDbInstance</code>, or <code>None</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSource withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The data source's ARN.
     * </p>
     * 
     * @param arn
     *        The data source's ARN.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The data source's ARN.
     * </p>
     * 
     * @return The data source's ARN.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The data source's ARN.
     * </p>
     * 
     * @param arn
     *        The data source's ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSource withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The database name.
     * </p>
     * 
     * @param databaseName
     *        The database name.
     */

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    /**
     * <p>
     * The database name.
     * </p>
     * 
     * @return The database name.
     */

    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * <p>
     * The database name.
     * </p>
     * 
     * @param databaseName
     *        The database name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSource withDatabaseName(String databaseName) {
        setDatabaseName(databaseName);
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getDatabaseName() != null)
            sb.append("DatabaseName: ").append(getDatabaseName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataSource == false)
            return false;
        DataSource other = (DataSource) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getDatabaseName() == null ^ this.getDatabaseName() == null)
            return false;
        if (other.getDatabaseName() != null && other.getDatabaseName().equals(this.getDatabaseName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getDatabaseName() == null) ? 0 : getDatabaseName().hashCode());
        return hashCode;
    }

    @Override
    public DataSource clone() {
        try {
            return (DataSource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.opsworks.model.transform.DataSourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
