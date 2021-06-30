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
package com.amazonaws.services.gluedatabrew.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Connection information for dataset input files stored in a database.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/DatabaseInputDefinition" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DatabaseInputDefinition implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Glue Connection that stores the connection information for the target database.
     * </p>
     */
    private String glueConnectionName;
    /**
     * <p>
     * The table within the target database.
     * </p>
     */
    private String databaseTableName;

    private S3Location tempDirectory;

    /**
     * <p>
     * The Glue Connection that stores the connection information for the target database.
     * </p>
     * 
     * @param glueConnectionName
     *        The Glue Connection that stores the connection information for the target database.
     */

    public void setGlueConnectionName(String glueConnectionName) {
        this.glueConnectionName = glueConnectionName;
    }

    /**
     * <p>
     * The Glue Connection that stores the connection information for the target database.
     * </p>
     * 
     * @return The Glue Connection that stores the connection information for the target database.
     */

    public String getGlueConnectionName() {
        return this.glueConnectionName;
    }

    /**
     * <p>
     * The Glue Connection that stores the connection information for the target database.
     * </p>
     * 
     * @param glueConnectionName
     *        The Glue Connection that stores the connection information for the target database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatabaseInputDefinition withGlueConnectionName(String glueConnectionName) {
        setGlueConnectionName(glueConnectionName);
        return this;
    }

    /**
     * <p>
     * The table within the target database.
     * </p>
     * 
     * @param databaseTableName
     *        The table within the target database.
     */

    public void setDatabaseTableName(String databaseTableName) {
        this.databaseTableName = databaseTableName;
    }

    /**
     * <p>
     * The table within the target database.
     * </p>
     * 
     * @return The table within the target database.
     */

    public String getDatabaseTableName() {
        return this.databaseTableName;
    }

    /**
     * <p>
     * The table within the target database.
     * </p>
     * 
     * @param databaseTableName
     *        The table within the target database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatabaseInputDefinition withDatabaseTableName(String databaseTableName) {
        setDatabaseTableName(databaseTableName);
        return this;
    }

    /**
     * @param tempDirectory
     */

    public void setTempDirectory(S3Location tempDirectory) {
        this.tempDirectory = tempDirectory;
    }

    /**
     * @return
     */

    public S3Location getTempDirectory() {
        return this.tempDirectory;
    }

    /**
     * @param tempDirectory
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatabaseInputDefinition withTempDirectory(S3Location tempDirectory) {
        setTempDirectory(tempDirectory);
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
        if (getGlueConnectionName() != null)
            sb.append("GlueConnectionName: ").append(getGlueConnectionName()).append(",");
        if (getDatabaseTableName() != null)
            sb.append("DatabaseTableName: ").append(getDatabaseTableName()).append(",");
        if (getTempDirectory() != null)
            sb.append("TempDirectory: ").append(getTempDirectory());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DatabaseInputDefinition == false)
            return false;
        DatabaseInputDefinition other = (DatabaseInputDefinition) obj;
        if (other.getGlueConnectionName() == null ^ this.getGlueConnectionName() == null)
            return false;
        if (other.getGlueConnectionName() != null && other.getGlueConnectionName().equals(this.getGlueConnectionName()) == false)
            return false;
        if (other.getDatabaseTableName() == null ^ this.getDatabaseTableName() == null)
            return false;
        if (other.getDatabaseTableName() != null && other.getDatabaseTableName().equals(this.getDatabaseTableName()) == false)
            return false;
        if (other.getTempDirectory() == null ^ this.getTempDirectory() == null)
            return false;
        if (other.getTempDirectory() != null && other.getTempDirectory().equals(this.getTempDirectory()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGlueConnectionName() == null) ? 0 : getGlueConnectionName().hashCode());
        hashCode = prime * hashCode + ((getDatabaseTableName() == null) ? 0 : getDatabaseTableName().hashCode());
        hashCode = prime * hashCode + ((getTempDirectory() == null) ? 0 : getTempDirectory().hashCode());
        return hashCode;
    }

    @Override
    public DatabaseInputDefinition clone() {
        try {
            return (DatabaseInputDefinition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.gluedatabrew.model.transform.DatabaseInputDefinitionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
