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
package com.amazonaws.services.ssmsap.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The connection specifications for the database.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-sap-2018-05-10/DatabaseConnection" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DatabaseConnection implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The method of connection.
     * </p>
     */
    private String databaseConnectionMethod;
    /**
     * <p>
     * The Amazon Resource Name of the connected SAP HANA database.
     * </p>
     */
    private String databaseArn;
    /**
     * <p>
     * The IP address for connection.
     * </p>
     */
    private String connectionIp;

    /**
     * <p>
     * The method of connection.
     * </p>
     * 
     * @param databaseConnectionMethod
     *        The method of connection.
     * @see DatabaseConnectionMethod
     */

    public void setDatabaseConnectionMethod(String databaseConnectionMethod) {
        this.databaseConnectionMethod = databaseConnectionMethod;
    }

    /**
     * <p>
     * The method of connection.
     * </p>
     * 
     * @return The method of connection.
     * @see DatabaseConnectionMethod
     */

    public String getDatabaseConnectionMethod() {
        return this.databaseConnectionMethod;
    }

    /**
     * <p>
     * The method of connection.
     * </p>
     * 
     * @param databaseConnectionMethod
     *        The method of connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DatabaseConnectionMethod
     */

    public DatabaseConnection withDatabaseConnectionMethod(String databaseConnectionMethod) {
        setDatabaseConnectionMethod(databaseConnectionMethod);
        return this;
    }

    /**
     * <p>
     * The method of connection.
     * </p>
     * 
     * @param databaseConnectionMethod
     *        The method of connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DatabaseConnectionMethod
     */

    public DatabaseConnection withDatabaseConnectionMethod(DatabaseConnectionMethod databaseConnectionMethod) {
        this.databaseConnectionMethod = databaseConnectionMethod.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name of the connected SAP HANA database.
     * </p>
     * 
     * @param databaseArn
     *        The Amazon Resource Name of the connected SAP HANA database.
     */

    public void setDatabaseArn(String databaseArn) {
        this.databaseArn = databaseArn;
    }

    /**
     * <p>
     * The Amazon Resource Name of the connected SAP HANA database.
     * </p>
     * 
     * @return The Amazon Resource Name of the connected SAP HANA database.
     */

    public String getDatabaseArn() {
        return this.databaseArn;
    }

    /**
     * <p>
     * The Amazon Resource Name of the connected SAP HANA database.
     * </p>
     * 
     * @param databaseArn
     *        The Amazon Resource Name of the connected SAP HANA database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatabaseConnection withDatabaseArn(String databaseArn) {
        setDatabaseArn(databaseArn);
        return this;
    }

    /**
     * <p>
     * The IP address for connection.
     * </p>
     * 
     * @param connectionIp
     *        The IP address for connection.
     */

    public void setConnectionIp(String connectionIp) {
        this.connectionIp = connectionIp;
    }

    /**
     * <p>
     * The IP address for connection.
     * </p>
     * 
     * @return The IP address for connection.
     */

    public String getConnectionIp() {
        return this.connectionIp;
    }

    /**
     * <p>
     * The IP address for connection.
     * </p>
     * 
     * @param connectionIp
     *        The IP address for connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatabaseConnection withConnectionIp(String connectionIp) {
        setConnectionIp(connectionIp);
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
        if (getDatabaseConnectionMethod() != null)
            sb.append("DatabaseConnectionMethod: ").append(getDatabaseConnectionMethod()).append(",");
        if (getDatabaseArn() != null)
            sb.append("DatabaseArn: ").append(getDatabaseArn()).append(",");
        if (getConnectionIp() != null)
            sb.append("ConnectionIp: ").append(getConnectionIp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DatabaseConnection == false)
            return false;
        DatabaseConnection other = (DatabaseConnection) obj;
        if (other.getDatabaseConnectionMethod() == null ^ this.getDatabaseConnectionMethod() == null)
            return false;
        if (other.getDatabaseConnectionMethod() != null && other.getDatabaseConnectionMethod().equals(this.getDatabaseConnectionMethod()) == false)
            return false;
        if (other.getDatabaseArn() == null ^ this.getDatabaseArn() == null)
            return false;
        if (other.getDatabaseArn() != null && other.getDatabaseArn().equals(this.getDatabaseArn()) == false)
            return false;
        if (other.getConnectionIp() == null ^ this.getConnectionIp() == null)
            return false;
        if (other.getConnectionIp() != null && other.getConnectionIp().equals(this.getConnectionIp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDatabaseConnectionMethod() == null) ? 0 : getDatabaseConnectionMethod().hashCode());
        hashCode = prime * hashCode + ((getDatabaseArn() == null) ? 0 : getDatabaseArn().hashCode());
        hashCode = prime * hashCode + ((getConnectionIp() == null) ? 0 : getConnectionIp().hashCode());
        return hashCode;
    }

    @Override
    public DatabaseConnection clone() {
        try {
            return (DatabaseConnection) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ssmsap.model.transform.DatabaseConnectionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
